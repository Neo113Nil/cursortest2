package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "", "Lkotlin/ExtensionFunctionType;", "optionsBuilder", "Landroidx/navigation/NavOptions;", "navOptions", "(Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NavOptions;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavOptionsBuilderKt {
    public static final androidx.view.NavOptions navOptions(kotlin.jvm.functions.Function1<? super androidx.view.NavOptionsBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.NavOptionsBuilder navOptionsBuilder = new androidx.view.NavOptionsBuilder();
        function1.invoke(navOptionsBuilder);
        return navOptionsBuilder.build$navigation_common_release();
    }
}
