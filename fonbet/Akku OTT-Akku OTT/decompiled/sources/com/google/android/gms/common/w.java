package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class w extends v {
    public final byte[] c;

    public w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // com.google.android.gms.common.v
    public final byte[] D() {
        return this.c;
    }
}
