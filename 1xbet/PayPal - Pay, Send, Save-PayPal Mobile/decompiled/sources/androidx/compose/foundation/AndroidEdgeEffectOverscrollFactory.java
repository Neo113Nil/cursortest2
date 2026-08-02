package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollFactory;", "Landroidx/compose/foundation/OverscrollFactory;", "Landroid/content/Context;", "p0", "Landroidx/compose/ui/unit/Density;", "p1", "Landroidx/compose/ui/graphics/Color;", "p2", "Landroidx/compose/foundation/layout/PaddingValues;", "p3", "<init>", "(Landroid/content/Context;Landroidx/compose/ui/unit/Density;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/OverscrollEffect;", "createOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "J", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/layout/PaddingValues;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidEdgeEffectOverscrollFactory implements androidx.compose.foundation.OverscrollFactory {
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.Density getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    private AndroidEdgeEffectOverscrollFactory(android.content.Context context, androidx.compose.ui.unit.Density density, long j, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = density;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = paddingValues;
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public final androidx.compose.foundation.OverscrollEffect createOverscrollEffect() {
        return new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
        androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, androidEdgeEffectOverscrollFactory.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, androidEdgeEffectOverscrollFactory.getHighSpeedVideoSizes) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, androidEdgeEffectOverscrollFactory.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, androidEdgeEffectOverscrollFactory.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        return (((((hashCode * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(android.content.Context context, androidx.compose.ui.unit.Density density, long j, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, density, j, paddingValues);
    }
}
