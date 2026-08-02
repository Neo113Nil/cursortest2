package androidx.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/navigation/NavController;", "", "p0", "p1", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Landroidx/navigation/NavGraph;", "createGraph", "(Landroidx/navigation/NavController;IILkotlin/jvm/functions/Function1;)Landroidx/navigation/NavGraph;", "Landroid/content/Intent;", "Landroidx/navigation/NavDeepLinkRequest;", "NavDeepLinkRequest", "(Landroid/content/Intent;)Landroidx/navigation/NavDeepLinkRequest;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavControllerKt")
/* loaded from: classes.dex */
final /* synthetic */ class NavControllerKt__NavController_androidKt {
    public static /* synthetic */ androidx.view.NavGraph createGraph$default(androidx.view.NavController navController, int i, int i2, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavGraphBuilder navGraphBuilder = new androidx.view.NavGraphBuilder(navController.getNavigatorProvider(), i, i2);
        function1.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @kotlin.Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final androidx.view.NavGraph createGraph(androidx.view.NavController navController, int i, int i2, kotlin.jvm.functions.Function1<? super androidx.view.NavGraphBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavGraphBuilder navGraphBuilder = new androidx.view.NavGraphBuilder(navController.getNavigatorProvider(), i, i2);
        function1.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final androidx.view.NavDeepLinkRequest NavDeepLinkRequest(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new androidx.view.NavDeepLinkRequest(intent.getData(), intent.getAction(), intent.getType());
    }
}
