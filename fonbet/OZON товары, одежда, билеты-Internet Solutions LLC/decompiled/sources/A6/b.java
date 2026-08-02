package A6;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "com.esiasdk.android.domain.AuthRepositoryBase", f = "AuthRepositoryBase.kt", l = {71}, m = "getPermissionsUrl$suspendImpl")
/* loaded from: classes8.dex */
final class b extends c {

    /* renamed from: d, reason: collision with root package name */
    String f502d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f503e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a f504f;

    /* renamed from: g, reason: collision with root package name */
    int f505g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar, c cVar) {
        super(cVar);
        this.f504f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f503e = obj;
        this.f505g |= LinearLayoutManager.INVALID_OFFSET;
        return a.c(this.f504f, null, null, null, this);
    }
}
