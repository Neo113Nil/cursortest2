package com.facebook.bolts;

/* compiled from: AppLink.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/facebook/bolts/AppLink;", "", "sourceUrl", "Landroid/net/Uri;", "targets", "", "Lcom/facebook/bolts/AppLink$Target;", "webUrl", "(Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;)V", "getSourceUrl", "()Landroid/net/Uri;", "getTargets", "()Ljava/util/List;", "getWebUrl", "Target", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppLink {
    private final android.net.Uri sourceUrl;
    private final java.util.List<com.facebook.bolts.AppLink.Target> targets;
    private final android.net.Uri webUrl;

    public AppLink(android.net.Uri sourceUrl, java.util.List<com.facebook.bolts.AppLink.Target> list, android.net.Uri webUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webUrl, "webUrl");
        this.sourceUrl = sourceUrl;
        this.webUrl = webUrl;
        this.targets = list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final android.net.Uri getSourceUrl() {
        return this.sourceUrl;
    }

    public final android.net.Uri getWebUrl() {
        return this.webUrl;
    }

    /* compiled from: AppLink.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/bolts/AppLink$Target;", "", "packageName", "", "className", "url", "Landroid/net/Uri;", "appName", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getClassName", "getPackageName", "getUrl", "()Landroid/net/Uri;", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Target {
        private final java.lang.String appName;
        private final java.lang.String className;
        private final java.lang.String packageName;
        private final android.net.Uri url;

        public Target(java.lang.String packageName, java.lang.String className, android.net.Uri url, java.lang.String appName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "appName");
            this.packageName = packageName;
            this.className = className;
            this.url = url;
            this.appName = appName;
        }

        public final java.lang.String getPackageName() {
            return this.packageName;
        }

        public final java.lang.String getClassName() {
            return this.className;
        }

        public final android.net.Uri getUrl() {
            return this.url;
        }

        public final java.lang.String getAppName() {
            return this.appName;
        }
    }

    public final java.util.List<com.facebook.bolts.AppLink.Target> getTargets() {
        java.util.List<com.facebook.bolts.AppLink.Target> unmodifiableList = java.util.Collections.unmodifiableList(this.targets);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(field)");
        return unmodifiableList;
    }
}
