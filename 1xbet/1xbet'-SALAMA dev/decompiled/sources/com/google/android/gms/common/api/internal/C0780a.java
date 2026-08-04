package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0780a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f11161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f11162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11163d;

    public C0780a(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f11161b = iVar;
        this.f11162c = eVar;
        this.f11163d = str;
        this.f11160a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0780a)) {
            return false;
        }
        C0780a c0780a = (C0780a) obj;
        return com.google.android.gms.common.internal.D.m(this.f11161b, c0780a.f11161b) && com.google.android.gms.common.internal.D.m(this.f11162c, c0780a.f11162c) && com.google.android.gms.common.internal.D.m(this.f11163d, c0780a.f11163d);
    }

    public final int hashCode() {
        return this.f11160a;
    }
}
