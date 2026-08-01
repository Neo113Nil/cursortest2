package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.persistence.FilePreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class m2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11949a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Context context) {
        super(0);
        this.f11949a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ServiceLocator.d.a(this.f11949a).getService(FilePreferences.class);
    }
}
