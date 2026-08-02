package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetSessionHistoryItemDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J¥\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000eHÆ\u0001J\u0013\u00109\u001a\u00020\f2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0011HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010 R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"¨\u0006="}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetSessionHistoryItemDto;", "", "id", "", "sessionId", "createdAt", "matchStartDate", "sportName", "sportPhotoUrl", "categoryName", "categoryPhotoUrl", "isWin", "", "amount", "", "betAmount", "correctAnswers", "", "totalQuestions", "result", "returnAmount", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJIILjava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getSessionId", "getCreatedAt", "getMatchStartDate", "getSportName", "getSportPhotoUrl", "getCategoryName", "getCategoryPhotoUrl", "()Z", "getAmount", "()J", "getBetAmount", "getCorrectAnswers", "()I", "getTotalQuestions", "getResult", "getReturnAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetSessionHistoryItemDto {
    public static final int $stable = 0;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("betAmount")
    private final long betAmount;

    @SerializedName("categoryName")
    private final String categoryName;

    @SerializedName("categoryPhotoUrl")
    private final String categoryPhotoUrl;

    @SerializedName("correctAnswers")
    private final int correctAnswers;

    @SerializedName("createdAt")
    private final String createdAt;

    @SerializedName("id")
    private final String id;

    @SerializedName("isWin")
    private final boolean isWin;

    @SerializedName("matchStartDate")
    private final String matchStartDate;

    @SerializedName("result")
    private final String result;

    @SerializedName("returnAmount")
    private final long returnAmount;

    @SerializedName("sessionId")
    private final String sessionId;

    @SerializedName("sportName")
    private final String sportName;

    @SerializedName("sportPhotoUrl")
    private final String sportPhotoUrl;

    @SerializedName("totalQuestions")
    private final int totalQuestions;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* renamed from: component11, reason: from getter */
    public final long getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component12, reason: from getter */
    public final int getCorrectAnswers() {
        return this.correctAnswers;
    }

    /* renamed from: component13, reason: from getter */
    public final int getTotalQuestions() {
        return this.totalQuestions;
    }

    /* renamed from: component14, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component15, reason: from getter */
    public final long getReturnAmount() {
        return this.returnAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMatchStartDate() {
        return this.matchStartDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSportPhotoUrl() {
        return this.sportPhotoUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCategoryPhotoUrl() {
        return this.categoryPhotoUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsWin() {
        return this.isWin;
    }

    public final FlashBetSessionHistoryItemDto copy(String id, String sessionId, String createdAt, String matchStartDate, String sportName, String sportPhotoUrl, String categoryName, String categoryPhotoUrl, boolean isWin, long amount, long betAmount, int correctAnswers, int totalQuestions, String result, long returnAmount) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(sportPhotoUrl, "sportPhotoUrl");
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        return new FlashBetSessionHistoryItemDto(id, sessionId, createdAt, matchStartDate, sportName, sportPhotoUrl, categoryName, categoryPhotoUrl, isWin, amount, betAmount, correctAnswers, totalQuestions, result, returnAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetSessionHistoryItemDto)) {
            return false;
        }
        FlashBetSessionHistoryItemDto flashBetSessionHistoryItemDto = (FlashBetSessionHistoryItemDto) other;
        return Intrinsics.areEqual(this.id, flashBetSessionHistoryItemDto.id) && Intrinsics.areEqual(this.sessionId, flashBetSessionHistoryItemDto.sessionId) && Intrinsics.areEqual(this.createdAt, flashBetSessionHistoryItemDto.createdAt) && Intrinsics.areEqual(this.matchStartDate, flashBetSessionHistoryItemDto.matchStartDate) && Intrinsics.areEqual(this.sportName, flashBetSessionHistoryItemDto.sportName) && Intrinsics.areEqual(this.sportPhotoUrl, flashBetSessionHistoryItemDto.sportPhotoUrl) && Intrinsics.areEqual(this.categoryName, flashBetSessionHistoryItemDto.categoryName) && Intrinsics.areEqual(this.categoryPhotoUrl, flashBetSessionHistoryItemDto.categoryPhotoUrl) && this.isWin == flashBetSessionHistoryItemDto.isWin && this.amount == flashBetSessionHistoryItemDto.amount && this.betAmount == flashBetSessionHistoryItemDto.betAmount && this.correctAnswers == flashBetSessionHistoryItemDto.correctAnswers && this.totalQuestions == flashBetSessionHistoryItemDto.totalQuestions && Intrinsics.areEqual(this.result, flashBetSessionHistoryItemDto.result) && this.returnAmount == flashBetSessionHistoryItemDto.returnAmount;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.createdAt.hashCode()) * 31;
        String str = this.matchStartDate;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sportName.hashCode()) * 31) + this.sportPhotoUrl.hashCode()) * 31) + this.categoryName.hashCode()) * 31;
        String str2 = this.categoryPhotoUrl;
        int hashCode3 = (((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isWin)) * 31) + Long.hashCode(this.amount)) * 31) + Long.hashCode(this.betAmount)) * 31) + Integer.hashCode(this.correctAnswers)) * 31) + Integer.hashCode(this.totalQuestions)) * 31;
        String str3 = this.result;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.returnAmount);
    }

    public String toString() {
        return "FlashBetSessionHistoryItemDto(id=" + this.id + ", sessionId=" + this.sessionId + ", createdAt=" + this.createdAt + ", matchStartDate=" + this.matchStartDate + ", sportName=" + this.sportName + ", sportPhotoUrl=" + this.sportPhotoUrl + ", categoryName=" + this.categoryName + ", categoryPhotoUrl=" + this.categoryPhotoUrl + ", isWin=" + this.isWin + ", amount=" + this.amount + ", betAmount=" + this.betAmount + ", correctAnswers=" + this.correctAnswers + ", totalQuestions=" + this.totalQuestions + ", result=" + this.result + ", returnAmount=" + this.returnAmount + ")";
    }

    public FlashBetSessionHistoryItemDto(String id, String sessionId, String createdAt, String str, String sportName, String sportPhotoUrl, String categoryName, String str2, boolean z, long j, long j2, int i, int i2, String str3, long j3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(sportPhotoUrl, "sportPhotoUrl");
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        this.id = id;
        this.sessionId = sessionId;
        this.createdAt = createdAt;
        this.matchStartDate = str;
        this.sportName = sportName;
        this.sportPhotoUrl = sportPhotoUrl;
        this.categoryName = categoryName;
        this.categoryPhotoUrl = str2;
        this.isWin = z;
        this.amount = j;
        this.betAmount = j2;
        this.correctAnswers = i;
        this.totalQuestions = i2;
        this.result = str3;
        this.returnAmount = j3;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ FlashBetSessionHistoryItemDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, long j, long j2, int i, int i2, String str9, long j3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? "" : str2, str3, (i3 & 8) != 0 ? null : str4, str5, str6, str7, str8, z, j, (i3 & 1024) != 0 ? 0L : j2, i, i2, (i3 & 8192) != 0 ? null : str9, (i3 & 16384) != 0 ? 0L : j3);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getMatchStartDate() {
        return this.matchStartDate;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public final String getSportPhotoUrl() {
        return this.sportPhotoUrl;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getCategoryPhotoUrl() {
        return this.categoryPhotoUrl;
    }

    public final boolean isWin() {
        return this.isWin;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final long getBetAmount() {
        return this.betAmount;
    }

    public final int getCorrectAnswers() {
        return this.correctAnswers;
    }

    public final int getTotalQuestions() {
        return this.totalQuestions;
    }

    public final String getResult() {
        return this.result;
    }

    public final long getReturnAmount() {
        return this.returnAmount;
    }
}
