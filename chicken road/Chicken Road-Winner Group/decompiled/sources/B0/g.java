package B0;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a1.e f141a;

    /* renamed from: b, reason: collision with root package name */
    public final e f142b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f143c;

    public g(Context context, e eVar) {
        a1.e eVar2 = new a1.e(context, 2);
        this.f143c = new HashMap();
        this.f141a = eVar2;
        this.f142b = eVar;
    }

    public final synchronized h a(String str) {
        if (this.f143c.containsKey(str)) {
            return (h) this.f143c.get(str);
        }
        CctBackendFactory A3 = this.f141a.A(str);
        if (A3 == null) {
            return null;
        }
        e eVar = this.f142b;
        h create = A3.create(new b(eVar.f136a, eVar.f137b, eVar.f138c, str));
        this.f143c.put(str, create);
        return create;
    }
}
