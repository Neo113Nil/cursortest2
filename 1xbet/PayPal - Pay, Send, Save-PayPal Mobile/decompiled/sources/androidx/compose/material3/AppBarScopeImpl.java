package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J@\u0010\u000e\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00112\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0018\u001a\u00020\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/material3/AppBarScopeImpl;", "Landroidx/compose/material3/AppBarScope;", "Landroidx/compose/material3/AppBarItemProvider;", "<init>", "()V", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/runtime/Composable;", "icon", "", "label", "", "enabled", "clickableItem", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "toggleableItem", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)V", "appbarContent", "Landroidx/compose/material3/AppBarMenuState;", "menuContent", "customItem", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "", "Landroidx/compose/material3/AppBarItem;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "", "getItemsCount", "()I", "itemsCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppBarScopeImpl implements androidx.compose.material3.AppBarScope, androidx.compose.material3.AppBarItemProvider {
    public static final int $stable = 8;
    private final java.util.List<androidx.compose.material3.AppBarItem> items = new java.util.ArrayList();

    @Override // androidx.compose.material3.AppBarItemProvider
    public final java.util.List<androidx.compose.material3.AppBarItem> getItems() {
        return this.items;
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public final int getItemsCount() {
        return getItems().size();
    }

    @Override // androidx.compose.material3.AppBarScope
    public final void clickableItem(kotlin.jvm.functions.Function0<kotlin.Unit> onClick, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> icon, java.lang.String label, boolean enabled) {
        getItems().add(new androidx.compose.material3.ClickableAppBarItem(onClick, icon, enabled, label));
    }

    @Override // androidx.compose.material3.AppBarScope
    public final void toggleableItem(boolean checked, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> icon, java.lang.String label, boolean enabled) {
        getItems().add(new androidx.compose.material3.ToggleableAppBarItem(checked, onCheckedChange, icon, enabled, label));
    }

    @Override // androidx.compose.material3.AppBarScope
    public final void customItem(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> appbarContent, kotlin.jvm.functions.Function3<? super androidx.compose.material3.AppBarMenuState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> menuContent) {
        getItems().add(new androidx.compose.material3.CustomAppBarItem(appbarContent, menuContent));
    }
}
