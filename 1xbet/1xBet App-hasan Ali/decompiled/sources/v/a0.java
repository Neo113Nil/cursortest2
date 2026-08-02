package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class a0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0 f20194l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, a4.c cVar) {
        super(2, cVar);
        this.f20194l = b0Var;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new a0(this.f20194l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((a0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:6:0x004b). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            b4.a r0 = b4.EnumC0510a.f7289k
            int r1 = r7.f20193k
            r2 = 2
            r3 = 1
            v.b0 r4 = r7.f20194l
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            G4.l.N(r8)
            goto L4b
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            G4.l.N(r8)
            goto L2e
        L1e:
            G4.l.N(r8)
        L21:
            r4.c r8 = r4.f20206I
            if (r8 == 0) goto L2e
            r7.f20193k = r3
            java.lang.Object r8 = r8.c(r7)
            if (r8 != r0) goto L2e
            goto L4a
        L2e:
            v.l0 r8 = r4.f20201D
            if (r8 == 0) goto L21
            v.q r8 = v.C2522q.f20292n
            r7.f20193k = r2
            a4.h r1 = r7.getContext()
            P.a0 r1 = P.AbstractC0329z.q(r1)
            P.b0 r5 = new P.b0
            r6 = 0
            r5.<init>(r8, r6)
            java.lang.Object r8 = r1.n(r5, r7)
            if (r8 != r0) goto L4b
        L4a:
            return r0
        L4b:
            v.l0 r8 = r4.f20201D
            if (r8 == 0) goto L21
            v.n0 r8 = (v.n0) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: v.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
