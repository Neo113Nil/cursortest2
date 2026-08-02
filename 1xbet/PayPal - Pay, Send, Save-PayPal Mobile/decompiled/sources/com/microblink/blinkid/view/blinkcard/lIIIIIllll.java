package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class lIIIIIllll implements android.text.TextWatcher {
    public final /* synthetic */ com.microblink.blinkid.view.blinkcard.LabeledEditText llIIlIlIIl;

    public lIIIIIllll(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText) {
        this.llIIlIlIIl = labeledEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        com.microblink.blinkid.entities.recognizers.blinkcard.Issuer determineIssuerFromCardNumberPrefix;
        com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText = this.llIIlIlIIl;
        determineIssuerFromCardNumberPrefix = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardUtils.determineIssuerFromCardNumberPrefix(labeledEditText.getOutputMinFrameDuration.getText().toString().replaceAll(" ", ""));
        com.microblink.blinkid.view.blinkcard.LabeledEditText.Camera2StreamConfigurationMap(labeledEditText, determineIssuerFromCardNumberPrefix);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
