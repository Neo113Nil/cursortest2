package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.network.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(0);
        this.f11937a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ServiceLocator.d.a(this.f11937a).getService(r.class);
    }
}
