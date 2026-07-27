package com.ironsource;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.i6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4458i6 implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f8243a;

    public C4458i6(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f8243a = activity;
    }

    @Override // com.ironsource.K
    public void a(C4422g6 fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.f8243a);
    }
}
