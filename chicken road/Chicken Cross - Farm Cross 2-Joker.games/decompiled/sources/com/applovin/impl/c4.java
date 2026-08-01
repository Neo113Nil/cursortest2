package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.tiktok.util.UrlConst;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4154a;
    private final com.applovin.impl.sdk.p b;
    private final com.applovin.impl.sdk.ad.a c;
    private final String d;
    private String e;
    private byte[] f;
    private List g;
    private List h;
    private List i;
    private List j;
    private final Object k = new Object();
    private volatile boolean l;

    public interface a {
        void a(int i);
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f4155a;
        final String b;
        final String c;
        final boolean d;

        b(String str, String str2, String str3, boolean z) {
            this.f4155a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final c4 f4156a;
        final b b;
        final a c;
        volatile boolean d = false;

        c(c4 c4Var, b bVar, a aVar) {
            this.f4156a = c4Var;
            this.b = bVar;
            this.c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.d = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (this.d || this.f4156a.l) {
                return;
            }
            com.applovin.impl.sdk.l lVar = this.f4156a.f4154a;
            com.applovin.impl.sdk.ad.a aVar = this.f4156a.c;
            com.applovin.impl.sdk.n I = lVar.I();
            File a2 = I.a(t7.a(Uri.parse(this.b.f4155a), aVar.getCachePrefix(), lVar), com.applovin.impl.sdk.l.p());
            if (a2 == null) {
                this.f4156a.a("create_cached_file_for_segment");
                if (this.b.d) {
                    this.f4156a.l = true;
                    this.c.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES);
                    return;
                }
                return;
            }
            Map a3 = j2.a((AppLovinAdImpl) aVar);
            int a4 = I.a(this.b.f4155a, aVar);
            b bVar = this.b;
            if (I.a(a2, bVar.f4155a, bVar.b, aVar.V(), a4, this.b.c, a3)) {
                return;
            }
            com.applovin.impl.sdk.p unused = this.f4156a.b;
            if (com.applovin.impl.sdk.p.a()) {
                this.f4156a.b.b("MpdManager", "Failed to cache " + (this.b.d ? "required" : "optional") + " segment: " + this.b.f4155a + " range: " + this.b.b);
            }
            if (this.b.d) {
                this.f4156a.l = true;
                this.c.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES);
            }
        }
    }

    public c4(com.applovin.impl.sdk.ad.a aVar, String str, com.applovin.impl.sdk.l lVar) {
        this.c = aVar;
        this.d = str;
        this.f4154a = lVar;
        this.b = lVar.Q();
    }

    public String e() {
        return this.e;
    }

    public boolean f() {
        String a2 = t7.a(Uri.parse(this.d), this.c.getCachePrefix(), this.f4154a);
        this.e = "sdk://" + a2;
        com.applovin.impl.sdk.n I = this.f4154a.I();
        File a3 = I.a(a2, com.applovin.impl.sdk.l.p());
        if (a3 == null) {
            return false;
        }
        String f = I.f(a3);
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        this.f = f.replace(UrlConst.HTTPS, "sdk://").getBytes(StandardCharsets.UTF_8);
        return true;
    }

    public void b() {
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("MpdManager", "Caching required MPD segments...");
        }
        a(this.g, this.h);
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("MpdManager", "Finished caching required MPD segments");
        }
    }

    public void c(String str, a aVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("MpdManager", "Parsing MPD manifest: " + this.d);
        }
        String a2 = a(str, aVar);
        if (a2 == null) {
            return;
        }
        try {
            t8 b2 = u8.a(a2, this.f4154a).b("Period");
            if (b2 == null) {
                b("missing_period", aVar);
                return;
            }
            List<t8> a3 = b2.a("AdaptationSet");
            if (CollectionUtils.isEmpty(a3)) {
                b("missing_adaptation_set", aVar);
                return;
            }
            int m1 = this.c.m1();
            for (t8 t8Var : a3) {
                t8 b3 = t8Var.b("Representation");
                if (b3 == null) {
                    b("missing_representation", aVar);
                    return;
                }
                t8 c2 = b3.c("SegmentList");
                if (c2 == null) {
                    b("missing_segment_list", aVar);
                    return;
                }
                List a4 = a(c2);
                if (CollectionUtils.isEmpty(a4)) {
                    b("empty_segment_list", aVar);
                    return;
                }
                t8 c3 = b3.c("BaseURL");
                String d = c3 != null ? c3.d() : null;
                if (TextUtils.isEmpty(d)) {
                    b("missing_base_url", aVar);
                    return;
                }
                int size = ((a4.size() * m1) + 99) / 100;
                String str2 = (String) t8Var.a().get("contentType");
                String str3 = (String) b3.a().get("mimeType");
                boolean z = "video".equals(str2) || (str3 != null && str3.startsWith("video"));
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.a("MpdManager", "Creating " + a4.size() + ServerSentEventKt.SPACE + (z ? "video" : "audio") + " segment download operations (" + size + " required, " + (a4.size() - size) + " optional), baseUrl = " + d);
                }
                boolean z2 = z;
                a(d, a4.subList(0, size), z2, true, str, aVar);
                a(d, a4.subList(size, a4.size()), z2, false, str, aVar);
            }
        } catch (SAXException e) {
            this.f4154a.E().a("MpdManager", "parseManifest", e);
            aVar.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES);
        }
    }

    public byte[] d() {
        return this.f;
    }

    public void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.k) {
            arrayList = !CollectionUtils.isEmpty(this.i) ? new ArrayList(this.i) : null;
            arrayList2 = CollectionUtils.isEmpty(this.j) ? null : new ArrayList(this.j);
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("MpdManager", "Caching optional MPD segments...");
        }
        a(arrayList, arrayList2);
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("MpdManager", "Finished caching optional MPD segments");
        }
    }

    private void b(String str, a aVar) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", this.d);
        CollectionUtils.putStringIfValid("details", str, hashMap);
        hashMap.putAll(j2.a((AppLovinAdImpl) this.c));
        this.f4154a.g().d(h2.W, hashMap);
        aVar.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES);
    }

    public byte[] a(String str, String str2) {
        Context p = com.applovin.impl.sdk.l.p();
        com.applovin.impl.sdk.n I = this.f4154a.I();
        String a2 = t7.a(Uri.parse(str), this.c.getCachePrefix(), this.f4154a);
        File a3 = I.a(a2, p);
        if (a3 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("MpdManager", "Failed to get cached file for segment: " + str);
            }
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("MpdManager", "Serving segment: " + str + " range: " + str2);
        }
        if (I.a(a3, str, str2, this.c.V(), I.a(str, this.c), (String) null, j2.a((AppLovinAdImpl) this.c))) {
            return I.d(I.a(a2, str2), p);
        }
        return null;
    }

    private String a(String str, a aVar) {
        com.applovin.impl.sdk.n I = this.f4154a.I();
        byte[] a2 = I.a(this.d, this.c.V(), str, j2.a((AppLovinAdImpl) this.c));
        if (a2 == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("MpdManager", "Failed to download MPD: " + this.d);
            }
            aVar.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES);
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("MpdManager", "Successfully downloaded MPD");
        }
        Charset charset = StandardCharsets.UTF_8;
        String str2 = new String(a2, charset);
        if (TextUtils.isEmpty(str2)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.b("MpdManager", "Failed to read MPD data: " + this.d);
            }
            aVar.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES);
            return null;
        }
        this.f = str2.replace(UrlConst.HTTPS, "sdk://").getBytes(charset);
        String a3 = t7.a(Uri.parse(this.d), this.c.getCachePrefix(), this.f4154a);
        String str3 = "sdk://" + a3;
        com.applovin.impl.sdk.ad.a aVar2 = this.c;
        aVar2.d(StringUtils.replace(aVar2.h1(), this.d, str3));
        this.e = str3;
        if (((Boolean) this.f4154a.a(c5.c1)).booleanValue()) {
            File a4 = I.a(a3, com.applovin.impl.sdk.l.p());
            if (a4 != null) {
                I.a((InputStream) new ByteArrayInputStream(a2), a4, true);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.b.b("MpdManager", "Failed to create cached file for MPD: " + this.d);
            }
        }
        return str2;
    }

    public void c() {
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("MpdManager", "Cancelling MPD segment caching...");
        }
        this.l = true;
        synchronized (this.k) {
            a(this.i);
            a(this.j);
        }
    }

    private List a(t8 t8Var) {
        ArrayList arrayList = new ArrayList();
        t8 c2 = t8Var.c("Initialization");
        if (c2 != null) {
            String str = (String) c2.a().get("range");
            if (StringUtils.isValidString(str)) {
                arrayList.add(str);
            }
        }
        Iterator it = t8Var.a("SegmentURL").iterator();
        while (it.hasNext()) {
            String str2 = (String) ((t8) it.next()).a().get("mediaRange");
            if (StringUtils.isValidString(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    private void a(String str, List list, boolean z, boolean z2, String str2, a aVar) {
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c(this, new b(str, (String) it.next(), str2, z2), aVar));
        }
        if (z) {
            if (z2) {
                this.g = arrayList;
                return;
            }
            synchronized (this.k) {
                this.i = arrayList;
            }
            return;
        }
        if (z2) {
            this.h = arrayList;
            return;
        }
        synchronized (this.k) {
            this.j = arrayList;
        }
    }

    private void a(List list, List list2) {
        int size = list != null ? list.size() : 0;
        int size2 = list2 != null ? list2.size() : 0;
        int max = Math.max(size, size2);
        for (int i = 0; i < max && !this.l; i++) {
            if (i < size) {
                ((c) list.get(i)).b();
            }
            if (i < size2) {
                ((c) list2.get(i)).b();
            }
        }
    }

    private void a(List list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", this.d);
        hashMap.putAll(j2.a((AppLovinAdImpl) this.c));
        this.f4154a.E().a(h2.Y0, str, hashMap);
    }
}
