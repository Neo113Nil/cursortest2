package P;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import i4.InterfaceC2015a;
import r.C2322H;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public final class b1 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public C2322H f4446k;

    /* renamed from: l, reason: collision with root package name */
    public i4.c f4447l;

    /* renamed from: m, reason: collision with root package name */
    public r4.g f4448m;

    /* renamed from: n, reason: collision with root package name */
    public A0.P0 f4449n;

    /* renamed from: o, reason: collision with root package name */
    public Object f4450o;

    /* renamed from: p, reason: collision with root package name */
    public int f4451p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f4452q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f4453r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(InterfaceC2015a interfaceC2015a, a4.c cVar) {
        super(2, cVar);
        this.f4453r = interfaceC2015a;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        b1 b1Var = new b1(this.f4453r, cVar);
        b1Var.f4452q = obj;
        return b1Var;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((b1) create((InterfaceC2369f) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a8 A[LOOP:0: B:18:0x00d7->B:26:0x01a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0150 A[EDGE_INSN: B:27:0x0150->B:28:0x0150 BREAK  A[LOOP:0: B:18:0x00d7->B:26:0x01a8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0152 A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #2 {all -> 0x0192, blocks: (B:71:0x0115, B:21:0x0141, B:24:0x014b, B:29:0x0152, B:36:0x016a, B:38:0x0173, B:76:0x0120, B:90:0x012c), top: B:70:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x018b -> B:10:0x018c). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
