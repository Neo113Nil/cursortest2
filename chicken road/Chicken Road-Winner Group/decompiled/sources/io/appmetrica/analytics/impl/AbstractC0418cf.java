package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0418cf {

    /* renamed from: c, reason: collision with root package name */
    public static final String f7109c = "cf";

    /* renamed from: a, reason: collision with root package name */
    public final Oa f7110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7111b;

    public AbstractC0418cf(Oa oa, String str) {
        this.f7110a = oa;
        this.f7111b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0418cf> T a(String str, float f) {
        synchronized (this) {
            this.f7110a.a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0418cf> T b(String str, String str2) {
        synchronized (this) {
            this.f7110a.a(str, str2);
        }
        return this;
    }

    public final C0444df c(String str) {
        return new C0444df(str, this.f7111b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0418cf> T d(String str) {
        synchronized (this) {
            this.f7110a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.f7110a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0418cf> T a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f7110a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0418cf> T b(String str, long j3) {
        synchronized (this) {
            this.f7110a.a(str, j3);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0418cf> T b(String str, int i3) {
        synchronized (this) {
            this.f7110a.a(i3, str);
        }
        return this;
    }

    public final <T extends AbstractC0418cf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j3) {
        return this.f7110a.getLong(str, j3);
    }

    public final int a(String str, int i3) {
        return this.f7110a.getInt(str, i3);
    }

    public final String a(String str, String str2) {
        return this.f7110a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0418cf> T b(String str, boolean z3) {
        synchronized (this) {
            this.f7110a.a(str, z3);
        }
        return this;
    }

    public final boolean a(String str, boolean z3) {
        return this.f7110a.getBoolean(str, z3);
    }

    public final void b() {
        synchronized (this) {
            this.f7110a.b();
        }
    }

    public final boolean b(String str) {
        return this.f7110a.a(str);
    }
}
