package androidx.compose.ui.platform;

/* compiled from: AndroidTextToolbar.android.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016JP\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroid/view/View;)V", "actionMode", "Landroid/view/ActionMode;", "<set-?>", "Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "textActionModeCallback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "hide", "", "showMenu", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextToolbar implements androidx.compose.ui.platform.TextToolbar {
    public static final int $stable = 8;
    private android.view.ActionMode actionMode;
    private final android.view.View view;
    private final androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback textActionModeCallback = new androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            invoke2();
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            androidx.compose.ui.platform.AndroidTextToolbar.this.actionMode = null;
        }
    }, null, null, null, null, null, 62, null);
    private androidx.compose.ui.platform.TextToolbarStatus status = androidx.compose.ui.platform.TextToolbarStatus.Hidden;

    public AndroidTextToolbar(android.view.View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public androidx.compose.ui.platform.TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0<kotlin.Unit> onCopyRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onPasteRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onCutRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onSelectAllRequested) {
        android.view.ActionMode startActionMode;
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(onCopyRequested);
        this.textActionModeCallback.setOnCutRequested(onCutRequested);
        this.textActionModeCallback.setOnPasteRequested(onPasteRequested);
        this.textActionModeCallback.setOnSelectAllRequested(onSelectAllRequested);
        android.view.ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            if (actionMode != null) {
                actionMode.invalidate();
            }
        } else {
            this.status = androidx.compose.ui.platform.TextToolbarStatus.Shown;
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                startActionMode = androidx.compose.ui.platform.TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback(this.textActionModeCallback), 1);
            } else {
                startActionMode = this.view.startActionMode(new androidx.compose.ui.platform.actionmodecallback.PrimaryTextActionModeCallback(this.textActionModeCallback));
            }
            this.actionMode = startActionMode;
        }
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = androidx.compose.ui.platform.TextToolbarStatus.Hidden;
        android.view.ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }
}
