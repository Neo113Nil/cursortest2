package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(Landroidx/compose/ui/graphics/RenderEffect;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/RenderEffect;", "createRenderEffect", "()Landroid/graphics/RenderEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/RenderEffect;", "getHighSpeedVideoFpsRanges", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OffsetEffect extends androidx.compose.ui.graphics.RenderEffect {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.RenderEffect Camera2StreamConfigurationMap;
    private final long getHighSpeedVideoFpsRanges;

    private OffsetEffect(androidx.compose.ui.graphics.RenderEffect renderEffect, long j) {
        super(null);
        this.Camera2StreamConfigurationMap = renderEffect;
        this.getHighSpeedVideoFpsRanges = j;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    /* renamed from: createRenderEffect */
    protected final android.graphics.RenderEffect getAndroidRenderEffect() {
        androidx.compose.ui.graphics.RenderEffectVerificationHelper renderEffectVerificationHelper = androidx.compose.ui.graphics.RenderEffectVerificationHelper.INSTANCE;
        return androidx.compose.ui.graphics.RenderEffectVerificationHelper.aJ_(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.OffsetEffect)) {
            return false;
        }
        androidx.compose.ui.graphics.OffsetEffect offsetEffect = (androidx.compose.ui.graphics.OffsetEffect) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, offsetEffect.Camera2StreamConfigurationMap) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.getHighSpeedVideoFpsRanges, offsetEffect.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        androidx.compose.ui.graphics.RenderEffect renderEffect = this.Camera2StreamConfigurationMap;
        return ((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OffsetEffect(renderEffect=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", offset=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.getHighSpeedVideoFpsRanges));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ OffsetEffect(androidx.compose.ui.graphics.RenderEffect renderEffect, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, j);
    }
}
