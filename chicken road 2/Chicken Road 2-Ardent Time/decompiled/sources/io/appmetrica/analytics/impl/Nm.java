package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nm extends io.appmetrica.analytics.impl.Rm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer f4746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter f4747c;

    public Nm(java.lang.String str, io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer protobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter protobufConverter) {
        this.f4745a = str;
        this.f4746b = protobufStateSerializer;
        this.f4747c = protobufConverter;
    }

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
        java.lang.String str = this.f4745a;
        io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer protobufStateSerializer = this.f4746b;
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
        return new io.appmetrica.analytics.impl.Mf(str, iBinaryDataHelper, new io.appmetrica.analytics.impl.A8(protobufStateSerializer, new io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter(io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), this.f4747c);
    }
}
