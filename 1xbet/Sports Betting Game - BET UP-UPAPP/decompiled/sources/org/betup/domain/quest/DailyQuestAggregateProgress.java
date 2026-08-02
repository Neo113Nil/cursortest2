package org.betup.domain.quest;

import com.applovin.sdk.AppLovinMediationProvider;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyQuestProgress.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lorg/betup/domain/quest/DailyQuestAggregateProgress;", "", SentryThread.JsonKeys.CURRENT, "", AppLovinMediationProvider.MAX, "fraction", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIF)V", "getCurrent", "()I", "getMax", "getFraction", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DailyQuestAggregateProgress {
    public static final int $stable = 0;
    private final int current;
    private final float fraction;
    private final int max;

    public static /* synthetic */ DailyQuestAggregateProgress copy$default(DailyQuestAggregateProgress dailyQuestAggregateProgress, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dailyQuestAggregateProgress.current;
        }
        if ((i3 & 2) != 0) {
            i2 = dailyQuestAggregateProgress.max;
        }
        if ((i3 & 4) != 0) {
            f = dailyQuestAggregateProgress.fraction;
        }
        return dailyQuestAggregateProgress.copy(i, i2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* renamed from: component3, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }

    public final DailyQuestAggregateProgress copy(int current, int max, float fraction) {
        return new DailyQuestAggregateProgress(current, max, fraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyQuestAggregateProgress)) {
            return false;
        }
        DailyQuestAggregateProgress dailyQuestAggregateProgress = (DailyQuestAggregateProgress) other;
        return this.current == dailyQuestAggregateProgress.current && this.max == dailyQuestAggregateProgress.max && Float.compare(this.fraction, dailyQuestAggregateProgress.fraction) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.current) * 31) + Integer.hashCode(this.max)) * 31) + Float.hashCode(this.fraction);
    }

    public String toString() {
        return "DailyQuestAggregateProgress(current=" + this.current + ", max=" + this.max + ", fraction=" + this.fraction + ")";
    }

    public DailyQuestAggregateProgress(int i, int i2, float f) {
        this.current = i;
        this.max = i2;
        this.fraction = f;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getMax() {
        return this.max;
    }

    public final float getFraction() {
        return this.fraction;
    }
}
