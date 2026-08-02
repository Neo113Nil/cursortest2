package androidx.media3.common.util;

/* loaded from: classes7.dex */
final class SystemHandlerWrapper implements androidx.media3.common.util.HandlerWrapper {
    private static final java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(50);
    private final android.os.Handler Camera2StreamConfigurationMap;

    public SystemHandlerWrapper(android.os.Handler handler) {
        this.Camera2StreamConfigurationMap = handler;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final android.os.Looper getLooper() {
        return this.Camera2StreamConfigurationMap.getLooper();
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean hasMessages(int i) {
        com.google.common.base.Preconditions.checkArgument(i != 0);
        return this.Camera2StreamConfigurationMap.hasMessages(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i) {
        androidx.media3.common.util.SystemHandlerWrapper.SystemMessage Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.obtainMessage(i);
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges = this;
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, java.lang.Object obj) {
        androidx.media3.common.util.SystemHandlerWrapper.SystemMessage Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.obtainMessage(i, obj);
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges = this;
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, int i2, int i3) {
        androidx.media3.common.util.SystemHandlerWrapper.SystemMessage Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.obtainMessage(i, i2, i3);
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges = this;
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i, int i2, int i3, java.lang.Object obj) {
        androidx.media3.common.util.SystemHandlerWrapper.SystemMessage Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.obtainMessage(i, i2, i3, obj);
        Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges = this;
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean sendMessageAtFrontOfQueue(androidx.media3.common.util.HandlerWrapper.Message message) {
        androidx.media3.common.util.SystemHandlerWrapper.SystemMessage systemMessage = (androidx.media3.common.util.SystemHandlerWrapper.SystemMessage) message;
        boolean sendMessageAtFrontOfQueue = this.Camera2StreamConfigurationMap.sendMessageAtFrontOfQueue((android.os.Message) com.google.common.base.Preconditions.checkNotNull(systemMessage.Camera2StreamConfigurationMap));
        systemMessage.Camera2StreamConfigurationMap = null;
        systemMessage.getHighSpeedVideoFpsRanges = null;
        Camera2StreamConfigurationMap(systemMessage);
        return sendMessageAtFrontOfQueue;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean sendEmptyMessage(int i) {
        return this.Camera2StreamConfigurationMap.sendEmptyMessage(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.Camera2StreamConfigurationMap.sendEmptyMessageDelayed(i, i2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean sendEmptyMessageAtTime(int i, long j) {
        return this.Camera2StreamConfigurationMap.sendEmptyMessageAtTime(i, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final void removeMessages(int i) {
        com.google.common.base.Preconditions.checkArgument(i != 0);
        this.Camera2StreamConfigurationMap.removeMessages(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final void removeCallbacks(java.lang.Runnable runnable) {
        this.Camera2StreamConfigurationMap.removeCallbacks(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final void removeCallbacksAndMessages(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap.removeCallbacksAndMessages(obj);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean post(java.lang.Runnable runnable) {
        return this.Camera2StreamConfigurationMap.post(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean postDelayed(java.lang.Runnable runnable, long j) {
        return this.Camera2StreamConfigurationMap.postDelayed(runnable, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean postAtFrontOfQueue(java.lang.Runnable runnable) {
        return this.Camera2StreamConfigurationMap.postAtFrontOfQueue(runnable);
    }

    private static androidx.media3.common.util.SystemHandlerWrapper.SystemMessage Camera2StreamConfigurationMap() {
        androidx.media3.common.util.SystemHandlerWrapper.SystemMessage remove;
        java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> list = getHighSpeedVideoFpsRangesFor;
        synchronized (list) {
            if (list.isEmpty()) {
                remove = new androidx.media3.common.util.SystemHandlerWrapper.SystemMessage((byte) 0);
            } else {
                remove = list.remove(list.size() - 1);
            }
        }
        return remove;
    }

    static final class SystemMessage implements androidx.media3.common.util.HandlerWrapper.Message {
        android.os.Message Camera2StreamConfigurationMap;
        androidx.media3.common.util.SystemHandlerWrapper getHighSpeedVideoFpsRanges;

        private SystemMessage() {
        }

        /* synthetic */ SystemMessage(byte b) {
            this();
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public final void sendToTarget() {
            ((android.os.Message) com.google.common.base.Preconditions.checkNotNull(this.Camera2StreamConfigurationMap)).sendToTarget();
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = null;
            androidx.media3.common.util.SystemHandlerWrapper.Camera2StreamConfigurationMap(this);
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public final androidx.media3.common.util.HandlerWrapper getTarget() {
            return (androidx.media3.common.util.HandlerWrapper) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRanges);
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.media3.common.util.SystemHandlerWrapper.SystemMessage systemMessage) {
        java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> list = getHighSpeedVideoFpsRangesFor;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(systemMessage);
            }
        }
    }
}
