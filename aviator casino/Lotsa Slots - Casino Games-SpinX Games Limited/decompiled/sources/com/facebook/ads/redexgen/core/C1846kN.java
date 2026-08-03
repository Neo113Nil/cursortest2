package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1846kN implements com.facebook.ads.redexgen.core.InterfaceC0879Mk {
    public static java.lang.String[] A02 = {"NTKnPH7sxZWFtkQQ5kROJPoMkjUZ4Q4d", "RaExZ6aQUY7gKyEqo", "qL9TLqM", "etoa52irCH6srt3CKfgZrOFq7EubEl4q", "qkXLyShprh", "IdfSVJasrAewAIwCfeRk8lkXcSCS6gZu", "rDp9NxZtyasBjPeaw", "WSm3MQw1MgB2HgbRdvVa7F4Bk"};
    public static final com.facebook.ads.redexgen.core.C1846kN A03 = new com.facebook.ads.redexgen.core.C1846kN(java.util.Collections.emptyMap());
    public int A00;
    public final java.util.Map<java.lang.String, byte[]> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A02(java.util.HashMap<java.lang.String, byte[]> hashMap, java.util.Map<java.lang.String, java.lang.Object> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), A04(entry.getValue()));
        }
    }

    public C1846kN() {
        this(java.util.Collections.emptyMap());
    }

    public C1846kN(java.util.Map<java.lang.String, byte[]> metadata) {
        this.A01 = java.util.Collections.unmodifiableMap(metadata);
    }

    public static java.util.Map<java.lang.String, byte[]> A00(java.util.Map<java.lang.String, byte[]> otherMetadata, com.facebook.ads.redexgen.core.C0880Ml c0880Ml) {
        java.util.HashMap hashMap = new java.util.HashMap(otherMetadata);
        A01(hashMap, c0880Ml.A08());
        A02(hashMap, c0880Ml.A09());
        return hashMap;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A01(java.util.HashMap<java.lang.String, byte[]> metadata, java.util.List<java.lang.String> names) {
        for (int i = 0; i < i; i++) {
            metadata.remove(names.get(i));
        }
    }

    public static boolean A03(java.util.Map<java.lang.String, byte[]> first, java.util.Map<java.lang.String, byte[]> second) {
        if (first.size() != second.size()) {
            return false;
        }
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : first.entrySet()) {
            java.lang.String[] strArr = A02;
            if (strArr[3].charAt(15) != strArr[5].charAt(15)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[3] = "RxVH6UseI2QDAmyClyRrXYV4sPTOH4uG";
            strArr2[5] = "pwd4aQIs84j1qxbCSK6duDEgPeljesR1";
            if (!java.util.Arrays.equals(entry.getValue(), second.get(entry.getKey()))) {
                return false;
            }
        }
        java.lang.String[] strArr3 = A02;
        if (strArr3[2].length() != strArr3[7].length()) {
            java.lang.String[] strArr4 = A02;
            strArr4[3] = "m75a4Dv9Ey5SlHFCv1UmHUzSVmhM8DwK";
            strArr4[5] = "s7eMveGG854NsBOCE3EU05ylLzSbP54K";
            return true;
        }
        return true;
    }

    public static byte[] A04(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) obj).longValue()).array();
        }
        if (obj instanceof java.lang.String) {
            return ((java.lang.String) obj).getBytes(com.facebook.ads.redexgen.core.AbstractC1833k9.A05);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final com.facebook.ads.redexgen.core.C1846kN A05(com.facebook.ads.redexgen.core.C0880Ml c0880Ml) {
        java.util.Map<java.lang.String, byte[]> A00 = A00(this.A01, c0880Ml);
        java.util.Map<java.lang.String, byte[]> mutatedMetadata = this.A01;
        if (A03(mutatedMetadata, A00)) {
            return this;
        }
        return new com.facebook.ads.redexgen.core.C1846kN(A00);
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, byte[]>> A06() {
        return this.A01.entrySet();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0879Mk
    public final long A6h(java.lang.String str, long j) {
        byte[] bytes = this.A01.get(str);
        if (bytes != null) {
            long j2 = java.nio.ByteBuffer.wrap(bytes).getLong();
            if (A02[4].length() != 10) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[1] = "kz3tzBS2MuEJlb9Es";
            strArr[6] = "H8ViBkjAuDsfEZOZe";
            return j2;
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0879Mk
    public final java.lang.String A6j(java.lang.String str, java.lang.String str2) {
        byte[] bArr = this.A01.get(str);
        if (bArr != null) {
            return new java.lang.String(bArr, com.facebook.ads.redexgen.core.AbstractC1833k9.A05);
        }
        return str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A03(this.A01, ((com.facebook.ads.redexgen.core.C1846kN) obj).A01);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 0;
            for (java.util.Map.Entry<java.lang.String, byte[]> entry : this.A01.entrySet()) {
                int hashCode = entry.getKey().hashCode();
                int result = java.util.Arrays.hashCode(entry.getValue());
                i += hashCode ^ result;
            }
            this.A00 = i;
        }
        int result2 = this.A00;
        return result2;
    }
}
