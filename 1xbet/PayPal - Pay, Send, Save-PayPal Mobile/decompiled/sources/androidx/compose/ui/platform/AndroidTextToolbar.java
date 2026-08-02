package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jg\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR$\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "showMenu", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "hide", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/View;", "Landroid/view/ActionMode;", "getHighSpeedVideoFpsRanges", "Landroid/view/ActionMode;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "Landroidx/compose/ui/platform/TextToolbarStatus;", "p0", "status", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextToolbar implements androidx.compose.ui.platform.TextToolbar {
    public static final int $stable = 8;
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.view.ActionMode Camera2StreamConfigurationMap;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback getHighSpeedVideoFpsRanges = new androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        public final void getHighSpeedVideoFpsRanges() {
            androidx.compose.ui.platform.AndroidTextToolbar.this.Camera2StreamConfigurationMap = null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighSpeedVideoFpsRanges();
            return kotlin.Unit.INSTANCE;
        }

        {
            super(0);
        }
    }, null, null, null, null, null, null, 126, null);
    private androidx.compose.ui.platform.TextToolbarStatus status = androidx.compose.ui.platform.TextToolbarStatus.Hidden;

    public AndroidTextToolbar(android.view.View view) {
        this.getHighResolutionOutputSizeshNQ4ISI = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final androidx.compose.ui.platform.TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void showMenu(androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0<kotlin.Unit> onCopyRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onPasteRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onCutRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onSelectAllRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onAutofillRequested) {
        this.getHighSpeedVideoFpsRanges.setRect(rect);
        this.getHighSpeedVideoFpsRanges.setOnCopyRequested(onCopyRequested);
        this.getHighSpeedVideoFpsRanges.setOnCutRequested(onCutRequested);
        this.getHighSpeedVideoFpsRanges.setOnPasteRequested(onPasteRequested);
        this.getHighSpeedVideoFpsRanges.setOnSelectAllRequested(onSelectAllRequested);
        this.getHighSpeedVideoFpsRanges.setOnAutofillRequested(onAutofillRequested);
        android.view.ActionMode actionMode = this.Camera2StreamConfigurationMap;
        if (actionMode == null) {
            this.status = androidx.compose.ui.platform.TextToolbarStatus.Shown;
            this.Camera2StreamConfigurationMap = androidx.compose.ui.platform.TextToolbarHelperMethods.INSTANCE.startActionMode(this.getHighResolutionOutputSizeshNQ4ISI, new androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback(this.getHighSpeedVideoFpsRanges), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void showMenu(androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0<kotlin.Unit> onCopyRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onPasteRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onCutRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onSelectAllRequested) {
        showMenu(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested, null);
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void hide() {
        this.status = androidx.compose.ui.platform.TextToolbarStatus.Hidden;
        android.view.ActionMode actionMode = this.Camera2StreamConfigurationMap;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.Camera2StreamConfigurationMap = null;
    }
}
