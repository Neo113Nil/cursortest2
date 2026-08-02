package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;
import spay.sdk.R;
import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.PayStrategy;

/* renamed from: Ve.qm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4567qm extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Sr f31884d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ PayStrategy f31885e;

    public C4567qm() {
        super(3, null);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4567qm c4567qm = new C4567qm(3, (kotlin.coroutines.d) obj3);
        c4567qm.f31884d = (Sr) obj;
        c4567qm.f31885e = (PayStrategy) obj2;
        return c4567qm.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Sr sr = this.f31884d;
        return this.f31885e.getToolType() == SPaymentTool.PAYMENT_ACCOUNTS ? E.d(R.string.spay_empty_string) : sr == null ? E.d(R.string.spay_pay_text) : sr;
    }
}
