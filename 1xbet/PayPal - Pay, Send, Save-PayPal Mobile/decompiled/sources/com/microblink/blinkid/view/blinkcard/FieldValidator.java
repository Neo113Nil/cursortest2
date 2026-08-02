package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
interface FieldValidator extends android.text.TextWatcher {

    public interface ValidationStateListener {
        void onValidationStateUpdate(com.microblink.blinkid.view.blinkcard.FieldValidationState fieldValidationState);
    }

    java.lang.String reformatValue(java.lang.String str);

    void registerListener(com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener validationStateListener);

    com.microblink.blinkid.view.blinkcard.FieldValidationState validate(java.lang.String str);
}
