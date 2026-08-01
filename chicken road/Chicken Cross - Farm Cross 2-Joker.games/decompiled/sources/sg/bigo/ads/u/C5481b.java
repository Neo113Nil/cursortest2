package sg.bigo.ads.u;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.E0.p;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.h.T;
import sg.bigo.ads.v.u;

/* renamed from: sg.bigo.ads.u.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5481b {

    /* renamed from: a, reason: collision with root package name */
    public final T f13326a;
    public final ViewGroup b;
    public final ViewFlow e;
    public final int f;
    public int c = -1;
    public int d = -1;
    public boolean g = true;

    public C5481b(ViewGroup viewGroup, ViewFlow viewFlow, T t, int i) {
        this.b = viewGroup;
        this.e = viewFlow;
        this.f13326a = t;
        this.f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u uVar, float f, int i) {
        Integer num;
        if (i != this.c) {
            return;
        }
        boolean b = uVar.b(this.f);
        int i2 = b ? uVar.i : uVar.j;
        this.d = f > 0.0f ? i - 1 : i + 1;
        View a2 = this.e.a(this.d);
        if (a2 != null) {
            Object tag = a2.getTag(-188383023);
            if (tag instanceof u) {
                u uVar2 = (u) tag;
                num = Integer.valueOf(b ? uVar2.i : uVar2.j);
                int a3 = this.f13326a.a(p.a(Math.abs(f), i2, num != null ? i2 : num.intValue()));
                if (b) {
                    return;
                }
                this.b.setBackgroundColor(a3);
                return;
            }
        }
        num = null;
        int a32 = this.f13326a.a(p.a(Math.abs(f), i2, num != null ? i2 : num.intValue()));
        if (b) {
        }
    }

    public final void a(int i) {
        if (this.g) {
            View a2 = this.e.a(i);
            Object tag = a2.getTag(-188383023);
            if (tag instanceof u) {
                u uVar = (u) tag;
                this.c = i;
                this.d = i;
                if (uVar.b(this.f)) {
                    this.b.setBackgroundColor(this.f13326a.a(uVar.i));
                    return;
                }
                if (uVar.a(this.f)) {
                    this.f13326a.a(uVar.j);
                    Bitmap bitmap = uVar.k;
                    int i2 = uVar.l;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(a2.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i2);
                    ViewGroup viewGroup = this.b;
                    if (bitmap == null) {
                        bitmapDrawable = null;
                    }
                    a(viewGroup, "adview_background_main_tag", bitmapDrawable);
                    a(viewGroup, "adview_background_second_tag", (BitmapDrawable) null);
                }
            }
        }
    }

    public static void a(ViewGroup viewGroup, String str, BitmapDrawable bitmapDrawable) {
        ImageView imageView;
        View findViewWithTag = viewGroup.findViewWithTag(str);
        if (findViewWithTag instanceof ImageView) {
            imageView = (ImageView) findViewWithTag;
        } else {
            Context context = viewGroup.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag(str);
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                X.a(imageView2, viewGroup, null, 0);
                imageView = imageView2;
            } else {
                imageView = null;
            }
        }
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(bitmapDrawable);
        }
    }
}
