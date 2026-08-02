package R2;

import R2.C3921o;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
/* renamed from: R2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3920n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f24388d;

    /* renamed from: e, reason: collision with root package name */
    Object f24389e;

    /* renamed from: f, reason: collision with root package name */
    Object f24390f;

    /* renamed from: g, reason: collision with root package name */
    kotlin.jvm.internal.M f24391g;

    /* renamed from: h, reason: collision with root package name */
    C3922p f24392h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f24393i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C3921o.a f24394j;

    /* renamed from: k, reason: collision with root package name */
    int f24395k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3920n(C3921o.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f24394j = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24393i = obj;
        this.f24395k |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24394j.a(null, this);
    }
}
