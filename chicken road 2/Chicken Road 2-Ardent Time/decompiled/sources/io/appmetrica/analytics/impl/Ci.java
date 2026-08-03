package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Ci {

    /* renamed from: a, reason: collision with root package name */
    protected final android.content.Context f4176a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4177b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f4178c;

    public Ci(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f4176a = context;
        this.f4177b = str;
        this.f4178c = str2;
    }

    public final java.lang.Object a() {
        int identifier = this.f4176a.getResources().getIdentifier(this.f4177b, this.f4178c, this.f4176a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public abstract java.lang.Object a(int i2);
}
