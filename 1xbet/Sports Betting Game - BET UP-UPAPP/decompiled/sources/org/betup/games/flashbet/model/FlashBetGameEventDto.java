package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameEventDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetGameEventDto;", "", "minute", "", "description", "", "source", "eventType", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMinute", "()I", "getDescription", "()Ljava/lang/String;", "getSource", "getEventType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetGameEventDto {
    public static final int $stable = 0;

    @SerializedName("description")
    private final String description;

    @SerializedName("eventType")
    private final String eventType;

    @SerializedName("minute")
    private final int minute;

    @SerializedName("source")
    private final String source;

    public static /* synthetic */ FlashBetGameEventDto copy$default(FlashBetGameEventDto flashBetGameEventDto, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flashBetGameEventDto.minute;
        }
        if ((i2 & 2) != 0) {
            str = flashBetGameEventDto.description;
        }
        if ((i2 & 4) != 0) {
            str2 = flashBetGameEventDto.source;
        }
        if ((i2 & 8) != 0) {
            str3 = flashBetGameEventDto.eventType;
        }
        return flashBetGameEventDto.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public final FlashBetGameEventDto copy(int minute, String description, String source, String eventType) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(source, "source");
        return new FlashBetGameEventDto(minute, description, source, eventType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetGameEventDto)) {
            return false;
        }
        FlashBetGameEventDto flashBetGameEventDto = (FlashBetGameEventDto) other;
        return this.minute == flashBetGameEventDto.minute && Intrinsics.areEqual(this.description, flashBetGameEventDto.description) && Intrinsics.areEqual(this.source, flashBetGameEventDto.source) && Intrinsics.areEqual(this.eventType, flashBetGameEventDto.eventType);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.minute) * 31) + this.description.hashCode()) * 31) + this.source.hashCode()) * 31;
        String str = this.eventType;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FlashBetGameEventDto(minute=" + this.minute + ", description=" + this.description + ", source=" + this.source + ", eventType=" + this.eventType + ")";
    }

    public FlashBetGameEventDto(int i, String description, String source, String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(source, "source");
        this.minute = i;
        this.description = description;
        this.source = source;
        this.eventType = str;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final String getDescription() {
        return this.description;
    }

    public /* synthetic */ FlashBetGameEventDto(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3);
    }

    public final String getSource() {
        return this.source;
    }

    public final String getEventType() {
        return this.eventType;
    }
}
