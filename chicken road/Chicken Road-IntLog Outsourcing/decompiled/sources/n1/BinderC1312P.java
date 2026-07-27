package n1;

import android.content.Context;
import android.os.Bundle;
import java.util.Set;
import l.q0;

/* renamed from: n1.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1312P extends G1.c implements m1.i, m1.j {

    /* renamed from: k, reason: collision with root package name */
    public static final E1.f f11332k = F1.b.f675a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11333a;

    /* renamed from: e, reason: collision with root package name */
    public final A1.c f11334e;

    /* renamed from: f, reason: collision with root package name */
    public final E1.f f11335f = f11332k;

    /* renamed from: g, reason: collision with root package name */
    public final Set f11336g;

    /* renamed from: h, reason: collision with root package name */
    public final q0 f11337h;

    /* renamed from: i, reason: collision with root package name */
    public G1.a f11338i;

    /* renamed from: j, reason: collision with root package name */
    public C1303G f11339j;

    public BinderC1312P(Context context, A1.c cVar, q0 q0Var) {
        this.f11333a = context;
        this.f11334e = cVar;
        this.f11337h = q0Var;
        this.f11336g = (Set) q0Var.f10941a;
    }

    @Override // G1.d
    public final void a(G1.g gVar) {
        this.f11334e.post(new RunnableC1302F(this, gVar, 2));
    }

    @Override // m1.i
    public final void onConnected(Bundle bundle) {
        this.f11338i.B(this);
    }

    @Override // m1.j
    public final void onConnectionFailed(l1.b bVar) {
        this.f11339j.b(bVar);
    }

    @Override // m1.i
    public final void onConnectionSuspended(int i2) {
        C1303G c1303g = this.f11339j;
        C1300D c1300d = (C1300D) c1303g.f11316f.f11380j.get(c1303g.f11312b);
        if (c1300d != null) {
            if (c1300d.f11301l) {
                c1300d.m(new l1.b(17));
            } else {
                c1300d.onConnectionSuspended(i2);
            }
        }
    }
}
