package sg.bigo.ads.x;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class f implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f13371a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ g d;

    public f(g gVar, ConcurrentHashMap concurrentHashMap, int i, ConcurrentHashMap concurrentHashMap2) {
        this.d = gVar;
        this.f13371a = concurrentHashMap;
        this.b = i;
        this.c = concurrentHashMap2;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f13371a.put(bitmap, Integer.valueOf(this.b));
        }
        if (this.f13371a.size() == this.d.f13372a.f13373a.b0.o0.size()) {
            for (Map.Entry entry : this.f13371a.entrySet()) {
                Integer a2 = sg.bigo.ads.E0.p.a((Bitmap) entry.getKey());
                if (a2 != null) {
                    this.c.put((Integer) entry.getValue(), a2);
                    if (this.c.size() >= 2) {
                        k kVar = this.d.f13372a.f13373a;
                        Map map = this.c;
                        if (kVar.f0 == null || map.size() < 2) {
                            return;
                        }
                        kVar.f0.post(new i(kVar, map));
                        return;
                    }
                }
            }
        }
    }
}
