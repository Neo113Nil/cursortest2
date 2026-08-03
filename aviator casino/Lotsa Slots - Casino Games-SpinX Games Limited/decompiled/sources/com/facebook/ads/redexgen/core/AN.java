package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class AN extends com.facebook.ads.redexgen.core.BS<java.lang.String, java.util.List<java.lang.String>> {
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A00;

    public AN(java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers) {
        this.A00 = headers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.BS, java.util.Map
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.util.List<java.lang.String> get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return (java.util.List) super.get(obj);
    }

    public static /* synthetic */ boolean A01(java.lang.String str) {
        return str != null;
    }

    public static /* synthetic */ boolean A02(java.util.Map.Entry entry) {
        return entry.getKey() != null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2068oD
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A03() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.BS, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.facebook.ads.redexgen.core.BS, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return A06(obj);
    }

    @Override // com.facebook.ads.redexgen.core.BS, java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entrySet() {
        return com.facebook.ads.redexgen.core.AbstractC2219qj.A07(super.entrySet(), new com.facebook.ads.redexgen.core.InterfaceC1867kj() { // from class: com.facebook.ads.redexgen.X.pC
            @Override // com.facebook.ads.redexgen.core.InterfaceC1867kj
            public final boolean A4C(java.lang.Object obj) {
                return com.facebook.ads.redexgen.core.AN.A02((java.util.Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return obj != null && A07(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return A04();
    }

    @Override // com.facebook.ads.redexgen.core.BS, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.facebook.ads.redexgen.core.BS, java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return com.facebook.ads.redexgen.core.AbstractC2219qj.A07(super.keySet(), new com.facebook.ads.redexgen.core.InterfaceC1867kj() { // from class: com.facebook.ads.redexgen.X.pD
            @Override // com.facebook.ads.redexgen.core.InterfaceC1867kj
            public final boolean A4C(java.lang.Object obj) {
                return com.facebook.ads.redexgen.core.AN.A01((java.lang.String) obj);
            }
        });
    }

    @Override // com.facebook.ads.redexgen.core.BS, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
