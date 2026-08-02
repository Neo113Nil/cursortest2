package bZ;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.data.CdnChooserRepository", f = "CdnChooserRepository.kt", l = {11}, m = "getCdnConfig-IoAF18A")
/* renamed from: bZ.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C5610d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f55780d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5612f f55781e;

    /* renamed from: f, reason: collision with root package name */
    int f55782f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5610d(C5612f c5612f, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f55781e = c5612f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f55780d = obj;
        this.f55782f |= LinearLayoutManager.INVALID_OFFSET;
        Object b11 = this.f55781e.b(this);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : r.a(b11);
    }
}
