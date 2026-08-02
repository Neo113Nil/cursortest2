package androidx.view.compose;

@androidx.view.NavDestinationDsl
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B:\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fB[\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\u001b\u0010\u0015\u001a\u0017\u0012\u0004\u0012\u00020\u0012\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0013¢\u0006\u0002\b\u00140\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR%\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/compose/DialogNavigator;", "navigator", "", "route", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Landroidx/navigation/compose/DialogNavigator;Ljava/lang/String;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/compose/DialogNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "instantiateDestination", "()Landroidx/navigation/compose/DialogNavigator$Destination;", "getHighSpeedVideoFpsRangesFor", "Landroidx/navigation/compose/DialogNavigator;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/window/DialogProperties;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DialogNavigatorDestinationBuilder extends androidx.view.NavDestinationBuilder<androidx.navigation.compose.DialogNavigator.Destination> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.window.DialogProperties getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.compose.DialogNavigator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogNavigatorDestinationBuilder(androidx.view.compose.DialogNavigator dialogNavigator, java.lang.String str, androidx.compose.ui.window.DialogProperties dialogProperties, kotlin.jvm.functions.Function3<? super androidx.view.NavBackStackEntry, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        super(dialogNavigator, str);
        this.getHighResolutionOutputSizeshNQ4ISI = dialogNavigator;
        this.getHighSpeedVideoSizes = dialogProperties;
        this.Camera2StreamConfigurationMap = function3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogNavigatorDestinationBuilder(androidx.view.compose.DialogNavigator dialogNavigator, kotlin.reflect.KClass<?> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, androidx.compose.ui.window.DialogProperties dialogProperties, kotlin.jvm.functions.Function3<? super androidx.view.NavBackStackEntry, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        super(dialogNavigator, kClass, map);
        this.getHighResolutionOutputSizeshNQ4ISI = dialogNavigator;
        this.getHighSpeedVideoSizes = dialogProperties;
        this.Camera2StreamConfigurationMap = function3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.NavDestinationBuilder
    public final androidx.navigation.compose.DialogNavigator.Destination instantiateDestination() {
        return new androidx.navigation.compose.DialogNavigator.Destination(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }
}
