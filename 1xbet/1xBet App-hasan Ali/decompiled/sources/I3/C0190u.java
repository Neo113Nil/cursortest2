package I3;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;

/* renamed from: I3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190u extends F3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2684a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2685b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2686c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2687d;

    public C0190u(F3.m mVar, F3.y yVar, Type type) {
        this.f2684a = 0;
        this.f2685b = mVar;
        this.f2686c = yVar;
        this.f2687d = type;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        switch (this.f2684a) {
            case 0:
                return ((F3.y) this.f2686c).a(aVar);
            default:
                if (aVar.K() == 9) {
                    aVar.G();
                    return null;
                }
                String I5 = aVar.I();
                Enum r02 = (Enum) ((HashMap) this.f2685b).get(I5);
                return r02 == null ? (Enum) ((HashMap) this.f2686c).get(I5) : r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if ((r1 instanceof I3.AbstractC0185o) == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // F3.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(N3.b bVar, Object obj) {
        F3.y c5;
        switch (this.f2684a) {
            case 0:
                ?? r02 = (Type) this.f2687d;
                Class<?> cls = (obj == null || !((r02 instanceof Class) || (r02 instanceof TypeVariable))) ? r02 : obj.getClass();
                F3.y yVar = (F3.y) this.f2686c;
                if (cls != r02) {
                    F3.y b3 = ((F3.m) this.f2685b).b(new M3.a(cls));
                    if (b3 instanceof AbstractC0185o) {
                        F3.y yVar2 = yVar;
                        while ((yVar2 instanceof AbstractC0189t) && (c5 = ((AbstractC0189t) yVar2).c()) != yVar2) {
                            yVar2 = c5;
                        }
                        break;
                    }
                    yVar = b3;
                }
                yVar.b(bVar, obj);
                break;
            default:
                Enum r6 = (Enum) obj;
                bVar.E(r6 == null ? null : (String) ((HashMap) this.f2687d).get(r6));
                break;
        }
    }

    public C0190u(Class cls) {
        this.f2684a = 1;
        this.f2685b = new HashMap();
        this.f2686c = new HashMap();
        this.f2687d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new b0(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                G3.b bVar = (G3.b) field.getAnnotation(G3.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.f2685b).put(str2, r42);
                    }
                }
                ((HashMap) this.f2685b).put(name, r42);
                ((HashMap) this.f2686c).put(str, r42);
                ((HashMap) this.f2687d).put(r42, name);
            }
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
