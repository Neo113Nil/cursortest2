package org.betup.model.remote.api.rest.user;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ReportDailyQuestClientEventInteractor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÂ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/api/rest/user/ReportDailyQuestClientEventParams;", "", "eventType", "", "delta", "", "nonce", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IJ)V", "getEventType", "()Ljava/lang/String;", "getDelta", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReportDailyQuestClientEventParams {
    public static final int $stable = 0;
    private final int delta;
    private final String eventType;
    private final long nonce;

    /* renamed from: component3, reason: from getter */
    private final long getNonce() {
        return this.nonce;
    }

    public static /* synthetic */ ReportDailyQuestClientEventParams copy$default(ReportDailyQuestClientEventParams reportDailyQuestClientEventParams, String str, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reportDailyQuestClientEventParams.eventType;
        }
        if ((i2 & 2) != 0) {
            i = reportDailyQuestClientEventParams.delta;
        }
        if ((i2 & 4) != 0) {
            j = reportDailyQuestClientEventParams.nonce;
        }
        return reportDailyQuestClientEventParams.copy(str, i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDelta() {
        return this.delta;
    }

    public final ReportDailyQuestClientEventParams copy(String eventType, int delta, long nonce) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new ReportDailyQuestClientEventParams(eventType, delta, nonce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportDailyQuestClientEventParams)) {
            return false;
        }
        ReportDailyQuestClientEventParams reportDailyQuestClientEventParams = (ReportDailyQuestClientEventParams) other;
        return Intrinsics.areEqual(this.eventType, reportDailyQuestClientEventParams.eventType) && this.delta == reportDailyQuestClientEventParams.delta && this.nonce == reportDailyQuestClientEventParams.nonce;
    }

    public int hashCode() {
        return (((this.eventType.hashCode() * 31) + Integer.hashCode(this.delta)) * 31) + Long.hashCode(this.nonce);
    }

    public String toString() {
        return "ReportDailyQuestClientEventParams(eventType=" + this.eventType + ", delta=" + this.delta + ", nonce=" + this.nonce + ")";
    }

    public ReportDailyQuestClientEventParams(String eventType, int i, long j) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.delta = i;
        this.nonce = j;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final int getDelta() {
        return this.delta;
    }

    public /* synthetic */ ReportDailyQuestClientEventParams(String str, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? System.nanoTime() : j);
    }
}
