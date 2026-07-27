package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Yf {

    /* renamed from: a, reason: collision with root package name */
    private String f8032a;

    /* JADX WARN: Multi-variable type inference failed */
    public Yf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f8032a;
    }

    public final String b() {
        return this.f8032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Yf) && Intrinsics.areEqual(this.f8032a, ((Yf) obj).f8032a);
    }

    public int hashCode() {
        String str = this.f8032a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f8032a + ")";
    }

    public Yf(String str) {
        this.f8032a = str;
    }

    public final Yf a(String str) {
        return new Yf(str);
    }

    public final void b(String str) {
        this.f8032a = str;
    }

    public /* synthetic */ Yf(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Yf a(Yf yf, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yf.f8032a;
        }
        return yf.a(str);
    }
}
