package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000b\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/draw/EmptyBuildDrawCacheParams;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "getHighSpeedVideoFpsRangesFor", "J", "getSize-NH-jbRc", "()J", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/LayoutDirection;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EmptyBuildDrawCacheParams implements androidx.compose.ui.draw.BuildDrawCacheParams {
    public static final androidx.compose.ui.draw.EmptyBuildDrawCacheParams INSTANCE = new androidx.compose.ui.draw.EmptyBuildDrawCacheParams();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final long Camera2StreamConfigurationMap = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final androidx.compose.ui.unit.LayoutDirection getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.LayoutDirection.Ltr;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final androidx.compose.ui.unit.Density getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.DensityKt.Density(1.0f, 1.0f);

    private EmptyBuildDrawCacheParams() {
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public final long mo5552getSizeNHjbRc() {
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final androidx.compose.ui.unit.Density getDensity() {
        return getHighSpeedVideoFpsRanges;
    }
}
