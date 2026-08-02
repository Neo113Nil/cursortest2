package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.bu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0820bu implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f12925b;

    public /* synthetic */ C0820bu(int i, Bundle bundle) {
        this.f12924a = i;
        this.f12925b = bundle;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        switch (this.f12924a) {
            case 0:
                C1091hx c1091hx = C0908du.f13198c;
                this.f12925b.putString("sessionToken", str);
                break;
            case 1:
                C1091hx c1091hx2 = C0908du.f13198c;
                this.f12925b.putString("deeplinkUrl", str);
                break;
            case 2:
                C1091hx c1091hx3 = C0908du.f13198c;
                this.f12925b.putString("sessionToken", str);
                break;
            case 3:
                C1091hx c1091hx4 = C0908du.f13198c;
                this.f12925b.putString("appId", str);
                break;
            case 4:
                C1091hx c1091hx5 = C0908du.f13198c;
                this.f12925b.putString("thirdPartyAuthCallerId", str);
                break;
            case 5:
                C1091hx c1091hx6 = C0908du.f13198c;
                this.f12925b.putString("appId", str);
                break;
            case 6:
                C1091hx c1091hx7 = C0908du.f13198c;
                this.f12925b.putString("sessionToken", str);
                break;
            case 7:
                C1091hx c1091hx8 = C0908du.f13198c;
                this.f12925b.putString("appId", str);
                break;
            default:
                C1091hx c1091hx9 = C0908du.f13198c;
                this.f12925b.putString("adFieldEnifd", str);
                break;
        }
    }
}
