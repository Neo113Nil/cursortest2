package org.betup.games.doubles.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DoubleGameFinishRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/games/doubles/model/rest/DoubleGameFinishRequest;", "", "returnAmount", "", "sessionId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;)V", "getReturnAmount", "()J", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DoubleGameFinishRequest {
    public static final int $stable = 0;

    @SerializedName("returnAmount")
    private final long returnAmount;

    @SerializedName("sessionId")
    private final String sessionId;

    public static /* synthetic */ DoubleGameFinishRequest copy$default(DoubleGameFinishRequest doubleGameFinishRequest, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = doubleGameFinishRequest.returnAmount;
        }
        if ((i & 2) != 0) {
            str = doubleGameFinishRequest.sessionId;
        }
        return doubleGameFinishRequest.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getReturnAmount() {
        return this.returnAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final DoubleGameFinishRequest copy(long returnAmount, String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new DoubleGameFinishRequest(returnAmount, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoubleGameFinishRequest)) {
            return false;
        }
        DoubleGameFinishRequest doubleGameFinishRequest = (DoubleGameFinishRequest) other;
        return this.returnAmount == doubleGameFinishRequest.returnAmount && Intrinsics.areEqual(this.sessionId, doubleGameFinishRequest.sessionId);
    }

    public int hashCode() {
        return (Long.hashCode(this.returnAmount) * 31) + this.sessionId.hashCode();
    }

    public String toString() {
        return "DoubleGameFinishRequest(returnAmount=" + this.returnAmount + ", sessionId=" + this.sessionId + ")";
    }

    public DoubleGameFinishRequest(long j, String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.returnAmount = j;
        this.sessionId = sessionId;
    }

    public final long getReturnAmount() {
        return this.returnAmount;
    }

    public final String getSessionId() {
        return this.sessionId;
    }
}
