package com.plaid.internal;

/* renamed from: com.plaid.internal.y1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0690y1 implements com.plaid.internal.Z2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.H5 f6626a;
    public final dagger.Lazy<kotlinx.serialization.json.Json> b;
    public final kotlinx.coroutines.ExecutorCoroutineDispatcher c;
    public com.plaid.internal.N2 d;

    @javax.inject.Inject
    public C0690y1(com.plaid.internal.H5 h5, dagger.Lazy<kotlinx.serialization.json.Json> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.f6626a = h5;
        this.b = lazy;
        this.c = kotlinx.coroutines.ThreadPoolDispatcherKt.newSingleThreadContext("LinkStateStoreThreadSafe");
    }

    public static final com.plaid.internal.N2 b(com.plaid.internal.C0690y1 c0690y1) {
        try {
            com.plaid.internal.H5 h5 = c0690y1.f6626a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("plaid_link_state", "");
            java.io.File filesDir = h5.f5800a.getFilesDir();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesDir, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filesDir, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("plaid_link_state", "");
            if (!filesDir.exists()) {
                filesDir.mkdirs();
            }
            java.io.File file = new java.io.File(filesDir, "plaid_link_state");
            if (!file.exists()) {
                file.createNewFile();
            }
            java.lang.String readText$default = kotlin.io.FilesKt.readText$default(file, null, 1, null);
            if (readText$default != null && readText$default.length() != 0) {
                return (com.plaid.internal.N2) c0690y1.b.get().decodeFromString(com.plaid.internal.N2.f5851a.getValue(), readText$default);
            }
        } catch (java.lang.Exception e) {
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, e);
        } finally {
            c0690y1.f6626a.a();
        }
        return com.plaid.internal.N2.j.b;
    }

    @Override // com.plaid.internal.Z2
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        return kotlinx.coroutines.BuildersKt.withContext(this.c, new com.plaid.internal.C0672w1(this, null), continuationImpl);
    }

    @Override // com.plaid.internal.Z2
    public final java.lang.Object a(com.plaid.internal.N2 n2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.c, new com.plaid.internal.C0681x1(n2, this, null), continuationImpl);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public static final void b(com.plaid.internal.C0690y1 c0690y1, com.plaid.internal.N2 n2) {
        if (n2 instanceof com.plaid.internal.N2.b) {
            return;
        }
        c0690y1.f6626a.a("plaid_link_state", c0690y1.b.get().encodeToString(com.plaid.internal.N2.f5851a.getValue(), n2));
    }
}
