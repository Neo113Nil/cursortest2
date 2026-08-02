package com.datatheorem.android.trustkit;

/* loaded from: classes8.dex */
public class TrustKit {
    protected static com.datatheorem.android.trustkit.TrustKit trustKitInstance;
    private final com.datatheorem.android.trustkit.config.TrustKitConfiguration getHighSpeedVideoFpsRangesFor;

    protected TrustKit(android.content.Context context, com.datatheorem.android.trustkit.config.TrustKitConfiguration trustKitConfiguration) {
        java.util.Set<java.security.cert.Certificate> set;
        boolean z;
        java.lang.String str;
        java.lang.String str2 = com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA;
        this.getHighSpeedVideoFpsRangesFor = trustKitConfiguration;
        if ((context.getApplicationInfo().flags & 2) != 0) {
            set = trustKitConfiguration.getDebugCaCertificates();
            if (set != null) {
                com.datatheorem.android.trustkit.utils.TrustKitLog.i("App is debuggable - processing <debug-overrides> configuration.");
            }
            z = trustKitConfiguration.shouldOverridePins();
        } else {
            set = null;
            z = false;
        }
        java.lang.String packageName = context.getPackageName();
        try {
            str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA;
        }
        try {
            com.datatheorem.android.trustkit.pinning.TrustManagerBuilder.initializeBaselineTrustManager(set, z, new com.datatheorem.android.trustkit.reporting.BackgroundReporter(context, packageName, str != null ? str : str2, com.datatheorem.android.trustkit.utils.VendorIdentifier.getOrCreate(context)));
        } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused2) {
            throw new com.datatheorem.android.trustkit.config.ConfigurationException("Could not parse <debug-overrides> certificates");
        }
    }

    public static com.datatheorem.android.trustkit.TrustKit initializeWithNetworkSecurityConfiguration(android.content.Context context) {
        com.datatheorem.android.trustkit.TrustKit initializeWithNetworkSecurityConfiguration;
        synchronized (com.datatheorem.android.trustkit.TrustKit.class) {
            initializeWithNetworkSecurityConfiguration = initializeWithNetworkSecurityConfiguration(context, com.paypal.android.p2pmobile.R.xml._2132279309_res_0x7f18000d);
        }
        return initializeWithNetworkSecurityConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.util.Printer, com.datatheorem.android.trustkit.TrustKit$1NetSecConfigResIdRetriever] */
    public static com.datatheorem.android.trustkit.TrustKit initializeWithNetworkSecurityConfiguration(android.content.Context context, int i) {
        com.datatheorem.android.trustkit.TrustKit trustKit;
        synchronized (com.datatheorem.android.trustkit.TrustKit.class) {
            if (trustKitInstance != null) {
                throw new java.lang.IllegalStateException("TrustKit has already been initialized");
            }
            android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
            ?? r2 = new android.util.Printer() { // from class: com.datatheorem.android.trustkit.TrustKit.1NetSecConfigResIdRetriever
                private int Camera2StreamConfigurationMap = -1;
                private final java.lang.String getHighSpeedVideoFpsRanges = "networkSecurityConfigRes=0x";

                @Override // android.util.Printer
                public void println(java.lang.String str) {
                    if (this.Camera2StreamConfigurationMap == -1 && str.contains("networkSecurityConfigRes=0x")) {
                        this.Camera2StreamConfigurationMap = java.lang.Integer.parseInt(str.substring(27), 16);
                    }
                }
            };
            applicationInfo.dump(r2, "");
            int i2 = ((com.datatheorem.android.trustkit.TrustKit.C1NetSecConfigResIdRetriever) r2).Camera2StreamConfigurationMap;
            if (i2 == -1) {
                throw new com.datatheorem.android.trustkit.config.ConfigurationException("TrustKit was initialized with a network policy that was not properly configured for Android N - make sure it is in the App's Manifest.");
            }
            if (i2 != i) {
                throw new com.datatheorem.android.trustkit.config.ConfigurationException("TrustKit was initialized with a different network policy than the one configured in the App's manifest.");
            }
            try {
                trustKit = new com.datatheorem.android.trustkit.TrustKit(context, com.datatheorem.android.trustkit.config.TrustKitConfiguration.fromXmlPolicy(context, context.getResources().getXml(i)));
                trustKitInstance = trustKit;
            } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                throw new com.datatheorem.android.trustkit.config.ConfigurationException("Could not parse network security policy file");
            } catch (java.security.cert.CertificateException unused2) {
                throw new com.datatheorem.android.trustkit.config.ConfigurationException("Could not find the debug certificate in the network security police file");
            }
        }
        return trustKit;
    }

    public static com.datatheorem.android.trustkit.TrustKit getInstance() {
        com.datatheorem.android.trustkit.TrustKit trustKit = trustKitInstance;
        if (trustKit != null) {
            return trustKit;
        }
        throw new java.lang.IllegalStateException("TrustKit has not been initialized");
    }

    public com.datatheorem.android.trustkit.config.TrustKitConfiguration getConfiguration() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public javax.net.ssl.SSLSocketFactory getSSLSocketFactory(java.lang.String str) {
        try {
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            sSLContext.init(null, new javax.net.ssl.TrustManager[]{getTrustManager(str)}, null);
            return sSLContext.getSocketFactory();
        } catch (java.security.KeyManagementException | java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new java.lang.IllegalStateException("Should not happen");
        }
    }

    public javax.net.ssl.X509TrustManager getTrustManager(java.lang.String str) {
        return com.datatheorem.android.trustkit.pinning.TrustManagerBuilder.getTrustManager(str);
    }
}
