package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C1565sf;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.C1745wf;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.DD;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.ID;

/* loaded from: classes.dex */
public final class B implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6470a;

    /* renamed from: b, reason: collision with root package name */
    public final C1565sf f6471b;

    /* renamed from: c, reason: collision with root package name */
    public final ID f6472c;

    public /* synthetic */ B(C1565sf c1565sf, ID id, int i) {
        this.f6470a = i;
        this.f6471b = c1565sf;
        this.f6472c = id;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        ID id = this.f6472c;
        C1565sf c1565sf = this.f6471b;
        switch (this.f6470a) {
            case 0:
                Context a5 = c1565sf.a();
                A7 a7 = F7.f8796a;
                return new A(a5, Q2.r.f5053d.f5054a.n(), ((C1745wf) id).a());
            case 1:
                return new v3.e((Context) c1565sf.d(), (U2.a) ((C1745wf) id).d());
            default:
                Context a6 = c1565sf.a();
                C1616tl c1616tl = (C1616tl) ((CD) id).d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new F(a6, c1616tl, c0606Hd);
        }
    }
}
