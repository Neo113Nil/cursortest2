package Ve;

import R2.C3909c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Uq extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Uq f30146b = new Uq(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3909c it = (C3909c) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Lm0.a.f17149a.e("DataStore corruptionHandler catch error " + it, new Object[0]);
        return W2.g.a();
    }
}
