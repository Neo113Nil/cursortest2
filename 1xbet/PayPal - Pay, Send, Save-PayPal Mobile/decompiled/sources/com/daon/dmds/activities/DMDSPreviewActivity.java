package com.daon.dmds.activities;

/* loaded from: classes7.dex */
public class DMDSPreviewActivity extends androidx.appcompat.app.AppCompatActivity implements com.daon.dmds.views.DMDSImageView.PreviewImageListener {
    com.daon.dmds.models.DMDSQuadrangle getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    com.daon.dmds.views.DMDSImageView getHighSpeedVideoSizes;
    com.daon.dmds.models.DMDSOptions getHighSpeedVideoSizesFor;
    android.widget.TextView getInputFormats;
    com.daon.dmds.models.DMDSResult getInputSizeshNQ4ISI;
    android.graphics.Bitmap getOutputFormats;
    private com.daon.dmds.models.DMDSQuadrangle getOutputMinFrameDurationlomOqCM;
    private com.daon.dmds.views.ZoomImageView getOutputSizes;
    private android.os.Handler getOutputSizeshNQ4ISI;
    private com.daon.dmds.views.ZoomImageView getOutputStallDuration;
    float getHighResolutionOutputSizeshNQ4ISI = 0.0f;
    float getOutputStallDurationlomOqCM = 0.0f;
    float Camera2StreamConfigurationMap = 1.0f;
    float getOutputMinFrameDuration = 1.0f;

