package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684Se {

    /* renamed from: e, reason: collision with root package name */
    public static final C0684Se f11554e = new C0684Se(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f11555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11556b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11557c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11558d;

    public C0684Se(int i, int i5, int i6) {
        this.f11555a = i;
        this.f11556b = i5;
        this.f11557c = i6;
        this.f11558d = AbstractC1260lo.c(i6) ? AbstractC1260lo.n(i6) * i5 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0684Se)) {
            return false;
        }
        C0684Se c0684Se = (C0684Se) obj;
        return this.f11555a == c0684Se.f11555a && this.f11556b == c0684Se.f11556b && this.f11557c == c0684Se.f11557c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11555a), Integer.valueOf(this.f11556b), Integer.valueOf(this.f11557c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f11555a);
        sb.append(", channelCount=");
        sb.append(this.f11556b);
        sb.append(", encoding=");
        return L1.a.o(sb, this.f11557c, "]");
    }
}
