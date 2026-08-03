package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ue implements io.appmetrica.analytics.impl.Rc {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5072a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5073b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5074c;

    public Ue(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f5072a = context;
        this.f5073b = str;
        this.f5074c = str2;
    }

    public final io.appmetrica.analytics.impl.Ue a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return new io.appmetrica.analytics.impl.Ue(context, str, str2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.Ue)) {
            return false;
        }
        io.appmetrica.analytics.impl.Ue ue = (io.appmetrica.analytics.impl.Ue) obj;
        return kotlin.jvm.internal.i.a(this.f5072a, ue.f5072a) && kotlin.jvm.internal.i.a(this.f5073b, ue.f5073b) && kotlin.jvm.internal.i.a(this.f5074c, ue.f5074c);
    }

    public final int hashCode() {
        return this.f5074c.hashCode() + B1.a.e(this.f5073b, this.f5072a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f5072a + ", prefName=" + this.f5073b + ", prefValueName=" + this.f5074c + ')';
    }

    public static io.appmetrica.analytics.impl.Ue a(io.appmetrica.analytics.impl.Ue ue, android.content.Context context, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            context = ue.f5072a;
        }
        if ((i2 & 2) != 0) {
            str = ue.f5073b;
        }
        if ((i2 & 4) != 0) {
            str2 = ue.f5074c;
        }
        ue.getClass();
        return new io.appmetrica.analytics.impl.Ue(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Rc
    public final java.lang.String a() {
        java.lang.String string = this.f5072a.getSharedPreferences(this.f5073b, 0).getString(this.f5074c, "");
        return string == null ? "" : string;
    }
}
