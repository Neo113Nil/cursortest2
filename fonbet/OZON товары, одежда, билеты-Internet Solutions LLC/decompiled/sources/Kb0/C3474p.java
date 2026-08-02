package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.id.nativeauth.crossApp.migration.data.api.PublicKeyBindMobileApi;

/* renamed from: Kb0.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3474p extends AbstractC7737t implements Function0<PublicKeyBindMobileApi> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3474p(K k11) {
        super(0);
        this.f15723b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PublicKeyBindMobileApi invoke() {
        return (PublicKeyBindMobileApi) this.f15723b.M().q().getValue().create(PublicKeyBindMobileApi.class);
    }
}
