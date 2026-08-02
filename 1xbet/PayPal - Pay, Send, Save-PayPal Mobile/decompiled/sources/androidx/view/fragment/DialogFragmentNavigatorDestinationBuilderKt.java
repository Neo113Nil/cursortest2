package androidx.view.fragment;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aD\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\f\u001a(\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u0006\u0010\u000f\u001aD\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0010\u001aK\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0012\u0018\u0001*\u00020\u0011*\u00020\u00022\u001d\b\u0002\u0010\u0017\u001a\u0017\u0012\u0004\u0012\u00020\u0014\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0015¢\u0006\u0002\b\u00160\u0013H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0018\u001ag\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0012\u0018\u0001*\u00020\u0011*\u00020\u00022\u001d\b\u0002\u0010\u0017\u001a\u0017\u0012\u0004\u0012\u00020\u0014\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0015¢\u0006\u0002\b\u00160\u00132\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/fragment/app/DialogFragment;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/navigation/NavGraphBuilder;", "", "id", "", androidx.view.compose.DialogNavigator.NAME, "(Landroidx/navigation/NavGraphBuilder;I)V", "Lkotlin/Function1;", "Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "builder", "(Landroidx/navigation/NavGraphBuilder;ILkotlin/jvm/functions/Function1;)V", "", "route", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "T", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DialogFragmentNavigatorDestinationBuilderKt {
    @kotlin.Deprecated(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @kotlin.ReplaceWith(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends androidx.fragment.app.DialogFragment> void dialog(androidx.view.NavGraphBuilder navGraphBuilder, int i, kotlin.jvm.functions.Function1<? super androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator = (androidx.view.fragment.DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.fragment.DialogFragmentNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i, (kotlin.reflect.KClass<? extends androidx.fragment.app.DialogFragment>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.fragment.app.DialogFragment.class));
        function1.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.DialogFragment> void dialog(androidx.view.NavGraphBuilder navGraphBuilder, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator = (androidx.view.fragment.DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.fragment.DialogFragmentNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, str, (kotlin.reflect.KClass<? extends androidx.fragment.app.DialogFragment>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.fragment.app.DialogFragment.class));
        function1.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(androidx.view.NavGraphBuilder navGraphBuilder, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator = (androidx.view.fragment.DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.fragment.DialogFragmentNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        navGraphBuilder.destination(new androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, orCreateKotlinClass, map, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.fragment.app.DialogFragment.class)));
    }

    public static /* synthetic */ void dialog$default(androidx.view.NavGraphBuilder navGraphBuilder, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator = (androidx.view.fragment.DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.fragment.DialogFragmentNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, orCreateKotlinClass, map, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.fragment.app.DialogFragment.class));
        function1.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.DialogFragment, T> void dialog(androidx.view.NavGraphBuilder navGraphBuilder, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator = (androidx.view.fragment.DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.fragment.DialogFragmentNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, orCreateKotlinClass, map, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.fragment.app.DialogFragment.class));
        function1.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    @kotlin.Deprecated(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @kotlin.ReplaceWith(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends androidx.fragment.app.DialogFragment> void dialog(androidx.view.NavGraphBuilder navGraphBuilder, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator = (androidx.view.fragment.DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.fragment.DialogFragmentNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        navGraphBuilder.destination(new androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i, (kotlin.reflect.KClass<? extends androidx.fragment.app.DialogFragment>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.fragment.app.DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.DialogFragment> void dialog(androidx.view.NavGraphBuilder navGraphBuilder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator = (androidx.view.fragment.DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.fragment.DialogFragmentNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        navGraphBuilder.destination(new androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, str, (kotlin.reflect.KClass<? extends androidx.fragment.app.DialogFragment>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.fragment.app.DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.DialogFragment, T> void dialog(androidx.view.NavGraphBuilder navGraphBuilder, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        androidx.view.fragment.DialogFragmentNavigator dialogFragmentNavigator = (androidx.view.fragment.DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.fragment.DialogFragmentNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER);
        navGraphBuilder.destination(new androidx.view.fragment.DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, orCreateKotlinClass, map, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.fragment.app.DialogFragment.class)));
    }
}
