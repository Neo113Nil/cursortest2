package androidx.camera.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/view/TapToFocusInfo;", "", "", "focusState", "Landroid/graphics/PointF;", "tapPoint", "<init>", "(ILandroid/graphics/PointF;)V", com.visa.cbp.getEncExpo.warmup, "getFocusState", "()I", "Landroid/graphics/PointF;", "getTapPoint", "()Landroid/graphics/PointF;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TapToFocusInfo {
    private final int focusState;
    private final android.graphics.PointF tapPoint;

    public TapToFocusInfo(int i, android.graphics.PointF pointF) {
        this.focusState = i;
        this.tapPoint = pointF;
    }

    public final int getFocusState() {
        return this.focusState;
    }

    public final android.graphics.PointF getTapPoint() {
        return this.tapPoint;
    }
}
