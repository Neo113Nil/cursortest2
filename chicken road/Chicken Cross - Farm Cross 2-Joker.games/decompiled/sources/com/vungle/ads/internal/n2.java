package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class n2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12037a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Context context) {
        super(0);
        this.f12037a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ServiceLocator.d.a(this.f12037a).getService(PathProvider.class);
    }
}
