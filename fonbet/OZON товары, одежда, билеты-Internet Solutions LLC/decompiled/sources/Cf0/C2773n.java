package Cf0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;

/* renamed from: Cf0.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C2773n extends AbstractC7737t implements Function0<AbToolLibsApi> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f4939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2773n(J j11) {
        super(0);
        this.f4939b = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbToolLibsApi invoke() {
        Ld0.c cVar;
        cVar = this.f4939b.f4844a;
        return (AbToolLibsApi) cVar.e(AbToolBaseApi.class);
    }
}
