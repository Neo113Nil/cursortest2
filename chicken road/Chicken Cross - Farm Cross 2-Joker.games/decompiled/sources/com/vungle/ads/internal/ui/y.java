package com.vungle.ads.internal.ui;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12175a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str) {
        super(0);
        this.f12175a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return com.iab.omid.library.vungle.internal.l.a("Requested range exceeds cached file: ").append(this.f12175a).toString();
    }
}
