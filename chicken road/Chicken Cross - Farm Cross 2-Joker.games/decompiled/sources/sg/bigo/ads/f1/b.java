package sg.bigo.ads.f1;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.U.h;
import sg.bigo.ads.h1.f;
import sg.bigo.ads.h1.w;
import sg.bigo.ads.h1.x;
import sg.bigo.ads.i1.c;

/* loaded from: classes3.dex */
public final class b {
    public static final b i = new b();

    /* renamed from: a, reason: collision with root package name */
    public f f12791a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public x c;
    public sg.bigo.ads.g1.a d;
    public Context e;
    public sg.bigo.ads.V0.a f;
    public sg.bigo.ads.V0.a g;
    public h h;

    public final void a() {
        f fVar = this.f12791a;
        if (fVar != null) {
            sg.bigo.ads.h1.h hVar = fVar.c;
            synchronized (hVar) {
                hVar.c.clear();
                hVar.b.clear();
            }
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.a();
        }
    }

    public final void a(String str, HashMap hashMap) {
        if (!sg.bigo.ads.F0.a.f() && this.b.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.putOpt((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
            sg.bigo.ads.g1.a aVar = this.d;
            if (aVar != null && aVar.d) {
                if (this.c == null) {
                    this.c = new x(this.e, aVar, this.f, this.g, this.h);
                }
                x xVar = this.c;
                xVar.getClass();
                c.a(new w(xVar, str, jSONObject));
                return;
            }
            f fVar = this.f12791a;
            if (fVar != null) {
                c.a(new sg.bigo.ads.h1.a(fVar, str, jSONObject));
            }
        }
    }
}
