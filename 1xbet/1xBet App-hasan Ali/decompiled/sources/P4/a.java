package P4;

import F3.m;
import O4.AbstractC0266l;
import O4.InterfaceC0267m;
import Q2.C0375o;
import e2.C1930k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class a extends AbstractC0266l {

    /* renamed from: a, reason: collision with root package name */
    public final m f4796a;

    public a(m mVar) {
        this.f4796a = mVar;
    }

    @Override // O4.AbstractC0266l
    public final InterfaceC0267m a(Type type) {
        M3.a aVar = new M3.a(type);
        m mVar = this.f4796a;
        return new b(mVar, mVar.b(aVar));
    }

    @Override // O4.AbstractC0266l
    public final InterfaceC0267m b(Type type, Annotation[] annotationArr, C0375o c0375o) {
        M3.a aVar = new M3.a(type);
        m mVar = this.f4796a;
        return new C1930k(mVar, mVar.b(aVar));
    }
}
