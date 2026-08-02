package I3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: I3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184n {

    /* renamed from: a, reason: collision with root package name */
    public final String f2664a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f2665b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f2667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F3.y f2668e;
    public final /* synthetic */ F3.y f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f2669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2670h;

    public C0184n(String str, Field field, Method method, F3.y yVar, F3.y yVar2, boolean z3, boolean z5) {
        this.f2667d = method;
        this.f2668e = yVar;
        this.f = yVar2;
        this.f2669g = z3;
        this.f2670h = z5;
        this.f2664a = str;
        this.f2665b = field;
        this.f2666c = field.getName();
    }

    public final void a(N3.b bVar, Object obj) {
        Object obj2;
        Field field = this.f2665b;
        Method method = this.f2667d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e3) {
                throw new F3.p(L1.a.n("Accessor ", K3.c.d(method, false), " threw exception"), e3.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.l(this.f2664a);
        this.f2668e.b(bVar, obj2);
    }
}
