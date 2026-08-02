package Nb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.forceSignIn.ForceSignInUseCase", f = "ForceSignInUseCase.kt", l = {116, 117, 119}, m = "onOtpTokenResponse")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f18918d;

    /* renamed from: e, reason: collision with root package name */
    String f18919e;

    /* renamed from: f, reason: collision with root package name */
    String f18920f;

    /* renamed from: g, reason: collision with root package name */
    Map f18921g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f18922h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ i f18923i;

    /* renamed from: j, reason: collision with root package name */
    int f18924j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f18923i = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object t2;
        this.f18922h = obj;
        this.f18924j |= LinearLayoutManager.INVALID_OFFSET;
        t2 = this.f18923i.t(null, null, null, null, this);
        return t2;
    }
}
