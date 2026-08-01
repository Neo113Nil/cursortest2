package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2121Kk implements Comparable<C2121Kk> {
    public final int A00;
    public final C2112Kb A01;

    public C2121Kk(int i, C2112Kb c2112Kb) {
        this.A00 = i;
        this.A01 = c2112Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2121Kk c2121Kk) {
        return Integer.compare(this.A00, c2121Kk.A00);
    }
}
