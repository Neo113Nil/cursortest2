package com.instagram.common.viewpoint.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0487Hy {
    public final int A00;
    public final long A01;

    public C0487Hy(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C0487Hy(int i, long j, C0486Hx c0486Hx) {
        this(i, j);
    }

    public static C0487Hy A00(Parcel parcel) {
        return new C0487Hy(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
