package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzbg {
    static final com.google.android.play.core.splitinstall.zzk zza(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.play.core.splitinstall.zzi zziVar) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE)) {
                                    java.lang.String zzb = zzb("name", xmlPullParser, zziVar);
                                    if (zzb != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY)) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY)) {
                                                                java.lang.String zzb2 = zzb("key", xmlPullParser, zziVar);
                                                                java.lang.String zzb3 = zzb("split", xmlPullParser, zziVar);
                                                                zzc(xmlPullParser, zziVar);
                                                                if (zzb2 != null && zzb3 != null) {
                                                                    zziVar.zza(zzb, zzb2, zzb3);
                                                                }
                                                            } else {
                                                                zzc(xmlPullParser, zziVar);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zzc(xmlPullParser, zziVar);
                                                }
                                            }
                                        }
                                    } else {
                                        zzc(xmlPullParser, zziVar);
                                    }
                                } else {
                                    zzc(xmlPullParser, zziVar);
                                }
                            }
                        }
                    } else {
                        zzc(xmlPullParser, zziVar);
                    }
                }
            } catch (java.io.IOException | java.lang.IllegalStateException | org.xmlpull.v1.XmlPullParserException unused) {
                return null;
            }
        }
        return zziVar.zzb();
    }

    private static final java.lang.String zzb(java.lang.String str, org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.play.core.splitinstall.zzi zziVar) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private static final void zzc(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.play.core.splitinstall.zzi zziVar) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
