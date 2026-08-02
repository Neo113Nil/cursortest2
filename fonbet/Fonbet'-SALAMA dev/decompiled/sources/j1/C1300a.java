package j1;

import android.os.Build;
import i1.C1242a;
import k1.AbstractC1332d;
import m1.i;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300a extends AbstractC1301b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14545e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1300a(AbstractC1332d abstractC1332d, int i7) {
        super(abstractC1332d);
        this.f14545e = i7;
    }

    @Override // j1.AbstractC1301b
    public final boolean a(i iVar) {
        switch (this.f14545e) {
            case 0:
                return iVar.j.f12344b;
            case 1:
                return iVar.j.f12346d;
            case 2:
                return iVar.j.f12343a == 2;
            case 3:
                int i7 = iVar.j.f12343a;
                return i7 == 3 || (Build.VERSION.SDK_INT >= 30 && i7 == 6);
            default:
                return iVar.j.f12347e;
        }
    }

    @Override // j1.AbstractC1301b
    public final boolean b(Object obj) {
        switch (this.f14545e) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C1242a c1242a = (C1242a) obj;
                return Build.VERSION.SDK_INT >= 26 ? (c1242a.f13829a && c1242a.f13830b) ? false : true : true ^ c1242a.f13829a;
            case 3:
                C1242a c1242a2 = (C1242a) obj;
                return !c1242a2.f13829a || c1242a2.f13831c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
