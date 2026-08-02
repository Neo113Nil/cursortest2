package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.id.nativeauth.initAuth.InitAuthApi;

/* loaded from: classes3.dex */
final class E extends AbstractC7737t implements Function0<InitAuthApi> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3487w f15446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(C3487w c3487w) {
        super(0);
        this.f15446b = c3487w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InitAuthApi invoke() {
        return (InitAuthApi) this.f15446b.r().getValue().create(InitAuthApi.class);
    }
}
