package org.betup.model.remote.api.rest.quiz;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.details.CreateQuizRequestModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizParticipationInteractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/api/rest/quiz/QuizParticipationRequest;", "", "quizId", "", "request", "Lorg/betup/model/remote/entity/matches/details/CreateQuizRequestModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/matches/details/CreateQuizRequestModel;)V", "getQuizId", "()J", "getRequest", "()Lorg/betup/model/remote/entity/matches/details/CreateQuizRequestModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizParticipationRequest {
    public static final int $stable = 8;
    private final long quizId;
    private final CreateQuizRequestModel request;

    public static /* synthetic */ QuizParticipationRequest copy$default(QuizParticipationRequest quizParticipationRequest, long j, CreateQuizRequestModel createQuizRequestModel, int i, Object obj) {
        if ((i & 1) != 0) {
            j = quizParticipationRequest.quizId;
        }
        if ((i & 2) != 0) {
            createQuizRequestModel = quizParticipationRequest.request;
        }
        return quizParticipationRequest.copy(j, createQuizRequestModel);
    }

    /* renamed from: component1, reason: from getter */
    public final long getQuizId() {
        return this.quizId;
    }

    /* renamed from: component2, reason: from getter */
    public final CreateQuizRequestModel getRequest() {
        return this.request;
    }

    public final QuizParticipationRequest copy(long quizId, CreateQuizRequestModel request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new QuizParticipationRequest(quizId, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizParticipationRequest)) {
            return false;
        }
        QuizParticipationRequest quizParticipationRequest = (QuizParticipationRequest) other;
        return this.quizId == quizParticipationRequest.quizId && Intrinsics.areEqual(this.request, quizParticipationRequest.request);
    }

    public int hashCode() {
        return (Long.hashCode(this.quizId) * 31) + this.request.hashCode();
    }

    public String toString() {
        return "QuizParticipationRequest(quizId=" + this.quizId + ", request=" + this.request + ")";
    }

    public QuizParticipationRequest(long j, CreateQuizRequestModel request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.quizId = j;
        this.request = request;
    }

    public final long getQuizId() {
        return this.quizId;
    }

    public final CreateQuizRequestModel getRequest() {
        return this.request;
    }
}
