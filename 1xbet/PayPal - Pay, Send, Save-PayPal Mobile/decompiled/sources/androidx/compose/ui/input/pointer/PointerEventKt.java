package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0003\u001a\u0013\u0010\u0011\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001b\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "changedToDown", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "Landroidx/compose/ui/geometry/Offset;", "positionChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChangeConsumed", "anyChangeConsumed", "", "consumeDownChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "consumePositionChange", "consumeAllChanges", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "isOutOfBounds", "Landroidx/compose/ui/geometry/Size;", "extendedTouchPadding", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEventKt {
    public static final boolean changedToDown(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final boolean positionChanged(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return !androidx.compose.ui.geometry.Offset.m5749equalsimpl0(Camera2StreamConfigurationMap(pointerInputChange, false), androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return !androidx.compose.ui.geometry.Offset.m5749equalsimpl0(Camera2StreamConfigurationMap(pointerInputChange, true), androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
    }

    public static final long positionChange(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return Camera2StreamConfigurationMap(pointerInputChange, false);
    }

    public static final long positionChangeIgnoreConsumed(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return Camera2StreamConfigurationMap(pointerInputChange, true);
    }

    private static final long Camera2StreamConfigurationMap(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, boolean z) {
        return (z || !pointerInputChange.isConsumed()) ? androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()) : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @kotlin.Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @kotlin.ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    @kotlin.Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @kotlin.ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    @kotlin.Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @kotlin.ReplaceWith(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @kotlin.Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @kotlin.ReplaceWith(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(positionChange(pointerInputChange), androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @kotlin.Deprecated(message = "Use consume() instead", replaceWith = @kotlin.ReplaceWith(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    @kotlin.Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @kotlin.ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m7176isOutOfBoundsO0kMr_c(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
        long position = pointerInputChange.getPosition();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (position >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (position & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        boolean z = intBitsToFloat < 0.0f;
        boolean z2 = intBitsToFloat > ((float) i);
        return z2 | z | (intBitsToFloat2 < 0.0f) | (intBitsToFloat2 > ((float) i2));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m7177isOutOfBoundsjwHxaWs(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, long j2) {
        boolean m7299equalsimpl0 = androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerInputChange.getType(), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA());
        long position = pointerInputChange.getPosition();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (position >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (position & 4294967295L));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float f = m7299equalsimpl0 ? 1.0f : 0.0f;
        float f2 = intBitsToFloat3 * f;
        float f3 = (int) (j >> 32);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        float f4 = (int) (j & 4294967295L);
        boolean z = intBitsToFloat < (-f2);
        return (intBitsToFloat > f3 + f2) | z | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > f4 + intBitsToFloat4);
    }
}
