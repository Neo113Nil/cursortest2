package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicInteger;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.ms, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1309ms extends E5 {

    /* renamed from: k, reason: collision with root package name */
    public final C1489qs f14544k;

    public BinderC1309ms(C1489qs c1489qs) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f14544k = c1489qs;
    }

    public final boolean A3(String str) {
        boolean h3;
        C1489qs c1489qs = this.f14544k;
        synchronized (c1489qs) {
            h3 = c1489qs.h(str, J2.c.f2701n);
        }
        return h3;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        Q2.O o5;
        switch (i) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Q2.R0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    o5 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    o5 = queryLocalInterface instanceof Q2.O ? (Q2.O) queryLocalInterface : new Q2.O(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 0);
                }
                F5.b(parcel);
                x3(createTypedArrayList, o5);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                F5.b(parcel);
                boolean A3 = A3(readString);
                parcel2.writeNoException();
                parcel2.writeInt(A3 ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                F5.b(parcel);
                InterfaceC0612Ic w32 = w3(readString2);
                parcel2.writeNoException();
                F5.e(parcel2, w32);
                return true;
            case 4:
                String readString3 = parcel.readString();
                F5.b(parcel);
                boolean y32 = y3(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(y32 ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                F5.b(parcel);
                InterfaceC0966f6 u32 = u3(readString4);
                parcel2.writeNoException();
                F5.e(parcel2, u32);
                return true;
            case 6:
                String readString5 = parcel.readString();
                F5.b(parcel);
                boolean z3 = z3(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                F5.b(parcel);
                Q2.K v32 = v3(readString6);
                parcel2.writeNoException();
                F5.e(parcel2, v32);
                return true;
            case 8:
                InterfaceC0624Ka u33 = BinderC0610Ia.u3(parcel.readStrongBinder());
                F5.b(parcel);
                C1489qs c1489qs = this.f14544k;
                c1489qs.f15179c.f16059e = u33;
                if (c1489qs.f == null) {
                    synchronized (c1489qs) {
                        if (c1489qs.f == null) {
                            try {
                                c1489qs.f = (ConnectivityManager) c1489qs.f15181e.getSystemService("connectivity");
                            } catch (ClassCastException e3) {
                                U2.j.j("Failed to get connectivity manager", e3);
                            }
                        }
                    }
                }
                if (!AbstractC2309b.e() || c1489qs.f == null) {
                    c1489qs.f15183h = new AtomicInteger(((Integer) Q2.r.f5053d.f5056c.a(F7.f8928y)).intValue());
                } else {
                    try {
                        c1489qs.f.registerDefaultNetworkCallback(new D2.g(3, c1489qs));
                    } catch (RuntimeException e5) {
                        U2.j.j("Failed to register network callback", e5);
                        c1489qs.f15183h = new AtomicInteger(((Integer) Q2.r.f5053d.f5056c.a(F7.f8928y)).intValue());
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final InterfaceC0966f6 u3(String str) {
        Object orElse;
        InterfaceC0966f6 interfaceC0966f6;
        C1489qs c1489qs = this.f14544k;
        synchronized (c1489qs) {
            orElse = c1489qs.e(InterfaceC0966f6.class, str, J2.c.f2704q).orElse(null);
            interfaceC0966f6 = (InterfaceC0966f6) orElse;
        }
        return interfaceC0966f6;
    }

    public final Q2.K v3(String str) {
        Object orElse;
        Q2.K k5;
        C1489qs c1489qs = this.f14544k;
        synchronized (c1489qs) {
            orElse = c1489qs.e(Q2.K.class, str, J2.c.f2700m).orElse(null);
            k5 = (Q2.K) orElse;
        }
        return k5;
    }

    public final InterfaceC0612Ic w3(String str) {
        Object orElse;
        InterfaceC0612Ic interfaceC0612Ic;
        C1489qs c1489qs = this.f14544k;
        synchronized (c1489qs) {
            orElse = c1489qs.e(InterfaceC0612Ic.class, str, J2.c.f2701n).orElse(null);
            interfaceC0612Ic = (InterfaceC0612Ic) orElse;
        }
        return interfaceC0612Ic;
    }

    public final void x3(ArrayList arrayList, Q2.O o5) {
        Object orDefault;
        C1489qs c1489qs = this.f14544k;
        synchronized (c1489qs) {
            try {
                ArrayList d5 = c1489qs.d(arrayList);
                EnumMap enumMap = new EnumMap(J2.c.class);
                int size = d5.size();
                int i = 0;
                while (i < size) {
                    Object obj = d5.get(i);
                    i++;
                    Q2.R0 r02 = (Q2.R0) obj;
                    String str = r02.f4935k;
                    J2.c a5 = J2.c.a(r02.f4936l);
                    C1174js a6 = c1489qs.f15179c.a(r02, o5);
                    if (a5 != null && a6 != null) {
                        AtomicInteger atomicInteger = c1489qs.f15183h;
                        if (atomicInteger != null) {
                            a6.k(atomicInteger.get());
                        }
                        a6.f14184n = c1489qs.f15180d;
                        c1489qs.f(C1489qs.a(str, a5), a6);
                        orDefault = enumMap.getOrDefault(a5, 0);
                        enumMap.put((EnumMap) a5, (J2.c) Integer.valueOf(((Integer) orDefault).intValue() + 1));
                    }
                }
                U4 u42 = c1489qs.f15180d;
                c1489qs.f15182g.getClass();
                u42.q(enumMap, System.currentTimeMillis());
                P2.o.f4767B.f.i(new C1279m6(1, c1489qs));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean y3(String str) {
        boolean h3;
        C1489qs c1489qs = this.f14544k;
        synchronized (c1489qs) {
            h3 = c1489qs.h(str, J2.c.f2704q);
        }
        return h3;
    }

    public final boolean z3(String str) {
        boolean h3;
        C1489qs c1489qs = this.f14544k;
        synchronized (c1489qs) {
            h3 = c1489qs.h(str, J2.c.f2700m);
        }
        return h3;
    }
}
