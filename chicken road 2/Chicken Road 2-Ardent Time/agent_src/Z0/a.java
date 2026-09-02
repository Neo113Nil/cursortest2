package Z0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final I0.b f1866a;

    public a(R0.b bVar, int i2) {
        switch (i2) {
            case 1:
                m0.j jVar = new m0.j(27, false);
                I0.b bVar2 = new I0.b(bVar, "flutter/navigation", a1.i.f1948a, 9);
                this.f1866a = bVar2;
                bVar2.M(jVar);
                break;
            default:
                m0.j jVar2 = new m0.j(25, false);
                I0.b bVar3 = new I0.b(bVar, "flutter/backgesture", a1.o.f1949b, 9);
                this.f1866a = bVar3;
                bVar3.M(jVar2);
                break;
        }
    }

    public static java.util.HashMap a(android.window.BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        java.util.HashMap hashMap = new java.util.HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (java.lang.Float.isNaN(touchX) || java.lang.Float.isNaN(touchY)) ? null : java.util.Arrays.asList(java.lang.Float.valueOf(touchX), java.lang.Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", java.lang.Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", java.lang.Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
