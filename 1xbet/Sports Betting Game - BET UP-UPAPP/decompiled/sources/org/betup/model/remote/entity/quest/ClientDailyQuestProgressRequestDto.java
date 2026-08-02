package org.betup.model.remote.entity.quest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ClientDailyQuestProgressRequestDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lorg/betup/model/remote/entity/quest/ClientDailyQuestProgressRequestDto;", "", "eventType", "", "delta", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "getEventType", "()Ljava/lang/String;", "getDelta", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ClientDailyQuestProgressRequestDto {
    public static final int $stable = 0;

    @SerializedName("delta")
    private final int delta;

    @SerializedName("event_type")
    private final String eventType;

    public static /* synthetic */ ClientDailyQuestProgressRequestDto copy$default(ClientDailyQuestProgressRequestDto clientDailyQuestProgressRequestDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = clientDailyQuestProgressRequestDto.eventType;
        }
        if ((i2 & 2) != 0) {
            i = clientDailyQuestProgressRequestDto.delta;
        }
        return clientDailyQuestProgressRequestDto.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDelta() {
        return this.delta;
    }

    public final ClientDailyQuestProgressRequestDto copy(String eventType, int delta) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new ClientDailyQuestProgressRequestDto(eventType, delta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientDailyQuestProgressRequestDto)) {
            return false;
        }
        ClientDailyQuestProgressRequestDto clientDailyQuestProgressRequestDto = (ClientDailyQuestProgressRequestDto) other;
        return Intrinsics.areEqual(this.eventType, clientDailyQuestProgressRequestDto.eventType) && this.delta == clientDailyQuestProgressRequestDto.delta;
    }

    public int hashCode() {
        return (this.eventType.hashCode() * 31) + Integer.hashCode(this.delta);
    }

    public String toString() {
        return "ClientDailyQuestProgressRequestDto(eventType=" + this.eventType + ", delta=" + this.delta + ")";
    }

    public ClientDailyQuestProgressRequestDto(String eventType, int i) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.delta = i;
    }

    public /* synthetic */ ClientDailyQuestProgressRequestDto(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 1 : i);
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final int getDelta() {
        return this.delta;
    }
}
