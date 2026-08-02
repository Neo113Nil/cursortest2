package K70;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.otp.sms.domain.OtpSmsInteractorImpl", f = "OtpSmsInteractorImpl.kt", l = {58}, m = "loadOtpKey")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f15344d;

    /* renamed from: e, reason: collision with root package name */
    d f15345e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f15346f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f15347g;

    /* renamed from: h, reason: collision with root package name */
    int f15348h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15347g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15346f = obj;
        this.f15348h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15347g.h(this);
    }
}
