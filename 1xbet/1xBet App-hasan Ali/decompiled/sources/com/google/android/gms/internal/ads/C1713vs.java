package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.vs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1713vs {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16055a;

    /* renamed from: b, reason: collision with root package name */
    public final U2.a f16056b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f16057c;

    /* renamed from: d, reason: collision with root package name */
    public final ClientApi f16058d = new ClientApi();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0624Ka f16059e;
    public final C2308a f;

    public C1713vs(Context context, U2.a aVar, ScheduledExecutorService scheduledExecutorService, C2308a c2308a) {
        this.f16055a = context;
        this.f16056b = aVar;
        this.f16057c = scheduledExecutorService;
        this.f = c2308a;
    }

    public static C1219ks b() {
        A7 a7 = F7.f8916w;
        Q2.r rVar = Q2.r.f5053d;
        return new C1219ks(((Long) rVar.f5056c.a(a7)).longValue(), ((Long) rVar.f5056c.a(F7.f8922x)).longValue());
    }

    public final C1174js a(Q2.R0 r02, Q2.O o5) {
        J2.c a5 = J2.c.a(r02.f4936l);
        if (a5 == null) {
            return null;
        }
        int ordinal = a5.ordinal();
        U2.a aVar = this.f16056b;
        Context context = this.f16055a;
        if (ordinal == 1) {
            int i = aVar.f5854m;
            InterfaceC0624Ka interfaceC0624Ka = this.f16059e;
            C1219ks b3 = b();
            return new C1174js(this.f16058d, context, i, interfaceC0624Ka, r02, o5, this.f16057c, b3, this.f, 1);
        }
        if (ordinal == 2) {
            int i5 = aVar.f5854m;
            InterfaceC0624Ka interfaceC0624Ka2 = this.f16059e;
            C1219ks b5 = b();
            return new C1174js(this.f16058d, context, i5, interfaceC0624Ka2, r02, o5, this.f16057c, b5, this.f, 2);
        }
        if (ordinal != 5) {
            return null;
        }
        int i6 = aVar.f5854m;
        InterfaceC0624Ka interfaceC0624Ka3 = this.f16059e;
        C1219ks b6 = b();
        return new C1174js(this.f16058d, context, i6, interfaceC0624Ka3, r02, o5, this.f16057c, b6, this.f, 0);
    }
}
