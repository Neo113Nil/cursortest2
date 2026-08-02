package x;

import b4.EnumC0510a;
import c4.AbstractC0540a;

/* loaded from: classes.dex */
public abstract class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2566L f20706a = new C2566L(3, 2, null);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[LOOP:0: B:11:0x0049->B:12:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003c -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t0.E e3, AbstractC0540a abstractC0540a) {
        u0 u0Var;
        int i;
        int size;
        int i5;
        int i6;
        int size2;
        if (abstractC0540a instanceof u0) {
            u0Var = (u0) abstractC0540a;
            int i7 = u0Var.f20880m;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                u0Var.f20880m = i7 - Integer.MIN_VALUE;
                Object obj = u0Var.f20879l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = u0Var.f20880m;
                if (i != 0) {
                    G4.l.N(obj);
                    u0Var.f20878k = e3;
                    u0Var.f20880m = 1;
                    obj = e3.b(t0.k.f19490l, u0Var);
                    if (obj == enumC0510a) {
                    }
                    t0.j jVar = (t0.j) obj;
                    ?? r22 = jVar.f19485a;
                    size = r22.size();
                    i5 = 0;
                    while (i6 < size) {
                    }
                    ?? r9 = jVar.f19485a;
                    size2 = r9.size();
                    while (i5 < size2) {
                    }
                    return W3.o.f6046a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e3 = u0Var.f20878k;
                G4.l.N(obj);
                t0.j jVar2 = (t0.j) obj;
                ?? r222 = jVar2.f19485a;
                size = r222.size();
                i5 = 0;
                for (i6 = 0; i6 < size; i6++) {
                    ((t0.s) r222.get(i6)).a();
                }
                ?? r92 = jVar2.f19485a;
                size2 = r92.size();
                while (i5 < size2) {
                    if (((t0.s) r92.get(i5)).f19503d) {
                        u0Var.f20878k = e3;
                        u0Var.f20880m = 1;
                        obj = e3.b(t0.k.f19490l, u0Var);
                        if (obj == enumC0510a) {
                            return enumC0510a;
                        }
                        t0.j jVar22 = (t0.j) obj;
                        ?? r2222 = jVar22.f19485a;
                        size = r2222.size();
                        i5 = 0;
                        while (i6 < size) {
                        }
                        ?? r922 = jVar22.f19485a;
                        size2 = r922.size();
                        while (i5 < size2) {
                        }
                    } else {
                        i5++;
                    }
                }
                return W3.o.f6046a;
            }
        }
        u0Var = new u0(abstractC0540a);
        Object obj2 = u0Var.f20879l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = u0Var.f20880m;
        if (i != 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(t0.E r10, boolean r11, t0.k r12, c4.AbstractC0540a r13) {
        /*
            boolean r0 = r13 instanceof x.t0
            if (r0 == 0) goto L13
            r0 = r13
            x.t0 r0 = (x.t0) r0
            int r1 = r0.f20876o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20876o = r1
            goto L18
        L13:
            x.t0 r0 = new x.t0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f20875n
            b4.a r1 = b4.EnumC0510a.f7289k
            int r2 = r0.f20876o
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f20874m
            t0.k r11 = r0.f20873l
            t0.E r12 = r0.f20872k
            G4.l.N(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            G4.l.N(r13)
        L3c:
            r0.f20872k = r10
            r0.f20873l = r12
            r0.f20874m = r11
            r0.f20876o = r3
            java.lang.Object r13 = r10.b(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            t0.j r13 = (t0.j) r13
            java.lang.Object r2 = r13.f19485a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L7c
            java.lang.Object r7 = r2.get(r6)
            t0.s r7 = (t0.s) r7
            if (r11 == 0) goto L71
            boolean r8 = r7.b()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f19506h
            if (r8 != 0) goto L6f
            boolean r7 = r7.f19503d
            if (r7 == 0) goto L6f
            r7 = r3
            goto L75
        L6f:
            r7 = r5
            goto L75
        L71:
            boolean r7 = t0.q.a(r7)
        L75:
            if (r7 != 0) goto L79
            r2 = r5
            goto L7d
        L79:
            int r6 = r6 + 1
            goto L55
        L7c:
            r2 = r3
        L7d:
            if (r2 == 0) goto L3c
            java.lang.Object r10 = r13.f19485a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x.Q0.b(t0.E, boolean, t0.k, c4.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r0 = r11.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r8 >= r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        r9 = (t0.s) r11.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r9.b() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (t0.q.d(r9, r7.f19444p.f19457I, r7.e()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        r0 = t0.k.f19491m;
        r1.f20698k = r7;
        r1.f20699l = r3;
        r1.f20701n = 2;
        r0 = r7.b(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b0 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(t0.E e3, t0.k kVar, AbstractC0540a abstractC0540a) {
        P0 p02;
        int i;
        t0.E e5;
        P0 p03;
        t0.k kVar2;
        t0.E e6;
        t0.k kVar3;
        t0.j jVar;
        int size;
        int i5;
        Object b3;
        if (abstractC0540a instanceof P0) {
            p02 = (P0) abstractC0540a;
            int i6 = p02.f20701n;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                p02.f20701n = i6 - Integer.MIN_VALUE;
                Object obj = p02.f20700m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = p02.f20701n;
                if (i != 0) {
                    G4.l.N(obj);
                    e5 = e3;
                    p03 = p02;
                    kVar2 = kVar;
                    p03.f20698k = e5;
                    p03.f20699l = kVar2;
                    p03.f20701n = 1;
                    b3 = e5.b(kVar2, p03);
                    if (b3 != enumC0510a) {
                    }
                    return enumC0510a;
                }
                if (i == 1) {
                    kVar3 = p02.f20699l;
                    e6 = p02.f20698k;
                    G4.l.N(obj);
                    jVar = (t0.j) obj;
                    ?? r8 = jVar.f19485a;
                    size = r8.size();
                    i5 = 0;
                    while (true) {
                        ?? r11 = jVar.f19485a;
                        if (i5 >= size) {
                        }
                        i5++;
                    }
                    return enumC0510a;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar3 = p02.f20699l;
                e6 = p02.f20698k;
                G4.l.N(obj);
                t0.k kVar4 = kVar3;
                p03 = p02;
                kVar2 = kVar4;
                ?? r02 = ((t0.j) obj).f19485a;
                int size2 = r02.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (((t0.s) r02.get(i7)).b()) {
                        return null;
                    }
                }
                e5 = e6;
                p03.f20698k = e5;
                p03.f20699l = kVar2;
                p03.f20701n = 1;
                b3 = e5.b(kVar2, p03);
                if (b3 != enumC0510a) {
                    e6 = e5;
                    obj = b3;
                    P0 p04 = p03;
                    kVar3 = kVar2;
                    p02 = p04;
                    jVar = (t0.j) obj;
                    ?? r82 = jVar.f19485a;
                    size = r82.size();
                    i5 = 0;
                    while (true) {
                        ?? r112 = jVar.f19485a;
                        if (i5 >= size) {
                            return r112.get(0);
                        }
                        if (!t0.q.b((t0.s) r82.get(i5))) {
                            break;
                        }
                        i5++;
                    }
                }
                return enumC0510a;
            }
        }
        p02 = new P0(abstractC0540a);
        Object obj2 = p02.f20700m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = p02.f20701n;
        if (i != 0) {
        }
    }
}
