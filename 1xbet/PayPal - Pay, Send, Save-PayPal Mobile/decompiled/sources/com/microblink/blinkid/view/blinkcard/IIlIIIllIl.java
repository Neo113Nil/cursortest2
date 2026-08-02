package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class IIlIIIllIl implements com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener {
    public final /* synthetic */ com.microblink.blinkid.view.blinkcard.LabeledEditText llIIlIlIIl;

    public IIlIIIllIl(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText) {
        this.llIIlIlIIl = labeledEditText;
    }

    @Override // com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener
    public final void onValidationStateUpdate(com.microblink.blinkid.view.blinkcard.FieldValidationState fieldValidationState) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        java.lang.String highSpeedVideoFpsRanges = com.microblink.blinkid.view.blinkcard.LabeledEditText.getHighSpeedVideoFpsRanges(this.llIIlIlIIl, fieldValidationState);
        this.llIIlIlIIl.getHighSpeedVideoSizesFor = fieldValidationState;
        if (highSpeedVideoFpsRanges != null) {
            textView2 = this.llIIlIlIIl.Camera2StreamConfigurationMap;
            textView2.setVisibility(0);
            textView3 = this.llIIlIlIIl.Camera2StreamConfigurationMap;
            textView3.setText(highSpeedVideoFpsRanges);
        } else {
            textView = this.llIIlIlIIl.Camera2StreamConfigurationMap;
            textView.setVisibility(8);
        }
        this.llIIlIlIIl.getHighSpeedVideoFpsRangesFor();
        this.llIIlIlIIl.getHighResolutionOutputSizeshNQ4ISI();
    }
}
