package A4;

import T4.m;
import java.util.Iterator;
import u4.InterfaceC1481a;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f99b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f98a = i2;
        this.f99b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f98a) {
            case 0:
                return new B4.b((B4.c) this.f99b);
            default:
                Object[] array = (Object[]) ((m) this.f99b).f2908b;
                kotlin.jvm.internal.i.e(array, "array");
                return new b(new N4.g(array));
        }
    }
}
