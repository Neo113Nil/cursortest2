package com.startapp.sdk.internal;

import android.widget.ImageButton;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.Map;

/* loaded from: classes.dex */
public class tc extends v1 {
    final /* synthetic */ uc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(uc ucVar, u1 u1Var) {
        super(u1Var);
        this.this$0 = ucVar;
    }

    @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
    public void close() {
        uc ucVar = this.this$0;
        MraidState mraidState = MraidState.HIDDEN;
        ucVar.f4464b = mraidState;
        si.a(ucVar.f4463a.f4595t, true, "mraid.fireStateChangeEvent", mraidState.toString());
        la laVar = this.this$0.f4463a.f4592H;
        laVar.f3985a.i();
        laVar.f3985a.b();
    }

    public void fireViewableChangeEvent() {
        xf xfVar;
        uc ucVar = this.this$0;
        si.a(ucVar.f4463a.f4595t, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(ucVar.f4471j));
        uc ucVar2 = this.this$0;
        if (!ucVar2.f4471j || (xfVar = ucVar2.f4463a.f4599x) == null) {
            return;
        }
        xfVar.b();
    }

    @Override // com.startapp.sdk.internal.v1
    public boolean isFeatureSupported(String str) {
        uc ucVar = this.this$0;
        if (ucVar.f4466d == null) {
            ucVar.f4466d = new wc(ucVar.f4463a.f4423a);
        }
        return ucVar.f4466d.f4608b.contains(str);
    }

    @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
    public void setOrientationProperties(Map<String, String> map) {
        boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
        String str = map.get("forceOrientation");
        uc ucVar = this.this$0;
        if (ucVar.f4467e == null) {
            ucVar.f4467e = new xc();
        }
        xc xcVar = ucVar.f4467e;
        if (xcVar.f4631a == parseBoolean) {
            int i3 = xcVar.f4632b;
            int indexOf = xc.f4630c.indexOf(str);
            if (indexOf == -1) {
                indexOf = 2;
            }
            if (i3 == indexOf) {
                return;
            }
        }
        xcVar.f4631a = parseBoolean;
        int indexOf2 = xc.f4630c.indexOf(str);
        xcVar.f4632b = indexOf2 != -1 ? indexOf2 : 2;
        applyOrientationProperties(this.this$0.f4463a.f4423a, xcVar);
    }

    @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
    public void useCustomClose(String str) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        uc ucVar = this.this$0;
        if (ucVar.f4470i != parseBoolean) {
            ucVar.f4470i = parseBoolean;
            if (!parseBoolean) {
                ucVar.f4463a.t();
                return;
            }
            wa waVar = ucVar.f4463a;
            waVar.getClass();
            try {
                ImageButton imageButton = waVar.f4597v;
                if (imageButton != null) {
                    imageButton.setVisibility(4);
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
    }
}
