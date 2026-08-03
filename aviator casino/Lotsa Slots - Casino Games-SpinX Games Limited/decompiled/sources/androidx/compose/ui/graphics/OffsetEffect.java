package androidx.compose.ui.graphics;

/* compiled from: AndroidRenderEffect.android.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0015J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "offset", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/graphics/RenderEffect;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "createRenderEffect", "Landroid/graphics/RenderEffect;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OffsetEffect extends androidx.compose.ui.graphics.RenderEffect {
    private final long offset;
    private final androidx.compose.ui.graphics.RenderEffect renderEffect;

    public /* synthetic */ OffsetEffect(androidx.compose.ui.graphics.RenderEffect renderEffect, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, j);
    }

    private OffsetEffect(androidx.compose.ui.graphics.RenderEffect renderEffect, long j) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    /* renamed from: createRenderEffect */
    protected android.graphics.RenderEffect getAndroidRenderEffect() {
        return androidx.compose.ui.graphics.RenderEffectVerificationHelper.INSTANCE.m2432createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.OffsetEffect)) {
            return false;
        }
        androidx.compose.ui.graphics.OffsetEffect offsetEffect = (androidx.compose.ui.graphics.OffsetEffect) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.renderEffect, offsetEffect.renderEffect) && androidx.compose.ui.geometry.Offset.m1868equalsimpl0(this.offset, offsetEffect.offset);
    }

    public int hashCode() {
        androidx.compose.ui.graphics.RenderEffect renderEffect = this.renderEffect;
        return ((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + androidx.compose.ui.geometry.Offset.m1873hashCodeimpl(this.offset);
    }

    public java.lang.String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((java.lang.Object) androidx.compose.ui.geometry.Offset.m1879toStringimpl(this.offset)) + ')';
    }
}
