package com.payair.hce;

/* loaded from: classes4.dex */
public interface ResponseCompleteTokenizeDto {
    byte[] DigitizedCardProfile(java.lang.String str, byte[] bArr, long j, long j2, int i, byte b, byte[] bArr2);

    byte[] valueOf(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i, byte[] bArr9);

    com.payair.hce.getErrorName values();

    byte[] writeReplace();
}
