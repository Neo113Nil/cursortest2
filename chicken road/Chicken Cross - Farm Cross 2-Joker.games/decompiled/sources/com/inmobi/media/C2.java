package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class C2 implements Y2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f6486a;

    public C2(Function0 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f6486a = predicate;
    }

    public final void a(Z2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        if (((Boolean) this.f6486a.invoke()).booleanValue()) {
            String str = "Firing beacon with extras: " + beaconExtras;
            b(beaconExtras);
        }
    }

    public abstract void b(Z2 z2);
}
