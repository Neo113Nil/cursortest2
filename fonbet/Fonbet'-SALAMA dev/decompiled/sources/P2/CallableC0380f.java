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
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* renamed from: P2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0380f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5479d;

    public /* synthetic */ CallableC0380f(Object obj, Object obj2, Object obj3, int i7) {
        this.f5476a = i7;
        this.f5477b = obj;
        this.f5479d = obj2;
        this.f5478c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzfbe zzfbeVar;
        Object obj = this.f5478c;
        Object obj2 = this.f5479d;
        Object obj3 = this.f5477b;
        switch (this.f5476a) {
            case 0:
                Uri uri = (Uri) obj2;
                try {
                    BinderC0386l binderC0386l = (BinderC0386l) obj3;
                    InterfaceC1506a interfaceC1506a = (InterfaceC1506a) obj;
                    uri = (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlX)).booleanValue() || (zzfbeVar = binderC0386l.f5518d) == null) ? binderC0386l.f5517c.zza(uri, binderC0386l.f5516b, (View) BinderC1507b.t0(interfaceC1506a), null) : zzfbeVar.zza(uri, binderC0386l.f5516b, (View) BinderC1507b.t0(interfaceC1506a), null);
                } catch (zzaup e7) {
                    int i7 = I2.J.f3546b;
                    J2.j.h("", e7);
                }
                if (uri.getQueryParameter("ms") != null) {
                    return uri;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 1:
                BinderC0386l binderC0386l2 = (BinderC0386l) obj3;
                String zzh = binderC0386l2.f5517c.zzc() != null ? binderC0386l2.f5517c.zzc().zzh(binderC0386l2.f5516b, (View) BinderC1507b.t0((InterfaceC1506a) obj), null) : "";
                if (TextUtils.isEmpty(zzh)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri2 : (List) obj2) {
                    if (BinderC0386l.y0(uri2, binderC0386l2.f5507P, binderC0386l2.f5508Q)) {
                        arrayList.add(BinderC0386l.A0(uri2, "ms", zzh));
                    } else {
                        String valueOf = String.valueOf(uri2);
                        int i8 = I2.J.f3546b;
                        J2.j.g("Not a Google URL: ".concat(valueOf));
                        arrayList.add(uri2);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            default:
                R2.a.a(((G) obj3).f5425c, (y2.i) obj2, (H) obj);
                return Boolean.TRUE;
        }
    }
}
