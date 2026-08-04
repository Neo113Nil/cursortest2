package K5;

import Y4.D;
import java.util.ArrayList;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f4109c;

    public /* synthetic */ f(ArrayList arrayList, V0 v6, int i7) {
        this.f4107a = i7;
        this.f4108b = arrayList;
        this.f4109c = v6;
    }

    public final void a(i iVar) {
        switch (this.f4107a) {
            case 0:
                this.f4109c.f(D.g0(iVar));
                break;
            default:
                this.f4109c.f(D.g0(iVar));
                break;
        }
    }

    public final void b(Object obj) {
        switch (this.f4107a) {
            case 0:
                ArrayList arrayList = this.f4108b;
                arrayList.add(0, (String) obj);
                this.f4109c.f(arrayList);
                break;
            default:
                ArrayList arrayList2 = this.f4108b;
                arrayList2.add(0, (l) obj);
                this.f4109c.f(arrayList2);
                break;
        }
    }
}
