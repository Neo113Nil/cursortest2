package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizParticipationListResponseModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BQ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J[\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lorg/betup/model/remote/entity/matches/details/QuizParticipationListResponseModel;", "T", "", "content", "", "numberOfElements", "", "totalElements", "", "totalPages", RRWebVideoEvent.JsonKeys.SIZE, "number", "empty", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;IJIIIZ)V", "getContent", "()Ljava/util/List;", "getNumberOfElements", "()I", "getTotalElements", "()J", "getTotalPages", "getSize", "getNumber", "getEmpty", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizParticipationListResponseModel<T> {
    public static final int $stable = 8;

    @SerializedName("content")
    private final List<T> content;

    @SerializedName("empty")
    private final boolean empty;

    @SerializedName("number")
    private final int number;

    @SerializedName("numberOfElements")
    private final int numberOfElements;

    @SerializedName(RRWebVideoEvent.JsonKeys.SIZE)
    private final int size;

    @SerializedName("totalElements")
    private final long totalElements;

    @SerializedName("totalPages")
    private final int totalPages;

    public final List<T> component1() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOfElements() {
        return this.numberOfElements;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTotalElements() {
        return this.totalElements;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component6, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEmpty() {
        return this.empty;
    }

    public final QuizParticipationListResponseModel<T> copy(List<? extends T> content, int numberOfElements, long totalElements, int totalPages, int size, int number, boolean empty) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new QuizParticipationListResponseModel<>(content, numberOfElements, totalElements, totalPages, size, number, empty);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizParticipationListResponseModel)) {
            return false;
        }
        QuizParticipationListResponseModel quizParticipationListResponseModel = (QuizParticipationListResponseModel) other;
        return Intrinsics.areEqual(this.content, quizParticipationListResponseModel.content) && this.numberOfElements == quizParticipationListResponseModel.numberOfElements && this.totalElements == quizParticipationListResponseModel.totalElements && this.totalPages == quizParticipationListResponseModel.totalPages && this.size == quizParticipationListResponseModel.size && this.number == quizParticipationListResponseModel.number && this.empty == quizParticipationListResponseModel.empty;
    }

    public int hashCode() {
        return (((((((((((this.content.hashCode() * 31) + Integer.hashCode(this.numberOfElements)) * 31) + Long.hashCode(this.totalElements)) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.number)) * 31) + Boolean.hashCode(this.empty);
    }

    public String toString() {
        return "QuizParticipationListResponseModel(content=" + this.content + ", numberOfElements=" + this.numberOfElements + ", totalElements=" + this.totalElements + ", totalPages=" + this.totalPages + ", size=" + this.size + ", number=" + this.number + ", empty=" + this.empty + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuizParticipationListResponseModel(List<? extends T> content, int i, long j, int i2, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.numberOfElements = i;
        this.totalElements = j;
        this.totalPages = i2;
        this.size = i3;
        this.number = i4;
        this.empty = z;
    }

    public /* synthetic */ QuizParticipationListResponseModel(List list, int i, long j, int i2, int i3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0L : j, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) == 0 ? z : false);
    }

    public final List<T> getContent() {
        return this.content;
    }

    public final int getNumberOfElements() {
        return this.numberOfElements;
    }

    public final long getTotalElements() {
        return this.totalElements;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getNumber() {
        return this.number;
    }

    public final boolean getEmpty() {
        return this.empty;
    }
}
