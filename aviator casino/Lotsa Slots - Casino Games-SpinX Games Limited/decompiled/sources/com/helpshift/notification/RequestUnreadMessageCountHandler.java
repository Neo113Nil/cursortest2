package com.helpshift.notification;

/* loaded from: classes2.dex */
public class RequestUnreadMessageCountHandler {
    private static final java.lang.String TAG = "rqUnrdCntHdlr";
    private final com.helpshift.chat.HSEventProxy eventProxy;
    private final com.helpshift.poller.FetchNotificationUpdate fetchNotificationUpdate;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private final com.helpshift.concurrency.HSThreadingService threadingService;
    private final com.helpshift.user.UserManager userManager;
    private final int MAX_FALLBACK_INTERVAL = 21600000;
    private final int MIN_ACTIVE_FALLBACK_INTERVAL = 60000;
    private final int MIN_PASSIVE_FALLBACK_INTERVAL = com.helpshift.util.Utils.FALLBACK_PASSIVE_REMOTE_FETCH_INTERVAL;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> userCallsInProgress = new java.util.concurrent.ConcurrentHashMap<>();

    public RequestUnreadMessageCountHandler(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.poller.FetchNotificationUpdate fetchNotificationUpdate, com.helpshift.user.UserManager userManager, com.helpshift.chat.HSEventProxy hSEventProxy, com.helpshift.concurrency.HSThreadingService hSThreadingService) {
        this.persistentStorage = hSPersistentStorage;
        this.fetchNotificationUpdate = fetchNotificationUpdate;
        this.userManager = userManager;
        this.eventProxy = hSEventProxy;
        this.threadingService = hSThreadingService;
    }

    public void handleLocalCacheRequest() {
        com.helpshift.log.HSLogger.d(TAG, "Serving count from local cache.");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, java.lang.Integer.valueOf(java.lang.Math.max(this.userManager.getUnreadNotificationCount(), this.userManager.getPushUnreadNotificationCount())));
        hashMap.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT_FROM_CACHE, true);
        this.eventProxy.sendEvent(com.helpshift.HelpshiftEvent.RECEIVED_UNREAD_MESSAGE_COUNT, hashMap);
    }

    public synchronized void handleRemoteRequest(final java.lang.String str) {
        int passiveRemoteFetchInterval;
        if (this.userCallsInProgress.containsKey(str) && this.userCallsInProgress.get(str).get()) {
            com.helpshift.log.HSLogger.d(TAG, "Call already in progress for user " + com.helpshift.util.Utils.getMaskedString(str));
            return;
        }
        if (!this.userManager.isRequestUnreadMessageCountAllowed(str).booleanValue()) {
            com.helpshift.log.HSLogger.d(TAG, "requestUnreadMessageCount call not allowed for the user " + com.helpshift.util.Utils.getMaskedString(str));
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long lastRequestUnreadCountApiAccess = this.persistentStorage.getLastRequestUnreadCountApiAccess();
        boolean shouldPoll = this.userManager.shouldPoll();
        if (shouldPoll) {
            passiveRemoteFetchInterval = this.userManager.getActiveRemoteFetchInterval();
        } else {
            passiveRemoteFetchInterval = this.userManager.getPassiveRemoteFetchInterval();
        }
        int min = java.lang.Math.min(passiveRemoteFetchInterval, 21600000);
        if (min <= 0) {
            min = shouldPoll ? 60000 : com.helpshift.util.Utils.FALLBACK_PASSIVE_REMOTE_FETCH_INTERVAL;
        }
        if (lastRequestUnreadCountApiAccess != 0 && currentTimeMillis - lastRequestUnreadCountApiAccess < min) {
            handleLocalCacheRequest();
            return;
        }
        this.persistentStorage.setLastRequestUnreadCountApiAccess(currentTimeMillis);
        com.helpshift.log.HSLogger.d(TAG, "Fetching unread count from remote.");
        this.threadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.notification.RequestUnreadMessageCountHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.notification.RequestUnreadMessageCountHandler.this.m5682xfce2391a(str);
            }
        });
    }

    /* renamed from: lambda$handleRemoteRequest$0$com-helpshift-notification-RequestUnreadMessageCountHandler, reason: not valid java name */
    /* synthetic */ void m5682xfce2391a(java.lang.String str) {
        try {
            try {
                if (!this.userCallsInProgress.containsKey(str)) {
                    this.userCallsInProgress.put(str, new java.util.concurrent.atomic.AtomicBoolean(false));
                }
                this.userCallsInProgress.get(str).compareAndSet(false, true);
                int execute = this.fetchNotificationUpdate.execute(com.helpshift.util.Utils.ORIGIN_REQUEST_UNREAD_COUNT, str, false);
                boolean z = execute >= 200 && execute < 300;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, java.lang.Integer.valueOf(this.userManager.getUnreadNotificationCount()));
                hashMap.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT_FROM_CACHE, java.lang.Boolean.valueOf(!z));
                this.eventProxy.sendEvent(com.helpshift.HelpshiftEvent.RECEIVED_UNREAD_MESSAGE_COUNT, hashMap);
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error in fetching unread count from remote", e);
            }
        } finally {
            this.userCallsInProgress.get(str).set(false);
        }
    }
}
