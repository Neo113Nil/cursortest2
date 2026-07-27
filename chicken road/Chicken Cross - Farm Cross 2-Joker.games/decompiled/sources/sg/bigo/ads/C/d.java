package sg.bigo.ads.C;

import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.MediaView;

/* loaded from: classes3.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f12226a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ e e;
    public final /* synthetic */ View f;
    public final /* synthetic */ int g;
    public final /* synthetic */ sg.bigo.ads.d1.u h;

    public d(int[] iArr, boolean[] zArr, View view, int i, e eVar, View view2, int i2, sg.bigo.ads.d1.u uVar) {
        this.f12226a = iArr;
        this.b = zArr;
        this.c = view;
        this.d = i;
        this.e = eVar;
        this.f = view2;
        this.g = i2;
        this.h = uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        if (r13 != false) goto L34;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int[] iArr = this.f12226a;
            iArr[0] = x;
            iArr[1] = y;
            this.b[0] = true;
            if (view instanceof MediaView) {
                ((MediaView) view).getViewImpl().a(x, y);
                f.f12227a = ((Integer) view.getTag()).intValue();
            }
        } else if (actionMasked == 2) {
            View view2 = this.c;
            int i = this.d;
            int i2 = -i;
            if (x < i2 || y < i2 || x >= (view2.getRight() - view2.getLeft()) + i || y >= (view2.getBottom() - view2.getTop()) + i) {
                this.b[0] = false;
            }
        } else if (actionMasked == 1) {
            if (this.b[0]) {
                if (Math.abs(x - this.f12226a[0]) >= this.d || Math.abs(y - this.f12226a[1]) >= this.d) {
                    e eVar = this.e;
                    z = eVar != null && eVar.a();
                } else {
                    z = false;
                }
                boolean z2 = view instanceof MediaView;
                if (!(z2 ? ((MediaView) view).getViewImpl().a(x, y) : X.b(x, y, view))) {
                    return false;
                }
                if (z2) {
                    view.setTag(Integer.valueOf(f.f12227a));
                }
                Object tag = (!z || this.e == null) ? this.c.getTag() : 30;
                Objects.toString(tag);
                View view3 = this.f;
                View view4 = this.c;
                int[] iArr2 = this.f12226a;
                f.a(view3, view, view4, x, y, iArr2[0], iArr2[1], this.g, this.h, tag);
            }
        } else if (actionMasked == 3) {
            this.b[0] = false;
        }
        return true;
    }
}
