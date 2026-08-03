package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class W0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.iab.omid.library.inmobi.adsession.Partner f5022a;

    static {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        java.lang.String partnerKey = ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getViewability().getOmidConfig().getPartnerKey();
        if (partnerKey.length() == 0) {
            partnerKey = "Inmobi";
        }
        com.iab.omid.library.inmobi.adsession.Partner createPartner = com.iab.omid.library.inmobi.adsession.Partner.createPartner(partnerKey, a());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createPartner, "createPartner(...)");
        f5022a = createPartner;
    }

    public static com.iab.omid.library.inmobi.adsession.AdSessionContext a(java.lang.String omsdkScript, java.util.List adVerifications, java.util.Map macros, java.lang.String str, java.lang.String customReferenceData) {
        com.iab.omid.library.inmobi.adsession.VerificationScriptResource verificationScriptResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adVerifications, "omidTrackers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(adVerifications, 10));
        java.util.Iterator it = adVerifications.iterator();
        while (it.hasNext()) {
            com.inmobi.media.Hf hf = (com.inmobi.media.Hf) it.next();
            try {
                java.lang.String str2 = hf.f4662a;
                if (macros != null) {
                    java.lang.String str3 = str2;
                    for (java.util.Map.Entry entry : macros.entrySet()) {
                        str3 = kotlin.text.StringsKt.replace$default(str3, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, (java.lang.Object) null);
                    }
                    str2 = str3;
                }
                java.net.URL url = new java.net.URL(str2);
                java.lang.String str4 = hf.c;
                java.lang.String str5 = hf.d;
                verificationScriptResource = (str4.length() <= 0 || !com.inmobi.media.J3.a(str5)) ? com.iab.omid.library.inmobi.adsession.VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : com.iab.omid.library.inmobi.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(str4, url, str5);
            } catch (java.net.MalformedURLException unused) {
                verificationScriptResource = null;
            }
            arrayList.add(verificationScriptResource);
        }
        com.iab.omid.library.inmobi.adsession.AdSessionContext createNativeAdSessionContext = com.iab.omid.library.inmobi.adsession.AdSessionContext.createNativeAdSessionContext(f5022a, omsdkScript, kotlin.collections.CollectionsKt.filterNotNull(arrayList), str, customReferenceData);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createNativeAdSessionContext, "createNativeAdSessionContext(...)");
        return createNativeAdSessionContext;
    }

    public static java.lang.String a() {
        return "a" + kotlin.text.StringsKt.replace$default("11.2.0", ".", "", false, 4, (java.lang.Object) null);
    }
}
