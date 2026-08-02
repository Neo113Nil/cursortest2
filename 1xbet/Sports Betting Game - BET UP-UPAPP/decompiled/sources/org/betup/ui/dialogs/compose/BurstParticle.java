package org.betup.ui.dialogs.compose;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.motion.widget.Key;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleResultAnimations.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\u0018JV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lorg/betup/ui/dialogs/compose/BurstParticle;", "", "dx", "", "dy", Key.ROTATION, "delayMs", "", "durationMs", "isCoin", "", "color", "Landroidx/compose/ui/graphics/Color;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(FFFIIZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDx", "()F", "getDy", "getRotation", "getDelayMs", "()I", "getDurationMs", "()Z", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7-0d7_KjU", "copy", "copy-PE3pjmc", "(FFFIIZJ)Lorg/betup/ui/dialogs/compose/BurstParticle;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class BurstParticle {
    private final long color;
    private final int delayMs;
    private final int durationMs;
    private final float dx;
    private final float dy;
    private final boolean isCoin;
    private final float rotation;

    public /* synthetic */ BurstParticle(float f, float f2, float f3, int i, int i2, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, i, i2, z, j);
    }

    /* renamed from: component1, reason: from getter */
    public final float getDx() {
        return this.dx;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDy() {
        return this.dy;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDelayMs() {
        return this.delayMs;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCoin() {
        return this.isCoin;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-PE3pjmc, reason: not valid java name */
    public final BurstParticle m13255copyPE3pjmc(float dx, float dy, float rotation, int delayMs, int durationMs, boolean isCoin, long color) {
        return new BurstParticle(dx, dy, rotation, delayMs, durationMs, isCoin, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BurstParticle)) {
            return false;
        }
        BurstParticle burstParticle = (BurstParticle) other;
        return Float.compare(this.dx, burstParticle.dx) == 0 && Float.compare(this.dy, burstParticle.dy) == 0 && Float.compare(this.rotation, burstParticle.rotation) == 0 && this.delayMs == burstParticle.delayMs && this.durationMs == burstParticle.durationMs && this.isCoin == burstParticle.isCoin && Color.m5169equalsimpl0(this.color, burstParticle.color);
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy)) * 31) + Float.hashCode(this.rotation)) * 31) + Integer.hashCode(this.delayMs)) * 31) + Integer.hashCode(this.durationMs)) * 31) + Boolean.hashCode(this.isCoin)) * 31) + Color.m5175hashCodeimpl(this.color);
    }

    public String toString() {
        return "BurstParticle(dx=" + this.dx + ", dy=" + this.dy + ", rotation=" + this.rotation + ", delayMs=" + this.delayMs + ", durationMs=" + this.durationMs + ", isCoin=" + this.isCoin + ", color=" + Color.m5176toStringimpl(this.color) + ")";
    }

    private BurstParticle(float f, float f2, float f3, int i, int i2, boolean z, long j) {
        this.dx = f;
        this.dy = f2;
        this.rotation = f3;
        this.delayMs = i;
        this.durationMs = i2;
        this.isCoin = z;
        this.color = j;
    }

    public final float getDx() {
        return this.dx;
    }

    public final float getDy() {
        return this.dy;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final int getDelayMs() {
        return this.delayMs;
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final boolean isCoin() {
        return this.isCoin;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m13256getColor0d7_KjU() {
        return this.color;
    }
}
