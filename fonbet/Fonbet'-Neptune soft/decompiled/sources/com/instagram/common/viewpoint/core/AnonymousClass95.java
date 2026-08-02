package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.facebook.ads.redexgen.X.95, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass95 implements InterfaceC1569kN {
    public static String[] A05 = {"09FvAMDbH0ybjBvy7etGUlmvLnEax64M", "9UhXzLA65KAjnLS2nIkoWygikqgIUMi6", "7x5jjcV5dGluzAi4xLXm7mPjpISGuC5w", "OMb242EU3cjCZF5lkBhqnraDuTpVEe8I", "YkwDHYmprJhwUHAQbO7ClYxi5co4mZVB", "F0wri1MO2ggHk2Yd2fKtZmsEqFQ1SY6P", "VahsyjeijnOod8dsGLMZVGg77qfAqG3R", "hv5jyUmHRXfPhpozztfXRSgwdurH1xzL"};
    public int A00;
    public boolean A01;
    public final J5 A02 = new J5();
    public final C02297j A03 = new C02297j();
    public final Deque<AbstractC02287i> A04 = new ArrayDeque();

    public AnonymousClass95() {
        for (int i = 0; i < 2; i++) {
            this.A04.addFirst(new AbstractC02287i() { // from class: com.facebook.ads.redexgen.X.10
                @Override // com.instagram.common.viewpoint.core.AbstractC02287i, com.instagram.common.viewpoint.core.AbstractC1751nX
                public final void A0B() {
                    AnonymousClass95.this.A04(this);
                }
            });
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.C5O
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C02297j A5j() throws C1568kM {
        C3M.A08(!this.A01);
        if (this.A00 != 0) {
            return null;
        }
        this.A00 = 1;
        return this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.C5O
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final AbstractC02287i A5l() throws C1568kM {
        C3M.A08(!this.A01);
        if (this.A00 != 2 || this.A04.isEmpty()) {
            return null;
        }
        AbstractC02287i removeFirst = this.A04.removeFirst();
        if (this.A03.A05()) {
            String[] strArr = A05;
            if (strArr[5].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            A05[4] = "JYyYZLdoMjCFjS6FBvPaG66m4kKjUjXi";
            removeFirst.A00(4);
        } else {
            removeFirst.A0C(this.A03.A01, new C1664m7(this.A03.A01, this.A02.A02(((ByteBuffer) C3M.A01(this.A03.A02)).array())), 0L);
        }
        this.A03.A0A();
        this.A00 = 0;
        return removeFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.C5O
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void AGZ(C02297j c02297j) throws C1568kM {
        C3M.A08(!this.A01);
        C3M.A08(this.A00 == 1);
        C3M.A07(this.A03 == c02297j);
        this.A00 = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(AbstractC02287i abstractC02287i) {
        C3M.A08(this.A04.size() < 2);
        C3M.A07(!this.A04.contains(abstractC02287i));
        abstractC02287i.A0A();
        this.A04.addFirst(abstractC02287i);
    }

    @Override // com.instagram.common.viewpoint.core.C5O
    public final void AGr() {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1569kN
    public final void AIx(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.C5O
    public final void flush() {
        C3M.A08(!this.A01);
        this.A03.A0A();
        this.A00 = 0;
    }
}
