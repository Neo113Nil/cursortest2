package coil.compose;

/* compiled from: CrossfadePainter.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010,\u001a\u00020-*\u00020.H\u0014J\u0010\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0018H\u0014J\u0012\u00101\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014J\u000f\u00102\u001a\u00020)H\u0002¢\u0006\u0004\b3\u0010+J\u001e\u00104\u001a\u00020-*\u00020.2\b\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u00100\u001a\u00020\u0018H\u0002J\u001f\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u00108\u001a\u00020)H\u0002¢\u0006\u0004\b9\u0010:R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR/\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\r\u001a\u0004\u0018\u00010 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006;"}, d2 = {"Lcoil/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "start", "end", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "durationMillis", "", "fadeStart", "", "preferExactIntrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;IZZ)V", "<set-?>", "invalidateTick", "getInvalidateTick", "()I", "setInvalidateTick", "(I)V", "invalidateTick$delegate", "Landroidx/compose/runtime/MutableIntState;", "startTimeMillis", "", "isDone", "", "maxAlpha", "getMaxAlpha", "()F", "setMaxAlpha", "(F)V", "maxAlpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter$delegate", "Landroidx/compose/runtime/MutableState;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "applyAlpha", "alpha", "applyColorFilter", "computeIntrinsicSize", "computeIntrinsicSize-NH-jbRc", "drawPainter", "painter", "computeDrawSize", "srcSize", "dstSize", "computeDrawSize-x8L_9b0", "(JJ)J", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CrossfadePainter extends androidx.compose.ui.graphics.painter.Painter {
    public static final int $stable = 0;
    private final androidx.compose.ui.layout.ContentScale contentScale;
    private final int durationMillis;
    private final androidx.compose.ui.graphics.painter.Painter end;
    private final boolean fadeStart;
    private boolean isDone;
    private final boolean preferExactIntrinsicSize;
    private androidx.compose.ui.graphics.painter.Painter start;

    /* renamed from: invalidateTick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState invalidateTick = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
    private long startTimeMillis = -1;

    /* renamed from: maxAlpha$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState maxAlpha = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    /* renamed from: colorFilter$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState colorFilter = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public CrossfadePainter(androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.graphics.painter.Painter painter2, androidx.compose.ui.layout.ContentScale contentScale, int i, boolean z, boolean z2) {
        this.start = painter;
        this.end = painter2;
        this.contentScale = contentScale;
        this.durationMillis = i;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
    }

    private final int getInvalidateTick() {
        return this.invalidateTick.getIntValue();
    }

    private final void setInvalidateTick(int i) {
        this.invalidateTick.setIntValue(i);
    }

    private final float getMaxAlpha() {
        return this.maxAlpha.getFloatValue();
    }

    private final void setMaxAlpha(float f) {
        this.maxAlpha.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return (androidx.compose.ui.graphics.ColorFilter) this.colorFilter.getValue();
    }

    private final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter.setValue(colorFilter);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return m4962computeIntrinsicSizeNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        if (this.isDone) {
            drawPainter(drawScope, this.end, getMaxAlpha());
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (this.startTimeMillis == -1) {
            this.startTimeMillis = uptimeMillis;
        }
        float f = (uptimeMillis - this.startTimeMillis) / this.durationMillis;
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(f, 0.0f, 1.0f) * getMaxAlpha();
        float maxAlpha = this.fadeStart ? getMaxAlpha() - coerceIn : getMaxAlpha();
        this.isDone = f >= 1.0f;
        drawPainter(drawScope, this.start, maxAlpha);
        drawPainter(drawScope, this.end, coerceIn);
        if (this.isDone) {
            this.start = null;
        } else {
            setInvalidateTick(getInvalidateTick() + 1);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        setMaxAlpha(alpha);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        setColorFilter(colorFilter);
        return true;
    }

    /* renamed from: computeIntrinsicSize-NH-jbRc, reason: not valid java name */
    private final long m4962computeIntrinsicSizeNHjbRc() {
        androidx.compose.ui.graphics.painter.Painter painter = this.start;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc();
        androidx.compose.ui.graphics.painter.Painter painter2 = this.end;
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc();
        boolean z = intrinsicSize != androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
        boolean z2 = intrinsicSize2 != androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
        if (z && z2) {
            return androidx.compose.ui.geometry.SizeKt.Size(java.lang.Math.max(androidx.compose.ui.geometry.Size.m1940getWidthimpl(intrinsicSize), androidx.compose.ui.geometry.Size.m1940getWidthimpl(intrinsicSize2)), java.lang.Math.max(androidx.compose.ui.geometry.Size.m1937getHeightimpl(intrinsicSize), androidx.compose.ui.geometry.Size.m1937getHeightimpl(intrinsicSize2)));
        }
        if (this.preferExactIntrinsicSize) {
            if (z) {
                return intrinsicSize;
            }
            if (z2) {
                return intrinsicSize2;
            }
        }
        return androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
    }

    private final void drawPainter(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.painter.Painter painter, float f) {
        if (painter == null || f <= 0.0f) {
            return;
        }
        long mo2592getSizeNHjbRc = drawScope.mo2592getSizeNHjbRc();
        long m4961computeDrawSizex8L_9b0 = m4961computeDrawSizex8L_9b0(painter.getIntrinsicSize(), mo2592getSizeNHjbRc);
        if (mo2592getSizeNHjbRc == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc() || androidx.compose.ui.geometry.Size.m1942isEmptyimpl(mo2592getSizeNHjbRc)) {
            painter.m2751drawx_KDEd0(drawScope, m4961computeDrawSizex8L_9b0, f, getColorFilter());
            return;
        }
        float f2 = 2;
        float m1940getWidthimpl = (androidx.compose.ui.geometry.Size.m1940getWidthimpl(mo2592getSizeNHjbRc) - androidx.compose.ui.geometry.Size.m1940getWidthimpl(m4961computeDrawSizex8L_9b0)) / f2;
        float m1937getHeightimpl = (androidx.compose.ui.geometry.Size.m1937getHeightimpl(mo2592getSizeNHjbRc) - androidx.compose.ui.geometry.Size.m1937getHeightimpl(m4961computeDrawSizex8L_9b0)) / f2;
        drawScope.getDrawContext().getTransform().inset(m1940getWidthimpl, m1937getHeightimpl, m1940getWidthimpl, m1937getHeightimpl);
        painter.m2751drawx_KDEd0(drawScope, m4961computeDrawSizex8L_9b0, f, getColorFilter());
        float f3 = -m1940getWidthimpl;
        float f4 = -m1937getHeightimpl;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    /* renamed from: computeDrawSize-x8L_9b0, reason: not valid java name */
    private final long m4961computeDrawSizex8L_9b0(long srcSize, long dstSize) {
        return (srcSize == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc() || androidx.compose.ui.geometry.Size.m1942isEmptyimpl(srcSize) || dstSize == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc() || androidx.compose.ui.geometry.Size.m1942isEmptyimpl(dstSize)) ? dstSize : androidx.compose.ui.layout.ScaleFactorKt.m3490timesUQTWf7w(srcSize, this.contentScale.mo3393computeScaleFactorH7hwNQA(srcSize, dstSize));
    }
}
