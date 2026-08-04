package P2;

import F2.C0252s;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzdxd;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzgaj;
import com.google.android.gms.internal.ads.zzgbc;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: renamed from: P2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0381g implements zzgaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5481b;

    public /* synthetic */ C0381g(Object obj, int i7) {
        this.f5480a = i7;
        this.f5481b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgaj
    public final I3.b zza(Object obj) {
        switch (this.f5480a) {
            case 0:
                final Uri uri = (Uri) obj;
                final BinderC0386l binderC0386l = (BinderC0386l) this.f5481b;
                return zzgbc.zzm(binderC0386l.t0("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfsw(binderC0386l, uri) { // from class: P2.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Uri f5482a;

                    {
                        this.f5482a = uri;
                    }

                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = this.f5482a;
                        return !zIsEmpty ? BinderC0386l.A0(uri2, "nas", str) : uri2;
                    }
                }, binderC0386l.f5520f);
            case 1:
                final ArrayList arrayList = (ArrayList) obj;
                final BinderC0386l binderC0386l2 = (BinderC0386l) this.f5481b;
                return zzgbc.zzm(binderC0386l2.t0("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfsw() { // from class: P2.d
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri2 : arrayList) {
                            BinderC0386l binderC0386l3 = binderC0386l2;
                            if (!BinderC0386l.y0(uri2, binderC0386l3.f5507P, binderC0386l3.f5508Q) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri2);
                            } else {
                                arrayList2.add(BinderC0386l.A0(uri2, "nas", str));
                            }
                        }
                        return arrayList2;
                    }
                }, binderC0386l2.f5520f);
            default:
                zzdxd zzdxdVar = (zzdxd) obj;
                v vVar = new v(new JsonReader(new InputStreamReader(zzdxdVar.zzb())), zzdxdVar.zza());
                zzbuo zzbuoVar = (zzbuo) this.f5481b;
                try {
                    vVar.f5564b = C0252s.f2717f.f2718a.j(zzbuoVar.zza).toString();
                    break;
                } catch (JSONException unused) {
                    vVar.f5564b = "{}";
                }
                if (!zzbuoVar.zzn.isEmpty()) {
                    try {
                        vVar.f5565c = C0252s.f2717f.f2718a.j(zzbuoVar.zzn).toString();
                        break;
                    } catch (JSONException unused2) {
                    }
                }
                return zzgbc.zzh(vVar);
        }
    }
}
