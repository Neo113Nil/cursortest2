package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "lastModified", "Lio/ktor/http/content/LastModifiedVersion;", "LastModifiedVersion", "(Ljava/util/Date;)Lio/ktor/http/content/LastModifiedVersion;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VersionsJvmKt {
    public static final io.ktor.http.content.LastModifiedVersion LastModifiedVersion(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        return new io.ktor.http.content.LastModifiedVersion(io.ktor.util.date.DateJvmKt.GMTDate(java.lang.Long.valueOf(date.getTime())));
    }
}
