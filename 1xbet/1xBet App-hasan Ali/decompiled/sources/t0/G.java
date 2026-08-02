package t0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class G extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f19447k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f19448l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h3, a4.c cVar) {
        super(2, cVar);
        this.f19448l = h3;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new G(this.f19448l, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r1.invoke(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.invoke(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [c4.i, i4.e] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19447k;
        if (i == 0) {
            G4.l.N(obj);
            H h3 = this.f19448l;
            ?? r1 = h3.f19449A;
            if (r1 != 0) {
                this.f19447k = 1;
            } else {
                PointerInputEventHandler pointerInputEventHandler = h3.f19450B;
                this.f19447k = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
