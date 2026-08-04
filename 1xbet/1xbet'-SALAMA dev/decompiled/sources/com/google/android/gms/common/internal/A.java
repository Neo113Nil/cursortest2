package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f11223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0810f f11225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f11227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0810f f11228f;

    public A(AbstractC0810f abstractC0810f, int i7, Bundle bundle) {
        this.f11228f = abstractC0810f;
        Boolean bool = Boolean.TRUE;
        this.f11225c = abstractC0810f;
        this.f11223a = bool;
        this.f11224b = false;
        this.f11226d = i7;
        this.f11227e = bundle;
    }

    public abstract void a(ConnectionResult connectionResult);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f11223a = null;
        }
        synchronized (this.f11225c.zzt) {
            this.f11225c.zzt.remove(this);
        }
    }
}
