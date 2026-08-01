package com.vungle.ads.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class k1 extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f11930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(o1 o1Var) {
        super(2);
        this.f11930a = o1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        if (intValue > 0 && intValue2 > 0) {
            this.f11930a.x = intValue / intValue2;
        }
        return Unit.INSTANCE;
    }
}
