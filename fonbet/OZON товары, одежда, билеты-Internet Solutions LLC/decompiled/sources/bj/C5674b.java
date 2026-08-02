package bj;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.pagination.v2.GalleryPaging2Source", f = "GalleryPaging2Source.kt", l = {154}, m = "getData-yxL6bBk")
/* renamed from: bj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C5674b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C5677e f56047d;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f56048e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f56049f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f56050g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C5677e f56051h;

    /* renamed from: i, reason: collision with root package name */
    int f56052i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5674b(C5677e c5677e, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f56051h = c5677e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56050g = obj;
        this.f56052i |= LinearLayoutManager.INVALID_OFFSET;
        Object k11 = C5677e.k(this.f56051h, null, 0, 0, 0, this);
        return k11 == Wc.a.COROUTINE_SUSPENDED ? k11 : r.a(k11);
    }
}
