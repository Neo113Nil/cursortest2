package com.caverock.androidsvg;

/* loaded from: classes7.dex */
public class SVGImageView extends android.widget.ImageView {
    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    private com.caverock.androidsvg.SVG Camera2StreamConfigurationMap;
    private com.caverock.androidsvg.RenderOptions getHighSpeedVideoSizes;

    static {
        try {
            getHighResolutionOutputSizeshNQ4ISI = android.view.View.class.getMethod("setLayerType", java.lang.Integer.TYPE, android.graphics.Paint.class);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    public SVGImageView(android.content.Context context) {
        super(context);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = new com.caverock.androidsvg.RenderOptions();
    }

    public SVGImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = new com.caverock.androidsvg.RenderOptions();
        getHighSpeedVideoFpsRangesFor(attributeSet, 0);
    }

    public SVGImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = new com.caverock.androidsvg.RenderOptions();
        getHighSpeedVideoFpsRangesFor(attributeSet, i);
    }

    private void getHighSpeedVideoFpsRangesFor(android.util.AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, com.caverock.androidsvg.R.styleable.SVGImageView, i, 0);
        try {
            java.lang.String string = obtainStyledAttributes.getString(com.caverock.androidsvg.R.styleable.SVGImageView_css);
            if (string != null) {
                this.getHighSpeedVideoSizes.css(string);
            }
            int resourceId = obtainStyledAttributes.getResourceId(com.caverock.androidsvg.R.styleable.SVGImageView_svg, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            java.lang.String string2 = obtainStyledAttributes.getString(com.caverock.androidsvg.R.styleable.SVGImageView_svg);
            if (string2 != null) {
                if (getHighSpeedVideoFpsRangesFor(android.net.Uri.parse(string2))) {
                    return;
                }
                if (getHighSpeedVideoFpsRanges(string2)) {
                    return;
                }
                try {
                    this.Camera2StreamConfigurationMap = com.caverock.androidsvg.SVG.getFromString(string2);
                    getHighResolutionOutputSizeshNQ4ISI();
                } catch (com.caverock.androidsvg.SVGParseException unused) {
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setSVG(com.caverock.androidsvg.SVG svg) {
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("Null value passed to setSVG()");
        }
        this.Camera2StreamConfigurationMap = svg;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public void setSVG(com.caverock.androidsvg.SVG svg, java.lang.String str) {
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("Null value passed to setSVG()");
        }
        this.Camera2StreamConfigurationMap = svg;
        this.getHighSpeedVideoSizes.css(str);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public void setCSS(java.lang.String str) {
        this.getHighSpeedVideoSizes.css(str);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        new com.caverock.androidsvg.SVGImageView.LoadResourceTask(getContext(), i).execute(new java.lang.Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        getHighSpeedVideoFpsRangesFor(uri);
    }

    public void setImageAsset(java.lang.String str) {
        getHighSpeedVideoFpsRanges(str);
    }

    private boolean getHighSpeedVideoFpsRangesFor(android.net.Uri uri) {
        byte b = 0;
        try {
            new com.caverock.androidsvg.SVGImageView.LoadURITask(this, b).execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (java.io.FileNotFoundException unused) {
            return false;
        }
    }

    private boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        byte b = 0;
        try {
            new com.caverock.androidsvg.SVGImageView.LoadURITask(this, b).execute(getContext().getAssets().open(str));
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    class LoadResourceTask extends android.os.AsyncTask<java.lang.Integer, java.lang.Integer, com.caverock.androidsvg.SVG> {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private android.content.Context getHighSpeedVideoFpsRanges;

        @Override // android.os.AsyncTask
        protected /* synthetic */ com.caverock.androidsvg.SVG doInBackground(java.lang.Integer[] numArr) {
            return Camera2StreamConfigurationMap();
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ void onPostExecute(com.caverock.androidsvg.SVG svg) {
            com.caverock.androidsvg.SVGImageView.this.Camera2StreamConfigurationMap = svg;
            com.caverock.androidsvg.SVGImageView.this.getHighResolutionOutputSizeshNQ4ISI();
        }

        LoadResourceTask(android.content.Context context, int i) {
            this.getHighSpeedVideoFpsRanges = context;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        private com.caverock.androidsvg.SVG Camera2StreamConfigurationMap() {
            try {
                return com.caverock.androidsvg.SVG.getFromResource(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
            } catch (com.caverock.androidsvg.SVGParseException e) {
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                new java.lang.Object[]{java.lang.Integer.valueOf(i), e.getMessage()};
                return null;
            }
        }
    }

    class LoadURITask extends android.os.AsyncTask<java.io.InputStream, java.lang.Integer, com.caverock.androidsvg.SVG> {
        private LoadURITask() {
        }

        /* synthetic */ LoadURITask(com.caverock.androidsvg.SVGImageView sVGImageView, byte b) {
            this();
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ com.caverock.androidsvg.SVG doInBackground(java.io.InputStream[] inputStreamArr) {
            return Camera2StreamConfigurationMap(inputStreamArr);
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ void onPostExecute(com.caverock.androidsvg.SVG svg) {
            com.caverock.androidsvg.SVGImageView.this.Camera2StreamConfigurationMap = svg;
            com.caverock.androidsvg.SVGImageView.this.getHighResolutionOutputSizeshNQ4ISI();
        }

        private static com.caverock.androidsvg.SVG Camera2StreamConfigurationMap(java.io.InputStream... inputStreamArr) {
            try {
                try {
                    return com.caverock.androidsvg.SVG.getFromInputStream(inputStreamArr[0]);
                } catch (com.caverock.androidsvg.SVGParseException e) {
                    e.getMessage();
                    try {
                        inputStreamArr[0].close();
                        return null;
                    } catch (java.io.IOException unused) {
                        return null;
                    }
                }
            } finally {
                try {
                    inputStreamArr[0].close();
                } catch (java.io.IOException unused2) {
                }
            }
        }
    }

    private void getHighSpeedVideoSizes() {
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            return;
        }
        try {
            getHighResolutionOutputSizeshNQ4ISI.invoke(this, java.lang.Integer.valueOf(android.view.View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new android.view.View(getContext()))), null);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI() {
        com.caverock.androidsvg.SVG svg = this.Camera2StreamConfigurationMap;
        if (svg == null) {
            return;
        }
        android.graphics.Picture renderToPicture = svg.renderToPicture(this.getHighSpeedVideoSizes);
        getHighSpeedVideoSizes();
        setImageDrawable(new android.graphics.drawable.PictureDrawable(renderToPicture));
    }
}
