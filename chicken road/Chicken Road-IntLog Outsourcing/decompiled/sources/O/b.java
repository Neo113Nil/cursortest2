package O;

import Q4.AbstractC0149c;
import Q4.u;
import R4.m;
import android.content.Context;
import f4.v;
import g4.C0472q;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import m0.C1267b;
import n0.InterfaceC1296a;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i2, Object obj2) {
        super(0);
        this.f2195e = i2;
        this.f2196f = obj;
        this.f2197g = obj2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        String[] names;
        switch (this.f2195e) {
            case 0:
                Context context = (Context) this.f2196f;
                ((c) this.f2197g).getClass();
                String fileName = "FlutterSharedPreferences".concat(".preferences_pb");
                kotlin.jvm.internal.i.e(fileName, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
            case 1:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC0149c abstractC0149c = (AbstractC0149c) this.f2197g;
                Q4.j jVar = abstractC0149c.f2501a;
                N4.e eVar = (N4.e) this.f2196f;
                boolean z = jVar.f2538m && kotlin.jvm.internal.i.a(eVar.c(), N4.i.f2189c);
                m.j(eVar, abstractC0149c);
                int d6 = eVar.d();
                for (int i2 = 0; i2 < d6; i2++) {
                    List g6 = eVar.g(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : g6) {
                        if (obj instanceof u) {
                            arrayList.add(obj);
                        }
                    }
                    String str = null;
                    u uVar = (u) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (uVar != null && (names = uVar.names()) != null) {
                        for (String str2 : names) {
                            if (z) {
                                str2 = str2.toLowerCase(Locale.ROOT);
                                kotlin.jvm.internal.i.d(str2, "toLowerCase(...)");
                            }
                            m.c(linkedHashMap, eVar, str2, i2);
                        }
                    }
                    if (z) {
                        str = eVar.e(i2).toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(str, "toLowerCase(...)");
                    }
                    if (str != null) {
                        m.c(linkedHashMap, eVar, str, i2);
                    }
                }
                return linkedHashMap.isEmpty() ? C0472q.f5751a : linkedHashMap;
            default:
                ((InterfaceC1296a) ((C1267b) this.f2196f).f11097b).a((m0.i) this.f2197g);
                return v.f5689a;
        }
    }
}
