package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11363b;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f11363b = bArr;
    }

    @Override // com.google.android.gms.common.l
    public final byte[] t0() {
        return this.f11363b;
    }
}
