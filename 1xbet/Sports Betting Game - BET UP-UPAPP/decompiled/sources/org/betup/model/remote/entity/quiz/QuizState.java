package org.betup.model.remote.entity.quiz;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/model/remote/entity/quiz/QuizState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "OPEN", "", "CLOSED", "FINISHED", "CANCELED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuizState {
    public static final int $stable = 0;
    public static final int CANCELED = 4;
    public static final int CLOSED = 2;
    public static final int FINISHED = 3;
    public static final QuizState INSTANCE = new QuizState();
    public static final int OPEN = 1;

    private QuizState() {
    }
}
