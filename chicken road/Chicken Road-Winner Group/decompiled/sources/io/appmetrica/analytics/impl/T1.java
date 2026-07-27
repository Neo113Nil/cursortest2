package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class T1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0930wa f6635a = new C0930wa();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6636b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6637c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f6635a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f6636b.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C0930wa c0930wa = this.f6635a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c0930wa.f8557a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c0930wa.f8558b) {
                        c0930wa.f8557a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f6637c.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i3) {
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f6635a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f6636b.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i3, int i4) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(S1 s12) {
        this.f6637c.put(s12, new No(this, 2));
    }

    public static final boolean a(T1 t1, Intent intent) {
        t1.getClass();
        if (!"io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) t1.f6635a.f8557a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(S1 s12) {
        this.f6636b.put(s12, new No(this, 1));
    }

    public static final boolean c(T1 t1, Intent intent) {
        t1.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(S1 s12) {
        this.f6636b.put(s12, new No(this, 0));
    }

    public static final boolean b(T1 t1, Intent intent) {
        Collection collection;
        t1.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) t1.f6635a.f8557a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !kotlin.jvm.internal.j.a(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            kotlin.jvm.internal.j.b(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
