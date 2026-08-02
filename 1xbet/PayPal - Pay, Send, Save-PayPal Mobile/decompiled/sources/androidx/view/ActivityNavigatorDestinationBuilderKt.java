package androidx.view;

@kotlin.Metadata(d1 = {"androidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    @kotlin.Deprecated(message = "Use routes to build your ActivityDestination instead", replaceWith = @kotlin.ReplaceWith(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(androidx.view.NavGraphBuilder navGraphBuilder, int i, kotlin.jvm.functions.Function1<? super androidx.view.ActivityNavigatorDestinationBuilder, kotlin.Unit> function1) {
        androidx.view.ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt.activity(navGraphBuilder, i, function1);
    }

    public static final void activity(androidx.view.NavGraphBuilder navGraphBuilder, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.view.ActivityNavigatorDestinationBuilder, kotlin.Unit> function1) {
        androidx.view.ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt.activity(navGraphBuilder, str, function1);
    }
}
