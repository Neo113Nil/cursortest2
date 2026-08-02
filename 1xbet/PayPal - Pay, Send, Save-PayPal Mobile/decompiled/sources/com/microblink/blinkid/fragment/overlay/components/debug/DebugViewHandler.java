package com.microblink.blinkid.fragment.overlay.components.debug;

/* loaded from: classes10.dex */
public class DebugViewHandler {
    private android.widget.TextView Camera2StreamConfigurationMap;
    private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler();

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(android.app.Activity activity, android.view.ViewGroup viewGroup, com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.widget.TextView textView = new android.widget.TextView(activity);
        this.Camera2StreamConfigurationMap = textView;
        textView.setGravity(21);
        this.Camera2StreamConfigurationMap.setBackgroundResource(com.microblink.blinkid.library.R.drawable.mb_rounded_border);
        this.Camera2StreamConfigurationMap.setPadding(6, 6, 6, 6);
        this.Camera2StreamConfigurationMap.setTextColor(activity.getResources().getColor(com.microblink.blinkid.library.R.color.mb_status_foreground));
        this.Camera2StreamConfigurationMap.setTextSize(14.0f);
        this.Camera2StreamConfigurationMap.setVisibility(0);
        if (viewGroup instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            layoutParams = layoutParams2;
        } else {
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            layoutParams = layoutParams3;
        }
        viewGroup.addView(this.Camera2StreamConfigurationMap, layoutParams);
        metadataCallbacks.setDebugTextCallback(new com.microblink.blinkid.metadata.text.DebugTextCallback() { // from class: com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler.1
            @Override // com.microblink.blinkid.metadata.text.DebugTextCallback
            public void onDebugText(final java.lang.String str) {
                com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler.this.getHighResolutionOutputSizeshNQ4ISI.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler.this.Camera2StreamConfigurationMap == null || com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler.this.Camera2StreamConfigurationMap.getText().equals(str)) {
                            return;
                        }
                        com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler.this.Camera2StreamConfigurationMap.setText(str);
                    }
                });
            }
        });
    }
}
