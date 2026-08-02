package androidx.view;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a[\u0010\b\u001a\u00020\u0005\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\f*\u00020\u00002\u001d\b\u0002\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "", "p0", "Lkotlin/Function1;", "Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "", "Lkotlin/ExtensionFunctionType;", "p1", "activity", "(Landroidx/navigation/NavGraphBuilder;ILkotlin/jvm/functions/Function1;)V", "", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "T", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/ActivityNavigatorDestinationBuilderKt")
/* loaded from: classes.dex */
final /* synthetic */ class ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt {
    @kotlin.Deprecated(message = "Use routes to build your ActivityDestination instead", replaceWith = @kotlin.ReplaceWith(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(androidx.view.NavGraphBuilder navGraphBuilder, int i, kotlin.jvm.functions.Function1<? super androidx.view.ActivityNavigatorDestinationBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new androidx.view.ActivityNavigatorDestinationBuilder((androidx.view.ActivityNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.ActivityNavigator.class), i);
        function1.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(androidx.view.NavGraphBuilder navGraphBuilder, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.view.ActivityNavigatorDestinationBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new androidx.view.ActivityNavigatorDestinationBuilder((androidx.view.ActivityNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.ActivityNavigator.class), str);
        function1.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void activity$default(androidx.view.NavGraphBuilder navGraphBuilder, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.ActivityNavigator activityNavigator = (androidx.view.ActivityNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.ActivityNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        androidx.view.ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new androidx.view.ActivityNavigatorDestinationBuilder(activityNavigator, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), map);
        function1.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <T> void activity(androidx.view.NavGraphBuilder navGraphBuilder, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map, kotlin.jvm.functions.Function1<? super androidx.view.ActivityNavigatorDestinationBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.ActivityNavigator activityNavigator = (androidx.view.ActivityNavigator) navGraphBuilder.getProvider().getNavigator(androidx.view.ActivityNavigator.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        androidx.view.ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new androidx.view.ActivityNavigatorDestinationBuilder(activityNavigator, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), map);
        function1.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}
