package Fd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.inapp.push.sdk.internal.domain.InAppPushInteractor", f = "InAppPushInteractor.kt", l = {43}, m = "callPixelUrl")
/* loaded from: classes3.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f9409d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f9410e;

    /* renamed from: f, reason: collision with root package name */
    int f9411f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f9410e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f9409d = obj;
        this.f9411f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f9410e.a(null, null, this);
    }
}
