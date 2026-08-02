package okhttp3.dnsoverhttps;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0002$#B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0007\u0010\"R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\"R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\""}, d2 = {"Lokhttp3/dnsoverhttps/DnsOverHttps;", "Lokhttp3/Dns;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/HttpUrl;", "url", "", "includeIPv6", "post", "resolvePrivateAddresses", "resolvePublicAddresses", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/HttpUrl;ZZZZ)V", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "p0", "Camera2StreamConfigurationMap", "Lokhttp3/Response;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lokhttp3/Response;)Ljava/util/List;", "", "Lokhttp3/Request;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;I)Lokhttp3/Request;", "Lokhttp3/OkHttpClient;", "()Lokhttp3/OkHttpClient;", "Lokhttp3/HttpUrl;", "()Lokhttp3/HttpUrl;", "Z", "()Z", "Companion", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DnsOverHttps implements okhttp3.Dns {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.dnsoverhttps.DnsOverHttps.Companion INSTANCE = new okhttp3.dnsoverhttps.DnsOverHttps.Companion(null);
    private static final okhttp3.MediaType DNS_MESSAGE = okhttp3.MediaType.INSTANCE.get("application/dns-message");
    public static final int MAX_RESPONSE_SIZE = 65536;
    private final okhttp3.OkHttpClient client;
    private final boolean includeIPv6;
    private final boolean post;
    private final boolean resolvePrivateAddresses;
    private final boolean resolvePublicAddresses;
    private final okhttp3.HttpUrl url;

    public DnsOverHttps(okhttp3.OkHttpClient okHttpClient, okhttp3.HttpUrl httpUrl, boolean z, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        this.client = okHttpClient;
        this.url = httpUrl;
        this.includeIPv6 = z;
        this.post = z2;
        this.resolvePrivateAddresses = z3;
        this.resolvePublicAddresses = z4;
    }

    /* renamed from: client, reason: from getter */
    public final okhttp3.OkHttpClient getClient() {
        return this.client;
    }

    /* renamed from: url, reason: from getter */
    public final okhttp3.HttpUrl getUrl() {
        return this.url;
    }

    /* renamed from: includeIPv6, reason: from getter */
    public final boolean getIncludeIPv6() {
        return this.includeIPv6;
    }

    /* renamed from: post, reason: from getter */
    public final boolean getPost() {
        return this.post;
    }

    /* renamed from: resolvePrivateAddresses, reason: from getter */
    public final boolean getResolvePrivateAddresses() {
        return this.resolvePrivateAddresses;
    }

    /* renamed from: resolvePublicAddresses, reason: from getter */
    public final boolean getResolvePublicAddresses() {
        return this.resolvePublicAddresses;
    }

    @Override // okhttp3.Dns
    public final java.util.List<java.net.InetAddress> lookup(java.lang.String hostname) throws java.net.UnknownHostException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        if (!this.resolvePrivateAddresses || !this.resolvePublicAddresses) {
            boolean isPrivateHost$okhttp_dnsoverhttps = INSTANCE.isPrivateHost$okhttp_dnsoverhttps(hostname);
            if (isPrivateHost$okhttp_dnsoverhttps && !this.resolvePrivateAddresses) {
                throw new java.net.UnknownHostException("private hosts not resolved");
            }
            if (!isPrivateHost$okhttp_dnsoverhttps && !this.resolvePublicAddresses) {
                throw new java.net.UnknownHostException("public hosts not resolved");
            }
        }
        return Camera2StreamConfigurationMap(hostname);
    }

    private final java.util.List<java.net.InetAddress> Camera2StreamConfigurationMap(final java.lang.String p0) throws java.net.UnknownHostException {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(this.client.newCall(getHighSpeedVideoFpsRangesFor(p0, 1)));
        if (this.includeIPv6) {
            createListBuilder.add(this.client.newCall(getHighSpeedVideoFpsRangesFor(p0, 28)));
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(5);
        final java.util.ArrayList arrayList3 = arrayList2;
        final java.util.ArrayList arrayList4 = arrayList;
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(build.size());
        java.util.Iterator it = build.iterator();
        while (it.hasNext()) {
            ((okhttp3.Call) it.next()).enqueue(new okhttp3.Callback() { // from class: okhttp3.dnsoverhttps.DnsOverHttps$executeRequests$1
                @Override // okhttp3.Callback
                public final void onFailure(okhttp3.Call call, java.io.IOException e) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                    java.util.List<java.lang.Exception> list = arrayList4;
                    synchronized (list) {
                        list.add(e);
                    }
                    countDownLatch.countDown();
                }

                @Override // okhttp3.Callback
                public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                    okhttp3.dnsoverhttps.DnsOverHttps.access$processResponse(this, response, p0, arrayList3, arrayList4);
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException e) {
            arrayList4.add(e);
        }
        java.util.ArrayList arrayList5 = arrayList2;
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        if (arrayList4.isEmpty()) {
            throw new java.net.UnknownHostException(p0);
        }
        java.lang.Exception exc = (java.lang.Exception) arrayList4.get(0);
        if (exc instanceof java.net.UnknownHostException) {
            throw exc;
        }
        java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException(p0);
        unknownHostException.initCause(exc);
        int size = arrayList4.size();
        for (int i = 1; i < size; i++) {
            kotlin.ExceptionsKt.addSuppressed(unknownHostException, (java.lang.Throwable) arrayList4.get(i));
        }
        throw unknownHostException;
    }

    private static java.util.List<java.net.InetAddress> getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, okhttp3.Response p1) throws java.lang.Exception {
        if (p1.cacheResponse() == null && p1.protocol() != okhttp3.Protocol.HTTP_2 && p1.protocol() != okhttp3.Protocol.QUIC) {
            okhttp3.internal.platform.Platform platform = okhttp3.internal.platform.Platform.INSTANCE.get();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrect protocol: ");
            sb.append(p1.protocol());
            okhttp3.internal.platform.Platform.log$default(platform, sb.toString(), 5, null, 4, null);
        }
        okhttp3.Response response = p1;
        try {
            okhttp3.Response response2 = response;
            if (!p1.getIsSuccessful()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("response: ");
                sb2.append(p1.code());
                sb2.append(' ');
                sb2.append(p1.message());
                throw new java.io.IOException(sb2.toString());
            }
            okhttp3.ResponseBody body = p1.body();
            if (body.getGetHighSpeedVideoSizes() > 65536) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("response size exceeds limit (65536 bytes): ");
                sb3.append(body.getGetHighSpeedVideoSizes());
                sb3.append(" bytes");
                throw new java.io.IOException(sb3.toString());
            }
            java.util.List<java.net.InetAddress> decodeAnswers = okhttp3.dnsoverhttps.DnsRecordCodec.INSTANCE.decodeAnswers(p0, body.getGetHighResolutionOutputSizeshNQ4ISI().readByteString());
            kotlin.io.CloseableKt.closeFinally(response, null);
            return decodeAnswers;
        } finally {
        }
    }

    private final okhttp3.Request getHighSpeedVideoFpsRangesFor(java.lang.String p0, int p1) {
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        okhttp3.MediaType mediaType = DNS_MESSAGE;
        okhttp3.Request.Builder header = builder.header("Accept", mediaType.toString());
        okio.ByteString encodeQuery = okhttp3.dnsoverhttps.DnsRecordCodec.INSTANCE.encodeQuery(p0, p1);
        okhttp3.HttpUrl httpUrl = this.url;
        if (this.post) {
            header.url(httpUrl).cacheUrlOverride(httpUrl.newBuilder().addQueryParameter("hostname", p0).build()).post(okhttp3.RequestBody.INSTANCE.create(encodeQuery, mediaType));
        } else {
            header.url(httpUrl.newBuilder().addQueryParameter("dns", kotlin.text.StringsKt.replace$default(encodeQuery.base64Url(), "=", "", false, 4, (java.lang.Object) null)).build());
        }
        return header.build();
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0017\"\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u000e\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0010\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\"\u0010\u001a\u001a\u00020\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0011\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\"\u0010\u0012\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*"}, d2 = {"Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "", "<init>", "()V", "Lokhttp3/dnsoverhttps/DnsOverHttps;", "build", "()Lokhttp3/dnsoverhttps/DnsOverHttps;", "Lokhttp3/OkHttpClient;", "client", "(Lokhttp3/OkHttpClient;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "Lokhttp3/HttpUrl;", "url", "(Lokhttp3/HttpUrl;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "", "includeIPv6", "(Z)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "post", "resolvePrivateAddresses", "resolvePublicAddresses", "", "Ljava/net/InetAddress;", "bootstrapDnsHosts", "(Ljava/util/List;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "", "([Ljava/net/InetAddress;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "Lokhttp3/Dns;", "systemDns", "(Lokhttp3/Dns;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "Lokhttp3/OkHttpClient;", "getClient$okhttp_dnsoverhttps", "()Lokhttp3/OkHttpClient;", "setClient$okhttp_dnsoverhttps", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/HttpUrl;", "getUrl$okhttp_dnsoverhttps", "()Lokhttp3/HttpUrl;", "setUrl$okhttp_dnsoverhttps", "(Lokhttp3/HttpUrl;)V", "Z", "getIncludeIPv6$okhttp_dnsoverhttps", "()Z", "setIncludeIPv6$okhttp_dnsoverhttps", "(Z)V", "getPost$okhttp_dnsoverhttps", "setPost$okhttp_dnsoverhttps", "Lokhttp3/Dns;", "getSystemDns$okhttp_dnsoverhttps", "()Lokhttp3/Dns;", "setSystemDns$okhttp_dnsoverhttps", "(Lokhttp3/Dns;)V", "Ljava/util/List;", "getBootstrapDnsHosts$okhttp_dnsoverhttps", "()Ljava/util/List;", "setBootstrapDnsHosts$okhttp_dnsoverhttps", "(Ljava/util/List;)V", "getResolvePrivateAddresses$okhttp_dnsoverhttps", "setResolvePrivateAddresses$okhttp_dnsoverhttps", "getResolvePublicAddresses$okhttp_dnsoverhttps", "setResolvePublicAddresses$okhttp_dnsoverhttps"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        private java.util.List<? extends java.net.InetAddress> bootstrapDnsHosts;
        private okhttp3.OkHttpClient client;
        private boolean post;
        private boolean resolvePrivateAddresses;
        private okhttp3.HttpUrl url;
        private boolean includeIPv6 = true;
        private okhttp3.Dns systemDns = okhttp3.Dns.SYSTEM;
        private boolean resolvePublicAddresses = true;

        /* renamed from: getClient$okhttp_dnsoverhttps, reason: from getter */
        public final okhttp3.OkHttpClient getClient() {
            return this.client;
        }

        public final void setClient$okhttp_dnsoverhttps(okhttp3.OkHttpClient okHttpClient) {
            this.client = okHttpClient;
        }

        /* renamed from: getUrl$okhttp_dnsoverhttps, reason: from getter */
        public final okhttp3.HttpUrl getUrl() {
            return this.url;
        }

        public final void setUrl$okhttp_dnsoverhttps(okhttp3.HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        /* renamed from: getIncludeIPv6$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getIncludeIPv6() {
            return this.includeIPv6;
        }

        public final void setIncludeIPv6$okhttp_dnsoverhttps(boolean z) {
            this.includeIPv6 = z;
        }

        /* renamed from: getPost$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getPost() {
            return this.post;
        }

        public final void setPost$okhttp_dnsoverhttps(boolean z) {
            this.post = z;
        }

        /* renamed from: getSystemDns$okhttp_dnsoverhttps, reason: from getter */
        public final okhttp3.Dns getSystemDns() {
            return this.systemDns;
        }

        public final void setSystemDns$okhttp_dnsoverhttps(okhttp3.Dns dns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "");
            this.systemDns = dns;
        }

        public final java.util.List<java.net.InetAddress> getBootstrapDnsHosts$okhttp_dnsoverhttps() {
            return this.bootstrapDnsHosts;
        }

        public final void setBootstrapDnsHosts$okhttp_dnsoverhttps(java.util.List<? extends java.net.InetAddress> list) {
            this.bootstrapDnsHosts = list;
        }

        /* renamed from: getResolvePrivateAddresses$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getResolvePrivateAddresses() {
            return this.resolvePrivateAddresses;
        }

        public final void setResolvePrivateAddresses$okhttp_dnsoverhttps(boolean z) {
            this.resolvePrivateAddresses = z;
        }

        /* renamed from: getResolvePublicAddresses$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getResolvePublicAddresses() {
            return this.resolvePublicAddresses;
        }

        public final void setResolvePublicAddresses$okhttp_dnsoverhttps(boolean z) {
            this.resolvePublicAddresses = z;
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps build() {
            okhttp3.OkHttpClient okHttpClient = this.client;
            if (okHttpClient == null) {
                throw new java.lang.NullPointerException("client not set");
            }
            okhttp3.OkHttpClient build = okHttpClient.newBuilder().dns(okhttp3.dnsoverhttps.DnsOverHttps.Companion.access$buildBootstrapClient(okhttp3.dnsoverhttps.DnsOverHttps.INSTANCE, this)).build();
            okhttp3.HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new okhttp3.dnsoverhttps.DnsOverHttps(build, httpUrl, this.includeIPv6, this.post, this.resolvePrivateAddresses, this.resolvePublicAddresses);
            }
            throw new java.lang.IllegalStateException("url not set".toString());
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder client(okhttp3.OkHttpClient client) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
            this.client = client;
            return this;
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder url(okhttp3.HttpUrl url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            this.url = url;
            return this;
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder includeIPv6(boolean includeIPv6) {
            this.includeIPv6 = includeIPv6;
            return this;
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder post(boolean post) {
            this.post = post;
            return this;
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder resolvePrivateAddresses(boolean resolvePrivateAddresses) {
            this.resolvePrivateAddresses = resolvePrivateAddresses;
            return this;
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder resolvePublicAddresses(boolean resolvePublicAddresses) {
            this.resolvePublicAddresses = resolvePublicAddresses;
            return this;
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder bootstrapDnsHosts(java.util.List<? extends java.net.InetAddress> bootstrapDnsHosts) {
            this.bootstrapDnsHosts = bootstrapDnsHosts;
            return this;
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder bootstrapDnsHosts(java.net.InetAddress... bootstrapDnsHosts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bootstrapDnsHosts, "");
            return bootstrapDnsHosts(kotlin.collections.ArraysKt.toList(bootstrapDnsHosts));
        }

        public final okhttp3.dnsoverhttps.DnsOverHttps.Builder systemDns(okhttp3.Dns systemDns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemDns, "");
            this.systemDns = systemDns;
            return this;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;", "", "<init>", "()V", "", com.datadog.android.log.LogAttributes.HOST, "", "isPrivateHost$okhttp_dnsoverhttps", "(Ljava/lang/String;)Z", "Lokhttp3/MediaType;", "DNS_MESSAGE", "Lokhttp3/MediaType;", "getDNS_MESSAGE", "()Lokhttp3/MediaType;", "", "MAX_RESPONSE_SIZE", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.MediaType getDNS_MESSAGE() {
            return okhttp3.dnsoverhttps.DnsOverHttps.DNS_MESSAGE;
        }

        public final boolean isPrivateHost$okhttp_dnsoverhttps(java.lang.String host) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
            return okhttp3.internal.publicsuffix.PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(host) == null;
        }

        public static final /* synthetic */ okhttp3.Dns access$buildBootstrapClient(okhttp3.dnsoverhttps.DnsOverHttps.Companion companion, okhttp3.dnsoverhttps.DnsOverHttps.Builder builder) {
            java.util.List<java.net.InetAddress> bootstrapDnsHosts$okhttp_dnsoverhttps = builder.getBootstrapDnsHosts$okhttp_dnsoverhttps();
            if (bootstrapDnsHosts$okhttp_dnsoverhttps != null) {
                okhttp3.HttpUrl url = builder.getUrl();
                kotlin.jvm.internal.Intrinsics.checkNotNull(url);
                return new okhttp3.dnsoverhttps.BootstrapDns(url.host(), bootstrapDnsHosts$okhttp_dnsoverhttps);
            }
            return builder.getSystemDns();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$processResponse(okhttp3.dnsoverhttps.DnsOverHttps dnsOverHttps, okhttp3.Response response, java.lang.String str, java.util.List list, java.util.List list2) {
        try {
            java.util.List<java.net.InetAddress> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, response);
            synchronized (list) {
                list.addAll(highResolutionOutputSizeshNQ4ISI);
            }
        } catch (java.lang.Exception e) {
            synchronized (list2) {
                list2.add(e);
            }
        }
    }
}
