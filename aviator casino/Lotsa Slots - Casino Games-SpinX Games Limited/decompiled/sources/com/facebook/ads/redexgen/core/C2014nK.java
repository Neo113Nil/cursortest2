package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2014nK extends com.facebook.ads.redexgen.core.C04033h {
    public static java.lang.String[] A0G = {"svIlLfjydeGBu6G0UjrHSopJ4Ky0wypW", "Eix0ooWKKyHx1hOwK", "jEg8xHvrvI0NXBTEehRxqQQjEYaTbIQI", "2fo", "JdZ", "dfBQZRQYRFpeihXeeCDcyjRnxunK4YCt", "ZC", "go43CHW4mwtjJCZZxmpd9eXXAUtGDH29"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D25277746 - If all qualities are filtered out, do not use a fixed selection but differ to adaptive track selection in hero.")
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>> A0E;
    public final android.util.SparseBooleanArray A0F;

    @java.lang.Deprecated
    public C2014nK() {
        this.A0E = new android.util.SparseArray<>();
        this.A0F = new android.util.SparseBooleanArray();
        A0W();
    }

    public C2014nK(android.content.Context context) {
        super(context);
        this.A0E = new android.util.SparseArray<>();
        this.A0F = new android.util.SparseBooleanArray();
        A0W();
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Modified to support setExceedRendererCapabilitiesIfAllFilteredOut")
    public C2014nK(android.os.Bundle bundle) {
        super(bundle);
        A0W();
        com.facebook.ads.redexgen.core.C05549i c05549i = com.facebook.ads.redexgen.core.C05549i.A0J;
        A17(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0W, c05549i.A0C));
        A11(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0Q, c05549i.A06));
        A12(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0R, c05549i.A07));
        A10(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0H(), c05549i.A05));
        A14(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0T, c05549i.A09));
        A0x(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0J(), c05549i.A02));
        A0y(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0N, c05549i.A03));
        A0v(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0K, c05549i.A00));
        A0w(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0L, c05549i.A01));
        A13(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0S, c05549i.A08));
        A16(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0V, c05549i.A0B));
        A18(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0b, c05549i.A0D));
        A0z(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0O, c05549i.A04));
        A15(bundle.getBoolean(com.facebook.ads.redexgen.core.C05549i.A0U, c05549i.A0A));
        this.A0E = new android.util.SparseArray<>();
        A0X(bundle);
        this.A0F = A0R(bundle.getIntArray(com.facebook.ads.redexgen.core.C05549i.A0X));
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("To support exceedRendererCapabilitiesIfAllFilteredOut")
    public C2014nK(com.facebook.ads.redexgen.core.C05549i c05549i) {
        super(c05549i);
        this.A0C = c05549i.A0C;
        this.A06 = c05549i.A06;
        this.A07 = c05549i.A07;
        this.A05 = c05549i.A05;
        this.A09 = c05549i.A09;
        this.A02 = c05549i.A02;
        this.A03 = c05549i.A03;
        this.A00 = c05549i.A00;
        this.A01 = c05549i.A01;
        this.A08 = c05549i.A08;
        this.A0B = c05549i.A0B;
        this.A0D = c05549i.A0D;
        this.A04 = c05549i.A04;
        this.A0A = c05549i.A0A;
        this.A0E = A0G((android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>>) c05549i.A0E);
        this.A0F = c05549i.A0F.clone();
    }

    public static android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>> A0G(android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>> sparseArray) {
        android.util.SparseArray<java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH>> sparseArray2 = new android.util.SparseArray<>();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new java.util.HashMap(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    private android.util.SparseBooleanArray A0R(int[] iArr) {
        if (iArr == null) {
            return new android.util.SparseBooleanArray();
        }
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray(iArr.length);
        for (int i : iArr) {
            sparseBooleanArray.append(i, true);
        }
        return sparseBooleanArray;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("To support setting exceedRendererCapabilitiesIfAllFilteredOut")
    private void A0W() {
        this.A0C = true;
        this.A06 = false;
        this.A07 = true;
        this.A05 = false;
        this.A09 = true;
        this.A02 = false;
        this.A03 = false;
        this.A00 = false;
        this.A01 = false;
        this.A08 = true;
        this.A0B = true;
        this.A0D = false;
        this.A04 = true;
        this.A0A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0X(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.BP A01;
        android.util.SparseArray A00;
        int[] intArray = bundle.getIntArray(com.facebook.ads.redexgen.core.C05549i.A0B());
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.facebook.ads.redexgen.core.C05549i.A0C());
        if (parcelableArrayList == null) {
            A01 = com.facebook.ads.redexgen.core.BP.A03();
        } else {
            com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2026nW> anonymousClass23 = com.facebook.ads.redexgen.core.C2026nW.A05;
            java.lang.String[] strArr = A0G;
            if (strArr[1].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0G;
            strArr2[2] = "KlsLVpZXOsku5rL5eePguYtdE3UqynPn";
            strArr2[5] = "qpearOu2I9fJNwBbehSRgczBWJlsPwpY";
            A01 = com.facebook.ads.redexgen.core.AnonymousClass44.A01(anonymousClass23, parcelableArrayList);
        }
        android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(com.facebook.ads.redexgen.core.C05549i.A0Y);
        if (sparseParcelableArray == null) {
            A00 = new android.util.SparseArray();
        } else {
            A00 = com.facebook.ads.redexgen.core.AnonymousClass44.A00(com.facebook.ads.redexgen.core.C2011nH.A05, sparseParcelableArray);
        }
        if (intArray == null || intArray.length != A01.size()) {
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            A0r(intArray[i], (com.facebook.ads.redexgen.core.C2026nW) A01.get(i), (com.facebook.ads.redexgen.core.C2011nH) A00.get(i));
        }
    }

    @Override // com.facebook.ads.redexgen.core.C04033h
    /* renamed from: A0q, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C2014nK A0m(int i, int i2, boolean z) {
        super.A0m(i, i2, z);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (com.facebook.ads.redexgen.core.C5C.A1E(r4, r8) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (com.facebook.ads.redexgen.core.C5C.A1E(r4, r8) != false) goto L15;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.redexgen.core.C2014nK A0r(int i, com.facebook.ads.redexgen.core.C2026nW c2026nW, com.facebook.ads.redexgen.core.C2011nH c2011nH) {
        java.util.Map<com.facebook.ads.redexgen.core.C2026nW, com.facebook.ads.redexgen.core.C2011nH> map = this.A0E.get(i);
        if (map == null) {
            map = new java.util.HashMap<>();
            this.A0E.put(i, map);
        }
        boolean containsKey = map.containsKey(c2026nW);
        java.lang.String[] strArr = A0G;
        if (strArr[4].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0G;
        strArr2[2] = "Tjk1w46Zsfr3yClteaW3dwU9W0N7TL6X";
        strArr2[5] = "KoERYkShSHV4ud9Re9JlKSMcCXAYN5Cn";
        if (containsKey) {
            com.facebook.ads.redexgen.core.C2011nH c2011nH2 = map.get(c2026nW);
            java.lang.String[] strArr3 = A0G;
            if (strArr3[0].charAt(28) != strArr3[7].charAt(28)) {
                java.lang.String[] strArr4 = A0G;
                strArr4[1] = "d9Fp2lxah88hbF8VY";
                strArr4[6] = "He";
            } else {
                java.lang.String[] strArr5 = A0G;
                strArr5[0] = "6G3DmRjovsWEEopHgL7H9VeUKDmRIoIA";
                strArr5[7] = "heYp32NvS9S7pouisOnfj6NnH9zTXJMv";
            }
        }
        map.put(c2026nW, c2011nH);
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C04033h
    /* renamed from: A0s, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C2014nK A0n(android.content.Context context) {
        super.A0n(context);
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C04033h
    /* renamed from: A0t, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C2014nK A0o(android.content.Context context, boolean z) {
        super.A0o(context, z);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A0u(com.facebook.ads.redexgen.core.C2155pc c2155pc) {
        super.A0W(c2155pc);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A0v(boolean z) {
        this.A00 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A0w(boolean z) {
        this.A01 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A0x(boolean z) {
        this.A02 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A0y(boolean z) {
        this.A03 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A0z(boolean z) {
        this.A04 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A10(boolean z) {
        this.A05 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A11(boolean z) {
        this.A06 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A12(boolean z) {
        this.A07 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A13(boolean z) {
        this.A08 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A14(boolean z) {
        this.A09 = z;
        return this;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D25277746")
    public final com.facebook.ads.redexgen.core.C2014nK A15(boolean z) {
        this.A0A = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A16(boolean z) {
        this.A0B = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A17(boolean z) {
        this.A0C = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2014nK A18(boolean z) {
        this.A0D = z;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C04033h
    /* renamed from: A19, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C05549i A0p() {
        return new com.facebook.ads.redexgen.core.C05549i(this);
    }
}
