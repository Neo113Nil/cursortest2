package org.betup.model.remote.entity.quiz;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/model/remote/entity/quiz/QuizParticipationState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "RETURNED", "", "PENDING", "WON", "LOST", "CANCEL", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuizParticipationState {
    public static final int $stable = 0;
    public static final int CANCEL = 32;
    public static final QuizParticipationState INSTANCE = new QuizParticipationState();
    public static final int LOST = 8;
    public static final int PENDING = 2;
    public static final int RETURNED = 1;
    public static final int WON = 4;

    private QuizParticipationState() {
    }
}
