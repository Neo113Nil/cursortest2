package androidx.view.fragment;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/Pair;", "Landroid/view/View;", "", "sharedElements", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "FragmentNavigatorExtras", "([Lkotlin/Pair;)Landroidx/navigation/fragment/FragmentNavigator$Extras;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FragmentNavigatorExtrasKt {
    public static final androidx.navigation.fragment.FragmentNavigator.Extras FragmentNavigatorExtras(kotlin.Pair<? extends android.view.View, java.lang.String>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        androidx.navigation.fragment.FragmentNavigator.Extras.Builder builder = new androidx.navigation.fragment.FragmentNavigator.Extras.Builder();
        for (kotlin.Pair<? extends android.view.View, java.lang.String> pair : pairArr) {
            builder.addSharedElement(pair.component1(), pair.component2());
        }
        return builder.build();
    }
}
