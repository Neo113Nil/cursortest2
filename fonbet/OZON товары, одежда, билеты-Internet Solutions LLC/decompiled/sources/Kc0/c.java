package Kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.instantAuth.data.CredentialDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.CredentialManagerRepository", f = "CredentialManagerRepository.kt", l = {28, 29}, m = "saveCredential")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    CredentialDTO f15792d;

    /* renamed from: e, reason: collision with root package name */
    d f15793e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f15794f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f15795g;

    /* renamed from: h, reason: collision with root package name */
    int f15796h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15795g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15794f = obj;
        this.f15796h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15795g.c(null, this);
    }
}
