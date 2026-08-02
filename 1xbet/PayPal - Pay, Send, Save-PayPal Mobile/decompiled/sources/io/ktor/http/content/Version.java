package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/http/content/Version;", "", "Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/VersionCheckResult;", "check", "(Lio/ktor/http/Headers;)Lio/ktor/http/content/VersionCheckResult;", "Lio/ktor/http/HeadersBuilder;", "builder", "", "appendHeadersTo", "(Lio/ktor/http/HeadersBuilder;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Version {
    void appendHeadersTo(io.ktor.http.HeadersBuilder builder);

    io.ktor.http.content.VersionCheckResult check(io.ktor.http.Headers requestHeaders);
}
