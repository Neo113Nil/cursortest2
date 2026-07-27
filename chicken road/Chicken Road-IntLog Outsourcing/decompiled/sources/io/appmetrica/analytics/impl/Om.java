package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes.dex */
public final class Om extends Vm {
    @Override // io.appmetrica.analytics.impl.Vm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C0683h2 c0683h2 = new C0683h2();
        try {
            bArr = AbstractC0803lj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0803lj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Rf("app_permissions_state", iBinaryDataHelper, new F8(c0683h2, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C0580d2(new D2()));
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper f3;
        C0662g7 a6 = C0662g7.a(context);
        synchronized (a6) {
            f3 = a6.f();
        }
        return f3;
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final IBinaryDataHelper a(Context context) {
        return C0662g7.a(context).g();
    }
}
