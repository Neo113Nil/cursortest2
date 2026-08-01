package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4254z {

    /* renamed from: a, reason: collision with root package name */
    public final C4227y f7514a;

    public AbstractC4254z(C4227y adComponent) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f7514a = adComponent;
    }

    public final CoroutineScope k() {
        return this.f7514a.f7489a.e;
    }

    public final Y9 l() {
        return this.f7514a.f7489a.c;
    }
}
