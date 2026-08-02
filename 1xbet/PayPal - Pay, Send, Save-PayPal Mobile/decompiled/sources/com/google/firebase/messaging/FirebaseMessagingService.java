package com.google.firebase.messaging;

/* loaded from: classes4.dex */
public class FirebaseMessagingService extends com.google.firebase.messaging.EnhancedIntentService {
    public static final java.lang.String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final java.lang.String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final java.lang.String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final java.lang.String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final java.util.Queue<java.lang.String> recentlyReceivedMessageIds = new java.util.ArrayDeque(10);
    private com.google.android.gms.cloudmessaging.Rpc rpc;

    public void onDeletedMessages() {
    }

    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }

    @java.lang.Deprecated
    public void onMessageSent(java.lang.String str) {
    }

    public void onNewToken(java.lang.String str) {
    }

    @java.lang.Deprecated
    public void onSendError(java.lang.String str, java.lang.Exception exc) {
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    protected android.content.Intent getStartCommandIntent(android.content.Intent intent) {
        return com.google.firebase.messaging.ServiceStarter.getInstance().getMessagingEvent();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            intent.getAction();
        }
    }

    private void handleMessageIntent(android.content.Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID))) {
            passMessageIntentToSdk(intent);
        }
        getRpc(this).messageHandled(new com.google.android.gms.cloudmessaging.CloudMessage(intent));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void passMessageIntentToSdk(android.content.Intent intent) {
        char c;
        java.lang.String stringExtra = intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = com.google.firebase.messaging.Constants.MessageTypes.MESSAGE;
        }
        stringExtra.hashCode();
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(com.google.firebase.messaging.Constants.MessageTypes.DELETED)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 102161:
                if (stringExtra.equals(com.google.firebase.messaging.Constants.MessageTypes.MESSAGE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 814694033:
                if (stringExtra.equals(com.google.firebase.messaging.Constants.MessageTypes.SEND_ERROR)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 814800675:
                if (stringExtra.equals(com.google.firebase.messaging.Constants.MessageTypes.SEND_EVENT)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            onDeletedMessages();
            return;
        }
        if (c == 1) {
            com.google.firebase.messaging.MessagingAnalytics.logNotificationReceived(intent);
            dispatchMessage(intent);
        } else if (c == 2) {
            onSendError(getMessageId(intent), new com.google.firebase.messaging.SendException(intent.getStringExtra("error")));
        } else {
            if (c != 3) {
                return;
            }
            onMessageSent(intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID));
        }
    }

    private void dispatchMessage(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new android.os.Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (com.google.firebase.messaging.NotificationParams.isNotification(extras)) {
            com.google.firebase.messaging.NotificationParams notificationParams = new com.google.firebase.messaging.NotificationParams(extras);
            java.util.concurrent.ExecutorService newNetworkIOExecutor = com.google.firebase.messaging.FcmExecutors.newNetworkIOExecutor();
            try {
                if (new com.google.firebase.messaging.DisplayNotification(this, notificationParams, newNetworkIOExecutor).handleNotification()) {
                    return;
                }
                newNetworkIOExecutor.shutdown();
                if (com.google.firebase.messaging.MessagingAnalytics.shouldUploadScionMetrics(intent)) {
                    com.google.firebase.messaging.MessagingAnalytics.logNotificationForeground(intent);
                }
            } finally {
                newNetworkIOExecutor.shutdown();
            }
        }
        onMessageReceived(new com.google.firebase.messaging.RemoteMessage(extras));
    }

    private boolean alreadyReceivedMessage(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.Queue<java.lang.String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private java.lang.String getMessageId(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID);
        return stringExtra == null ? intent.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER) : stringExtra;
    }

    private com.google.android.gms.cloudmessaging.Rpc getRpc(android.content.Context context) {
        if (this.rpc == null) {
            this.rpc = new com.google.android.gms.cloudmessaging.Rpc(context.getApplicationContext());
        }
        return this.rpc;
    }

    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    void setRpcForTesting(com.google.android.gms.cloudmessaging.Rpc rpc) {
        this.rpc = rpc;
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
