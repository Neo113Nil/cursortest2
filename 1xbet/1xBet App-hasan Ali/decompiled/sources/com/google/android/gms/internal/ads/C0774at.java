package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.at, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774at implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    public long f12727m;

    /* renamed from: l, reason: collision with root package name */
    public long f12726l = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public final C1617tm f12725k = new C1617tm();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0774at c0774at = (C0774at) obj;
        int compare = Long.compare(this.f12726l, c0774at.f12726l);
        return compare != 0 ? compare : Long.compare(this.f12727m, c0774at.f12727m);
    }
}
