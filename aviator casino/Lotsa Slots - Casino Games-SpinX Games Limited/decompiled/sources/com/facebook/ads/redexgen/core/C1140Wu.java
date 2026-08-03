package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Wu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1140Wu {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"WbJlBxxP9hhDyVkliYvNWFvleez5wFba", "Us5Q3ca4sjVLZknlXhQB6hWi1VD5Erza", "gJqO8U9bMVlcsLp5HSGrl2qXu5TMOPYV", "P57OBps6tL2979s4xCAUfWnFOcUQoKvX", "CjMQtwUDrO8ZQ06PzRRzPVuypWFQdtNK", "DynPiig1xYxCb14sB97Y7RAQimyT6aIC", "zcq0zXyldopis2WSYxgyl16P5Uge3oHA", "fUMP1AC"};
    public static final java.lang.Package A02;
    public static final java.lang.String A03;
    public static final java.lang.String A04;
    public static final java.lang.String A05;
    public static final java.util.Set<com.facebook.ads.redexgen.core.C1636gi> A06;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.X3> A07;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.X5> A08;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{89, 54, 51, 57, 32, 40, 54, 51, 40, 56, 53, kotlin.io.encoding.Base64.padSymbol, 40, 62, 51, 40, 60, 50, 46, 57, 86, 83, 89, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, 88, 69, 94, 80, 94, 89, 86, 91, 72, 82, 79, 67, 69, 86, 68, com.google.common.base.Ascii.NAK, 122, Byte.MAX_VALUE, 117, 108, 100, 104, 122, 109, 126, Byte.MAX_VALUE, 100, 104, 111, 122, 111, 126, 100, Byte.MAX_VALUE, 122, 111, 122, 75, 121, 110, 125, 124, 56, 107, 108, 121, 108, 125, 56, 122, 109, 118, 124, 116, 125, 56, 113, 107, 56, 125, 117, 104, 108, 97, 57, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.NAK, 2, 41, 3, 2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.NAK, 36, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SI, 36, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.NAK, 100, 104, 106, 41, 97, 102, 100, 98, 101, 104, 104, 108, 41, 102, 99, 116, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 110, 119, 100, 41, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 85, 98, 106, 104, 115, 98, 70, 100, 115, 110, 113, 110, 115, 126, 109, 100, 107, 97, 105, 96, 80, 119, 108, 67, 106, 119, 87, 96, 118, 112, 105, 113, com.google.common.base.Ascii.SI, 8, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SO, 8, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.US, 8, com.google.common.base.Ascii.NAK, 10, com.google.common.base.Ascii.NAK, 8, 5, 3, 4, 17, 2, 4, 49, 19, 4, com.google.common.base.Ascii.EM, 6, com.google.common.base.Ascii.EM, 4, 9, 54, com.google.common.base.Ascii.US, 2, 34, com.google.common.base.Ascii.NAK, 3, 5, com.google.common.base.Ascii.FS, 4};
    }

    static {
        A08();
        A02 = com.facebook.ads.redexgen.core.C1140Wu.class.getPackage();
        A04 = A02 + A07(40, 22, 116);
        A03 = A02 + A07(0, 19, 56);
        A05 = A02 + A07(19, 21, 88);
        A06 = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        A07 = new java.util.concurrent.atomic.AtomicReference<>();
        A08 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static int A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.content.Intent intent) throws com.facebook.ads.redexgen.core.C1138Ws {
        android.content.Intent A012 = A01(intent);
        int usedContext = 0;
        try {
            android.app.Activity A002 = com.facebook.ads.internal.util.activity.ActivityUtils.A00();
            if (A002 == null) {
                A002 = c1636gi.A0E();
                usedContext = 1;
            }
            if (A002 != null) {
                A002.startActivity(A012);
                return usedContext;
            }
            A012.addFlags(268435456);
            c1636gi.startActivity(A012);
            return 2;
        } catch (android.content.ActivityNotFoundException e) {
            throw new com.facebook.ads.redexgen.core.C1138Ws(e);
        }
    }

    public static android.content.Intent A01(android.content.Intent intent) {
        android.content.Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeBundle(intent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static android.content.Intent A02(android.content.Intent intent, java.lang.ClassLoader classLoader) {
        android.content.Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        android.os.Bundle audienceNetworkActivityBundle = new android.os.Bundle();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            audienceNetworkActivityBundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(audienceNetworkActivityBundle);
        return cloneFilter;
    }

    public static android.os.Bundle A03(android.os.Bundle bundle, java.lang.ClassLoader classLoader) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            android.os.Bundle readBundle = obtain.readBundle(classLoader);
            if (A01[2].charAt(4) != '8') {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "Zue8yRDoBrDWRSev";
            obtain.recycle();
            return readBundle;
        }
        throw new java.lang.IllegalStateException(A07(62, 28, 87));
    }

    public static com.facebook.ads.redexgen.core.C1636gi A04(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (com.facebook.ads.redexgen.core.C1636gi c1636gi : A06) {
                java.lang.String adId = c1636gi.A0F().getId();
                if (stringExtra.equals(adId)) {
                    return c1636gi;
                }
            }
            return null;
        }
        return null;
    }

    public static com.facebook.ads.internal.util.activity.AdActivityIntent A05(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntent = new com.facebook.ads.internal.util.activity.AdActivityIntent(c1636gi.getApplicationContext(), A06());
        adActivityIntent.putExtra(A03, c1636gi.A0F().getId());
        A06.add(c1636gi);
        return adActivityIntent;
    }

    public static java.lang.Class A06() {
        if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            try {
                return java.lang.Class.forName(A07(113, 59, 72));
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        return com.facebook.ads.AudienceNetworkActivity.class;
    }

    public static void A09(android.app.Activity activity, android.content.Intent intent) throws com.facebook.ads.redexgen.core.C1138Ws {
        try {
            activity.startActivityForResult(intent, 0);
        } catch (android.content.ActivityNotFoundException e) {
            throw new com.facebook.ads.redexgen.core.C1138Ws(e);
        }
    }

    public static void A0A(android.os.Bundle bundle, android.os.Bundle bundle2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntent) throws com.facebook.ads.redexgen.core.C1138Ws {
        android.content.Context launchContext;
        android.content.Context applicationContext = c1636gi.getApplicationContext();
        if (com.facebook.ads.redexgen.core.C1086Up.A2d(c1636gi) && (launchContext = c1636gi.A0E()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & 268435456) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ 268435456);
            }
        }
        try {
            if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
                if (!A0I(c1636gi, adActivityIntent)) {
                    c1636gi.A0F().AIC();
                    return;
                }
                return;
            }
            applicationContext.startActivity(A01(adActivityIntent));
        } catch (android.content.ActivityNotFoundException e) {
            throw new com.facebook.ads.redexgen.core.C1138Ws(e);
        }
    }

    public static boolean A0C(android.content.Intent intent, java.util.Set<java.lang.String> set) {
        android.net.Uri intentUri = intent.getData();
        if (intentUri == null) {
            return false;
        }
        java.lang.String uri = intentUri.toString();
        java.util.Iterator<java.lang.String> it = set.iterator();
        do {
            boolean hasNext = it.hasNext();
            if (A01[5].charAt(30) != 'I') {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "hOpA8yyYIRQLuX6WeWELRCriZfzSUGqk";
            if (!hasNext) {
                return false;
            }
        } while (!uri.startsWith(it.next()));
        return true;
    }

    public static boolean A0D(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.content.Intent intent) throws com.facebook.ads.redexgen.core.C1138Ws {
        A07.get();
        return A0F(c1636gi, intent, null);
    }

    public static boolean A0E(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.content.Intent intent) throws com.facebook.ads.redexgen.core.C1138Ws {
        A07.get();
        if (0 != 0) {
            android.app.Activity A0E = c1636gi.A0E();
            if (A01[7].length() == 30) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "PLLjYBDqb811z0Dn6rlZ87lQdZ7C";
            if (A0E != null) {
                c1636gi.A0C();
                try {
                    c1636gi.A0E();
                    throw new java.lang.NullPointerException(A07(203, 22, 63));
                } catch (android.content.ActivityNotFoundException e) {
                    throw new com.facebook.ads.redexgen.core.C1138Ws(e);
                } catch (java.lang.Exception e2) {
                    c1636gi.A08().ABC(A07(90, 8, 57), com.facebook.ads.redexgen.core.AbstractC1048Td.A07, new com.facebook.ads.redexgen.core.C1049Te(e2));
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean A0F(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.content.Intent intent, com.facebook.ads.redexgen.core.X3 x3) throws com.facebook.ads.redexgen.core.C1138Ws {
        if (A0C(intent, com.facebook.ads.redexgen.core.C1086Up.A0Z(c1636gi))) {
            return false;
        }
        android.content.Context context = c1636gi;
        if (A01[1].charAt(5) != 'g') {
            A01[2] = "mGLT8eS8inmCxtBfGXr0XCfYNSNKmj30";
            android.content.Context startContext = c1636gi.A0E();
            if (startContext != null) {
                context = startContext;
            } else {
                intent.addFlags(268435456);
            }
            if (x3 != null && !A0C(intent, com.facebook.ads.redexgen.core.C1086Up.A0b(c1636gi))) {
                c1636gi.A0C();
                try {
                    throw new java.lang.NullPointerException(A07(com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, 13, 51));
                } catch (android.content.ActivityNotFoundException e) {
                    throw new com.facebook.ads.redexgen.core.C1138Ws(e);
                } catch (java.lang.Exception e2) {
                    c1636gi.A08().ABC(A07(90, 8, 57), com.facebook.ads.redexgen.core.AbstractC1048Td.A08, new com.facebook.ads.redexgen.core.C1049Te(e2));
                    return false;
                }
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (android.content.ActivityNotFoundException e3) {
                throw new com.facebook.ads.redexgen.core.C1138Ws(e3);
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static boolean A0G(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.net.Uri uri, java.lang.String str) throws android.content.ActivityNotFoundException {
        A08.get();
        return A0H(c1636gi, uri, str, null);
    }

    public static boolean A0H(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.net.Uri uri, java.lang.String str, com.facebook.ads.redexgen.core.X5 x5) throws android.content.ActivityNotFoundException {
        if (x5 == null || c1636gi.A0E() == null) {
            return false;
        }
        new android.os.Bundle().putString(A07(98, 15, 52), str);
        uri.toString();
        c1636gi.A0E();
        throw new java.lang.NullPointerException(A07(172, 18, 74));
    }

    public static boolean A0I(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntent) throws com.facebook.ads.redexgen.core.C1138Ws {
        android.content.Intent A012 = A01(adActivityIntent);
        try {
            android.app.Activity currentActivity = com.facebook.ads.internal.util.activity.ActivityUtils.A00();
            if (currentActivity == null) {
                currentActivity = c1636gi.A0E();
            }
            if (currentActivity == null) {
                return false;
            }
            currentActivity.startActivityForResult(A012, 0);
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            throw new com.facebook.ads.redexgen.core.C1138Ws(e);
        }
    }
}
