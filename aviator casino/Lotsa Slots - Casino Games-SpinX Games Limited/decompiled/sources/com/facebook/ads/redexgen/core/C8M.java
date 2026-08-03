package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8M, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8M implements com.facebook.ads.redexgen.core.InterfaceC1935lq {
    public static java.lang.String[] A06 = {"A1ZwXb6JdBVxSPYV1ZzpyUVQy2gRfJA9", "vkvPFBYHwcZnb4NzphHjmgFJFbjiYwSo", "W7sj7Up3ABI8RZFTAAZOEHe7srfTkl57", "fls3PiASqtk6GqNgTZFqwBZFoYeyHn2V", "1yDmXHBn42mad7W8CPx8A7RWKYn1BqT7", "CjPJSc8sfbO2R56Y3Yx9Z137FYjSqvlb", "2KSypf5DjPiLYF3nQ7brfSsHONTUzR5A", "k5ePLg8NJJ"};
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.C1V A02;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.C1V> A03 = new java.util.ArrayDeque<>();
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.C8P> A04;
    public final java.util.PriorityQueue<com.facebook.ads.redexgen.core.C1V> A05;

    public abstract com.facebook.ads.redexgen.core.C1926lh A0Z();

    public abstract void A0b(com.facebook.ads.redexgen.core.C8S c8s);

    public abstract boolean A0d();

    public C8M() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new com.facebook.ads.redexgen.core.C1V());
        }
        this.A04 = new java.util.ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            java.util.ArrayDeque<com.facebook.ads.redexgen.core.C8P> arrayDeque = this.A04;
            final com.facebook.ads.redexgen.core.AnonymousClass64 anonymousClass64 = new com.facebook.ads.redexgen.core.AnonymousClass64() { // from class: com.facebook.ads.redexgen.X.li
                @Override // com.facebook.ads.redexgen.core.AnonymousClass64
                public final void AHj(com.facebook.ads.redexgen.core.AbstractC2116oz abstractC2116oz) {
                    com.facebook.ads.redexgen.core.C8M.this.A0c((com.facebook.ads.redexgen.core.C1U) abstractC2116oz);
                }
            };
            arrayDeque.add(new com.facebook.ads.redexgen.core.C8P(anonymousClass64) { // from class: com.facebook.ads.redexgen.X.1U
                public com.facebook.ads.redexgen.core.AnonymousClass64<com.facebook.ads.redexgen.core.C1U> A00;

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.64 != com.facebook.ads.androidx.media3.decoder.DecoderOutputBuffer$Owner<com.facebook.ads.androidx.media3.extractor.text.cea.CeaDecoder$CeaOutputBuffer> */
                {
                    this.A00 = anonymousClass64;
                }

                @Override // com.facebook.ads.redexgen.core.C8P, com.facebook.ads.redexgen.core.AbstractC2116oz
                public final void A0B() {
                    this.A00.AHj(this);
                }
            });
        }
        this.A05 = new java.util.PriorityQueue<>();
    }

    private void A0U(com.facebook.ads.redexgen.core.C1V c1v) {
        c1v.A0A();
        this.A03.add(c1v);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    /* renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.redexgen.core.C8S A5r() throws com.facebook.ads.redexgen.core.C1928lj {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        return null;
     */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    /* renamed from: A0X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.facebook.ads.redexgen.core.C8P A5t() throws com.facebook.ads.redexgen.core.C1928lj {
        if (!this.A04.isEmpty()) {
            while (true) {
                boolean isEmpty = this.A05.isEmpty();
                if (A06[5].charAt(7) == 's') {
                    A06[6] = "DOprmnWJZ9SCRw8WSrP7EOY5DTOSvJmV";
                    if (!isEmpty) {
                        com.facebook.ads.redexgen.core.C1V peek = this.A05.peek();
                        if (A06[7].length() == 10) {
                            A06[2] = "urX0HrInINzEpwrp6LaPdmgGjQDQJQna";
                            if (((com.facebook.ads.redexgen.core.C1V) com.facebook.ads.redexgen.core.C5C.A0f(peek)).A01 > this.A00) {
                                break;
                            }
                            com.facebook.ads.redexgen.core.C1V c1v = (com.facebook.ads.redexgen.core.C1V) com.facebook.ads.redexgen.core.C5C.A0f(this.A05.poll());
                            if (c1v.A05()) {
                                com.facebook.ads.redexgen.core.C8P c8p = (com.facebook.ads.redexgen.core.C8P) com.facebook.ads.redexgen.core.C5C.A0f(this.A04.pollFirst());
                                c8p.A00(4);
                                A0U(c1v);
                                java.lang.String[] strArr = A06;
                                if (strArr[4].charAt(25) != strArr[3].charAt(25)) {
                                    return c8p;
                                }
                                java.lang.String[] strArr2 = A06;
                                strArr2[4] = "oxl05cpa7UEpdlHPP7s3uyaLsYMYJfaH";
                                strArr2[3] = "7KvbtL7fQFgbKwZtHueu0Zl9fYEN12Vy";
                                return c8p;
                            }
                            A0b(c1v);
                            if (A0d()) {
                                com.facebook.ads.redexgen.core.C1926lh A0Z = A0Z();
                                com.facebook.ads.redexgen.core.C8P c8p2 = (com.facebook.ads.redexgen.core.C8P) com.facebook.ads.redexgen.core.C5C.A0f(this.A04.pollFirst());
                                long j = c1v.A01;
                                java.lang.String[] strArr3 = A06;
                                if (strArr3[4].charAt(25) != strArr3[3].charAt(25)) {
                                    throw new java.lang.RuntimeException();
                                }
                                A06[5] = "oIgvRTusAdocLQHm4RFtRlwv19XF7U3W";
                                c8p2.A0C(j, A0Z, Long.MAX_VALUE);
                                A0U(c1v);
                                return c8p2;
                            }
                            A0U(c1v);
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        break;
                    }
                } else {
                    throw new java.lang.RuntimeException();
                }
            }
        } else {
            return null;
        }
    }

    public final com.facebook.ads.redexgen.core.C8P A0Y() {
        return this.A04.pollFirst();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    /* renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AHJ(com.facebook.ads.redexgen.core.C8S c8s) throws com.facebook.ads.redexgen.core.C1928lj {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(c8s == this.A02);
        com.facebook.ads.redexgen.core.C1V c1v = (com.facebook.ads.redexgen.core.C1V) c8s;
        if (c1v.A04()) {
            A0U(c1v);
        } else {
            long j = this.A01;
            this.A01 = 1 + j;
            c1v.A00 = j;
            this.A05.add(c1v);
        }
        if (A06[7].length() != 10) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[0] = "rj1eyhsOe6SuoM1rYy40tvsoNCkJE80J";
        strArr[1] = "ibYLffFAaVDMN4cD1vowu1tbJEM8Lkom";
        this.A02 = null;
    }

    public final void A0c(com.facebook.ads.redexgen.core.C8P c8p) {
        c8p.A0A();
        this.A04.add(c8p);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    public void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1935lq
    public void AJh(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass60
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((com.facebook.ads.redexgen.core.C1V) com.facebook.ads.redexgen.core.C5C.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            this.A02 = null;
        }
    }
}
