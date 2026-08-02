package androidx.compose.ui.graphics.drawscope;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawContext;", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/graphics/drawscope/DrawContext;)Landroidx/compose/ui/graphics/drawscope/DrawTransform;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.graphics.drawscope.DrawTransform getHighSpeedVideoSizes(final androidx.compose.ui.graphics.drawscope.DrawContext drawContext) {
        return new androidx.compose.ui.graphics.drawscope.DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public final long mo6458getSizeNHjbRc() {
                return androidx.compose.ui.graphics.drawscope.DrawContext.this.mo6453getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public final long mo6457getCenterF1C5BW0() {
                return androidx.compose.ui.geometry.SizeKt.m5831getCenteruvyYCjk(mo6458getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public final void inset(float left, float top, float right, float bottom) {
                androidx.compose.ui.graphics.Canvas canvas = androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = androidx.compose.ui.graphics.drawscope.DrawContext.this;
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (mo6458getSizeNHjbRc() >> 32));
                long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (mo6458getSizeNHjbRc() & 4294967295L)) - (bottom + top)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat - (right + left)) << 32));
                if (java.lang.Float.intBitsToFloat((int) (m5812constructorimpl >> 32)) < 0.0f || java.lang.Float.intBitsToFloat((int) (m5812constructorimpl & 4294967295L)) < 0.0f) {
                    androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo6454setSizeuvyYCjk(m5812constructorimpl);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public final void mo6456clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas().mo5847clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public final void mo6455clipPathmtrdDE(androidx.compose.ui.graphics.Path path, int clipOp) {
                androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas().mo5846clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public final void translate(float left, float top) {
                androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas().translate(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public final void mo6459rotateUv8p0NA(float degrees, long pivot) {
                androidx.compose.ui.graphics.Canvas canvas = androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas();
                int i = (int) (pivot >> 32);
                int i2 = (int) (pivot & 4294967295L);
                canvas.translate(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2));
                canvas.rotate(degrees);
                canvas.translate(-java.lang.Float.intBitsToFloat(i), -java.lang.Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public final void mo6460scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                androidx.compose.ui.graphics.Canvas canvas = androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas();
                int i = (int) (pivot >> 32);
                int i2 = (int) (pivot & 4294967295L);
                canvas.translate(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-java.lang.Float.intBitsToFloat(i), -java.lang.Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public final void mo6461transform58bKbWc(float[] matrix) {
                androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas().mo5848concat58bKbWc(matrix);
            }
        };
    }
}
