package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3695f0 {

    /* renamed from: a, reason: collision with root package name */
    public final C4036r1 f7095a;
    public final CoroutineScope b;
    public final AdConfig c;
    public final C3600bi d;
    public final Z9 e;
    public final C3639d0 f;
    public final C3922n0 g;

    public AbstractC3695f0(C4008q1 adManagerComponent) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullExpressionValue(adManagerComponent.b.getApplicationContext(), "getApplicationContext(...)");
        C4036r1 c4036r1 = adManagerComponent.f7316a;
        this.f7095a = c4036r1;
        this.b = adManagerComponent.e;
        this.c = c4036r1.b;
        this.d = c4036r1.f7340a;
        this.e = adManagerComponent.c;
        this.f = adManagerComponent.d;
        this.g = adManagerComponent.f;
    }
}
