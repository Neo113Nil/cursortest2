package org.betup.ui.fragment.home.compose.matches;

import io.sentry.profilemeasurements.ProfileMeasurement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchCardShared.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/home/compose/matches/HomeSentimentSegment;", "", ProfileMeasurement.UNIT_PERCENT, "", "color", "Lorg/betup/ui/fragment/home/compose/matches/SentimentBarColor;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(FLorg/betup/ui/fragment/home/compose/matches/SentimentBarColor;)V", "getPercent", "()F", "getColor", "()Lorg/betup/ui/fragment/home/compose/matches/SentimentBarColor;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeSentimentSegment {
    public static final int $stable = 0;
    private final SentimentBarColor color;
    private final float percent;

    public static /* synthetic */ HomeSentimentSegment copy$default(HomeSentimentSegment homeSentimentSegment, float f, SentimentBarColor sentimentBarColor, int i, Object obj) {
        if ((i & 1) != 0) {
            f = homeSentimentSegment.percent;
        }
        if ((i & 2) != 0) {
            sentimentBarColor = homeSentimentSegment.color;
        }
        return homeSentimentSegment.copy(f, sentimentBarColor);
    }

    /* renamed from: component1, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    /* renamed from: component2, reason: from getter */
    public final SentimentBarColor getColor() {
        return this.color;
    }

    public final HomeSentimentSegment copy(float percent, SentimentBarColor color) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new HomeSentimentSegment(percent, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeSentimentSegment)) {
            return false;
        }
        HomeSentimentSegment homeSentimentSegment = (HomeSentimentSegment) other;
        return Float.compare(this.percent, homeSentimentSegment.percent) == 0 && this.color == homeSentimentSegment.color;
    }

    public int hashCode() {
        return (Float.hashCode(this.percent) * 31) + this.color.hashCode();
    }

    public String toString() {
        return "HomeSentimentSegment(percent=" + this.percent + ", color=" + this.color + ")";
    }

    public HomeSentimentSegment(float f, SentimentBarColor color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.percent = f;
        this.color = color;
    }

    public final float getPercent() {
        return this.percent;
    }

    public final SentimentBarColor getColor() {
        return this.color;
    }
}
