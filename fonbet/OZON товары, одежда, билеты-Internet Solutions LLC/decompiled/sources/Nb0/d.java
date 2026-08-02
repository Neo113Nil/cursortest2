package Nb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.forceSignIn.ForceSignInUseCase", f = "ForceSignInUseCase.kt", l = {188}, m = "getOtpPageDeeplink")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f18902d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f18903e;

    /* renamed from: f, reason: collision with root package name */
    int f18904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f18903e = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object q11;
        this.f18902d = obj;
        this.f18904f |= LinearLayoutManager.INVALID_OFFSET;
        q11 = this.f18903e.q(null, this);
        return q11;
    }
}
