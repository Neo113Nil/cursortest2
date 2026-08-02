package Ml0;

import Sc.r;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.masterhost.MasterHost;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends AbstractC7737t implements Function2<AidlResult<?>, Za.a, r<? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    public static final c f18163b = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final r<? extends String> invoke(AidlResult<?> aidlResult, Za.a aVar) {
        AidlResult<?> result = aidlResult;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
        Object b11 = result.b();
        Intrinsics.g(b11, "null cannot be cast to non-null type com.vk.push.core.masterhost.MasterHost");
        r.Companion companion = r.INSTANCE;
        return r.a(((MasterHost) b11).getF60710a());
    }
}
