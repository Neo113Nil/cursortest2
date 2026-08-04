package p083l4;

import android.support.v4.media.session.t;
import java.util.Map;
import p091m4.a;
import p098n4.AbstractC0930c;
import p098n4.C0940m;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f14948b;

    public h(s sVar, boolean z4) {
        this.f14948b = sVar;
        this.f14947a = z4;
    }

    @Override // p083l4.l
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean zEquals = str.equals("ok");
        s sVar = this.f14948b;
        if (zEquals) {
            sVar.f14997h = m.f14963e;
            sVar.f14985C = 0;
            sVar.j(this.f14947a);
            return;
        }
        sVar.f15005q = null;
        sVar.f15006r = true;
        C0940m c0940m = sVar.f14990a;
        c0940m.getClass();
        c0940m.t(AbstractC0930c.f15401c, Boolean.FALSE);
        t tVar = sVar.f15013y;
        tVar.W(null, L.j("Authentication failed: ", str, " (", (String) map.get("d"), ")"), new Object[0]);
        sVar.f14996g.d(2);
        if (str.equals("invalid_token")) {
            int i7 = sVar.f14985C + 1;
            sVar.f14985C = i7;
            if (i7 >= 3) {
                a aVar = sVar.f15014z;
                aVar.f15274i = aVar.f15269d;
                tVar.C0("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
            }
        }
    }
}
