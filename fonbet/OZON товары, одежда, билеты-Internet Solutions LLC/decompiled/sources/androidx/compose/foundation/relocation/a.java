package androidx.compose.foundation.relocation;

import androidx.recyclerview.widget.LinearLayoutManager;
import k1.C7460f;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {116}, m = "bringIntoView")
/* loaded from: classes8.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C7460f f39734d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f39735e;

    /* renamed from: f, reason: collision with root package name */
    int f39736f;

    /* renamed from: g, reason: collision with root package name */
    int f39737g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f39738h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ b f39739i;

    /* renamed from: j, reason: collision with root package name */
    int f39740j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f39739i = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39738h = obj;
        this.f39740j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f39739i.a(null, this);
    }
}
