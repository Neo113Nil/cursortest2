package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.IconCreator;
import com.goldenboot.saga.zone.TextValidator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class HeaderEmitter extends ItemMeter {
    public final TextValidator connectJob;
    public final LayoutSynthesizer peekRevision;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderEmitter(final String name, final int i) {
        super(name, null, i, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.connectJob = TextValidator.BounceHandler.evictLayout;
        this.peekRevision = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.TapFactory
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                ScaleMutator[] gatherAdapter;
                gatherAdapter = HeaderEmitter.gatherAdapter(i, name, this);
                return gatherAdapter;
            }
        });
    }

    public static final ScaleMutator[] gatherAdapter(int i, String str, HeaderEmitter headerEmitter) {
        ScaleMutator[] scaleMutatorArr = new ScaleMutator[i];
        for (int i2 = 0; i2 < i; i2++) {
            scaleMutatorArr[i2] = StyleShaper.injectMetric(str + '.' + headerEmitter.releaseHeader(i2), IconCreator.FeedbackFlow.evictLayout, new ScaleMutator[0], null, 8, null);
        }
        return scaleMutatorArr;
    }

    @Override // com.goldenboot.saga.zone.ItemMeter, com.goldenboot.saga.zone.ScaleMutator
    public ScaleMutator clipOrigin(int i) {
        return decodePath()[i];
    }

    public final ScaleMutator[] decodePath() {
        return (ScaleMutator[]) this.peekRevision.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ScaleMutator)) {
            return false;
        }
        ScaleMutator scaleMutator = (ScaleMutator) obj;
        return scaleMutator.injectMetric() == TextValidator.BounceHandler.evictLayout && Intrinsics.areEqual(evictLayout(), scaleMutator.evictLayout()) && Intrinsics.areEqual(ScopeDrain.evictLayout(this), ScopeDrain.evictLayout(scaleMutator));
    }

    @Override // com.goldenboot.saga.zone.ItemMeter
    public int hashCode() {
        int hashCode = evictLayout().hashCode();
        int i = 1;
        for (String str : MotionSet.growPayload(this)) {
            int i2 = i * 31;
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // com.goldenboot.saga.zone.ItemMeter, com.goldenboot.saga.zone.ScaleMutator
    public TextValidator injectMetric() {
        return this.connectJob;
    }

    @Override // com.goldenboot.saga.zone.ItemMeter
    public String toString() {
        return CursorCollector.computeTarget(MotionSet.growPayload(this), ", ", evictLayout() + '(', ")", 0, null, null, 56, null);
    }
}
