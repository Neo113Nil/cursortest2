package I3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import r3.AbstractC2349a;

/* renamed from: I3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188s implements F3.z {

    /* renamed from: k, reason: collision with root package name */
    public final j3.i f2680k;

    /* renamed from: l, reason: collision with root package name */
    public final F3.h f2681l;

    /* renamed from: m, reason: collision with root package name */
    public final H3.i f2682m;

    /* renamed from: n, reason: collision with root package name */
    public final C0179i f2683n;

    public C0188s(j3.i iVar, F3.h hVar, H3.i iVar2, C0179i c0179i) {
        List list = Collections.EMPTY_LIST;
        this.f2680k = iVar;
        this.f2681l = hVar;
        this.f2682m = iVar2;
        this.f2683n = c0179i;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + K3.c.c(field) + " and " + K3.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // F3.z
    public final F3.y a(F3.m mVar, M3.a aVar) {
        Class cls = aVar.f3616a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC2349a abstractC2349a = K3.c.f2892a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new F3.j(2);
        }
        List list = Collections.EMPTY_LIST;
        H3.d.f();
        return K3.c.f2892a.H(cls) ? new r(cls, c(mVar, aVar, cls, true)) : new C0186p(this.f2680k.r(aVar), c(mVar, aVar, cls, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0190, code lost:
    
        r10 = new M3.a(H3.d.j(r1, r11, r11.getGenericSuperclass(), new java.util.HashMap()));
        r11 = r10.f3616a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b3  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0187q c(F3.m mVar, M3.a aVar, Class cls, boolean z3) {
        boolean z5;
        Method method;
        G3.b bVar;
        boolean z6;
        List list;
        List singletonList;
        String str;
        G3.a aVar2;
        boolean z7;
        Field field;
        List<String> list2;
        F3.m mVar2;
        F3.y yVar;
        Field field2;
        C0184n c0184n;
        if (cls.isInterface()) {
            return C0187q.f2673c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        M3.a aVar3 = aVar;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                List list3 = Collections.EMPTY_LIST;
                H3.d.f();
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i = 0;
            while (true) {
                Type type = aVar3.f3617b;
                if (i < length) {
                    Field field3 = declaredFields[i];
                    boolean d5 = d(field3, true);
                    boolean d6 = d(field3, r14);
                    if (d5 || d6) {
                        if (!z3) {
                            z5 = d6;
                        } else if (Modifier.isStatic(field3.getModifiers())) {
                            z5 = r14;
                        } else {
                            Method w5 = K3.c.f2892a.w(cls2, field3);
                            K3.c.f(w5);
                            if (w5.getAnnotation(G3.b.class) != null && field3.getAnnotation(G3.b.class) == null) {
                                throw new F3.p(L1.a.n("@SerializedName on ", K3.c.d(w5, r14), " is not supported"));
                            }
                            z5 = d6;
                            method = w5;
                            if (method == null) {
                                K3.c.f(field3);
                            }
                            Type j5 = H3.d.j(type, cls2, field3.getGenericType(), new HashMap());
                            bVar = (G3.b) field3.getAnnotation(G3.b.class);
                            if (bVar != null) {
                                singletonList = Collections.singletonList(this.f2681l.b(field3));
                            } else {
                                String value = bVar.value();
                                String[] alternate = bVar.alternate();
                                if (alternate.length == 0) {
                                    singletonList = Collections.singletonList(value);
                                } else {
                                    z6 = true;
                                    ArrayList arrayList = new ArrayList(alternate.length + 1);
                                    arrayList.add(value);
                                    Collections.addAll(arrayList, alternate);
                                    list = arrayList;
                                    str = (String) list.get(r14);
                                    M3.a aVar4 = new M3.a(j5);
                                    Class cls3 = aVar4.f3616a;
                                    boolean z8 = (cls3 == null && cls3.isPrimitive()) ? z6 : r14;
                                    int modifiers = field3.getModifiers();
                                    boolean z9 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r14 : z6;
                                    aVar2 = (G3.a) field3.getAnnotation(G3.a.class);
                                    if (aVar2 != null) {
                                        field = field3;
                                        z7 = z6;
                                        list2 = list;
                                        mVar2 = mVar;
                                        yVar = this.f2683n.b(this.f2680k, mVar2, aVar4, aVar2, false);
                                    } else {
                                        z7 = z6;
                                        field = field3;
                                        list2 = list;
                                        mVar2 = mVar;
                                        yVar = null;
                                    }
                                    if (yVar == null) {
                                        z7 = r14;
                                    }
                                    if (yVar == null) {
                                        yVar = mVar2.b(aVar4);
                                    }
                                    C0184n c0184n2 = new C0184n(str, field, method, d5 ? z7 ? yVar : new C0190u(mVar2, yVar, aVar4.f3617b) : yVar, yVar, z8, z9);
                                    field2 = field;
                                    if (z5) {
                                        for (String str2 : list2) {
                                            C0184n c0184n3 = (C0184n) linkedHashMap.put(str2, c0184n2);
                                            if (c0184n3 != null) {
                                                b(cls, str2, c0184n3.f2665b, field2);
                                                throw null;
                                            }
                                        }
                                    }
                                    if (!d5 && (c0184n = (C0184n) linkedHashMap2.put(str, c0184n2)) != null) {
                                        b(cls, str, c0184n.f2665b, field2);
                                        throw null;
                                    }
                                }
                            }
                            z6 = true;
                            list = singletonList;
                            str = (String) list.get(r14);
                            M3.a aVar42 = new M3.a(j5);
                            Class cls32 = aVar42.f3616a;
                            if (cls32 == null) {
                            }
                            int modifiers2 = field3.getModifiers();
                            if (Modifier.isStatic(modifiers2)) {
                            }
                            aVar2 = (G3.a) field3.getAnnotation(G3.a.class);
                            if (aVar2 != null) {
                            }
                            if (yVar == null) {
                            }
                            if (yVar == null) {
                            }
                            if (d5) {
                            }
                            C0184n c0184n22 = new C0184n(str, field, method, d5 ? z7 ? yVar : new C0190u(mVar2, yVar, aVar42.f3617b) : yVar, yVar, z8, z9);
                            field2 = field;
                            if (z5) {
                            }
                            if (!d5) {
                                b(cls, str, c0184n.f2665b, field2);
                                throw null;
                            }
                            continue;
                        }
                        method = null;
                        if (method == null) {
                        }
                        Type j52 = H3.d.j(type, cls2, field3.getGenericType(), new HashMap());
                        bVar = (G3.b) field3.getAnnotation(G3.b.class);
                        if (bVar != null) {
                        }
                        z6 = true;
                        list = singletonList;
                        str = (String) list.get(r14);
                        M3.a aVar422 = new M3.a(j52);
                        Class cls322 = aVar422.f3616a;
                        if (cls322 == null) {
                        }
                        int modifiers22 = field3.getModifiers();
                        if (Modifier.isStatic(modifiers22)) {
                        }
                        aVar2 = (G3.a) field3.getAnnotation(G3.a.class);
                        if (aVar2 != null) {
                        }
                        if (yVar == null) {
                        }
                        if (yVar == null) {
                        }
                        if (d5) {
                        }
                        C0184n c0184n222 = new C0184n(str, field, method, d5 ? z7 ? yVar : new C0190u(mVar2, yVar, aVar422.f3617b) : yVar, yVar, z8, z9);
                        field2 = field;
                        if (z5) {
                        }
                        if (!d5) {
                        }
                    }
                    i++;
                    r14 = 0;
                }
            }
        }
        return new C0187q(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final boolean d(Field field, boolean z3) {
        boolean z5;
        H3.i iVar = this.f2682m;
        iVar.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || iVar.b(field.getType(), z3)) {
            z5 = true;
        } else {
            List list = z3 ? iVar.f2329k : iVar.f2330l;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z5 = false;
        }
        return !z5;
    }
}
