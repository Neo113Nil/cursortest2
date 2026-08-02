package androidx.core.app;

/* loaded from: classes3.dex */
public final class NotificationManagerCompat {
    public static final java.lang.String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static java.lang.String Camera2StreamConfigurationMap = null;
    public static final java.lang.String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    private static androidx.core.app.NotificationManagerCompat.SideChannelManager getHighSpeedVideoFpsRangesFor;
    private final android.app.NotificationManager getHighSpeedVideoSizesFor;
    private final android.content.Context getOutputMinFrameDuration;
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private static java.util.Set<java.lang.String> getHighSpeedVideoSizes = new java.util.HashSet();
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterruptionFilter {
    }

    /* loaded from: classes7.dex */
    interface Task {
        void getHighSpeedVideoFpsRangesFor(android.support.v4.app.INotificationSideChannel iNotificationSideChannel) throws android.os.RemoteException;
    }

    public static androidx.core.app.NotificationManagerCompat from(android.content.Context context) {
        return new androidx.core.app.NotificationManagerCompat(context);
    }

    private NotificationManagerCompat(android.content.Context context) {
        this.getOutputMinFrameDuration = context;
        this.getHighSpeedVideoSizesFor = (android.app.NotificationManager) context.getSystemService("notification");
    }

    public final void cancel(int i) {
        cancel(null, i);
    }

    public final void cancel(java.lang.String str, int i) {
        this.getHighSpeedVideoSizesFor.cancel(str, i);
    }

    public final void cancelAll() {
        this.getHighSpeedVideoSizesFor.cancelAll();
    }

    public final void notify(int i, android.app.Notification notification) {
        notify(null, i, notification);
    }

    public final void notify(java.lang.String str, int i, android.app.Notification notification) {
        if (getHighResolutionOutputSizeshNQ4ISI(notification)) {
            getHighSpeedVideoFpsRangesFor(new androidx.core.app.NotificationManagerCompat.NotifyTask(this.getOutputMinFrameDuration.getPackageName(), i, str, notification));
            this.getHighSpeedVideoSizesFor.cancel(str, i);
        } else {
            this.getHighSpeedVideoSizesFor.notify(str, i, notification);
        }
    }

