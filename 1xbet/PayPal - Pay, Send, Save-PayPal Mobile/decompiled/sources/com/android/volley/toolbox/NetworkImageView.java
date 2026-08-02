package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class NetworkImageView extends android.widget.ImageView {
    private android.graphics.Bitmap Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges;
    private android.graphics.Bitmap getHighSpeedVideoFpsRangesFor;
    private android.graphics.drawable.Drawable getHighSpeedVideoSizes;
    private com.android.volley.toolbox.ImageLoader.ImageContainer getInputFormats;
    private int getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private com.android.volley.toolbox.ImageLoader getOutputMinFrameDuration;

    public NetworkImageView(android.content.Context context) {
        this(context, null);
    }

    public NetworkImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageUrl(java.lang.String str, com.android.volley.toolbox.ImageLoader imageLoader) {
        com.android.volley.toolbox.Threads.getHighSpeedVideoFpsRangesFor();
        this.getOutputFormats = str;
        this.getOutputMinFrameDuration = imageLoader;
        getHighResolutionOutputSizeshNQ4ISI(false);
    }

    public void setDefaultImageResId(int i) {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public void setDefaultImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = drawable;
    }

    public void setDefaultImageBitmap(android.graphics.Bitmap bitmap) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap = bitmap;
    }

    public void setErrorImageResId(int i) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        this.getInputSizeshNQ4ISI = i;
    }

    public void setErrorImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.getInputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = drawable;
    }

    public void setErrorImageBitmap(android.graphics.Bitmap bitmap) {
        this.getInputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = bitmap;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        boolean z2;
        boolean z3;
        int width = getWidth();
        int height = getHeight();
        android.widget.ImageView.ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            z2 = getLayoutParams().width == -2;
            z3 = getLayoutParams().height == -2;
        } else {
            z2 = false;
            z3 = false;
        }
        boolean z4 = z2 && z3;
        if (width == 0 && height == 0 && !z4) {
            return;
        }
        if (android.text.TextUtils.isEmpty(this.getOutputFormats)) {
            com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer = this.getInputFormats;
            if (imageContainer != null) {
                imageContainer.cancelRequest();
                this.getInputFormats = null;
            }
            getHighSpeedVideoSizes();
            return;
        }
        com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer2 = this.getInputFormats;
        if (imageContainer2 != null && imageContainer2.getRequestUrl() != null) {
            if (this.getInputFormats.getRequestUrl().equals(this.getOutputFormats)) {
                return;
            }
            this.getInputFormats.cancelRequest();
            getHighSpeedVideoSizes();
        }
        if (z2) {
            width = 0;
        }
        this.getInputFormats = this.getOutputMinFrameDuration.get(this.getOutputFormats, new com.android.volley.toolbox.NetworkImageView.AnonymousClass1(z), width, z3 ? 0 : height, scaleType);
    }

    /* renamed from: com.android.volley.toolbox.NetworkImageView$1, reason: invalid class name */
    class AnonymousClass1 implements com.android.volley.toolbox.ImageLoader.ImageListener {
        final /* synthetic */ boolean Camera2StreamConfigurationMap;

        AnonymousClass1(boolean z) {
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(com.android.volley.VolleyError volleyError) {
            if (com.android.volley.toolbox.NetworkImageView.this.getInputSizeshNQ4ISI == 0) {
                if (com.android.volley.toolbox.NetworkImageView.this.getHighSpeedVideoSizes == null) {
                    if (com.android.volley.toolbox.NetworkImageView.this.getHighSpeedVideoFpsRangesFor != null) {
                        com.android.volley.toolbox.NetworkImageView networkImageView = com.android.volley.toolbox.NetworkImageView.this;
                        networkImageView.setImageBitmap(networkImageView.getHighSpeedVideoFpsRangesFor);
                        return;
                    }
                    return;
                }
                com.android.volley.toolbox.NetworkImageView networkImageView2 = com.android.volley.toolbox.NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.getHighSpeedVideoSizes);
                return;
            }
            com.android.volley.toolbox.NetworkImageView networkImageView3 = com.android.volley.toolbox.NetworkImageView.this;
            networkImageView3.setImageResource(networkImageView3.getInputSizeshNQ4ISI);
        }

        @Override // com.android.volley.toolbox.ImageLoader.ImageListener
        public void onResponse(final com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer, boolean z) {
            if (z && this.Camera2StreamConfigurationMap) {
                com.android.volley.toolbox.NetworkImageView.this.post(new java.lang.Runnable() { // from class: com.android.volley.toolbox.NetworkImageView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.android.volley.toolbox.NetworkImageView.AnonymousClass1.this.onResponse(imageContainer, false);
                    }
                });
                return;
            }
            if (imageContainer.getBitmap() == null) {
                if (com.android.volley.toolbox.NetworkImageView.this.getHighResolutionOutputSizeshNQ4ISI == 0) {
                    if (com.android.volley.toolbox.NetworkImageView.this.getHighSpeedVideoFpsRanges == null) {
                        if (com.android.volley.toolbox.NetworkImageView.this.Camera2StreamConfigurationMap != null) {
                            com.android.volley.toolbox.NetworkImageView networkImageView = com.android.volley.toolbox.NetworkImageView.this;
                            networkImageView.setImageBitmap(networkImageView.Camera2StreamConfigurationMap);
                            return;
                        }
                        return;
                    }
                    com.android.volley.toolbox.NetworkImageView networkImageView2 = com.android.volley.toolbox.NetworkImageView.this;
                    networkImageView2.setImageDrawable(networkImageView2.getHighSpeedVideoFpsRanges);
                    return;
                }
                com.android.volley.toolbox.NetworkImageView networkImageView3 = com.android.volley.toolbox.NetworkImageView.this;
                networkImageView3.setImageResource(networkImageView3.getHighResolutionOutputSizeshNQ4ISI);
                return;
            }
            com.android.volley.toolbox.NetworkImageView.this.setImageBitmap(imageContainer.getBitmap());
        }
    }

    private void getHighSpeedVideoSizes() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            setImageResource(i);
            return;
        }
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoFpsRanges;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        android.graphics.Bitmap bitmap = this.Camera2StreamConfigurationMap;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getHighResolutionOutputSizeshNQ4ISI(true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer = this.getInputFormats;
        if (imageContainer != null) {
            imageContainer.cancelRequest();
            setImageBitmap(null);
            this.getInputFormats = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
