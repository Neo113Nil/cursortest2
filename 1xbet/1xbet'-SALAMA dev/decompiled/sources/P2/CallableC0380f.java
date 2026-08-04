package P2;

import F2.C0254t;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzfbe;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: P2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0380f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5479d;

    public /* synthetic */ CallableC0380f(Object obj, Object obj2, Object obj3, int i7) {
        this.f5476a = i7;
        this.f5477b = obj;
        this.f5479d = obj2;
        this.f5478c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        zzfbe zzfbeVar;
        Object obj = this.f5478c;
        Object obj2 = this.f5479d;
        Object obj3 = this.f5477b;
        switch (this.f5476a) {
            case 0:
                Uri uriZza = (Uri) obj2;
                try {
                    BinderC0386l binderC0386l = (BinderC0386l) obj3;
                    p105o3.a aVar = (p105o3.a) obj;
                    uriZza = (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlX)).booleanValue() || (zzfbeVar = binderC0386l.f5518d) == null) ? binderC0386l.f5517c.zza(uriZza, binderC0386l.f5516b, (View) p105o3.b.t0(aVar), null) : zzfbeVar.zza(uriZza, binderC0386l.f5516b, (View) p105o3.b.t0(aVar), null);
                    break;
                } catch (zzaup e7) {
                    int i7 = I2.J.f3546b;
                    J2.j.h("", e7);
                }
                if (uriZza.getQueryParameter("ms") != null) {
                    return uriZza;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 1:
                BinderC0386l binderC0386l2 = (BinderC0386l) obj3;
                String strZzh = binderC0386l2.f5517c.zzc() != null ? binderC0386l2.f5517c.zzc().zzh(binderC0386l2.f5516b, (View) p105o3.b.t0((p105o3.a) obj), null) : "";
                if (TextUtils.isEmpty(strZzh)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : (List) obj2) {
                    if (BinderC0386l.y0(uri, binderC0386l2.f5507P, binderC0386l2.f5508Q)) {
                        arrayList.add(BinderC0386l.A0(uri, "ms", strZzh));
                    } else {
                        String strValueOf = String.valueOf(uri);
                        int i8 = I2.J.f3546b;
                        J2.j.g("Not a Google URL: ".concat(strValueOf));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            default:
                R2.a.a(((G) obj3).f5425c, (p167y2.i) obj2, (H) obj);
                return Boolean.TRUE;
        }
    }
}
