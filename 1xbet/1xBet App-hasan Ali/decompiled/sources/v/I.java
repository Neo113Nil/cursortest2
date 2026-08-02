package v;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20153a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20154b;

    /* renamed from: c, reason: collision with root package name */
    public long f20155c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f20156d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f20157e;
    public EdgeEffect f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f20158g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f20159h;
    public EdgeEffect i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f20160j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f20161k;

    public I(Context context, int i) {
        this.f20153a = context;
        this.f20154b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C2519n.f20274a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f20153a;
        EdgeEffect a5 = i >= 31 ? C2519n.f20274a.a(context, null) : new S(context);
        a5.setColor(this.f20154b);
        if (!W0.l.a(this.f20155c, 0L)) {
            long j5 = this.f20155c;
            a5.setSize((int) (j5 >> 32), (int) (j5 & 4294967295L));
        }
        return a5;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f20157e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a5 = a();
        this.f20157e = a5;
        return a5;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a5 = a();
        this.f = a5;
        return a5;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f20158g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a5 = a();
        this.f20158g = a5;
        return a5;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f20156d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a5 = a();
        this.f20156d = a5;
        return a5;
    }
}
