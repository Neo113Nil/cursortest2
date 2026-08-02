package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/io/FileWrapper;", "", "", "child", "concat", "(Ljava/lang/String;)Lcom/zettle/sdk/io/FileWrapper;", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "()V", "", "listFiles", "()Ljava/util/List;", "makeDirs", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "", "getExists", "()Z", "exists", "", "getLastModified", "()J", "lastModified", "getPath", "()Ljava/lang/String;", "path", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FileWrapper {

    /* renamed from: Factory, reason: from kotlin metadata */
    public static final com.zettle.sdk.io.FileWrapper.Companion INSTANCE = com.zettle.sdk.io.FileWrapper.Companion.getHighSpeedVideoSizes;

    com.zettle.sdk.io.FileWrapper concat(java.lang.String child);

    void delete() throws java.io.IOException;

    boolean getExists();

    long getLastModified();

    /* renamed from: getPath */
    java.lang.String getGetHighSpeedVideoFpsRanges();

    java.util.List<com.zettle.sdk.io.FileWrapper> listFiles() throws java.io.IOException;

    void makeDirs() throws java.io.IOException;

    /* renamed from: toFile */
    java.io.File getGetHighResolutionOutputSizeshNQ4ISI();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/io/FileWrapper$Factory;", "Lkotlin/Function1;", "Ljava/io/File;", "Lcom/zettle/sdk/io/FileWrapper;", "<init>", "()V", "file", "invoke", "(Ljava/io/File;)Lcom/zettle/sdk/io/FileWrapper;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.zettle.sdk.io.FileWrapper$Factory, reason: from kotlin metadata */
    public static final class Companion implements kotlin.jvm.functions.Function1<java.io.File, com.zettle.sdk.io.FileWrapper> {
        static final /* synthetic */ com.zettle.sdk.io.FileWrapper.Companion getHighSpeedVideoSizes = new com.zettle.sdk.io.FileWrapper.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final com.zettle.sdk.io.FileWrapper invoke(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            return new com.zettle.sdk.io.FileWrapperImpl(file);
        }
    }
}
