package com.vungle.ads.internal.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f12077a = new d();

    public d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCause();
    }
}
