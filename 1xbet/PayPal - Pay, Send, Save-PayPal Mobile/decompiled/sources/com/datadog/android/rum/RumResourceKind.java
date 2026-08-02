package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/datadog/android/rum/RumResourceKind;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue$dd_sdk_android_rum_release", "()Ljava/lang/String;", "Companion", "BEACON", "FETCH", "XHR", "DOCUMENT", "NATIVE", "UNKNOWN", "IMAGE", "JS", "FONT", "CSS", "MEDIA", "OTHER"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum RumResourceKind {
    BEACON("beacon"),
    FETCH("fetch"),
    XHR("xhr"),
    DOCUMENT("document"),
    NATIVE("native"),
    UNKNOWN("unknown"),
    IMAGE("image"),
    JS("js"),
    FONT(io.ktor.http.ContentType.Font.TYPE),
    CSS("css"),
    MEDIA(io.ktor.http.LinkHeader.Parameters.Media),
    OTHER("other");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.RumResourceKind.Companion INSTANCE = new com.datadog.android.rum.RumResourceKind.Companion(null);
    private final java.lang.String value;

    RumResourceKind(java.lang.String str) {
        this.value = str;
    }

    /* renamed from: getValue$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/RumResourceKind$Companion;", "", "<init>", "()V", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Lcom/datadog/android/rum/RumResourceKind;", "fromMimeType", "(Ljava/lang/String;)Lcom/datadog/android/rum/RumResourceKind;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.RumResourceKind fromMimeType(java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(mimeType, kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = substringBefore$default.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String substringBefore$default2 = kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringAfter$default(mimeType, kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null), ';', (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.Locale locale2 = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = substringBefore$default2.toLowerCase(locale2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "image")) {
                return com.datadog.android.rum.RumResourceKind.IMAGE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "video") || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "audio")) {
                return com.datadog.android.rum.RumResourceKind.MEDIA;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, io.ktor.http.ContentType.Font.TYPE) ? com.datadog.android.rum.RumResourceKind.FONT : (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "text") && kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, "css")) ? com.datadog.android.rum.RumResourceKind.CSS : (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "text") && kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, "javascript")) ? com.datadog.android.rum.RumResourceKind.JS : com.datadog.android.rum.RumResourceKind.NATIVE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
