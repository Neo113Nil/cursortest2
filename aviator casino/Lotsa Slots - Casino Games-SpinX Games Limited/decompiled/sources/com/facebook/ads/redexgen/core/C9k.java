package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9k, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9k implements com.facebook.ads.redexgen.core.InterfaceC1935lq {
    public static java.lang.String[] A05 = {"09FvAMDbH0ybjBvy7etGUlmvLnEax64M", "9UhXzLA65KAjnLS2nIkoWygikqgIUMi6", "7x5jjcV5dGluzAi4xLXm7mPjpISGuC5w", "OMb242EU3cjCZF5lkBhqnraDuTpVEe8I", "YkwDHYmprJhwUHAQbO7ClYxi5co4mZVB", "F0wri1MO2ggHk2Yd2fKtZmsEqFQ1SY6P", "VahsyjeijnOod8dsGLMZVGg77qfAqG3R", "hv5jyUmHRXfPhpozztfXRSgwdurH1xzL"};
    public int A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.C0798Jh A02 = new com.facebook.ads.redexgen.core.C0798Jh();
    public final com.facebook.ads.redexgen.core.C8S A03 = new com.facebook.ads.redexgen.core.C8S();
    public final java.util.Deque<com.facebook.ads.redexgen.core.C8P> A04 = new java.util.ArrayDeque();

    public C9k() {
        for (int i = 0; i < 2; i++) {
            this.A04.addFirst(new com.facebook.ads.redexgen.core.C8P() { // from class: com.facebook.ads.redexgen.X.1c
                @Override // com.facebook.ads.redexgen.core.C8P, com.facebook.ads.redexgen.core.AbstractC2116oz
                public final void A0B() {
                    com.facebook.ads.redexgen.core.C9k.this.A04(this);
                }
            });
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C8S A5r() throws com.facebook.ads.redexgen.core.C1928lj {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A01);
        if (this.A00 != 0) {
            return null;
        }
        this.A00 = 1;
        return this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C8P A5t() throws com.facebook.ads.redexgen.core.C1928lj {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A01);
        if (this.A00 != 2 || this.A04.isEmpty()) {
            return null;
        }
        com.facebook.ads.redexgen.core.C8P removeFirst = this.A04.removeFirst();
        if (this.A03.A05()) {
            java.lang.String[] strArr = A05;
            if (strArr[5].charAt(13) == strArr[0].charAt(13)) {
                throw new java.lang.RuntimeException();
            }
            A05[4] = "JYyYZLdoMjCFjS6FBvPaG66m4kKjUjXi";
            removeFirst.A00(4);
        } else {
            removeFirst.A0C(this.A03.A01, new com.facebook.ads.redexgen.core.C2023nT(this.A03.A01, this.A02.A02(((java.nio.ByteBuffer) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A03.A02)).array())), 0L);
        }
        this.A03.A0A();
        this.A00 = 0;
        return removeFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void AHJ(com.facebook.ads.redexgen.core.C8S c8s) throws com.facebook.ads.redexgen.core.C1928lj {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A01);
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A00 == 1);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(this.A03 == c8s);
        this.A00 = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(com.facebook.ads.redexgen.core.C8P c8p) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A04.size() < 2);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(!this.A04.contains(c8p));
        c8p.A0A();
        this.A04.addFirst(c8p);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    public final void AHb() {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1935lq
    public final void AJh(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    public final void flush() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A01);
        this.A03.A0A();
        this.A00 = 0;
    }
}
