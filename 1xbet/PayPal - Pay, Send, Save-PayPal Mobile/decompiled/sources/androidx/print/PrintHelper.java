package androidx.print;

/* loaded from: classes7.dex */
public final class PrintHelper {
    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    static final boolean Camera2StreamConfigurationMap = true;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    static final boolean getHighSpeedVideoSizes = true;
    final android.content.Context getHighSpeedVideoFpsRanges;
    android.graphics.BitmapFactory.Options getHighSpeedVideoFpsRangesFor = null;
    final java.lang.Object getOutputFormats = new java.lang.Object();
    int getHighSpeedVideoSizesFor = 2;
    int getHighResolutionOutputSizeshNQ4ISI = 2;
    int getInputFormats = 1;

    public interface OnPrintFinishCallback {
        void onFinish();
    }

    public static boolean systemSupportsPrint() {
        return true;
    }

    public PrintHelper(android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = context;
    }

    public final void setScaleMode(int i) {
        this.getHighSpeedVideoSizesFor = i;
    }

    public final int getScaleMode() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final void setColorMode(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final int getColorMode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setOrientation(int i) {
        this.getInputFormats = i;
    }

    public final int getOrientation() {
        int i = this.getInputFormats;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final void printBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        printBitmap(str, bitmap, (androidx.print.PrintHelper.OnPrintFinishCallback) null);
    }

    public final void printBitmap(java.lang.String str, android.graphics.Bitmap bitmap, androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback) {
        android.print.PrintAttributes.MediaSize mediaSize;
        if (bitmap == null) {
            return;
        }
        android.print.PrintManager printManager = (android.print.PrintManager) this.getHighSpeedVideoFpsRanges.getSystemService("print");
        if (bitmap.getWidth() <= bitmap.getHeight()) {
            mediaSize = android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
        } else {
            mediaSize = android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        }
        printManager.print(str, new androidx.print.PrintHelper.PrintBitmapAdapter(str, this.getHighSpeedVideoSizesFor, bitmap, onPrintFinishCallback), new android.print.PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.getHighResolutionOutputSizeshNQ4ISI).build());
    }

    class PrintBitmapAdapter extends android.print.PrintDocumentAdapter {
        private final androidx.print.PrintHelper.OnPrintFinishCallback Camera2StreamConfigurationMap;
        private final android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private android.print.PrintAttributes getHighSpeedVideoFpsRangesFor;
        private final java.lang.String getOutputFormats;

