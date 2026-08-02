package Nb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.forceSignIn.ForceSignInUseCase", f = "ForceSignInUseCase.kt", l = {95, 97, Logger.NONE, 100, 102}, m = "onDeeplinkResponse")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f18905d;

    /* renamed from: e, reason: collision with root package name */
    String f18906e;

    /* renamed from: f, reason: collision with root package name */
    String f18907f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f18908g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ i f18909h;

    /* renamed from: i, reason: collision with root package name */
    int f18910i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f18909h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f18908g = obj;
        this.f18910i |= LinearLayoutManager.INVALID_OFFSET;
        return i.g(this.f18909h, null, null, this);
    }
}
