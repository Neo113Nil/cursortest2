package com.google.android.gms.internal.ads;

import A0.C0052p0;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.gB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016gB {

    /* renamed from: d, reason: collision with root package name */
    public static final C0052p0 f13571d = new C0052p0(8);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f13572a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13574c;

    public C1016gB(int i, byte[] bArr) {
        if (!AbstractC0952et.s(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1400ot.h(bArr.length);
        this.f13572a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f13571d.get()).getBlockSize();
        this.f13574c = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f13573b = i;
    }
}
