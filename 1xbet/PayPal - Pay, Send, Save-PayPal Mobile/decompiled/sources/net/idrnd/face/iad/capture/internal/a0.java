package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.PublicKey f6954a;
    public final java.security.SecureRandom b;
    public final javax.crypto.spec.OAEPParameterSpec c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    public final int g;
    public final int h;
    public final java.lang.String i;

    public a0(byte[] bArr) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object m23436constructorimpl2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.security.SecureRandom instanceStrong = java.security.SecureRandom.getInstanceStrong();
        kotlin.jvm.internal.Intrinsics.checkNotNull(instanceStrong);
        this.b = instanceStrong;
        this.c = new javax.crypto.spec.OAEPParameterSpec(net.idrnd.face.iad.capture.internal.z.a(4), net.idrnd.face.iad.capture.internal.z.a(5), new java.security.spec.MGF1ParameterSpec(net.idrnd.face.iad.capture.internal.z.a(4)), javax.crypto.spec.PSource.PSpecified.DEFAULT);
        this.d = net.idrnd.face.iad.capture.internal.z.a(0);
        this.e = net.idrnd.face.iad.capture.internal.z.a(1);
        this.f = 256;
        this.g = 96;
        this.h = 128;
        this.i = net.idrnd.face.iad.capture.internal.z.a(2);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new java.security.spec.X509EncodedKeySpec(bArr));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            kotlin.jvm.internal.Intrinsics.checkNotNull(m23439exceptionOrNullimpl);
            if (!(m23439exceptionOrNullimpl instanceof java.lang.NullPointerException)) {
                throw new net.idrnd.face.iad.capture.internal.w();
            }
            throw new net.idrnd.face.iad.capture.internal.x();
        }
        m23436constructorimpl = kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNull(m23436constructorimpl);
        java.security.spec.X509EncodedKeySpec x509EncodedKeySpec = (java.security.spec.X509EncodedKeySpec) m23436constructorimpl;
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(java.security.KeyFactory.getInstance(this.d).generatePublic(x509EncodedKeySpec));
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
            throw new net.idrnd.face.iad.capture.internal.w();
        }
        java.lang.Object obj = kotlin.Result.m23441isFailureimpl(m23436constructorimpl2) ? null : m23436constructorimpl2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        this.f6954a = (java.security.PublicKey) obj;
    }
}
