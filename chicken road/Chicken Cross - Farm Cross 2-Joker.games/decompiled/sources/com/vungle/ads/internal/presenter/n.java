package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.network.VungleApiClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12096a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(0);
        this.f12096a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ServiceLocator.d.a(this.f12096a).getService(VungleApiClient.class);
    }
}
