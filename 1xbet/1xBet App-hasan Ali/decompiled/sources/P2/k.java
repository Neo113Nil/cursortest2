package P2;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.Q4;
import n.AbstractC2131e0;
import n.C2149t;

/* loaded from: classes.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4753k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4754l;

    public /* synthetic */ k(int i, Object obj) {
        this.f4753k = i;
        this.f4754l = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2149t c2149t;
        switch (this.f4753k) {
            case 0:
                Q4 q42 = ((n) this.f4754l).f4765r;
                if (q42 != null) {
                    q42.f11167b.a(motionEvent);
                    break;
                }
                break;
            default:
                int action = motionEvent.getAction();
                int x5 = (int) motionEvent.getX();
                int y5 = (int) motionEvent.getY();
                AbstractC2131e0 abstractC2131e0 = (AbstractC2131e0) this.f4754l;
                if (action == 0 && (c2149t = abstractC2131e0.f18227F) != null && c2149t.isShowing() && x5 >= 0 && x5 < abstractC2131e0.f18227F.getWidth() && y5 >= 0 && y5 < abstractC2131e0.f18227F.getHeight()) {
                    abstractC2131e0.f18223B.postDelayed(abstractC2131e0.f18241x, 250L);
                    break;
                } else if (action == 1) {
                    abstractC2131e0.f18223B.removeCallbacks(abstractC2131e0.f18241x);
                    break;
                }
                break;
        }
        return false;
    }
}
