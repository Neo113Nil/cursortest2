package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetSessionHistoryPageDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JU\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetSessionHistoryPageDto;", "", "content", "", "Lorg/betup/games/flashbet/model/FlashBetSessionHistoryItemDto;", "totalElements", "", "totalPages", "", "number", RRWebVideoEvent.JsonKeys.SIZE, "first", "", "last", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;JIIIZZ)V", "getContent", "()Ljava/util/List;", "getTotalElements", "()J", "getTotalPages", "()I", "getNumber", "getSize", "getFirst", "()Z", "getLast", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetSessionHistoryPageDto {
    public static final int $stable = 8;

    @SerializedName("content")
    private final List<FlashBetSessionHistoryItemDto> content;

    @SerializedName("first")
    private final boolean first;

    @SerializedName("last")
    private final boolean last;

    @SerializedName("number")
    private final int number;

    @SerializedName(RRWebVideoEvent.JsonKeys.SIZE)
    private final int size;

    @SerializedName("totalElements")
    private final long totalElements;

    @SerializedName("totalPages")
    private final int totalPages;

    public final List<FlashBetSessionHistoryItemDto> component1() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalElements() {
        return this.totalElements;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getFirst() {
        return this.first;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getLast() {
        return this.last;
    }

    public final FlashBetSessionHistoryPageDto copy(List<FlashBetSessionHistoryItemDto> content, long totalElements, int totalPages, int number, int size, boolean first, boolean last) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new FlashBetSessionHistoryPageDto(content, totalElements, totalPages, number, size, first, last);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetSessionHistoryPageDto)) {
            return false;
        }
        FlashBetSessionHistoryPageDto flashBetSessionHistoryPageDto = (FlashBetSessionHistoryPageDto) other;
        return Intrinsics.areEqual(this.content, flashBetSessionHistoryPageDto.content) && this.totalElements == flashBetSessionHistoryPageDto.totalElements && this.totalPages == flashBetSessionHistoryPageDto.totalPages && this.number == flashBetSessionHistoryPageDto.number && this.size == flashBetSessionHistoryPageDto.size && this.first == flashBetSessionHistoryPageDto.first && this.last == flashBetSessionHistoryPageDto.last;
    }

    public int hashCode() {
        return (((((((((((this.content.hashCode() * 31) + Long.hashCode(this.totalElements)) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.number)) * 31) + Integer.hashCode(this.size)) * 31) + Boolean.hashCode(this.first)) * 31) + Boolean.hashCode(this.last);
    }

    public String toString() {
        return "FlashBetSessionHistoryPageDto(content=" + this.content + ", totalElements=" + this.totalElements + ", totalPages=" + this.totalPages + ", number=" + this.number + ", size=" + this.size + ", first=" + this.first + ", last=" + this.last + ")";
    }

    public FlashBetSessionHistoryPageDto(List<FlashBetSessionHistoryItemDto> content, long j, int i, int i2, int i3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.totalElements = j;
        this.totalPages = i;
        this.number = i2;
        this.size = i3;
        this.first = z;
        this.last = z2;
    }

    public final List<FlashBetSessionHistoryItemDto> getContent() {
        return this.content;
    }

    public final long getTotalElements() {
        return this.totalElements;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean getFirst() {
        return this.first;
    }

    public final boolean getLast() {
        return this.last;
    }
}
