package n4;

import K0.C0196a;
import java.util.Iterator;
import o4.C2224b;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18482a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18483b;

    /* renamed from: c, reason: collision with root package name */
    public final W3.c f18484c;

    public /* synthetic */ f(Object obj, i4.c cVar, int i) {
        this.f18482a = i;
        this.f18483b = obj;
        this.f18484c = cVar;
    }

    @Override // n4.g
    public final Iterator iterator() {
        switch (this.f18482a) {
            case 0:
                return new e(this);
            case 1:
                return new V.c(this);
            default:
                return new C2224b(this);
        }
    }

    public f(String str, C0196a c0196a) {
        this.f18482a = 2;
        kotlin.jvm.internal.l.f("input", str);
        this.f18483b = str;
        this.f18484c = c0196a;
    }
}
