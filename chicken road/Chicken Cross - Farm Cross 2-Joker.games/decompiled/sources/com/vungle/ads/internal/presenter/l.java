package com.vungle.ads.internal.presenter;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12094a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2) {
        super(0);
        this.f12094a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return com.iab.omid.library.vungle.internal.l.a("Blocked sub-frame MRAID command: ").append(this.f12094a).append(' ').append(this.b).toString();
    }
}
