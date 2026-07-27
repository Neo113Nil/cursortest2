package com.vungle.ads.internal;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class p2 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f12073a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(v2 v2Var, Context context) {
        super(1);
        this.f12073a = v2Var;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            ConfigManager.INSTANCE.getClass();
            ConfigManager.c();
        }
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("VungleInitializer", "Config fetch result: " + booleanValue);
        if (booleanValue && this.f12073a.f12196a.get()) {
            v2 v2Var = this.f12073a;
            Context context = this.b;
            v2Var.getClass();
            v2.a(context);
        }
        return Unit.INSTANCE;
    }
}
