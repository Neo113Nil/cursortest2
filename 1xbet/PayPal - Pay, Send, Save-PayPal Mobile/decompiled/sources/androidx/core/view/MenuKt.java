package androidx.core.view;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a-\u0010\u0013\u001a\u00020\n*\u00020\u00002\u0017\u0010\u0012\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a8\u0010\u0016\u001a\u00020\n*\u00020\u00002\"\u0010\u0012\u001a\u001e\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0011\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\n0\u0015H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001c\"\u0016\u0010\u001f\u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030 *\u00020\u00008G¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "get", "(Landroid/view/Menu;I)Landroid/view/MenuItem;", "item", "", "contains", "(Landroid/view/Menu;Landroid/view/MenuItem;)Z", "", "minusAssign", "(Landroid/view/Menu;Landroid/view/MenuItem;)V", "isEmpty", "(Landroid/view/Menu;)Z", "isNotEmpty", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "action", "forEach", "(Landroid/view/Menu;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/Menu;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "(Landroid/view/Menu;)Ljava/util/Iterator;", "removeItemAt", "(Landroid/view/Menu;I)V", "getSize", "(Landroid/view/Menu;)I", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlin/sequences/Sequence;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "children"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MenuKt {
    public static final android.view.MenuItem get(android.view.Menu menu, int i) {
        return menu.getItem(i);
    }

    public static final boolean contains(android.view.Menu menu, android.view.MenuItem menuItem) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void minusAssign(android.view.Menu menu, android.view.MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final int getSize(android.view.Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(android.view.Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(android.view.Menu menu) {
        return menu.size() != 0;
    }

    public static final void forEach(android.view.Menu menu, kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> function1) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(menu.getItem(i));
        }
    }

    public static final void forEachIndexed(android.view.Menu menu, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.MenuItem, kotlin.Unit> function2) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(java.lang.Integer.valueOf(i), menu.getItem(i));
        }
    }

    public static final java.util.Iterator<android.view.MenuItem> iterator(android.view.Menu menu) {
        return new androidx.core.view.MenuKt$iterator$1(menu);
    }

    public static final void removeItemAt(android.view.Menu menu, int i) {
        android.view.MenuItem item = menu.getItem(i);
        if (item == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        menu.removeItem(item.getItemId());
    }

    public static final kotlin.sequences.Sequence<android.view.MenuItem> getChildren(final android.view.Menu menu) {
        return new kotlin.sequences.Sequence<android.view.MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<android.view.MenuItem> iterator() {
                return androidx.core.view.MenuKt.iterator(menu);
            }
        };
    }
}
