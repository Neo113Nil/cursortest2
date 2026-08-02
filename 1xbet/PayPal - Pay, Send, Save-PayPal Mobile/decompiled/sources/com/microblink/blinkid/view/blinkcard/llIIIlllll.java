package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class llIIIlllll implements com.microblink.blinkid.view.blinkcard.FieldValidator {
    public com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener llIIlIlIIl;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        com.microblink.blinkid.view.blinkcard.FieldValidationState validate = validate(editable.toString());
        if (validate == com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID) {
            this.llIIlIlIIl.onValidationStateUpdate(validate);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.microblink.blinkid.view.blinkcard.FieldValidator
    public final java.lang.String reformatValue(java.lang.String str) {
        return str;
    }

    @Override // com.microblink.blinkid.view.blinkcard.FieldValidator
    public final void registerListener(com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener validationStateListener) {
        this.llIIlIlIIl = validationStateListener;
    }

    @Override // com.microblink.blinkid.view.blinkcard.FieldValidator
    public final com.microblink.blinkid.view.blinkcard.FieldValidationState validate(java.lang.String str) {
        return com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardUtils.isValidIban(str) ? com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID : com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_IBAN;
    }
}
