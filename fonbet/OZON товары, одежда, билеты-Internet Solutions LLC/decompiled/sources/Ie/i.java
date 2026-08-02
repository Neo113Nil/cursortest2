package Ie;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
/* loaded from: classes.dex */
final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    h f12304d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f12305e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h<Object> f12306f;

    /* renamed from: g, reason: collision with root package name */
    int f12307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f12306f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j11;
        this.f12305e = obj;
        this.f12307g |= LinearLayoutManager.INVALID_OFFSET;
        j11 = this.f12306f.j(this);
        return j11;
    }
}
