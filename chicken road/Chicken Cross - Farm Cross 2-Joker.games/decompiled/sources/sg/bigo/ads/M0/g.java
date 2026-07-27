package sg.bigo.ads.M0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.X;

/* loaded from: classes3.dex */
public final class g implements c {
    public static final long n = (1 * 1000) / 60;

    /* renamed from: a, reason: collision with root package name */
    public final View f12462a;
    public final Context b;
    public final sg.bigo.ads.X.b c;
    public final a d;
    public boolean e;
    public View f;
    public Canvas g;
    public Bitmap h;
    public f i;
    public long j;
    public final d k = new d(this);
    public int l = -1;
    public final WeakHashMap m = new WeakHashMap();

    public g(View view) {
        this.f12462a = view;
        Context context = view.getContext();
        this.b = context;
        this.c = sg.bigo.ads.X.a.a(context);
        this.d = new a();
    }

    public static void a(g gVar) {
        b bVar;
        View view;
        Bitmap bitmap;
        if (gVar.e) {
            return;
        }
        a aVar = gVar.d;
        Drawable drawable = aVar.f12992a;
        if ((drawable == null || (drawable instanceof f)) && (bVar = aVar.c) != null && bVar.g > 0.0f && X.a(gVar.f12462a)) {
            if (sg.bigo.ads.J0.a.a(new Rect(), gVar.f12462a)) {
                b bVar2 = gVar.d.c;
                if (bVar2 == null || (view = gVar.f) == null || !gVar.f12462a.isShown()) {
                    gVar.b();
                    return;
                }
                Rect rect = new Rect();
                Rect rect2 = bVar2.e;
                if (rect2 == null) {
                    rect2 = new Rect();
                }
                rect.left = rect2.left;
                rect.top = rect2.top;
                rect.right = rect2.right;
                rect.bottom = rect2.bottom;
                if (gVar.g == null || gVar.i == null || gVar.h == null) {
                    gVar.b();
                    int measuredWidth = (gVar.f12462a.getMeasuredWidth() - rect.left) - rect.right;
                    int measuredHeight = (gVar.f12462a.getMeasuredHeight() - rect.top) - rect.bottom;
                    int max = Math.max(1, (int) (measuredWidth / bVar2.h));
                    int max2 = Math.max(1, (int) (measuredHeight / bVar2.h));
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    gVar.h = AbstractC4962t.a(max, max2, config);
                    gVar.i = new f(gVar, AbstractC4962t.a(max, max2, config));
                    if (gVar.h == null) {
                        return;
                    }
                    gVar.g = new Canvas(gVar.h);
                    gVar.d.a(gVar.i);
                    if (!gVar.c.a(gVar.h, bVar2.g)) {
                        return;
                    }
                }
                Point a2 = X.a(view, gVar.f12462a);
                gVar.h.eraseColor(bVar2.f);
                float alpha = gVar.f12462a.getAlpha();
                gVar.f12462a.setAlpha(0.0f);
                gVar.e = true;
                float f = 1.0f / bVar2.h;
                int save = gVar.g.save();
                try {
                    gVar.g.scale(f, f);
                    gVar.g.translate((-a2.x) - rect.left, (-a2.y) - rect.top);
                    if (view.getBackground() != null) {
                        view.getBackground().draw(gVar.g);
                    }
                    view.draw(gVar.g);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    gVar.g.restoreToCount(save);
                    throw th;
                }
                gVar.g.restoreToCount(save);
                gVar.a();
                Set keySet = gVar.m.keySet();
                if (!A.a(keySet)) {
                    int i = a2.x;
                    Rect rect3 = new Rect(rect.left + i, a2.y + rect.top, (gVar.f12462a.getMeasuredWidth() + i) - rect.right, (gVar.f12462a.getMeasuredHeight() + a2.y) - rect.bottom);
                    Iterator it = keySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        TextureView textureView = (TextureView) it.next();
                        if (textureView != null && textureView.isOpaque() && X.b(textureView)) {
                            Point a3 = X.a(view, textureView);
                            int i2 = a3.x;
                            Rect rect4 = new Rect(i2, a3.y, textureView.getMeasuredWidth() + i2, textureView.getMeasuredHeight() + a3.y);
                            Rect rect5 = new Rect(rect4);
                            if (rect5.intersect(rect3) && (bitmap = textureView.getBitmap()) != null) {
                                int i3 = rect5.left - rect4.left;
                                int i4 = rect5.top - rect4.top;
                                Rect rect6 = new Rect(i3, i4, rect5.width() + i3, rect5.height() + i4);
                                int i5 = rect5.left - rect3.left;
                                int i6 = rect5.top - rect3.top;
                                Rect rect7 = new Rect(i5, i6, rect5.width() + i5, rect5.height() + i6);
                                int save2 = gVar.g.save();
                                try {
                                    gVar.g.scale(f, f);
                                    gVar.g.drawBitmap(bitmap, rect6, rect7, new Paint());
                                } catch (Exception unused2) {
                                } catch (Throwable th2) {
                                    gVar.g.restoreToCount(save2);
                                    throw th2;
                                }
                                gVar.g.restoreToCount(save2);
                                break;
                            }
                        }
                    }
                }
                gVar.e = false;
                gVar.f12462a.setAlpha(alpha);
                gVar.c.a(gVar.h, gVar.i.getBitmap());
                gVar.d.invalidateSelf();
            }
        }
    }

    public final void b() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.i != null) {
            this.i = null;
        }
        this.c.a();
    }

    @Override // sg.bigo.ads.M0.c
    public final void setBlurStyle(b bVar) {
        a aVar = this.d;
        if ((bVar == null && aVar.c == null) || bVar == aVar.c) {
            return;
        }
        aVar.c = bVar;
        aVar.invalidateSelf();
        this.j = 0L;
        b();
    }

    public final void a() {
        if (!(this.f instanceof ViewGroup) || this.l == this.m.size()) {
            return;
        }
        this.l = 0;
        this.m.clear();
        ViewGroup viewGroup = (ViewGroup) this.f;
        e eVar = new e(this);
        if (viewGroup != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(viewGroup);
            while (!linkedList.isEmpty()) {
                ViewGroup viewGroup2 = (ViewGroup) linkedList.poll();
                for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                    View childAt = viewGroup2.getChildAt(i);
                    eVar.a(childAt);
                    if (childAt instanceof ViewGroup) {
                        linkedList.add((ViewGroup) childAt);
                    }
                }
            }
        }
    }
}
