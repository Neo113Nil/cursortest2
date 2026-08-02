package x;

import b4.EnumC0510a;
import c4.AbstractC0542c;

/* renamed from: x.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2557C {

    /* renamed from: a, reason: collision with root package name */
    public static final float f20606a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (h0.C1988b.b(t0.q.e(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005e -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t0.E e3, long j5, AbstractC0542c abstractC0542c) {
        C2608w c2608w;
        int i;
        t0.E e5;
        kotlin.jvm.internal.v vVar;
        Object b3;
        Object obj;
        Object obj2;
        if (abstractC0542c instanceof C2608w) {
            c2608w = (C2608w) abstractC0542c;
            int i5 = c2608w.f20886n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2608w.f20886n = i5 - Integer.MIN_VALUE;
                Object obj3 = c2608w.f20885m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2608w.f20886n;
                if (i != 0) {
                    G4.l.N(obj3);
                    e5 = e3;
                    if (!d(e5.f19444p.f19452D, j5)) {
                        kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                        vVar2.f17623k = j5;
                        vVar = vVar2;
                        c2608w.f20883k = e5;
                        c2608w.f20884l = vVar;
                        c2608w.f20886n = 1;
                        b3 = e5.b(t0.k.f19490l, c2608w);
                        if (b3 != enumC0510a) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar = c2608w.f20884l;
                t0.E e6 = c2608w.f20883k;
                G4.l.N(obj3);
                t0.j jVar = (t0.j) obj3;
                ?? r5 = jVar.f19485a;
                int size = r5.size();
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        obj = null;
                        break;
                    }
                    obj = r5.get(i7);
                    if (t0.r.a(((t0.s) obj).f19500a, vVar.f17623k)) {
                        break;
                    }
                    i7++;
                }
                t0.s sVar = (t0.s) obj;
                if (sVar == null) {
                    if (t0.q.c(sVar)) {
                        ?? r22 = jVar.f19485a;
                        int size2 = r22.size();
                        while (true) {
                            if (i6 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = r22.get(i6);
                            if (((t0.s) obj2).f19503d) {
                                break;
                            }
                            i6++;
                        }
                        t0.s sVar2 = (t0.s) obj2;
                        if (sVar2 != null) {
                            vVar.f17623k = sVar2.f19500a;
                            e5 = e6;
                            c2608w.f20883k = e5;
                            c2608w.f20884l = vVar;
                            c2608w.f20886n = 1;
                            b3 = e5.b(t0.k.f19490l, c2608w);
                            if (b3 != enumC0510a) {
                                return enumC0510a;
                            }
                            t0.E e7 = e5;
                            obj3 = b3;
                            e6 = e7;
                        }
                    }
                    t0.j jVar2 = (t0.j) obj3;
                    ?? r52 = jVar2.f19485a;
                    int size3 = r52.size();
                    int i62 = 0;
                    int i72 = 0;
                    while (true) {
                        if (i72 < size3) {
                        }
                        i72++;
                    }
                    t0.s sVar3 = (t0.s) obj;
                    if (sVar3 == null) {
                        sVar3 = null;
                    }
                }
                if (sVar3 == null || sVar3.b()) {
                    return null;
                }
                return sVar3;
            }
        }
        c2608w = new C2608w(abstractC0542c);
        Object obj32 = c2608w.f20885m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2608w.f20886n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(t0.E e3, long j5, AbstractC0542c abstractC0542c) {
        C2609x c2609x;
        int i;
        Object obj;
        t0.s sVar;
        kotlin.jvm.internal.w wVar;
        if (abstractC0542c instanceof C2609x) {
            c2609x = (C2609x) abstractC0542c;
            int i5 = c2609x.f20894n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2609x.f20894n = i5 - Integer.MIN_VALUE;
                Object obj2 = c2609x.f20893m;
                Object obj3 = EnumC0510a.f7289k;
                i = c2609x.f20894n;
                if (i != 0) {
                    G4.l.N(obj2);
                    if (!d(e3.f19444p.f19452D, j5)) {
                        ?? r12 = e3.f19444p.f19452D.f19485a;
                        int size = r12.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size) {
                                obj = null;
                                break;
                            }
                            obj = r12.get(i6);
                            if (t0.r.a(((t0.s) obj).f19500a, j5)) {
                                break;
                            }
                            i6++;
                        }
                        sVar = (t0.s) obj;
                        if (sVar != null) {
                            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                            kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
                            wVar3.f17624k = sVar;
                            long c5 = e3.f().c();
                            try {
                                i4.e c2610y = new C2610y(wVar3, wVar2, null);
                                c2609x.f20891k = sVar;
                                c2609x.f20892l = wVar2;
                                c2609x.f20894n = 1;
                                if (e3.h(c5, c2610y, c2609x) == obj3) {
                                    return obj3;
                                }
                            } catch (t0.l unused) {
                                wVar = wVar2;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = c2609x.f20892l;
                sVar = c2609x.f20891k;
                try {
                    G4.l.N(obj2);
                    return null;
                } catch (t0.l unused2) {
                }
                t0.s sVar2 = (t0.s) wVar.f17624k;
                return sVar2 != null ? sVar : sVar2;
            }
        }
        c2609x = new C2609x(abstractC0542c);
        Object obj22 = c2609x.f20893m;
        Object obj32 = EnumC0510a.f7289k;
        i = c2609x.f20894n;
        if (i != 0) {
        }
        t0.s sVar22 = (t0.s) wVar.f17624k;
        if (sVar22 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(t0.E e3, long j5, i4.c cVar, AbstractC0542c abstractC0542c) {
        C2556B c2556b;
        int i;
        t0.s sVar;
        if (abstractC0542c instanceof C2556B) {
            c2556b = (C2556B) abstractC0542c;
            int i5 = c2556b.f20604n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2556b.f20604n = i5 - Integer.MIN_VALUE;
                Object obj = c2556b.f20603m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2556b.f20604n;
                if (i != 0) {
                    G4.l.N(obj);
                    c2556b.f20601k = e3;
                    c2556b.f20602l = cVar;
                    c2556b.f20604n = 1;
                    obj = a(e3, j5, c2556b);
                    if (obj == enumC0510a) {
                    }
                    sVar = (t0.s) obj;
                    if (sVar == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4.c cVar2 = c2556b.f20602l;
                    t0.E e5 = c2556b.f20601k;
                    G4.l.N(obj);
                    cVar = cVar2;
                    e3 = e5;
                    sVar = (t0.s) obj;
                    if (sVar == null) {
                        if (t0.q.c(sVar)) {
                            return Boolean.TRUE;
                        }
                        cVar.c(sVar);
                        j5 = sVar.f19500a;
                        c2556b.f20601k = e3;
                        c2556b.f20602l = cVar;
                        c2556b.f20604n = 1;
                        obj = a(e3, j5, c2556b);
                        if (obj == enumC0510a) {
                            return enumC0510a;
                        }
                        sVar = (t0.s) obj;
                        if (sVar == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        c2556b = new C2556B(abstractC0542c);
        Object obj2 = c2556b.f20603m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2556b.f20604n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean d(t0.j jVar, long j5) {
        Object obj;
        ?? r6 = jVar.f19485a;
        int size = r6.size();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i);
            if (t0.r.a(((t0.s) obj).f19500a, j5)) {
                break;
            }
            i++;
        }
        t0.s sVar = (t0.s) obj;
        if (sVar != null && sVar.f19503d) {
            z3 = true;
        }
        return true ^ z3;
    }
}
