package Hc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.nativeauth.fintech.repository.FintechRecoveryCameraRepository", f = "FintechRecoveryCameraRepository.kt", l = {55}, m = "uploadSelfiePhoto")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f10824d;

    /* renamed from: e, reason: collision with root package name */
    File f10825e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f10826f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f10827g;

    /* renamed from: h, reason: collision with root package name */
    int f10828h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f10827g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f10826f = obj;
        this.f10828h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f10827g.d(null, null, this);
    }
}
