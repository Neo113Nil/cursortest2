package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/zettle/sdk/io/FileWrapperImpl;", "Lcom/zettle/sdk/io/FileWrapper;", "Ljava/io/File;", "p0", "<init>", "(Ljava/io/File;)V", "", "concat", "(Ljava/lang/String;)Lcom/zettle/sdk/io/FileWrapper;", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "()V", "", "listFiles", "()Ljava/util/List;", "makeDirs", "toFile", "()Ljava/io/File;", "", "getExists", "()Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Ljava/io/File;", "getHighResolutionOutputSizeshNQ4ISI", "", "getLastModified", "()J", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FileWrapperImpl implements com.zettle.sdk.io.FileWrapper {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.io.File getHighResolutionOutputSizeshNQ4ISI;

    public FileWrapperImpl(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        this.getHighResolutionOutputSizeshNQ4ISI = file;
        java.lang.String absolutePath = file.getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        this.getHighSpeedVideoFpsRanges = absolutePath;
    }

    @Override // com.zettle.sdk.io.FileWrapper
    public final long getLastModified() {
        return this.getHighResolutionOutputSizeshNQ4ISI.lastModified();
    }

    @Override // com.zettle.sdk.io.FileWrapper
    /* renamed from: getPath, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.zettle.sdk.io.FileWrapper
    public final boolean getExists() {
        return this.getHighResolutionOutputSizeshNQ4ISI.exists();
    }

    @Override // com.zettle.sdk.io.FileWrapper
    public final void delete() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.exists()) {
            this.getHighResolutionOutputSizeshNQ4ISI.delete();
        }
    }

    @Override // com.zettle.sdk.io.FileWrapper
    public final java.util.List<com.zettle.sdk.io.FileWrapper> listFiles() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.exists()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.io.File[] listFiles = this.getHighResolutionOutputSizeshNQ4ISI.listFiles();
        if (listFiles == null) {
            listFiles = new java.io.File[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(listFiles.length);
        for (java.io.File file : listFiles) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file, "");
            arrayList.add(new com.zettle.sdk.io.FileWrapperImpl(file));
        }
        return arrayList;
    }

    @Override // com.zettle.sdk.io.FileWrapper
    public final void makeDirs() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.exists()) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.mkdirs();
    }

    @Override // com.zettle.sdk.io.FileWrapper
    public final com.zettle.sdk.io.FileWrapper concat(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return new com.zettle.sdk.io.FileWrapperImpl(new java.io.File(this.getHighResolutionOutputSizeshNQ4ISI, p0));
    }

    @Override // com.zettle.sdk.io.FileWrapper
    /* renamed from: toFile, reason: from getter */
    public final java.io.File getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
