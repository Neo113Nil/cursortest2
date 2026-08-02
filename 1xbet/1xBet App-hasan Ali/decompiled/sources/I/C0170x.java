package I;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* renamed from: I.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170x extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2542l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2543m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i4.c f2544n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170x(i4.c cVar, a4.c cVar2) {
        super(cVar2);
        this.f2544n = cVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0170x c0170x = new C0170x(this.f2544n, cVar);
        c0170x.f2543m = obj;
        return c0170x;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((C0170x) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            b4.a r0 = b4.EnumC0510a.f7289k
            int r1 = r4.f2542l
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f2543m
            t0.E r1 = (t0.E) r1
            G4.l.N(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            G4.l.N(r5)
            java.lang.Object r5 = r4.f2543m
            t0.E r5 = (t0.E) r5
            r1 = r5
        L21:
            t0.k r5 = t0.k.f19489k
            r4.f2543m = r1
            r4.f2542l = r2
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            t0.j r5 = (t0.j) r5
            boolean r5 = t3.AbstractC2425d.A(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            i4.c r3 = r4.f2544n
            r3.c(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: I.C0170x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
