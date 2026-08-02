package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.Unit;

@PublishedApi
/* renamed from: kotlinx.coroutines.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1124z0 extends C0 implements InterfaceC1121y {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124z0(InterfaceC1120x0 interfaceC1120x0) {
        super(true);
        C0 h;
        boolean z = true;
        I(interfaceC1120x0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0.b;
        InterfaceC1109s interfaceC1109s = (InterfaceC1109s) atomicReferenceFieldUpdater.get(this);
        C1111t c1111t = interfaceC1109s instanceof C1111t ? (C1111t) interfaceC1109s : null;
        if (c1111t != null && (h = c1111t.h()) != null) {
            while (!h.D()) {
                InterfaceC1109s interfaceC1109s2 = (InterfaceC1109s) atomicReferenceFieldUpdater.get(h);
                C1111t c1111t2 = interfaceC1109s2 instanceof C1111t ? (C1111t) interfaceC1109s2 : null;
                if (c1111t2 != null && (h = c1111t2.h()) != null) {
                }
            }
            this.c = z;
        }
        z = false;
        this.c = z;
    }

    @Override // kotlinx.coroutines.C0
    public final boolean D() {
        return this.c;
    }

    @Override // kotlinx.coroutines.C0
    public final boolean E() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC1121y
    public final boolean complete() {
        return M(Unit.INSTANCE);
    }
}
