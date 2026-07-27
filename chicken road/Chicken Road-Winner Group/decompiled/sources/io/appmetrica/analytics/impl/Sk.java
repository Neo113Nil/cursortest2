package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final String f6606a;

    /* renamed from: b, reason: collision with root package name */
    public final Nk f6607b;

    /* renamed from: c, reason: collision with root package name */
    public final Rk f6608c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f6609d;

    public Sk(Context context, X4 x4) {
        x4.a();
        this.f6606a = "session_extras";
        this.f6607b = new Nk();
        this.f6608c = new Rk();
        this.f6609d = C0513g7.a(context).a(x4);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f6609d.get(this.f6606a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f6607b.toModel(this.f6608c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Nk nk = this.f6607b;
        this.f6608c.getClass();
        return nk.toModel(new Pk());
    }
}
