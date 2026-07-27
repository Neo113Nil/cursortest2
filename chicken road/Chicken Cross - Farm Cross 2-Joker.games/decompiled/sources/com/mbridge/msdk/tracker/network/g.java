package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.U3;

/* compiled from: Header.java */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f10005a;
    private final String b;

    public g(String str, String str2) {
        this.f10005a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f10005a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f10005a, gVar.f10005a) && TextUtils.equals(this.b, gVar.b);
    }

    public int hashCode() {
        return (this.f10005a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f10005a + ",value=" + this.b + U3.j.e;
    }
}
