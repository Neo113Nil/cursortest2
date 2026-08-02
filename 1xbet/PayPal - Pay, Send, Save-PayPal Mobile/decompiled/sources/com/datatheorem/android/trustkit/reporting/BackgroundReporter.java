package com.datatheorem.android.trustkit.reporting;

/* loaded from: classes8.dex */
public class BackgroundReporter {
    public static final java.lang.String EXTRA_REPORT = "Report";
    public static final java.lang.String REPORT_VALIDATION_EVENT = "com.datatheorem.android.trustkit.reporting.BackgroundReporter:REPORT_VALIDATION_EVENT";
    private final android.content.Context Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public BackgroundReporter(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.security.cert.X509Certificate x509Certificate) {
        try {
            byte[] encoded = x509Certificate.getEncoded();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("-----BEGIN CERTIFICATE-----\n");
            sb.append(android.util.Base64.encodeToString(encoded, 0));
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append("-----END CERTIFICATE-----\n");
            return sb2.toString();
        } catch (java.security.cert.CertificateEncodingException unused) {
            throw new java.lang.IllegalStateException("Should never happen - certificate was previously parsed by the system");
        }
    }

    public void pinValidationFailed(java.lang.String str, java.lang.Integer num, java.util.List<java.security.cert.X509Certificate> list, java.util.List<java.security.cert.X509Certificate> list2, com.datatheorem.android.trustkit.config.DomainPinningPolicy domainPinningPolicy, com.datatheorem.android.trustkit.pinning.PinningValidationResult pinningValidationResult) {
        com.datatheorem.android.trustkit.utils.TrustKitLog.i("Generating pin failure report for ".concat(java.lang.String.valueOf(str)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.security.cert.X509Certificate> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighSpeedVideoFpsRanges(it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<java.security.cert.X509Certificate> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getHighSpeedVideoFpsRanges(it2.next()));
        }
        com.datatheorem.android.trustkit.reporting.PinningFailureReport pinningFailureReport = new com.datatheorem.android.trustkit.reporting.PinningFailureReport(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, str, num.intValue(), domainPinningPolicy.getHostname(), domainPinningPolicy.shouldIncludeSubdomains(), domainPinningPolicy.shouldEnforcePinning(), arrayList2, arrayList, new java.sql.Date(java.lang.System.currentTimeMillis()), domainPinningPolicy.getPublicKeyPins(), pinningValidationResult);
        if (!com.datatheorem.android.trustkit.reporting.ReportRateLimiter.Camera2StreamConfigurationMap(pinningFailureReport)) {
            sendReport(pinningFailureReport, domainPinningPolicy.getReportUris());
            broadcastReport(pinningFailureReport);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Report for ");
            sb.append(str);
            sb.append(" was not sent due to rate-limiting");
            com.datatheorem.android.trustkit.utils.TrustKitLog.i(sb.toString());
        }
    }

    protected void sendReport(com.datatheorem.android.trustkit.reporting.PinningFailureReport pinningFailureReport, java.util.Set<java.net.URL> set) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(pinningFailureReport);
        arrayList.addAll(set);
        new com.datatheorem.android.trustkit.reporting.BackgroundReporterTask().execute(arrayList.toArray());
    }

    protected void broadcastReport(com.datatheorem.android.trustkit.reporting.PinningFailureReport pinningFailureReport) {
        android.content.Intent intent = new android.content.Intent(REPORT_VALIDATION_EVENT);
        intent.putExtra(EXTRA_REPORT, pinningFailureReport);
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.Camera2StreamConfigurationMap).sendBroadcast(intent);
    }
}
