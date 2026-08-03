package com.ironsource;

/* renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3370xf extends com.ironsource.G4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3370xf(com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.Jg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    private final int b(com.ironsource.B b) {
        return b.h().l();
    }

    @Override // com.ironsource.H
    protected boolean a(com.ironsource.B instance, com.ironsource.Jg waterfallInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }

    private final int a(com.ironsource.Jg jg) {
        java.lang.Integer num;
        java.util.List<com.ironsource.B> b = jg.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : b) {
            if (((com.ironsource.B) obj).x()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(b((com.ironsource.B) it.next()));
            while (it.hasNext()) {
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(b((com.ironsource.B) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
