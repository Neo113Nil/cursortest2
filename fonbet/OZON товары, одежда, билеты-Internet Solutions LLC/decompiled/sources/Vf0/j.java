package Vf0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.extraHeaders.ExtraHeadersRepositoryImpl", f = "ExtraHeadersRepositoryImpl.kt", l = {82, 83}, m = "deleteExtraHeaders")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    h f32723d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f32724e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f32725f;

    /* renamed from: g, reason: collision with root package name */
    int f32726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f32725f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f32724e = obj;
        this.f32726g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f32725f.b(this);
    }
}
