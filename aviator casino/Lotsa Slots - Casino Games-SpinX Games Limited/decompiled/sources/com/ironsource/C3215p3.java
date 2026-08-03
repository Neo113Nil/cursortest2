package com.ironsource;

/* renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3215p3<Smash extends com.ironsource.AbstractC3107j3<?>> extends com.ironsource.Wg<Smash> {
    private boolean h;

    public /* synthetic */ C3215p3(int i, boolean z, java.util.List list, boolean z2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, list, (i2 & 8) != 0 ? false : z2);
    }

    @Override // com.ironsource.Wg
    public void c(Smash smash) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.w()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.h = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        com.ironsource.mediationsdk.utils.IronSourceUtils.i(str);
    }

    @Override // com.ironsource.Wg
    public boolean e() {
        return super.e() || this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3215p3(int i, boolean z, java.util.List<? extends Smash> waterfall, boolean z2) {
        super(i, z, waterfall);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.h = z2;
    }
}
