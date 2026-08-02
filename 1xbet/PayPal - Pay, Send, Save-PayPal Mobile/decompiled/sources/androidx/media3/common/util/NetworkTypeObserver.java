package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class NetworkTypeObserver {
    private static androidx.media3.common.util.NetworkTypeObserver Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.common.util.NetworkTypeObserver.ListenerHolder> getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private int getOutputFormats;

    public interface Listener {
        void onNetworkTypeChanged(int i);
    }

    public static androidx.media3.common.util.NetworkTypeObserver getInstance(android.content.Context context) {
        androidx.media3.common.util.NetworkTypeObserver networkTypeObserver;
        synchronized (androidx.media3.common.util.NetworkTypeObserver.class) {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new androidx.media3.common.util.NetworkTypeObserver(context);
            }
            networkTypeObserver = Camera2StreamConfigurationMap;
        }
        return networkTypeObserver;
    }

    public static void resetForTests() {
        synchronized (androidx.media3.common.util.NetworkTypeObserver.class) {
            Camera2StreamConfigurationMap = null;
        }
    }

    private NetworkTypeObserver(final android.content.Context context) {
        java.util.concurrent.Executor executor = androidx.media3.common.util.BackgroundExecutor.get();
        this.getHighSpeedVideoFpsRangesFor = executor;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        this.getOutputFormats = 0;
        executor.execute(new java.lang.Runnable() { // from class: androidx.media3.common.util.NetworkTypeObserver$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.util.NetworkTypeObserver networkTypeObserver = androidx.media3.common.util.NetworkTypeObserver.this;
                android.content.Context context2 = context;
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new androidx.media3.common.util.NetworkTypeObserver.Receiver(networkTypeObserver, (byte) 0), intentFilter);
            }
        });
    }

    @java.lang.Deprecated
    public final void register(androidx.media3.common.util.NetworkTypeObserver.Listener listener) {
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        register(listener, new java.util.concurrent.Executor() { // from class: androidx.media3.common.util.NetworkTypeObserver$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        });
    }

    public final void register(androidx.media3.common.util.NetworkTypeObserver.Listener listener, java.util.concurrent.Executor executor) {
        boolean z;
        Camera2StreamConfigurationMap();
        androidx.media3.common.util.NetworkTypeObserver.ListenerHolder listenerHolder = new androidx.media3.common.util.NetworkTypeObserver.ListenerHolder(listener, executor);
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges.add(listenerHolder);
            z = this.getHighSpeedVideoSizes;
        }
        if (z) {
            listenerHolder.getHighSpeedVideoFpsRangesFor.execute(new androidx.media3.common.util.NetworkTypeObserver$ListenerHolder$$ExternalSyntheticLambda0(listenerHolder));
        }
    }

    public final int getNetworkType() {
        int i;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            i = this.getOutputFormats;
        }
        return i;
    }

    private void Camera2StreamConfigurationMap() {
        java.util.Iterator<androidx.media3.common.util.NetworkTypeObserver.ListenerHolder> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            androidx.media3.common.util.NetworkTypeObserver.ListenerHolder next = it.next();
            if (next.Camera2StreamConfigurationMap.get() == null) {
                this.getHighSpeedVideoFpsRanges.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI(int i) {
        Camera2StreamConfigurationMap();
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoSizes && this.getOutputFormats == i) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputFormats = i;
            java.util.Iterator<androidx.media3.common.util.NetworkTypeObserver.ListenerHolder> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                androidx.media3.common.util.NetworkTypeObserver.ListenerHolder next = it.next();
                next.getHighSpeedVideoFpsRangesFor.execute(new androidx.media3.common.util.NetworkTypeObserver$ListenerHolder$$ExternalSyntheticLambda0(next));
            }
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return android.os.Build.VERSION.SDK_INT >= 29 ? 9 : 0;
            }
        } catch (java.lang.SecurityException unused) {
            return 0;
        }
    }

    final class Receiver extends android.content.BroadcastReceiver {
        private Receiver() {
        }

        /* synthetic */ Receiver(androidx.media3.common.util.NetworkTypeObserver networkTypeObserver, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final android.content.Context context, android.content.Intent intent) {
            androidx.media3.common.util.NetworkTypeObserver.this.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.media3.common.util.NetworkTypeObserver$Receiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.common.util.NetworkTypeObserver.Receiver receiver = androidx.media3.common.util.NetworkTypeObserver.Receiver.this;
                    androidx.media3.common.util.NetworkTypeObserver.getHighSpeedVideoFpsRangesFor(androidx.media3.common.util.NetworkTypeObserver.this, context);
                }
            });
        }
    }

    static final class Api31 {
        private Api31() {
        }

        public static void getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, androidx.media3.common.util.NetworkTypeObserver networkTypeObserver) {
            try {
                android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.google.common.base.Preconditions.checkNotNull((android.telephony.TelephonyManager) context.getSystemService("phone"));
                androidx.media3.common.util.NetworkTypeObserver.Api31.DisplayInfoCallback displayInfoCallback = new androidx.media3.common.util.NetworkTypeObserver.Api31.DisplayInfoCallback(networkTypeObserver);
                telephonyManager.registerTelephonyCallback(networkTypeObserver.getHighSpeedVideoFpsRangesFor, displayInfoCallback);
                telephonyManager.unregisterTelephonyCallback(displayInfoCallback);
            } catch (java.lang.RuntimeException unused) {
                networkTypeObserver.getHighResolutionOutputSizeshNQ4ISI(5);
            }
        }

        static final class DisplayInfoCallback extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {
            private final androidx.media3.common.util.NetworkTypeObserver getHighSpeedVideoSizes;

            public DisplayInfoCallback(androidx.media3.common.util.NetworkTypeObserver networkTypeObserver) {
                this.getHighSpeedVideoSizes = networkTypeObserver;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }
    }

    final class ListenerHolder {
        final java.lang.ref.WeakReference<androidx.media3.common.util.NetworkTypeObserver.Listener> Camera2StreamConfigurationMap;
        final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

        public ListenerHolder(androidx.media3.common.util.NetworkTypeObserver.Listener listener, java.util.concurrent.Executor executor) {
            this.Camera2StreamConfigurationMap = new java.lang.ref.WeakReference<>(listener);
            this.getHighSpeedVideoFpsRangesFor = executor;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.media3.common.util.NetworkTypeObserver networkTypeObserver, android.content.Context context) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context);
        if (android.os.Build.VERSION.SDK_INT >= 31 && highSpeedVideoFpsRangesFor == 5) {
            androidx.media3.common.util.NetworkTypeObserver.Api31.getHighResolutionOutputSizeshNQ4ISI(context, networkTypeObserver);
        } else {
            networkTypeObserver.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
        }
    }
}
