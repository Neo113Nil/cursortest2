package io.sentry;

import io.sentry.util.Objects;
import java.net.URI;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class RequestDetailsResolver {
    private static final String SENTRY_AUTH = "X-Sentry-Auth";
    private static final String USER_AGENT = "User-Agent";
    private final Dsn dsn;
    private final String sentryClientName;

    public RequestDetailsResolver(String str, String str2) {
        Objects.requireNonNull(str, "dsn is required");
        this.dsn = new Dsn(str);
        this.sentryClientName = str2;
    }

    public RequestDetails resolve() {
        URI sentryUri = this.dsn.getSentryUri();
        String uri = sentryUri.resolve(sentryUri.getPath() + "/envelope/").toString();
        String publicKey = this.dsn.getPublicKey();
        String secretKey = this.dsn.getSecretKey();
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(this.sentryClientName);
        sb.append(",sentry_key=");
        sb.append(publicKey);
        sb.append((secretKey == null || secretKey.length() <= 0) ? "" : ",sentry_secret=".concat(secretKey));
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put(USER_AGENT, this.sentryClientName);
        hashMap.put(SENTRY_AUTH, sb2);
        return new RequestDetails(uri, hashMap);
    }

    public RequestDetailsResolver(SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "options is required");
        this.dsn = sentryOptions.retrieveParsedDsn();
        this.sentryClientName = sentryOptions.getSentryClientName();
    }
}
