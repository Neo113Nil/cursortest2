package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1537rw extends AbstractRunnableC1627tw {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1627tw
    public final Object s(Object obj, Object obj2) {
        InterfaceC1897zw interfaceC1897zw = (InterfaceC1897zw) obj;
        E3.a k5 = interfaceC1897zw.k(obj2);
        if (k5 != null) {
            return k5;
        }
        throw new NullPointerException(AbstractC0952et.F("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1897zw));
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1627tw
    public final /* synthetic */ void t(Object obj) {
        l((E3.a) obj);
    }
}
