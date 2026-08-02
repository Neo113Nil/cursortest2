package Og0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.dialog.internal.data.repository.DialogStateRepositoryImpl", f = "DialogStateRepositoryImpl.kt", l = {32}, m = "isDisabledDialog")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f20376d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f20377e;

    /* renamed from: f, reason: collision with root package name */
    int f20378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f20377e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f20376d = obj;
        this.f20378f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f20377e.c(this);
    }
}
