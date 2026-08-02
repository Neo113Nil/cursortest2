package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class llllllIlll {
    public static final /* synthetic */ int[] IlIllIlIIl;
    public static final /* synthetic */ int[] llIIlIlIIl;

    static {
        int[] iArr = new int[com.microblink.blinkid.view.blinkcard.FieldValidationState.values().length];
        IlIllIlIIl = iArr;
        try {
            iArr[com.microblink.blinkid.view.blinkcard.FieldValidationState.VALID.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            IlIllIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_CARD_NUMBER.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            IlIllIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_SECURITY_CODE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            IlIllIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_IBAN.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            IlIllIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidationState.INVALID_EXPIRY_DATE.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            IlIllIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidationState.CARD_EXPIRED.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            IlIllIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidationState.REQUIRED_FIELD_MISSING.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[com.microblink.blinkid.view.blinkcard.FieldValidation.values().length];
        llIIlIlIIl = iArr2;
        try {
            iArr2[com.microblink.blinkid.view.blinkcard.FieldValidation.CARD_NUMBER.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidation.EXPIRY_DATE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidation.CVV.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidation.OWNER.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.view.blinkcard.FieldValidation.IBAN.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
    }
}
