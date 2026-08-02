package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1704vj extends E5 implements G8 {

    /* renamed from: k, reason: collision with root package name */
    public final Gj f16026k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2360a f16027l;

    public BinderC1704vj(Gj gj) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f16026k = gj;
    }

    public static float u3(InterfaceC2360a interfaceC2360a) {
        Drawable drawable;
        if (interfaceC2360a == null || (drawable = (Drawable) BinderC2361b.t1(interfaceC2360a)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.G8
    public final InterfaceC2360a e() {
        InterfaceC2360a interfaceC2360a = this.f16027l;
        if (interfaceC2360a != null) {
            return interfaceC2360a;
        }
        I8 M5 = this.f16026k.M();
        if (M5 == null) {
            return null;
        }
        return M5.c();
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        int i5;
        C0791b9 c0791b9;
        InterfaceC0677Re interfaceC0677Re;
        switch (i) {
            case 2:
                Gj gj = this.f16026k;
                if (gj.C() != 0.0f) {
                    r0 = gj.C();
                } else if (gj.J() != null) {
                    try {
                        r0 = gj.J().b();
                    } catch (RemoteException e3) {
                        U2.j.g("Remote exception getting video controller aspect ratio.", e3);
                    }
                } else {
                    InterfaceC2360a interfaceC2360a = this.f16027l;
                    if (interfaceC2360a != null) {
                        r0 = u3(interfaceC2360a);
                    } else {
                        I8 M5 = gj.M();
                        if (M5 != null) {
                            float j5 = (M5.j() == -1 || M5.i() == -1) ? 0.0f : M5.j() / M5.i();
                            r0 = j5 == 0.0f ? u3(M5.c()) : j5;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(r0);
                return true;
            case 3:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                this.f16027l = h1;
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC2360a e5 = e();
                parcel2.writeNoException();
                F5.e(parcel2, e5);
                return true;
            case 5:
                Gj gj2 = this.f16026k;
                r0 = gj2.J() != null ? gj2.J().f() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(r0);
                return true;
            case 6:
                Gj gj3 = this.f16026k;
                r0 = gj3.J() != null ? gj3.J().c() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(r0);
                return true;
            case 7:
                InterfaceC0391w0 J = this.f16026k.J();
                parcel2.writeNoException();
                F5.e(parcel2, J);
                return true;
            case 8:
                i5 = this.f16026k.J() != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(i5);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0791b9 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c0791b9 = queryLocalInterface instanceof C0791b9 ? (C0791b9) queryLocalInterface : new C0791b9(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 0);
                }
                F5.b(parcel);
                v3(c0791b9);
                parcel2.writeNoException();
                return true;
            case 10:
                Gj gj4 = this.f16026k;
                synchronized (gj4) {
                    interfaceC0677Re = gj4.f9233j;
                }
                i5 = interfaceC0677Re != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader2 = F5.f8654a;
                parcel2.writeInt(i5);
                return true;
            default:
                return false;
        }
    }

    public final void v3(C0791b9 c0791b9) {
        if (this.f16026k.J() instanceof BinderC0894df) {
            BinderC0894df binderC0894df = (BinderC0894df) this.f16026k.J();
            synchronized (binderC0894df.f13115l) {
                binderC0894df.f13127x = c0791b9;
            }
        }
    }
}
