package W0;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final x1.e f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3390b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3391c;

    public f(Context context, d dVar) {
        x1.e eVar = new x1.e(context, 7);
        this.f3391c = new HashMap();
        this.f3389a = eVar;
        this.f3390b = dVar;
    }

    public final synchronized g a(String str) {
        if (this.f3391c.containsKey(str)) {
            return (g) this.f3391c.get(str);
        }
        CctBackendFactory r5 = this.f3389a.r(str);
        if (r5 == null) {
            return null;
        }
        d dVar = this.f3390b;
        g create = r5.create(new b(dVar.f3384a, dVar.f3385b, dVar.f3386c, str));
        this.f3391c.put(str, create);
        return create;
    }
}
