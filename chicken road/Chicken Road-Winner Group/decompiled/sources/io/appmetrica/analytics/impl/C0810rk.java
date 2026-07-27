package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810rk extends Qc {

    /* renamed from: a, reason: collision with root package name */
    public final yo f8243a;

    public C0810rk() {
        this(C0878ua.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final void a(int i3) {
        yo yoVar = this.f8243a;
        synchronized (yoVar) {
            Ao ao = yoVar.f8651a;
            ao.a(ao.a().put("last_migration_api_level", i3));
        }
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final int b() {
        int optInt;
        yo yoVar = this.f8243a;
        synchronized (yoVar) {
            optInt = yoVar.f8651a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final SparseArray<Pc> c() {
        SparseArray<Pc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0836sk(this.f8243a));
        sparseArray.put(115, new C0862tk());
        sparseArray.put(BuildConfig.API_LEVEL, new C0966xk());
        return sparseArray;
    }

    public C0810rk(yo yoVar) {
        this.f8243a = yoVar;
    }
}
