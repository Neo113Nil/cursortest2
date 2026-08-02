package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import b.C0497b;
import java.util.concurrent.atomic.AtomicBoolean;
import q.AbstractServiceConnectionC2295j;
import q.C2294i;

/* loaded from: classes.dex */
public final class P7 extends AbstractServiceConnectionC2295j {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11066b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public Context f11067c;

    /* renamed from: d, reason: collision with root package name */
    public C1482ql f11068d;

    /* renamed from: e, reason: collision with root package name */
    public m2.g f11069e;
    public C2294i f;

    @Override // q.AbstractServiceConnectionC2295j
    public final void a(C2294i c2294i) {
        this.f = c2294i;
        try {
            ((C0497b) c2294i.f18851a).h1();
        } catch (RemoteException unused) {
        }
        this.f11069e = c2294i.b(new O7(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f = null;
        this.f11069e = null;
    }
}
