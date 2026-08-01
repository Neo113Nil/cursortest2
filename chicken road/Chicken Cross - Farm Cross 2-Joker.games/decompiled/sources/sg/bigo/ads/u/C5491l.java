package sg.bigo.ads.u;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import sg.bigo.ads.L0.A;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.v.u;

/* renamed from: sg.bigo.ads.u.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5491l implements A {

    /* renamed from: a, reason: collision with root package name */
    public final int f13332a;
    public final Indicator b;
    public final C5481b c;
    public ValueCallback d;
    public boolean e = false;
    public int f;

    public C5491l(int i, Indicator indicator, C5481b c5481b) {
        this.f13332a = i;
        this.b = indicator;
        this.c = c5481b;
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(int i) {
        Indicator indicator = this.b;
        if (indicator == null || i <= 1) {
            return;
        }
        if (indicator.getType() != 1) {
            this.b.setNum(i);
        } else {
            Indicator indicator2 = this.b;
            float f = i - 1;
            indicator2.setLineLength((indicator2.getDistance() * f) + (this.b.getRadius() * 2.0f * f) + this.b.getLengthSelected());
        }
        this.b.setVisibility(0);
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(View view, int i, float f) {
        ValueCallback valueCallback;
        Bitmap bitmap;
        int i2;
        float e = ((f < 0.0f ? 1.0f - AbstractC5488i.e(this.f13332a) : AbstractC5488i.e(this.f13332a) - 1.0f) * f) + 1.0f;
        float d = ((f < 0.0f ? 1.0f - AbstractC5488i.d(this.f13332a) : AbstractC5488i.d(this.f13332a) - 1.0f) * f) + 1.0f;
        if (f < 0.0f) {
            view.setPivotX(view.getWidth());
        } else {
            view.setPivotX(0.0f);
        }
        view.setPivotY(view.getHeight() / 2);
        view.setScaleX(e);
        view.setScaleY(e);
        view.setAlpha(Math.abs(d));
        Indicator indicator = this.b;
        if (indicator != null && indicator.getType() != 1) {
            Indicator indicator2 = this.b;
            if (i == indicator2.k) {
                indicator2.j = (-f) * 2.0f;
                indicator2.invalidate();
            }
        }
        C5481b c5481b = this.c;
        if (c5481b != null && c5481b.g) {
            if (f == 0.0f) {
                c5481b.a(i);
            } else {
                Object tag = c5481b.e.a(i).getTag(-188383023);
                if (tag instanceof u) {
                    u uVar = (u) tag;
                    if (uVar.b(c5481b.f)) {
                        c5481b.a(uVar, f, i);
                    } else if (uVar.a(c5481b.f)) {
                        if (i == c5481b.c) {
                            float max = Math.max(Math.min(Math.abs(f), 1.0f), 0.0f);
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(c5481b.e.getResources(), uVar.k);
                            bitmapDrawable.setAlpha((int) ((1.0f - max) * uVar.l));
                            c5481b.d = f > 0.0f ? i - 1 : i + 1;
                            View a2 = c5481b.e.a(c5481b.d);
                            if (a2 != null) {
                                Object tag2 = a2.getTag(-188383023);
                                if (tag2 instanceof u) {
                                    bitmap = ((u) tag2).k;
                                    i2 = (int) (r2.l * max);
                                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(c5481b.e.getResources(), bitmap);
                                    bitmapDrawable2.setAlpha(i2);
                                    ViewGroup viewGroup = c5481b.b;
                                    C5481b.a(viewGroup, "adview_background_main_tag", bitmapDrawable);
                                    C5481b.a(viewGroup, "adview_background_second_tag", bitmapDrawable2);
                                }
                            }
                            bitmap = null;
                            i2 = 0;
                            BitmapDrawable bitmapDrawable22 = new BitmapDrawable(c5481b.e.getResources(), bitmap);
                            bitmapDrawable22.setAlpha(i2);
                            ViewGroup viewGroup2 = c5481b.b;
                            C5481b.a(viewGroup2, "adview_background_main_tag", bitmapDrawable);
                            C5481b.a(viewGroup2, "adview_background_second_tag", bitmapDrawable22);
                        }
                        c5481b.a(uVar, f, i);
                    }
                }
            }
        }
        this.e = this.f == i && f != 0.0f;
        if (f != 0.0f || (valueCallback = this.d) == null) {
            return;
        }
        valueCallback.onReceiveValue(Integer.valueOf(i));
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(View view, int i) {
        Indicator indicator = this.b;
        if (indicator != null && indicator.getType() != 1) {
            Indicator indicator2 = this.b;
            if (indicator2.k != i) {
                indicator2.k = i;
                indicator2.j = 0.0f;
                indicator2.invalidate();
            }
        }
        this.f = i;
        C5481b c5481b = this.c;
        if (c5481b != null) {
            c5481b.a(i);
        }
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(int i, int i2) {
        Indicator indicator = this.b;
        if (indicator == null || indicator.getType() != 1) {
            return;
        }
        float min = Math.min(1.0f, Math.max(0.0f, (i * 1.0f) / i2));
        Indicator indicator2 = this.b;
        if (indicator2.m != min) {
            indicator2.m = Math.max(0.0f, Math.min(1.0f, min));
            indicator2.invalidate();
        }
    }

    public static void a(ViewFlow viewFlow, ValueCallback valueCallback) {
        if (viewFlow == null || valueCallback == null) {
            return;
        }
        A onItemChangeListener = viewFlow.getOnItemChangeListener();
        if (onItemChangeListener instanceof C5491l) {
            ((C5491l) onItemChangeListener).d = valueCallback;
        }
    }
}
