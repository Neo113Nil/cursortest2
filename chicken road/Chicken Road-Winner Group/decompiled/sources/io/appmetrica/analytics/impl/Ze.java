package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Ze implements Yc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6906a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6907b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6908c;

    public Ze(Context context, String str, String str2) {
        this.f6906a = context;
        this.f6907b = str;
        this.f6908c = str2;
    }

    public final Ze a(Context context, String str, String str2) {
        return new Ze(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ze)) {
            return false;
        }
        Ze ze = (Ze) obj;
        return kotlin.jvm.internal.j.a(this.f6906a, ze.f6906a) && kotlin.jvm.internal.j.a(this.f6907b, ze.f6907b) && kotlin.jvm.internal.j.a(this.f6908c, ze.f6908c);
    }

    public final int hashCode() {
        return this.f6908c.hashCode() + ((this.f6907b.hashCode() + (this.f6906a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f6906a + ", prefName=" + this.f6907b + ", prefValueName=" + this.f6908c + ')';
    }

    public static Ze a(Ze ze, Context context, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            context = ze.f6906a;
        }
        if ((i3 & 2) != 0) {
            str = ze.f6907b;
        }
        if ((i3 & 4) != 0) {
            str2 = ze.f6908c;
        }
        ze.getClass();
        return new Ze(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Yc
    public final String a() {
        String string = this.f6906a.getSharedPreferences(this.f6907b, 0).getString(this.f6908c, "");
        return string == null ? "" : string;
    }
}
