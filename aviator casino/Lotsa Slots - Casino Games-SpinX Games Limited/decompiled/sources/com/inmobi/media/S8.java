package com.inmobi.media;

/* loaded from: classes5.dex */
public final class S8 extends kotlin.properties.ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.T8 f4951a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S8(com.inmobi.media.Lf lf, com.inmobi.media.T8 t8) {
        super(lf);
        this.f4951a = t8;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(kotlin.reflect.KProperty property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
        com.inmobi.media.Lf lf = (com.inmobi.media.Lf) obj2;
        if (com.inmobi.media.Mf.a((com.inmobi.media.Lf) obj) == com.inmobi.media.Mf.a(lf)) {
            return;
        }
        java.util.Iterator it = this.f4951a.b.iterator();
        while (it.hasNext()) {
            ((com.inmobi.media.Of) it.next()).a(lf);
        }
    }
}
