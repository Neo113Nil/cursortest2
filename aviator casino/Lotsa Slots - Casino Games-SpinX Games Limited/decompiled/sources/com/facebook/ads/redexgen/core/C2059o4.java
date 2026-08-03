package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.o4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2059o4 implements com.facebook.ads.redexgen.core.InterfaceC0602Bo {
    public final android.database.Cursor A00;

    public final /* synthetic */ boolean A01() {
        return com.facebook.ads.redexgen.core.AbstractC0601Bn.A00(this);
    }

    public C2059o4(android.database.Cursor cursor) {
        this.A00 = cursor;
    }

    public final com.facebook.ads.redexgen.core.C0598Bk A00() {
        com.facebook.ads.redexgen.core.C0598Bk A01;
        A01 = com.facebook.ads.redexgen.core.C9w.A01(this.A00);
        return A01;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0602Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0602Bo
    public final boolean moveToPosition(int i) {
        return this.A00.moveToPosition(i);
    }
}
