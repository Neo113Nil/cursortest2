package J00;

import A00.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl", f = "Middleware.kt", l = {298}, m = "fetchUntil")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f13590d;

    /* renamed from: e, reason: collision with root package name */
    a.s f13591e;

    /* renamed from: f, reason: collision with root package name */
    Object f13592f;

    /* renamed from: g, reason: collision with root package name */
    Function1 f13593g;

    /* renamed from: h, reason: collision with root package name */
    L00.g f13594h;

    /* renamed from: i, reason: collision with root package name */
    ArrayList f13595i;

    /* renamed from: j, reason: collision with root package name */
    int f13596j;

    /* renamed from: k, reason: collision with root package name */
    /* synthetic */ Object f13597k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13598l;

    /* renamed from: m, reason: collision with root package name */
    int f13599m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f13598l = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f13597k = obj;
        this.f13599m |= LinearLayoutManager.INVALID_OFFSET;
        return b.b(this.f13598l, null, null, 0, null, this);
    }
}
