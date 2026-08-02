package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001JB\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJP\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0015\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00052\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0002\b\u0005H&¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/AppBarScope;", "", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/runtime/Composable;", "icon", "", "label", "", "enabled", "clickableItem", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "toggleableItem", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)V", "appbarContent", "Landroidx/compose/material3/AppBarMenuState;", "menuContent", "customItem", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/material3/AppBarColumnScope;", "Landroidx/compose/material3/AppBarColumnScopeImpl;", "Landroidx/compose/material3/AppBarRowScope;", "Landroidx/compose/material3/AppBarRowScopeImpl;", "Landroidx/compose/material3/AppBarScopeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppBarScope {
    void clickableItem(kotlin.jvm.functions.Function0<kotlin.Unit> onClick, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> icon, java.lang.String label, boolean enabled);

    void customItem(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> appbarContent, kotlin.jvm.functions.Function3<? super androidx.compose.material3.AppBarMenuState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> menuContent);

    void toggleableItem(boolean checked, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> icon, java.lang.String label, boolean enabled);

    static /* synthetic */ void clickableItem$default(androidx.compose.material3.AppBarScope appBarScope, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickableItem");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        appBarScope.clickableItem(function0, function2, str, z);
    }

    static /* synthetic */ void toggleableItem$default(androidx.compose.material3.AppBarScope appBarScope, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleableItem");
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        appBarScope.toggleableItem(z, function1, function2, str, z2);
    }
}
