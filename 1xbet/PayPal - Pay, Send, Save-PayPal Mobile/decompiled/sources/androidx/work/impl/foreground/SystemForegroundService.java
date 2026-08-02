package androidx.work.impl.foreground;

/* loaded from: classes3.dex */
public class SystemForegroundService extends androidx.view.LifecycleService implements androidx.work.impl.foreground.SystemForegroundDispatcher.Callback {
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.work.Logger.tagWithPrefix("SystemFgService");
    private static androidx.work.impl.foreground.SystemForegroundService getHighSpeedVideoSizes = null;
    android.app.NotificationManager Camera2StreamConfigurationMap;
    androidx.work.impl.foreground.SystemForegroundDispatcher getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        getHighSpeedVideoSizes = this;
        getHighSpeedVideoSizes();
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.getHighSpeedVideoFpsRangesFor) {
            androidx.work.Logger.get().info(getHighSpeedVideoFpsRanges, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
            getHighSpeedVideoSizes();
            this.getHighSpeedVideoFpsRangesFor = false;
        }
        if (intent == null) {
            return 3;
        }
        final androidx.work.impl.foreground.SystemForegroundDispatcher systemForegroundDispatcher = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String action = intent.getAction();
        if (!"ACTION_START_FOREGROUND".equals(action)) {
            if ("ACTION_NOTIFY".equals(action)) {
                systemForegroundDispatcher.Camera2StreamConfigurationMap(intent);
                return 3;
            }
            if (!"ACTION_CANCEL_WORK".equals(action)) {
                if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                    return 3;
                }
                androidx.work.Logger.get().info(androidx.work.impl.foreground.SystemForegroundDispatcher.getHighSpeedVideoSizes, "Stopping foreground service");
                androidx.work.impl.foreground.SystemForegroundDispatcher.Callback callback = systemForegroundDispatcher.getHighSpeedVideoFpsRanges;
                if (callback == null) {
                    return 3;
                }
                callback.stop(i2);
                return 3;
            }
            androidx.work.Logger.get().info(androidx.work.impl.foreground.SystemForegroundDispatcher.getHighSpeedVideoSizes, "Stopping foreground work for ".concat(java.lang.String.valueOf(intent)));
            java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || android.text.TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            systemForegroundDispatcher.getHighSpeedVideoSizesFor.cancelWorkById(java.util.UUID.fromString(stringExtra));
            return 3;
        }
        androidx.work.Logger.get().info(androidx.work.impl.foreground.SystemForegroundDispatcher.getHighSpeedVideoSizes, "Started foreground service ".concat(java.lang.String.valueOf(intent)));
        final java.lang.String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        systemForegroundDispatcher.getOutputFormats.executeOnTaskThread(new java.lang.Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1
            final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;

            AnonymousClass1(final java.lang.String stringExtra22) {
                r2 = stringExtra22;
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.work.impl.model.WorkSpec runningWorkSpec = androidx.work.impl.foreground.SystemForegroundDispatcher.this.getHighSpeedVideoSizesFor.getProcessor().getRunningWorkSpec(r2);
                if (runningWorkSpec == null || !runningWorkSpec.hasConstraints()) {
                    return;
                }
                synchronized (androidx.work.impl.foreground.SystemForegroundDispatcher.this.getInputFormats) {
                    androidx.work.impl.foreground.SystemForegroundDispatcher.this.getInputSizeshNQ4ISI.put(androidx.work.impl.model.WorkSpecKt.generationalId(runningWorkSpec), runningWorkSpec);
                    androidx.work.impl.foreground.SystemForegroundDispatcher.this.getOutputMinFrameDuration.put(androidx.work.impl.model.WorkSpecKt.generationalId(runningWorkSpec), androidx.work.impl.constraints.WorkConstraintsTrackerKt.listen(androidx.work.impl.foreground.SystemForegroundDispatcher.this.Camera2StreamConfigurationMap, runningWorkSpec, androidx.work.impl.foreground.SystemForegroundDispatcher.this.getOutputFormats.getTaskCoroutineDispatcher(), androidx.work.impl.foreground.SystemForegroundDispatcher.this));
                }
            }
        });
        systemForegroundDispatcher.Camera2StreamConfigurationMap(intent);
        return 3;
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
    }

    private void getHighSpeedVideoSizes() {
        this.Camera2StreamConfigurationMap = (android.app.NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.SystemForegroundDispatcher systemForegroundDispatcher = new androidx.work.impl.foreground.SystemForegroundDispatcher(getApplicationContext());
        this.getHighResolutionOutputSizeshNQ4ISI = systemForegroundDispatcher;
        if (systemForegroundDispatcher.getHighSpeedVideoFpsRanges != null) {
            androidx.work.Logger.get().error(androidx.work.impl.foreground.SystemForegroundDispatcher.getHighSpeedVideoSizes, "A callback already exists.");
        } else {
            systemForegroundDispatcher.getHighSpeedVideoFpsRanges = this;
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void stop(int i) {
        this.getHighSpeedVideoFpsRangesFor = true;
        androidx.work.Logger.get().debug(getHighSpeedVideoFpsRanges, "Shutting down.");
        stopForeground(true);
        getHighSpeedVideoSizes = null;
        stopSelf(i);
    }

    @Override // android.app.Service
    public void onTimeout(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(i, 2048);
    }

    public void onTimeout(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(i, i2);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void startForeground(int i, int i2, android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.work.impl.foreground.SystemForegroundService.Api31Impl.getHighSpeedVideoFpsRangesFor(this, i, notification, i2);
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.work.impl.foreground.SystemForegroundService.Api29Impl.getHighSpeedVideoSizes(this, i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void notify(int i, android.app.Notification notification) {
        this.Camera2StreamConfigurationMap.notify(i, notification);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void cancelNotification(int i) {
        this.Camera2StreamConfigurationMap.cancel(i);
    }

    public static androidx.work.impl.foreground.SystemForegroundService getInstance() {
        return getHighSpeedVideoSizes;
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoSizes(android.app.Service service, int i, android.app.Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.app.Service service, int i, android.app.Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (android.app.ForegroundServiceStartNotAllowedException e) {
                androidx.work.Logger.get().warning(androidx.work.impl.foreground.SystemForegroundService.getHighSpeedVideoFpsRanges, "Unable to start foreground service", e);
            } catch (java.lang.SecurityException e2) {
                androidx.work.Logger.get().warning(androidx.work.impl.foreground.SystemForegroundService.getHighSpeedVideoFpsRanges, "Unable to start foreground service", e2);
            }
        }
    }

    @Override // androidx.view.LifecycleService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
