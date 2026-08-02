package a3;

import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C0936ed;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.DD;
import com.google.android.gms.internal.ads.ID;

/* loaded from: classes.dex */
public final class t implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6618a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f6619b;

    public /* synthetic */ t(ID id, int i) {
        this.f6618a = i;
        this.f6619b = id;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f6618a) {
            case 0:
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new s(c0606Hd, ((C0936ed) this.f6619b).a());
            default:
                return new K((C1616tl) ((CD) this.f6619b).d());
        }
    }
}
