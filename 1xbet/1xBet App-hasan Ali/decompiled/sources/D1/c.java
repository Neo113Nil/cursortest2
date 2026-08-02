package D1;

import Q1.j;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c extends b {
    public c(b bVar) {
        l.f("initialExtras", bVar);
        LinkedHashMap linkedHashMap = bVar.f924a;
        l.f("initialExtras", linkedHashMap);
        this.f924a.putAll(linkedHashMap);
    }

    @Override // D1.b
    public final Object a(j jVar) {
        return this.f924a.get(jVar);
    }

    public /* synthetic */ c() {
        this(a.f923b);
    }
}
