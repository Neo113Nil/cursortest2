package Mb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.forceLogout.ForceLogoutUseCase", f = "ForceLogoutUseCase.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 66, 71, 76, 82}, m = "onExecute")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f17810d;

    /* renamed from: e, reason: collision with root package name */
    Object f17811e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f17812f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f17813g;

    /* renamed from: h, reason: collision with root package name */
    int f17814h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.d<? super c> dVar) {
        super(dVar);
        this.f17813g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f17812f = obj;
        this.f17814h |= LinearLayoutManager.INVALID_OFFSET;
        return b.b(this.f17813g, null, this);
    }
}
