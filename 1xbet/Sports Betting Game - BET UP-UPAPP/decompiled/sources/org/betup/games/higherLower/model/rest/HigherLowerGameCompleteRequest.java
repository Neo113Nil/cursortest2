package org.betup.games.higherLower.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HigherLowerGameCompleteRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/games/higherLower/model/rest/HigherLowerGameCompleteRequest;", "", "betType", "Lorg/betup/games/higherLower/model/rest/HighLowBetType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/higherLower/model/rest/HighLowBetType;)V", "getBetType", "()Lorg/betup/games/higherLower/model/rest/HighLowBetType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HigherLowerGameCompleteRequest {
    public static final int $stable = 0;

    @SerializedName("betType")
    private final HighLowBetType betType;

    public static /* synthetic */ HigherLowerGameCompleteRequest copy$default(HigherLowerGameCompleteRequest higherLowerGameCompleteRequest, HighLowBetType highLowBetType, int i, Object obj) {
        if ((i & 1) != 0) {
            highLowBetType = higherLowerGameCompleteRequest.betType;
        }
        return higherLowerGameCompleteRequest.copy(highLowBetType);
    }

    /* renamed from: component1, reason: from getter */
    public final HighLowBetType getBetType() {
        return this.betType;
    }

    public final HigherLowerGameCompleteRequest copy(HighLowBetType betType) {
        return new HigherLowerGameCompleteRequest(betType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HigherLowerGameCompleteRequest) && this.betType == ((HigherLowerGameCompleteRequest) other).betType;
    }

    public int hashCode() {
        HighLowBetType highLowBetType = this.betType;
        if (highLowBetType == null) {
            return 0;
        }
        return highLowBetType.hashCode();
    }

    public String toString() {
        return "HigherLowerGameCompleteRequest(betType=" + this.betType + ")";
    }

    public HigherLowerGameCompleteRequest(HighLowBetType highLowBetType) {
        this.betType = highLowBetType;
    }

    public final HighLowBetType getBetType() {
        return this.betType;
    }
}
