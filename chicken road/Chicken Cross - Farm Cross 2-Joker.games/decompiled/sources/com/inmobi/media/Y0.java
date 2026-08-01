package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Partner f6961a;

    static {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        String partnerKey = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getViewability().getOmidConfig().getPartnerKey();
        if (partnerKey.length() == 0) {
            partnerKey = "Inmobi";
        }
        Partner createPartner = Partner.createPartner(partnerKey, a());
        Intrinsics.checkNotNullExpressionValue(createPartner, "createPartner(...)");
        f6961a = createPartner;
    }

    public static AdSessionContext a(String omsdkScript, List adVerifications, Map macros, String str, String customReferenceData) {
        VerificationScriptResource verificationScriptResource;
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(adVerifications, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(macros, "macros");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(adVerifications, 10));
        Iterator it = adVerifications.iterator();
        while (it.hasNext()) {
            Bg bg = (Bg) it.next();
            try {
                String str2 = bg.f7460a;
                if (macros != null) {
                    String str3 = str2;
                    for (Map.Entry entry : macros.entrySet()) {
                        str3 = StringsKt.replace$default(str3, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                    }
                    str2 = str3;
                }
                URL url = new URL(str2);
                String str4 = bg.c;
                String str5 = bg.d;
                verificationScriptResource = (str4.length() <= 0 || !AbstractC3727g4.a(str5)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str4, url, str5);
            } catch (MalformedURLException unused) {
                verificationScriptResource = null;
            }
            arrayList.add(verificationScriptResource);
        }
        AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(f6961a, omsdkScript, CollectionsKt.filterNotNull(arrayList), str, customReferenceData);
        Intrinsics.checkNotNullExpressionValue(createNativeAdSessionContext, "createNativeAdSessionContext(...)");
        return createNativeAdSessionContext;
    }

    public static String a() {
        return "a" + StringsKt.replace$default("11.4.0", ".", "", false, 4, (Object) null);
    }
}
