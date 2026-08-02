package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1659uj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15891a;

    /* renamed from: b, reason: collision with root package name */
    public final C1745wf f15892b;

    public /* synthetic */ C1659uj(C1745wf c1745wf, int i) {
        this.f15891a = i;
        this.f15892b = c1745wf;
    }

    public Qo a() {
        U2.a a5 = this.f15892b.a();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Qo(a5, c0606Hd);
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15891a) {
            case 0:
                U2.a a5 = this.f15892b.a();
                T2.L l5 = P2.o.f4767B.f4771c;
                return new J5(UUID.randomUUID().toString(), a5, "native", new JSONObject(), true);
            default:
                return a();
        }
    }
}
