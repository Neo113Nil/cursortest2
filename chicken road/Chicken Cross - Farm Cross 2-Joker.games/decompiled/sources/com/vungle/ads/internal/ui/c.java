package com.vungle.ads.internal.ui;

import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12145a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i2, Intent intent) {
        super(0);
        this.f12145a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return com.iab.omid.library.vungle.internal.l.a("onActivityResult: ").append(this.f12145a).append(", ").append(this.b).append(", ").append(this.c).toString();
    }
}
