package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010g5 extends AbstractC1803xs {

    /* renamed from: g, reason: collision with root package name */
    public final Long f13553g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f13554h;
    public final Long i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f13555j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f13556k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f13557l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f13558m;

    /* renamed from: n, reason: collision with root package name */
    public final Long f13559n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f13560o;

    /* renamed from: p, reason: collision with root package name */
    public final Long f13561p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f13562q;

    public C1010g5(String str) {
        HashMap i = AbstractC1803xs.i(str);
        if (i != null) {
            this.f13553g = (Long) i.get(0);
            this.f13554h = (Long) i.get(1);
            this.i = (Long) i.get(2);
            this.f13555j = (Long) i.get(3);
            this.f13556k = (Long) i.get(4);
            this.f13557l = (Long) i.get(5);
            this.f13558m = (Long) i.get(6);
            this.f13559n = (Long) i.get(7);
            this.f13560o = (Long) i.get(8);
            this.f13561p = (Long) i.get(9);
            this.f13562q = (Long) i.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1803xs
    public final HashMap u() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f13553g);
        hashMap.put(1, this.f13554h);
        hashMap.put(2, this.i);
        hashMap.put(3, this.f13555j);
        hashMap.put(4, this.f13556k);
        hashMap.put(5, this.f13557l);
        hashMap.put(6, this.f13558m);
        hashMap.put(7, this.f13559n);
        hashMap.put(8, this.f13560o);
        hashMap.put(9, this.f13561p);
        hashMap.put(10, this.f13562q);
        return hashMap;
    }
}
