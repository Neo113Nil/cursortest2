package androidx.compose.ui.platform.actionmodecallback;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0018\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u001f\u0010 J/\u0010$\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001e2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u00100R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u00100R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b3\u0010(\"\u0004\b4\u00100R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u00100R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u00100"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "Lkotlin/Function0;", "", "onActionModeDestroy", "Landroidx/compose/ui/geometry/Rect;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "onDestroyActionMode", "()V", "updateMenuItems$ui", "(Landroid/view/Menu;)V", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "addMenuItem$ui", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;)V", "p0", "p1", "p2", "getHighSpeedVideoFpsRanges", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "getOnCopyRequested", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "getOnPasteRequested", "setOnPasteRequested", "getOnCutRequested", "setOnCutRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "getOnAutofillRequested", "setOnAutofillRequested"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onActionModeDestroy;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onAutofillRequested;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCopyRequested;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCutRequested;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onPasteRequested;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onSelectAllRequested;
    private androidx.compose.ui.geometry.Rect rect;

    public TextActionModeCallback(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05, kotlin.jvm.functions.Function0<kotlin.Unit> function06) {
        this.onActionModeDestroy = function0;
        this.rect = rect;
        this.onCopyRequested = function02;
        this.onPasteRequested = function03;
        this.onCutRequested = function04;
        this.onSelectAllRequested = function05;
        this.onAutofillRequested = function06;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public /* synthetic */ TextActionModeCallback(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, kotlin.jvm.functions.Function0 function06, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? androidx.compose.ui.geometry.Rect.INSTANCE.getZero() : rect, (i & 4) != 0 ? null : function02, (i & 8) != 0 ? null : function03, (i & 16) != 0 ? null : function04, (i & 32) != 0 ? null : function05, (i & 64) != 0 ? null : function06);
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

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final void setOnAutofillRequested(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onAutofillRequested = function0;
    }

    public final boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
        if (menu == null) {
            throw new java.lang.IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (mode == null) {
            throw new java.lang.IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            addMenuItem$ui(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null) {
            return true;
        }
        addMenuItem$ui(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Autofill);
        return true;
    }

    public final boolean onPrepareActionMode(android.view.ActionMode mode, android.view.Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui(menu);
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
        } else if (itemId == androidx.compose.ui.platform.actionmodecallback.MenuItemOption.SelectAll.getId()) {
            kotlin.jvm.functions.Function0<kotlin.Unit> function04 = this.onSelectAllRequested;
            if (function04 != null) {
                function04.invoke();
            }
        } else {
            if (itemId != androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Autofill.getId()) {
                return false;
            }
            kotlin.jvm.functions.Function0<kotlin.Unit> function05 = this.onAutofillRequested;
            if (function05 != null) {
                function05.invoke();
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

    public final void updateMenuItems$ui(android.view.Menu menu) {
        getHighSpeedVideoFpsRanges(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Copy, this.onCopyRequested);
        getHighSpeedVideoFpsRanges(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Paste, this.onPasteRequested);
        getHighSpeedVideoFpsRanges(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Cut, this.onCutRequested);
        getHighSpeedVideoFpsRanges(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.SelectAll, this.onSelectAllRequested);
        getHighSpeedVideoFpsRanges(menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public final void addMenuItem$ui(android.view.Menu menu, androidx.compose.ui.platform.actionmodecallback.MenuItemOption item) {
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    private final void getHighSpeedVideoFpsRanges(android.view.Menu p0, androidx.compose.ui.platform.actionmodecallback.MenuItemOption p1, kotlin.jvm.functions.Function0<kotlin.Unit> p2) {
        if (p2 != null && p0.findItem(p1.getId()) == null) {
            addMenuItem$ui(p0, p1);
        } else {
            if (p2 != null || p0.findItem(p1.getId()) == null) {
                return;
            }
            p0.removeItem(p1.getId());
        }
    }

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
