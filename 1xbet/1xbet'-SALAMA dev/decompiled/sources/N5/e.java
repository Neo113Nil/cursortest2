package N5;

import A5.p;
import B3.i;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.consent_sdk.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements B3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4788b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f4787a = i7;
        this.f4788b = obj;
    }

    @Override // B3.b
    public final void a(i iVar) {
        switch (this.f4787a) {
            case 0:
                p pVar = (p) this.f4788b;
                if (iVar == null) {
                    pVar.success(null);
                } else {
                    pVar.error(Integer.toString(iVar.f1067a), iVar.f1068b, null);
                }
                break;
            default:
                w wVar = (w) this.f4788b;
                y1.a aVar = (y1.a) wVar.f11336c;
                zza.zza(aVar.f18133a).zzc().zzb(new w(25, (Object) aVar, wVar.f11335b, false), new p145u1.c(aVar, 29));
                break;
        }
    }
}
