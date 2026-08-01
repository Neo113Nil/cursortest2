package com.inmobi.media;

import com.facebook.login.LoginLogger;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class O5 implements InterfaceC3571ah {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q5 f6756a;

    public O5(Q5 q5) {
        this.f6756a = q5;
    }

    @Override // com.inmobi.media.InterfaceC3571ah
    public final Object a(C3628ch c3628ch, C3740gh c3740gh) {
        Intrinsics.checkNotNullExpressionValue("Q5", "access$getTAG$cp(...)");
        String str = "Ping execution completed for ping ID " + c3628ch.f7049a.b + " with status " + (AbstractC3824jh.a(c3628ch) ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE);
        WeakReference weakReference = (WeakReference) this.f6756a.b.get(c3628ch.f7049a.h);
        InterfaceC3968oh interfaceC3968oh = weakReference != null ? (InterfaceC3968oh) weakReference.get() : null;
        if (!AbstractC3824jh.a(c3628ch)) {
            Object a2 = this.f6756a.a(c3628ch, interfaceC3968oh, c3740gh);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
        }
        Q5 q5 = this.f6756a;
        q5.getClass();
        AbstractC4080sh.b(c3628ch, interfaceC3968oh);
        Object a3 = q5.f7376a.f6585a.a("pings", "id=?", new String[]{c3628ch.f7049a.b}, c3740gh);
        if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a3 = Unit.INSTANCE;
        }
        if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a3 = Unit.INSTANCE;
        }
        return a3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : Unit.INSTANCE;
    }
}
