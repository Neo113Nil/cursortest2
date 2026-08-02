package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.gr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040gr implements Ph {

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f13663k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final Context f13664l;

    /* renamed from: m, reason: collision with root package name */
    public final C0584Ed f13665m;

    public C1040gr(Context context, C0584Ed c0584Ed) {
        this.f13664l = context;
        this.f13665m = c0584Ed;
    }

    public final Bundle a() {
        C0584Ed c0584Ed = this.f13665m;
        Context context = this.f13664l;
        c0584Ed.getClass();
        HashSet hashSet = new HashSet();
        synchronized (c0584Ed.f8513a) {
            hashSet.addAll(c0584Ed.f8517e);
            c0584Ed.f8517e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", c0584Ed.f8516d.b(context, c0584Ed.f8515c.j()));
        Bundle bundle2 = new Bundle();
        Iterator it = c0584Ed.f.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1878zd) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        b(hashSet);
        return bundle;
    }

    public final synchronized void b(HashSet hashSet) {
        this.f13663k.clear();
        this.f13663k.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final synchronized void l0(C0387u0 c0387u0) {
        if (c0387u0.f5058k != 3) {
            this.f13665m.g(this.f13663k);
        }
    }
}
