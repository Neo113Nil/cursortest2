package coil3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcoil3/SingletonImageLoader$Factory;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/SingletonImageLoader$Factory;", "getHighSpeedVideoFpsRangesFor", "Lcoil3/Extras$Key;", "", "getHighSpeedVideoFpsRanges", "Lcoil3/Extras$Key;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingletonImageLoaderKt {
    private static final coil3.SingletonImageLoader.Factory getHighResolutionOutputSizeshNQ4ISI = new coil3.SingletonImageLoader.Factory() { // from class: coil3.SingletonImageLoaderKt$$ExternalSyntheticLambda0
        @Override // coil3.SingletonImageLoader.Factory
        public final coil3.ImageLoader newImageLoader(android.content.Context context) {
            return coil3.SingletonImageLoaderKt.m9734$r8$lambda$aP77tREfoMZyJEV_fYEbcL2m1A(context);
        }
    };
    private static final coil3.Extras.Key<kotlin.Unit> getHighSpeedVideoFpsRanges = new coil3.Extras.Key<>(kotlin.Unit.INSTANCE);

    /* renamed from: $r8$lambda$aP77tREfoMZyJEV_fYEbcL-2m1A, reason: not valid java name */
    public static /* synthetic */ coil3.ImageLoader m9734$r8$lambda$aP77tREfoMZyJEV_fYEbcL2m1A(android.content.Context context) {
        coil3.ImageLoader.Builder builder = new coil3.ImageLoader.Builder(context);
        builder.getExtras().set(getHighSpeedVideoFpsRanges, kotlin.Unit.INSTANCE);
        return builder.build();
    }

    public static final /* synthetic */ boolean access$isDefault(coil3.ImageLoader imageLoader) {
        return imageLoader.getDefaults().getExtras().get(getHighSpeedVideoFpsRanges) != null;
    }
}
