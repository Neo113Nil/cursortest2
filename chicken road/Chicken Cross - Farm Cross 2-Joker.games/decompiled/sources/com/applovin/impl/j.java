package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4593pg;
import io.ktor.client.utils.CacheControl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class j implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4251a;
    private final Object b = new Object();
    private final LinkedHashMap c = new a();
    private final Set d = Collections.synchronizedSet(new HashSet());

    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.l lVar) {
        this.f4251a = lVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.l.p()).subscribe(this, "safedk_ad_info");
        }
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.b) {
            bundle = (Bundle) this.c.get(str);
        }
        this.f4251a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4251a.Q().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    public void b(b bVar) {
        this.d.remove(bVar);
    }

    public void c(String str) {
        this.f4251a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4251a.Q().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.b) {
            this.c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return com.mbridge.msdk.foundation.same.report.j.b;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle(CacheControl.PUBLIC);
            if (bundle == null) {
                this.f4251a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4251a.Q().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle(CacheControl.PRIVATE);
            if (bundle2 == null) {
                this.f4251a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4251a.Q().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString(FirebaseAnalytics.Param.AD_FORMAT)) == null) {
                this.f4251a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4251a.Q().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f4251a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4251a.Q().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.b) {
                this.f4251a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4251a.Q().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                }
                this.c.put(string, bundle);
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            this.f4251a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4251a.Q().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (!StringUtils.isValidString(string2) || this.d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.d);
            this.f4251a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4251a.Q().a("AdReviewManager", "Notifying listeners: " + this.d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                final b bVar = (b) it.next();
                this.f4251a.s0().a((n5) new x6(this.f4251a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.j$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.this.a(bVar, string, string2);
                    }
                }), i6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b(C4593pg.b);
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f4251a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4251a.Q().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}
