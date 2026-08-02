package Kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.FirstLaunchRepository", f = "FirstLaunchRepository.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 66}, m = "resetFirstLaunchPassed")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    l f15806d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f15807e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f15808f;

    /* renamed from: g, reason: collision with root package name */
    int f15809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15808f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15807e = obj;
        this.f15809g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15808f.h(this);
    }
}
