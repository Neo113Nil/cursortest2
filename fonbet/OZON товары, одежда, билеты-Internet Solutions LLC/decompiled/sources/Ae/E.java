package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* loaded from: classes.dex */
final class E<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<T> f791a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Throwable> f792b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Object f793d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f794e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ E<T> f795f;

        /* renamed from: g, reason: collision with root package name */
        int f796g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(E<? super T> e11, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f795f = e11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f794e = obj;
            this.f796g |= LinearLayoutManager.INVALID_OFFSET;
            return this.f795f.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    E(InterfaceC2397i<? super T> interfaceC2397i, kotlin.jvm.internal.M<Throwable> m11) {
        this.f791a = interfaceC2397i;
        this.f792b = m11;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        E<T> e11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f796g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f796g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f794e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f796g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        InterfaceC2397i<T> interfaceC2397i = this.f791a;
                        aVar.f793d = this;
                        aVar.f796g = 1;
                        if (interfaceC2397i.emit(t2, aVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (Throwable 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        this = this;
                        boolean r0 = r6 instanceof Ae.E.a
                        if (r0 == 0) goto L13
                        r0 = r6
                        Ae.E$a r0 = (Ae.E.a) r0
                        int r1 = r0.f796g
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f796g = r1
                        goto L18
                    L13:
                        Ae.E$a r0 = new Ae.E$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f794e
                        Wc.a r1 = Wc.a.COROUTINE_SUSPENDED
                        int r2 = r0.f796g
                        r3 = 1
                        if (r2 == 0) goto L35
                        if (r2 != r3) goto L2d
                        java.lang.Object r5 = r0.f793d
                        Ae.E r5 = (Ae.E) r5
                        Sc.s.b(r6)     // Catch: java.lang.Throwable -> L2b
                        goto L45
                    L2b:
                        r6 = move-exception
                        goto L4a
                    L2d:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L35:
                        Sc.s.b(r6)
                        Ae.i<T> r6 = r4.f791a     // Catch: java.lang.Throwable -> L48
                        r0.f793d = r4     // Catch: java.lang.Throwable -> L48
                        r0.f796g = r3     // Catch: java.lang.Throwable -> L48
                        java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L48
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.Unit r5 = kotlin.Unit.f71690a
                        return r5
                    L48:
                        r6 = move-exception
                        r5 = r4
                    L4a:
                        kotlin.jvm.internal.M<java.lang.Throwable> r5 = r5.f792b
                        r5.f71787a = r6
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Ae.E.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }
