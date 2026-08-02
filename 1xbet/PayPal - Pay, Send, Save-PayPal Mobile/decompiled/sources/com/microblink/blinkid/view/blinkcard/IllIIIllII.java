package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class IllIIIllII implements com.microblink.blinkid.view.blinkcard.FieldValidator {
    public boolean IlIllIlIIl = false;
    public com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener llIIlIlIIl;

    public static com.microblink.blinkid.view.blinkcard.FieldValidationState llIIlIlIIl(java.lang.String str) {
        if (str.length() != 5) {
            return com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_EXPIRY_DATE;
        }
        try {
            java.lang.String[] split = str.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            java.lang.String str2 = split[0];
            int parseInt = java.lang.Integer.parseInt(str2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("20");
            sb.append(split[1]);
            java.lang.String obj = sb.toString();
            int parseInt2 = java.lang.Integer.parseInt(obj);
            int i = java.util.Calendar.getInstance().get(1);
            int i2 = java.util.Calendar.getInstance().get(2);
            if (parseInt > 0 && parseInt <= 12 && str2.length() == 2 && obj.length() == 4) {
                return (i > parseInt2 || (i == parseInt2 && i2 + 1 > parseInt)) ? com.microblink.blinkid.view.blinkcard.FieldValidationState.CARD_EXPIRED : com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID;
            }
            return com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_EXPIRY_DATE;
        } catch (java.lang.Exception unused) {
            return com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_EXPIRY_DATE;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        int numericValue;
        int length = editable.length();
        if (length > 0 && length != 3) {
            int i = length - 1;
            if (java.lang.Character.getNumericValue(editable.charAt(i)) < 0) {
                editable.delete(i, length);
                return;
            }
        }
        if (length == 1 && (numericValue = java.lang.Character.getNumericValue(editable.charAt(0))) >= 2 && numericValue <= 9) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("0");
            sb.append(editable.charAt(0));
            editable.replace(0, 1, sb.toString());
        }
        if (length == 2) {
            int numericValue2 = java.lang.Character.getNumericValue(editable.charAt(0));
            int numericValue3 = java.lang.Character.getNumericValue(editable.charAt(1));
            if (this.IlIllIlIIl) {
                editable.delete(1, 2);
            } else if (numericValue2 == 1 && (numericValue3 < 0 || numericValue3 > 2)) {
                editable.delete(1, 2);
            } else if (numericValue2 == 0 && numericValue3 == 0) {
                editable.delete(1, 2);
            } else {
                editable.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            }
        }
        this.llIIlIlIIl.onValidationStateUpdate(length == 5 ? llIIlIlIIl(editable.toString()) : com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.IlIllIlIIl = i3 == 0;
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
        return llIIlIlIIl(str);
    }
}
