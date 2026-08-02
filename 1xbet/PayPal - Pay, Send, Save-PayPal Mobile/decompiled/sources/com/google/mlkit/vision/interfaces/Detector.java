package com.google.mlkit.vision.interfaces;

/* loaded from: classes.dex */
public interface Detector<DetectionResultT> extends java.io.Closeable, androidx.view.LifecycleObserver {
    public static final int TYPE_BARCODE_SCANNING = 1;
    public static final int TYPE_DOCUMENT_DETECTION = 10;
    public static final int TYPE_FACE_DETECTION = 2;
    public static final int TYPE_IMAGE_CAPTIONING = 9;
    public static final int TYPE_IMAGE_LABELING = 3;
    public static final int TYPE_OBJECT_DETECTION = 5;
    public static final int TYPE_POSE_DETECTION = 6;
    public static final int TYPE_SEGMENTATION = 7;
    public static final int TYPE_SELFIE_FACE_DETECTION = 8;
    public static final int TYPE_SUBJECT_SEGMENTATION = 11;
    public static final int TYPE_TEXT_RECOGNITION = 4;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface DetectorType {
    }

    int getDetectorType();

    com.google.android.gms.tasks.Task<DetectionResultT> process(android.graphics.Bitmap bitmap, int i);

    com.google.android.gms.tasks.Task<DetectionResultT> process(android.media.Image image, int i);

    com.google.android.gms.tasks.Task<DetectionResultT> process(android.media.Image image, int i, android.graphics.Matrix matrix);

    com.google.android.gms.tasks.Task<DetectionResultT> process(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, int i4);
}
