package Kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.CredentialManagerRepository", f = "CredentialManagerRepository.kt", l = {17, 18}, m = "restoreCredential")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    d f15788d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f15789e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f15790f;

    /* renamed from: g, reason: collision with root package name */
    int f15791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f15790f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f15789e = obj;
        this.f15791g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f15790f.b(this);
    }
}
