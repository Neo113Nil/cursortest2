package com.paypal.oslo.feature.dataprivacy.data.util;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/data/util/FileSaverImpl;", "Lcom/paypal/oslo/feature/dataprivacy/domain/util/FileSaver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "uri", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "", "writeToUri", "(Landroid/net/Uri;[B)Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FileSaverImpl implements com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver {
    public static final int $stable = 8;
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FileSaverImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    @Override // com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver
    public final boolean writeToUri(android.net.Uri uri, byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        try {
            java.io.OutputStream openOutputStream = this.getHighResolutionOutputSizeshNQ4ISI.getContentResolver().openOutputStream(uri);
            if (openOutputStream != null) {
                java.io.OutputStream outputStream = openOutputStream;
                try {
                    outputStream.write(bytes);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(outputStream, null);
                } finally {
                }
            }
            return true;
        } catch (java.io.IOException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.dataprivacy.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("uri", uri.toString());
            java.lang.String message = e.getMessage();
            pairArr[1] = kotlin.TuplesKt.to("error", message != null ? message : "");
            com.paypal.android.logger.Logger.e$default(logger, "Failed to write file", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
            return false;
        }
    }
}
