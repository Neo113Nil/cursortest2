package okhttp3;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 )2\u00020\u0001:\u0003*+)B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0016\"\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0017J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lokhttp3/CertificatePinner;", "", "", "Lokhttp3/CertificatePinner$Pin;", "pins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "", "check", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "findMatchingPins", "(Ljava/lang/String;)Ljava/util/List;", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "Companion", "Pin", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CertificatePinner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.CertificatePinner.Companion INSTANCE = new okhttp3.CertificatePinner.Companion(null);
    public static final okhttp3.CertificatePinner DEFAULT = new okhttp3.CertificatePinner.Builder().build();
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    private final java.util.Set<okhttp3.CertificatePinner.Pin> pins;

    public CertificatePinner(java.util.Set<okhttp3.CertificatePinner.Pin> set, okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public /* synthetic */ CertificatePinner(java.util.Set set, okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }

    public final java.util.Set<okhttp3.CertificatePinner.Pin> getPins() {
        return this.pins;
    }

    /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final void check(final java.lang.String hostname, final java.util.List<? extends java.security.cert.Certificate> peerCertificates) throws javax.net.ssl.SSLPeerUnverifiedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerCertificates, "");
        check$okhttp(hostname, new kotlin.jvm.functions.Function0() { // from class: okhttp3.CertificatePinner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return okhttp3.CertificatePinner.$r8$lambda$RSwGGZvOCYXTltt0QzhfCcMJ_AM(okhttp3.CertificatePinner.this, peerCertificates, hostname);
            }
        });
    }

    public final void check$okhttp(java.lang.String hostname, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.X509Certificate>> cleanedPeerCertificatesFn) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "");
        java.util.List<okhttp3.CertificatePinner.Pin> findMatchingPins = findMatchingPins(hostname);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        java.util.List<? extends java.security.cert.X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (java.security.cert.X509Certificate x509Certificate : invoke) {
            okio.ByteString byteString = null;
            okio.ByteString byteString2 = null;
            for (okhttp3.CertificatePinner.Pin pin : findMatchingPins) {
                java.lang.String hashAlgorithm = pin.getHashAlgorithm();
                if (kotlin.jvm.internal.Intrinsics.areEqual(hashAlgorithm, "sha256")) {
                    if (byteString == null) {
                        byteString = INSTANCE.sha256Hash(x509Certificate);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pin.getHash(), byteString)) {
                        return;
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(hashAlgorithm, "sha1")) {
                    if (byteString2 == null) {
                        byteString2 = INSTANCE.sha1Hash(x509Certificate);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pin.getHash(), byteString2)) {
                        return;
                    }
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported hashAlgorithm: ");
                    sb.append(pin.getHashAlgorithm());
                    throw new java.lang.AssertionError(sb.toString());
                }
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (java.security.cert.X509Certificate x509Certificate2 : invoke) {
            sb2.append("\n    ");
            sb2.append(INSTANCE.pin(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
        for (okhttp3.CertificatePinner.Pin pin2 : findMatchingPins) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        throw new javax.net.ssl.SSLPeerUnverifiedException(sb2.toString());
    }

    @kotlin.Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @kotlin.ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(java.lang.String hostname, java.security.cert.Certificate... peerCertificates) throws javax.net.ssl.SSLPeerUnverifiedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerCertificates, "");
        check(hostname, kotlin.collections.ArraysKt.toList(peerCertificates));
    }

    public final java.util.List<okhttp3.CertificatePinner.Pin> findMatchingPins(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        java.util.Set<okhttp3.CertificatePinner.Pin> set = this.pins;
        java.util.ArrayList emptyList = kotlin.collections.CollectionsKt.emptyList();
        for (java.lang.Object obj : set) {
            if (((okhttp3.CertificatePinner.Pin) obj).matchesHostname(hostname)) {
                if (emptyList.isEmpty()) {
                    emptyList = new java.util.ArrayList();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(emptyList, "");
                kotlin.jvm.internal.TypeIntrinsics.asMutableList(emptyList).add(obj);
            }
        }
        return emptyList;
    }

    public final okhttp3.CertificatePinner withCertificateChainCleaner$okhttp(okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificateChainCleaner, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.certificateChainCleaner, certificateChainCleaner) ? this : new okhttp3.CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof okhttp3.CertificatePinner)) {
            return false;
        }
        okhttp3.CertificatePinner certificatePinner = (okhttp3.CertificatePinner) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(certificatePinner.pins, this.pins) && kotlin.jvm.internal.Intrinsics.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final int hashCode() {
        int hashCode = this.pins.hashCode();
        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return ((hashCode + 1517) * 41) + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "matchesHostname", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPattern", "hashAlgorithm", "getHashAlgorithm", "Lokio/ByteString;", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pin {
        private final okio.ByteString hash;
        private final java.lang.String hashAlgorithm;
        private final java.lang.String pattern;

        public Pin(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            if ((!kotlin.text.StringsKt.startsWith$default(str, "*.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "*", 1, false, 4, (java.lang.Object) null) != -1) && ((!kotlin.text.StringsKt.startsWith$default(str, "**.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "*", 2, false, 4, (java.lang.Object) null) != -1) && kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "*", 0, false, 6, (java.lang.Object) null) != -1)) {
                throw new java.lang.IllegalArgumentException("Unexpected pattern: ".concat(java.lang.String.valueOf(str)).toString());
            }
            java.lang.String canonicalHost = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.pattern = canonicalHost;
                if (kotlin.text.StringsKt.startsWith$default(str2, "sha1/", false, 2, (java.lang.Object) null)) {
                    this.hashAlgorithm = "sha1";
                    okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
                    java.lang.String substring = str2.substring(5);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    okio.ByteString decodeBase64 = companion.decodeBase64(substring);
                    if (decodeBase64 == null) {
                        throw new java.lang.IllegalArgumentException("Invalid pin hash: ".concat(java.lang.String.valueOf(str2)));
                    }
                    this.hash = decodeBase64;
                    return;
                }
                if (kotlin.text.StringsKt.startsWith$default(str2, "sha256/", false, 2, (java.lang.Object) null)) {
                    this.hashAlgorithm = "sha256";
                    okio.ByteString.Companion companion2 = okio.ByteString.INSTANCE;
                    java.lang.String substring2 = str2.substring(7);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                    okio.ByteString decodeBase642 = companion2.decodeBase64(substring2);
                    if (decodeBase642 == null) {
                        throw new java.lang.IllegalArgumentException("Invalid pin hash: ".concat(java.lang.String.valueOf(str2)));
                    }
                    this.hash = decodeBase642;
                    return;
                }
                throw new java.lang.IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(java.lang.String.valueOf(str2)));
            }
            throw new java.lang.IllegalArgumentException("Invalid pattern: ".concat(java.lang.String.valueOf(str)));
        }

        public final java.lang.String getPattern() {
            return this.pattern;
        }

        public final java.lang.String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final okio.ByteString getHash() {
            return this.hash;
        }

        public final boolean matchesHostname(java.lang.String hostname) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
            if (kotlin.text.StringsKt.startsWith$default(this.pattern, "**.", false, 2, (java.lang.Object) null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                return kotlin.text.StringsKt.regionMatches$default(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, (java.lang.Object) null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (kotlin.text.StringsKt.startsWith$default(this.pattern, "*.", false, 2, (java.lang.Object) null)) {
                int length3 = this.pattern.length() - 1;
                return kotlin.text.StringsKt.regionMatches$default(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, (java.lang.Object) null) && kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) hostname, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, (hostname.length() - length3) + (-1), false, 4, (java.lang.Object) null) == -1;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(hostname, this.pattern);
        }

        public final boolean matchesCertificate(java.security.cert.X509Certificate certificate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "");
            java.lang.String str = this.hashAlgorithm;
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "sha256")) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.hash, okhttp3.CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "sha1")) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.hash, okhttp3.CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.hashAlgorithm);
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(this.hash.base64());
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof okhttp3.CertificatePinner.Pin)) {
                return false;
            }
            okhttp3.CertificatePinner.Pin pin = (okhttp3.CertificatePinner.Pin) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.pattern, pin.pattern) && kotlin.jvm.internal.Intrinsics.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && kotlin.jvm.internal.Intrinsics.areEqual(this.hash, pin.hash);
        }

        public final int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "", "pattern", "", "pins", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "Lokhttp3/CertificatePinner;", "build", "()Lokhttp3/CertificatePinner;", "", "Lokhttp3/CertificatePinner$Pin;", "Ljava/util/List;", "getPins", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        private final java.util.List<okhttp3.CertificatePinner.Pin> pins = new java.util.ArrayList();

        public final java.util.List<okhttp3.CertificatePinner.Pin> getPins() {
            return this.pins;
        }

        public final okhttp3.CertificatePinner.Builder add(java.lang.String pattern, java.lang.String... pins) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pins, "");
            for (java.lang.String str : pins) {
                this.pins.add(new okhttp3.CertificatePinner.Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final okhttp3.CertificatePinner build() {
            return new okhttp3.CertificatePinner(kotlin.collections.CollectionsKt.toSet(this.pins), null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Lokio/ByteString;", "sha1Hash", "(Ljava/security/cert/X509Certificate;)Lokio/ByteString;", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString sha1Hash(java.security.cert.X509Certificate x509Certificate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509Certificate, "");
            okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encoded, "");
            return okio.ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString sha256Hash(java.security.cert.X509Certificate x509Certificate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509Certificate, "");
            okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encoded, "");
            return okio.ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String pin(java.security.cert.Certificate certificate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "");
            if (!(certificate instanceof java.security.cert.X509Certificate)) {
                throw new java.lang.IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("sha256/");
            sb.append(sha256Hash((java.security.cert.X509Certificate) certificate).base64());
            return sb.toString();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.util.List $r8$lambda$RSwGGZvOCYXTltt0QzhfCcMJ_AM(okhttp3.CertificatePinner certificatePinner, java.util.List list, java.lang.String str) {
        java.util.List<java.security.cert.Certificate> clean;
        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner = certificatePinner.certificateChainCleaner;
        if (certificateChainCleaner != null && (clean = certificateChainCleaner.clean(list, str)) != null) {
            list = clean;
        }
        java.util.List<java.security.cert.Certificate> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (java.security.cert.Certificate certificate : list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "");
            arrayList.add((java.security.cert.X509Certificate) certificate);
        }
        return arrayList;
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString sha256Hash(java.security.cert.X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString sha1Hash(java.security.cert.X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String pin(java.security.cert.Certificate certificate) {
        return INSTANCE.pin(certificate);
    }
}
