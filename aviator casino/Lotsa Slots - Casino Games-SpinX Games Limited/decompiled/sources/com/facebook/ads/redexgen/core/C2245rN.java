package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.rN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2245rN<ModelType, StateType> {
    public static byte[] A0A;
    public static final com.facebook.ads.redexgen.core.C2245rN A0B;
    public com.facebook.ads.redexgen.core.EnumC2246rO A00;
    public com.facebook.ads.redexgen.core.EnumC2237rE A01;
    public java.lang.String A02;
    public boolean A03;
    public final boolean A04;
    public final com.facebook.ads.redexgen.core.C2245rN A05;
    public final ModelType A06;
    public final StateType A07;
    public final java.lang.String A08;
    public final java.util.List<com.facebook.ads.redexgen.core.ViewpointAction<ModelType, StateType>> A09;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A03(com.facebook.ads.redexgen.core.InterfaceC2236rD interfaceC2236rD) {
        java.util.Iterator<com.facebook.ads.redexgen.core.ViewpointAction<ModelType, StateType>> it = this.A09.iterator();
        while (it.hasNext()) {
            it.next().A6R(this, interfaceC2236rD);
        }
        com.facebook.ads.redexgen.core.EnumC2237rE A9U = interfaceC2236rD.A9U(this);
        this.A01 = A9U;
        if (A9U == com.facebook.ads.redexgen.core.EnumC2237rE.A02) {
            this.A03 = true;
        }
    }

    static {
        A02();
        A0B = new com.facebook.ads.redexgen.core.C2245rN(null, null, A01(48, 5, 44), A01(48, 5, 44), java.util.Collections.emptyList(), A0B, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2245rN(com.facebook.ads.redexgen.core.C2247rP<ModelType, StateType> c2247rP) {
        this(r1, r2, r3, r4, r5, r6, r7);
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str;
        java.lang.String str2;
        java.util.List list;
        java.util.List list2;
        com.facebook.ads.redexgen.core.C2245rN c2245rN;
        boolean z;
        obj = c2247rP.A03;
        obj2 = c2247rP.A04;
        str = c2247rP.A06;
        str2 = c2247rP.A06;
        list = c2247rP.A01;
        if (list == null) {
            list2 = java.util.Collections.emptyList();
        } else {
            list2 = c2247rP.A01;
        }
        c2245rN = c2247rP.A00;
        z = c2247rP.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C2245rN(ModelType modeltype, StateType statetype, java.lang.String str, java.lang.String str2, java.util.List<com.facebook.ads.redexgen.core.ViewpointAction<ModelType, StateType>> list, com.facebook.ads.redexgen.core.C2245rN c2245rN, boolean z) {
        this.A00 = com.facebook.ads.redexgen.core.EnumC2246rO.A02;
        if (!(modeltype instanceof android.view.View)) {
            this.A06 = modeltype;
            this.A07 = statetype;
            this.A08 = str;
            this.A02 = str2;
            this.A05 = c2245rN;
            this.A03 = false;
            this.A09 = list;
            this.A04 = z;
            return;
        }
        throw new java.lang.IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> com.facebook.ads.redexgen.core.C2247rP<ModelType, StateType> A00(ModelType model, StateType state, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C2247rP<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A03;
    }
}
