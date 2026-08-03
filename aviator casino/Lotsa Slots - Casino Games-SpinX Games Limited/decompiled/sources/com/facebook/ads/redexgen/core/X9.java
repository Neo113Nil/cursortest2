package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class X9 implements com.facebook.ads.redexgen.core.OW {
    public static com.facebook.ads.redexgen.core.X9 A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final java.lang.String A04;
    public final java.util.LinkedHashMap<java.lang.String, com.facebook.ads.redexgen.core.V2> A00 = new java.util.LinkedHashMap<>();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{74, 93, 70, 76, 68, 77, 87, 77, 80, 92, 90, 73, 91, 87, 67, 77, 81, 6, 39, 49, 54, 48, 45, 59, 39, 38, 98, 3, 38, 98, 112, 119, 113, 124, 98, 103, 124, 106, 103, 124, 104, 102, 122};
    }

    static {
        A02();
        A04 = com.facebook.ads.redexgen.core.X9.class.getSimpleName();
    }

    public static com.facebook.ads.redexgen.core.X9 A00() {
        if (A01 == null) {
            A01 = new com.facebook.ads.redexgen.core.X9();
        }
        return A01;
    }

    public final com.facebook.ads.redexgen.core.OG A03(java.lang.String str) {
        com.facebook.ads.redexgen.core.V2 adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        java.lang.String[] strArr = A03;
        if (strArr[1].charAt(31) == strArr[2].charAt(31)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
        strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
        return null;
    }

    public final com.facebook.ads.redexgen.core.V2 A04(java.lang.String str) {
        return this.A00.get(str);
    }

    public final com.facebook.ads.redexgen.core.V2 A05(java.lang.String str, android.os.Messenger messenger, java.lang.String str2) {
        com.facebook.ads.redexgen.core.V2 v2 = new com.facebook.ads.redexgen.core.V2(str, messenger, str2);
        this.A00.put(str, v2);
        return v2;
    }

    public final void A06() {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.facebook.ads.redexgen.core.V2>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (hasNext) {
                com.facebook.ads.redexgen.core.OG og = it.next().getValue().A00;
                if (og != null) {
                    og.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i, java.lang.String str, android.os.Bundle bundle, android.os.Messenger messenger) {
        try {
            android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, i);
            if (str != null) {
                obtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                obtain.getData().putBundle(A01(0, 17, 116), bundle);
            }
            messenger.send(obtain);
        } catch (android.os.RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(java.lang.String str) {
        com.facebook.ads.redexgen.core.V2 v2 = this.A00.get(str);
        if (v2 != null && v2.A00 != null) {
            java.lang.String str2 = A01(17, 13, 62) + str;
            v2.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.OW
    public final void AEs(int i, java.lang.String str, android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.V2 adRecord = A04(str);
        if (adRecord != null) {
            A07(i, str, bundle, adRecord.A02);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.facebook.ads.redexgen.core.V2>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            com.facebook.ads.redexgen.core.V2 value = it.next().getValue();
            try {
                value.A02.send(android.os.Message.obtain((android.os.Handler) null, 3));
            } catch (android.os.RemoteException unused) {
                hashSet.add(value.A03);
            }
        }
        java.util.Iterator it2 = hashSet.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            java.lang.String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (hasNext) {
                A08((java.lang.String) it2.next());
            } else {
                return;
            }
        }
    }
}
