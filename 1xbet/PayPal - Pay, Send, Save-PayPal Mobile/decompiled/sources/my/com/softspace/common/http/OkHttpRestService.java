package my.com.softspace.common.http;

/* loaded from: classes17.dex */
class OkHttpRestService implements my.com.softspace.common.http.RestService {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final okhttp3.OkHttpClient getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile("https?://([a-zA-Z0-9.-]+)(:\\d+)?(/.*)?");
    private static final okhttp3.MediaType getHighResolutionOutputSizeshNQ4ISI = okhttp3.MediaType.parse("application/json");

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor() {
        return true;
    }

    OkHttpRestService(my.com.softspace.common.CommonProperties commonProperties, java.security.SecureRandom secureRandom) {
        java.lang.String host = commonProperties.getHost();
        this.getHighSpeedVideoSizes = host;
        java.lang.String keyLoadingHost = commonProperties.getKeyLoadingHost();
        this.Camera2StreamConfigurationMap = keyLoadingHost;
        long connectTimeout = commonProperties.getConnectTimeout() == 0 ? 30000L : commonProperties.getConnectTimeout();
        long readTimeout = commonProperties.getReadTimeout() != 0 ? commonProperties.getReadTimeout() : 30000L;
        long keepAliveDuration = commonProperties.getKeepAliveDuration() == 0 ? 55000L : commonProperties.getKeepAliveDuration();
        boolean booleanValue = commonProperties.getStrictHttp() == null ? true : commonProperties.getStrictHttp().booleanValue();
        java.lang.String certificatePinning = commonProperties.getCertificatePinning();
        java.lang.String keyLoadingHostCertPinning = commonProperties.getKeyLoadingHostCertPinning();
        java.util.regex.Pattern pattern = getHighSpeedVideoFpsRanges;
        if (!pattern.matcher(host).matches()) {
            throw new java.lang.IllegalArgumentException();
        }
        if (keyLoadingHost != null && !pattern.matcher(keyLoadingHost).matches()) {
            throw new java.lang.IllegalArgumentException();
        }
        okhttp3.OkHttpClient.Builder connectionPool = new okhttp3.OkHttpClient.Builder().connectTimeout(connectTimeout, java.util.concurrent.TimeUnit.MILLISECONDS).readTimeout(readTimeout, java.util.concurrent.TimeUnit.MILLISECONDS).retryOnConnectionFailure(true).followRedirects(false).followSslRedirects(false).connectionPool(new okhttp3.ConnectionPool(2, keepAliveDuration, java.util.concurrent.TimeUnit.MILLISECONDS));
        okhttp3.CertificatePinner.Builder builder = null;
        if (booleanValue) {
            if (certificatePinning != null && certificatePinning.length() > 0) {
                java.lang.String[] split = certificatePinning.split("\\,");
                java.util.regex.Matcher matcher = pattern.matcher(host);
                if (matcher.find()) {
                    builder = new okhttp3.CertificatePinner.Builder();
                    builder.add(matcher.group(1), split);
                }
            }
            if (keyLoadingHostCertPinning != null && keyLoadingHostCertPinning.length() > 0) {
                java.lang.String[] split2 = keyLoadingHostCertPinning.split("\\,");
                java.util.regex.Matcher matcher2 = pattern.matcher(keyLoadingHost);
                if (matcher2.find()) {
                    builder = builder == null ? new okhttp3.CertificatePinner.Builder() : builder;
                    builder.add(matcher2.group(1), split2);
                }
            }
            if (builder != null) {
                connectionPool.certificatePinner(builder.build());
            }
            connectionPool.connectionSpecs(java.util.Arrays.asList(okhttp3.ConnectionSpec.MODERN_TLS));
        } else {
            try {
                javax.net.ssl.X509TrustManager x509TrustManager = new javax.net.ssl.X509TrustManager() { // from class: my.com.softspace.common.http.OkHttpRestService.1
                    @Override // javax.net.ssl.X509TrustManager
                    public void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new java.security.cert.X509Certificate[0];
                    }
                };
                javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("SSL");
                sSLContext.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, secureRandom);
                connectionPool.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager);
                connectionPool.hostnameVerifier(new javax.net.ssl.HostnameVerifier() { // from class: my.com.softspace.common.http.OkHttpRestService$$ExternalSyntheticLambda1
                    @Override // javax.net.ssl.HostnameVerifier
                    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
                        return my.com.softspace.common.http.OkHttpRestService.getHighSpeedVideoFpsRangesFor();
                    }
                });
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        this.getHighSpeedVideoFpsRangesFor = connectionPool.build();
    }

    /* renamed from: my.com.softspace.common.http.OkHttpRestService$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[my.com.softspace.common.http.HttpRequest.HttpMethod.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[my.com.softspace.common.http.HttpRequest.HttpMethod.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.common.http.HttpRequest.HttpMethod.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.common.http.HttpRequest.HttpMethod.PUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.common.http.HttpRequest.HttpMethod.DELETE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // my.com.softspace.common.http.RestService
    public my.com.softspace.common.http.HttpResponse request(int i, my.com.softspace.common.http.HttpRequest httpRequest) {
        return getHighSpeedVideoFpsRanges(i, httpRequest, new java.util.function.Function() { // from class: my.com.softspace.common.http.OkHttpRestService$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                okhttp3.Request build;
                build = ((okhttp3.Request.Builder) obj).build();
                return build;
            }
        });
    }

    private my.com.softspace.common.http.HttpResponse getHighSpeedVideoFpsRanges(int i, my.com.softspace.common.http.HttpRequest httpRequest, java.util.function.Function<okhttp3.Request.Builder, okhttp3.Request> function) {
        java.lang.String str;
        if (getHighSpeedVideoFpsRanges.matcher(httpRequest.getUrl()).matches()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.lang.String url = httpRequest.getUrl();
        if (url.length() > 0 && url.charAt(0) != '/') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(httpRequest.getUrl());
            url = sb.toString();
        }
        if (i == 2) {
            str = this.Camera2StreamConfigurationMap;
        } else {
            str = this.getHighSpeedVideoSizes;
        }
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(url);
        okhttp3.Request.Builder cacheControl = builder.url(sb2.toString()).addHeader("Content-Type", "application/json").cacheControl(okhttp3.CacheControl.FORCE_NETWORK);
        if (httpRequest.getHeader() != null && httpRequest.getHeader().size() > 0) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : httpRequest.getHeader().entrySet()) {
                cacheControl.header(entry.getKey(), entry.getValue());
            }
        }
        okhttp3.RequestBody create = (httpRequest.getBody() == null || httpRequest.getBody().length() <= 0) ? null : okhttp3.RequestBody.create(getHighResolutionOutputSizeshNQ4ISI, httpRequest.getBody());
        int i2 = my.com.softspace.common.http.OkHttpRestService.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[httpRequest.getMethod().ordinal()];
        if (i2 == 1) {
            cacheControl.get();
        } else if (i2 == 2) {
            cacheControl.post(create);
        } else if (i2 == 3) {
            cacheControl.put(create);
        } else if (i2 == 4) {
            cacheControl = create == null ? cacheControl.delete() : cacheControl.delete(create);
        }
        okhttp3.Request apply = function.apply(cacheControl);
        try {
            sspog.SimpleLogger.d("cpplog", "Hitting to service: [%s] %s", apply.method(), apply.url());
            okhttp3.Response execute = this.getHighSpeedVideoFpsRangesFor.newCall(apply).execute();
            return new my.com.softspace.common.http.HttpResponse(execute.code(), execute.body().string());
        } catch (java.lang.Exception e) {
            sspog.SimpleLogger.e("OKHTTP", e, "HTTP Request error", new java.lang.Object[0]);
            return new my.com.softspace.common.http.HttpResponse(408, null);
        }
    }
}
