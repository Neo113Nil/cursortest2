package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Sl implements Tl {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f6610k = Collections.unmodifiableMap(new Pl());

    /* renamed from: a, reason: collision with root package name */
    public final List f6611a;

    /* renamed from: b, reason: collision with root package name */
    public final Bi f6612b;

    /* renamed from: c, reason: collision with root package name */
    public final C0373am f6613c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f6614d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f6615e;
    public final Ql f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6616g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f6617h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f6618i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6619j;

    public Sl(Context context, Bi bi, C0366af c0366af, Handler handler) {
        this(bi, new C0373am(context, c0366af), handler);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.f6616g) {
            try {
                C0373am c0373am = this.f6613c;
                c0373am.getClass();
                if (!AbstractC0711no.a((Map) map) && !AbstractC0711no.a(map, c0373am.f7007e)) {
                    c0373am.f7007e = new HashMap(map);
                    c0373am.f7008g = true;
                    c0373am.c();
                }
                a(startupParamsCallback, list);
                if (this.f6613c.a((List) list)) {
                    a(list, new Rl(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b4 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bundle bundle) {
        HashMap hashMap;
        HashMap a3;
        IdentifiersResult a4 = C0355a4.a(bundle, "Uuid");
        IdentifiersResult a5 = C0355a4.a(bundle, "DeviceId");
        IdentifiersResult a6 = C0355a4.a(bundle, "DeviceIdHash");
        IdentifiersResult a7 = C0355a4.a(bundle, "AdUrlReport");
        IdentifiersResult a8 = C0355a4.a(bundle, "AdUrlGet");
        IdentifiersResult a9 = C0355a4.a(bundle, "Clids");
        IdentifiersResult a10 = C0355a4.a(bundle, "RequestClids");
        IdentifiersResult a11 = C0355a4.a(bundle, "GAID");
        IdentifiersResult a12 = C0355a4.a(bundle, "HOAID");
        IdentifiersResult a13 = C0355a4.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a14 = C0355a4.a(bundle, "CUSTOM_SDK_HOSTS");
        long j3 = bundle.getLong("ServerTimeOffset");
        long j4 = bundle.getLong("NextStartupTime");
        C0413ca a15 = C0355a4.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        C0373am c0373am = this.f6613c;
        synchronized (c0373am) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) c0373am.f7004b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    C0814ro c0814ro = c0373am.f7016o;
                    String str = identifiersResult.id;
                    c0814ro.getClass();
                    if (C0814ro.a(str)) {
                        c0373am.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a5);
                        c0373am.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a6);
                        c0373am.f7004b.put("appmetrica_google_adv_id", a11);
                        c0373am.f7004b.put("appmetrica_huawei_oaid", a12);
                        c0373am.f7004b.put("appmetrica_yandex_adv_id", a13);
                        c0373am.f7013l.a(a14);
                        c0373am.f7014m.a(a15);
                        if (!C0373am.a(a8)) {
                            c0373am.f7004b.put("appmetrica_get_ad_url", a8);
                        }
                        if (!C0373am.a(a7)) {
                            c0373am.f7004b.put("appmetrica_report_ad_url", a7);
                        }
                        c0373am.f = j3;
                        K3 k3 = c0373am.f7012k;
                        hashMap = c0373am.f7007e;
                        a3 = AbstractC0698nb.a(a10.id);
                        k3.getClass();
                        if (!AbstractC0711no.a((Map) hashMap) ? AbstractC0711no.a((Map) a3) : hashMap.equals(a3)) {
                            c0373am.f7004b.put("appmetrica_clids", a9);
                            c0373am.f7008g = false;
                        }
                        c0373am.f7009h = j4;
                        c0373am.c();
                    }
                }
                c0373am.c(a4);
                c0373am.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a5);
                c0373am.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a6);
                c0373am.f7004b.put("appmetrica_google_adv_id", a11);
                c0373am.f7004b.put("appmetrica_huawei_oaid", a12);
                c0373am.f7004b.put("appmetrica_yandex_adv_id", a13);
                c0373am.f7013l.a(a14);
                c0373am.f7014m.a(a15);
                if (!C0373am.a(a8)) {
                }
                if (!C0373am.a(a7)) {
                }
                c0373am.f = j3;
                K3 k32 = c0373am.f7012k;
                hashMap = c0373am.f7007e;
                a3 = AbstractC0698nb.a(a10.id);
                k32.getClass();
                if (!AbstractC0711no.a((Map) hashMap) ? AbstractC0711no.a((Map) a3) : hashMap.equals(a3)) {
                }
                c0373am.f7009h = j4;
                c0373am.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        C0587j4.l().m().a(bundle2, new SdkIdentifiers(a4.id, a5.id, a6.id));
        h();
    }

    public final H6 c() {
        return this.f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f6613c.f7004b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final C0464ea e() {
        C0413ca c0413ca;
        C0373am c0373am = this.f6613c;
        Z9 z9 = c0373am.f7015n;
        C0361aa c0361aa = c0373am.f7014m;
        synchronized (c0361aa) {
            c0413ca = c0361aa.f6961b;
        }
        z9.getClass();
        Boolean bool = c0413ca.f7100a;
        return new C0464ea();
    }

    public final long f() {
        return this.f6613c.f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f6613c.f7004b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f6617h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f6613c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f6616g) {
            try {
                if (this.f6619j) {
                    if (this.f6613c.b()) {
                    }
                }
                this.f6619j = true;
                a(this.f6611a, this.f, this.f6618i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Sl(Bi bi, C0373am c0373am, Handler handler) {
        this.f6611a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f6616g = new Object();
        this.f6617h = new WeakHashMap();
        this.f6619j = false;
        this.f6612b = bi;
        this.f6613c = c0373am;
        this.f6614d = handler;
        this.f = new Ql(this);
    }

    public final void a(Bundle bundle) {
        b(bundle, null);
    }

    public final void a(PublicLogger publicLogger) {
        this.f6615e = publicLogger;
    }

    public final void a(List list, H6 h6, Map map, boolean z3) {
        I6 i6 = new I6(this.f6614d, h6);
        Bi bi = this.f6612b;
        bi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C0465eb(i6, list, map, z3));
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = D9.f5834a;
        U3 u3 = new U3("", "", 1536, 0, anonymousInstance);
        u3.f6786m = bundle;
        M4 m4 = bi.f5772a;
        bi.a(Bi.a(u3, m4), m4, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0711no.a((Map) map)) {
            return;
        }
        synchronized (this.f6616g) {
            try {
                HashMap b3 = Jm.b(map);
                this.f6618i = b3;
                this.f6612b.a(b3);
                C0373am c0373am = this.f6613c;
                c0373am.getClass();
                if (!AbstractC0711no.a((Map) b3) && !AbstractC0711no.a(b3, c0373am.f7007e)) {
                    c0373am.f7007e = new HashMap(b3);
                    c0373am.f7008g = true;
                    c0373am.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f6616g) {
            this.f6612b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Nl nl;
        if (this.f6617h.containsKey(startupParamsCallback)) {
            List list = (List) this.f6617h.get(startupParamsCallback);
            if (this.f6613c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i3 = bundle.getInt("startup_error_key_code");
                    nl = Nl.UNKNOWN;
                    if (i3 == 1) {
                        nl = Nl.NETWORK;
                    } else if (i3 == 2) {
                        nl = Nl.PARSE;
                    }
                } else {
                    nl = null;
                }
                if (nl == null) {
                    if (!this.f6613c.a()) {
                        PublicLogger publicLogger = this.f6615e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f6618i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        nl = Nl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f6610k, nl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f6617h.remove(startupParamsCallback);
            if (this.f6617h.isEmpty()) {
                C0739p0 c0739p0 = this.f6612b.f5775d;
                synchronized (c0739p0.f) {
                    c0739p0.f8032c = false;
                    c0739p0.c();
                }
            }
        }
    }

    public final void b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f6616g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f6616g) {
            try {
                List list2 = this.f6613c.f7006d;
                if (AbstractC0711no.a((Collection) list)) {
                    if (!AbstractC0711no.a((Collection) list2)) {
                        C0373am c0373am = this.f6613c;
                        c0373am.f7006d = null;
                        c0373am.f7010i.a((List<String>) null);
                        this.f6612b.a((List) null);
                    }
                } else if (!AbstractC0711no.a(list, list2)) {
                    C0373am c0373am2 = this.f6613c;
                    c0373am2.f7006d = list;
                    c0373am2.f7010i.a(list);
                    this.f6612b.a(list);
                } else {
                    this.f6612b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        C0373am c0373am = this.f6613c;
        synchronized (c0373am) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c0373am.f7004b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, c0373am.f7005c.a(identifiersResult));
                    }
                }
                c0373am.f7013l.a(list, hashMap);
                c0373am.f7014m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void b(String str) {
        synchronized (this.f6616g) {
            this.f6612b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f6613c.f7004b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC0698nb.a(str);
        }
        return this.f6618i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f6617h.isEmpty()) {
            C0739p0 c0739p0 = this.f6612b.f5775d;
            synchronized (c0739p0.f) {
                c0739p0.f8032c = true;
                c0739p0.b();
            }
        }
        this.f6617h.put(startupParamsCallback, list);
    }

    public final AdvIdentifiersResult a() {
        C0373am c0373am = this.f6613c;
        P p3 = c0373am.f7011j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c0373am.f7004b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c0373am.f7004b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c0373am.f7004b.get("appmetrica_yandex_adv_id");
        p3.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}
