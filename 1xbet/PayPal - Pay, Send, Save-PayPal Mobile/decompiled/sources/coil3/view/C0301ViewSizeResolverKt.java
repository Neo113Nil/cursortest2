package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "view", "", "subtractPadding", "Lcoil3/size/ViewSizeResolver;", "ViewSizeResolver", "(Landroid/view/View;Z)Lcoil3/size/ViewSizeResolver;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: coil3.size.ViewSizeResolverKt, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C0301ViewSizeResolverKt {
    public static /* synthetic */ coil3.view.ViewSizeResolver ViewSizeResolver$default(android.view.View view, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return ViewSizeResolver(view, z);
    }

    public static final <T extends android.view.View> coil3.view.ViewSizeResolver<T> ViewSizeResolver(T t, boolean z) {
        return new coil3.view.RealViewSizeResolver(t, z);
    }

    public static final <T extends android.view.View> coil3.view.ViewSizeResolver<T> ViewSizeResolver(T t) {
        return ViewSizeResolver$default(t, false, 2, null);
    }
}
