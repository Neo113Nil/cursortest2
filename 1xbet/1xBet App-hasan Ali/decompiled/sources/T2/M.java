package T2;

import Q2.C0379q;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.F7;

/* loaded from: classes.dex */
public class M extends Q1.j {
    @Override // Q1.j
    public final boolean j(Activity activity, Configuration configuration) {
        boolean isInMultiWindowMode;
        A7 a7 = F7.f8687F4;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            return false;
        }
        A7 a72 = F7.f8699H4;
        D7 d7 = rVar.f5056c;
        if (((Boolean) d7.a(a72)).booleanValue()) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        U2.e eVar = C0379q.f.f5048a;
        int l5 = U2.e.l(activity, configuration.screenHeightDp);
        int i = U2.e.i(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        L l6 = P2.o.f4767B.f4771c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i5 = displayMetrics.heightPixels;
        int i6 = displayMetrics.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int intValue = ((Integer) d7.a(F7.f8676D4)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        return !(Math.abs(i5 - (l5 + dimensionPixelSize)) <= intValue) || Math.abs(i6 - i) > intValue;
    }
}
