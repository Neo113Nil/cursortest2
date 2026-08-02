package Xc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel", f = "OtpViewModel.kt", l = {278}, m = "waitForOtpLength")
/* loaded from: classes3.dex */
final class r extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f34394d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f34395e;

    /* renamed from: f, reason: collision with root package name */
    int f34396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f34395e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34394d = obj;
        this.f34396f |= LinearLayoutManager.INVALID_OFFSET;
        return d.H0(this.f34395e, this);
    }
}
