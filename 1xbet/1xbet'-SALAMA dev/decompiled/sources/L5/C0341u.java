package L5;

import android.content.Context;
import p155w1.C1009l0;

/* JADX INFO: renamed from: L5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0341u extends C0343w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f4507e;

    public C0341u(C1009l0 c1009l0, Context context, int i7, Integer num, Integer num2) {
        p167y2.j jVar;
        p167y2.j jVar2;
        if (num != null) {
            if (num.intValue() == 0) {
                p167y2.j jVar3 = p167y2.j.f18161i;
                int iF = J2.d.f(1, context);
                jVar2 = new p167y2.j(i7, 0);
                if (iF == -1) {
                    jVar2 = p167y2.j.f18168q;
                } else {
                    jVar2.f18175f = iF;
                    jVar2.f18174e = true;
                }
            } else {
                p167y2.j jVar4 = p167y2.j.f18161i;
                int iF2 = J2.d.f(2, context);
                jVar2 = new p167y2.j(i7, 0);
                if (iF2 == -1) {
                    jVar = p167y2.j.f18168q;
                    jVar2 = jVar;
                } else {
                    jVar2.f18175f = iF2;
                    jVar2.f18174e = true;
                }
            }
        } else if (num2 != null) {
            int iIntValue = num2.intValue();
            jVar2 = new p167y2.j(i7, 0);
            jVar2.f18175f = iIntValue;
            jVar2.f18174e = true;
            if (iIntValue < 32) {
                J2.j.g("The maximum height set for the inline adaptive ad size was " + iIntValue + " dp, which is below the minimum recommended value of 32 dp.");
            }
        } else {
            p167y2.j jVar5 = p167y2.j.f18161i;
            int iF3 = J2.d.f(0, context);
            if (iF3 == -1) {
                jVar = p167y2.j.f18168q;
            } else {
                jVar = new p167y2.j(i7, 0);
                jVar.f18175f = iF3;
                jVar.f18174e = true;
            }
            jVar2 = jVar;
        }
        super(jVar2);
        this.f4506d = num;
        this.f4507e = num2;
    }
}
