package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class IIIlIIIIlI {
    public static final /* synthetic */ int[] llIIlIlIIl;

    static {
        int[] iArr = new int[com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.values().length];
        llIIlIlIIl = iArr;
        try {
            iArr[com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.ChinaUnionPay.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Diners.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.DiscoverCard.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Jcb.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Maestro.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Mastercard.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            llIIlIlIIl[com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.Visa.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
