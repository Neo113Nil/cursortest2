package androidx.swiperefreshlayout.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f9805a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f9806b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f9807c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f9808d;

    /* renamed from: e, reason: collision with root package name */
    public float f9809e;

    /* renamed from: f, reason: collision with root package name */
    public float f9810f;

    /* renamed from: g, reason: collision with root package name */
    public float f9811g;

    /* renamed from: h, reason: collision with root package name */
    public float f9812h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f9813i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public float f9814k;

    /* renamed from: l, reason: collision with root package name */
    public float f9815l;

    /* renamed from: m, reason: collision with root package name */
    public float f9816m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9817n;

    /* renamed from: o, reason: collision with root package name */
    public Path f9818o;

    /* renamed from: p, reason: collision with root package name */
    public float f9819p;

    /* renamed from: q, reason: collision with root package name */
    public float f9820q;

    /* renamed from: r, reason: collision with root package name */
    public int f9821r;

    /* renamed from: s, reason: collision with root package name */
    public int f9822s;

    /* renamed from: t, reason: collision with root package name */
    public int f9823t;

    /* renamed from: u, reason: collision with root package name */
    public int f9824u;

    public d() {
        Paint paint = new Paint();
        this.f9806b = paint;
        Paint paint2 = new Paint();
        this.f9807c = paint2;
        Paint paint3 = new Paint();
        this.f9808d = paint3;
        this.f9809e = 0.0f;
        this.f9810f = 0.0f;
        this.f9811g = 0.0f;
        this.f9812h = 5.0f;
        this.f9819p = 1.0f;
        this.f9823t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i7) {
        this.j = i7;
        this.f9824u = this.f9813i[i7];
    }
}
