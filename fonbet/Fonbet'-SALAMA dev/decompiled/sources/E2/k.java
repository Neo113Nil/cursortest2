package E2;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.gms.internal.ads.zzauo;

/* loaded from: classes.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1939b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f1938a = i7;
        this.f1939b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        switch (this.f1938a) {
            case 0:
                zzauo zzauoVar = ((n) this.f1939b).f1950y;
                if (zzauoVar != null) {
                    zzauoVar.zzd(motionEvent);
                    break;
                }
                break;
            default:
                int action = motionEvent.getAction();
                int x4 = (int) motionEvent.getX();
                int y4 = (int) motionEvent.getY();
                ListPopupWindow listPopupWindow = (ListPopupWindow) this.f1939b;
                if (action == 0 && (popupWindow = listPopupWindow.f8397P) != null && popupWindow.isShowing() && x4 >= 0 && x4 < listPopupWindow.f8397P.getWidth() && y4 >= 0 && y4 < listPopupWindow.f8397P.getHeight()) {
                    listPopupWindow.f8393L.postDelayed(listPopupWindow.f8389H, 250L);
                    break;
                } else if (action == 1) {
                    listPopupWindow.f8393L.removeCallbacks(listPopupWindow.f8389H);
                    break;
                }
                break;
        }
        return false;
    }
}
