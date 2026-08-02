package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IIIIIIllIl {
    public static int llIIlIlIIl(com.microblink.blinkid.entities.recognizers.blinkcard.Issuer issuer) {
        switch (com.microblink.blinkid.secured.IIIlIIIIlI.llIIlIlIIl[issuer.ordinal()]) {
            case 1:
                return com.microblink.blinkid.library.R.drawable.mb_ic_unionpay;
            case 2:
                return com.microblink.blinkid.library.R.drawable.mb_ic_diners_club;
            case 3:
                return com.microblink.blinkid.library.R.drawable.mb_ic_discover;
            case 4:
                return com.microblink.blinkid.library.R.drawable.mb_ic_jcb;
            case 5:
                return com.microblink.blinkid.library.R.drawable.mb_ic_maestro;
            case 6:
                return com.microblink.blinkid.library.R.drawable.mb_ic_mastercard;
            case 7:
                return com.microblink.blinkid.library.R.drawable.mb_ic_visa;
            default:
                return com.microblink.blinkid.library.R.drawable.mb_ic_default_card;
        }
    }
}
