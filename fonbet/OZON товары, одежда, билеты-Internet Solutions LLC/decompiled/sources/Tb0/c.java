package Tb0;

import Bb0.a;
import Sc.o;
import Tb0.a;

/* loaded from: classes3.dex */
public final class c extends a.AbstractC0081a {

    /* renamed from: a, reason: collision with root package name */
    private final Ab0.a f26983a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26984b;

    c(a aVar) {
        Fb0.f fVar;
        Ab0.a aVar2;
        Fb0.f fVar2;
        fVar = aVar.f26977b;
        int i11 = a.b.f26979a[fVar.getPrimaryDomain().ordinal()];
        if (i11 == 1) {
            aVar2 = Ab0.a.OZON_RU;
        } else if (i11 == 2) {
            aVar2 = Ab0.a.OZONRU_CN;
        } else if (i11 == 3) {
            aVar2 = Ab0.a.OZONRU_ME;
        } else {
            if (i11 != 4) {
                throw new o();
            }
            aVar2 = Ab0.a.OZONRUCN_ME;
        }
        this.f26983a = aVar2;
        fVar2 = aVar.f26977b;
        this.f26984b = fVar2.getUserAgent();
    }

    public final Ab0.a a() {
        return this.f26983a;
    }

    public final String b() {
        return this.f26984b;
    }
}
