package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Qc {

    /* renamed from: a, reason: collision with root package name */
    private final String f7860a;
    private final String b;

    public Qc(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f7860a = url;
        this.b = str;
    }

    public final String a() {
        return this.f7860a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.f7860a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qc)) {
            return false;
        }
        Qc qc = (Qc) obj;
        return Intrinsics.areEqual(this.f7860a, qc.f7860a) && Intrinsics.areEqual(this.b, qc.b);
    }

    public int hashCode() {
        int hashCode = this.f7860a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OpenUrl(url=" + this.f7860a + ", packageName=" + this.b + ")";
    }

    public /* synthetic */ Qc(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final Qc a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Qc(url, str);
    }

    public static /* synthetic */ Qc a(Qc qc, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qc.f7860a;
        }
        if ((i & 2) != 0) {
            str2 = qc.b;
        }
        return qc.a(str, str2);
    }
}
