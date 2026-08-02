package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedDrawDebug", "()Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "", "getForcedHeight", "()I", "", "getForcedProgress", "()F", "getForcedWidth", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "getLayoutInformationMode", "()Landroidx/constraintlayout/compose/LayoutInfoFlags;", "progress", "", "onNewProgress", "(F)V", "resetForcedProgress", "()V", "", "information", "setLayoutInformation", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/MutableState;", "", "needsUpdate", "setUpdateFlag", "(Landroidx/compose/runtime/MutableState;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutInformationReceiver {
    androidx.constraintlayout.compose.MotionLayoutDebugFlags getForcedDrawDebug();

    int getForcedHeight();

    float getForcedProgress();

    int getForcedWidth();

    androidx.constraintlayout.compose.LayoutInfoFlags getLayoutInformationMode();

    void onNewProgress(float progress);

    void resetForcedProgress();

    void setLayoutInformation(java.lang.String information);

    void setUpdateFlag(androidx.compose.runtime.MutableState<java.lang.Long> needsUpdate);
}
