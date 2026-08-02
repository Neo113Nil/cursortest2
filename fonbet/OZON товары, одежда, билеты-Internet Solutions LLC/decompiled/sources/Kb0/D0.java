package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.id.switchUser.data.SwitchUserApi;

/* loaded from: classes7.dex */
final class D0 extends AbstractC7737t implements Function0<SwitchUserApi> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D0(K k11) {
        super(0);
        this.f15445b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SwitchUserApi invoke() {
        return (SwitchUserApi) this.f15445b.M().q().getValue().create(SwitchUserApi.class);
    }
}
