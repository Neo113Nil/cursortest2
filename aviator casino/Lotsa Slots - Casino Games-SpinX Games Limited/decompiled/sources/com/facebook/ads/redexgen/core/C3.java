package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class C3 implements com.facebook.ads.redexgen.core.InterfaceC1872ko {
    public final /* synthetic */ com.facebook.ads.redexgen.core.CC A00;

    public C3(final com.facebook.ads.redexgen.core.CC val$separatorMatcher) {
        this.A00 = val$separatorMatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2R] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1872ko
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C2R AAl(final com.facebook.ads.redexgen.core.C1873kp splitter, final java.lang.CharSequence toSplit) {
        return new com.facebook.ads.redexgen.core.AbstractC0610Bw(splitter, toSplit) { // from class: com.facebook.ads.redexgen.X.2R
            @Override // com.facebook.ads.redexgen.core.AbstractC0610Bw
            public final int A04(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0610Bw
            public final int A05(int start) {
                return com.facebook.ads.redexgen.core.C3.this.A00.A08(this.A03, start);
            }
        };
    }
}
