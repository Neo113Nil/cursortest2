package Gd;

import Jd.InterfaceC3390A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import org.jetbrains.annotations.NotNull;

/* renamed from: Gd.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3072b implements InterfaceC3073c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Jd.g f10005a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Jd.p, Boolean> f10006b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Jd.q, Boolean> f10007c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f10008d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f10009e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f10010f;

    /* JADX WARN: Multi-variable type inference failed */
    public C3072b(@NotNull Jd.g jClass, @NotNull Function1<? super Jd.p, Boolean> memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.f10005a = jClass;
        this.f10006b = memberFilter;
        C3071a c3071a = new C3071a(this);
        this.f10007c = c3071a;
        C7747g h11 = kotlin.sequences.l.h(C7714v.w(jClass.r()), c3071a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h11.iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            Sd.f name = ((Jd.q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f10008d = linkedHashMap;
        C7747g h12 = kotlin.sequences.l.h(C7714v.w(this.f10005a.getFields()), this.f10006b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = h12.iterator();
        while (true) {
            C7747g.a aVar2 = (C7747g.a) it2;
            if (!aVar2.hasNext()) {
                break;
            }
            Object next2 = aVar2.next();
            linkedHashMap2.put(((Jd.n) next2).getName(), next2);
        }
        this.f10009e = linkedHashMap2;
        ArrayList u11 = this.f10005a.u();
        Function1<Jd.p, Boolean> function1 = this.f10006b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : u11) {
            if (((Boolean) function1.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        int h13 = kotlin.collections.U.h(C7714v.z(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(h13 < 16 ? 16 : h13);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            linkedHashMap3.put(((Jd.v) next3).getName(), next3);
        }
        this.f10010f = linkedHashMap3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r4.equals("hashCode") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        r4 = ((java.util.ArrayList) r5.f()).isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r4.equals("toString") != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean g(C3072b c3072b, Jd.q m11) {
        boolean z11;
        boolean z12;
        Sd.c c11;
        Intrinsics.checkNotNullParameter(m11, "m");
        if (c3072b.f10006b.invoke(m11).booleanValue()) {
            Intrinsics.checkNotNullParameter(m11, "<this>");
            if (m11.v().F()) {
                String b11 = m11.getName().b();
                int hashCode = b11.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != -1295482945) {
                        if (hashCode == 147696667) {
                        }
                    } else if (b11.equals("equals")) {
                        InterfaceC3390A interfaceC3390A = (InterfaceC3390A) C7714v.D0(m11.f());
                        Jd.w type = interfaceC3390A != null ? interfaceC3390A.getType() : null;
                        Jd.j jVar = type instanceof Jd.j ? (Jd.j) type : null;
                        if (jVar != null) {
                            Jd.i d11 = jVar.d();
                            if ((d11 instanceof Jd.g) && (c11 = ((Jd.g) d11).c()) != null && Intrinsics.d(c11.b(), "java.lang.Object")) {
                                z12 = true;
                            }
                        }
                    }
                    z12 = false;
                }
                if (z12) {
                    z11 = true;
                    if (z11) {
                        return true;
                    }
                }
            }
            z11 = false;
            if (z11) {
            }
        }
        return false;
    }

    @Override // Gd.InterfaceC3073c
    @NotNull
    public final Set<Sd.f> a() {
        C7747g h11 = kotlin.sequences.l.h(C7714v.w(this.f10005a.r()), this.f10007c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = h11.iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return linkedHashSet;
            }
            linkedHashSet.add(((Jd.q) aVar.next()).getName());
        }
    }

    @Override // Gd.InterfaceC3073c
    @NotNull
    public final Set<Sd.f> b() {
        return this.f10010f.keySet();
    }

    @Override // Gd.InterfaceC3073c
    public final Jd.n c(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (Jd.n) this.f10009e.get(name);
    }

    @Override // Gd.InterfaceC3073c
    public final Jd.v d(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (Jd.v) this.f10010f.get(name);
    }

    @Override // Gd.InterfaceC3073c
    @NotNull
    public final Set<Sd.f> e() {
        C7747g h11 = kotlin.sequences.l.h(C7714v.w(this.f10005a.getFields()), this.f10006b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = h11.iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return linkedHashSet;
            }
            linkedHashSet.add(((Jd.n) aVar.next()).getName());
        }
    }

    @Override // Gd.InterfaceC3073c
    @NotNull
    public final Collection<Jd.q> f(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = (List) this.f10008d.get(name);
        return list != null ? list : kotlin.collections.K.f71697a;
    }
}
