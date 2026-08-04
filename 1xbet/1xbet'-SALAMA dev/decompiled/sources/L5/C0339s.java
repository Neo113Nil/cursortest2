package L5;

import android.content.Context;
import p155w1.C1009l0;

/* JADX INFO: renamed from: L5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0339s extends C0343w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4505d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0339s(Context context, C1009l0 c1009l0, String str, int i7) {
        p167y2.j jVarH;
        if (str == null) {
            p167y2.j jVar = p167y2.j.f18161i;
            jVarH = J2.d.h(i7, context, 0);
            jVarH.f18173d = true;
        } else if (str.equals("portrait")) {
            p167y2.j jVar2 = p167y2.j.f18161i;
            jVarH = J2.d.h(i7, context, 1);
            jVarH.f18173d = true;
        } else {
            if (!str.equals("landscape")) {
                throw new IllegalArgumentException("Unexpected value for orientation: ".concat(str));
            }
            p167y2.j jVar3 = p167y2.j.f18161i;
            jVarH = J2.d.h(i7, context, 2);
            jVarH.f18173d = true;
        }
        super(jVarH);
        this.f4505d = str;
    }
}
