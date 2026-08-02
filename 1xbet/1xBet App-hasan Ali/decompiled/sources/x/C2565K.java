package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: x.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2565K extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.w f20658k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.w f20659l;

    /* renamed from: m, reason: collision with root package name */
    public int f20660m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f20661n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20662o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2565K(C2589k0 c2589k0, a4.c cVar) {
        super(2, cVar);
        this.f20662o = c2589k0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2565K c2565k = new C2565K(this.f20662o, cVar);
        c2565k.f20661n = obj;
        return c2565k;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2565K) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r10 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e6, code lost:
    
        if (x.C2589k0.B0(r3, r9) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        if (x.C2589k0.B0(r3, r9) != r0) goto L11;
     */
    /* JADX WARN: Path cross not found for [B:32:0x00d7, B:29:0x00c0], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d2 -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d9 -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e6 -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f4 -> B:7:0x0029). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2280u interfaceC2280u;
        kotlin.jvm.internal.w wVar;
        kotlin.jvm.internal.w wVar2;
        kotlin.jvm.internal.w wVar3;
        InterfaceC2280u interfaceC2280u2;
        InterfaceC2280u interfaceC2280u3;
        Object e3;
        AbstractC2607v abstractC2607v;
        Object obj2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20660m;
        W3.o oVar = W3.o.f6046a;
        C2589k0 c2589k0 = this.f20662o;
        switch (i) {
            case 0:
                G4.l.N(obj);
                interfaceC2280u = (InterfaceC2280u) this.f20661n;
                if (AbstractC2282w.o(interfaceC2280u)) {
                    wVar = new kotlin.jvm.internal.w();
                    r4.c cVar = c2589k0.f20803E;
                    if (cVar != null) {
                        this.f20661n = interfaceC2280u;
                        this.f20658k = wVar;
                        this.f20659l = wVar;
                        this.f20660m = 1;
                        obj = cVar.c(this);
                        if (obj != enumC0510a) {
                            wVar2 = wVar;
                            abstractC2607v = (AbstractC2607v) obj;
                            wVar.f17624k = abstractC2607v;
                            obj2 = wVar2.f17624k;
                            if (obj2 instanceof C2605t) {
                                this.f20661n = interfaceC2280u;
                                this.f20658k = wVar2;
                                this.f20659l = null;
                                this.f20660m = 2;
                                if (C2589k0.C0(c2589k0, (C2605t) obj2, this) != enumC0510a) {
                                    wVar3 = wVar2;
                                    interfaceC2280u2 = interfaceC2280u;
                                    C2564J c2564j = new C2564J(wVar3, c2589k0, null);
                                    this.f20661n = interfaceC2280u2;
                                    this.f20658k = wVar3;
                                    this.f20660m = 3;
                                    v.d0 d0Var = v.d0.f20223l;
                                    C2604s0 c2604s0 = c2589k0.f20810N;
                                    e3 = c2604s0.e(d0Var, new C2573c0(c2564j, c2604s0, null), this);
                                    if (e3 != enumC0510a) {
                                        e3 = oVar;
                                        break;
                                    }
                                }
                            }
                            if (AbstractC2282w.o(interfaceC2280u)) {
                                return oVar;
                            }
                        }
                        return enumC0510a;
                    }
                    wVar2 = wVar;
                    abstractC2607v = null;
                    wVar.f17624k = abstractC2607v;
                    obj2 = wVar2.f17624k;
                    if (obj2 instanceof C2605t) {
                    }
                    if (AbstractC2282w.o(interfaceC2280u)) {
                    }
                }
                break;
            case 1:
                wVar = this.f20659l;
                wVar2 = this.f20658k;
                interfaceC2280u = (InterfaceC2280u) this.f20661n;
                G4.l.N(obj);
                abstractC2607v = (AbstractC2607v) obj;
                wVar.f17624k = abstractC2607v;
                obj2 = wVar2.f17624k;
                if (obj2 instanceof C2605t) {
                }
                if (AbstractC2282w.o(interfaceC2280u)) {
                }
                break;
            case 2:
                wVar3 = this.f20658k;
                interfaceC2280u2 = (InterfaceC2280u) this.f20661n;
                G4.l.N(obj);
                C2564J c2564j2 = new C2564J(wVar3, c2589k0, null);
                this.f20661n = interfaceC2280u2;
                this.f20658k = wVar3;
                this.f20660m = 3;
                v.d0 d0Var2 = v.d0.f20223l;
                C2604s0 c2604s02 = c2589k0.f20810N;
                e3 = c2604s02.e(d0Var2, new C2573c0(c2564j2, c2604s02, null), this);
                if (e3 != enumC0510a) {
                }
                break;
            case 3:
                wVar3 = this.f20658k;
                interfaceC2280u2 = (InterfaceC2280u) this.f20661n;
                try {
                    G4.l.N(obj);
                } catch (CancellationException unused) {
                    interfaceC2280u3 = interfaceC2280u2;
                    this.f20661n = interfaceC2280u3;
                    this.f20658k = null;
                    this.f20660m = 6;
                    break;
                }
                interfaceC2280u = interfaceC2280u2;
                try {
                } catch (CancellationException unused2) {
                    interfaceC2280u3 = interfaceC2280u;
                    this.f20661n = interfaceC2280u3;
                    this.f20658k = null;
                    this.f20660m = 6;
                }
                Object obj3 = wVar3.f17624k;
                if (obj3 instanceof C2606u) {
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped", obj3);
                    this.f20661n = interfaceC2280u;
                    this.f20658k = null;
                    this.f20660m = 4;
                    if (C2589k0.D0(c2589k0, (C2606u) obj3, this) == enumC0510a) {
                        return enumC0510a;
                    }
                    if (AbstractC2282w.o(interfaceC2280u)) {
                    }
                } else {
                    if (obj3 instanceof r) {
                        this.f20661n = interfaceC2280u;
                        this.f20658k = null;
                        this.f20660m = 5;
                        break;
                    }
                    if (AbstractC2282w.o(interfaceC2280u)) {
                    }
                }
                break;
            case 4:
                interfaceC2280u3 = (InterfaceC2280u) this.f20661n;
                try {
                    G4.l.N(obj);
                } catch (CancellationException unused3) {
                    this.f20661n = interfaceC2280u3;
                    this.f20658k = null;
                    this.f20660m = 6;
                    break;
                }
                interfaceC2280u = interfaceC2280u3;
                if (AbstractC2282w.o(interfaceC2280u)) {
                }
                break;
            case 5:
                interfaceC2280u3 = (InterfaceC2280u) this.f20661n;
                G4.l.N(obj);
                interfaceC2280u = interfaceC2280u3;
                if (AbstractC2282w.o(interfaceC2280u)) {
                }
                break;
            case 6:
                interfaceC2280u3 = (InterfaceC2280u) this.f20661n;
                G4.l.N(obj);
                interfaceC2280u = interfaceC2280u3;
                if (AbstractC2282w.o(interfaceC2280u)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
