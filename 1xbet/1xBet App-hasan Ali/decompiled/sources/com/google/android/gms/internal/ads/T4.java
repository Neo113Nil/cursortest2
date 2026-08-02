package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class T4 extends AbstractC1803xs {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11621g = 0;

    /* renamed from: h, reason: collision with root package name */
    public Long f11622h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f11623j;

    public /* synthetic */ T4() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1803xs
    public final HashMap u() {
        switch (this.f11621g) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put(0, this.f11622h);
                hashMap.put(1, (Long) this.i);
                hashMap.put(2, (Long) this.f11623j);
                return hashMap;
            default:
                HashMap hashMap2 = new HashMap();
                hashMap2.put(0, this.f11622h);
                hashMap2.put(1, (Boolean) this.i);
                hashMap2.put(2, (Boolean) this.f11623j);
                return hashMap2;
        }
    }

    public T4(String str) {
        HashMap i = AbstractC1803xs.i(str);
        if (i != null) {
            this.f11622h = (Long) i.get(0);
            this.i = (Boolean) i.get(1);
            this.f11623j = (Boolean) i.get(2);
        }
    }
}
