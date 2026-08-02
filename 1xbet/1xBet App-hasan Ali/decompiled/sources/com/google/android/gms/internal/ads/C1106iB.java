package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.google.android.gms.internal.ads.iB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106iB implements InterfaceC0911dx {

    /* renamed from: a, reason: collision with root package name */
    public final C1016gB f13876a;

    /* renamed from: b, reason: collision with root package name */
    public final C1374oB f13877b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13878c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f13879d;

    public C1106iB(C1016gB c1016gB, C1374oB c1374oB, int i, byte[] bArr) {
        this.f13876a = c1016gB;
        this.f13877b = c1374oB;
        this.f13878c = i;
        this.f13879d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0911dx
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f13879d;
        int length = bArr3.length;
        int length2 = bArr.length;
        int i = this.f13878c;
        if (length2 < length + i) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!AbstractC1451pz.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i5 = length2 - i;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, i5);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i5, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] F5 = AbstractC1400ot.F(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        C1374oB c1374oB = this.f13877b;
        byte[] bArr4 = c1374oB.f14781d;
        int length3 = bArr4.length;
        int i6 = c1374oB.f14779b;
        Iz iz = c1374oB.f14778a;
        byte[] bArr5 = c1374oB.f14780c;
        if (!MessageDigest.isEqual(length3 > 0 ? AbstractC1400ot.F(bArr5, iz.a(i6, AbstractC1400ot.F(F5, bArr4))) : AbstractC1400ot.F(bArr5, iz.a(i6, F5)), copyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        C1016gB c1016gB = this.f13876a;
        int length4 = copyOfRange.length;
        int i7 = c1016gB.f13573b;
        if (length4 < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i7];
        System.arraycopy(copyOfRange, 0, bArr6, 0, i7);
        int i8 = c1016gB.f13573b;
        int i9 = length4 - i8;
        byte[] bArr7 = new byte[i9];
        Cipher cipher = (Cipher) C1016gB.f13571d.get();
        byte[] bArr8 = new byte[c1016gB.f13574c];
        System.arraycopy(bArr6, 0, bArr8, 0, i7);
        cipher.init(2, c1016gB.f13572a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(copyOfRange, i8, i9, bArr7, 0) == i9) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
