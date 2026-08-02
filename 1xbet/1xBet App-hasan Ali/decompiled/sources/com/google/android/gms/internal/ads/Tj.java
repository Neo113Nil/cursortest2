package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import q3.C2308a;

/* loaded from: classes.dex */
public final class Tj implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public final Kk f11661k;

    /* renamed from: l, reason: collision with root package name */
    public final C2308a f11662l;

    /* renamed from: m, reason: collision with root package name */
    public C1104i9 f11663m;

    /* renamed from: n, reason: collision with root package name */
    public C1641u9 f11664n;

    /* renamed from: o, reason: collision with root package name */
    public String f11665o;

    /* renamed from: p, reason: collision with root package name */
    public Long f11666p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f11667q;

    public Tj(Kk kk, C2308a c2308a) {
        this.f11661k = kk;
        this.f11662l = c2308a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f11667q;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f11665o != null && this.f11666p != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f11665o);
            this.f11662l.getClass();
            hashMap.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f11666p.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f11661k.b(hashMap);
        }
        this.f11665o = null;
        this.f11666p = null;
        WeakReference weakReference2 = this.f11667q;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f11667q = null;
    }
}
