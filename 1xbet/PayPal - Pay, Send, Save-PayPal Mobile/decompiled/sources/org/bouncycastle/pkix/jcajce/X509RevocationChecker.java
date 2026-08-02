package org.bouncycastle.pkix.jcajce;

/* loaded from: classes17.dex */
public class X509RevocationChecker extends java.security.cert.PKIXCertPathChecker {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private final java.util.List<org.bouncycastle.util.Store<java.security.cert.CRL>> Camera2StreamConfigurationMap;
    private final java.util.List<java.security.cert.CertStore> getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private java.util.Date getHighSpeedVideoSizesFor;
    private final java.util.Map<javax.security.auth.x500.X500Principal, java.lang.Long> getInputFormats;
    private final long getInputSizeshNQ4ISI;
    private final long getOutputFormats;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getOutputMinFrameDuration;
    private final java.util.Set<java.security.cert.TrustAnchor> getOutputMinFrameDurationlomOqCM;
    private javax.security.auth.x500.X500Principal getOutputSizes;
    private java.security.cert.X509Certificate getOutputSizeshNQ4ISI;
    private final boolean getOutputStallDuration;
    private final int getOutputStallDurationlomOqCM;
    private java.security.PublicKey getValidOutputFormatsForInputhNQ4ISI;
    private static java.util.logging.Logger getHighSpeedVideoSizes = java.util.logging.Logger.getLogger(org.bouncycastle.pkix.jcajce.X509RevocationChecker.class.getName());
    private static final java.util.Map<org.bouncycastle.asn1.x509.GeneralName, java.lang.ref.WeakReference<java.security.cert.X509CRL>> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
    protected static final java.lang.String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    @Override // java.security.cert.PKIXCertPathChecker
    public java.lang.Object clone() {
        return this;
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public java.util.Set<java.lang.String> getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(java.security.cert.Certificate certificate, java.util.Collection<java.lang.String> collection) throws java.security.cert.CertPathValidatorException {
        java.util.logging.Logger logger;
        java.util.logging.Level level;
        java.lang.StringBuilder sb;
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
        if (this.getOutputStallDuration && x509Certificate.getBasicConstraints() != -1) {
            this.getOutputSizes = x509Certificate.getSubjectX500Principal();
            this.getValidOutputFormatsForInputhNQ4ISI = x509Certificate.getPublicKey();
            this.getOutputSizeshNQ4ISI = x509Certificate;
            return;
        }
        if (this.getOutputSizes == null) {
            this.getOutputSizes = x509Certificate.getIssuerX500Principal();
            java.security.cert.TrustAnchor trustAnchor = null;
            for (java.security.cert.TrustAnchor trustAnchor2 : this.getOutputMinFrameDurationlomOqCM) {
                if (this.getOutputSizes.equals(trustAnchor2.getCA()) || this.getOutputSizes.equals(trustAnchor2.getTrustedCert().getSubjectX500Principal())) {
                    trustAnchor = trustAnchor2;
                }
            }
            if (trustAnchor == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("no trust anchor found for ");
                sb2.append(this.getOutputSizes);
                throw new java.security.cert.CertPathValidatorException(sb2.toString());
            }
            java.security.cert.X509Certificate trustedCert = trustAnchor.getTrustedCert();
            this.getOutputSizeshNQ4ISI = trustedCert;
            this.getValidOutputFormatsForInputhNQ4ISI = trustedCert.getPublicKey();
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.security.cert.PKIXParameters pKIXParameters = new java.security.cert.PKIXParameters(this.getOutputMinFrameDurationlomOqCM);
            pKIXParameters.setRevocationEnabled(false);
            pKIXParameters.setDate(this.getHighSpeedVideoSizesFor);
            for (int i = 0; i != this.getHighSpeedVideoFpsRanges.size(); i++) {
                if (getHighSpeedVideoSizes.isLoggable(java.util.logging.Level.INFO)) {
                    this.getHighSpeedVideoFpsRanges.get(i).getCRLs(new java.security.cert.X509CRLSelector() { // from class: org.bouncycastle.pkix.jcajce.X509RevocationChecker.1
                        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
                        public boolean match(java.security.cert.CRL crl) {
                            if (!(crl instanceof java.security.cert.X509CRL)) {
                                return false;
                            }
                            arrayList.add(((java.security.cert.X509CRL) crl).getIssuerX500Principal());
                            return false;
                        }
                    });
                }
                pKIXParameters.addCertStore(this.getHighSpeedVideoFpsRanges.get(i));
            }
            org.bouncycastle.jcajce.PKIXExtendedParameters.Builder builder = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXParameters);
            builder.setValidityModel(this.getOutputStallDurationlomOqCM);
            for (int i2 = 0; i2 != this.Camera2StreamConfigurationMap.size(); i2++) {
                if (getHighSpeedVideoSizes.isLoggable(java.util.logging.Level.INFO)) {
                    this.Camera2StreamConfigurationMap.get(i2).getMatches(new org.bouncycastle.util.Selector<java.security.cert.CRL>() { // from class: org.bouncycastle.pkix.jcajce.X509RevocationChecker.2
                        @Override // org.bouncycastle.util.Selector
                        public java.lang.Object clone() {
                            return this;
                        }

                        @Override // org.bouncycastle.util.Selector
                        public /* synthetic */ boolean match(java.security.cert.CRL crl) {
                            java.security.cert.CRL crl2 = crl;
                            if (!(crl2 instanceof java.security.cert.X509CRL)) {
                                return false;
                            }
                            arrayList.add(((java.security.cert.X509CRL) crl2).getIssuerX500Principal());
                            return false;
                        }
                    });
                }
                builder.addCRLStore(new org.bouncycastle.pkix.jcajce.X509RevocationChecker.LocalCRLStore(this.Camera2StreamConfigurationMap.get(i2)));
            }
            if (arrayList.isEmpty()) {
                getHighSpeedVideoSizes.log(java.util.logging.Level.INFO, "configured with 0 pre-loaded CRLs");
            } else if (getHighSpeedVideoSizes.isLoggable(java.util.logging.Level.FINE)) {
                for (int i3 = 0; i3 != arrayList.size(); i3++) {
                    java.util.logging.Logger logger2 = getHighSpeedVideoSizes;
                    java.util.logging.Level level2 = java.util.logging.Level.FINE;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("configuring with CRL for issuer \"");
                    sb3.append(arrayList.get(i3));
                    sb3.append("\"");
                    logger2.log(level2, sb3.toString());
                }
            } else {
                java.util.logging.Logger logger3 = getHighSpeedVideoSizes;
                java.util.logging.Level level3 = java.util.logging.Level.INFO;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("configured with ");
                sb4.append(arrayList.size());
                sb4.append(" pre-loaded CRLs");
                logger3.log(level3, sb4.toString());
            }
            org.bouncycastle.jcajce.PKIXExtendedParameters build = builder.build();
            try {
                checkCRLs(build, this.getHighSpeedVideoSizesFor, org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoSizes(build, this.getHighSpeedVideoSizesFor), x509Certificate, this.getOutputSizeshNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI, new java.util.ArrayList(), this.getOutputMinFrameDuration);
            } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e) {
                throw new java.security.cert.CertPathValidatorException(e.getMessage(), e.getCause());
            } catch (org.bouncycastle.pkix.jcajce.CRLNotFoundException e2) {
                if (x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints.getId()) == null) {
                    throw e2;
                }
                try {
                    java.security.cert.CRL Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(x509Certificate.getIssuerX500Principal(), this.getHighSpeedVideoSizesFor, org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509Certificate, org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints), this.getOutputMinFrameDuration);
                    if (Camera2StreamConfigurationMap != null) {
                        try {
                            builder.addCRLStore(new org.bouncycastle.pkix.jcajce.X509RevocationChecker.LocalCRLStore(new org.bouncycastle.util.CollectionStore(java.util.Collections.singleton(Camera2StreamConfigurationMap))));
                            org.bouncycastle.jcajce.PKIXExtendedParameters build2 = builder.build();
                            checkCRLs(build2, this.getHighSpeedVideoSizesFor, org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoSizes(build2, this.getHighSpeedVideoSizesFor), x509Certificate, this.getOutputSizeshNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI, new java.util.ArrayList(), this.getOutputMinFrameDuration);
                        } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e3) {
                            throw new java.security.cert.CertPathValidatorException(e3.getMessage(), e3.getCause());
                        }
                    } else {
                        if (!this.getHighSpeedVideoFpsRangesFor) {
                            throw e2;
                        }
                        javax.security.auth.x500.X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                        java.lang.Long l = this.getInputFormats.get(issuerX500Principal);
                        if (l != null) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis() - l.longValue();
                            long j = this.getOutputFormats;
                            if (j != -1 && j < currentTimeMillis) {
                                throw e2;
                            }
                            if (currentTimeMillis < this.getInputSizeshNQ4ISI) {
                                logger = getHighSpeedVideoSizes;
                                level = java.util.logging.Level.WARNING;
                                sb = new java.lang.StringBuilder("soft failing for issuer: \"");
                            } else {
                                logger = getHighSpeedVideoSizes;
                                level = java.util.logging.Level.SEVERE;
                                sb = new java.lang.StringBuilder("soft failing for issuer: \"");
                            }
                            sb.append(issuerX500Principal);
                            sb.append("\"");
                            logger.log(level, sb.toString());
                        } else {
                            this.getInputFormats.put(issuerX500Principal, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        }
                    }
                } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e4) {
                    throw new java.security.cert.CertPathValidatorException(e4.getMessage(), e4.getCause());
                }
            }
            this.getOutputSizeshNQ4ISI = x509Certificate;
            this.getValidOutputFormatsForInputhNQ4ISI = x509Certificate.getPublicKey();
            this.getOutputSizes = x509Certificate.getSubjectX500Principal();
        } catch (java.security.GeneralSecurityException e5) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("error setting up baseParams: ");
            sb5.append(e5.getMessage());
            throw new java.lang.RuntimeException(sb5.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void checkCRLs(org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date, java.util.Date date2, java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2, java.security.PublicKey publicKey, java.util.List list, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) throws org.bouncycastle.pkix.jcajce.AnnotatedException, java.security.cert.CertPathValidatorException {
        boolean z;
        org.bouncycastle.pkix.jcajce.AnnotatedException e;
        int i;
        int i2;
        org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters2;
        org.bouncycastle.asn1.x509.DistributionPoint[] distributionPointArr;
        int i3;
        try {
            org.bouncycastle.asn1.x509.CRLDistPoint cRLDistPoint = org.bouncycastle.asn1.x509.CRLDistPoint.getInstance(org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoFpsRanges(x509Certificate, org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints));
            org.bouncycastle.pkix.jcajce.CertStatus certStatus = new org.bouncycastle.pkix.jcajce.CertStatus();
            org.bouncycastle.pkix.jcajce.ReasonsMask reasonsMask = new org.bouncycastle.pkix.jcajce.ReasonsMask();
            int i4 = 11;
            boolean z2 = false;
            if (cRLDistPoint != null) {
                try {
                    org.bouncycastle.asn1.x509.DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
                    if (distributionPoints != null) {
                        org.bouncycastle.jcajce.PKIXExtendedParameters.Builder builder = new org.bouncycastle.jcajce.PKIXExtendedParameters.Builder(pKIXExtendedParameters);
                        try {
                            java.util.Iterator<org.bouncycastle.jcajce.PKIXCRLStore> it = getHighSpeedVideoFpsRangesFor(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap()).iterator();
                            while (it.hasNext()) {
                                builder.addCRLStore(it.next());
                            }
                            org.bouncycastle.jcajce.PKIXExtendedParameters build = builder.build();
                            java.util.Date highSpeedVideoSizes = org.bouncycastle.pkix.jcajce.RevocationUtilities.getHighSpeedVideoSizes(build, date);
                            int i5 = 0;
                            z = false;
                            e = null;
                            while (i5 < distributionPoints.length && certStatus.getHighSpeedVideoFpsRangesFor == i4 && reasonsMask.getHighSpeedVideoSizes != org.bouncycastle.pkix.jcajce.ReasonsMask.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes) {
                                try {
                                    i2 = i5;
                                    pKIXExtendedParameters2 = build;
                                    distributionPointArr = distributionPoints;
                                    i3 = i4;
                                    try {
                                        org.bouncycastle.pkix.jcajce.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(distributionPoints[i5], build, date, highSpeedVideoSizes, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper);
                                        z = true;
                                    } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e2) {
                                        e = e2;
                                    }
                                } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e3) {
                                    e = e3;
                                    i2 = i5;
                                    pKIXExtendedParameters2 = build;
                                    distributionPointArr = distributionPoints;
                                    i3 = i4;
                                }
                                i5 = i2 + 1;
                                i4 = i3;
                                build = pKIXExtendedParameters2;
                                distributionPoints = distributionPointArr;
                                z2 = false;
                            }
                            i = i4;
                            if (certStatus.getHighSpeedVideoFpsRangesFor == i && reasonsMask.getHighSpeedVideoSizes != org.bouncycastle.pkix.jcajce.ReasonsMask.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes) {
                                try {
                                    org.bouncycastle.pkix.jcajce.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(new org.bouncycastle.asn1.x509.DistributionPoint(new org.bouncycastle.asn1.x509.DistributionPointName(0, new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(4, org.bouncycastle.asn1.x500.X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded())))), null, null), (org.bouncycastle.jcajce.PKIXExtendedParameters) pKIXExtendedParameters.clone(), date, date2, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper);
                                    z = true;
                                } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e4) {
                                    e = e4;
                                }
                            }
                            if (z) {
                                if (!(e instanceof org.bouncycastle.pkix.jcajce.AnnotatedException)) {
                                    throw new org.bouncycastle.pkix.jcajce.CRLNotFoundException("no valid CRL found");
                                }
                                throw new org.bouncycastle.pkix.jcajce.CRLNotFoundException("no valid CRL found", e);
                            }
                            if (certStatus.getHighSpeedVideoFpsRangesFor == i) {
                                if (reasonsMask.getHighSpeedVideoSizes != org.bouncycastle.pkix.jcajce.ReasonsMask.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes && certStatus.getHighSpeedVideoFpsRangesFor == i) {
                                    certStatus.getHighSpeedVideoFpsRangesFor = 12;
                                }
                                if (certStatus.getHighSpeedVideoFpsRangesFor == 12) {
                                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("certificate status could not be determined");
                                }
                                return;
                            }
                            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
                            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("certificate [issuer=\"");
                            sb.append(x509Certificate.getIssuerX500Principal());
                            sb.append("\",serialNumber=");
                            sb.append(x509Certificate.getSerialNumber());
                            sb.append(",subject=\"");
                            sb.append(x509Certificate.getSubjectX500Principal());
                            sb.append("\"] revoked after ");
                            sb.append(simpleDateFormat.format(certStatus.getHighSpeedVideoSizes));
                            java.lang.String obj = sb.toString();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(obj);
                            sb2.append(", reason: ");
                            sb2.append(crlReasons[certStatus.getHighSpeedVideoFpsRangesFor]);
                            throw new org.bouncycastle.pkix.jcajce.AnnotatedException(sb2.toString());
                        } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e5) {
                            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("no additional CRL locations could be decoded from CRL distribution point extension", e5);
                        }
                    }
                } catch (java.lang.Exception e6) {
                    throw new org.bouncycastle.pkix.jcajce.AnnotatedException("cannot read distribution points", e6);
                }
            }
            i = 11;
            e = null;
            z = false;
            if (certStatus.getHighSpeedVideoFpsRangesFor == i) {
                org.bouncycastle.pkix.jcajce.RFC3280CertPathUtilities.getHighSpeedVideoFpsRangesFor(new org.bouncycastle.asn1.x509.DistributionPoint(new org.bouncycastle.asn1.x509.DistributionPointName(0, new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(4, org.bouncycastle.asn1.x500.X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded())))), null, null), (org.bouncycastle.jcajce.PKIXExtendedParameters) pKIXExtendedParameters.clone(), date, date2, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper);
                z = true;
            }
            if (z) {
            }
        } catch (java.lang.Exception e7) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("cannot read CRL distribution point extension", e7);
        }
    }

    public static class Builder {
        private long Camera2StreamConfigurationMap;
        private long getHighResolutionOutputSizeshNQ4ISI;
        private java.util.List<org.bouncycastle.util.Store<java.security.cert.CRL>> getHighSpeedVideoFpsRanges;
        private java.util.List<java.security.cert.CertStore> getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;
        private java.util.Set<java.security.cert.TrustAnchor> getInputFormats;
        private int getInputSizeshNQ4ISI;
        private java.security.Provider getOutputFormats;
        private java.lang.String getOutputMinFrameDuration;

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder usingProvider(java.security.Provider provider) {
            this.getOutputFormats = provider;
            return this;
        }

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder usingProvider(java.lang.String str) {
            this.getOutputMinFrameDuration = str;
            return this;
        }

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder setValidityModel(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder setSoftFailHardLimit(boolean z, long j) {
            this.getHighSpeedVideoSizes = z;
            this.getHighResolutionOutputSizeshNQ4ISI = (3 * j) / 4;
            this.Camera2StreamConfigurationMap = j;
            return this;
        }

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder setSoftFail(boolean z, long j) {
            this.getHighSpeedVideoSizes = z;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.Camera2StreamConfigurationMap = -1L;
            return this;
        }

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder setCheckEndEntityOnly(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
            return this;
        }

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker build() {
            return new org.bouncycastle.pkix.jcajce.X509RevocationChecker(this, (byte) 0);
        }

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder addCrls(org.bouncycastle.util.Store<java.security.cert.CRL> store) {
            this.getHighSpeedVideoFpsRanges.add(store);
            return this;
        }

        public org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder addCrls(java.security.cert.CertStore certStore) {
            this.getHighSpeedVideoFpsRangesFor.add(certStore);
            return this;
        }

        public Builder(java.util.Set<java.security.cert.TrustAnchor> set) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            this.getInputSizeshNQ4ISI = 0;
            this.getInputFormats = new java.util.HashSet(set);
        }

        public Builder(java.security.cert.TrustAnchor trustAnchor) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            this.getInputSizeshNQ4ISI = 0;
            this.getInputFormats = java.util.Collections.singleton(trustAnchor);
        }

        public Builder(java.security.KeyStore keyStore) throws java.security.KeyStoreException {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            this.getInputSizeshNQ4ISI = 0;
            this.getInputFormats = new java.util.HashSet();
            java.util.Enumeration<java.lang.String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                java.lang.String nextElement = aliases.nextElement();
                if (keyStore.isCertificateEntry(nextElement)) {
                    this.getInputFormats.add(new java.security.cert.TrustAnchor((java.security.cert.X509Certificate) keyStore.getCertificate(nextElement), null));
                }
            }
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws java.security.cert.CertPathValidatorException {
        if (z) {
            throw new java.lang.IllegalArgumentException("forward processing not supported");
        }
        this.getHighSpeedVideoSizesFor = new java.util.Date();
        this.getOutputSizes = null;
    }

    private static java.util.List<org.bouncycastle.jcajce.PKIXCRLStore> getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.CRLDistPoint cRLDistPoint, java.util.Map<org.bouncycastle.asn1.x509.GeneralName, org.bouncycastle.jcajce.PKIXCRLStore> map) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        if (cRLDistPoint == null) {
            return java.util.Collections.emptyList();
        }
        try {
            org.bouncycastle.asn1.x509.DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (org.bouncycastle.asn1.x509.DistributionPoint distributionPoint : distributionPoints) {
                org.bouncycastle.asn1.x509.DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                    for (org.bouncycastle.asn1.x509.GeneralName generalName : org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                        org.bouncycastle.jcajce.PKIXCRLStore pKIXCRLStore = map.get(generalName);
                        if (pKIXCRLStore != null) {
                            arrayList.add(pKIXCRLStore);
                        }
                    }
                }
            }
            return arrayList;
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("could not read distribution points could not be read", e);
        }
    }

    class LocalCRLStore implements org.bouncycastle.jcajce.PKIXCRLStore<java.security.cert.CRL>, org.bouncycastle.util.Iterable<java.security.cert.CRL> {
        private java.util.Collection<java.security.cert.CRL> getHighSpeedVideoSizes;

        @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
        public java.util.Iterator<java.security.cert.CRL> iterator() {
            return getMatches(null).iterator();
        }

        @Override // org.bouncycastle.jcajce.PKIXCRLStore, org.bouncycastle.util.Store
        public java.util.Collection<java.security.cert.CRL> getMatches(org.bouncycastle.util.Selector<java.security.cert.CRL> selector) {
            if (selector == null) {
                return new java.util.ArrayList(this.getHighSpeedVideoSizes);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.security.cert.CRL crl : this.getHighSpeedVideoSizes) {
                if (selector.match(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        public LocalCRLStore(org.bouncycastle.util.Store<java.security.cert.CRL> store) {
            this.getHighSpeedVideoSizes = new java.util.ArrayList(store.getMatches(null));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    private static java.security.cert.CRL Camera2StreamConfigurationMap(javax.security.auth.x500.X500Principal x500Principal, java.util.Date date, org.bouncycastle.asn1.ASN1Primitive aSN1Primitive, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        java.net.URL url;
        java.security.cert.X509CRL x509crl;
        java.util.logging.Logger logger;
        java.util.logging.Level level;
        java.lang.StringBuilder sb;
        org.bouncycastle.asn1.x509.DistributionPoint[] distributionPoints = org.bouncycastle.asn1.x509.CRLDistPoint.getInstance(aSN1Primitive).getDistributionPoints();
        for (int i = 0; i != distributionPoints.length; i++) {
            org.bouncycastle.asn1.x509.DistributionPointName distributionPoint = distributionPoints[i].getDistributionPoint();
            if (distributionPoint != null && distributionPoint.getType() == 0) {
                org.bouncycastle.asn1.x509.GeneralName[] names = org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint.getName()).getNames();
                for (int i2 = 0; i2 != names.length; i2++) {
                    org.bouncycastle.asn1.x509.GeneralName generalName = names[i2];
                    if (generalName.getTagNo() == 6) {
                        java.util.Map<org.bouncycastle.asn1.x509.GeneralName, java.lang.ref.WeakReference<java.security.cert.X509CRL>> map = getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.ref.WeakReference<java.security.cert.X509CRL> weakReference = map.get(generalName);
                        if (weakReference != null) {
                            java.security.cert.X509CRL x509crl2 = weakReference.get();
                            if (x509crl2 != null && !date.before(x509crl2.getThisUpdate()) && !date.after(x509crl2.getNextUpdate())) {
                                return x509crl2;
                            }
                            map.remove(generalName);
                        }
                        try {
                            url = new java.net.URL(generalName.getName().toString());
                            try {
                                java.security.cert.CertificateFactory createCertificateFactory = jcaJceHelper.createCertificateFactory("X.509");
                                java.io.InputStream openStream = url.openStream();
                                x509crl = (java.security.cert.X509CRL) createCertificateFactory.generateCRL(new java.io.BufferedInputStream(openStream));
                                openStream.close();
                                logger = getHighSpeedVideoSizes;
                                level = java.util.logging.Level.INFO;
                                sb = new java.lang.StringBuilder();
                                sb.append("downloaded CRL from CrlDP ");
                                sb.append(url);
                                sb.append(" for issuer \"");
                            } catch (java.lang.Exception e) {
                                e = e;
                            }
                            try {
                                sb.append(x500Principal);
                                sb.append("\"");
                                logger.log(level, sb.toString());
                                map.put(generalName, new java.lang.ref.WeakReference<>(x509crl));
                                return x509crl;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                if (getHighSpeedVideoSizes.isLoggable(java.util.logging.Level.FINE)) {
                                    java.util.logging.Logger logger2 = getHighSpeedVideoSizes;
                                    java.util.logging.Level level2 = java.util.logging.Level.FINE;
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CrlDP ");
                                    sb2.append(url);
                                    sb2.append(" ignored: ");
                                    sb2.append(e.getMessage());
                                    logger2.log(level2, sb2.toString(), (java.lang.Throwable) e);
                                } else {
                                    java.util.logging.Logger logger3 = getHighSpeedVideoSizes;
                                    java.util.logging.Level level3 = java.util.logging.Level.INFO;
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("CrlDP ");
                                    sb3.append(url);
                                    sb3.append(" ignored: ");
                                    sb3.append(e.getMessage());
                                    logger3.log(level3, sb3.toString());
                                }
                            }
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            url = null;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* synthetic */ X509RevocationChecker(org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder builder, byte b) {
        this(builder);
    }

    private X509RevocationChecker(org.bouncycastle.pkix.jcajce.X509RevocationChecker.Builder builder) {
        this.getInputFormats = new java.util.HashMap();
        this.Camera2StreamConfigurationMap = new java.util.ArrayList(builder.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(builder.getHighSpeedVideoFpsRangesFor);
        this.getOutputStallDuration = builder.getHighSpeedVideoSizesFor;
        this.getOutputStallDurationlomOqCM = builder.getInputSizeshNQ4ISI;
        this.getOutputMinFrameDurationlomOqCM = builder.getInputFormats;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoSizes;
        this.getInputSizeshNQ4ISI = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = builder.Camera2StreamConfigurationMap;
        if (builder.getOutputFormats != null) {
            this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(builder.getOutputFormats);
        } else if (builder.getOutputMinFrameDuration != null) {
            this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(builder.getOutputMinFrameDuration);
        } else {
            this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
        }
    }
}
