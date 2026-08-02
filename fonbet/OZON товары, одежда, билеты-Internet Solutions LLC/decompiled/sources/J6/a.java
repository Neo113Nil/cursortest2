package J6;

import L6.b;
import L6.d;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes8.dex */
public abstract class a<R extends L6.d, W extends L6.b> {

    /* renamed from: a, reason: collision with root package name */
    protected final R f14120a;

    /* renamed from: b, reason: collision with root package name */
    public int f14121b;

    /* renamed from: c, reason: collision with root package name */
    public int f14122c;

    /* renamed from: d, reason: collision with root package name */
    public int f14123d;

    /* renamed from: e, reason: collision with root package name */
    public int f14124e;

    /* renamed from: f, reason: collision with root package name */
    public int f14125f;

    /* renamed from: g, reason: collision with root package name */
    protected final Rect f14126g = new Rect();

    /* renamed from: h, reason: collision with root package name */
    protected final Rect f14127h = new Rect();

    public a(R r11) {
        this.f14120a = r11;
    }

    public abstract Bitmap a(Canvas canvas, Paint paint, int i11, Bitmap bitmap, I6.b bVar);
}
