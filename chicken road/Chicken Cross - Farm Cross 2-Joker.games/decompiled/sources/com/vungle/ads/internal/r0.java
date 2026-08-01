package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class r0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12112a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context) {
        super(0);
        this.f12112a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ServiceLocator.d.a(this.f12112a).getService(VungleApiClient.class);
    }
}
