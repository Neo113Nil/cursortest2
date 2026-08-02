package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.id.ad.AdManager;

/* renamed from: Kb0.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3454f extends AbstractC7737t implements Function0<AdManager> {
    @Override // kotlin.jvm.functions.Function0
    public final AdManager invoke() {
        Fb0.h.c();
        K k11 = Tb0.a.f26975d;
        if (k11 != null) {
            return k11.l().j().getValue();
        }
        throw new Lb0.a();
    }
}
