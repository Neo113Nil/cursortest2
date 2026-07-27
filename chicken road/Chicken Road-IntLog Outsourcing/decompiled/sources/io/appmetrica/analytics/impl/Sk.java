package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final String f7475a;

    /* renamed from: b, reason: collision with root package name */
    public final Nk f7476b;

    /* renamed from: c, reason: collision with root package name */
    public final Rk f7477c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f7478d;

    public Sk(Context context, X4 x42) {
        x42.a();
        this.f7475a = "session_extras";
        this.f7476b = new Nk();
        this.f7477c = new Rk();
        this.f7478d = C0662g7.a(context).a(x42);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f7478d.get(this.f7475a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f7476b.toModel(this.f7477c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Nk nk = this.f7476b;
        this.f7477c.getClass();
        return nk.toModel(new Pk());
    }
}
