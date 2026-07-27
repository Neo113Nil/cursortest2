package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ui {

    /* renamed from: a, reason: collision with root package name */
    public final String f5034a;
    public final i4 b;
    public final boolean c;

    public ui(String url, i4 clickPreference, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        this.f5034a = url;
        this.b = clickPreference;
        this.c = z;
    }

    public final ui a(String url, i4 clickPreference, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        return new ui(url, clickPreference, z);
    }

    public final String b() {
        return this.f5034a;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui)) {
            return false;
        }
        ui uiVar = (ui) obj;
        return Intrinsics.areEqual(this.f5034a, uiVar.f5034a) && this.b == uiVar.b && this.c == uiVar.c;
    }

    public int hashCode() {
        return (((this.f5034a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "UrlArgs(url=" + this.f5034a + ", clickPreference=" + this.b + ", userGesture=" + this.c + ")";
    }

    public static /* synthetic */ ui a(ui uiVar, String str, i4 i4Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiVar.f5034a;
        }
        if ((i & 2) != 0) {
            i4Var = uiVar.b;
        }
        if ((i & 4) != 0) {
            z = uiVar.c;
        }
        return uiVar.a(str, i4Var, z);
    }

    public final i4 a() {
        return this.b;
    }
}
