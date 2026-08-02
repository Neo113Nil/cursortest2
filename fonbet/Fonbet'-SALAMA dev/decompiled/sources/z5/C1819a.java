package z5;

import A5.y;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import l.C1373k;
import w1.C1722m0;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1819a {

    /* renamed from: a, reason: collision with root package name */
    public final A5.s f18458a;

    public C1819a(C1373k c1373k, int i7) {
        switch (i7) {
            case 1:
                C1822d c1822d = new C1822d();
                A5.s sVar = new A5.s(c1373k, "flutter/navigation", A5.m.f675a, null);
                this.f18458a = sVar;
                sVar.b(c1822d);
                break;
            default:
                C1722m0 c1722m0 = new C1722m0(29);
                A5.s sVar2 = new A5.s(c1373k, "flutter/backgesture", y.f688b, null);
                this.f18458a = sVar2;
                sVar2.b(c1722m0);
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
