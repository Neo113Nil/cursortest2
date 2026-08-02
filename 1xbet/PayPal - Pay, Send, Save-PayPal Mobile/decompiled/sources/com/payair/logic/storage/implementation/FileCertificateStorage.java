package com.payair.logic.storage.implementation;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/payair/logic/storage/implementation/FileCertificateStorage;", "Lcom/payair/logic/storage/implementation/CertificateStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "storeCertificate", "(Ljava/lang/String;)Z", "getStoredCertificate", "()Ljava/lang/String;", "", "clearData", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileCertificateStorage implements com.payair.logic.storage.implementation.CertificateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4513a;

    public FileCertificateStorage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f4513a = context;
    }

    @Override // com.payair.logic.storage.implementation.CertificateStorage
    public final void clearData() {
        this.f4513a.deleteFile("cardEncryptionCertificate");
    }

    @Override // com.payair.logic.storage.implementation.CertificateStorage
    public final java.lang.String getStoredCertificate() {
        try {
            java.io.FileInputStream openFileInput = this.f4513a.openFileInput("cardEncryptionCertificate");
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(openFileInput);
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(openFileInput, kotlin.text.Charsets.UTF_8), 8192);
                try {
                    java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    kotlin.io.CloseableKt.closeFinally(openFileInput, null);
                    return readText;
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "error when reading certificate: ".concat(java.lang.String.valueOf(e.getMessage())), null, null, 6, null);
            return "";
        }
    }

    @Override // com.payair.logic.storage.implementation.CertificateStorage
    public final boolean storeCertificate(java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        try {
            java.io.FileOutputStream openFileOutput = this.f4513a.openFileOutput("cardEncryptionCertificate", 0);
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(openFileOutput);
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(openFileOutput, kotlin.text.Charsets.UTF_8), 8192);
                try {
                    bufferedWriter.write(data);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(bufferedWriter, null);
                    kotlin.io.CloseableKt.closeFinally(openFileOutput, null);
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "error when storing certificate: ".concat(java.lang.String.valueOf(e.getMessage())), null, null, 6, null);
            return false;
        }
    }
}
