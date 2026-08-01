package sg.bigo.ads.C;

import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.MediaView;

/* loaded from: classes3.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f12225a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ sg.bigo.ads.d1.u e;

    public c(int[] iArr, View view, View view2, int i, sg.bigo.ads.d1.u uVar) {
        this.f12225a = iArr;
        this.b = view;
        this.c = view2;
        this.d = i;
        this.e = uVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (view instanceof MediaView) {
                ((MediaView) view).getViewImpl().a(x, y);
                f.f12227a = ((Integer) view.getTag()).intValue();
            }
            int[] iArr = this.f12225a;
            iArr[0] = x;
            iArr[1] = y;
        }
        if (actionMasked == 1) {
            boolean z = view instanceof MediaView;
            if (!(z ? ((MediaView) view).getViewImpl().a(x, y) : X.b(x, y, view))) {
                return false;
            }
            if (z) {
                view.setTag(Integer.valueOf(f.f12227a));
            }
            Objects.toString(this.b.getTag());
            View view2 = this.c;
            View view3 = this.b;
            int[] iArr2 = this.f12225a;
            f.a(view2, view, view3, x, y, iArr2[0], iArr2[1], this.d, this.e, null);
        }
        return true;
    }
}
