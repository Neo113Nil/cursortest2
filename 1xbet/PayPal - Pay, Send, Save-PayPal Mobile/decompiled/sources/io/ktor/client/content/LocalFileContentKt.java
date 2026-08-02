package io.ktor.client.content;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/io/File;", "baseDir", "", "relativePath", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lio/ktor/client/content/LocalFileContent;", "LocalFileContent", "(Ljava/io/File;Ljava/lang/String;Lio/ktor/http/ContentType;)Lio/ktor/client/content/LocalFileContent;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocalFileContentKt {
    public static /* synthetic */ io.ktor.client.content.LocalFileContent LocalFileContent$default(java.io.File file, java.lang.String str, io.ktor.http.ContentType contentType, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            contentType = io.ktor.http.FileContentTypeKt.defaultForFilePath(io.ktor.http.ContentType.INSTANCE, str);
        }
        return LocalFileContent(file, str, contentType);
    }

    public static final io.ktor.client.content.LocalFileContent LocalFileContent(java.io.File file, java.lang.String str, io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        return new io.ktor.client.content.LocalFileContent(io.ktor.util.PathKt.combineSafe(file, str), contentType);
    }
}
