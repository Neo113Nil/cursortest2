package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes.dex */
public final class Rm extends Vm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtobufStateSerializer f6535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProtobufConverter f6536c;

    public Rm(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.f6534a = str;
        this.f6535b = protobufStateSerializer;
        this.f6536c = protobufConverter;
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        String str = this.f6534a;
        ProtobufStateSerializer protobufStateSerializer = this.f6535b;
        try {
            bArr = AbstractC0654lj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0654lj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Rf(str, iBinaryDataHelper, new F8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), this.f6536c);
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper f;
        C0513g7 a3 = C0513g7.a(context);
        synchronized (a3) {
            f = a3.f();
        }
        return f;
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final IBinaryDataHelper a(Context context) {
        return C0513g7.a(context).g();
    }
}
