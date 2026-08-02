package a3;

import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.DD;
import com.google.android.gms.internal.ads.Si;

/* loaded from: classes.dex */
public final class q implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6604a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f6605b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f6606c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f6607d;

    public /* synthetic */ q(CD cd, CD cd2, CD cd3, int i) {
        this.f6604a = i;
        this.f6605b = cd;
        this.f6606c = cd2;
        this.f6607d = cd3;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f6604a) {
            case 0:
                Object obj = (L) this.f6605b.d();
                Object obj2 = (v) this.f6606c.d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                if (((Integer) this.f6607d.d()).intValue() == 2) {
                    obj = obj2;
                }
                return new Si(obj, c0606Hd);
            default:
                return new v((o) this.f6605b.d(), ((Integer) this.f6606c.d()).intValue(), (String) this.f6607d.d());
        }
    }
}
