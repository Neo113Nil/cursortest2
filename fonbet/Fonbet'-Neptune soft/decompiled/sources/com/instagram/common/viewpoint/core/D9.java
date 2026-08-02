package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class D9 implements InterfaceC1170dc {
    public static String[] A0E = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public E1 A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final DR A09 = new DR() { // from class: com.facebook.ads.redexgen.X.3P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Y c3y) {
            Handler handler;
            boolean A0G;
            handler = D9.this.A07;
            handler.removeCallbacksAndMessages(null);
            A0G = D9.this.A0G(EnumC1194e1.A04);
            if (A0G) {
                D9.this.A03();
                D9.this.A06(true, false);
            }
            D9.this.A05 = true;
        }
    };
    public final DX A08 = new DX() { // from class: com.facebook.ads.redexgen.X.3L
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C01193d c01193d) {
            boolean z;
            D9.this.A02 = true;
            z = D9.this.A03;
            if (z) {
                return;
            }
            D9.this.A03();
            D9.this.A06(false, false);
            D9.this.A05 = true;
        }
    };
    public final DP A0A = new C3K(this);
    public final DM A0B = new DM() { // from class: com.facebook.ads.redexgen.X.3J
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Q c3q) {
            boolean z;
            boolean A0G;
            z = D9.this.A04;
            if (z) {
                return;
            }
            A0G = D9.this.A0G(EnumC1194e1.A04);
            if (!A0G) {
                return;
            }
            D9.this.A03();
            D9.this.A06(true, false);
        }
    };
    public final DG A0C = new C3I(this);
    public final Handler A07 = new Handler();
    public final List<InterfaceC1195e2> A0D = new ArrayList();
    public int A00 = AdError.SERVER_ERROR_CODE;
    public boolean A02 = false;

    public D9(boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A07.removeCallbacksAndMessages(null);
        Iterator<InterfaceC1195e2> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0E[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z, boolean z2) {
        Iterator<InterfaceC1195e2> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().A42(z, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G(EnumC1194e1 enumC1194e1) {
        Iterator<InterfaceC1195e2> it = this.A0D.iterator();
        while (it.hasNext()) {
            if (it.next().A93() != enumC1194e1) {
                return false;
            }
        }
        return true;
    }

    public final void A0H() {
        this.A0D.clear();
    }

    public final void A0I() {
        if (this.A04) {
            this.A07.removeCallbacksAndMessages(null);
            this.A04 = false;
        }
    }

    public final void A0J() {
        this.A06 = true;
        this.A05 = true;
        A06(false, false);
    }

    public final void A0K(int i) {
        this.A00 = i;
    }

    public final void A0L(InterfaceC1195e2 interfaceC1195e2) {
        this.A0D.add(interfaceC1195e2);
    }

    public final boolean A0M() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1170dc
    public final void AAm(E1 e1) {
        this.A01 = e1;
        e1.getEventBus().A03(this.A09, this.A0C, this.A0A, this.A0B, this.A08);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1170dc
    public final void AJk(E1 e1) {
        A03();
        e1.getEventBus().A04(this.A08, this.A0C, this.A0A, this.A0B, this.A09);
        this.A01 = null;
    }
}
