package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class lllIIIlIlI implements com.microblink.blinkid.view.blinkcard.FieldValidator {
    public boolean IlIllIlIIl = false;
    public com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener llIIlIlIIl;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        if (this.IlIllIlIIl) {
            this.llIIlIlIIl.onValidationStateUpdate(validate(editable.toString()));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.IlIllIlIIl = (i + i2) + i3 > 0;
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
        return (str == null || str.isEmpty()) ? com.microblink.blinkid.view.blinkcard.FieldValidationState.REQUIRED_FIELD_MISSING : com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID;
    }
}
