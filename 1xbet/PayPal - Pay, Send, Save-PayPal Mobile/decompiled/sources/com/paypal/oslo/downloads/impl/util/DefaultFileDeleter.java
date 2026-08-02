package com.paypal.oslo.downloads.impl.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/paypal/oslo/downloads/impl/util/DefaultFileDeleter;", "Lcom/paypal/oslo/downloads/impl/util/FileDeleter;", "<init>", "()V", "", "path", "", "deleteIfExists", "(Ljava/lang/String;)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultFileDeleter implements com.paypal.oslo.downloads.impl.util.FileDeleter {
    private static final com.paypal.oslo.downloads.impl.util.DefaultFileDeleter.Companion Companion = new com.paypal.oslo.downloads.impl.util.DefaultFileDeleter.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String LOG_FAILED_TO_DELETE_FILE = "Failed to delete file";

    @javax.inject.Inject
    public DefaultFileDeleter() {
    }

    @Override // com.paypal.oslo.downloads.impl.util.FileDeleter
    public final boolean deleteIfExists(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        java.io.File file = new java.io.File(path);
        if (!file.exists() || file.delete()) {
            return true;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, LOG_FAILED_TO_DELETE_FILE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fileName", file.getName())), null, 4, null);
        return false;
    }

    @Override // com.paypal.oslo.downloads.impl.util.FileDeleter
    public final boolean delete(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return new java.io.File(path).delete();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/util/DefaultFileDeleter$Companion;", "", "<init>", "()V", "", "LOG_FAILED_TO_DELETE_FILE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
