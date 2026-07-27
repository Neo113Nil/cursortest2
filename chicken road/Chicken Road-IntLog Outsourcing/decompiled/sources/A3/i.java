package A3;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class i implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63a;

    /* renamed from: b, reason: collision with root package name */
    public int f64b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n[] f65c;

    public /* synthetic */ i(n[] nVarArr, int i2) {
        this.f63a = i2;
        this.f65c = nVarArr;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        n nVar;
        n[] nVarArr;
        byte[] bArr;
        n nVar2;
        switch (this.f63a) {
            case 0:
                S2.a aVar = (S2.a) obj;
                int i2 = this.f64b;
                this.f64b = i2 + 1;
                byte[] d6 = aVar.f2746b.isEmpty() ? j.f66a : aVar.d();
                switch (O.j.b(aVar.f2745a)) {
                    case 0:
                        nVar = new n(d6, new f(1, y3.h.f((String) obj2)));
                        break;
                    case 1:
                        nVar = new n(d6, new e(((Boolean) obj2).booleanValue()));
                        break;
                    case 2:
                        nVar = new n(d6, new m(((Long) obj2).longValue()));
                        break;
                    case 3:
                        nVar = new n(d6, new g(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        nVar = new n(d6, d.d((List) obj2, new b(0)));
                        break;
                    case 5:
                        nVar = new n(d6, d.d((List) obj2, new b(1)));
                        break;
                    case 6:
                        nVar = new n(d6, d.d((List) obj2, new b(2)));
                        break;
                    case 7:
                        nVar = new n(d6, d.d((List) obj2, new b(3)));
                        break;
                    case 8:
                        R2.b bVar = (R2.b) obj2;
                        if (bVar.isEmpty()) {
                            nVarArr = j.f67b;
                        } else {
                            n[] nVarArr2 = new n[bVar.size()];
                            bVar.forEach(new i(nVarArr2, 0));
                            nVarArr = nVarArr2;
                        }
                        nVar = new n(d6, new d(new c(nVarArr), (byte) 0));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f65c[i2] = nVar;
                return;
            default:
                V2.e eVar = (V2.e) obj;
                int i3 = this.f64b;
                this.f64b = i3 + 1;
                if (eVar.f3237b.isEmpty()) {
                    bArr = n.f76d;
                } else {
                    bArr = eVar.f3239d;
                    if (bArr == null) {
                        bArr = eVar.f3237b.getBytes(StandardCharsets.UTF_8);
                        eVar.f3239d = bArr;
                    }
                }
                switch (eVar.f3236a.ordinal()) {
                    case 0:
                        nVar2 = new n(bArr, new f(1, y3.h.f((String) obj2)));
                        break;
                    case 1:
                        nVar2 = new n(bArr, new e(((Boolean) obj2).booleanValue()));
                        break;
                    case 2:
                        nVar2 = new n(bArr, new m(((Long) obj2).longValue()));
                        break;
                    case 3:
                        nVar2 = new n(bArr, new g(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        nVar2 = new n(bArr, d.d((List) obj2, new b(0)));
                        break;
                    case 5:
                        nVar2 = new n(bArr, d.d((List) obj2, new b(1)));
                        break;
                    case 6:
                        nVar2 = new n(bArr, d.d((List) obj2, new b(2)));
                        break;
                    case 7:
                        nVar2 = new n(bArr, d.d((List) obj2, new b(3)));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f65c[i3] = nVar2;
                return;
        }
    }
}
