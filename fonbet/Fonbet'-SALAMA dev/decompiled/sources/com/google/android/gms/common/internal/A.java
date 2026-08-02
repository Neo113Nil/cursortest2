package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f11223a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0854f f11225c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11226d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f11227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0854f f11228f;

    public A(AbstractC0854f abstractC0854f, int i7, Bundle bundle) {
        this.f11228f = abstractC0854f;
        Boolean bool = Boolean.TRUE;
        this.f11225c = abstractC0854f;
        this.f11223a = bool;
        this.f11224b = false;
        this.f11226d = i7;
        this.f11227e = bundle;
    }

    public abstract void a(ConnectionResult connectionResult);

    public abstract boolean b();

    public final void c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this) {
            this.f11223a = null;
        }
        arrayList = this.f11225c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f11225c.zzt;
            arrayList2.remove(this);
        }
    }
}
