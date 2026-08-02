package Xc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel", f = "OtpViewModel.kt", l = {475}, m = "submitOtp")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f34382d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f34383e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f34384f;

    /* renamed from: g, reason: collision with root package name */
    int f34385g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f34384f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34383e = obj;
        this.f34385g |= LinearLayoutManager.INVALID_OFFSET;
        return d.F0(this.f34384f, null, this);
    }
}
