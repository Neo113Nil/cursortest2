package Nb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.forceSignIn.ForceSignInUseCase", f = "ForceSignInUseCase.kt", l = {148, 151}, m = "submitOtp")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f18925d;

    /* renamed from: e, reason: collision with root package name */
    String f18926e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f18927f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ i f18928g;

    /* renamed from: h, reason: collision with root package name */
    int f18929h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f18928g = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object v11;
        this.f18927f = obj;
        this.f18929h |= LinearLayoutManager.INVALID_OFFSET;
        v11 = this.f18928g.v(null, null, this);
        return v11;
    }
}
