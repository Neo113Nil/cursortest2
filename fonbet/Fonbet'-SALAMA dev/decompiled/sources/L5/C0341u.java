package L5;

import android.content.Context;
import w1.C1718l0;

/* renamed from: L5.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0341u extends C0343w {

    /* renamed from: d, reason: collision with root package name */
    public final Integer f4506d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f4507e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0341u(C1718l0 c1718l0, Context context, int i7, Integer num, Integer num2) {
        super(r2);
        y2.j jVar;
        y2.j jVar2;
        if (num != null) {
            if (num.intValue() == 0) {
                y2.j jVar3 = y2.j.f18155i;
                int f7 = J2.d.f(1, context);
                jVar2 = new y2.j(i7, 0);
                if (f7 == -1) {
                    jVar2 = y2.j.f18162q;
                } else {
                    jVar2.f18169f = f7;
                    jVar2.f18168e = true;
                }
            } else {
                y2.j jVar4 = y2.j.f18155i;
                int f8 = J2.d.f(2, context);
                jVar2 = new y2.j(i7, 0);
                if (f8 == -1) {
                    jVar = y2.j.f18162q;
                    jVar2 = jVar;
                } else {
                    jVar2.f18169f = f8;
                    jVar2.f18168e = true;
                }
            }
        } else if (num2 != null) {
            int intValue = num2.intValue();
            jVar2 = new y2.j(i7, 0);
            jVar2.f18169f = intValue;
            jVar2.f18168e = true;
            if (intValue < 32) {
                J2.j.g("The maximum height set for the inline adaptive ad size was " + intValue + " dp, which is below the minimum recommended value of 32 dp.");
            }
        } else {
            y2.j jVar5 = y2.j.f18155i;
            int f9 = J2.d.f(0, context);
            if (f9 == -1) {
                jVar = y2.j.f18162q;
            } else {
                jVar = new y2.j(i7, 0);
                jVar.f18169f = f9;
                jVar.f18168e = true;
            }
            jVar2 = jVar;
        }
        this.f4506d = num;
        this.f4507e = num2;
    }
}
