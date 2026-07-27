package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ce {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public AdSession f4711a;
        public AdEvents b;
        public MediaEvents c;

        public a(AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents) {
            this.f4711a = adSession;
            this.b = adEvents;
            this.c = mediaEvents;
        }

        public final void a(AdSession adSession) {
            this.f4711a = adSession;
        }

        public final AdEvents b() {
            return this.b;
        }

        public final AdSession c() {
            return this.f4711a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f4711a, aVar.f4711a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public int hashCode() {
            AdSession adSession = this.f4711a;
            int hashCode = (adSession == null ? 0 : adSession.hashCode()) * 31;
            AdEvents adEvents = this.b;
            int hashCode2 = (hashCode + (adEvents == null ? 0 : adEvents.hashCode())) * 31;
            MediaEvents mediaEvents = this.c;
            return hashCode2 + (mediaEvents != null ? mediaEvents.hashCode() : 0);
        }

        public String toString() {
            return "OMSessionHolder(omSession=" + this.f4711a + ", omAdEvents=" + this.b + ", mediaEvents=" + this.c + ")";
        }

        public final void a(AdEvents adEvents) {
            this.b = adEvents;
        }

        public final MediaEvents a() {
            return this.c;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4712a;

        static {
            int[] iArr = new int[bc.values().length];
            try {
                iArr[bc.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bc.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bc.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bc.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bc.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f4712a = iArr;
        }
    }

    public final a a(n3 webView, bc mtype, Partner partner, String str, List verificationScriptResourcesList, boolean z, List verificationListConfig) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(verificationScriptResourcesList, "verificationScriptResourcesList");
        Intrinsics.checkNotNullParameter(verificationListConfig, "verificationListConfig");
        try {
            AdSession createAdSession = AdSession.createAdSession(a(mtype), a(partner, str, verificationScriptResourcesList, z, verificationListConfig, mtype, webView));
            createAdSession.registerAdView(webView);
            AdEvents createAdEvents = AdEvents.createAdEvents(createAdSession);
            Intrinsics.checkNotNull(createAdSession);
            return new a(createAdSession, createAdEvents, a(mtype, createAdSession));
        } catch (Exception e) {
            mb.b("OMSDK create session exception", e);
            return null;
        }
    }

    public final CreativeType b(bc bcVar) {
        int i = b.f4712a[bcVar.ordinal()];
        if (i == 1) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (i == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (i == 3) {
            return CreativeType.VIDEO;
        }
        if (i == 4) {
            return CreativeType.AUDIO;
        }
        if (i == 5) {
            return CreativeType.NATIVE_DISPLAY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Owner c(bc bcVar) {
        int i = b.f4712a[bcVar.ordinal()];
        if (i == 1) {
            return Owner.NATIVE;
        }
        if (i == 2) {
            return Owner.NONE;
        }
        if (i == 3) {
            return Owner.NATIVE;
        }
        if (i == 4) {
            return Owner.NATIVE;
        }
        if (i == 5) {
            return Owner.NATIVE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final MediaEvents a(bc bcVar, AdSession adSession) {
        if (bcVar == bc.d) {
            return null;
        }
        return MediaEvents.createMediaEvents(adSession);
    }

    public final AdSessionContext a(Partner partner, String str, List list, boolean z, List list2, bc bcVar, n3 n3Var) {
        if (bcVar == bc.d) {
            return a(partner, n3Var);
        }
        return a(partner, str, list, z, list2);
    }

    public final AdSessionContext a(Partner partner, String str, List list, boolean z, List list2) {
        try {
            return AdSessionContext.createNativeAdSessionContext(partner, str, a(list, list2, z), null, null);
        } catch (IllegalArgumentException e) {
            mb.a("buildNativeContext error", e);
            return null;
        }
    }

    public final AdSessionContext a(Partner partner, n3 n3Var) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(partner, n3Var, null, null);
        } catch (IllegalArgumentException e) {
            mb.a("buildHtmlContext error", e);
            return null;
        }
    }

    public final List a(List list, List list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.addAll(a(list2));
        }
        arrayList.addAll(list);
        return arrayList;
    }

    public final URL a(String str) {
        try {
            return new URL(str);
        } catch (Exception e) {
            mb.a("buildVerificationResources invalid url", e);
            return null;
        }
    }

    public final AdSessionConfiguration a(bc bcVar) {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(b(bcVar), ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, c(bcVar), false);
        } catch (IllegalArgumentException e) {
            mb.a("buildAdSessionVideoConfig error", e);
            return null;
        }
    }

    public final List a(List list) {
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vj vjVar = (vj) it.next();
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(vjVar.c(), a(vjVar.b()), vjVar.a()));
            }
            return arrayList;
        } catch (Exception e) {
            mb.a("buildVerificationResources error", e);
            return CollectionsKt.emptyList();
        }
    }
}
