package com.microblink.blinkid.uisettings.options;

/* loaded from: classes10.dex */
public interface ScanUIEventListener extends android.os.Parcelable {
    void onDataMatchFailedDialogShown();

    void onDocumentUnsupportedDialogShown();

    void onFirstSideDone();

    void onScanBarcodeMessageShown();

    void onSecondSideScanTimeoutDialogShown();
}
