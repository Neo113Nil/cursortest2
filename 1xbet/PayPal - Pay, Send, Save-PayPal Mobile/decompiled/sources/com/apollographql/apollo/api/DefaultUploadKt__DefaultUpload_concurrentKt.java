package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lokio/Path;", "", "p0", "Lokio/FileSystem;", "p1", "Lcom/apollographql/apollo/api/Upload;", "toUpload", "(Lokio/Path;Ljava/lang/String;Lokio/FileSystem;)Lcom/apollographql/apollo/api/Upload;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/api/DefaultUploadKt")
/* loaded from: classes7.dex */
final /* synthetic */ class DefaultUploadKt__DefaultUpload_concurrentKt {
    public static /* synthetic */ com.apollographql.apollo.api.Upload toUpload$default(okio.Path path, java.lang.String str, okio.FileSystem fileSystem, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            fileSystem = okio.FileSystem.SYSTEM;
        }
        return com.apollographql.apollo.api.DefaultUploadKt.toUpload(path, str, fileSystem);
    }

    public static final com.apollographql.apollo.api.Upload toUpload(final okio.Path path, java.lang.String str, final okio.FileSystem fileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        com.apollographql.apollo.api.DefaultUpload.Builder contentType = new com.apollographql.apollo.api.DefaultUpload.Builder().content(new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.api.DefaultUploadKt__DefaultUpload_concurrentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = com.apollographql.apollo.api.DefaultUploadKt__DefaultUpload_concurrentKt.getHighSpeedVideoFpsRanges(okio.FileSystem.this, path, (okio.BufferedSink) obj);
                return highSpeedVideoFpsRanges;
            }
        }).contentType(str);
        java.lang.Long size = fileSystem.metadata(path).getSize();
        return contentType.contentLength(size != null ? size.longValue() : -1L).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(okio.FileSystem fileSystem, okio.Path path, okio.BufferedSink bufferedSink) {
        java.lang.Throwable th;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        okio.FileHandle openReadOnly = fileSystem.openReadOnly(path);
        try {
            th = null;
            bufferedSink.writeAll(okio.Okio.buffer(okio.FileHandle.source$default(openReadOnly, 0L, 1, null)));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th == null) {
            return kotlin.Unit.INSTANCE;
        }
        throw th;
    }
}
