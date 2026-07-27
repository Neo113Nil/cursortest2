package com.vungle.ads.internal.network;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class a0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context) {
        super(0);
        this.f12039a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ServiceLocator.d.a(this.f12039a).getService(com.vungle.ads.internal.signals.j.class);
    }
}
