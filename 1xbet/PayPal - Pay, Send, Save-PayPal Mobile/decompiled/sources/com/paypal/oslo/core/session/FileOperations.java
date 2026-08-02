package com.paypal.oslo.core.session;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/session/FileOperations;", "", "Ljava/io/File;", "file", "", "exists", "(Ljava/io/File;)Z", "", "listFiles", "(Ljava/io/File;)[Ljava/io/File;", "deleteRecursively", "parent", "", "child", "createFile", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FileOperations {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.session.FileOperations.Companion INSTANCE = com.paypal.oslo.core.session.FileOperations.Companion.Camera2StreamConfigurationMap;

    java.io.File createFile(java.io.File parent, java.lang.String child);

    boolean deleteRecursively(java.io.File file);

    boolean exists(java.io.File file);

    java.io.File[] listFiles(java.io.File file);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/session/FileOperations$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/session/FileOperations;", "Default", "Lcom/paypal/oslo/core/session/FileOperations;", "getDefault", "()Lcom/paypal/oslo/core/session/FileOperations;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.core.session.FileOperations.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.core.session.FileOperations.Companion();
        private static final com.paypal.oslo.core.session.FileOperations Default = new com.paypal.oslo.core.session.FileOperations() { // from class: com.paypal.oslo.core.session.FileOperations$Companion$Default$1
            @Override // com.paypal.oslo.core.session.FileOperations
            public final boolean exists(java.io.File file) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
                return file.exists();
            }

            @Override // com.paypal.oslo.core.session.FileOperations
            public final java.io.File[] listFiles(java.io.File file) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
                return file.listFiles();
            }

            @Override // com.paypal.oslo.core.session.FileOperations
            public final boolean deleteRecursively(java.io.File file) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
                return kotlin.io.FilesKt.deleteRecursively(file);
            }

            @Override // com.paypal.oslo.core.session.FileOperations
            public final java.io.File createFile(java.io.File parent, java.lang.String child) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
                return new java.io.File(parent, child);
            }
        };

        private Companion() {
        }

        public final com.paypal.oslo.core.session.FileOperations getDefault() {
            return Default;
        }
    }
}
