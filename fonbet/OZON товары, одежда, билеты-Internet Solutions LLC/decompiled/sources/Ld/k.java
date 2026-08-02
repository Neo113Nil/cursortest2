package Ld;

import Ld.j;
import Xd.C4884a;
import Xd.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import je.N;
import kotlin.jvm.internal.Intrinsics;
import pd.C8898a;
import td.InterfaceC9839e;
import td.d0;
import td.p0;
import te.C9865a;
import ud.C10026d;
import ud.InterfaceC10025c;

/* loaded from: classes.dex */
public final class k extends j.a {

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<Sd.f, Xd.g<?>> f16791b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f16792c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC9839e f16793d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Sd.b f16794e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<InterfaceC10025c> f16795f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d0 f16796g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(j jVar, InterfaceC9839e interfaceC9839e, Sd.b bVar, List<InterfaceC10025c> list, d0 d0Var) {
        super();
        this.f16792c = jVar;
        this.f16793d = interfaceC9839e;
        this.f16794e = bVar;
        this.f16795f = list;
        this.f16796g = d0Var;
        this.f16791b = new HashMap<>();
    }

    @Override // Ld.y.a
    public final void a() {
        HashMap<Sd.f, Xd.g<?>> arguments = this.f16791b;
        j jVar = this.f16792c;
        jVar.getClass();
        Sd.b annotationClassId = this.f16794e;
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        boolean z11 = false;
        if (annotationClassId.equals(C8898a.a())) {
            Xd.g<?> gVar = arguments.get(Sd.f.f(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            Xd.t tVar = gVar instanceof Xd.t ? (Xd.t) gVar : null;
            if (tVar != null) {
                t.a b11 = tVar.b();
                t.a.b bVar = b11 instanceof t.a.b ? (t.a.b) b11 : null;
                if (bVar != null) {
                    z11 = jVar.s(bVar.b());
                }
            }
        }
        if (z11 || jVar.s(annotationClassId)) {
            return;
        }
        this.f16795f.add(new C10026d(this.f16793d.q(), arguments, this.f16796g));
    }

    @Override // Ld.j.a
    public final void g(Sd.f fVar, ArrayList<Xd.g<?>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        p0 b11 = Dd.b.b(fVar, this.f16793d);
        if (b11 != null) {
            HashMap<Sd.f, Xd.g<?>> hashMap = this.f16791b;
            List value = C9865a.b(elements);
            N type = b11.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(type, "type");
            hashMap.put(fVar, new Xd.z(value, type));
            return;
        }
        if (this.f16792c.s(this.f16794e) && Intrinsics.d(fVar.b(), AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            ArrayList arrayList = new ArrayList();
            Iterator<Xd.g<?>> it = elements.iterator();
            while (it.hasNext()) {
                Xd.g<?> next = it.next();
                if (next instanceof C4884a) {
                    arrayList.add(next);
                }
            }
            List<InterfaceC10025c> list = this.f16795f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                list.add(((C4884a) it2.next()).b());
            }
        }
    }

    @Override // Ld.j.a
    public final void h(Sd.f fVar, Xd.g<?> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16791b.put(fVar, value);
    }
}
