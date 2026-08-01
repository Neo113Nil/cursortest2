package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4515la {
    private static C4515la c;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f8312a = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    C4515la() {
    }

    public static synchronized C4515la b() {
        C4515la c4515la;
        synchronized (C4515la.class) {
            if (c == null) {
                c = new C4515la();
            }
            c4515la = c;
        }
        return c4515la;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f8312a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.f8312a.clear();
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f8312a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f8312a.remove(impressionDataListener);
        }
    }
}
