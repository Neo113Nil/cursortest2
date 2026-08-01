package com.inmobi.media;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Eg {

    /* renamed from: a, reason: collision with root package name */
    public static Dg f6537a;

    public static void a(String eventKey, Function0 action) {
        String str = U1.b;
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(action, "action");
        Dg dg = f6537a;
        if (dg == null) {
            dg = a(str);
        }
        if (dg.b.contains(eventKey)) {
            return;
        }
        action.invoke();
        dg.b.add(eventKey);
        f6537a = dg;
        Db a2 = a();
        if (a2 != null) {
            String str2 = dg.f6514a;
            ConcurrentHashMap concurrentHashMap = Db.b;
            a2.a("app_version", str2, false);
        }
        Db a3 = a();
        if (a3 != null) {
            a3.b(dg.b);
        }
    }

    public static Db a() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        return Cb.a(context, "telemetry_once_per_app_version_store");
    }

    public static Dg a(String str) {
        Set linkedHashSet;
        Set a2;
        if (str == null) {
            str = "";
        }
        Dg dg = f6537a;
        if (dg == null) {
            Db a3 = a();
            String str2 = null;
            if (a3 != null) {
                Intrinsics.checkNotNullParameter("app_version", "key");
                str2 = a3.f6510a.getString("app_version", null);
            }
            Db a4 = a();
            if (a4 == null || (a2 = a4.a(SetsKt.emptySet())) == null || (linkedHashSet = CollectionsKt.toMutableSet(a2)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            if (Intrinsics.areEqual(str2, str)) {
                Dg dg2 = new Dg(str, linkedHashSet);
                f6537a = dg2;
                dg = dg2;
            } else {
                Db a5 = a();
                if (a5 != null) {
                    a5.a("app_version");
                }
                Db a6 = a();
                if (a6 != null) {
                    a6.a("reported_events");
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                dg = new Dg(str, linkedHashSet2);
                f6537a = dg;
                Db a7 = a();
                if (a7 != null) {
                    ConcurrentHashMap concurrentHashMap = Db.b;
                    a7.a("app_version", str, false);
                }
                Db a8 = a();
                if (a8 != null) {
                    a8.b(linkedHashSet2);
                }
            }
        }
        if (Intrinsics.areEqual(dg.f6514a, str)) {
            return dg;
        }
        Db a9 = a();
        if (a9 != null) {
            a9.a("app_version");
        }
        Db a10 = a();
        if (a10 != null) {
            a10.a("reported_events");
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Dg dg3 = new Dg(str, linkedHashSet3);
        f6537a = dg3;
        Db a11 = a();
        if (a11 != null) {
            ConcurrentHashMap concurrentHashMap2 = Db.b;
            a11.a("app_version", str, false);
        }
        Db a12 = a();
        if (a12 != null) {
            a12.b(linkedHashSet3);
        }
        return dg3;
    }
}
