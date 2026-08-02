package com.daon.sdk.face.module;

/* loaded from: classes7.dex */
public interface a extends com.daon.sdk.face.module.Module {
    float a(byte[] bArr, android.graphics.Bitmap bitmap);

    float a(byte[] bArr, com.daon.sdk.face.YUV yuv, int i);

    float a(byte[] bArr, byte[] bArr2);

    android.os.Bundle a(android.graphics.Bitmap bitmap);

    android.os.Bundle a(com.daon.sdk.face.YUV yuv);

    android.os.Bundle a(byte[] bArr);

    boolean a();

    android.os.Bundle b(android.graphics.Bitmap bitmap);

    boolean b();

    byte[] b(com.daon.sdk.face.YUV yuv);

    android.os.Bundle c(com.daon.sdk.face.YUV yuv);

    byte[] c(android.graphics.Bitmap bitmap);
}
