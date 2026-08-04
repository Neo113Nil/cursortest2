package E2;

import D3.p;
import P2.G;
import W5.E;
import W5.T;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaug;
import p098n4.C0940m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1921c;

    public /* synthetic */ g(Object obj, boolean z4, int i7) {
        this.f1919a = i7;
        this.f1921c = obj;
        this.f1920b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1919a) {
            case 0:
                h hVar = (h) this.f1921c;
                boolean z4 = this.f1920b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Context context = hVar.f1922A;
                    VersionInfoParcel versionInfoParcel = hVar.f1924C;
                    boolean z7 = hVar.f1925D;
                    zzaqt zzaqtVarZza = zzaqv.zza();
                    zzaqtVarZza.zza(z4);
                    zzaqtVarZza.zzb(versionInfoParcel.f10834a);
                    zzaqv zzaqvVar = (zzaqv) zzaqtVarZza.zzbr();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzaug.zza(context, zzaqvVar, z7).zzp();
                } catch (NullPointerException e7) {
                    hVar.f1935y.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e7);
                    return;
                }
                break;
            case 1:
                ((G) this.f1921c).e(this.f1920b, false);
                break;
            case 2:
                boolean z8 = this.f1920b;
                E e8 = (E) this.f1921c;
                if (z8) {
                    T t7 = (T) e8.f6761b;
                    t7.f7046l = true;
                    if (t7.f7044i > 0) {
                        p pVar = t7.f7045k;
                        pVar.f1738b = false;
                        pVar.b();
                    }
                }
                ((T) e8.f6761b).f7051q = false;
                break;
            default:
                D3.j jVar = (D3.j) this.f1921c;
                ((C0940m) jVar.f1723b).k(jVar.i(), this.f1920b, false);
                break;
        }
    }
}
