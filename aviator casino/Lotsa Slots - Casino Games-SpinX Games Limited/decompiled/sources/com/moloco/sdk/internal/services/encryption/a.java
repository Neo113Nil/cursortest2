package com.moloco.sdk.internal.services.encryption;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.encryption.a.C0204a f7265a = com.moloco.sdk.internal.services.encryption.a.C0204a.f7266a;

    /* renamed from: com.moloco.sdk.internal.services.encryption.a$a, reason: collision with other inner class name */
    public static final class C0204a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.moloco.sdk.internal.services.encryption.a.C0204a f7266a = new com.moloco.sdk.internal.services.encryption.a.C0204a();

        public final com.moloco.sdk.internal.services.encryption.a a() {
            return new com.moloco.sdk.internal.services.encryption.b();
        }
    }

    public static final class b {
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ void b() {
        }
    }

    java.lang.String a(byte[] bArr, byte[] bArr2);

    javax.crypto.spec.IvParameterSpec a();

    byte[] a(java.lang.String str);

    byte[] a(byte[] bArr);

    byte[] a(byte[] bArr, java.lang.String str);

    java.lang.String b(byte[] bArr);

    javax.crypto.spec.SecretKeySpec b();

    byte[] b(byte[] bArr, java.lang.String str);
}
