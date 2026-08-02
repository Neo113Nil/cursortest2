package com.zettle.sdk.core.context;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"T", "", "", "Lcom/zettle/sdk/core/context/ZettleContextFactory;", "key", "getOrThrow", "(Ljava/util/Map;Ljava/lang/String;)Lcom/zettle/sdk/core/context/ZettleContextFactory;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "putOrThrowIfExist", "(Ljava/util/Map;Ljava/lang/String;Lcom/zettle/sdk/core/context/ZettleContextFactory;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleContextImplExtKt {
    public static final <T> com.zettle.sdk.core.context.ZettleContextFactory<T> getOrThrow(java.util.Map<java.lang.String, ? extends com.zettle.sdk.core.context.ZettleContextFactory<?>> map, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object obj = map.get(str);
        if (obj != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return (com.zettle.sdk.core.context.ZettleContextFactory) obj;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependency ");
        sb.append(str);
        sb.append(" not found");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void putOrThrowIfExist(java.util.Map<java.lang.String, com.zettle.sdk.core.context.ZettleContextFactory<?>> map, java.lang.String str, com.zettle.sdk.core.context.ZettleContextFactory<T> zettleContextFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleContextFactory, "");
        if (map.containsKey(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependency ");
            sb.append(str);
            sb.append(" already exists");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        map.put(str, zettleContextFactory);
    }
}
