package o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f8104a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f8105b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f8106c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f8107d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f8108e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f8109f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.PendingIntent f8110g;

    /* renamed from: h, reason: collision with root package name */
    public int f8111h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8112i;

    /* renamed from: j, reason: collision with root package name */
    public x0.e f8113j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8114k;

    /* renamed from: l, reason: collision with root package name */
    public android.os.Bundle f8115l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f8116m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8117n;

    /* renamed from: o, reason: collision with root package name */
    public android.app.Notification f8118o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f8119p;

    public static java.lang.CharSequence a(java.lang.String str) {
        return str == null ? str : str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    public final void b(x0.e eVar) {
        if (this.f8113j != eVar) {
            this.f8113j = eVar;
            if (((o.b) eVar.f8409b) != this) {
                eVar.f8409b = this;
                b(eVar);
            }
        }
    }
}
