package androidx.compose.material;

/* compiled from: SnackbarHost.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/FadeInFadeOutState;", "T", "", "()V", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "(Ljava/lang/Object;)V", com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/material/FadeInFadeOutAnimationItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "scope", "Landroidx/compose/runtime/RecomposeScope;", "getScope", "()Landroidx/compose/runtime/RecomposeScope;", "setScope", "(Landroidx/compose/runtime/RecomposeScope;)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class FadeInFadeOutState<T> {
    private java.lang.Object current = new java.lang.Object();
    private java.util.List<androidx.compose.material.FadeInFadeOutAnimationItem<T>> items = new java.util.ArrayList();
    private androidx.compose.runtime.RecomposeScope scope;

    public final java.lang.Object getCurrent() {
        return this.current;
    }

    public final void setCurrent(java.lang.Object obj) {
        this.current = obj;
    }

    public final java.util.List<androidx.compose.material.FadeInFadeOutAnimationItem<T>> getItems() {
        return this.items;
    }

    public final void setItems(java.util.List<androidx.compose.material.FadeInFadeOutAnimationItem<T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    public final androidx.compose.runtime.RecomposeScope getScope() {
        return this.scope;
    }

    public final void setScope(androidx.compose.runtime.RecomposeScope recomposeScope) {
        this.scope = recomposeScope;
    }
}
