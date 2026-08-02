package Nb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.forceSignIn.ForceSignInUseCase", f = "ForceSignInUseCase.kt", l = {163, 174}, m = "onOtpResponseToken")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f18911d;

    /* renamed from: e, reason: collision with root package name */
    String f18912e;

    /* renamed from: f, reason: collision with root package name */
    Map f18913f;

    /* renamed from: g, reason: collision with root package name */
    String f18914g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f18915h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ i f18916i;

    /* renamed from: j, reason: collision with root package name */
    int f18917j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f18916i = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object s11;
        this.f18915h = obj;
        this.f18917j |= LinearLayoutManager.INVALID_OFFSET;
        s11 = this.f18916i.s(null, null, null, null, this);
        return s11;
    }
}
