package com.microblink.blinkid.activity.edit;

/* loaded from: classes9.dex */
public class BlinkCardEditResultBundle {
    public final java.lang.String cardNumber;
    public final java.lang.String cvv;
    public final java.lang.String expiryDate;
    public final java.lang.String iban;
    public final java.lang.String owner;

    public BlinkCardEditResultBundle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.cardNumber = str;
        this.owner = str2;
        this.cvv = str3;
        this.expiryDate = str4;
        this.iban = str5;
    }

    public void saveToIntent(android.content.Intent intent) {
        intent.putExtra("MB_BC_RESULT_CARD_NUMBER", this.cardNumber);
        intent.putExtra("MB_BC_RESULT_OWNER", this.owner);
        intent.putExtra("MB_BC_RESULT_CVV", this.cvv);
        intent.putExtra("MB_BC_RESULT_EXPIRY_DATE", this.expiryDate);
        intent.putExtra("MB_BC_RESULT_IBAN", this.iban);
    }

    public static com.microblink.blinkid.activity.edit.BlinkCardEditResultBundle createFromIntent(android.content.Intent intent) {
        return new com.microblink.blinkid.activity.edit.BlinkCardEditResultBundle(intent.getStringExtra("MB_BC_RESULT_CARD_NUMBER"), intent.getStringExtra("MB_BC_RESULT_OWNER"), intent.getStringExtra("MB_BC_RESULT_CVV"), intent.getStringExtra("MB_BC_RESULT_EXPIRY_DATE"), intent.getStringExtra("MB_BC_RESULT_IBAN"));
    }
}
