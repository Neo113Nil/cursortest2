package androidx.camera.view.transform;

/* loaded from: classes6.dex */
public final class FileTransformFactory {
    private boolean Camera2StreamConfigurationMap;

    public final void setUsingExifOrientation(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public final boolean isUsingExifOrientation() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.camera.view.transform.OutputTransform getOutputTransform(android.content.ContentResolver contentResolver, android.net.Uri uri) throws java.io.IOException {
        java.io.InputStream openInputStream = contentResolver.openInputStream(uri);
        try {
            androidx.camera.view.transform.OutputTransform outputTransform = getOutputTransform(openInputStream);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return outputTransform;
        } catch (java.lang.Throwable th) {
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final androidx.camera.view.transform.OutputTransform getOutputTransform(java.io.File file) throws java.io.IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            androidx.camera.view.transform.OutputTransform outputTransform = getOutputTransform(fileInputStream);
            fileInputStream.close();
            return outputTransform;
        } catch (java.lang.Throwable th) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final androidx.camera.view.transform.OutputTransform getOutputTransform(java.io.InputStream inputStream) throws java.io.IOException {
        androidx.camera.core.impl.utils.Exif createFromInputStream = androidx.camera.core.impl.utils.Exif.createFromInputStream(inputStream);
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, createFromInputStream.getWidth(), createFromInputStream.getHeight());
        android.graphics.Matrix normalizedToBuffer = androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(rect);
        if (this.Camera2StreamConfigurationMap) {
            normalizedToBuffer.postConcat(androidx.camera.core.impl.utils.TransformUtils.getExifTransform(createFromInputStream.getOrientation(), createFromInputStream.getWidth(), createFromInputStream.getHeight()));
        }
        return new androidx.camera.view.transform.OutputTransform(normalizedToBuffer, androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect));
    }
}
