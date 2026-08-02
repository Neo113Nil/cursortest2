package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"(\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/OverscrollConfiguration;", "LocalOverscrollConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOverscrollConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOverscrollConfiguration$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverscrollConfiguration_androidKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.OverscrollConfiguration> LocalOverscrollConfiguration = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.OverscrollConfiguration_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.foundation.OverscrollConfiguration highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.OverscrollConfiguration_androidKt.getHighSpeedVideoFpsRanges();
            return highSpeedVideoFpsRanges;
        }
    }, 1, null);

    @kotlin.Deprecated(message = "Providing `OverscrollConfiguration` through `LocalOverscrollConfiguration` to disable / configure overscroll has been replaced with `LocalOverscrollFactory` and `rememberPlatformOverscrollFactory`. To disable overscroll, instead of `LocalOverscrollConfiguration provides null`, use `LocalOverscrollFactory provides null`. To change the glow color / padding, instead of `LocalOverscrollConfiguration provides OverscrollConfiguration(myColor, myPadding)`, use `LocalOverscrollFactory provides rememberPlatformOverscrollFactory(myColor, myPadding)`", replaceWith = @kotlin.ReplaceWith(expression = "LocalOverscrollFactory", imports = {"androidx.compose.foundation.LocalOverscrollFactory"}))
    public static /* synthetic */ void getLocalOverscrollConfiguration$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.OverscrollConfiguration> getLocalOverscrollConfiguration() {
        return LocalOverscrollConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.OverscrollConfiguration getHighSpeedVideoFpsRanges() {
        return new androidx.compose.foundation.OverscrollConfiguration(0L, null, 3, null);
    }
}
