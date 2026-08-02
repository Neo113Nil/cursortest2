package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.id.nativeauth.tracking.TrackingApi;

/* loaded from: classes7.dex */
final class Q extends AbstractC7737t implements Function0<TrackingApi> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(K k11) {
        super(0);
        this.f15554b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TrackingApi invoke() {
        return (TrackingApi) this.f15554b.M().q().getValue().create(TrackingApi.class);
    }
}
