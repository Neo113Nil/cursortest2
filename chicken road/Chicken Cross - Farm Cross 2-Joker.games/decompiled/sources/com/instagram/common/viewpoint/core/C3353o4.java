package com.instagram.common.viewpoint.core;

import android.database.Cursor;

/* renamed from: com.facebook.ads.redexgen.X.o4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3353o4 implements InterfaceC1896Bo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC1895Bn.A00(this);
    }

    public C3353o4(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C1892Bk A00() {
        C1892Bk A01;
        A01 = C9w.A01(this.A00);
        return A01;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1896Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1896Bo
    public final boolean moveToPosition(int i) {
        return this.A00.moveToPosition(i);
    }
}
