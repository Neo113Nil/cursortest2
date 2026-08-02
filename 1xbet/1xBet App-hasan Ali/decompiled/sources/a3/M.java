package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C0769ao;
import com.google.android.gms.internal.ads.C0951es;
import com.google.android.gms.internal.ads.C1074hg;
import com.google.android.gms.internal.ads.C1392ol;
import com.google.android.gms.internal.ads.C1521rg;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.C1705vk;
import com.google.android.gms.internal.ads.C1746wg;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.DD;
import com.google.android.gms.internal.ads.G7;
import com.google.android.gms.internal.ads.InterfaceC0896dh;
import com.google.android.gms.internal.ads.J5;
import com.google.android.gms.internal.ads.S7;
import com.google.android.gms.internal.ads.Ti;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q3.C2308a;

/* loaded from: classes.dex */
public final class M implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6512a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f6513b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f6514c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f6515d;

    /* renamed from: e, reason: collision with root package name */
    public final CD f6516e;

    public /* synthetic */ M(CD cd, CD cd2, CD cd3, CD cd4, int i) {
        this.f6512a = i;
        this.f6513b = cd;
        this.f6514c = cd2;
        this.f6515d = cd3;
        this.f6516e = cd4;
    }

    public G7 a() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new G7(c0606Hd, (ScheduledExecutorService) this.f6513b.d(), (InterfaceC0896dh) this.f6514c.d(), (C0769ao) this.f6515d.d(), (C0951es) this.f6516e.d());
    }

    public S7 b() {
        return new S7((ScheduledExecutorService) this.f6513b.d(), (F) this.f6514c.d(), (A) this.f6515d.d(), (C1616tl) this.f6516e.d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f6512a) {
            case 0:
                return new L((C1392ol) this.f6513b.d(), (K) this.f6514c.d(), (String) this.f6515d.d(), ((Integer) this.f6516e.d()).intValue());
            case 1:
                return b();
            case 2:
                J5 j5 = (J5) this.f6513b.d();
                Executor executor = (Executor) this.f6514c.d();
                Context context = (Context) this.f6515d.d();
                return new C1746wg(executor, new C1521rg(context, j5), (C2308a) this.f6516e.d());
            case 3:
                return new C1705vk((Executor) this.f6513b.d(), (C1746wg) this.f6514c.d(), (Ti) this.f6515d.d(), (C1074hg) this.f6516e.d());
            default:
                return a();
        }
    }
}
