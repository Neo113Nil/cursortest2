package androidx.compose.ui.platform.actionmodecallback;

/* compiled from: TextActionModeCallback.android.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J(\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J\u001a\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001e\u001a\u0004\u0018\u00010'J\u001a\u0010(\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010)\u001a\u00020\u0004J\u001a\u0010*\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0015\u0010+\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b,R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0010R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "onActionModeDestroy", "Lkotlin/Function0;", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "getOnCopyRequested", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "getOnCutRequested", "setOnCutRequested", "getOnPasteRequested", "setOnPasteRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "addMenuItem", "menu", "Landroid/view/Menu;", "item", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "addMenuItem$ui_release", "addOrRemoveMenuItem", "callback", "onActionItemClicked", "", com.ironsource.X3.a.t, "Landroid/view/ActionMode;", "Landroid/view/MenuItem;", "onCreateActionMode", "onDestroyActionMode", "onPrepareActionMode", "updateMenuItems", "updateMenuItems$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onActionModeDestroy;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCopyRequested;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCutRequested;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onPasteRequested;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onSelectAllRequested;
    private androidx.compose.ui.geometry.Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TextActionModeCallback(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05) {
        this.onActionModeDestroy = function0;
        this.rect = rect;
        this.onCopyRequested = function02;
        this.onPasteRequested = function03;
        this.onCutRequested = function04;
        this.onSelectAllRequested = function05;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public /* synthetic */ TextActionModeCallback(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? androidx.compose.ui.geometry.Rect.INSTANCE.getZero() : rect, (i & 4) != 0 ? null : function02, (i & 8) != 0 ? null : function03, (i & 16) != 0 ? null : function04, (i & 32) != 0 ? null : function05);
    }

    public final androidx.compose.ui.geometry.Rect getRect() {
        return this.rect;
    }

    public final void setRect(androidx.compose.ui.geometry.Rect rect) {
        this.rect = rect;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final void setOnCopyRequested(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final void setOnPasteRequested(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    public final void setOnCutRequested(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onCutRequested = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final void setOnSelectAllRequested(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
        if (menu == null) {
            throw new java.lang.IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (mode == null) {
            throw new java.lang.IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui_release(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui_release(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui_release(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested == null) {
            return true;
        }
        addMenuItem$ui_release(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.SelectAll);
        return true;
    }

    public final boolean onPrepareActionMode(android.view.ActionMode mode, android.view.Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final boolean onActionItemClicked(android.view.ActionMode mode, android.view.MenuItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(item);
        int itemId = item.getItemId();
        if (itemId == androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Copy.getId()) {
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Paste.getId()) {
            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onPasteRequested;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Cut.getId()) {
            kotlin.jvm.functions.Function0<kotlin.Unit> function03 = this.onCutRequested;
            if (function03 != null) {
                function03.invoke();
            }
        } else {
            if (itemId != androidx.compose.ui.platform.actionmodecallback.MenuItemOption.SelectAll.getId()) {
                return false;
            }
            kotlin.jvm.functions.Function0<kotlin.Unit> function04 = this.onSelectAllRequested;
            if (function04 != null) {
                function04.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final void onDestroyActionMode() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onActionModeDestroy;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void updateMenuItems$ui_release(android.view.Menu menu) {
        addOrRemoveMenuItem(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.SelectAll, this.onSelectAllRequested);
    }

    public final void addMenuItem$ui_release(android.view.Menu menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption item) {
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    private final void addOrRemoveMenuItem(android.view.Menu menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption item, kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            addMenuItem$ui_release(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }
}
