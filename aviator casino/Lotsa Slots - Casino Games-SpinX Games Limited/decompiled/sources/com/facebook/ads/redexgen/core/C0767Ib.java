package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0767Ib {
    public static java.lang.String[] A0B = {"nEg82cXZVYZFfZdDmhKyBuPXw98CjCqr", "lWWNRS3KueXb9Tbf73wyUq3w1CVt7zYo", "9i1TifP67Pthfk8s9WN", "2Mfz8aUpVuODbM0LRRY7IzxNE33rrKDp", "lWmgQQDKaNBy8Pu2POQEfpeN2vAsVVBR", "WAUg7lL5KFyy4cAmNpLa1cxU0cT6TIeS", "jMg6XDLnbUHNrmDX3ZR", "RwGxvdCbKX59SF6mGNLLwZG43nCYkk8W"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final java.util.List<com.facebook.ads.redexgen.core.C0766Ia> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C0767Ib A02(com.facebook.ads.redexgen.core.C04434v c04434v) {
        long A0Q = c04434v.A0Q();
        boolean z = (c04434v.A0I() & 128) != 0;
        boolean z2 = false;
        boolean z3 = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        long j = -9223372036854775807L;
        if (!z) {
            int A0I = c04434v.A0I();
            z2 = (A0I & 128) != 0;
            z3 = (A0I & 64) != 0;
            if (A0B[3].charAt(19) != '7') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0B;
            strArr[0] = "nLO0WJRxYuU9qthfzcYyP1P8ccIGaxOi";
            strArr[1] = "OIpoqKTSq2Ia2FsBUXzy5KxMNemzaoxr";
            boolean z5 = (A0I & 32) != 0;
            r14 = z3 ? c04434v.A0Q() : -9223372036854775807L;
            if (!z3) {
                int A0I2 = c04434v.A0I();
                arrayList = new java.util.ArrayList(A0I2);
                for (int i4 = 0; i4 < A0I2; i4++) {
                    arrayList.add(new com.facebook.ads.redexgen.core.C0766Ia(c04434v.A0I(), c04434v.A0Q(), null));
                }
                if (A0B[3].charAt(19) == '7') {
                    A0B[4] = "ZIJV8CxCO5lc3X0ct1XMotdLhBio9GzL";
                }
            }
            if (z5) {
                long A0I3 = c04434v.A0I();
                z4 = (128 & A0I3) != 0;
                j = (1000 * (((1 & A0I3) << 32) | c04434v.A0Q())) / 90;
            }
            i = c04434v.A0M();
            i2 = c04434v.A0I();
            i3 = c04434v.A0I();
        }
        return new com.facebook.ads.redexgen.core.C0767Ib(A0Q, z, z2, z3, arrayList, r14, z4, j, i, i2, i3);
    }

    public C0767Ib(long j, boolean z, boolean z2, boolean z3, java.util.List<com.facebook.ads.redexgen.core.C0766Ia> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = java.util.Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public C0767Ib(android.os.Parcel parcel) {
        com.facebook.ads.redexgen.core.C0766Ia A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = com.facebook.ads.redexgen.core.C0766Ia.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = java.util.Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static com.facebook.ads.redexgen.core.C0767Ib A00(android.os.Parcel parcel) {
        return new com.facebook.ads.redexgen.core.C0767Ib(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(android.os.Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
