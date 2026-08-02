package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
public abstract class SideSheetCallback implements com.google.android.material.sidesheet.SheetCallback {
    void onLayout(android.view.View view) {
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(android.view.View view, float f);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(android.view.View view, int i);
}
