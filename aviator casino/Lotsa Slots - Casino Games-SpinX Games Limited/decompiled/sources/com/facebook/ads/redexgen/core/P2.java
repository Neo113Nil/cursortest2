package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class P2 {
    public static com.facebook.ads.redexgen.core.P2 A05;
    public static byte[] A06;
    public static final java.lang.Object A07;
    public final android.content.Context A00;
    public final android.os.Handler A01;
    public final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.facebook.ads.redexgen.core.P1>> A04 = new java.util.HashMap<>();
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<com.facebook.ads.redexgen.core.P1>> A03 = new java.util.HashMap<>();
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.P0> A02 = new java.util.ArrayList<>();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 109, 66, 71, 95, 78, 89, com.google.common.base.Ascii.VT, 79, 66, 79, com.google.common.base.Ascii.VT, 69, 68, 95, com.google.common.base.Ascii.VT, 70, 74, 95, 72, 67, 17, com.google.common.base.Ascii.VT, 95, 95, 57, com.google.common.base.Ascii.SYN, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CR, 95, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 94, 95, 95, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, 66, 79, 7, 42, 101, 108, 42, 99, 100, 126, 111, 100, 126, 42, 37, 118, 102, 109, 96, 104, 96, 37, 86, 116, 99, 126, 120, 121, 55, 123, 126, 100, 99, 45, 55, 84, 119, 123, 121, 116, 90, 106, 119, 121, 124, 123, 121, 107, 108, 85, 121, 118, 121, Byte.MAX_VALUE, 125, 106, com.google.common.base.Ascii.CAN, 52, 33, 54, kotlin.io.encoding.Base64.padSymbol, 60, 59, 50, 117, 52, 50, 52, 60, 59, 38, 33, 117, 51, 60, 57, 33, 48, 39, 117, com.google.common.base.Ascii.CAN, 47, 57, 37, 38, 60, 35, 36, 45, 106, 62, 51, 58, 47, 106, 56, 58, 45, 48, 54, 55, 78, 76, 89, 72, 74, 66, 95, 84, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.FS, 9, 72, 69, 76, 89, 91, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 89, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SO, 92, 75, 79, 93, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO};
    }

    static {
        A03();
        A07 = new java.lang.Object();
    }

    public P2(android.content.Context context) {
        this.A00 = context;
        this.A01 = new com.facebook.ads.redexgen.core.HandlerC0945Oz(this, context.getMainLooper());
    }

    public static com.facebook.ads.redexgen.core.P2 A00(android.content.Context context) {
        com.facebook.ads.redexgen.core.P2 p2;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new com.facebook.ads.redexgen.core.P2(context.getApplicationContext());
            }
            p2 = A05;
        }
        return p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:10:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A02() {
        com.facebook.ads.redexgen.core.P0[] p0Arr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    p0Arr = new com.facebook.ads.redexgen.core.P0[size];
                    this.A02.toArray(p0Arr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (com.facebook.ads.redexgen.core.P0 p0 : p0Arr) {
                int j = p0.A01.size();
                for (int nbr = 0; nbr < j; nbr++) {
                    com.facebook.ads.redexgen.core.P1 p1 = p0.A01.get(nbr);
                    if (!p1.A01) {
                        p1.A02.onReceive(this.A00, p0.A00);
                    }
                }
            }
        }
    }

    public final void A05(android.content.BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.P1> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                com.facebook.ads.redexgen.core.P1 p1 = remove.get(size);
                p1.A01 = true;
                for (int j = 0; j < p1.A03.countActions(); j++) {
                    java.lang.String action = p1.A03.getAction(j);
                    java.util.ArrayList<com.facebook.ads.redexgen.core.P1> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            com.facebook.ads.redexgen.core.P1 p12 = arrayList.get(i2);
                            if (p12.A02 == broadcastReceiver) {
                                p12.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        synchronized (this.A04) {
            com.facebook.ads.redexgen.core.P1 p1 = new com.facebook.ads.redexgen.core.P1(intentFilter, broadcastReceiver);
            java.util.ArrayList<com.facebook.ads.redexgen.core.P1> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(p1);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                java.lang.String action = intentFilter.getAction(i);
                java.util.ArrayList<com.facebook.ads.redexgen.core.P1> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(p1);
            }
        }
    }

    public final boolean A07(android.content.Intent intent) {
        java.lang.String A01;
        synchronized (this.A04) {
            java.lang.String action = intent.getAction();
            java.lang.String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String action2 = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String type = A01(128, 15, 117);
                java.lang.StringBuilder append = sb.append(type).append(resolveTypeIfNeeded);
                java.lang.String type2 = A01(62, 8, 58);
                java.lang.StringBuilder append2 = append.append(type2).append(action2);
                java.lang.String type3 = A01(51, 11, 53);
                append2.append(type3).append(intent).toString();
            }
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.facebook.ads.redexgen.core.P1>> hashMap = this.A03;
            java.lang.String type4 = intent.getAction();
            java.util.ArrayList<com.facebook.ads.redexgen.core.P1> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (debug) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.String type5 = A01(70, 13, 40);
                    sb2.append(type5).append(arrayList).toString();
                }
                java.util.ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    com.facebook.ads.redexgen.core.P1 p1 = arrayList.get(i);
                    if (debug) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        java.lang.String type6 = A01(104, 24, 106);
                        sb3.append(type6).append(p1.A03).toString();
                    }
                    if (!p1.A00) {
                        int match = p1.A03.match(action, resolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (match >= 0) {
                            if (debug) {
                                java.lang.String str = A01(24, 27, 64) + java.lang.Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new java.util.ArrayList();
                            }
                            arrayList2.add(p1);
                            p1.A00 = true;
                        } else if (debug) {
                            switch (match) {
                                case -4:
                                    A01 = A01(149, 8, 18);
                                    break;
                                case -3:
                                    A01 = A01(143, 6, 102);
                                    break;
                                case -2:
                                    A01 = A01(157, 4, 87);
                                    break;
                                case -1:
                                    A01 = A01(161, 4, 3);
                                    break;
                                default:
                                    A01 = A01(165, 14, 17);
                                    break;
                            }
                            java.lang.String str2 = A01(0, 24, 20) + A01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((com.facebook.ads.redexgen.core.P1) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new com.facebook.ads.redexgen.core.P0(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
