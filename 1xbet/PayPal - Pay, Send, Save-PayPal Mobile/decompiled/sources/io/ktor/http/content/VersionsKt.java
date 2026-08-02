package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"", "spec", "Lio/ktor/http/content/EntityTagVersion;", "EntityTagVersion", "(Ljava/lang/String;)Lio/ktor/http/content/EntityTagVersion;", "Lio/ktor/util/AttributeKey;", "", "Lio/ktor/http/content/Version;", "VersionListProperty", "Lio/ktor/util/AttributeKey;", "getVersionListProperty", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/http/content/OutgoingContent;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getVersions", "(Lio/ktor/http/content/OutgoingContent;)Ljava/util/List;", "setVersions", "(Lio/ktor/http/content/OutgoingContent;Ljava/util/List;)V", "versions"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VersionsKt {
    private static final io.ktor.util.AttributeKey<java.util.List<io.ktor.http.content.Version>> VersionListProperty;

    public static final io.ktor.util.AttributeKey<java.util.List<io.ktor.http.content.Version>> getVersionListProperty() {
        return VersionListProperty;
    }

    public static final java.util.List<io.ktor.http.content.Version> getVersions(io.ktor.http.content.OutgoingContent outgoingContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        java.util.List<io.ktor.http.content.Version> list = (java.util.List) outgoingContent.getProperty(VersionListProperty);
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public static final void setVersions(io.ktor.http.content.OutgoingContent outgoingContent, java.util.List<? extends io.ktor.http.content.Version> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        outgoingContent.setProperty(VersionListProperty, list);
    }

    public static final io.ktor.http.content.EntityTagVersion EntityTagVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return io.ktor.http.content.EntityTagVersion.INSTANCE.parseSingle(str);
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.http.content.Version.class)));
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        VersionListProperty = new io.ktor.util.AttributeKey<>("VersionList", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }
}
