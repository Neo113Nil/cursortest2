package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {
    public static final String m = IAlog.a(f.class);
    public static final Object n = new Object();
    public final com.fyber.inneractive.sdk.response.nativead.i c;
    public t0 e;
    public d f;
    public final InneractiveAdRequest h;
    public final com.fyber.inneractive.sdk.config.global.r i;
    public final String j;
    public final com.fyber.inneractive.sdk.response.nativead.j k;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f5365a = new CopyOnWriteArrayList();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final e l = new e(this);

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.i = rVar;
        this.k = jVar;
        this.h = inneractiveAdRequest;
        this.c = iVar;
        this.f = dVar;
        this.j = str;
    }

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.f("%sonMainAssetLoadFailed: %s", m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        Iterator it = this.f5365a.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String description = inneractiveInfrastructureError.description();
        if (this.g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(description));
            d dVar = this.f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.b, dVar.f5358a, "send_failed_native_creatives", dVar.g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        x0 a2;
        ArrayList arrayList;
        ArrayList arrayList2;
        i iVar;
        String str;
        float parseFloat;
        String b;
        String b2;
        synchronized (n) {
            try {
                if (!this.f5365a.isEmpty()) {
                    Iterator it = this.f5365a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((c) it.next()).a()) {
                                break;
                            }
                        } else if (!this.b.get() && !this.g.get()) {
                            z = false;
                        }
                    }
                }
                z = true;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        if (z) {
            return;
        }
        IAlog.c("%s : onResourceFinished", m);
        InneractiveAdRequest inneractiveAdRequest = this.h;
        com.fyber.inneractive.sdk.response.nativead.j jVar = this.k;
        if (inneractiveAdRequest != null) {
            a2 = inneractiveAdRequest.getSelectedUnitConfig();
        } else {
            a2 = com.fyber.inneractive.sdk.config.a.a(jVar.m);
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.i;
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        com.fyber.inneractive.sdk.response.nativead.i iVar2 = this.c;
        String str2 = q.f5376a;
        ArrayList arrayList5 = new ArrayList();
        if (q.a(iVar2.d) && (b2 = q.b(iVar2.d)) != null) {
            arrayList5.add(b2);
        }
        ArrayList arrayList6 = iVar2.e;
        if (arrayList6 != null) {
            ArrayList arrayList7 = new ArrayList();
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.g gVar = (com.fyber.inneractive.sdk.response.nativead.g) it2.next();
                if (gVar != null && gVar.f5916a == 1 && gVar.b == 2) {
                    arrayList7.add(gVar.c);
                }
            }
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                String str3 = (String) it3.next();
                if (q.a(str3) && (b = q.b(str3)) != null) {
                    arrayList5.add(b);
                }
            }
        }
        arrayList4.addAll(arrayList5);
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = iVar2.c;
        if (arrayList9 != null && !arrayList9.isEmpty()) {
            arrayList8.addAll(iVar2.c);
        }
        ArrayList arrayList10 = iVar2.e;
        if (arrayList10 != null) {
            ArrayList arrayList11 = new ArrayList();
            Iterator it4 = arrayList10.iterator();
            while (it4.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.g gVar2 = (com.fyber.inneractive.sdk.response.nativead.g) it4.next();
                if (gVar2 != null && gVar2.f5916a == 1 && gVar2.b == 1) {
                    arrayList11.add(gVar2.c);
                }
            }
            arrayList8.addAll(arrayList11);
        }
        arrayList3.addAll(arrayList8);
        t0 t0Var = this.e;
        ArrayList arrayList12 = this.d;
        com.fyber.inneractive.sdk.response.nativead.h hVar = this.c.b;
        i iVar3 = (hVar == null || (TextUtils.isEmpty(hVar.f5917a) && TextUtils.isEmpty(hVar.c) && hVar.b.isEmpty())) ? null : new i(hVar.f5917a, hVar.c, hVar.b);
        if (iVar3 != null) {
            hashMap.put("ROOT", iVar3);
        }
        Iterator it5 = this.c.f5918a.iterator();
        Uri uri = null;
        String str4 = null;
        t0 t0Var2 = null;
        Float f = null;
        Float f2 = null;
        Uri uri2 = null;
        String str5 = null;
        String str6 = null;
        while (it5.hasNext()) {
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it5.next();
            Iterator it6 = it5;
            com.fyber.inneractive.sdk.response.nativead.h hVar2 = fVar.f;
            if (hVar2 == null || (TextUtils.isEmpty(hVar2.f5917a) && TextUtils.isEmpty(hVar2.c) && hVar2.b.isEmpty())) {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                iVar = null;
            } else {
                arrayList2 = arrayList4;
                arrayList = arrayList3;
                iVar = new i(hVar2.f5917a, hVar2.c, hVar2.b);
            }
            com.fyber.inneractive.sdk.response.nativead.d dVar = fVar.b;
            if (dVar != null && !TextUtils.isEmpty(dVar.f5913a)) {
                String str7 = fVar.b.f5913a;
                if (iVar != null) {
                    hashMap.put("TITLE", iVar);
                }
                str6 = str7;
            } else {
                com.fyber.inneractive.sdk.response.nativead.b bVar = fVar.e;
                if (bVar != null && !TextUtils.isEmpty(bVar.f5911a)) {
                    String str8 = fVar.e.f5911a;
                    int i = fVar.f5915a;
                    if (i == 5) {
                        str = "DESCRIPTION";
                        str5 = str8;
                    } else if (i != 6) {
                        if (i == 7) {
                            str = NativeAdContent.ViewTag.CTA;
                            str4 = str8;
                        }
                        str = null;
                    } else {
                        if (!TextUtils.isEmpty(str8)) {
                            try {
                                parseFloat = Float.parseFloat(str8);
                            } catch (NumberFormatException unused) {
                            }
                            if (parseFloat >= 0.0f) {
                                f2 = Float.valueOf(parseFloat);
                                str = NativeAdContent.ViewTag.RATING;
                            }
                            str = null;
                        }
                        parseFloat = -1.0f;
                        if (parseFloat >= 0.0f) {
                        }
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(str, iVar);
                    }
                } else {
                    Iterator it7 = arrayList12.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            g gVar3 = (g) it7.next();
                            if (gVar3 != null) {
                                int i2 = gVar3.f5366a;
                                Iterator it8 = it7;
                                if (i2 == fVar.f5915a) {
                                    if (i2 == 2) {
                                        uri2 = gVar3.b;
                                        f = com.fyber.inneractive.sdk.util.u.a(uri2);
                                        if (iVar != null) {
                                            hashMap.put(NativeAdContent.ViewTag.MEDIA_VIEW, iVar);
                                        }
                                        it5 = it6;
                                        arrayList4 = arrayList2;
                                        arrayList3 = arrayList;
                                    } else if (i2 == 4) {
                                        uri = gVar3.b;
                                        if (iVar != null) {
                                            hashMap.put(NativeAdContent.ViewTag.AD_ICON, iVar);
                                        }
                                    }
                                }
                                it7 = it8;
                            }
                        } else {
                            com.fyber.inneractive.sdk.response.nativead.e eVar = fVar.c;
                            if (eVar == null || TextUtils.isEmpty(eVar.f5914a) || t0Var == null) {
                                IAlog.c("%s : handleAsset failed: %d: ", m, Integer.valueOf(fVar.f5915a));
                            } else {
                                if (iVar != null) {
                                    hashMap.put(NativeAdContent.ViewTag.MEDIA_VIEW, iVar);
                                }
                                t0Var2 = t0Var;
                            }
                        }
                    }
                }
            }
            it5 = it6;
            arrayList4 = arrayList2;
            arrayList3 = arrayList;
        }
        w0 w0Var = new w0(a2, rVar);
        w0Var.g = str6;
        w0Var.h = str5;
        w0Var.i = str4;
        w0Var.j = null;
        w0Var.k = null;
        w0Var.l = uri;
        w0Var.m = uri2;
        w0Var.o = f2;
        w0Var.p = f;
        w0Var.s = t0Var2;
        w0Var.t.putAll(hashMap);
        w0Var.u = new j((i) hashMap.get("ROOT"));
        w0Var.w.addAll(arrayList3);
        w0Var.x.addAll(arrayList4);
        hashMap.clear();
        this.b.set(true);
        w0Var.b = this.k;
        d dVar2 = this.f;
        dVar2.c = w0Var;
        dVar2.f();
    }
}
