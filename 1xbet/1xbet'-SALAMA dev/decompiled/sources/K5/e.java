package K5;

import Y4.D;
import java.util.ArrayList;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f4106c;

    public /* synthetic */ e(ArrayList arrayList, V0 v6, int i7) {
        this.f4104a = i7;
        this.f4105b = arrayList;
        this.f4106c = v6;
    }

    public final void a(i iVar) {
        switch (this.f4104a) {
            case 0:
                this.f4106c.f(D.g0(iVar));
                break;
            default:
                this.f4106c.f(D.g0(iVar));
                break;
        }
    }

    public final void b(Object obj) {
        switch (this.f4104a) {
            case 0:
                ArrayList arrayList = this.f4105b;
                arrayList.add(0, null);
                this.f4106c.f(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f4105b;
                arrayList2.add(0, (j) obj);
                this.f4106c.f(arrayList2);
                break;
        }
    }
}
