package D4;

import B4.C2581j;
import androidx.lifecycle.AbstractC5434v;
import com.vk.id.OAuth;
import com.vk.id.multibranding.OAuthListWidgetAnalytics;

/* renamed from: D4.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C2836k implements androidx.lifecycle.G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5910a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5912c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5913d;

    public /* synthetic */ C2836k(C2581j c2581j, c1.u uVar, boolean z11) {
        this.f5911b = z11;
        this.f5912c = uVar;
        this.f5913d = c2581j;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(androidx.lifecycle.J j11, AbstractC5434v.a aVar) {
        switch (this.f5910a) {
            case 0:
                C2581j c2581j = (C2581j) this.f5913d;
                boolean z11 = this.f5911b;
                c1.u uVar = (c1.u) this.f5912c;
                if (z11 && !uVar.contains(c2581j)) {
                    uVar.add(c2581j);
                }
                if (aVar == AbstractC5434v.a.ON_START && !uVar.contains(c2581j)) {
                    uVar.add(c2581j);
                }
                if (aVar == AbstractC5434v.a.ON_STOP) {
                    uVar.remove(c2581j);
                    break;
                }
                break;
            default:
                OAuthListWidgetAnalytics.OAuthShown$lambda$8$lambda$7$lambda$5((OAuth) this.f5912c, (OAuthListWidgetAnalytics) this.f5913d, this.f5911b, j11, aVar);
                break;
        }
    }

    public /* synthetic */ C2836k(OAuth oAuth, OAuthListWidgetAnalytics oAuthListWidgetAnalytics, boolean z11) {
        this.f5912c = oAuth;
        this.f5913d = oAuthListWidgetAnalytics;
        this.f5911b = z11;
    }
}
