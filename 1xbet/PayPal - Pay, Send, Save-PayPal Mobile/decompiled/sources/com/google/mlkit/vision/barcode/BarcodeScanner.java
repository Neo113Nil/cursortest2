package com.google.mlkit.vision.barcode;

/* loaded from: classes.dex */
public interface BarcodeScanner extends com.google.mlkit.vision.interfaces.Detector<java.util.List<com.google.mlkit.vision.barcode.common.Barcode>>, com.google.android.gms.common.api.OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    void close();

    com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.common.Barcode>> process(com.google.android.odml.image.MlImage mlImage);

    com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.common.Barcode>> process(com.google.mlkit.vision.common.InputImage inputImage);
}
