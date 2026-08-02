package androidx.camera.viewfinder.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/viewfinder/compose/MutableCoordinateTransformerImpl;", "Landroidx/camera/viewfinder/compose/MutableCoordinateTransformer;", "Landroidx/compose/ui/graphics/Matrix;", "p0", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "getTransformMatrix-sQKQjiQ", "()[F", "setTransformMatrix-58bKbWc", "([F)V", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableCoordinateTransformerImpl implements androidx.camera.viewfinder.compose.MutableCoordinateTransformer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighResolutionOutputSizeshNQ4ISI;

    private MutableCoordinateTransformerImpl(float[] fArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.graphics.Matrix.m6221boximpl(fArr), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.viewfinder.compose.MutableCoordinateTransformer, androidx.camera.viewfinder.compose.CoordinateTransformer
    /* renamed from: getTransformMatrix-sQKQjiQ */
    public final float[] mo1036getTransformMatrixsQKQjiQ() {
        return ((androidx.compose.ui.graphics.Matrix) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).m6246unboximpl();
    }

    @Override // androidx.camera.viewfinder.compose.MutableCoordinateTransformer
    /* renamed from: setTransformMatrix-58bKbWc */
    public final void mo1040setTransformMatrix58bKbWc(float[] fArr) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(androidx.compose.ui.graphics.Matrix.m6221boximpl(fArr));
    }

    public /* synthetic */ MutableCoordinateTransformerImpl(float[] fArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }
}
