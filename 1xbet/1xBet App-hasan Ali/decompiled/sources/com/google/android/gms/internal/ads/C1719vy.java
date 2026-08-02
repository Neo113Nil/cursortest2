package com.google.android.gms.internal.ads;

import A0.AbstractC0015c;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1719vy extends AbstractC0015c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16068c;

    public C1719vy(int i, byte[] bArr) {
        this.f16068c = i;
        if (!AbstractC0952et.s(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f474a = l(1, bArr);
        this.f475b = l(0, bArr);
    }

    @Override // A0.AbstractC0015c
    public final AbstractC1674uy l(int i, byte[] bArr) {
        switch (this.f16068c) {
            case 0:
                return new C1629ty(bArr, i, 0);
            default:
                return new C1629ty(bArr, i, 1);
        }
    }
}
