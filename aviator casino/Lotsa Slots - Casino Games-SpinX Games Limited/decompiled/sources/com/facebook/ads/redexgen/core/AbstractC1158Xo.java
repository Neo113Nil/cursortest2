package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1158Xo {
    public static java.lang.String[] A00 = {"tfO9EFprOidg15dbWOFNM3pJ9DH12nbd", "iQi3WSSmt7paFVU78YsoSc5vRnrGV8FY", "eVwJkLn66NX0DyzCMNkg9H8sjiBrfui3", "LdqoMHLm0q63TozEkFqOQv3OaH4JH8Wu", "cJBmiPiaGEEsJOt", "9KYT0ysg0qk30iHsbz0zWhVwZhq8iyG9", "m7p", "Jc"};

    public static java.io.Serializable A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        java.lang.String[] strArr = A00;
        if (strArr[5].charAt(1) == strArr[2].charAt(1)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A00;
        strArr2[0] = "ayJKSMoIzNcUU8Q19fzYI1UxLR6MMgkq";
        strArr2[3] = "KX8CQKcPRjr3ALAXmnNmxPsf5ZezVoBn";
        obtain.setDataPosition(0);
        java.io.Serializable readSerializable = obtain.readSerializable();
        obtain.recycle();
        return readSerializable;
    }

    public static byte[] A01(java.io.Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeSerializable(serializable);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
