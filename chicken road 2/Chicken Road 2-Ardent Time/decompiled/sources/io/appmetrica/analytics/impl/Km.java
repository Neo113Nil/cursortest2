package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Km extends io.appmetrica.analytics.impl.Rm {
    @Override // io.appmetrica.analytics.impl.Rm
    public final io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper a(android.content.Context context) {
        return io.appmetrica.analytics.impl.C0560na.f6484I.B().b(context);
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper b(android.content.Context context) {
        io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper a2;
        io.appmetrica.analytics.impl.C0855yk B2 = io.appmetrica.analytics.impl.C0560na.f6484I.B();
        synchronized (B2) {
            a2 = B2.a(context);
        }
        return a2;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage a(android.content.Context context, io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        io.appmetrica.analytics.impl.Y1 y12 = new io.appmetrica.analytics.impl.Y1();
        try {
            bArr = io.appmetrica.analytics.impl.AbstractC0388gj.a(context.getPackageName());
        } catch (java.lang.Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = io.appmetrica.analytics.impl.AbstractC0388gj.a(new java.lang.StringBuilder(context.getPackageName()).reverse().toString());
        } catch (java.lang.Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new io.appmetrica.analytics.impl.Mf("app_permissions_state", iBinaryDataHelper, new io.appmetrica.analytics.impl.A8(y12, new io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter(io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new io.appmetrica.analytics.impl.U1(new io.appmetrica.analytics.impl.C0759v2()));
    }
}
