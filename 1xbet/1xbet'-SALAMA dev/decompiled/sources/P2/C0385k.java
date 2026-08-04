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

/* JADX INFO: renamed from: P2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0385k implements zzgay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbtd f5485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
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
                } catch (RemoteException e7) {
                    int i7 = I2.J.f3546b;
                    J2.j.e("", e7);
                    return;
                }
                break;
            default:
                try {
                    zzbtdVar.zze("Internal error: " + th.getMessage());
                } catch (RemoteException e8) {
                    int i8 = I2.J.f3546b;
                    J2.j.e("", e8);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[Catch: RemoteException -> 0x0064, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x0064, blocks: (B:5:0x0012, B:6:0x0016, B:8:0x001c, B:10:0x002c, B:11:0x0031, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:20:0x0056, B:23:0x0066, B:25:0x0078), top: B:50:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x003e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        boolean zY0;
        zzfia zzfiaVar;
        boolean z4 = this.f5486c;
        zzbtd zzbtdVar = this.f5485b;
        BinderC0386l binderC0386l = this.f5487d;
        switch (this.f5484a) {
            case 0:
                ArrayList<Uri> arrayList = (ArrayList) obj;
                try {
                    zzbtdVar.zzf(arrayList);
                    if (binderC0386l.f5495D || z4) {
                        for (Uri uri : arrayList) {
                            boolean zY1 = BinderC0386l.y0(uri, binderC0386l.f5507P, binderC0386l.f5508Q);
                            zzfia zzfiaVar2 = binderC0386l.f5494C;
                            if (zY1) {
                                zzfiaVar2.zzd(BinderC0386l.A0(uri, binderC0386l.f5504M, "1").toString(), null, null);
                            } else {
                                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzht)).booleanValue()) {
                                    zzfiaVar2.zzd(uri.toString(), null, null);
                                }
                            }
                        }
                    }
                } catch (RemoteException e7) {
                    int i7 = I2.J.f3546b;
                    J2.j.e("", e7);
                    return;
                }
                break;
            default:
                List<Uri> list = (List) obj;
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (BinderC0386l.y0((Uri) it.next(), binderC0386l.f5505N, binderC0386l.f5506O)) {
                            binderC0386l.f5501J.getAndIncrement();
                            zzbtdVar.zzf(list);
                            if (!binderC0386l.f5496E || z4) {
                                for (Uri uri2 : list) {
                                    zY0 = BinderC0386l.y0(uri2, binderC0386l.f5505N, binderC0386l.f5506O);
                                    zzfiaVar = binderC0386l.f5494C;
                                    if (zY0) {
                                        zzfiaVar.zzd(BinderC0386l.A0(uri2, binderC0386l.f5504M, "1").toString(), null, null);
                                    } else {
                                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzht)).booleanValue()) {
                                            zzfiaVar.zzd(uri2.toString(), null, null);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }
                    zzbtdVar.zzf(list);
                    if (!binderC0386l.f5496E) {
                    }
                    while (r11.hasNext()) {
                        zY0 = BinderC0386l.y0(uri2, binderC0386l.f5505N, binderC0386l.f5506O);
                        zzfiaVar = binderC0386l.f5494C;
                        if (zY0) {
                            zzfiaVar.zzd(BinderC0386l.A0(uri2, binderC0386l.f5504M, "1").toString(), null, null);
                        } else {
                            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzht)).booleanValue()) {
                                zzfiaVar.zzd(uri2.toString(), null, null);
                            }
                        }
                    }
                } catch (RemoteException e8) {
                    int i8 = I2.J.f3546b;
                    J2.j.e("", e8);
                }
                break;
        }
    }
}