    public static void startActivityForResults(android.app.Activity activity, com.daon.dmds.models.DMDSResult dMDSResult, com.daon.dmds.models.DMDSOptions dMDSOptions, java.lang.Boolean bool, int i) {
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.daon.dmds.activities.DMDSPreviewActivity.class);
        intent.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_RESULTS, dMDSResult);
        intent.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_OPTIONS, dMDSOptions);
        intent.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_ENABLE_CROPPING, bool);
        activity.startActivityForResult(intent, i);
    }

    @Override // com.daon.dmds.views.DMDSImageView.PreviewImageListener
    public void enableCrop(final boolean z) {
        if (this.getInputFormats != null) {
            this.getOutputSizeshNQ4ISI.post(new java.lang.Runnable() { // from class: com.daon.dmds.activities.DMDSPreviewActivity$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.daon.dmds.activities.DMDSPreviewActivity dMDSPreviewActivity = com.daon.dmds.activities.DMDSPreviewActivity.this;
                    boolean z2 = z;
                    dMDSPreviewActivity.getInputFormats.setEnabled(z2);
                    dMDSPreviewActivity.getInputFormats.setTextColor(z2 ? dMDSPreviewActivity.getHighSpeedVideoSizesFor.getUiOptions().getCancelButtonTextColor() : androidx.core.content.ContextCompat.getColor(dMDSPreviewActivity.getApplicationContext(), com.daon.dmds.R.color.cancel_text_color));
                }
            });
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_CANCEL_SCANNING, false);
        setResult(0, intent);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        super.onCreate(bundle);
        setContentView(com.daon.dmds.R.layout.activity_dmdspreview);
        this.getOutputSizeshNQ4ISI = new android.os.Handler();
        android.content.Intent intent = getIntent();
        this.getHighSpeedVideoSizesFor = (com.daon.dmds.models.DMDSOptions) intent.getParcelableExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_OPTIONS);
        this.getHighSpeedVideoFpsRangesFor = intent.getBooleanExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_ENABLE_CROPPING, false);
        com.daon.dmds.models.DMDSResult dMDSResult = (com.daon.dmds.models.DMDSResult) intent.getParcelableExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_RESULTS);
        this.getInputSizeshNQ4ISI = dMDSResult;
        if (dMDSResult != null) {
            bitmap = dMDSResult.getDocument().getProcessedImage();
            bitmap2 = this.getInputSizeshNQ4ISI.getDocument().getProcessedBackImage();
            this.getOutputFormats = this.getInputSizeshNQ4ISI.getDocument().getUnprocessedImage();
            this.getOutputMinFrameDurationlomOqCM = this.getInputSizeshNQ4ISI.getDocument().getProcessedDocumentCoordinates();
        } else {
            bitmap = null;
            bitmap2 = null;
        }
        this.getInputFormats = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_crop_accept);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_crop_retake);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_crop_cancel);
        this.getHighSpeedVideoSizes = (com.daon.dmds.views.DMDSImageView) findViewById(com.daon.dmds.R.id.image_preview);
        com.daon.dmds.views.DMDSImageView dMDSImageView = (com.daon.dmds.views.DMDSImageView) findViewById(com.daon.dmds.R.id.image_preview_back);
        this.getOutputStallDuration = (com.daon.dmds.views.ZoomImageView) findViewById(com.daon.dmds.R.id.zoom_left);
        com.daon.dmds.views.ZoomImageView zoomImageView = (com.daon.dmds.views.ZoomImageView) findViewById(com.daon.dmds.R.id.zoom_right);
        this.getOutputSizes = zoomImageView;
        zoomImageView.setVisibility(8);
        this.getHighSpeedVideoSizes.setBackgroundColor(androidx.core.content.ContextCompat.getColor(getApplicationContext(), com.daon.dmds.R.color.dmds_black));
        this.getHighSpeedVideoSizes.setCropBorderColor(this.getHighSpeedVideoSizesFor.getUiOptions().getOverlayColor());
        this.getHighSpeedVideoSizes.setZoomListener(this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.daon.dmds.R.id.cropping_screen_buttons);
        linearLayout.getLayoutParams().height = (int) (com.daon.dmds.utils.DMDSDocumentUtils.getScreenDimensions(getBaseContext()).y * (getResources().getConfiguration().orientation == 2 ? 0.15f : 0.1015f));
        linearLayout.setBackgroundColor(this.getHighSpeedVideoSizesFor.getUiOptions().getBottomBarColor());
        this.getInputFormats.setTextColor(this.getHighSpeedVideoSizesFor.getUiOptions().getCancelButtonTextColor());
        textView.setTextColor(this.getHighSpeedVideoSizesFor.getUiOptions().getCancelButtonTextColor());
        textView2.setTextColor(this.getHighSpeedVideoSizesFor.getUiOptions().getCancelButtonTextColor());
        textView2.setVisibility(this.getHighSpeedVideoSizesFor.getUiOptions().isShowCancelButton() ? 0 : 8);
        if (this.getOutputMinFrameDurationlomOqCM == null) {
            this.getHighSpeedVideoFpsRangesFor = false;
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            new android.os.Handler().postDelayed(new com.daon.dmds.activities.DMDSPreviewActivity$$ExternalSyntheticLambda0(this), 200L);
        }
        if (bitmap2 != null) {
            dMDSImageView.setVisibility(0);
        }
        if (this.getHighSpeedVideoFpsRangesFor || bitmap == null) {
            bitmap = this.getOutputFormats;
        }
        this.getHighSpeedVideoSizes.setImageBitmap(com.daon.dmds.utils.DMDSDocumentUtils.scaleBitmap(bitmap));
        android.graphics.Bitmap scaleBitmap = com.daon.dmds.utils.DMDSDocumentUtils.scaleBitmap(bitmap2);
        if (scaleBitmap != null) {
            dMDSImageView.setImageBitmap(scaleBitmap);
        }
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.daon.dmds.activities.DMDSPreviewActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.daon.dmds.activities.DMDSPreviewActivity dMDSPreviewActivity = com.daon.dmds.activities.DMDSPreviewActivity.this;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_CANCEL_SCANNING, false);
                dMDSPreviewActivity.setResult(0, intent2);
                dMDSPreviewActivity.finish();
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.daon.dmds.activities.DMDSPreviewActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.daon.dmds.activities.DMDSPreviewActivity dMDSPreviewActivity = com.daon.dmds.activities.DMDSPreviewActivity.this;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_CANCEL_SCANNING, true);
                dMDSPreviewActivity.setResult(0, intent2);
                dMDSPreviewActivity.finish();
            }
        });
        this.getInputFormats.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.daon.dmds.activities.DMDSPreviewActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.daon.dmds.activities.DMDSPreviewActivity dMDSPreviewActivity = com.daon.dmds.activities.DMDSPreviewActivity.this;
                if (dMDSPreviewActivity.getHighSpeedVideoFpsRangesFor) {
                    com.daon.dmds.models.DMDSQuadrangle selectionRect = dMDSPreviewActivity.getHighSpeedVideoSizes.getSelectionRect();
                    com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle = dMDSPreviewActivity.getHighSpeedVideoFpsRanges;
                    if (dMDSQuadrangle != null && selectionRect != null) {
                        dMDSQuadrangle.setUpperLeft(new android.graphics.Point((int) ((selectionRect.getUpperLeft().x - dMDSPreviewActivity.getOutputStallDurationlomOqCM) / dMDSPreviewActivity.getOutputMinFrameDuration), (int) ((selectionRect.getUpperLeft().y - dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI) / dMDSPreviewActivity.Camera2StreamConfigurationMap)));
                        dMDSPreviewActivity.getHighSpeedVideoFpsRanges.setLowerRight(new android.graphics.Point((int) ((selectionRect.getLowerRight().x - dMDSPreviewActivity.getOutputStallDurationlomOqCM) / dMDSPreviewActivity.getOutputMinFrameDuration), (int) ((selectionRect.getLowerRight().y - dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI) / dMDSPreviewActivity.Camera2StreamConfigurationMap)));
                        dMDSPreviewActivity.getHighSpeedVideoFpsRanges.setUpperRight(new android.graphics.Point((int) ((selectionRect.getUpperRight().x - dMDSPreviewActivity.getOutputStallDurationlomOqCM) / dMDSPreviewActivity.getOutputMinFrameDuration), (int) ((selectionRect.getUpperRight().y - dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI) / dMDSPreviewActivity.Camera2StreamConfigurationMap)));
                        dMDSPreviewActivity.getHighSpeedVideoFpsRanges.setLowerLeft(new android.graphics.Point((int) ((selectionRect.getLowerLeft().x - dMDSPreviewActivity.getOutputStallDurationlomOqCM) / dMDSPreviewActivity.getOutputMinFrameDuration), (int) ((selectionRect.getLowerLeft().y - dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI) / dMDSPreviewActivity.Camera2StreamConfigurationMap)));
                    }
                    com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle2 = dMDSPreviewActivity.getHighSpeedVideoFpsRanges;
                    dMDSPreviewActivity.getInputSizeshNQ4ISI.getDocument().setProcessedImage(com.daon.dmds.utils.DMDSDocumentUtils.cropPoly(dMDSPreviewActivity.getOutputFormats, dMDSQuadrangle2));
                    dMDSPreviewActivity.getInputSizeshNQ4ISI.getDocument().setProcessedDocumentCoordinates(dMDSQuadrangle2);
                    dMDSPreviewActivity.getInputSizeshNQ4ISI.getDocument().setUnprocessedImage(dMDSPreviewActivity.getOutputFormats);
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_RESULTS, dMDSPreviewActivity.getInputSizeshNQ4ISI);
                dMDSPreviewActivity.setResult(-1, intent2);
                dMDSPreviewActivity.finish();
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.getOutputFormats = null;
        this.getOutputStallDuration.setCurrentBitmap(null);
        this.getOutputSizes.setCurrentBitmap(null);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.getHighSpeedVideoSizesFor = (com.daon.dmds.models.DMDSOptions) bundle.getParcelable(com.daon.dmds.views.DaonDocumentScanView.DMDS_OPTIONS);
        boolean z = bundle.getBoolean(com.daon.dmds.views.DaonDocumentScanView.DMDS_ENABLE_CROPPING);
        this.getHighSpeedVideoFpsRangesFor = z;
        if (z) {
            new android.os.Handler().postDelayed(new com.daon.dmds.activities.DMDSPreviewActivity$$ExternalSyntheticLambda0(this), 200L);
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(com.daon.dmds.views.DaonDocumentScanView.DMDS_OPTIONS, this.getHighSpeedVideoSizesFor);
        bundle.putBoolean(com.daon.dmds.views.DaonDocumentScanView.DMDS_ENABLE_CROPPING, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.daon.dmds.views.DMDSImageView.PreviewImageListener
    public void zoomBitmap(android.graphics.Bitmap bitmap, android.graphics.Point point) {
        if (bitmap == null || point == null) {
            this.getOutputSizes.setVisibility(4);
            this.getOutputStallDuration.setVisibility(4);
            return;
        }
        if (point.x >= 250 || point.y >= 250) {
            this.getOutputSizes.setVisibility(4);
            this.getOutputStallDuration.setVisibility(0);
        } else {
            this.getOutputStallDuration.setVisibility(4);
            this.getOutputSizes.setVisibility(0);
        }
        this.getOutputStallDuration.setCurrentBitmap(bitmap);
        this.getOutputSizes.setCurrentBitmap(bitmap);
    }

    /* renamed from: $r8$lambda$T0zHS-rQC98DmEYUv5VU3GJYfyo, reason: not valid java name */
    public static /* synthetic */ void m9985$r8$lambda$T0zHSrQC98DmEYUv5VU3GJYfyo(com.daon.dmds.activities.DMDSPreviewActivity dMDSPreviewActivity) {
        int i;
        int i2;
        int width = dMDSPreviewActivity.getOutputFormats.getWidth();
        int height = dMDSPreviewActivity.getOutputFormats.getHeight();
        int width2 = dMDSPreviewActivity.getHighSpeedVideoSizes.getWidth();
        int height2 = dMDSPreviewActivity.getHighSpeedVideoSizes.getHeight();
        if (width > height) {
            i2 = (int) (width2 * (height / width));
            i = width2;
        } else {
            i = (int) (height2 * (width / height));
            i2 = height2;
        }
        if (width2 > height2) {
            i = (int) (height2 * (width / height));
            i2 = height2;
        }
        dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI = (height2 - i2) / 2.0f;
        dMDSPreviewActivity.getOutputStallDurationlomOqCM = (width2 - i) / 2.0f;
        dMDSPreviewActivity.Camera2StreamConfigurationMap = i2 / height;
        dMDSPreviewActivity.getOutputMinFrameDuration = i / width;
        com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle = new com.daon.dmds.models.DMDSQuadrangle(new android.graphics.Point((int) ((dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getUpperLeft().x * dMDSPreviewActivity.getOutputMinFrameDuration) + dMDSPreviewActivity.getOutputStallDurationlomOqCM), (int) ((dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getUpperLeft().y * dMDSPreviewActivity.Camera2StreamConfigurationMap) + dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI)), new android.graphics.Point((int) ((dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getUpperRight().x * dMDSPreviewActivity.getOutputMinFrameDuration) + dMDSPreviewActivity.getOutputStallDurationlomOqCM), (int) ((dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getUpperRight().y * dMDSPreviewActivity.Camera2StreamConfigurationMap) + dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI)), new android.graphics.Point((int) ((dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getLowerLeft().x * dMDSPreviewActivity.getOutputMinFrameDuration) + dMDSPreviewActivity.getOutputStallDurationlomOqCM), (int) ((dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getLowerLeft().y * dMDSPreviewActivity.Camera2StreamConfigurationMap) + dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI)), new android.graphics.Point((int) ((dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getLowerRight().x * dMDSPreviewActivity.getOutputMinFrameDuration) + dMDSPreviewActivity.getOutputStallDurationlomOqCM), (int) ((dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getLowerRight().y * dMDSPreviewActivity.Camera2StreamConfigurationMap) + dMDSPreviewActivity.getHighResolutionOutputSizeshNQ4ISI)));
        dMDSPreviewActivity.getHighSpeedVideoSizes.setRect(dMDSQuadrangle.getUpperLeft(), dMDSQuadrangle.getUpperRight(), dMDSQuadrangle.getLowerLeft(), dMDSQuadrangle.getLowerRight());
        dMDSPreviewActivity.getHighSpeedVideoFpsRanges = new com.daon.dmds.models.DMDSQuadrangle(dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getUpperLeft(), dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getUpperRight(), dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getLowerLeft(), dMDSPreviewActivity.getOutputMinFrameDurationlomOqCM.getLowerRight());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
