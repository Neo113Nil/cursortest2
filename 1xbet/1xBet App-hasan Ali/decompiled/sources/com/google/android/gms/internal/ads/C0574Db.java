package com.google.android.gms.internal.ads;

import Q2.InterfaceC0362h0;
import Q2.InterfaceC0383s0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574Db extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1192k9 f8193a;

    /* renamed from: c, reason: collision with root package name */
    public final C1390oj f8195c;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8194b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8196d = new ArrayList();

    public C0574Db(InterfaceC1192k9 interfaceC1192k9) {
        this.f8193a = interfaceC1192k9;
        C1390oj c1390oj = null;
        try {
            List u5 = interfaceC1192k9.u();
            if (u5 != null) {
                for (Object obj : u5) {
                    I8 u32 = obj instanceof IBinder ? BinderC1865z8.u3((IBinder) obj) : null;
                    if (u32 != null) {
                        this.f8194b.add(new C1390oj(u32));
                    }
                }
            }
        } catch (RemoteException e3) {
            U2.j.g("", e3);
        }
        try {
            List y5 = this.f8193a.y();
            if (y5 != null) {
                for (Object obj2 : y5) {
                    InterfaceC0362h0 u33 = obj2 instanceof IBinder ? Q2.H0.u3((IBinder) obj2) : null;
                    if (u33 != null) {
                        this.f8196d.add(new H3.g(u33));
                    }
                }
            }
        } catch (RemoteException e5) {
            U2.j.g("", e5);
        }
        try {
            I8 k5 = this.f8193a.k();
            if (k5 != null) {
                c1390oj = new C1390oj(k5);
            }
        } catch (RemoteException e6) {
            U2.j.g("", e6);
        }
        this.f8195c = c1390oj;
        try {
            if (this.f8193a.e() != null) {
                new C1529ro(this.f8193a.e());
            }
        } catch (RemoteException e7) {
            U2.j.g("", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.f8193a.n();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f8193a.r();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String c() {
        try {
            return this.f8193a.s();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final C1390oj d() {
        return this.f8195c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final J2.q e() {
        InterfaceC0383s0 interfaceC0383s0;
        try {
            interfaceC0383s0 = this.f8193a.f();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
            interfaceC0383s0 = null;
        }
        if (interfaceC0383s0 != null) {
            return new J2.q(interfaceC0383s0);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ InterfaceC2360a f() {
        try {
            return this.f8193a.l();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
            return null;
        }
    }

    public final void g() {
        try {
            this.f8193a.v();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f8193a.K2(bundle);
        } catch (RemoteException e3) {
            U2.j.g("Failed to record native event", e3);
        }
    }
}
