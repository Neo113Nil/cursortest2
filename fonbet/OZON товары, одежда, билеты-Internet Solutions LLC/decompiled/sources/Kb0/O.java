package Kb0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class O extends AbstractC7737t implements Function0<Db0.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15552b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(K k11) {
        super(0);
        this.f15552b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Db0.f invoke() {
        InterfaceC4008j interfaceC4008j;
        K k11 = this.f15552b;
        boolean isManualNotificationRootViewControl = k11.N().getIsManualNotificationRootViewControl();
        interfaceC4008j = k11.f15477K;
        if (isManualNotificationRootViewControl) {
            interfaceC4008j = null;
        }
        return new Db0.f(interfaceC4008j, k11.w(), k11.l().o(), k11.X().e(), k11.X().g(), k11.z());
    }
}
