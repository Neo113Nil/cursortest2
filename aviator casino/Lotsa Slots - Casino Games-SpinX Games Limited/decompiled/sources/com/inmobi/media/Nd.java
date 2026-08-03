package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Nd implements com.inmobi.media.C8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C8 f4855a;

    public Nd(kotlinx.coroutines.CoroutineScope scope, com.inmobi.media.AbstractC2353dc mrC50Model, kotlinx.coroutines.flow.MutableStateFlow lifecycleObserver) {
        com.inmobi.media.C8 rd;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mrC50Model, "mrC50Model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mrC50Model, "mrC50Model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        if (mrC50Model instanceof com.inmobi.media.O5) {
            rd = new com.inmobi.media.Md(scope, (com.inmobi.media.O5) mrC50Model, lifecycleObserver);
        } else {
            if (!(mrC50Model instanceof com.inmobi.media.C2390en)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            rd = new com.inmobi.media.Rd((com.inmobi.media.C2390en) mrC50Model);
        }
        this.f4855a = rd;
    }

    @Override // com.inmobi.media.C8
    public final void a() {
        this.f4855a.a();
    }

    @Override // com.inmobi.media.C8
    public final kotlinx.coroutines.flow.Flow b() {
        return this.f4855a.b();
    }
}
