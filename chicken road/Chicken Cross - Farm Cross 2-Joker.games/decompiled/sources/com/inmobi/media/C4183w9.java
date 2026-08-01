package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4183w9 extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4210x9 f7454a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4183w9(Hg hg, C4210x9 c4210x9) {
        super(hg);
        this.f7454a = c4210x9;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Hg hg = (Hg) obj2;
        if (Ig.a((Hg) obj) == Ig.a(hg)) {
            return;
        }
        Iterator it = this.f7454a.b.iterator();
        while (it.hasNext()) {
            ((Kg) it.next()).a(hg);
        }
    }
}
