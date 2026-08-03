package com.ironsource;

/* loaded from: classes5.dex */
public final class Me implements com.ironsource.J8 {
    @Override // com.ironsource.J8
    public void a(android.content.Context context, java.lang.String key, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, key, i);
    }

    @Override // com.ironsource.J8
    public int b(android.content.Context context, java.lang.String key, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, key, i);
    }

    @Override // com.ironsource.J8
    public void a(android.content.Context context, java.lang.String key, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, key, j);
    }

    @Override // com.ironsource.J8
    public long b(android.content.Context context, java.lang.String key, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, key, j);
    }
}
