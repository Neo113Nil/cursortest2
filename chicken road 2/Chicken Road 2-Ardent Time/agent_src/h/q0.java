package h;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3239a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f3240b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f3241c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f3242d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f3243e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3244f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3245g;

    public q0(android.content.Context context) {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        this.f3242d = layoutParams;
        this.f3243e = new android.graphics.Rect();
        this.f3244f = new int[2];
        this.f3245g = new int[2];
        this.f3239a = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_tooltip, (android.view.ViewGroup) null);
        this.f3240b = inflate;
        this.f3241c = (android.widget.TextView) inflate.findViewById(com.watchfacestudio.huasi_urx110.R.id.message);
        layoutParams.setTitle(h.q0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = com.watchfacestudio.huasi_urx110.R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
