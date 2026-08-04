package p067j1;

import android.os.Build;
import p072k1.d;
import p088m1.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i7) {
        super(dVar);
        this.f14551e = i7;
    }

    @Override // p067j1.b
    public final boolean a(i iVar) {
        switch (this.f14551e) {
            case 0:
                return iVar.j.f12350b;
            case 1:
                return iVar.j.f12352d;
            case 2:
                return iVar.j.f12349a == 2;
            case 3:
                int i7 = iVar.j.f12349a;
                return i7 == 3 || (Build.VERSION.SDK_INT >= 30 && i7 == 6);
            default:
                return iVar.j.f12353e;
        }
    }

    @Override // p067j1.b
    public final boolean b(Object obj) {
        switch (this.f14551e) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                p060i1.a aVar = (p060i1.a) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    return (aVar.f13835a && aVar.f13836b) ? false : true;
                }
                return true ^ aVar.f13835a;
            case 3:
                p060i1.a aVar2 = (p060i1.a) obj;
                return !aVar2.f13835a || aVar2.f13837c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
