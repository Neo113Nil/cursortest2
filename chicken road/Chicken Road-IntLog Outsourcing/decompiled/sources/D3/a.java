package D3;

import L3.j;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f437b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f436a = i2;
        this.f437b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f436a) {
            case 0:
                final String str = (String) obj;
                final B.d dVar = (B.d) this.f437b;
                ((List) obj2).forEach(new Consumer() { // from class: D3.b
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        String value = (String) obj3;
                        B.d dVar2 = B.d.this;
                        String name = str;
                        kotlin.jvm.internal.i.e(name, "name");
                        kotlin.jvm.internal.i.e(value, "value");
                        j jVar = (j) dVar2.f108d;
                        jVar.getClass();
                        B0.f.z(name);
                        B0.f.A(value, name);
                        B0.f.i(jVar, name, value);
                    }
                });
                break;
            case 1:
                ((j) this.f437b).e((V2.e) obj, obj2);
                break;
            case 2:
                S2.a aVar = (S2.a) obj;
                j jVar = (j) this.f437b;
                if (aVar != null && !aVar.f2746b.isEmpty() && obj2 != null) {
                    ArrayList arrayList = jVar.f1503a;
                    arrayList.add(aVar);
                    arrayList.add(obj2);
                    break;
                }
                break;
            case 3:
                ((M3.d) this.f437b).l((V2.e) obj, obj2);
                break;
            default:
                ((W2.e) this.f437b).f((V2.e) obj, obj2);
                break;
        }
    }
}
