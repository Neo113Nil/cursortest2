package com.google.android.gms.internal.ads;

import A0.C0052p0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.wy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1764wy implements InterfaceC0911dx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16192a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16193b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16194c;

    public C1764wy(int i, byte[] bArr, byte[] bArr2) {
        this.f16192a = i;
        switch (i) {
            case 3:
                this.f16194c = new C1719vy(0, bArr);
                this.f16193b = bArr2;
                return;
            case 4:
                this.f16194c = new C1719vy(1, bArr);
                this.f16193b = bArr2;
                return;
            default:
                if (!AbstractC0952et.s(1)) {
                    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
                }
                if (((Cipher) C1495qy.f.get()) == null) {
                    throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
                }
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f16193b = bArr;
                this.f16194c = bArr2;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0911dx
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Object obj = this.f16194c;
        byte[] bArr3 = this.f16193b;
        switch (this.f16192a) {
            case 0:
                InterfaceC0911dx interfaceC0911dx = (InterfaceC0911dx) obj;
                if (bArr3.length == 0) {
                    return interfaceC0911dx.a(bArr, bArr2);
                }
                if (AbstractC1451pz.c(bArr3, bArr)) {
                    return interfaceC0911dx.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                byte[] bArr4 = (byte[]) obj;
                if (bArr.length < bArr4.length + 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!AbstractC1451pz.c(bArr4, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                byte[] bArr5 = new byte[24];
                System.arraycopy(bArr, bArr4.length, bArr5, 0, 24);
                int[] c5 = AbstractC1584sy.c(AbstractC1584sy.d(bArr3), AbstractC1584sy.d(bArr5));
                ByteBuffer order = ByteBuffer.allocate(c5.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                order.asIntBuffer().put(c5);
                SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
                byte[] bArr6 = new byte[12];
                System.arraycopy(bArr5, 16, bArr6, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr6);
                Cipher cipher = (Cipher) C1495qy.f.get();
                cipher.init(2, secretKeySpec, ivParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, 24 + bArr4.length, (r1 - r13) - 24);
            case 2:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                if (bArr.length < bArr3.length + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!AbstractC1451pz.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                int length = bArr3.length;
                C0052p0 c0052p0 = AbstractC1360ny.f14734a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length, 12);
                Cipher cipher2 = (Cipher) AbstractC1360ny.f14734a.get();
                cipher2.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher2.updateAAD(bArr2);
                }
                return cipher2.doFinal(bArr, 12 + bArr3.length, (r0 - r13) - 12);
            case 3:
                if (bArr3.length == 0) {
                    return b(bArr, bArr2);
                }
                if (!AbstractC1451pz.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                return b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
            default:
                if (bArr3.length == 0) {
                    return c(bArr, bArr2);
                }
                if (!AbstractC1451pz.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                return c(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((C1719vy) this.f16194c).m(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((C1719vy) this.f16194c).m(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public C1764wy(InterfaceC0911dx interfaceC0911dx, byte[] bArr) {
        this.f16192a = 0;
        this.f16194c = interfaceC0911dx;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f16193b = bArr;
    }

    public C1764wy(byte[] bArr, C1419pB c1419pB) {
        this.f16192a = 2;
        if (AbstractC0952et.s(2)) {
            C0052p0 c0052p0 = AbstractC1360ny.f14734a;
            AbstractC1400ot.h(bArr.length);
            this.f16194c = new SecretKeySpec(bArr, "AES");
            this.f16193b = c1419pB.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
