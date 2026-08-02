package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersRepositoryImpl", f = "ExtraHeadersRepositoryImpl.kt", l = {76, 77}, m = "setExtraHeaders")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    h f32738d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f32739e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f32740f;

    /* renamed from: g, reason: collision with root package name */
    int f32741g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32740f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f32739e = obj;
        this.f32741g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32740f.e(null, this);
    }
}
