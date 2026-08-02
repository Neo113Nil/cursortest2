package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* renamed from: Ve.cd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4154cd extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final C4363jl f30796a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f30797b;

    public C4154cd(C4363jl lazyNetworkModule, Vm sPayDataContract) {
        Intrinsics.checkNotNullParameter(lazyNetworkModule, "lazyNetworkModule");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        this.f30796a = lazyNetworkModule;
        this.f30797b = sPayDataContract;
    }

    @Override // M1.b
    public final /* bridge */ /* synthetic */ Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        return t((Gd) obj, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Gd gd2, kotlin.coroutines.d dVar) {
        C4813zc c4813zc;
        int i11;
        C4154cd c4154cd;
        Iterator it;
        Map linksWithTitles;
        Pf.f fVar;
        if (dVar instanceof C4813zc) {
            c4813zc = (C4813zc) dVar;
            int i12 = c4813zc.f32648j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4813zc.f32648j = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4813zc.f32646h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4813zc.f32648j;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    c4154cd = this;
                    it = gd2.f29072a.iterator();
                    linksWithTitles = linkedHashMap;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = c4813zc.f32645g;
                    it = c4813zc.f32644f;
                    linksWithTitles = c4813zc.f32643e;
                    c4154cd = c4813zc.f32642d;
                    Sc.s.b(obj);
                    Response response = (Response) obj;
                    if (response.isSuccessful()) {
                        Re re2 = (Re) response.body();
                        String g02 = (re2 == null || (fVar = re2.f29849a) == null) ? null : fVar.g0();
                        if (g02 == null) {
                            g02 = "";
                        }
                        linksWithTitles.put(str, g02);
                    }
                    if (it.hasNext()) {
                        str = (String) it.next();
                        npi.spay.ij ijVar = c4154cd.f30796a.f31379e;
                        if (ijVar == null) {
                            Intrinsics.n("pageTitleApi");
                            throw null;
                        }
                        c4813zc.f32642d = c4154cd;
                        c4813zc.f32643e = linksWithTitles;
                        c4813zc.f32644f = it;
                        c4813zc.f32645g = str;
                        c4813zc.f32648j = 1;
                        obj = ijVar.a(str, c4813zc);
                        if (obj == aVar) {
                            return aVar;
                        }
                        Response response2 = (Response) obj;
                        if (response2.isSuccessful()) {
                        }
                        if (it.hasNext()) {
                            C4654tn c4654tn = (C4654tn) c4154cd.f30797b;
                            c4654tn.getClass();
                            Intrinsics.checkNotNullParameter(linksWithTitles, "linksWithTitles");
                            c4654tn.f32142k.setValue(linksWithTitles);
                            return Unit.f71690a;
                        }
                    }
                }
            }
        }
        c4813zc = new C4813zc(this, dVar);
        Object obj2 = c4813zc.f32646h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4813zc.f32648j;
        if (i11 != 0) {
        }
    }
}
