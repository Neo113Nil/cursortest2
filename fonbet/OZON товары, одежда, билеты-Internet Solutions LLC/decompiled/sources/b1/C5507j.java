package b1;

import S0.M;
import b1.C5506i;
import java.util.LinkedHashMap;

/* renamed from: b1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5507j implements M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5506i.c f55448a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5506i f55449b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f55450c;

    public C5507j(C5506i.c cVar, C5506i c5506i, Object obj) {
        this.f55448a = cVar;
        this.f55449b = c5506i;
        this.f55450c = obj;
    }

    @Override // S0.M
    public final void dispose() {
        LinkedHashMap linkedHashMap;
        C5506i c5506i = this.f55449b;
        this.f55448a.b(c5506i.f55439a);
        linkedHashMap = c5506i.f55440b;
        linkedHashMap.remove(this.f55450c);
    }
}
