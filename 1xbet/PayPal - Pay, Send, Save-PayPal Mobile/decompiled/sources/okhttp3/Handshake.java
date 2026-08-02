package okhttp3;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 *2\u00020\u0001:\u0001*B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0012J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b\u0005\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010\u0012R!\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u0013\u0010(\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0013\u0010)\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b)\u0010\u0015"}, d2 = {"Lokhttp3/Handshake;", "", "Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "-deprecated_peerCertificates", "()Ljava/util/List;", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "-deprecated_localCertificates", "-deprecated_localPrincipal", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lokhttp3/TlsVersion;", "Lokhttp3/CipherSuite;", "Ljava/util/List;", "peerCertificates$delegate", "Lkotlin/Lazy;", "peerCertificates", "peerPrincipal", "localPrincipal", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Handshake {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Handshake.Companion INSTANCE = new okhttp3.Handshake.Companion(null);
    private final okhttp3.CipherSuite cipherSuite;
    private final java.util.List<java.security.cert.Certificate> localCertificates;

    /* renamed from: peerCertificates$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy peerCertificates;
    private final okhttp3.TlsVersion tlsVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(okhttp3.TlsVersion tlsVersion, okhttp3.CipherSuite cipherSuite, java.util.List<? extends java.security.cert.Certificate> list, final kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.Certificate>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlsVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipherSuite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: okhttp3.Handshake$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.List highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = okhttp3.Handshake.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0.this);
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    public final okhttp3.TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public final okhttp3.CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public final java.util.List<java.security.cert.Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final java.util.List<java.security.cert.Certificate> peerCertificates() {
        return (java.util.List) this.peerCertificates.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0 function0) {
        try {
            return (java.util.List) function0.invoke();
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersion", imports = {}))
    /* renamed from: -deprecated_tlsVersion, reason: not valid java name and from getter */
    public final okhttp3.TlsVersion getTlsVersion() {
        return this.tlsVersion;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuite", imports = {}))
    /* renamed from: -deprecated_cipherSuite, reason: not valid java name and from getter */
    public final okhttp3.CipherSuite getCipherSuite() {
        return this.cipherSuite;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerCertificates", imports = {}))
    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m24319deprecated_peerCertificates() {
        return peerCertificates();
    }

    public final java.security.Principal peerPrincipal() {
        java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) peerCertificates());
        java.security.cert.X509Certificate x509Certificate = firstOrNull instanceof java.security.cert.X509Certificate ? (java.security.cert.X509Certificate) firstOrNull : null;
        return x509Certificate != null ? x509Certificate.getSubjectX500Principal() : null;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerPrincipal", imports = {}))
    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final java.security.Principal m24320deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localCertificates", imports = {}))
    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m24317deprecated_localCertificates() {
        return this.localCertificates;
    }

    public final java.security.Principal localPrincipal() {
        java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) this.localCertificates);
        java.security.cert.X509Certificate x509Certificate = firstOrNull instanceof java.security.cert.X509Certificate ? (java.security.cert.X509Certificate) firstOrNull : null;
        return x509Certificate != null ? x509Certificate.getSubjectX500Principal() : null;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localPrincipal", imports = {}))
    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final java.security.Principal m24318deprecated_localPrincipal() {
        return localPrincipal();
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof okhttp3.Handshake)) {
            return false;
        }
        okhttp3.Handshake handshake = (okhttp3.Handshake) other;
        return handshake.tlsVersion == this.tlsVersion && kotlin.jvm.internal.Intrinsics.areEqual(handshake.cipherSuite, this.cipherSuite) && kotlin.jvm.internal.Intrinsics.areEqual(handshake.peerCertificates(), peerCertificates()) && kotlin.jvm.internal.Intrinsics.areEqual(handshake.localCertificates, this.localCertificates);
    }

    public final int hashCode() {
        int hashCode = this.tlsVersion.hashCode();
        return ((((((hashCode + 527) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String type;
        java.lang.String type2;
        java.util.List<java.security.cert.Certificate> peerCertificates = peerCertificates();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(peerCertificates, 10));
        for (java.security.cert.Certificate certificate : peerCertificates) {
            if (certificate instanceof java.security.cert.X509Certificate) {
                type2 = ((java.security.cert.X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
            }
            arrayList.add(type2);
        }
        java.lang.String obj = arrayList.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        java.util.List<java.security.cert.Certificate> list = this.localCertificates;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.security.cert.Certificate certificate2 : list) {
            if (certificate2 instanceof java.security.cert.X509Certificate) {
                type = ((java.security.cert.X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J;\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0012"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "<init>", "()V", "Ljavax/net/ssl/SSLSession;", "Lokhttp3/Handshake;", "get", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/Handshake;", "sslSession", "-deprecated_get", "Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "peerCertificates", "localCertificates", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)Lokhttp3/Handshake;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: $r8$lambda$F-DAdzZ0-GIq_4EBIY5iXePxZEk, reason: not valid java name */
        public static /* synthetic */ java.util.List m24322$r8$lambda$FDAdzZ0GIq_4EBIY5iXePxZEk(java.util.List list) {
            return list;
        }

        public static /* synthetic */ java.util.List $r8$lambda$RewCqWe1pMEXUZjNBn5RyHT4nM0(java.util.List list) {
            return list;
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Handshake get(javax.net.ssl.SSLSession sSLSession) throws java.io.IOException {
            final java.util.List emptyList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSLSession, "");
            java.lang.String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new java.lang.IllegalStateException("cipherSuite == null".toString());
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || kotlin.jvm.internal.Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new java.io.IOException("cipherSuite == ".concat(java.lang.String.valueOf(cipherSuite)));
            }
            okhttp3.CipherSuite forJavaName = okhttp3.CipherSuite.INSTANCE.forJavaName(cipherSuite);
            java.lang.String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new java.lang.IllegalStateException("tlsVersion == null".toString());
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual("NONE", protocol)) {
                throw new java.io.IOException("tlsVersion == NONE");
            }
            okhttp3.TlsVersion forJavaName2 = okhttp3.TlsVersion.INSTANCE.forJavaName(protocol);
            try {
                emptyList = okhttp3.internal._UtilJvmKt.toImmutableList(sSLSession.getPeerCertificates());
            } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            return new okhttp3.Handshake(forJavaName2, forJavaName, okhttp3.internal._UtilJvmKt.toImmutableList(sSLSession.getLocalCertificates()), new kotlin.jvm.functions.Function0() { // from class: okhttp3.Handshake$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return okhttp3.Handshake.Companion.m24322$r8$lambda$FDAdzZ0GIq_4EBIY5iXePxZEk(emptyList);
                }
            });
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.Handshake m24323deprecated_get(javax.net.ssl.SSLSession sslSession) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSession, "");
            return get(sslSession);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Handshake get(okhttp3.TlsVersion tlsVersion, okhttp3.CipherSuite cipherSuite, java.util.List<? extends java.security.cert.Certificate> peerCertificates, java.util.List<? extends java.security.cert.Certificate> localCertificates) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlsVersion, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipherSuite, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerCertificates, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localCertificates, "");
            final java.util.List immutableList = okhttp3.internal._UtilJvmKt.toImmutableList(peerCertificates);
            return new okhttp3.Handshake(tlsVersion, cipherSuite, okhttp3.internal._UtilJvmKt.toImmutableList(localCertificates), new kotlin.jvm.functions.Function0() { // from class: okhttp3.Handshake$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return okhttp3.Handshake.Companion.$r8$lambda$RewCqWe1pMEXUZjNBn5RyHT4nM0(immutableList);
                }
            });
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Handshake get(okhttp3.TlsVersion tlsVersion, okhttp3.CipherSuite cipherSuite, java.util.List<? extends java.security.cert.Certificate> list, java.util.List<? extends java.security.cert.Certificate> list2) {
        return INSTANCE.get(tlsVersion, cipherSuite, list, list2);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Handshake get(javax.net.ssl.SSLSession sSLSession) throws java.io.IOException {
        return INSTANCE.get(sSLSession);
    }
}
