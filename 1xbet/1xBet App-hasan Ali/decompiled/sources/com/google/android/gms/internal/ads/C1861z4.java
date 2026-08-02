package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1861z4 extends AbstractC1803xs {

    /* renamed from: g, reason: collision with root package name */
    public String f16543g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16544h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f16545j;

    /* renamed from: k, reason: collision with root package name */
    public final String f16546k;

    public C1861z4(String str) {
        this.f16543g = "E";
        this.f16544h = -1L;
        this.i = "E";
        this.f16545j = "E";
        this.f16546k = "E";
        HashMap i = AbstractC1803xs.i(str);
        if (i != null) {
            this.f16543g = i.get(0) == null ? "E" : (String) i.get(0);
            this.f16544h = i.get(1) != null ? ((Long) i.get(1)).longValue() : -1L;
            this.i = i.get(2) == null ? "E" : (String) i.get(2);
            this.f16545j = i.get(3) == null ? "E" : (String) i.get(3);
            this.f16546k = i.get(4) != null ? (String) i.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1803xs
    public final HashMap u() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f16543g);
        hashMap.put(4, this.f16546k);
        hashMap.put(3, this.f16545j);
        hashMap.put(2, this.i);
        hashMap.put(1, Long.valueOf(this.f16544h));
        return hashMap;
    }
}
