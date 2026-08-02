package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "main", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "io", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "component1", "()Lkotlinx/coroutines/CoroutineDispatcher;", "component2", "component3", "copy", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "getIo", "getMain"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CoroutineDispatcherProvider {
    private final kotlinx.coroutines.CoroutineDispatcher default;
    private final kotlinx.coroutines.CoroutineDispatcher io;
    private final kotlinx.coroutines.CoroutineDispatcher main;

    public CoroutineDispatcherProvider(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher3, "");
        this.main = coroutineDispatcher;
        this.default = coroutineDispatcher2;
        this.io = coroutineDispatcher3;
    }

    public /* synthetic */ CoroutineDispatcherProvider(kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher2);
    }

    public final kotlinx.coroutines.CoroutineDispatcher getMain() {
        return this.main;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getDefault() {
        return this.default;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getIo() {
        return this.io;
    }

    public final java.lang.String toString() {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.main;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2 = this.default;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3 = this.io;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CoroutineDispatcherProvider(main=");
        sb.append(coroutineDispatcher);
        sb.append(", default=");
        sb.append(coroutineDispatcher2);
        sb.append(", io=");
        sb.append(coroutineDispatcher3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.main.hashCode() * 31) + this.default.hashCode()) * 31) + this.io.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.CoroutineDispatcherProvider)) {
            return false;
        }
        com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider = (com.statsig.androidsdk.CoroutineDispatcherProvider) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.main, coroutineDispatcherProvider.main) && kotlin.jvm.internal.Intrinsics.areEqual(this.default, coroutineDispatcherProvider.default) && kotlin.jvm.internal.Intrinsics.areEqual(this.io, coroutineDispatcherProvider.io);
    }

    public final com.statsig.androidsdk.CoroutineDispatcherProvider copy(kotlinx.coroutines.CoroutineDispatcher main, kotlinx.coroutines.CoroutineDispatcher r3, kotlinx.coroutines.CoroutineDispatcher io2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(main, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(io2, "");
        return new com.statsig.androidsdk.CoroutineDispatcherProvider(main, r3, io2);
    }

    /* renamed from: component3, reason: from getter */
    public final kotlinx.coroutines.CoroutineDispatcher getIo() {
        return this.io;
    }

    /* renamed from: component2, reason: from getter */
    public final kotlinx.coroutines.CoroutineDispatcher getDefault() {
        return this.default;
    }

    /* renamed from: component1, reason: from getter */
    public final kotlinx.coroutines.CoroutineDispatcher getMain() {
        return this.main;
    }

    public static /* synthetic */ com.statsig.androidsdk.CoroutineDispatcherProvider copy$default(com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = coroutineDispatcherProvider.main;
        }
        if ((i & 2) != 0) {
            coroutineDispatcher2 = coroutineDispatcherProvider.default;
        }
        if ((i & 4) != 0) {
            coroutineDispatcher3 = coroutineDispatcherProvider.io;
        }
        return coroutineDispatcherProvider.copy(coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3);
    }

    public CoroutineDispatcherProvider() {
        this(null, null, null, 7, null);
    }
}
