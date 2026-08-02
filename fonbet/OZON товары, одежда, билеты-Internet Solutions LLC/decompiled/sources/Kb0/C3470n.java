package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.id.nativeauth.crossApp.data.api.CrossAppApi;

/* renamed from: Kb0.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3470n extends AbstractC7737t implements Function0<CrossAppApi> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3470n(K k11) {
        super(0);
        this.f15719b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CrossAppApi invoke() {
        return (CrossAppApi) this.f15719b.M().q().getValue().create(CrossAppApi.class);
    }
}
