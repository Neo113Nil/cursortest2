package O;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final E.b f283a;

    public b(H.b bVar, int i2) {
        switch (i2) {
            case 1:
                C.b bVar2 = new C.b(10);
                E.b bVar3 = new E.b(bVar, "flutter/navigation", P.h.f365b);
                this.f283a = bVar3;
                bVar3.h(bVar2);
                break;
            default:
                C.b bVar4 = new C.b(7);
                E.b bVar5 = new E.b(bVar, "flutter/backgesture", P.n.f369a);
                this.f283a = bVar5;
                bVar5.h(bVar4);
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
