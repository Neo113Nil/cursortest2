package com.chartboost.sdk.impl;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class oc implements xk {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4929a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // com.chartboost.sdk.impl.xk
    public wk a(sk manager, WebView webView) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(webView, "webView");
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(manager.a(), webView, "", ""));
        AdEvents createAdEvents = AdEvents.createAdEvents(createAdSession);
        Intrinsics.checkNotNull(createAdSession);
        Intrinsics.checkNotNull(createAdEvents);
        return new nc(manager, createAdSession, createAdEvents, webView, null, 16, null);
    }

    @Override // com.chartboost.sdk.impl.xk
    public zk a(sk manager, View videoView, Set viewabilityVendors, Integer num) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        AdSession a2 = a(manager, CreativeType.VIDEO, viewabilityVendors, Owner.NATIVE);
        AdEvents createAdEvents = AdEvents.createAdEvents(a2);
        MediaEvents createMediaEvents = MediaEvents.createMediaEvents(a2);
        Intrinsics.checkNotNull(createAdEvents);
        Intrinsics.checkNotNull(createMediaEvents);
        return new pc(manager, a2, createAdEvents, createMediaEvents, videoView, num);
    }

    public AdSession a(sk manager, CreativeType creativeType, Set viewabilityVendors, Owner mediaEventsOwner) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        Intrinsics.checkNotNullParameter(mediaEventsOwner, "mediaEventsOwner");
        List a2 = a(viewabilityVendors);
        if (!a2.isEmpty()) {
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, mediaEventsOwner, false), AdSessionContext.createNativeAdSessionContext(manager.a(), manager.b(), a2, "", ""));
            Intrinsics.checkNotNullExpressionValue(createAdSession, "createAdSession(...)");
            return createAdSession;
        }
        throw new IllegalArgumentException("verificationScriptResources is empty");
    }

    public final List a(Set set) {
        String c;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            al alVar = (al) it.next();
            String b = alVar.b();
            if (b != null && b.length() != 0 && (c = alVar.c()) != null && c.length() != 0) {
                VerificationScriptResource createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(alVar.b(), alVar.a(), alVar.c());
                Intrinsics.checkNotNullExpressionValue(createVerificationScriptResourceWithParameters, "createVerificationScript…sourceWithParameters(...)");
                arrayList.add(createVerificationScriptResourceWithParameters);
            } else {
                VerificationScriptResource createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(alVar.a());
                Intrinsics.checkNotNullExpressionValue(createVerificationScriptResourceWithoutParameters, "createVerificationScript…rceWithoutParameters(...)");
                arrayList.add(createVerificationScriptResourceWithoutParameters);
            }
        }
        return arrayList;
    }
}
