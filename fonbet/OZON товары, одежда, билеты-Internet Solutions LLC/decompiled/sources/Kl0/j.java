package Kl0;

import Sc.r;
import Sc.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends AbstractC7737t implements Function1<Exception, r<? extends Boolean>> {

    /* renamed from: b, reason: collision with root package name */
    public static final j f16020b = new j(1);

    @Override // kotlin.jvm.functions.Function1
    public final r<? extends Boolean> invoke(Exception exc) {
        Exception it = exc;
        Intrinsics.checkNotNullParameter(it, "it");
        r.Companion companion = r.INSTANCE;
        return r.a(s.a(it));
    }
}
