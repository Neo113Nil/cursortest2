package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.id.user.data.GetUserApi;

/* renamed from: Kb0.f0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3455f0 extends AbstractC7737t implements Function0<GetUserApi> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3455f0(K k11) {
        super(0);
        this.f15643b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GetUserApi invoke() {
        return (GetUserApi) this.f15643b.M().q().getValue().create(GetUserApi.class);
    }
}
