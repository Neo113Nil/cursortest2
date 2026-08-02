package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements android.view.Choreographer.FrameCallback, java.lang.Runnable {
    final /* synthetic */ androidx.compose.ui.platform.AndroidUiDispatcher Camera2StreamConfigurationMap;

    AndroidUiDispatcher$dispatchCallback$1(androidx.compose.ui.platform.AndroidUiDispatcher androidUiDispatcher) {
        this.Camera2StreamConfigurationMap = androidUiDispatcher;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.util.List list;
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        obj = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
        androidx.compose.ui.platform.AndroidUiDispatcher androidUiDispatcher = this.Camera2StreamConfigurationMap;
        synchronized (obj) {
            list = androidUiDispatcher.getHighSpeedVideoSizes;
            if (list.isEmpty()) {
                androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                androidUiDispatcher.getOutputMinFrameDuration = false;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long frameTimeNanos) {
        android.os.Handler handler;
        handler = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
        handler.removeCallbacks(this);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(frameTimeNanos);
    }
}
