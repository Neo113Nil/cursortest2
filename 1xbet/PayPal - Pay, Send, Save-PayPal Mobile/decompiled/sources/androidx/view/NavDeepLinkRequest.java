package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0012B+\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0011\u0010\u000b"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest;", "", "Landroid/net/Uri;", "Landroidx/navigation/getHighSpeedVideoSizes;", "uri", "", "action", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getAction", "getMimeType", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavDeepLinkRequest {
    private final java.lang.String action;
    private final java.lang.String mimeType;
    private final android.net.Uri uri;

    public NavDeepLinkRequest(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    public android.net.Uri getUri() {
        return this.uri;
    }

    public java.lang.String getAction() {
        return this.action;
    }

    public java.lang.String getMimeType() {
        return this.mimeType;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavDeepLinkRequest{");
        if (getUri() != null) {
            sb.append(" uri=");
            sb.append(java.lang.String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb.append(" action=");
            sb.append(getAction());
        }
        if (getMimeType() != null) {
            sb.append(" mimetype=");
            sb.append(getMimeType());
        }
        sb.append(" }");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "<init>", "()V", "Landroid/net/Uri;", "Landroidx/navigation/getHighSpeedVideoSizes;", "uri", "setUri", "(Landroid/net/Uri;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "action", "setAction", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLinkRequest$Builder;", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "setMimeType", "Landroidx/navigation/NavDeepLinkRequest;", "build", "()Landroidx/navigation/NavDeepLinkRequest;", "Camera2StreamConfigurationMap", "Landroid/net/Uri;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.navigation.NavDeepLinkRequest.Builder.Companion INSTANCE = new androidx.navigation.NavDeepLinkRequest.Builder.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private android.net.Uri getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String Camera2StreamConfigurationMap;

        private Builder() {
        }

        public final androidx.navigation.NavDeepLinkRequest.Builder setUri(android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.getHighSpeedVideoFpsRangesFor = uri;
            return this;
        }

        public final androidx.navigation.NavDeepLinkRequest.Builder setAction(java.lang.String action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            if (action.length() <= 0) {
                throw new java.lang.IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
            }
            this.getHighSpeedVideoFpsRanges = action;
            return this;
        }

        public final androidx.navigation.NavDeepLinkRequest.Builder setMimeType(java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            if (!new kotlin.text.Regex("^[-\\w*.]+/[-\\w+*.]+$").matches(mimeType)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The given mimeType ");
                sb.append(mimeType);
                sb.append(" does not match to required \"type/subtype\" format");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            this.Camera2StreamConfigurationMap = mimeType;
            return this;
        }

        public final androidx.view.NavDeepLinkRequest build() {
            return new androidx.view.NavDeepLinkRequest(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\r"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder$Companion;", "", "<init>", "()V", "Landroid/net/Uri;", "Landroidx/navigation/getHighSpeedVideoSizes;", "uri", "Landroidx/navigation/NavDeepLinkRequest$Builder;", "fromUri", "(Landroid/net/Uri;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "action", "fromAction", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLinkRequest$Builder;", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "fromMimeType"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.navigation.NavDeepLinkRequest.Builder fromUri(android.net.Uri uri) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
                androidx.navigation.NavDeepLinkRequest.Builder builder = new androidx.navigation.NavDeepLinkRequest.Builder(null);
                builder.setUri(uri);
                return builder;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.navigation.NavDeepLinkRequest.Builder fromAction(java.lang.String action) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
                if (action.length() <= 0) {
                    throw new java.lang.IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
                }
                androidx.navigation.NavDeepLinkRequest.Builder builder = new androidx.navigation.NavDeepLinkRequest.Builder(null);
                builder.setAction(action);
                return builder;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.navigation.NavDeepLinkRequest.Builder fromMimeType(java.lang.String mimeType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
                androidx.navigation.NavDeepLinkRequest.Builder builder = new androidx.navigation.NavDeepLinkRequest.Builder(null);
                builder.setMimeType(mimeType);
                return builder;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.navigation.NavDeepLinkRequest.Builder fromUri(android.net.Uri uri) {
            return INSTANCE.fromUri(uri);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.navigation.NavDeepLinkRequest.Builder fromMimeType(java.lang.String str) {
            return INSTANCE.fromMimeType(str);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.navigation.NavDeepLinkRequest.Builder fromAction(java.lang.String str) {
            return INSTANCE.fromAction(str);
        }

        public /* synthetic */ Builder(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
