package androidx.view;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "p0", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "", "Lkotlin/ExtensionFunctionType;", "p1", "Landroidx/navigation/NamedNavArgument;", "navArgument", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NamedNavArgument;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NamedNavArgumentKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NamedNavArgumentKt__NamedNavArgumentKt {
    public static final androidx.view.NamedNavArgument navArgument(java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.view.NavArgumentBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavArgumentBuilder navArgumentBuilder = new androidx.view.NavArgumentBuilder();
        function1.invoke(navArgumentBuilder);
        return new androidx.view.NamedNavArgument(str, navArgumentBuilder.build());
    }
}
