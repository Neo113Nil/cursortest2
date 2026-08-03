package com.vungle.ads.internal.downloader;

/* compiled from: DefaultPrivacyIconInjector.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/downloader/DefaultPrivacyIconInjector;", "", "()V", "injectPrivacyIcon", "Ljava/io/File;", "dir", "writePrivacyFileFromString", "", "file", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPrivacyIconInjector {
    public static final com.vungle.ads.internal.downloader.DefaultPrivacyIconInjector INSTANCE = new com.vungle.ads.internal.downloader.DefaultPrivacyIconInjector();

    private DefaultPrivacyIconInjector() {
    }

    public final java.io.File injectPrivacyIcon(java.io.File dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.io.File file = new java.io.File(dir, com.vungle.ads.internal.Constants.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }

    private final boolean writePrivacyFileFromString(java.io.File file) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.downloader.DefaultPrivacyIconInjector defaultPrivacyIconInjector = this;
            byte[] decode = android.util.Base64.decode(com.vungle.ads.internal.Constants.LO_PRIVACY_ICON_STRING, 0);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                fileOutputStream.write(decode);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(true);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = false;
        }
        return ((java.lang.Boolean) m10798constructorimpl).booleanValue();
    }
}