    public final void notify(java.util.List<androidx.core.app.NotificationManagerCompat.NotificationWithIdAndTag> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.core.app.NotificationManagerCompat.NotificationWithIdAndTag notificationWithIdAndTag = list.get(i);
            notify(notificationWithIdAndTag.getHighSpeedVideoSizes, notificationWithIdAndTag.getHighResolutionOutputSizeshNQ4ISI, notificationWithIdAndTag.getHighSpeedVideoFpsRangesFor);
        }
    }

    /* loaded from: classes7.dex */
    public static class NotificationWithIdAndTag {
        final int getHighResolutionOutputSizeshNQ4ISI;
        android.app.Notification getHighSpeedVideoFpsRangesFor;
        final java.lang.String getHighSpeedVideoSizes;

        public NotificationWithIdAndTag(java.lang.String str, int i, android.app.Notification notification) {
            this.getHighSpeedVideoSizes = str;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRangesFor = notification;
        }

        public NotificationWithIdAndTag(int i, android.app.Notification notification) {
            this(null, i, notification);
        }
    }

    public final java.util.List<android.service.notification.StatusBarNotification> getActiveNotifications() {
        return androidx.core.app.NotificationManagerCompat.Api23Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor);
    }

    public final boolean areNotificationsEnabled() {
        return androidx.core.app.NotificationManagerCompat.Api24Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor);
    }

    public final int getImportance() {
        return androidx.core.app.NotificationManagerCompat.Api24Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor);
    }

    public final void createNotificationChannel(android.app.NotificationChannel notificationChannel) {
        androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor, notificationChannel);
    }

    public final void createNotificationChannel(androidx.core.app.NotificationChannelCompat notificationChannelCompat) {
        createNotificationChannel(notificationChannelCompat.getHighSpeedVideoFpsRangesFor());
    }

    public final void createNotificationChannelGroup(android.app.NotificationChannelGroup notificationChannelGroup) {
        androidx.core.app.NotificationManagerCompat.Api26Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, notificationChannelGroup);
    }

    public final void createNotificationChannelGroup(androidx.core.app.NotificationChannelGroupCompat notificationChannelGroupCompat) {
        createNotificationChannelGroup(notificationChannelGroupCompat.getHighSpeedVideoFpsRangesFor());
    }

    public final void createNotificationChannels(java.util.List<android.app.NotificationChannel> list) {
        androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor, list);
    }

    public final void createNotificationChannelsCompat(java.util.List<androidx.core.app.NotificationChannelCompat> list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.core.app.NotificationChannelCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getHighSpeedVideoFpsRangesFor());
        }
        androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor, arrayList);
    }

    public final void createNotificationChannelGroups(java.util.List<android.app.NotificationChannelGroup> list) {
        androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, list);
    }

    public final void createNotificationChannelGroupsCompat(java.util.List<androidx.core.app.NotificationChannelGroupCompat> list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.core.app.NotificationChannelGroupCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getHighSpeedVideoFpsRangesFor());
        }
        androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, arrayList);
    }

    public final void deleteNotificationChannel(java.lang.String str) {
        androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, str);
    }

    public final void deleteNotificationChannelGroup(java.lang.String str) {
        androidx.core.app.NotificationManagerCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor, str);
    }

    public final void deleteUnlistedNotificationChannels(java.util.Collection<java.lang.String> collection) {
        for (android.app.NotificationChannel notificationChannel : androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor)) {
            if (!collection.contains(androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRanges(notificationChannel)) && (android.os.Build.VERSION.SDK_INT < 30 || !collection.contains(androidx.core.app.NotificationManagerCompat.Api30Impl.Camera2StreamConfigurationMap(notificationChannel)))) {
                androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRanges(notificationChannel));
            }
        }
    }

    public final android.app.NotificationChannel getNotificationChannel(java.lang.String str) {
        return androidx.core.app.NotificationManagerCompat.Api26Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, str);
    }

    public final androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(java.lang.String str) {
        android.app.NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new androidx.core.app.NotificationChannelCompat(notificationChannel);
        }
        return null;
    }

    public final android.app.NotificationChannel getNotificationChannel(java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.app.NotificationManagerCompat.Api30Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, str, str2);
        }
        return getNotificationChannel(str);
    }

    public final androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(java.lang.String str, java.lang.String str2) {
        android.app.NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new androidx.core.app.NotificationChannelCompat(notificationChannel);
        }
        return null;
    }

    public final android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.app.NotificationManagerCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor, str);
        }
        for (android.app.NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
            if (androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoSizes(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public final androidx.core.app.NotificationChannelGroupCompat getNotificationChannelGroupCompat(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.app.NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
            if (notificationChannelGroup != null) {
                return new androidx.core.app.NotificationChannelGroupCompat(notificationChannelGroup);
            }
            return null;
        }
        android.app.NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
        if (notificationChannelGroup2 != null) {
            return new androidx.core.app.NotificationChannelGroupCompat(notificationChannelGroup2, getNotificationChannels());
        }
        return null;
    }

    public final java.util.List<android.app.NotificationChannel> getNotificationChannels() {
        return androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor);
    }

    public final java.util.List<androidx.core.app.NotificationChannelCompat> getNotificationChannelsCompat() {
        java.util.List<android.app.NotificationChannel> notificationChannels = getNotificationChannels();
        if (!notificationChannels.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(notificationChannels.size());
            java.util.Iterator<android.app.NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                arrayList.add(new androidx.core.app.NotificationChannelCompat(it.next()));
            }
            return arrayList;
        }
        return java.util.Collections.emptyList();
    }

    public final java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups() {
        return androidx.core.app.NotificationManagerCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor);
    }

    public final java.util.List<androidx.core.app.NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        java.util.List<android.app.NotificationChannel> notificationChannels;
        java.util.List<android.app.NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (!notificationChannelGroups.isEmpty()) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                notificationChannels = java.util.Collections.emptyList();
            } else {
                notificationChannels = getNotificationChannels();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(notificationChannelGroups.size());
            for (android.app.NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    arrayList.add(new androidx.core.app.NotificationChannelGroupCompat(notificationChannelGroup));
                } else {
                    arrayList.add(new androidx.core.app.NotificationChannelGroupCompat(notificationChannelGroup, notificationChannels));
                }
            }
            return arrayList;
        }
        return java.util.Collections.emptyList();
    }

    public static java.util.Set<java.lang.String> getEnabledListenerPackages(android.content.Context context) {
        java.util.Set<java.lang.String> set;
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            if (string != null) {
                if (!string.equals(Camera2StreamConfigurationMap)) {
                    java.lang.String[] split = string.split(io.ktor.sse.ServerSentEventKt.COLON, -1);
                    java.util.HashSet hashSet = new java.util.HashSet(split.length);
                    for (java.lang.String str : split) {
                        android.content.ComponentName unflattenFromString = android.content.ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    getHighSpeedVideoSizes = hashSet;
                    Camera2StreamConfigurationMap = string;
                }
            }
            set = getHighSpeedVideoSizes;
        }
        return set;
    }

    public final boolean canUseFullScreenIntent() {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return this.getOutputMinFrameDuration.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0;
        }
        return androidx.core.app.NotificationManagerCompat.Api34Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor);
    }

    public final boolean canPostPromotedNotifications() {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return androidx.core.app.NotificationManagerCompat.Api36Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor);
        }
        return false;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.Notification notification) {
        android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public final int getCurrentInterruptionFilter() {
        return this.getHighSpeedVideoSizesFor.getCurrentInterruptionFilter();
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.core.app.NotificationManagerCompat.Task task) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = new androidx.core.app.NotificationManagerCompat.SideChannelManager(this.getOutputMinFrameDuration.getApplicationContext());
            }
            getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(task);
        }
    }

    /* loaded from: classes7.dex */
    static class SideChannelManager implements android.os.Handler.Callback, android.content.ServiceConnection {
        private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        private final android.os.HandlerThread getHighSpeedVideoFpsRanges;
        private final android.os.Handler getHighSpeedVideoFpsRangesFor;
        private final java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord> Camera2StreamConfigurationMap = new java.util.HashMap();
        private java.util.Set<java.lang.String> getHighSpeedVideoSizes = new java.util.HashSet();

        SideChannelManager(android.content.Context context) {
            this.getHighResolutionOutputSizeshNQ4ISI = context;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("NotificationManagerCompat");
            this.getHighSpeedVideoFpsRanges = handlerThread;
            handlerThread.start();
            this.getHighSpeedVideoFpsRangesFor = new android.os.Handler(handlerThread.getLooper(), this);
        }

        public void Camera2StreamConfigurationMap(androidx.core.app.NotificationManagerCompat.Task task) {
            this.getHighSpeedVideoFpsRangesFor.obtainMessage(0, task).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 0) {
                getHighSpeedVideoSizes((androidx.core.app.NotificationManagerCompat.Task) message.obj);
                return true;
            }
            if (i == 1) {
                androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent serviceConnectedEvent = (androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent) message.obj;
                getHighSpeedVideoSizes(serviceConnectedEvent.getHighSpeedVideoSizes, serviceConnectedEvent.getHighSpeedVideoFpsRanges);
                return true;
            }
            if (i == 2) {
                getHighSpeedVideoFpsRanges((android.content.ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            getHighSpeedVideoFpsRangesFor((android.content.ComponentName) message.obj);
            return true;
        }

        private void getHighSpeedVideoSizes(androidx.core.app.NotificationManagerCompat.Task task) {
            getHighSpeedVideoSizes();
            for (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord : this.Camera2StreamConfigurationMap.values()) {
                listenerRecord.getHighResolutionOutputSizeshNQ4ISI.add(task);
                getHighResolutionOutputSizeshNQ4ISI(listenerRecord);
            }
        }

        private void getHighSpeedVideoSizes(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord = this.Camera2StreamConfigurationMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.getHighSpeedVideoSizes = android.support.v4.app.INotificationSideChannel.Stub.asInterface(iBinder);
                listenerRecord.getHighSpeedVideoFpsRanges = 0;
                getHighResolutionOutputSizeshNQ4ISI(listenerRecord);
            }
        }

        private void getHighSpeedVideoFpsRanges(android.content.ComponentName componentName) {
            androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord = this.Camera2StreamConfigurationMap.get(componentName);
            if (listenerRecord != null) {
                getHighSpeedVideoSizes(listenerRecord);
            }
        }

        private void getHighSpeedVideoFpsRangesFor(android.content.ComponentName componentName) {
            androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord = this.Camera2StreamConfigurationMap.get(componentName);
            if (listenerRecord != null) {
                getHighResolutionOutputSizeshNQ4ISI(listenerRecord);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            this.getHighSpeedVideoFpsRangesFor.obtainMessage(1, new androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            this.getHighSpeedVideoFpsRangesFor.obtainMessage(2, componentName).sendToTarget();
        }

        private void getHighSpeedVideoSizes() {
            java.util.Set<java.lang.String> enabledListenerPackages = androidx.core.app.NotificationManagerCompat.getEnabledListenerPackages(this.getHighResolutionOutputSizeshNQ4ISI);
            if (enabledListenerPackages.equals(this.getHighSpeedVideoSizes)) {
                return;
            }
            this.getHighSpeedVideoSizes = enabledListenerPackages;
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = this.getHighResolutionOutputSizeshNQ4ISI.getPackageManager().queryIntentServices(new android.content.Intent().setAction(androidx.core.app.NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            java.util.HashSet<android.content.ComponentName> hashSet = new java.util.HashSet();
            for (android.content.pm.ResolveInfo resolveInfo : queryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    android.content.ComponentName componentName = new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission == null) {
                        hashSet.add(componentName);
                    }
                }
            }
            for (android.content.ComponentName componentName2 : hashSet) {
                if (!this.Camera2StreamConfigurationMap.containsKey(componentName2)) {
                    this.Camera2StreamConfigurationMap.put(componentName2, new androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord(componentName2));
                }
            }
            java.util.Iterator<java.util.Map.Entry<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord>> it = this.Camera2StreamConfigurationMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        next.getKey();
                    }
                    getHighSpeedVideoSizes(next.getValue());
                    it.remove();
                }
            }
        }

        private boolean Camera2StreamConfigurationMap(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord) {
            if (listenerRecord.Camera2StreamConfigurationMap) {
                return true;
            }
            listenerRecord.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.bindService(new android.content.Intent(androidx.core.app.NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(listenerRecord.getHighSpeedVideoFpsRangesFor), this, 33);
            if (listenerRecord.Camera2StreamConfigurationMap) {
                listenerRecord.getHighSpeedVideoFpsRanges = 0;
            } else {
                android.content.ComponentName componentName = listenerRecord.getHighSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI.unbindService(this);
            }
            return listenerRecord.Camera2StreamConfigurationMap;
        }

        private void getHighSpeedVideoSizes(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord) {
            if (listenerRecord.Camera2StreamConfigurationMap) {
                this.getHighResolutionOutputSizeshNQ4ISI.unbindService(this);
                listenerRecord.Camera2StreamConfigurationMap = false;
            }
            listenerRecord.getHighSpeedVideoSizes = null;
        }

        private void getHighSpeedVideoFpsRanges(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord) {
            if (this.getHighSpeedVideoFpsRangesFor.hasMessages(3, listenerRecord.getHighSpeedVideoFpsRangesFor)) {
                return;
            }
            listenerRecord.getHighSpeedVideoFpsRanges++;
            if (listenerRecord.getHighSpeedVideoFpsRanges > 6) {
                listenerRecord.getHighResolutionOutputSizeshNQ4ISI.size();
                android.content.ComponentName componentName = listenerRecord.getHighSpeedVideoFpsRangesFor;
                int i = listenerRecord.getHighSpeedVideoFpsRanges;
                listenerRecord.getHighResolutionOutputSizeshNQ4ISI.clear();
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.sendMessageDelayed(this.getHighSpeedVideoFpsRangesFor.obtainMessage(3, listenerRecord.getHighSpeedVideoFpsRangesFor), (1 << (listenerRecord.getHighSpeedVideoFpsRanges - 1)) * 1000);
        }

        private void getHighResolutionOutputSizeshNQ4ISI(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord) {
            if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                android.content.ComponentName componentName = listenerRecord.getHighSpeedVideoFpsRangesFor;
                listenerRecord.getHighResolutionOutputSizeshNQ4ISI.size();
            }
            if (listenerRecord.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                return;
            }
            if (!Camera2StreamConfigurationMap(listenerRecord) || listenerRecord.getHighSpeedVideoSizes == null) {
                getHighSpeedVideoFpsRanges(listenerRecord);
                return;
            }
            while (true) {
                androidx.core.app.NotificationManagerCompat.Task peek = listenerRecord.getHighResolutionOutputSizeshNQ4ISI.peek();
                if (peek == null) {
                    break;
                }
                try {
                    peek.getHighSpeedVideoFpsRangesFor(listenerRecord.getHighSpeedVideoSizes);
                    listenerRecord.getHighResolutionOutputSizeshNQ4ISI.remove();
                } catch (android.os.DeadObjectException unused) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        android.content.ComponentName componentName2 = listenerRecord.getHighSpeedVideoFpsRangesFor;
                    }
                } catch (android.os.RemoteException unused2) {
                    android.content.ComponentName componentName3 = listenerRecord.getHighSpeedVideoFpsRangesFor;
                }
            }
            if (listenerRecord.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                return;
            }
            getHighSpeedVideoFpsRanges(listenerRecord);
        }

        static class ListenerRecord {
            boolean Camera2StreamConfigurationMap = false;
            java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat.Task> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayDeque<>();
            int getHighSpeedVideoFpsRanges = 0;
            final android.content.ComponentName getHighSpeedVideoFpsRangesFor;
            android.support.v4.app.INotificationSideChannel getHighSpeedVideoSizes;

            ListenerRecord(android.content.ComponentName componentName) {
                this.getHighSpeedVideoFpsRangesFor = componentName;
            }
        }
    }

    /* loaded from: classes7.dex */
    static class ServiceConnectedEvent {
        final android.os.IBinder getHighSpeedVideoFpsRanges;
        final android.content.ComponentName getHighSpeedVideoSizes;

        ServiceConnectedEvent(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            this.getHighSpeedVideoSizes = componentName;
            this.getHighSpeedVideoFpsRanges = iBinder;
        }
    }

    /* loaded from: classes7.dex */
    static class NotifyTask implements androidx.core.app.NotificationManagerCompat.Task {
        final int Camera2StreamConfigurationMap;
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final android.app.Notification getHighSpeedVideoFpsRanges;
        final java.lang.String getHighSpeedVideoSizes;

        NotifyTask(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoSizes = str2;
            this.getHighSpeedVideoFpsRanges = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void getHighSpeedVideoFpsRangesFor(android.support.v4.app.INotificationSideChannel iNotificationSideChannel) throws android.os.RemoteException {
            iNotificationSideChannel.notify(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifyTask[packageName:");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", id:");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", tag:");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        static java.util.List<android.service.notification.StatusBarNotification> getHighSpeedVideoSizes(android.app.NotificationManager notificationManager) {
            android.service.notification.StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications == null) {
                return new java.util.ArrayList();
            }
            return java.util.Arrays.asList(activeNotifications);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.app.NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int Camera2StreamConfigurationMap(android.app.NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* loaded from: classes7.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        static void getHighSpeedVideoSizes(android.app.NotificationManager notificationManager, android.app.NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static android.app.NotificationChannel Camera2StreamConfigurationMap(android.app.NotificationManager notificationManager, java.lang.String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static void getHighSpeedVideoSizes(android.app.NotificationManager notificationManager, java.util.List<android.app.NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static java.util.List<android.app.NotificationChannel> getHighSpeedVideoFpsRanges(android.app.NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }

        static void Camera2StreamConfigurationMap(android.app.NotificationManager notificationManager, android.app.NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void getHighSpeedVideoFpsRanges(android.app.NotificationManager notificationManager, java.util.List<android.app.NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static java.util.List<android.app.NotificationChannelGroup> getHighSpeedVideoFpsRangesFor(android.app.NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static void getHighSpeedVideoFpsRanges(android.app.NotificationManager notificationManager, java.lang.String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationManager notificationManager, java.lang.String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static java.lang.String getHighSpeedVideoFpsRanges(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static java.lang.String getHighSpeedVideoSizes(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }
    }

    /* loaded from: classes7.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static android.app.NotificationChannelGroup getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationManager notificationManager, java.lang.String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* loaded from: classes7.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        static java.lang.String Camera2StreamConfigurationMap(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        static android.app.NotificationChannel getHighSpeedVideoFpsRangesFor(android.app.NotificationManager notificationManager, java.lang.String str, java.lang.String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }
    }

    /* loaded from: classes7.dex */
    static class Api34Impl {
        private Api34Impl() {
        }

        static boolean getHighSpeedVideoSizes(android.app.NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    /* loaded from: classes7.dex */
    static class Api36Impl {
        private Api36Impl() {
        }

        static boolean Camera2StreamConfigurationMap(android.app.NotificationManager notificationManager) {
            return notificationManager.canPostPromotedNotifications();
        }
    }
}
