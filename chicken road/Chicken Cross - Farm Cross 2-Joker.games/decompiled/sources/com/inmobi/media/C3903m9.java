package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: com.inmobi.media.m9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3903m9 implements InterfaceC3571ah {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3931n9 f7243a;

    public C3903m9(C3931n9 c3931n9) {
        this.f7243a = c3931n9;
    }

    @Override // com.inmobi.media.InterfaceC3571ah
    public final Object a(C3628ch c3628ch, C3740gh c3740gh) {
        WeakReference weakReference = (WeakReference) this.f7243a.b.get(c3628ch.f7049a.h);
        InterfaceC3968oh interfaceC3968oh = weakReference != null ? (InterfaceC3968oh) weakReference.get() : null;
        if (!AbstractC3824jh.a(c3628ch)) {
            Object a2 = this.f7243a.a(c3628ch, interfaceC3968oh, c3740gh);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
        }
        C3931n9 c3931n9 = this.f7243a;
        c3931n9.getClass();
        AbstractC4080sh.b(c3628ch, interfaceC3968oh);
        Object a3 = c3931n9.f7376a.f6585a.a("pings", "id=?", new String[]{c3628ch.f7049a.b}, c3740gh);
        if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a3 = Unit.INSTANCE;
        }
        if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a3 = Unit.INSTANCE;
        }
        return a3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : Unit.INSTANCE;
    }
}
