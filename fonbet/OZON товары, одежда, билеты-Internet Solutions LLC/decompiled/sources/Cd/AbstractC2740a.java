package Cd;

import Kd.C3515l;
import Kd.EnumC3512i;
import Kd.EnumC3514k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import spay.sdk.domain.model.FraudMonInfo;
import td.InterfaceC9839e;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;

/* renamed from: Cd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2740a<TAnnotation> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f4750c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2739A f4751a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Object, TAnnotation> f4752b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC2741b enumC2741b : EnumC2741b.values()) {
            String a11 = enumC2741b.a();
            if (linkedHashMap.get(a11) == null) {
                linkedHashMap.put(a11, enumC2741b);
            }
        }
        f4750c = linkedHashMap;
    }

    public AbstractC2740a(@NotNull C2739A javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f4751a = javaTypeEnhancementState;
        this.f4752b = new ConcurrentHashMap<>();
    }

    private final TAnnotation e(TAnnotation tannotation, Sd.c cVar) {
        for (TAnnotation tannotation2 : h(tannotation)) {
            if (Intrinsics.d(f(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean i(TAnnotation tannotation, Sd.c cVar) {
        Iterable<TAnnotation> h11 = h(tannotation);
        if ((h11 instanceof Collection) && ((Collection) h11).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = h11.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(f(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r6.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        r6 = Kd.EnumC3514k.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r6.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C3515l k(TAnnotation tannotation, boolean z11) {
        EnumC3514k enumC3514k;
        Sd.c f7 = f(tannotation);
        if (f7 != null) {
            L invoke = this.f4751a.c().invoke(f7);
            invoke.getClass();
            if (invoke == L.IGNORE) {
                return null;
            }
            if (G.m().contains(f7)) {
                enumC3514k = EnumC3514k.NOT_NULL;
            } else if (G.n().contains(f7)) {
                enumC3514k = EnumC3514k.NULLABLE;
            } else if (G.b().contains(f7)) {
                enumC3514k = EnumC3514k.FORCE_FLEXIBILITY;
            } else if (f7.equals(G.c())) {
                String str = (String) C7714v.L(a(tannotation, false));
                if (str != null) {
                    switch (str.hashCode()) {
                        case 73135176:
                            break;
                        case 74175084:
                            break;
                        case 433141802:
                            if (str.equals(FraudMonInfo.UNKNOWN)) {
                                enumC3514k = EnumC3514k.FORCE_FLEXIBILITY;
                                break;
                            }
                            break;
                        case 1933739535:
                            break;
                    }
                }
                enumC3514k = EnumC3514k.NOT_NULL;
            }
            return new C3515l(enumC3514k, invoke == L.WARN || z11);
        }
        return null;
    }

    private final L l(TAnnotation tannotation) {
        L m11 = m(tannotation);
        return m11 != null ? m11 : this.f4751a.d().b();
    }

    private final L m(TAnnotation tannotation) {
        String str;
        C2739A c2739a = this.f4751a;
        L l11 = c2739a.d().d().get(f(tannotation));
        if (l11 != null) {
            return l11;
        }
        TAnnotation e11 = e(tannotation, G.p());
        if (e11 == null || (str = (String) C7714v.L(a(e11, false))) == null) {
            return null;
        }
        L c11 = c2739a.d().c();
        if (c11 != null) {
            return c11;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return L.IGNORE;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return L.STRICT;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return L.WARN;
        }
        return null;
    }

    @NotNull
    protected abstract ArrayList a(@NotNull Object obj, boolean z11);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B b(B b11, @NotNull InterfaceC10030h annotations) {
        boolean z11;
        EnumMap<EnumC2741b, u> b12;
        u uVar;
        u a11;
        Object e11;
        Object obj;
        Pair pair;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        C2739A c2739a = this.f4751a;
        if (!c2739a.b()) {
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC10025c> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC10025c next = it.next();
                u uVar2 = null;
                if (!c2739a.b() && (uVar = (u) v.a().get(f(next))) != null) {
                    Sd.c f7 = f(next);
                    L l11 = (f7 == null || !v.b().containsKey(f7)) ? l(next) : c2739a.c().invoke(f7);
                    if (l11 == L.IGNORE) {
                        l11 = null;
                    }
                    if (l11 != null) {
                        a11 = u.a(uVar, C3515l.a(uVar.c(), null, l11 == L.WARN, 1));
                        if (a11 == null) {
                            uVar2 = a11;
                        } else {
                            if (!c2739a.d().e() && (e11 = e(next, G.g())) != null) {
                                Iterator it2 = h(next).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (n(obj) != null) {
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    ArrayList a12 = a(e11, true);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it3 = a12.iterator();
                                    while (it3.hasNext()) {
                                        EnumC2741b enumC2741b = (EnumC2741b) f4750c.get((String) it3.next());
                                        if (enumC2741b != null) {
                                            linkedHashSet.add(enumC2741b);
                                        }
                                    }
                                    if (linkedHashSet.contains(EnumC2741b.TYPE_USE)) {
                                        linkedHashSet = e0.f(e0.c(C7705l.j0(EnumC2741b.values()), EnumC2741b.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                                    }
                                    pair = new Pair(obj, linkedHashSet);
                                    if (pair != null) {
                                        Object extractNullability = pair.a();
                                        Set set = (Set) pair.b();
                                        L m11 = m(next);
                                        if (m11 == null) {
                                            m11 = l(extractNullability);
                                        }
                                        m11.getClass();
                                        L l12 = L.IGNORE;
                                        if (m11 != l12) {
                                            Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
                                            C3515l k11 = k(extractNullability, false);
                                            if (k11 == null) {
                                                Object extractNullability2 = n(extractNullability);
                                                if (extractNullability2 != null) {
                                                    L l13 = l(extractNullability);
                                                    l13.getClass();
                                                    if (l13 != l12) {
                                                        Intrinsics.checkNotNullParameter(extractNullability2, "$this$extractNullability");
                                                        C3515l k12 = k(extractNullability2, false);
                                                        if (k12 != null) {
                                                            k11 = C3515l.a(k12, null, l13 == L.WARN, 1);
                                                        }
                                                    }
                                                }
                                                k11 = null;
                                            }
                                            if (k11 != null) {
                                                uVar2 = new u(C3515l.a(k11, null, m11 == L.WARN, 1), set);
                                            }
                                        }
                                    }
                                }
                            }
                            pair = null;
                            if (pair != null) {
                            }
                        }
                        if (uVar2 == null) {
                            arrayList.add(uVar2);
                        }
                    }
                }
                a11 = null;
                if (a11 == null) {
                }
                if (uVar2 == null) {
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(EnumC2741b.class);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    u uVar3 = (u) it4.next();
                    for (EnumC2741b enumC2741b2 : uVar3.d()) {
                        enumMap.containsKey(enumC2741b2);
                        enumMap.put((EnumMap) enumC2741b2, (EnumC2741b) uVar3);
                    }
                }
                EnumMap enumMap2 = (b11 == null || (b12 = b11.b()) == null) ? new EnumMap(EnumC2741b.class) : new EnumMap((EnumMap) b12);
                for (Map.Entry entry : enumMap.entrySet()) {
                    EnumC2741b enumC2741b3 = (EnumC2741b) entry.getKey();
                    u uVar4 = (u) entry.getValue();
                    if (uVar4 != null) {
                        enumMap2.put((EnumMap) enumC2741b3, (EnumC2741b) uVar4);
                        z11 = true;
                    }
                }
                if (z11) {
                    return new B(enumMap2);
                }
            }
        }
        return b11;
    }

    public final EnumC3512i c(@NotNull Iterable<? extends TAnnotation> annotations) {
        EnumC3512i enumC3512i;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        EnumC3512i enumC3512i2 = null;
        while (it.hasNext()) {
            Sd.c f7 = f(it.next());
            if (C7714v.A(G.o(), f7)) {
                enumC3512i = EnumC3512i.READ_ONLY;
            } else if (C7714v.A(G.l(), f7)) {
                enumC3512i = EnumC3512i.MUTABLE;
            } else {
                continue;
            }
            if (enumC3512i2 != null && enumC3512i2 != enumC3512i) {
                return null;
            }
            enumC3512i2 = enumC3512i;
        }
        return enumC3512i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3515l d(@NotNull Iterable<? extends TAnnotation> annotations, @NotNull Function1<? super TAnnotation, Boolean> forceWarning) {
        C3515l k11;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(forceWarning, "forceWarning");
        C3515l c3515l = null;
        for (TAnnotation tannotation : annotations) {
            C3515l k12 = k(tannotation, forceWarning.invoke(tannotation).booleanValue());
            if (k12 == null) {
                A0.h hVar = (Object) n(tannotation);
                if (hVar != 0) {
                    L l11 = l(tannotation);
                    l11.getClass();
                    if (l11 != L.IGNORE && (k11 = k(hVar, forceWarning.invoke(hVar).booleanValue())) != null) {
                        k12 = C3515l.a(k11, null, l11 == L.WARN, 1);
                    }
                }
                k12 = null;
            }
            if (c3515l != null) {
                if (k12 != null && !k12.equals(c3515l) && (!k12.c() || c3515l.c())) {
                    if (k12.c() || !c3515l.c()) {
                        return null;
                    }
                }
            }
            c3515l = k12;
        }
        return c3515l;
    }

    protected abstract Sd.c f(@NotNull TAnnotation tannotation);

    @NotNull
    protected abstract InterfaceC9839e g(@NotNull Object obj);

    @NotNull
    protected abstract Iterable<TAnnotation> h(@NotNull TAnnotation tannotation);

    public final boolean j(@NotNull TAnnotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        TAnnotation e11 = e(annotation, s.a.f81920t);
        if (e11 != null) {
            ArrayList a11 = a(e11, false);
            if (!a11.isEmpty()) {
                Iterator it = a11.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d((String) it.next(), "TYPE")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final TAnnotation n(@NotNull TAnnotation annotation) {
        TAnnotation tannotation;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (!this.f4751a.d().e()) {
            if (C7714v.A(G.a(), f(annotation)) || i(annotation, G.f())) {
                return annotation;
            }
            if (i(annotation, G.h())) {
                ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f4752b;
                InterfaceC9839e g10 = g(annotation);
                TAnnotation tannotation2 = concurrentHashMap.get(g10);
                if (tannotation2 != null) {
                    return tannotation2;
                }
                Iterator<TAnnotation> it = h(annotation).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        tannotation = null;
                        break;
                    }
                    tannotation = n(it.next());
                    if (tannotation != null) {
                        break;
                    }
                }
                if (tannotation != null) {
                    TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(g10, tannotation);
                    return putIfAbsent == null ? tannotation : putIfAbsent;
                }
            }
        }
        return null;
    }
}