        PrintBitmapAdapter(java.lang.String str, int i, android.graphics.Bitmap bitmap, androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback) {
            this.getOutputFormats = str;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = bitmap;
            this.Camera2StreamConfigurationMap = onPrintFinishCallback;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(android.print.PrintAttributes printAttributes, android.print.PrintAttributes printAttributes2, android.os.CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, android.os.Bundle bundle) {
            this.getHighSpeedVideoFpsRangesFor = printAttributes2;
            layoutResultCallback.onLayoutFinished(new android.print.PrintDocumentInfo.Builder(this.getOutputFormats).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(android.print.PageRange[] pageRangeArr, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            androidx.print.PrintHelper.this.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback = this.Camera2StreamConfigurationMap;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
        }
    }

    public final void printBitmap(java.lang.String str, android.net.Uri uri) throws java.io.FileNotFoundException {
        printBitmap(str, uri, (androidx.print.PrintHelper.OnPrintFinishCallback) null);
    }

    public final void printBitmap(java.lang.String str, android.net.Uri uri, androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback) throws java.io.FileNotFoundException {
        androidx.print.PrintHelper.PrintUriAdapter printUriAdapter = new androidx.print.PrintHelper.PrintUriAdapter(str, uri, onPrintFinishCallback, this.getHighSpeedVideoSizesFor);
        android.print.PrintManager printManager = (android.print.PrintManager) this.getHighSpeedVideoFpsRanges.getSystemService("print");
        android.print.PrintAttributes.Builder builder = new android.print.PrintAttributes.Builder();
        builder.setColorMode(this.getHighResolutionOutputSizeshNQ4ISI);
        int i = this.getInputFormats;
        if (i == 1 || i == 0) {
            builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i == 2) {
            builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, printUriAdapter, builder.build());
    }

    class PrintUriAdapter extends android.print.PrintDocumentAdapter {
        final int Camera2StreamConfigurationMap;
        android.print.PrintAttributes getHighResolutionOutputSizeshNQ4ISI;
        final androidx.print.PrintHelper.OnPrintFinishCallback getHighSpeedVideoFpsRanges;
        final android.net.Uri getHighSpeedVideoFpsRangesFor;
        android.graphics.Bitmap getHighSpeedVideoSizes = null;
        android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> getHighSpeedVideoSizesFor;
        final java.lang.String getOutputMinFrameDuration;

        PrintUriAdapter(java.lang.String str, android.net.Uri uri, androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback, int i) {
            this.getOutputMinFrameDuration = str;
            this.getHighSpeedVideoFpsRangesFor = uri;
            this.getHighSpeedVideoFpsRanges = onPrintFinishCallback;
            this.Camera2StreamConfigurationMap = i;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(final android.print.PrintAttributes printAttributes, final android.print.PrintAttributes printAttributes2, final android.os.CancellationSignal cancellationSignal, final android.print.PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, android.os.Bundle bundle) {
            synchronized (this) {
                this.getHighResolutionOutputSizeshNQ4ISI = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.getHighSpeedVideoSizes != null) {
                layoutResultCallback.onLayoutFinished(new android.print.PrintDocumentInfo.Builder(this.getOutputMinFrameDuration).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.getHighSpeedVideoSizesFor = new android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap>() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1
                    @Override // android.os.AsyncTask
                    protected /* synthetic */ android.graphics.Bitmap doInBackground(android.net.Uri[] uriArr) {
                        return getHighResolutionOutputSizeshNQ4ISI();
                    }

                    @Override // android.os.AsyncTask
                    protected /* synthetic */ void onCancelled(android.graphics.Bitmap bitmap) {
                        layoutResultCallback.onLayoutCancelled();
                        androidx.print.PrintHelper.PrintUriAdapter.this.getHighSpeedVideoSizesFor = null;
                    }

                    @Override // android.os.AsyncTask
                    protected /* synthetic */ void onPostExecute(android.graphics.Bitmap bitmap) {
                        android.print.PrintAttributes.MediaSize mediaSize;
                        android.graphics.Bitmap bitmap2 = bitmap;
                        super.onPostExecute(bitmap2);
                        if (bitmap2 != null && (!androidx.print.PrintHelper.getHighSpeedVideoSizes || androidx.print.PrintHelper.this.getInputFormats == 0)) {
                            synchronized (this) {
                                mediaSize = androidx.print.PrintHelper.PrintUriAdapter.this.getHighResolutionOutputSizeshNQ4ISI.getMediaSize();
                            }
                            if (mediaSize != null && mediaSize.isPortrait() != androidx.print.PrintHelper.getHighSpeedVideoFpsRanges(bitmap2)) {
                                android.graphics.Matrix matrix = new android.graphics.Matrix();
                                matrix.postRotate(90.0f);
                                bitmap2 = android.graphics.Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                            }
                        }
                        androidx.print.PrintHelper.PrintUriAdapter.this.getHighSpeedVideoSizes = bitmap2;
                        if (bitmap2 != null) {
                            layoutResultCallback.onLayoutFinished(new android.print.PrintDocumentInfo.Builder(androidx.print.PrintHelper.PrintUriAdapter.this.getOutputMinFrameDuration).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
                        } else {
                            layoutResultCallback.onLayoutFailed(null);
                        }
                        androidx.print.PrintHelper.PrintUriAdapter.this.getHighSpeedVideoSizesFor = null;
                    }

                    @Override // android.os.AsyncTask
                    protected void onPreExecute() {
                        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1.1
                            @Override // android.os.CancellationSignal.OnCancelListener
                            public void onCancel() {
                                androidx.print.PrintHelper.PrintUriAdapter.this.getHighResolutionOutputSizeshNQ4ISI();
                                cancel(false);
                            }
                        });
                    }

                    private android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI() {
                        try {
                            return androidx.print.PrintHelper.this.Camera2StreamConfigurationMap(androidx.print.PrintHelper.PrintUriAdapter.this.getHighSpeedVideoFpsRangesFor);
                        } catch (java.io.FileNotFoundException unused) {
                            return null;
                        }
                    }
                }.execute(new android.net.Uri[0]);
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            synchronized (androidx.print.PrintHelper.this.getOutputFormats) {
                if (androidx.print.PrintHelper.this.getHighSpeedVideoFpsRangesFor != null) {
                    androidx.print.PrintHelper.this.getHighSpeedVideoFpsRangesFor = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            getHighResolutionOutputSizeshNQ4ISI();
            android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> asyncTask = this.getHighSpeedVideoSizesFor;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            androidx.print.PrintHelper.OnPrintFinishCallback onPrintFinishCallback = this.getHighSpeedVideoFpsRanges;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
            android.graphics.Bitmap bitmap = this.getHighSpeedVideoSizes;
            if (bitmap != null) {
                bitmap.recycle();
                this.getHighSpeedVideoSizes = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(android.print.PageRange[] pageRangeArr, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            androidx.print.PrintHelper.this.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static boolean getHighSpeedVideoFpsRanges(android.graphics.Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    static android.graphics.Matrix getHighSpeedVideoSizes(int i, int i2, android.graphics.RectF rectF, int i3) {
        float min;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f = i;
        float width = rectF.width() / f;
        if (i3 == 2) {
            min = java.lang.Math.max(width, rectF.height() / i2);
        } else {
            min = java.lang.Math.min(width, rectF.height() / i2);
        }
        matrix.postScale(min, min);
        matrix.postTranslate((rectF.width() - (f * min)) / 2.0f, (rectF.height() - (i2 * min)) / 2.0f);
        return matrix;
    }

    final void getHighSpeedVideoFpsRangesFor(final android.print.PrintAttributes printAttributes, final int i, final android.graphics.Bitmap bitmap, final android.os.ParcelFileDescriptor parcelFileDescriptor, final android.os.CancellationSignal cancellationSignal, final android.print.PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        final android.print.PrintAttributes build;
        if (Camera2StreamConfigurationMap) {
            build = printAttributes;
        } else {
            android.print.PrintAttributes.Builder minMargins = new android.print.PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
            if (printAttributes.getColorMode() != 0) {
                minMargins.setColorMode(printAttributes.getColorMode());
            }
            if (printAttributes.getDuplexMode() != 0) {
                minMargins.setDuplexMode(printAttributes.getDuplexMode());
            }
            build = minMargins.setMinMargins(new android.print.PrintAttributes.Margins(0, 0, 0, 0)).build();
        }
        new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Throwable>() { // from class: androidx.print.PrintHelper.1
            @Override // android.os.AsyncTask
            protected /* synthetic */ java.lang.Throwable doInBackground(java.lang.Void[] voidArr) {
                return getHighSpeedVideoSizes();
            }

            @Override // android.os.AsyncTask
            protected /* synthetic */ void onPostExecute(java.lang.Throwable th) {
                java.lang.Throwable th2 = th;
                if (cancellationSignal.isCanceled()) {
                    writeResultCallback.onWriteCancelled();
                } else if (th2 == null) {
                    writeResultCallback.onWriteFinished(new android.print.PageRange[]{android.print.PageRange.ALL_PAGES});
                } else {
                    writeResultCallback.onWriteFailed(null);
                }
            }

            private java.lang.Throwable getHighSpeedVideoSizes() {
                android.graphics.RectF rectF;
                try {
                    if (cancellationSignal.isCanceled()) {
                        return null;
                    }
                    android.print.pdf.PrintedPdfDocument printedPdfDocument = new android.print.pdf.PrintedPdfDocument(androidx.print.PrintHelper.this.getHighSpeedVideoFpsRanges, build);
                    android.graphics.Bitmap highSpeedVideoFpsRangesFor = androidx.print.PrintHelper.getHighSpeedVideoFpsRangesFor(bitmap, build.getColorMode());
                    if (cancellationSignal.isCanceled()) {
                        return null;
                    }
                    try {
                        android.graphics.pdf.PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                        if (androidx.print.PrintHelper.Camera2StreamConfigurationMap) {
                            rectF = new android.graphics.RectF(startPage.getInfo().getContentRect());
                        } else {
                            android.print.pdf.PrintedPdfDocument printedPdfDocument2 = new android.print.pdf.PrintedPdfDocument(androidx.print.PrintHelper.this.getHighSpeedVideoFpsRanges, printAttributes);
                            android.graphics.pdf.PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                            android.graphics.RectF rectF2 = new android.graphics.RectF(startPage2.getInfo().getContentRect());
                            printedPdfDocument2.finishPage(startPage2);
                            printedPdfDocument2.close();
                            rectF = rectF2;
                        }
                        android.graphics.Matrix highSpeedVideoSizes = androidx.print.PrintHelper.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor.getWidth(), highSpeedVideoFpsRangesFor.getHeight(), rectF, i);
                        if (!androidx.print.PrintHelper.Camera2StreamConfigurationMap) {
                            highSpeedVideoSizes.postTranslate(rectF.left, rectF.top);
                            startPage.getCanvas().clipRect(rectF);
                        }
                        startPage.getCanvas().drawBitmap(highSpeedVideoFpsRangesFor, highSpeedVideoSizes, null);
                        printedPdfDocument.finishPage(startPage);
                        if (!cancellationSignal.isCanceled()) {
                            printedPdfDocument.writeTo(new java.io.FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                            printedPdfDocument.close();
                            android.os.ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                            if (parcelFileDescriptor2 != null) {
                                try {
                                    parcelFileDescriptor2.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                            if (highSpeedVideoFpsRangesFor != bitmap) {
                                highSpeedVideoFpsRangesFor.recycle();
                            }
                            return null;
                        }
                        printedPdfDocument.close();
                        android.os.ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptor;
                        if (parcelFileDescriptor3 != null) {
                            try {
                                parcelFileDescriptor3.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        if (highSpeedVideoFpsRangesFor != bitmap) {
                            highSpeedVideoFpsRangesFor.recycle();
                        }
                        return null;
                    } finally {
                    }
                } catch (java.lang.Throwable th) {
                    return th;
                }
            }
        }.execute(new java.lang.Void[0]);
    }

    final android.graphics.Bitmap Camera2StreamConfigurationMap(android.net.Uri uri) throws java.io.FileNotFoundException {
        android.graphics.BitmapFactory.Options options;
        if (uri == null || this.getHighSpeedVideoFpsRanges == null) {
            throw new java.lang.IllegalArgumentException("bad argument to getScaledBitmap");
        }
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        Camera2StreamConfigurationMap(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int max = java.lang.Math.max(i, i2);
            int i3 = 1;
            while (max > 3500) {
                max >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && java.lang.Math.min(i, i2) / i3 > 0) {
                synchronized (this.getOutputFormats) {
                    android.graphics.BitmapFactory.Options options3 = new android.graphics.BitmapFactory.Options();
                    this.getHighSpeedVideoFpsRangesFor = options3;
                    options3.inMutable = true;
                    this.getHighSpeedVideoFpsRangesFor.inSampleSize = i3;
                    options = this.getHighSpeedVideoFpsRangesFor;
                }
                try {
                    android.graphics.Bitmap Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(uri, options);
                    synchronized (this.getOutputFormats) {
                        this.getHighSpeedVideoFpsRangesFor = null;
                    }
                    return Camera2StreamConfigurationMap2;
                } catch (java.lang.Throwable th) {
                    synchronized (this.getOutputFormats) {
                        this.getHighSpeedVideoFpsRangesFor = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    private android.graphics.Bitmap Camera2StreamConfigurationMap(android.net.Uri uri, android.graphics.BitmapFactory.Options options) throws java.io.FileNotFoundException {
        android.content.Context context;
        java.lang.Throwable th;
        if (uri == null || (context = this.getHighSpeedVideoFpsRanges) == null) {
            throw new java.lang.IllegalArgumentException("bad argument to loadBitmap");
        }
        java.io.InputStream inputStream = null;
        try {
            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return decodeStream;
            } catch (java.lang.Throwable th2) {
                th = th2;
                inputStream = openInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        throw th;
                    } catch (java.io.IOException unused2) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    static android.graphics.Bitmap getHighSpeedVideoFpsRangesFor(android.graphics.Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
