package I3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: I3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172b extends F3.y {

    /* renamed from: c, reason: collision with root package name */
    public static final C0171a f2611c = new C0171a();

    /* renamed from: a, reason: collision with root package name */
    public final Class f2612a;

    /* renamed from: b, reason: collision with root package name */
    public final C0190u f2613b;

    public C0172b(F3.m mVar, F3.y yVar, Class cls) {
        this.f2613b = new C0190u(mVar, yVar, cls);
        this.f2612a = cls;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.n()) {
            arrayList.add(((F3.y) this.f2613b.f2686c).a(aVar));
        }
        aVar.i();
        int size = arrayList.size();
        Class cls = this.f2612a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        if (obj == null) {
            bVar.n();
            return;
        }
        bVar.d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f2613b.b(bVar, Array.get(obj, i));
        }
        bVar.i();
    }
}
