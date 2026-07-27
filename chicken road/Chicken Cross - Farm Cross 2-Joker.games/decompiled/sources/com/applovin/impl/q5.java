package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.d0;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public abstract class q5 extends n5 implements z3.a, AppLovinBroadcastManager.Receiver {
    protected final com.applovin.impl.sdk.ad.b g;
    private AppLovinAdLoadListener h;
    protected final String i;
    private final com.applovin.impl.sdk.n j;
    private final Collection k;
    private volatile boolean l;
    private final Object m;
    protected ExecutorService n;
    protected ExecutorService o;
    protected List p;
    private d0 q;

    class a implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0.a f4398a;

        a(e0.a aVar) {
            this.f4398a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.p pVar = q5.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    q5 q5Var = q5.this;
                    q5Var.c.a(q5Var.b, "Finish caching video for ad #" + q5.this.g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
                }
                this.f4398a.a(uri);
                return;
            }
            com.applovin.impl.sdk.p pVar2 = q5.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                q5 q5Var2 = q5.this;
                q5Var2.c.b(q5Var2.b, "Failed to cache video");
            }
            q5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            Bundle bundle = new Bundle();
            bundle.putLong("ad_id", q5.this.g.getAdIdNumber());
            q5.this.f4351a.u().a(bundle, "video_caching_failed");
        }
    }

    class b implements d0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f4399a;

        b(c cVar) {
            this.f4399a = cVar;
        }

        @Override // com.applovin.impl.d0.d
        public void a(String str, boolean z) {
            if (z) {
                q5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            c cVar = this.f4399a;
            if (cVar != null) {
                cVar.a(str);
            }
        }
    }

    public interface c {
        void a(String str);
    }

    q5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, lVar);
        this.i = UUID.randomUUID().toString();
        this.m = new Object();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.g = bVar;
        this.h = appLovinAdLoadListener;
        this.j = lVar.I();
        this.k = g();
        if (((Boolean) lVar.a(c5.J0)).booleanValue()) {
            if (lVar.s0().e()) {
                this.n = lVar.s0().a();
                this.o = lVar.s0().d();
            } else {
                String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
                this.n = lVar.s0().a("com.applovin.sdk.caching." + mediationServeId, ((Integer) lVar.a(c5.L0)).intValue());
                this.o = lVar.s0().a("com.applovin.sdk.caching.html." + mediationServeId, ((Integer) lVar.a(c5.M0)).intValue());
            }
        }
    }

    private Collection g() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f4351a.a(c5.E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // com.applovin.impl.z3.a
    public void a(c3 c3Var) {
        if (c3Var.T().equalsIgnoreCase(this.g.getMediationServeId())) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Updating flag for timeout...");
            }
            f();
        }
        this.f4351a.b0().b(this);
    }

    Uri b(String str) {
        return b(str, this.g.V(), true);
    }

    protected String c(String str, List list, boolean z) {
        try {
            InputStream a2 = this.j.a(str, (String) null, list, z, j2.a((AppLovinAdImpl) this.g));
            if (a2 == null) {
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
            try {
                String a3 = this.j.a(a2);
                a2.close();
                return a3;
            } finally {
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Unknown failure to read input stream.", th);
            }
            this.c.a(this.b, th);
            this.f4351a.E().a(this.b, "readInputStreamAsString", th);
            return null;
        }
    }

    void e() {
        synchronized (this.m) {
            if (this.h == null) {
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Rendered new ad:" + this.g);
            }
            final AppLovinAdLoadListener appLovinAdLoadListener = this.h;
            this.h = null;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.q5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    q5.this.a(appLovinAdLoadListener);
                }
            });
        }
    }

    protected void f() {
        c4 i1;
        this.l = true;
        com.applovin.impl.sdk.ad.b bVar = this.g;
        if ((bVar instanceof com.applovin.impl.sdk.ad.a) && (i1 = ((com.applovin.impl.sdk.ad.a) bVar).i1()) != null) {
            i1.c();
        }
        List list = this.p;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f4351a.s0().e()) {
            d0 d0Var = this.q;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.n;
        if (executorService != null) {
            executorService.shutdown();
            this.n = null;
        }
        ExecutorService executorService2 = this.o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.o = null;
        }
    }

    protected void h() {
        this.f4351a.b0().b(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
        if (!this.f4351a.s0().e()) {
            ExecutorService executorService = this.n;
            if (executorService != null) {
                executorService.shutdown();
                this.n = null;
            }
            ExecutorService executorService2 = this.o;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.o = null;
            }
        }
        MaxAdFormat d = this.g.getAdZone().d();
        if (((Boolean) this.f4351a.a(c5.c1)).booleanValue() && d != null && d.isFullscreenAd()) {
            this.f4351a.i().b(this.g);
        }
        this.f4351a.f0().a(this.i);
    }

    protected boolean i() {
        return this.l;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if (map != null && map.get("ad") == this.g) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Updating flag for ad dismissal...");
            }
            f();
            AppLovinBroadcastManager.unregisterReceiver(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.g.b1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Subscribing to timeout events...");
            }
            this.f4351a.b0().a(this);
        }
        com.applovin.impl.sdk.ad.b bVar = this.g;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a) || ((com.applovin.impl.sdk.ad.a) bVar).i1() == null) {
            return;
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.sdk.ad_did_dismiss"));
    }

    Uri b(String str, List list, boolean z) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Caching video " + str + "...");
        }
        int a2 = this.f4351a.I().a(str, this.g);
        Map a3 = j2.a((AppLovinAdImpl) this.g);
        String a4 = this.j.a(a(), str, this.g.getCachePrefix(), list, z, a2, this.i, a3);
        if (!StringUtils.isValidString(a4)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", a3);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File a5 = this.j.a(a4, a());
        if (a5 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to retrieve File from cached video filename = " + a4);
            }
            a(a4, "retrieveVideoFile", a3);
            return null;
        }
        Uri fromFile = Uri.fromFile(a5);
        if (fromFile != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Finish caching video for ad #" + this.g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a4);
            }
            return fromFile;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Unable to create URI from cached video file = " + a5);
        }
        a(a4, "extractUriFromVideoFile", a3);
        return null;
    }

    protected List a(List list) {
        this.p = list;
        return this.f4351a.s0().a(list, this.n);
    }

    protected e0 a(String str, e0.a aVar) {
        return a(str, this.g.V(), true, aVar);
    }

    protected e0 a(String str, List list, boolean z, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.c.a(this.b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Caching video " + str + "...");
        }
        return new e0(str, this.g, list, z, this.i, this.f4351a, new a(aVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0043, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String c(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        List list2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((Boolean) this.f4351a.a(c5.F0)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        List S = bVar.S();
        List J = bVar.J();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int i = 0;
            int i2 = 0;
            while (i < sb.length()) {
                if (i()) {
                    return str;
                }
                i = sb.indexOf(str2, i2);
                if (i == -1) {
                    break;
                }
                int length = sb.length();
                int i3 = i;
                while (!this.k.contains(Character.valueOf(sb.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 > i && i3 != length) {
                    String substring = sb.substring(str2.length() + i, i3);
                    String str3 = str2 + substring;
                    if (StringUtils.isValidString(substring) && !J.contains(str3)) {
                        if (S.contains(str3)) {
                            Uri a2 = a(str2, substring);
                            if (a2 != null) {
                                sb.replace(i, i3, a2.toString());
                                bVar.a(a2.toString(), str3);
                            } else {
                                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                this.l = true;
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.c.b(this.b, "Failed to cache HTML Resource: " + str3);
                                }
                                a(str3, "cacheHtmlResource", j2.a((AppLovinAdImpl) bVar));
                            }
                            list2 = S;
                        } else {
                            if (com.applovin.impl.sdk.p.a()) {
                                list2 = S;
                                this.c.a(this.b, "Skip caching of uncategorized resource: " + substring);
                            } else {
                                list2 = S;
                            }
                            arrayList.add(str3);
                        }
                    } else {
                        list2 = S;
                        if (com.applovin.impl.sdk.p.a()) {
                            this.c.a(this.b, "Skip caching of optional or non-resource: " + substring);
                        }
                    }
                    i2 = i3;
                    S = list2;
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.b(this.b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
            }
        }
        bVar.a(arrayList);
        return sb.toString();
    }

    protected d0 a(String str, List list, c cVar) {
        d0 d0Var = new d0(str, this.g, list, this.o, this.i, this.f4351a, new b(cVar));
        this.q = d0Var;
        return d0Var;
    }

    Uri a(String str, List list, boolean z) {
        try {
            int a2 = this.f4351a.I().a(str, this.g);
            Map a3 = j2.a((AppLovinAdImpl) this.g);
            String a4 = this.j.a(a(), str, this.g.getCachePrefix(), list, z, a2, this.i, a3);
            if (StringUtils.isValidString(a4)) {
                File a5 = this.j.a(a4, a());
                if (a5 != null) {
                    Uri fromFile = Uri.fromFile(a5);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.b(this.b, "Unable to extract Uri from image file");
                    }
                    a(a4, "extractUriFromImageFile", a3);
                    return null;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Unable to retrieve File from cached image filename = " + a4);
                }
                a(a4, "retrieveImageFile", a3);
                return null;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to cache image: " + str);
            }
            a(str, "cacheImageResource", a3);
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Failed to cache image at url = " + str, th);
            }
            Map a6 = j2.a((AppLovinAdImpl) this.g);
            CollectionUtils.putStringIfValid("url", str, a6);
            this.f4351a.E().a(this.b, "cacheImageResource", th, a6);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0038, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((Boolean) this.f4351a.a(c5.F0)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        List S = bVar.S();
        List J = bVar.J();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int i = 0;
            int i2 = 0;
            while (i < sb.length()) {
                if (i()) {
                    return str;
                }
                i = sb.indexOf(str2, i2);
                if (i == -1) {
                    break;
                }
                int length = sb.length();
                int i3 = i;
                while (!this.k.contains(Character.valueOf(sb.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 > i && i3 != length) {
                    String substring = sb.substring(str2.length() + i, i3);
                    String str3 = str2 + substring;
                    if (StringUtils.isValidString(substring) && !J.contains(str3)) {
                        Uri a2 = a(str2, substring);
                        if (a2 != null) {
                            sb.replace(i, i3, a2.toString());
                            bVar.a(a2.toString(), str3);
                        } else {
                            if (S.contains(str3)) {
                                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                this.l = true;
                            }
                            if (com.applovin.impl.sdk.p.a()) {
                                this.c.b(this.b, "Failed to cache HTML Resource: " + str3);
                            }
                            a(str3, "cacheHtmlResource", j2.a((AppLovinAdImpl) bVar));
                        }
                    } else if (com.applovin.impl.sdk.p.a()) {
                        this.c.a(this.b, "Skip caching of optional or non-resource: " + substring);
                    }
                    i2 = i3;
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.b(this.b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
            }
        }
        return sb.toString();
    }

    String a(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (((Boolean) this.f4351a.a(c5.Z0)).booleanValue()) {
            return c(str, list, bVar);
        }
        return b(str, list, bVar);
    }

    private Uri a(String str, String str2) {
        File a2 = this.j.a(t7.a(Uri.parse(str2), this.g.getCachePrefix(), this.f4351a), com.applovin.impl.sdk.l.p());
        if (a2 == null) {
            return null;
        }
        String str3 = str + str2;
        if (this.j.a(a2, str3, (String) null, Arrays.asList(str), this.f4351a.I().a(str3, this.g), this.i, j2.a((AppLovinAdImpl) this.g))) {
            return Uri.parse("file://" + a2.getAbsolutePath());
        }
        return null;
    }

    void a(int i) {
        synchronized (this.m) {
            if (this.h == null) {
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Calling back ad load failed with error code: " + i);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.h;
            this.h = null;
            appLovinAdLoadListener.failedToReceiveAd(i);
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        appLovinAdLoadListener.adReceived(this.g);
    }

    protected void a(String str, String str2, Map map) {
        HashMap hashMap = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, hashMap);
        this.f4351a.E().a(h2.Y0, str2, hashMap);
    }
}
