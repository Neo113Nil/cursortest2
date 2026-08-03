package io.ktor.client.content;

/* compiled from: LocalFileContent.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/io/File;", "baseDir", "", "relativePath", "Lio/ktor/http/ContentType;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "Lio/ktor/client/content/LocalFileContent;", "LocalFileContent", "(Ljava/io/File;Ljava/lang/String;Lio/ktor/http/ContentType;)Lio/ktor/client/content/LocalFileContent;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalFileContentKt {
    public static /* synthetic */ io.ktor.client.content.LocalFileContent LocalFileContent$default(java.io.File file, java.lang.String str, io.ktor.http.ContentType contentType, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            contentType = io.ktor.http.FileContentTypeKt.defaultForFilePath(io.ktor.http.ContentType.INSTANCE, str);
        }
        return LocalFileContent(file, str, contentType);
    }

    public static final io.ktor.client.content.LocalFileContent LocalFileContent(java.io.File baseDir, java.lang.String relativePath, io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDir, "baseDir");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new io.ktor.client.content.LocalFileContent(io.ktor.util.PathKt.combineSafe(baseDir, relativePath), contentType);
    }
}
