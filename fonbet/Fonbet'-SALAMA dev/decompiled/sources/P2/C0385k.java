package P2;

import F2.C0254t;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzfia;
import com.google.android.gms.internal.ads.zzgay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: P2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385k implements zzgay {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbtd f5485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC0386l f5487d;

    public /* synthetic */ C0385k(BinderC0386l binderC0386l, zzbtd zzbtdVar, boolean z4, int i7) {
        this.f5484a = i7;
        this.f5485b = zzbtdVar;
        this.f5486c = z4;
        this.f5487d = binderC0386l;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzbtd zzbtdVar = this.f5485b;
        switch (this.f5484a) {
            case 0:
                try {
                    zzbtdVar.zze("Internal error: " + th.getMessage());
                    break;
                } catch (RemoteException e7) {
                    int i7 = I2.J.f3546b;
                    J2.j.e("", e7);
                    return;
                }
            default:
                try {
                    zzbtdVar.zze("Internal error: " + th.getMessage());
                    break;
                } catch (RemoteException e8) {
                    int i8 = I2.J.f3546b;
                    J2.j.e("", e8);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        boolean z4 = this.f5486c;
        zzbtd zzbtdVar = this.f5485b;
        BinderC0386l binderC0386l = this.f5487d;
        switch (this.f5484a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    zzbtdVar.zzf(arrayList);
                    if (binderC0386l.f5495D || z4) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Uri uri = (Uri) it.next();
                            boolean y02 = BinderC0386l.y0(uri, binderC0386l.f5507P, binderC0386l.f5508Q);
                            zzfia zzfiaVar = binderC0386l.f5494C;
                            if (y02) {
                                zzfiaVar.zzd(BinderC0386l.A0(uri, binderC0386l.f5504M, "1").toString(), null, null);
                            } else {
                                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzht)).booleanValue()) {
                                    zzfiaVar.zzd(uri.toString(), null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e7) {
                    int i7 = I2.J.f3546b;
                    J2.j.e("", e7);
                    return;
                }
            default:
                List<Uri> list = (List) obj;
                try {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (BinderC0386l.y0((Uri) it2.next(), binderC0386l.f5505N, binderC0386l.f5506O)) {
                                binderC0386l.f5501J.getAndIncrement();
                            }
                        }
                    }
                    zzbtdVar.zzf(list);
                    if (binderC0386l.f5496E || z4) {
                        for (Uri uri2 : list) {
                            boolean y03 = BinderC0386l.y0(uri2, binderC0386l.f5505N, binderC0386l.f5506O);
                            zzfia zzfiaVar2 = binderC0386l.f5494C;
                            if (y03) {
                                zzfiaVar2.zzd(BinderC0386l.A0(uri2, binderC0386l.f5504M, "1").toString(), null, null);
                            } else {
                                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzht)).booleanValue()) {
                                    zzfiaVar2.zzd(uri2.toString(), null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e8) {
                    int i8 = I2.J.f3546b;
                    J2.j.e("", e8);
                }
        }
    }
}
