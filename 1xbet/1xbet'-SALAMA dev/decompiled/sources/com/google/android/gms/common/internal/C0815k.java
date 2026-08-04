package com.google.android.gms.common.internal;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0815k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C0815k f11315d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11318c;

    public /* synthetic */ C0815k() {
        this.f11316a = 2;
    }

    public static C0815k a() {
        if (f11315d == null) {
            f11315d = new C0815k();
        }
        return f11315d;
    }

    public String b() {
        if (TextUtils.isEmpty(this.f11317b) && TextUtils.isEmpty(this.f11317b)) {
            this.f11317b = this.f11318c;
        }
        return this.f11317b;
    }

    public String toString() {
        switch (this.f11316a) {
            case 1:
                return this.f11317b + ", " + this.f11318c;
            default:
                return super.toString();
        }
    }

    public C0815k(String str) {
        this.f11316a = 0;
        this.f11317b = "LibraryVersion";
        this.f11318c = (str == null || str.length() <= 0) ? null : str;
    }

    public C0815k(String str, String str2) {
        this.f11316a = 1;
        this.f11317b = str;
        this.f11318c = str2;
    }
}
