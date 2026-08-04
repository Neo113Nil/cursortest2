package p174z5;

import A5.m;
import A5.s;
import A5.y;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import p078l.k;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f18464a;

    public a(k kVar, int i7) {
        switch (i7) {
            case 1:
                d dVar = new d();
                s sVar = new s(kVar, "flutter/navigation", m.f675a, null);
                this.f18464a = sVar;
                sVar.b(dVar);
                break;
            default:
                C1013m0 c1013m0 = new C1013m0(29);
                s sVar2 = new s(kVar, "flutter/backgesture", y.f688b, null);
                this.f18464a = sVar2;
                sVar2.b(c1013m0);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }
}
