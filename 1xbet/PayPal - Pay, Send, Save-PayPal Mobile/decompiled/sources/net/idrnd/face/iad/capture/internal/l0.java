package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6981a;

    static {
        kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(net.idrnd.face.iad.capture.internal.l0.class).getSimpleName();
    }

    public l0(android.content.Context context) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.io.InputStream open = context.getAssets().open("30B3C428-8A13-44BA-9D09-036CC8DD3E37.der");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.io.ByteStreamsKt.readBytes(open));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        kotlin.Result.m23441isFailureimpl(m23436constructorimpl);
        this.f6981a = (byte[]) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public final byte[] a(byte[] bArr) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object m23436constructorimpl2;
        java.lang.Object m23436constructorimpl3;
        java.lang.Object m23436constructorimpl4;
        java.lang.Object m23436constructorimpl5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Input data must not be empty.".toString());
        }
        byte[] bArr2 = net.idrnd.face.iad.capture.internal.h2.f6970a;
        if (bArr2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArr2);
        } else {
            bArr2 = this.f6981a;
            if (bArr2 == null) {
                throw new net.idrnd.face.iad.capture.internal.w();
            }
        }
        net.idrnd.face.iad.capture.internal.a0 a0Var = new net.idrnd.face.iad.capture.internal.a0(bArr2);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(a0Var.i);
        javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance(a0Var.e);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cipher.init(1, a0Var.f6954a, a0Var.c);
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            throw new net.idrnd.face.iad.capture.internal.w();
        }
        byte[] bArr3 = new byte[a0Var.f >> 3];
        a0Var.b.nextBytes(bArr3);
        byte[] bArr4 = new byte[a0Var.g >> 3];
        a0Var.b.nextBytes(bArr4);
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        bArr4[0] = (byte) ((currentTimeMillis >> 24) & 255);
        bArr4[1] = (byte) ((currentTimeMillis >> 16) & 255);
        bArr4[2] = (byte) ((currentTimeMillis >> 8) & 255);
        bArr4[3] = (byte) (currentTimeMillis & 255);
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(new javax.crypto.spec.GCMParameterSpec(a0Var.h, bArr4));
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
            throw new net.idrnd.face.iad.capture.internal.w();
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
            m23436constructorimpl2 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(m23436constructorimpl2);
        javax.crypto.spec.GCMParameterSpec gCMParameterSpec = (javax.crypto.spec.GCMParameterSpec) m23436constructorimpl2;
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr3, org.jose4j.keys.AesKey.ALGORITHM);
        try {
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            cipher2.init(1, secretKeySpec, gCMParameterSpec);
            m23436constructorimpl3 = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th3) {
            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
            m23436constructorimpl3 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th3));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl3)) {
            throw new net.idrnd.face.iad.capture.internal.w();
        }
        try {
            kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
            byte[] doFinal = cipher.doFinal(bArr3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(doFinal);
            m23436constructorimpl4 = kotlin.Result.m23436constructorimpl(doFinal);
        } catch (java.lang.Throwable th4) {
            kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
            m23436constructorimpl4 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th4));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl4)) {
            throw new net.idrnd.face.iad.capture.internal.w();
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl4)) {
            m23436constructorimpl4 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(m23436constructorimpl4);
        net.idrnd.face.iad.capture.internal.j0 a2 = net.idrnd.face.iad.capture.internal.k0.a();
        a2.a();
        a2.a(com.google.protobuf.kotlin.ByteStringsKt.toByteString((byte[]) m23436constructorimpl4));
        java.lang.String str = net.idrnd.face.iad.capture.internal.h2.b;
        if (str != null) {
            a2.a(str);
        }
        try {
            kotlin.Result.Companion companion9 = kotlin.Result.INSTANCE;
            m23436constructorimpl5 = kotlin.Result.m23436constructorimpl(cipher2.doFinal(bArr));
        } catch (java.lang.Throwable th5) {
            kotlin.Result.Companion companion10 = kotlin.Result.INSTANCE;
            m23436constructorimpl5 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th5));
        }
        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl5)) {
            if ((kotlin.Result.m23441isFailureimpl(m23436constructorimpl5) ? null : m23436constructorimpl5) != null) {
                java.lang.Object obj = kotlin.Result.m23441isFailureimpl(m23436constructorimpl5) ? null : m23436constructorimpl5;
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                a2.b(com.google.protobuf.kotlin.ByteStringsKt.toByteString(kotlin.collections.ArraysKt.plus(bArr4, (byte[]) obj)));
                byte[] byteArray = ((net.idrnd.face.iad.capture.internal.k0) a2.build()).toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
                return byteArray;
            }
        }
        throw new net.idrnd.face.iad.capture.internal.b0();
    }
}
