package com.inmobi.media;

/* renamed from: com.inmobi.media.g2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2422g2 implements com.inmobi.media.C2 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f5209a;

    public AbstractC2422g2(kotlin.jvm.functions.Function0 predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f5209a = predicate;
    }

    public final void a(com.inmobi.media.D2 beaconExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        if (((java.lang.Boolean) this.f5209a.invoke()).booleanValue()) {
            java.util.Objects.toString(beaconExtras);
            b(beaconExtras);
        }
    }

    public abstract void b(com.inmobi.media.D2 d2);
}
