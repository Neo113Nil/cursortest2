package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class s extends t6.i implements s6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f8126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(A a2, int i7) {
        super(0);
        this.f8125a = i7;
        this.f8126b = a2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
          (r3v4 java.lang.Object) from 0x0031: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v4 java.lang.Object) binds: [B:14:0x0030, B:24:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r3v4 java.lang.Object) from 0x0029: CHECK_CAST (androidx.fragment.app.H) (r3v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // s6.a
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.f8125a
            switch(r0) {
                case 0: goto L3e;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            androidx.activity.A r0 = r5.f8126b
            r0.a()
            f6.i r0 = p044f6.i.f13014a
            return r0
        Ld:
            androidx.activity.A r0 = r5.f8126b
            androidx.fragment.app.H r1 = r0.f8082c
            r2 = 0
            if (r1 != 0) goto L34
            g6.f r1 = r0.f8081b
            int r3 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r3)
        L1e:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.previous()
            r4 = r3
            androidx.fragment.app.H r4 = (androidx.fragment.app.H) r4
            boolean r4 = r4.f9356a
            if (r4 == 0) goto L1e
            goto L31
        L30:
            r3 = r2
        L31:
            r1 = r3
            androidx.fragment.app.H r1 = (androidx.fragment.app.H) r1
        L34:
            r0.f8082c = r2
            if (r1 == 0) goto L3b
            r1.a()
        L3b:
            f6.i r0 = p044f6.i.f13014a
            return r0
        L3e:
            androidx.activity.A r0 = r5.f8126b
            r0.a()
            f6.i r0 = p044f6.i.f13014a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.s.invoke():java.lang.Object");
    }
}
