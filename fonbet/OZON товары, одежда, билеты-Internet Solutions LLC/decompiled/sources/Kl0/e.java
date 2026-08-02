package Kl0;

import Sc.r;
import Sc.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends AbstractC7737t implements Function1<Exception, r<? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    public static final e f16013b = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final r<? extends String> invoke(Exception exc) {
        Exception it = exc;
        Intrinsics.checkNotNullParameter(it, "it");
        r.Companion companion = r.INSTANCE;
        return r.a(s.a(it));
    }
}
