package androidx.lifecycle;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {235}, m = "clearSource$lifecycle_livedata_release")
/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5421i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f43322d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5423j<Object> f43323e;

    /* renamed from: f, reason: collision with root package name */
    int f43324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5421i(C5423j c5423j, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f43323e = c5423j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f43322d = obj;
        this.f43324f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f43323e.d(this);
    }
}
