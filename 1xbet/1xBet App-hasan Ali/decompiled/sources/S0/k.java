package S0;

import K0.r;
import K0.t;
import android.text.TextPaint;
import i0.F;
import i0.I;
import i0.InterfaceC2009n;
import java.util.ArrayList;
import k0.AbstractC2024d;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final l f5280a = new l(false);

    public static final void a(r rVar, InterfaceC2009n interfaceC2009n, F f, float f5, I i, V0.l lVar, AbstractC2024d abstractC2024d) {
        ArrayList arrayList = rVar.f2859h;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            t tVar = (t) arrayList.get(i5);
            tVar.f2862a.g(interfaceC2009n, f, f5, i, lVar, abstractC2024d);
            interfaceC2009n.g(0.0f, tVar.f2862a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255));
    }
}
