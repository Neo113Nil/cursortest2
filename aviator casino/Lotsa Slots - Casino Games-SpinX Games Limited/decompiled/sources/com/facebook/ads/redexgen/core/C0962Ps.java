package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ps, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0962Ps extends android.database.DataSetObserver {
    public final /* synthetic */ com.facebook.ads.redexgen.core.Pv A00;

    public C0962Ps(com.facebook.ads.redexgen.core.Pv pv) {
        this.A00 = pv;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.A00.A0e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.A00.A0e();
    }
}
