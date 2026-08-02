package androidx.core.app;

/* loaded from: classes3.dex */
public abstract class SharedElementCallback {
    private android.graphics.Matrix getHighSpeedVideoFpsRangesFor;

    /* loaded from: classes7.dex */
    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    public void onMapSharedElements(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, android.view.View> map) {
    }

    public void onRejectSharedElements(java.util.List<android.view.View> list) {
    }

    public void onSharedElementEnd(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
    }

    public void onSharedElementStart(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, java.util.List<android.view.View> list3) {
    }

    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF) {
        android.graphics.Bitmap bitmap;
        if (view instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            android.graphics.drawable.Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    bitmap = null;
                } else {
                    float min = java.lang.Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                    if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && min == 1.0f) {
                        bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                    } else {
                        int i = (int) (intrinsicWidth * min);
                        int i2 = (int) (intrinsicHeight * min);
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
                        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                        android.graphics.Rect bounds = drawable.getBounds();
                        int i3 = bounds.left;
                        int i4 = bounds.top;
                        int i5 = bounds.right;
                        int i6 = bounds.bottom;
                        drawable.setBounds(0, 0, i, i2);
                        drawable.draw(canvas);
                        drawable.setBounds(i3, i4, i5, i6);
                        bitmap = createBitmap;
                    }
                }
                if (bitmap != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap);
                    bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                    if (imageView.getScaleType() == android.widget.ImageView.ScaleType.MATRIX) {
                        android.graphics.Matrix imageMatrix = imageView.getImageMatrix();
                        float[] fArr = new float[9];
                        imageMatrix.getValues(fArr);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                    }
                    return bundle;
                }
            }
        }
        int round = java.lang.Math.round(rectF.width());
        int round2 = java.lang.Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min2 = java.lang.Math.min(1.0f, 1048576.0f / (round * round2));
        int i7 = (int) (round * min2);
        int i8 = (int) (round2 * min2);
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new android.graphics.Matrix();
        }
        this.getHighSpeedVideoFpsRangesFor.set(matrix);
        this.getHighSpeedVideoFpsRangesFor.postTranslate(-rectF.left, -rectF.top);
        this.getHighSpeedVideoFpsRangesFor.postScale(min2, min2);
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(i7, i8, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap2);
        canvas2.concat(this.getHighSpeedVideoFpsRangesFor);
        view.draw(canvas2);
        return createBitmap2;
    }

    public android.view.View onCreateSnapshotView(android.content.Context context, android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(android.widget.ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView.getScaleType() == android.widget.ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
            }
            return imageView;
        }
        if (!(parcelable instanceof android.graphics.Bitmap)) {
            return null;
        }
        android.widget.ImageView imageView2 = new android.widget.ImageView(context);
        imageView2.setImageBitmap((android.graphics.Bitmap) parcelable);
        return imageView2;
    }

    public void onSharedElementsArrived(java.util.List<java.lang.String> list, java.util.List<android.view.View> list2, androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        onSharedElementsReadyListener.onSharedElementsReady();
    }
}
