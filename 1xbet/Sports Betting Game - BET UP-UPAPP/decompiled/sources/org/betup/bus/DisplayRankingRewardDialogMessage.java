package org.betup.bus;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.vk.sdk.api.model.VKApiCommunityFull;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DisplayRankingRewardDialogMessage.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006!"}, d2 = {"Lorg/betup/bus/DisplayRankingRewardDialogMessage;", "", VKApiCommunityFull.PLACE, "", "amount", "", "title", "", "body", TypedValues.CycleType.S_WAVE_PERIOD, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlace", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAmount", "()J", "getTitle", "()Ljava/lang/String;", "getBody", "getPeriod", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/bus/DisplayRankingRewardDialogMessage;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DisplayRankingRewardDialogMessage {
    public static final int $stable = 0;
    private final long amount;
    private final String body;
    private final String period;
    private final Integer place;
    private final String title;

    public static /* synthetic */ DisplayRankingRewardDialogMessage copy$default(DisplayRankingRewardDialogMessage displayRankingRewardDialogMessage, Integer num, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = displayRankingRewardDialogMessage.place;
        }
        if ((i & 2) != 0) {
            j = displayRankingRewardDialogMessage.amount;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = displayRankingRewardDialogMessage.title;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = displayRankingRewardDialogMessage.body;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = displayRankingRewardDialogMessage.period;
        }
        return displayRankingRewardDialogMessage.copy(num, j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getPlace() {
        return this.place;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    public final DisplayRankingRewardDialogMessage copy(Integer place, long amount, String title, String body, String period) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new DisplayRankingRewardDialogMessage(place, amount, title, body, period);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayRankingRewardDialogMessage)) {
            return false;
        }
        DisplayRankingRewardDialogMessage displayRankingRewardDialogMessage = (DisplayRankingRewardDialogMessage) other;
        return Intrinsics.areEqual(this.place, displayRankingRewardDialogMessage.place) && this.amount == displayRankingRewardDialogMessage.amount && Intrinsics.areEqual(this.title, displayRankingRewardDialogMessage.title) && Intrinsics.areEqual(this.body, displayRankingRewardDialogMessage.body) && Intrinsics.areEqual(this.period, displayRankingRewardDialogMessage.period);
    }

    public int hashCode() {
        Integer num = this.place;
        int hashCode = (((((((num == null ? 0 : num.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
        String str = this.period;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DisplayRankingRewardDialogMessage(place=" + this.place + ", amount=" + this.amount + ", title=" + this.title + ", body=" + this.body + ", period=" + this.period + ")";
    }

    public DisplayRankingRewardDialogMessage(Integer num, long j, String title, String body, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.place = num;
        this.amount = j;
        this.title = title;
        this.body = body;
        this.period = str;
    }

    public /* synthetic */ DisplayRankingRewardDialogMessage(Integer num, long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, j, str, str2, (i & 16) != 0 ? null : str3);
    }

    public final Integer getPlace() {
        return this.place;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getPeriod() {
        return this.period;
    }
}
