package org.betup.ui.dialogs.compose;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleResultAnimations.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006&"}, d2 = {"Lorg/betup/ui/dialogs/compose/ConfettiParticle;", "", "xRatio", "", "yStart", "speed", RRWebVideoEvent.JsonKeys.SIZE, "hue", "Landroidx/compose/ui/graphics/Color;", TypedValues.CycleType.S_WAVE_PHASE, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(FFFFJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getXRatio", "()F", "getYStart", "getSpeed", "getSize", "getHue-0d7_KjU", "()J", "J", "getPhase", "component1", "component2", "component3", "component4", "component5", "component5-0d7_KjU", "component6", "copy", "copy-jzV_Hc0", "(FFFFJF)Lorg/betup/ui/dialogs/compose/ConfettiParticle;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class ConfettiParticle {
    private final long hue;
    private final float phase;
    private final float size;
    private final float speed;
    private final float xRatio;
    private final float yStart;

    public /* synthetic */ ConfettiParticle(float f, float f2, float f3, float f4, long j, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, f5);
    }

    /* renamed from: copy-jzV_Hc0$default, reason: not valid java name */
    public static /* synthetic */ ConfettiParticle m13300copyjzV_Hc0$default(ConfettiParticle confettiParticle, float f, float f2, float f3, float f4, long j, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = confettiParticle.xRatio;
        }
        if ((i & 2) != 0) {
            f2 = confettiParticle.yStart;
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = confettiParticle.speed;
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = confettiParticle.size;
        }
        float f8 = f4;
        if ((i & 16) != 0) {
            j = confettiParticle.hue;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            f5 = confettiParticle.phase;
        }
        return confettiParticle.m13302copyjzV_Hc0(f, f6, f7, f8, j2, f5);
    }

    /* renamed from: component1, reason: from getter */
    public final float getXRatio() {
        return this.xRatio;
    }

    /* renamed from: component2, reason: from getter */
    public final float getYStart() {
        return this.yStart;
    }

    /* renamed from: component3, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* renamed from: component4, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getHue() {
        return this.hue;
    }

    /* renamed from: component6, reason: from getter */
    public final float getPhase() {
        return this.phase;
    }

    /* renamed from: copy-jzV_Hc0, reason: not valid java name */
    public final ConfettiParticle m13302copyjzV_Hc0(float xRatio, float yStart, float speed, float size, long hue, float phase) {
        return new ConfettiParticle(xRatio, yStart, speed, size, hue, phase, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfettiParticle)) {
            return false;
        }
        ConfettiParticle confettiParticle = (ConfettiParticle) other;
        return Float.compare(this.xRatio, confettiParticle.xRatio) == 0 && Float.compare(this.yStart, confettiParticle.yStart) == 0 && Float.compare(this.speed, confettiParticle.speed) == 0 && Float.compare(this.size, confettiParticle.size) == 0 && Color.m5169equalsimpl0(this.hue, confettiParticle.hue) && Float.compare(this.phase, confettiParticle.phase) == 0;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.xRatio) * 31) + Float.hashCode(this.yStart)) * 31) + Float.hashCode(this.speed)) * 31) + Float.hashCode(this.size)) * 31) + Color.m5175hashCodeimpl(this.hue)) * 31) + Float.hashCode(this.phase);
    }

    public String toString() {
        return "ConfettiParticle(xRatio=" + this.xRatio + ", yStart=" + this.yStart + ", speed=" + this.speed + ", size=" + this.size + ", hue=" + Color.m5176toStringimpl(this.hue) + ", phase=" + this.phase + ")";
    }

    private ConfettiParticle(float f, float f2, float f3, float f4, long j, float f5) {
        this.xRatio = f;
        this.yStart = f2;
        this.speed = f3;
        this.size = f4;
        this.hue = j;
        this.phase = f5;
    }

    public final float getXRatio() {
        return this.xRatio;
    }

    public final float getYStart() {
        return this.yStart;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final float getSize() {
        return this.size;
    }

    /* renamed from: getHue-0d7_KjU, reason: not valid java name */
    public final long m13303getHue0d7_KjU() {
        return this.hue;
    }

    public final float getPhase() {
        return this.phase;
    }
}
