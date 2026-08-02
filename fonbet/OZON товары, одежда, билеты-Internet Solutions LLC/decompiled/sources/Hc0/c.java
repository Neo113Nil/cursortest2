package Hc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.nativeauth.fintech.repository.FintechRecoveryCameraRepository", f = "FintechRecoveryCameraRepository.kt", l = {76}, m = "uploadVideo")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f10829d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f10830e;

    /* renamed from: f, reason: collision with root package name */
    int f10831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f10830e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f10829d = obj;
        this.f10831f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f10830e.e(null, null, this);
    }
}
