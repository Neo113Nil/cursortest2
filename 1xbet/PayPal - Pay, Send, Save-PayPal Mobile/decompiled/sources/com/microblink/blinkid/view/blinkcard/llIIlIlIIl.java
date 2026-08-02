package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class llIIlIlIIl implements com.microblink.blinkid.view.blinkcard.FieldValidator {
    public boolean IlIllIlIIl = false;
    public boolean IllIIIllII = false;
    public com.microblink.blinkid.secured.IIlIIlIIII llIIIlllll = new com.microblink.blinkid.secured.IIlIIlIIII(new java.lang.Integer[0]);
    public com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener llIIlIlIIl;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        if (this.IllIIIllII) {
            this.IllIIIllII = false;
            return;
        }
        com.microblink.blinkid.entities.recognizers.blinkcard.Issuer determineIssuerFromCardNumberPrefix = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardUtils.determineIssuerFromCardNumberPrefix(editable.toString().replaceAll(" ", ""));
        java.util.HashMap hashMap = com.microblink.blinkid.secured.IIlIIlIIII.IlIllIlIIl;
        com.microblink.blinkid.secured.IIlIIlIIII iIlIIlIIII = hashMap.containsKey(determineIssuerFromCardNumberPrefix) ? (com.microblink.blinkid.secured.IIlIIlIIII) hashMap.get(determineIssuerFromCardNumberPrefix) : (com.microblink.blinkid.secured.IIlIIlIIII) hashMap.get(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Other);
        if (this.llIIIlllll != iIlIIlIIII) {
            this.llIIIlllll = iIlIIlIIII;
            this.IllIIIllII = true;
            java.lang.String reformatValue = reformatValue(editable.toString());
            editable.clear();
            editable.append((java.lang.CharSequence) reformatValue);
            return;
        }
        int length = editable.length();
        if (length > 0) {
            int i = length - 1;
            char charAt = editable.charAt(i);
            boolean isDigit = java.lang.Character.isDigit(charAt);
            if (this.llIIIlllll.llIIlIlIIl.contains(java.lang.Integer.valueOf(i))) {
                if (this.IlIllIlIIl) {
                    editable.delete(i, length);
                } else if (charAt != ' ') {
                    editable.delete(i, length);
                    if (isDigit) {
                        editable.append(" ");
                        editable.append(charAt);
                    }
                }
            } else if (this.llIIIlllll.llIIlIlIIl.contains(java.lang.Integer.valueOf(length))) {
                if (!this.IlIllIlIIl) {
                    editable.append(" ");
                }
            } else if (!isDigit) {
                editable.delete(i, length);
            }
        }
        com.microblink.blinkid.view.blinkcard.FieldValidationState validate = validate(editable.toString());
        if (validate == com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID) {
            this.llIIlIlIIl.onValidationStateUpdate(validate);
        }
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
        com.microblink.blinkid.entities.recognizers.blinkcard.Issuer determineIssuerFromCardNumberPrefix = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardUtils.determineIssuerFromCardNumberPrefix(str.replaceAll(" ", ""));
        java.util.HashMap hashMap = com.microblink.blinkid.secured.IIlIIlIIII.IlIllIlIIl;
        com.microblink.blinkid.secured.IIlIIlIIII iIlIIlIIII = hashMap.containsKey(determineIssuerFromCardNumberPrefix) ? (com.microblink.blinkid.secured.IIlIIlIIII) hashMap.get(determineIssuerFromCardNumberPrefix) : (com.microblink.blinkid.secured.IIlIIlIIII) hashMap.get(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Other);
        if (this.llIIIlllll != iIlIIlIIII) {
            this.llIIIlllll = iIlIIlIIII;
        }
        com.microblink.blinkid.secured.IIlIIlIIII iIlIIlIIII2 = this.llIIIlllll;
        java.lang.String replaceAll = str.replaceAll(" ", "");
        int length = replaceAll.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = iIlIIlIIII2.llIIlIlIIl.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((java.lang.Integer) it.next()).intValue() - i;
            if (i2 >= length) {
                break;
            }
            if (intValue > length) {
                sb.append(replaceAll.substring(i2, length));
                break;
            }
            sb.append(replaceAll.substring(i2, intValue));
            sb.append(" ");
            i++;
            i2 = intValue;
        }
        return sb.toString().trim();
    }

    @Override // com.microblink.blinkid.view.blinkcard.FieldValidator
    public final void registerListener(com.microblink.blinkid.view.blinkcard.FieldValidator.ValidationStateListener validationStateListener) {
        this.llIIlIlIIl = validationStateListener;
    }

    @Override // com.microblink.blinkid.view.blinkcard.FieldValidator
    public final com.microblink.blinkid.view.blinkcard.FieldValidationState validate(java.lang.String str) {
        return com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardUtils.isValidCardNumber(str) ? com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID : com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_CARD_NUMBER;
    }
}
