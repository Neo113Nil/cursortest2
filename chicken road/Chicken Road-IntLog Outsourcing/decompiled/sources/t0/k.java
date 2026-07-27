package t0;

import B0.t;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import s0.s;
import s0.x;

/* loaded from: classes.dex */
public final class k extends e5.g {

    /* renamed from: h, reason: collision with root package name */
    public static final String f11868h = s.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final o f11869a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11870b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11871c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11872d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11873e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f11874f;

    /* renamed from: g, reason: collision with root package name */
    public t f11875g;

    public k(o oVar, String str, List list) {
        this.f11869a = oVar;
        this.f11870b = str;
        this.f11871c = list;
        this.f11872d = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((s0.t) list.get(i2)).f11794a.toString();
            kotlin.jvm.internal.i.d(uuid, "id.toString()");
            this.f11872d.add(uuid);
            this.f11873e.add(uuid);
        }
    }

    public static HashSet F(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }

    public final x E() {
        if (this.f11874f) {
            s.d().g(f11868h, "Already enqueued work ids (" + TextUtils.join(", ", this.f11872d) + ")");
        } else {
            C0.d dVar = new C0.d(this);
            this.f11869a.f11885d.o(dVar);
            this.f11875g = dVar.f330b;
        }
        return this.f11875g;
    }
}
