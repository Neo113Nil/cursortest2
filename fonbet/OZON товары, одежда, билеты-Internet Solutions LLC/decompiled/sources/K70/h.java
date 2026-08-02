package K70;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.otp.sms.domain.OtpSmsRepositoryImpl", f = "OtpSmsRepositoryImpl.kt", l = {24}, m = "loadAndSaveOtpKey")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f15354d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f15355e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f15356f;

    /* renamed from: g, reason: collision with root package name */
    int f15357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15356f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15355e = obj;
        this.f15357g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15356f.e(this);
    }
}
