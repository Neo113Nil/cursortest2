package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* renamed from: kotlinx.coroutines.flow.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1073q<T> implements InterfaceC1061f {
    public final /* synthetic */ InterfaceC1061f<T> a;
    public final /* synthetic */ Ref.ObjectRef<Throwable> b;

    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {154}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.q$a */
    public static final class a extends ContinuationImpl {
        public C1073q a;
        public /* synthetic */ Object b;
        public final /* synthetic */ C1073q<T> c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C1073q<? super T> c1073q, Continuation<? super a> continuation) {
            super(continuation);
            this.c = c1073q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1073q(InterfaceC1061f<? super T> interfaceC1061f, Ref.ObjectRef<Throwable> objectRef) {
        this.a = interfaceC1061f;
        this.b = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        C1073q<T> c1073q;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        InterfaceC1061f<T> interfaceC1061f = this.a;
                        aVar.a = this;
                        aVar.d = 1;
                        if (interfaceC1061f.emit(t, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
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
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.C1073q.a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.q$a r0 = (kotlinx.coroutines.flow.C1073q.a) r0
                        int r1 = r0.d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.d = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.q$a r0 = new kotlinx.coroutines.flow.q$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.b
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.d
                        r3 = 1
                        if (r2 == 0) goto L35
                        if (r2 != r3) goto L2d
                        kotlinx.coroutines.flow.q r5 = r0.a
                        kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2b
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
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.f<T> r6 = r4.a     // Catch: java.lang.Throwable -> L48
                        r0.a = r4     // Catch: java.lang.Throwable -> L48
                        r0.d = r3     // Catch: java.lang.Throwable -> L48
                        java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L48
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    L48:
                        r6 = move-exception
                        r5 = r4
                    L4a:
                        kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.b
                        r5.element = r6
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C1073q.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
