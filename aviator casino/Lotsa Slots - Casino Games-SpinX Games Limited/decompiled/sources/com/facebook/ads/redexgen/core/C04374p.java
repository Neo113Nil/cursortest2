package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04374p {
    public static com.facebook.ads.redexgen.core.C04374p A04;
    public static byte[] A05;
    public static java.lang.String[] A06 = {"7spJOR808jvRvy0GNSJxo7ZJ6", "86KvIandX8vj142355r0drGuD0jhaT0W", "mZfZ3s6", "1QsEKJVAx", "twpDIoiDpzCAIzfG", "B", "RSZaC18qSGa0csTWoF4Keu66v9ytRHBi", "eBKWjsIIuU1hX4JwQhfiQu0nhoXTyGkQ"};
    public final android.os.Handler A01 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC04354n>> A03 = new java.util.concurrent.CopyOnWriteArrayList<>();
    public final java.lang.Object A02 = new java.lang.Object();
    public int A00 = 0;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{89, 86, 92, 74, 87, 81, 92, com.google.common.base.Ascii.SYN, 86, 93, 76, com.google.common.base.Ascii.SYN, 91, 87, 86, 86, com.google.common.base.Ascii.SYN, 123, 119, 118, 118, 125, 123, 108, 113, 110, 113, 108, 97, 103, 123, 112, 121, 118, Byte.MAX_VALUE, 125, 99, 111, 110, 110, 101, 99, 116, 105, 118, 105, 116, 121};
    }

    static {
        A06();
    }

    public C04374p(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(A04(0, 36, 40));
        context.registerReceiver(new com.facebook.ads.redexgen.core.C04364o(this), intentFilter);
    }

    public static int A00(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService(A04(36, 12, 16));
        if (connectivityManager == null) {
            return 0;
        }
        try {
            android.net.NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 1;
            }
            switch (networkInfo.getType()) {
                case 0:
                case 4:
                case 5:
                    return A02(networkInfo);
                case 1:
                    return 2;
                case 2:
                case 3:
                case 7:
                case 8:
                default:
                    return 8;
                case 6:
                    return 5;
                case 9:
                    return 7;
            }
        } catch (java.lang.SecurityException unused) {
            return 0;
        }
    }

    public static int A02(android.net.NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                if (A06[0].length() != 25) {
                    throw new java.lang.RuntimeException();
                }
                A06[5] = "Xq0rs7E";
                return 2;
            case 20:
                return com.facebook.ads.redexgen.core.C5C.A02 >= 29 ? 9 : 0;
        }
    }

    public static synchronized com.facebook.ads.redexgen.core.C04374p A03(android.content.Context context) {
        com.facebook.ads.redexgen.core.C04374p c04374p;
        synchronized (com.facebook.ads.redexgen.core.C04374p.class) {
            if (A04 == null) {
                A04 = new com.facebook.ads.redexgen.core.C04374p(context);
            }
            c04374p = A04;
        }
        return c04374p;
    }

    private void A05() {
        java.util.Iterator<java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC04354n>> it = this.A03.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC04354n> next = it.next();
            if (next.get() == null) {
                this.A03.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i) {
        synchronized (this.A02) {
            if (this.A00 == i) {
                return;
            }
            this.A00 = i;
            java.util.Iterator<java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC04354n>> it = this.A03.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC04354n> next = it.next();
                com.facebook.ads.redexgen.core.InterfaceC04354n interfaceC04354n = next.get();
                if (interfaceC04354n != null) {
                    interfaceC04354n.AF1(i);
                } else {
                    this.A03.remove(next);
                }
            }
        }
    }

    public final int A09() {
        int i;
        synchronized (this.A02) {
            i = this.A00;
        }
        return i;
    }

    public final void A0A(final com.facebook.ads.redexgen.core.InterfaceC04354n interfaceC04354n) {
        A05();
        this.A03.add(new java.lang.ref.WeakReference<>(interfaceC04354n));
        this.A01.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.4j
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.ads.redexgen.core.C04374p.this.A0B(interfaceC04354n);
            }
        });
    }

    public final /* synthetic */ void A0B(com.facebook.ads.redexgen.core.InterfaceC04354n interfaceC04354n) {
        interfaceC04354n.AF1(A09());
    }
}
