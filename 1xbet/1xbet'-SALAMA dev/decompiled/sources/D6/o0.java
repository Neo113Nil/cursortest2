package D6;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends p077k6.h implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f1865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I6.k f1866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f1869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s0 s0Var, p065i6.d dVar) {
        super(dVar);
        this.f1869f = s0Var;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        o0 o0Var = new o0(this.f1869f, dVar);
        o0Var.f1868e = obj;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((B6.c) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0062 -> B:25:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p077k6.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            j6.a r0 = j6.a.f14648a
            int r1 = r6.f1867d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            I6.k r1 = r6.f1866c
            D6.u0 r3 = r6.f1865b
            java.lang.Object r4 = r6.f1868e
            B6.c r4 = (B6.c) r4
            p003a.a.p0(r7)
            goto L77
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            p003a.a.p0(r7)
            goto L7c
        L24:
            p003a.a.p0(r7)
            java.lang.Object r7 = r6.f1868e
            B6.c r7 = (B6.c) r7
            D6.s0 r1 = r6.f1869f
            java.lang.Object r1 = r1.x()
            boolean r4 = r1 instanceof D6.C0134q
            if (r4 == 0) goto L3f
            D6.q r1 = (D6.C0134q) r1
            D6.r r1 = r1.f1871e
            r6.f1867d = r3
            r7.c(r1, r6)
            return r0
        L3f:
            boolean r3 = r1 instanceof D6.InterfaceC0112b0
            if (r3 == 0) goto L7c
            D6.b0 r1 = (D6.InterfaceC0112b0) r1
            D6.u0 r1 = r1.c()
            if (r1 == 0) goto L7c
            java.lang.Object r3 = r1.f()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            t6.h.c(r3, r4)
            I6.k r3 = (I6.k) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L5a:
            boolean r7 = r1.equals(r3)
            if (r7 != 0) goto L7c
            boolean r7 = r1 instanceof D6.C0134q
            if (r7 == 0) goto L77
            r7 = r1
            D6.q r7 = (D6.C0134q) r7
            r6.f1868e = r4
            r6.f1865b = r3
            r6.f1866c = r1
            r6.f1867d = r2
            D6.r r7 = r7.f1871e
            r4.c(r7, r6)
            j6.a r7 = j6.a.f14648a
            return r0
        L77:
            I6.k r1 = r1.g()
            goto L5a
        L7c:
            f6.i r7 = p044f6.i.f13014a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
