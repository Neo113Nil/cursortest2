package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import g3.C1984b;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0727Yf implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12351a;

    public /* synthetic */ C0727Yf(int i) {
        this.f12351a = i;
    }

    /* JADX WARN: Type inference failed for: r10v47, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        C0858co c0858co;
        int i = 2;
        int i5 = 3;
        int i6 = -1;
        String str = "";
        int i7 = 0;
        String str2 = null;
        int i8 = 1;
        switch (this.f12351a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Y9)).booleanValue()) {
                    P2.o.f4767B.f4774g.j("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    P2.o.f4767B.f4774g.h("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                C0954ev c0954ev = AbstractC1044gv.f13676l;
                return AbstractC1400ot.c0(new P1.b(C1761wv.f16184o));
            case 1:
                T2.G.n("Error during loading assets.", (Exception) obj);
                return Mw.f10750l;
            case 2:
                Throwable th2 = (ExecutionException) obj;
                if (th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                return AbstractC1400ot.Z(th2);
            case 3:
                return AbstractC1400ot.Z(new C0856cm(5));
            case 4:
                Exception exc = (Exception) obj;
                P2.o.f4767B.f4774g.h("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    c0858co = new C0858co("Timed out waiting for ad response.", 1);
                } else if (exc instanceof C0858co) {
                    c0858co = (C0858co) exc;
                } else {
                    c0858co = new C0858co(exc.getMessage() == null ? "Fetch failed." : exc.getMessage(), 1);
                }
                return AbstractC1400ot.Z(c0858co);
            case 5:
                return Mw.f10750l;
            case 6:
                return AbstractC1400ot.c0(((C1842ym) obj).f16473a);
            case 7:
                Throwable th3 = (ExecutionException) obj;
                if (th3.getCause() != null) {
                    th3 = th3.getCause();
                }
                return AbstractC1400ot.Z(th3);
            case 8:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                AbstractC0613Id.f9539a.execute(new RunnableC1081hn(7, (InputStream) obj, createPipe[1]));
                return AbstractC1400ot.c0(parcelFileDescriptor);
            case 9:
                return AbstractC1400ot.c0(new To((String) obj, i8));
            case 10:
                return ((Throwable) obj) instanceof TimeoutException ? AbstractC1400ot.c0(new To(Integer.toString(17), i8)) : AbstractC1400ot.c0(new To(str2, i8));
            case 11:
                C1984b c1984b = (C1984b) obj;
                if (c1984b == null) {
                    return AbstractC1400ot.c0(new C0993fp(i6, i7, str2));
                }
                return AbstractC1400ot.c0(new C0993fp(c1984b.f17158b, i7, c1984b.f17157a));
            case 12:
                P1.b bVar = (P1.b) obj;
                if (bVar == null) {
                    return AbstractC1400ot.c0(new C0993fp(i8, i, str));
                }
                HC w5 = IC.w();
                for (P1.c cVar : bVar.f4702a) {
                    FC w6 = GC.w();
                    int i9 = cVar.f4705c;
                    w6.e();
                    ((GC) w6.f10141l).zzc = i9;
                    w6.e();
                    ((GC) w6.f10141l).zzd = cVar.f4704b;
                    w6.e();
                    ((GC) w6.f10141l).zze = cVar.f4703a;
                    GC gc = (GC) w6.b();
                    w5.e();
                    IC.x((IC) w5.f10141l, gc);
                }
                return AbstractC1400ot.c0(new C0993fp(i8, i, Base64.encodeToString(((IC) w5.b()).d(), 1)));
            case 13:
                C1984b c1984b2 = (C1984b) obj;
                if (c1984b2 == null) {
                    return AbstractC1400ot.c0(new C0993fp(i6, i5, str2));
                }
                return AbstractC1400ot.c0(new C0993fp(c1984b2.f17158b, i5, c1984b2.f17157a));
            case 14:
                return Mw.f10750l;
            default:
                return AbstractC1400ot.c0("");
        }
    }
}
