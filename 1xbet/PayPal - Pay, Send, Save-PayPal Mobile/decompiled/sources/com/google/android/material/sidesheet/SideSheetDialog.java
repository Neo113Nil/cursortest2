package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
public class SideSheetDialog extends com.google.android.material.sidesheet.SheetDialog<com.google.android.material.sidesheet.SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = com.google.android.material.R.attr.sideSheetDialogTheme;
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = com.google.android.material.R.style.Theme_Material3_Light_SideSheetDialog;

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getStateOnStart() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i) {
        super.setContentView(i);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(android.view.View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z) {
        super.setDismissWithSheetAnimationEnabled(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setSheetEdge(int i) {
        super.setSheetEdge(i);
    }

    public SideSheetDialog(android.content.Context context) {
        this(context, 0);
    }

    public SideSheetDialog(android.content.Context context, int i) {
        super(context, i, SIDE_SHEET_DIALOG_THEME_ATTR, SIDE_SHEET_DIALOG_DEFAULT_THEME_RES);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    void addSheetCancelOnHideCallback(com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> sheet) {
        sheet.addCallback(new com.google.android.material.sidesheet.SideSheetCallback() { // from class: com.google.android.material.sidesheet.SideSheetDialog.1
            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onSlide(android.view.View view, float f) {
            }

            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onStateChanged(android.view.View view, int i) {
                if (i == 5) {
                    com.google.android.material.sidesheet.SideSheetDialog.this.cancel();
                }
            }
        });
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getLayoutResId() {
        return com.google.android.material.R.layout.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    int getDialogId() {
        return com.google.android.material.R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> getBehaviorFromSheet(android.widget.FrameLayout frameLayout) {
        return com.google.android.material.sidesheet.SideSheetBehavior.from(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public com.google.android.material.sidesheet.Sheet<com.google.android.material.sidesheet.SideSheetCallback> getBehavior() {
        com.google.android.material.sidesheet.Sheet behavior = super.getBehavior();
        if (!(behavior instanceof com.google.android.material.sidesheet.SideSheetBehavior)) {
            throw new java.lang.IllegalStateException("The view is not associated with SideSheetBehavior");
        }
        return (com.google.android.material.sidesheet.SideSheetBehavior) behavior;
    }
}
