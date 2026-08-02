package androidx.view.fragment;

@androidx.view.NavDestinationDsl
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000eBN\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0007\u0012\u001b\u0010\u0014\u001a\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u0010\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroidx/navigation/fragment/DialogFragmentNavigator;", "navigator", "", "id", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/DialogFragment;", "fragmentClass", "<init>", "(Landroidx/navigation/fragment/DialogFragmentNavigator;ILkotlin/reflect/KClass;)V", "", "route", "(Landroidx/navigation/fragment/DialogFragmentNavigator;Ljava/lang/String;Lkotlin/reflect/KClass;)V", "", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/fragment/DialogFragmentNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/reflect/KClass;)V", "build", "()Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/reflect/KClass;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DialogFragmentNavigatorDestinationBuilder extends androidx.view.NavDestinationBuilder<androidx.navigation.fragment.DialogFragmentNavigator.Destination> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.reflect.KClass<? extends androidx.fragment.app.DialogFragment> Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @kotlin.ReplaceWith(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public DialogFragmentNavigatorDestinationBuilder(androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator, int i, kotlin.reflect.KClass<? extends androidx.fragment.app.DialogFragment> kClass) {
        super(dialogFragmentNavigator, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogFragmentNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        this.Camera2StreamConfigurationMap = kClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator, java.lang.String str, kotlin.reflect.KClass<? extends androidx.fragment.app.DialogFragment> kClass) {
        super(dialogFragmentNavigator, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogFragmentNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        this.Camera2StreamConfigurationMap = kClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator, kotlin.reflect.KClass<? extends java.lang.Object> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.reflect.KClass<? extends androidx.fragment.app.DialogFragment> kClass2) {
        super(dialogFragmentNavigator, kClass, map);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogFragmentNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
        this.Camera2StreamConfigurationMap = kClass2;
    }

    @Override // androidx.view.NavDestinationBuilder
    public final androidx.navigation.fragment.DialogFragmentNavigator.Destination build() {
        androidx.navigation.fragment.DialogFragmentNavigator.Destination destination = (androidx.navigation.fragment.DialogFragmentNavigator.Destination) super.build();
        java.lang.String name2 = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) this.Camera2StreamConfigurationMap).getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        destination.setClassName(name2);
        return destination;
    }
}
