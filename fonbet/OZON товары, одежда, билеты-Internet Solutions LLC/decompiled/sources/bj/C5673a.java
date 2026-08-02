package bj;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.pagination.v2.GalleryPaging2Source", f = "GalleryPaging2Source.kt", l = {107}, m = "getCount-gIAlu-s")
/* renamed from: bj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C5673a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C5677e f56043d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f56044e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5677e f56045f;

    /* renamed from: g, reason: collision with root package name */
    int f56046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5673a(C5677e c5677e, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f56045f = c5677e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56044e = obj;
        this.f56046g |= LinearLayoutManager.INVALID_OFFSET;
        Serializable j11 = C5677e.j(this.f56045f, null, this);
        return j11 == Wc.a.COROUTINE_SUSPENDED ? j11 : r.a(j11);
    }
}
