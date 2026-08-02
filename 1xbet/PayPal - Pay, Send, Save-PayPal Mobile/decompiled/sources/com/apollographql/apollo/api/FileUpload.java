package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/apollographql/apollo/api/DefaultUpload;", "toUpload", "(Ljava/io/File;Ljava/lang/String;)Lcom/apollographql/apollo/api/DefaultUpload;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileUpload {
    public static final com.apollographql.apollo.api.DefaultUpload toUpload(final java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.apollographql.apollo.api.DefaultUpload.Builder contentType = new com.apollographql.apollo.api.DefaultUpload.Builder().content(new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.api.FileUpload$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = com.apollographql.apollo.api.FileUpload.getHighResolutionOutputSizeshNQ4ISI(file, (okio.BufferedSink) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }).contentLength(file.length()).contentType(str);
        java.lang.String name2 = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return contentType.fileName(name2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.io.File file, okio.BufferedSink bufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        okio.BufferedSource buffer = okio.Okio.buffer(okio.Okio.source(file));
        try {
            bufferedSink.writeAll(buffer);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(buffer, null);
            return kotlin.Unit.INSTANCE;
        } finally {
        }
    }
}
