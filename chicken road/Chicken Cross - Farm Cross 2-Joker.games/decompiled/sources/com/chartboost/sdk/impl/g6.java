package com.chartboost.sdk.impl;

import androidx.autofill.HintConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4776a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;

    public g6(int i, int i2, int i3, int i4, float f, String str, int i5, String deviceType, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.f4776a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = str;
        this.g = i5;
        this.h = deviceType;
        this.i = str2;
        this.j = str3;
        this.k = z;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.h;
    }

    public final int c() {
        return this.f4776a;
    }

    public final String d() {
        return this.f;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return this.f4776a == g6Var.f4776a && this.b == g6Var.b && this.c == g6Var.c && this.d == g6Var.d && Float.compare(this.e, g6Var.e) == 0 && Intrinsics.areEqual(this.f, g6Var.f) && this.g == g6Var.g && Intrinsics.areEqual(this.h, g6Var.h) && Intrinsics.areEqual(this.i, g6Var.i) && Intrinsics.areEqual(this.j, g6Var.j) && this.k == g6Var.k;
    }

    public final int f() {
        return this.g;
    }

    public final String g() {
        return this.i;
    }

    public final float h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f4776a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31;
        String str = this.f;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.g)) * 31) + this.h.hashCode()) * 31;
        String str2 = this.i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.k);
    }

    public final String i() {
        return this.j;
    }

    public final int j() {
        return this.c;
    }

    public final boolean k() {
        return this.k;
    }

    public String toString() {
        return "DeviceBodyFields(deviceWidth=" + this.f4776a + ", deviceHeight=" + this.b + ", width=" + this.c + ", height=" + this.d + ", scale=" + this.e + ", dpi=" + this.f + ", ortbDeviceType=" + this.g + ", deviceType=" + this.h + ", packageName=" + this.i + ", versionName=" + this.j + ", isPortrait=" + this.k + ")";
    }

    public /* synthetic */ g6(int i, int i2, int i3, int i4, float f, String str, int i5, String str2, String str3, String str4, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) == 0 ? i4 : 0, (i6 & 16) != 0 ? 0.0f : f, (i6 & 32) != 0 ? "" : str, (i6 & 64) != 0 ? k6.f4838a : i5, (i6 & 128) != 0 ? HintConstants.AUTOFILL_HINT_PHONE : str2, (i6 & 256) != 0 ? null : str3, (i6 & 512) == 0 ? str4 : null, (i6 & 1024) != 0 ? true : z);
    }
}
