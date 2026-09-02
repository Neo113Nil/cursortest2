package C0;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import u0.C0840b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final t f57a;

    public d(C0840b c0840b, int i2) {
        switch (i2) {
            case 1:
                N.i iVar = new N.i(3);
                t tVar = new t(c0840b, "flutter/navigation", D0.h.f166b, null);
                this.f57a = tVar;
                tVar.j(iVar);
                break;
            default:
                N.i iVar2 = new N.i(1);
                t tVar2 = new t(c0840b, "flutter/backgesture", D0.n.f167b, null);
                this.f57a = tVar2;
                tVar2.j(iVar2);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
