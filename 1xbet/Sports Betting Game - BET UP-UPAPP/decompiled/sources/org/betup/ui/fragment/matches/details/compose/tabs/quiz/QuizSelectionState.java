package org.betup.ui.fragment.matches.details.compose.tabs.quiz;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.details.QuizTierModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizState.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0016\u0010!\u001a\u0004\u0018\u00010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010(\u001a\u00020\nHÆ\u0003JD\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00060"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/QuizSelectionState;", "", "currentQuestionIndex", "", "selectedAnswers", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/SelectedAnswer;", "selectedTierId", "", "showPreview", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/util/Map;Ljava/lang/Long;Z)V", "getCurrentQuestionIndex", "()I", "getSelectedAnswers", "()Ljava/util/Map;", "getSelectedTierId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShowPreview", "()Z", "isAnswerSelected", "questionIndex", "betId", "allQuestionsAnswered", "totalQuestions", "calculateTotalOdds", "", "calculateTotalOddsWithBoost", "tierBoost", "calculatePotentialPrize", "fee", "getAutoSelectedTier", "Lorg/betup/model/remote/entity/matches/details/QuizTierModel;", "tiers", "", "component1", "component2", "component3", "component4", "copy", "(ILjava/util/Map;Ljava/lang/Long;Z)Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/QuizSelectionState;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QuizSelectionState {
    public static final int $stable = 8;
    private final int currentQuestionIndex;
    private final Map<Integer, SelectedAnswer> selectedAnswers;
    private final Long selectedTierId;
    private final boolean showPreview;

    public QuizSelectionState() {
        this(0, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuizSelectionState copy$default(QuizSelectionState quizSelectionState, int i, Map map, Long l, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = quizSelectionState.currentQuestionIndex;
        }
        if ((i2 & 2) != 0) {
            map = quizSelectionState.selectedAnswers;
        }
        if ((i2 & 4) != 0) {
            l = quizSelectionState.selectedTierId;
        }
        if ((i2 & 8) != 0) {
            z = quizSelectionState.showPreview;
        }
        return quizSelectionState.copy(i, map, l, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentQuestionIndex() {
        return this.currentQuestionIndex;
    }

    public final Map<Integer, SelectedAnswer> component2() {
        return this.selectedAnswers;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getSelectedTierId() {
        return this.selectedTierId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowPreview() {
        return this.showPreview;
    }

    public final QuizSelectionState copy(int currentQuestionIndex, Map<Integer, SelectedAnswer> selectedAnswers, Long selectedTierId, boolean showPreview) {
        Intrinsics.checkNotNullParameter(selectedAnswers, "selectedAnswers");
        return new QuizSelectionState(currentQuestionIndex, selectedAnswers, selectedTierId, showPreview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizSelectionState)) {
            return false;
        }
        QuizSelectionState quizSelectionState = (QuizSelectionState) other;
        return this.currentQuestionIndex == quizSelectionState.currentQuestionIndex && Intrinsics.areEqual(this.selectedAnswers, quizSelectionState.selectedAnswers) && Intrinsics.areEqual(this.selectedTierId, quizSelectionState.selectedTierId) && this.showPreview == quizSelectionState.showPreview;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.currentQuestionIndex) * 31) + this.selectedAnswers.hashCode()) * 31;
        Long l = this.selectedTierId;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.showPreview);
    }

    public String toString() {
        return "QuizSelectionState(currentQuestionIndex=" + this.currentQuestionIndex + ", selectedAnswers=" + this.selectedAnswers + ", selectedTierId=" + this.selectedTierId + ", showPreview=" + this.showPreview + ")";
    }

    public QuizSelectionState(int i, Map<Integer, SelectedAnswer> selectedAnswers, Long l, boolean z) {
        Intrinsics.checkNotNullParameter(selectedAnswers, "selectedAnswers");
        this.currentQuestionIndex = i;
        this.selectedAnswers = selectedAnswers;
        this.selectedTierId = l;
        this.showPreview = z;
    }

    public final int getCurrentQuestionIndex() {
        return this.currentQuestionIndex;
    }

    public /* synthetic */ QuizSelectionState(int i, Map map, Long l, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? MapsKt.emptyMap() : map, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? false : z);
    }

    public final Map<Integer, SelectedAnswer> getSelectedAnswers() {
        return this.selectedAnswers;
    }

    public final Long getSelectedTierId() {
        return this.selectedTierId;
    }

    public final boolean getShowPreview() {
        return this.showPreview;
    }

    public final boolean isAnswerSelected(int questionIndex, long betId) {
        SelectedAnswer selectedAnswer = this.selectedAnswers.get(Integer.valueOf(questionIndex));
        return selectedAnswer != null && selectedAnswer.getBetId() == betId;
    }

    public final boolean allQuestionsAnswered(int totalQuestions) {
        if (this.selectedAnswers.size() == totalQuestions) {
            Collection<SelectedAnswer> values = this.selectedAnswers.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    if (((SelectedAnswer) it.next()) != null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final double calculateTotalOdds() {
        double d = 1.0d;
        while (this.selectedAnswers.values().iterator().hasNext()) {
            d *= ((SelectedAnswer) r0.next()).getCoefficient();
        }
        return d;
    }

    public final double calculateTotalOddsWithBoost(double tierBoost) {
        return calculateTotalOdds() * tierBoost;
    }

    public final long calculatePotentialPrize(long fee, double tierBoost) {
        return (long) (fee * calculateTotalOddsWithBoost(tierBoost));
    }

    public final QuizTierModel getAutoSelectedTier(List<QuizTierModel> tiers) {
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        if (tiers.isEmpty()) {
            return null;
        }
        double calculateTotalOdds = calculateTotalOdds();
        List sortedWith = CollectionsKt.sortedWith(tiers, new Comparator() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizSelectionState$getAutoSelectedTier$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Double.valueOf(((QuizTierModel) t2).getOddsBoost()), Double.valueOf(((QuizTierModel) t).getOddsBoost()));
            }
        });
        if (calculateTotalOdds >= 2.0d) {
            return (QuizTierModel) CollectionsKt.firstOrNull(sortedWith);
        }
        if (calculateTotalOdds >= 1.5d) {
            QuizTierModel quizTierModel = (QuizTierModel) CollectionsKt.getOrNull(sortedWith, 1);
            return quizTierModel == null ? (QuizTierModel) CollectionsKt.firstOrNull(sortedWith) : quizTierModel;
        }
        return (QuizTierModel) CollectionsKt.lastOrNull(sortedWith);
    }
}
