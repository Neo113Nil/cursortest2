package G4;

import B4.C0057a;
import B4.C0059c;
import B4.C0061e;
import B4.C0062f;
import B4.C0074s;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2881a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2885e;

    public /* synthetic */ F(C0061e c0061e, int i7, List list, E5.r rVar) {
        this.f2883c = c0061e;
        this.f2882b = i7;
        this.f2884d = list;
        this.f2885e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2881a) {
            case 0:
                android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f2883c;
                byte[] bArr = (byte[]) this.f2884d;
                int i7 = this.f2882b;
                Map map = (Map) this.f2885e;
                I4.d dVarX = tVar.X(i7, bArr);
                synchronized (map) {
                    map.put(dVarX.f3665b.f3670a, dVarX);
                    break;
                }
                return;
            default:
                C0061e c0061e = (C0061e) this.f2883c;
                int i8 = this.f2882b;
                List<H5.g> list = (List) this.f2884d;
                E5.r rVar = (E5.r) this.f2885e;
                HashMap map2 = H5.e.f3360y;
                try {
                    if (p136t.e.e(i8) != 0) {
                        throw new IllegalArgumentException("Unknown AggregateSource value: ".concat(i8 != 1 ? "null" : "SERVER"));
                    }
                    C0062f c0062f = (C0062f) Tasks.await(c0061e.a());
                    ArrayList arrayList = new ArrayList();
                    for (H5.g gVar : list) {
                        int iE = p136t.e.e(gVar.f3370a);
                        if (iE == 0) {
                            Double dValueOf = Double.valueOf(c0062f.a());
                            H5.h hVar = new H5.h();
                            hVar.a(1);
                            hVar.f3373b = null;
                            hVar.f3374c = dValueOf;
                            arrayList.add(hVar);
                        } else if (iE == 1) {
                            Object objB = c0062f.b(new C0059c(C0074s.a(gVar.f3371b), "sum"));
                            Objects.requireNonNull(objB);
                            Double dValueOf2 = Double.valueOf(((Number) objB).doubleValue());
                            String str = gVar.f3371b;
                            H5.h hVar2 = new H5.h();
                            hVar2.a(2);
                            hVar2.f3373b = str;
                            hVar2.f3374c = dValueOf2;
                            arrayList.add(hVar2);
                        } else if (iE == 2) {
                            Number number = (Number) c0062f.c(new C0057a(C0074s.a(gVar.f3371b), "average"));
                            Double dValueOf3 = number != null ? Double.valueOf(number.doubleValue()) : null;
                            String str2 = gVar.f3371b;
                            H5.h hVar3 = new H5.h();
                            hVar3.a(3);
                            hVar3.f3373b = str2;
                            hVar3.f3374c = dValueOf3;
                            arrayList.add(hVar3);
                        }
                    }
                    rVar.success(arrayList);
                    return;
                } catch (Exception e7) {
                    Y4.D.R(rVar, e7);
                    return;
                }
        }
    }

    public /* synthetic */ F(android.support.v4.media.session.t tVar, byte[] bArr, int i7, Map map) {
        this.f2883c = tVar;
        this.f2884d = bArr;
        this.f2882b = i7;
        this.f2885e = map;
    }
}
