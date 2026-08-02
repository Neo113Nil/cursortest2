package Cd;

import de.InterfaceC6188g;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.C9852r;
import td.InterfaceC9820K;
import td.InterfaceC9845k;
import td.InterfaceC9849o;
import td.s0;
import xd.C10705a;
import xd.C10706b;
import xd.C10707c;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f4782a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f4783b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f4784c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final HashMap f4785d;

    static class a extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k != null) {
                return w.d(interfaceC9849o, interfaceC9845k);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
        }
    }

    static class b extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k != null) {
                return w.c(interfaceC6188g, interfaceC9849o, interfaceC9845k);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
        }
    }

    static class c extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k != null) {
                return w.c(interfaceC6188g, interfaceC9849o, interfaceC9845k);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    static {
        a aVar = new a(C10705a.f105369c);
        f4782a = aVar;
        b bVar = new b(C10707c.f105371c);
        f4783b = bVar;
        c cVar = new c(C10706b.f105370c);
        f4784c = cVar;
        HashMap hashMap = new HashMap();
        f4785d = hashMap;
        hashMap.put(aVar.a(), aVar);
        hashMap.put(bVar.a(), bVar);
        hashMap.put(cVar.a(), cVar);
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 6) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i11 == 5 || i11 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i11 == 2 || i11 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i11 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i11 != 5 && i11 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    static boolean c(InterfaceC6188g interfaceC6188g, InterfaceC9849o interfaceC9849o, InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k == null) {
            a(1);
            throw null;
        }
        if (d(Vd.i.G(interfaceC9849o), interfaceC9845k)) {
            return true;
        }
        return C9852r.f99401c.c(interfaceC6188g, interfaceC9849o, interfaceC9845k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(@NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9849o == null) {
            a(2);
            throw null;
        }
        if (interfaceC9845k == null) {
            a(3);
            throw null;
        }
        InterfaceC9820K interfaceC9820K = (InterfaceC9820K) Vd.i.n(interfaceC9849o, InterfaceC9820K.class, false);
        InterfaceC9820K interfaceC9820K2 = (InterfaceC9820K) Vd.i.n(interfaceC9845k, InterfaceC9820K.class, false);
        return (interfaceC9820K2 == null || interfaceC9820K == null || !interfaceC9820K.c().equals(interfaceC9820K2.c())) ? false : true;
    }

    @NotNull
    public static AbstractC9853s e(@NotNull s0 s0Var) {
        if (s0Var != null) {
            AbstractC9853s abstractC9853s = (AbstractC9853s) f4785d.get(s0Var);
            return abstractC9853s == null ? C9852r.j(s0Var) : abstractC9853s;
        }
        a(4);
        throw null;
    }
}
