package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersDataSource", f = "ExtraHeadersDataSource.kt", l = {51}, m = "readExtraHeaders")
/* loaded from: classes7.dex */
final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f32692d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f32693e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f32694f;

    /* renamed from: g, reason: collision with root package name */
    int f32695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32694f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Serializable f7;
        this.f32693e = obj;
        this.f32695g |= LinearLayoutManager.INVALID_OFFSET;
        f7 = this.f32694f.f(this);
        return f7;
    }
}
