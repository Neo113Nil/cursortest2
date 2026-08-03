package androidx.compose.ui.graphics.drawscope;

/* compiled from: CanvasDrawScope.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.graphics.drawscope.DrawTransform asDrawTransform(final androidx.compose.ui.graphics.drawscope.DrawContext drawContext) {
        return new androidx.compose.ui.graphics.drawscope.DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo2603getSizeNHjbRc() {
                return androidx.compose.ui.graphics.drawscope.DrawContext.this.mo2598getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo2602getCenterF1C5BW0() {
                return androidx.compose.ui.geometry.SizeKt.m1950getCenteruvyYCjk(mo2603getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                androidx.compose.ui.graphics.Canvas canvas = androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = androidx.compose.ui.graphics.drawscope.DrawContext.this;
                long Size = androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.geometry.Size.m1940getWidthimpl(mo2603getSizeNHjbRc()) - (right + left), androidx.compose.ui.geometry.Size.m1937getHeightimpl(mo2603getSizeNHjbRc()) - (bottom + top));
                if (androidx.compose.ui.geometry.Size.m1940getWidthimpl(Size) < 0.0f || androidx.compose.ui.geometry.Size.m1937getHeightimpl(Size) < 0.0f) {
                    throw new java.lang.IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
                }
                drawContext2.mo2599setSizeuvyYCjk(Size);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo2601clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas().mo1966clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo2600clipPathmtrdDE(androidx.compose.ui.graphics.Path path, int clipOp) {
                androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas().mo1965clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas().translate(left, top);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo2604rotateUv8p0NA(float degrees, long pivot) {
                androidx.compose.ui.graphics.Canvas canvas = androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas();
                canvas.translate(androidx.compose.ui.geometry.Offset.m1871getXimpl(pivot), androidx.compose.ui.geometry.Offset.m1872getYimpl(pivot));
                canvas.rotate(degrees);
                canvas.translate(-androidx.compose.ui.geometry.Offset.m1871getXimpl(pivot), -androidx.compose.ui.geometry.Offset.m1872getYimpl(pivot));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo2605scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                androidx.compose.ui.graphics.Canvas canvas = androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas();
                canvas.translate(androidx.compose.ui.geometry.Offset.m1871getXimpl(pivot), androidx.compose.ui.geometry.Offset.m1872getYimpl(pivot));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-androidx.compose.ui.geometry.Offset.m1871getXimpl(pivot), -androidx.compose.ui.geometry.Offset.m1872getYimpl(pivot));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo2606transform58bKbWc(float[] matrix) {
                androidx.compose.ui.graphics.drawscope.DrawContext.this.getCanvas().mo1968concat58bKbWc(matrix);
            }
        };
    }
}
