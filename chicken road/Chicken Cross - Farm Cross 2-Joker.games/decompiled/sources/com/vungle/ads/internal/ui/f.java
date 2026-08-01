package com.vungle.ads.internal.ui;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(0);
        this.f12148a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ServiceLocator.d.a(this.f12148a).getService(com.vungle.ads.internal.platform.f.class);
    }
}
