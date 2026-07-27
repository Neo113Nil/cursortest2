package S;

import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.g7;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1257d;

    public /* synthetic */ a(int i3, int i4, Object obj, Object obj2) {
        this.f1254a = i4;
        this.f1256c = obj;
        this.f1257d = obj2;
        this.f1255b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1254a) {
            case 0:
                ((d) ((J1.c) this.f1256c).f698c).a(this.f1255b, (Serializable) this.f1257d);
                break;
            case 1:
                ((BannerRequest) this.f1256c).lambda$loadExternalAd$4((BannerRequest.Callback) this.f1257d, this.f1255b);
                break;
            case 2:
                ((BannerStandard) this.f1256c).lambda$loadExternalInline$1((g7) this.f1257d, this.f1255b);
                break;
            default:
                ((StartAppAd) this.f1256c).a((AdEventListener) this.f1257d, this.f1255b);
                break;
        }
    }

    public /* synthetic */ a(J1.c cVar, int i3, Serializable serializable) {
        this.f1254a = 0;
        this.f1256c = cVar;
        this.f1255b = i3;
        this.f1257d = serializable;
    }
}
