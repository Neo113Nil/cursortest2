package org.betup.utils;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.challenges.NewChallengeBetModel;
import org.betup.model.remote.entity.challenges.NewChallengeParticipantModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleParticipantOrder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lorg/betup/utils/BattleParticipantOrder;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "reorderTwoUsers", "Lorg/betup/utils/OrderedBattleParticipants;", "users", "", "Lorg/betup/model/remote/entity/challenges/NewChallengeParticipantModel;", "bets", "Lorg/betup/model/remote/entity/challenges/NewChallengeBetModel;", "currentUserId", "", "firstHighlight", "Lorg/betup/utils/BattleBetHighlightStyle;", "secondHighlight", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lorg/betup/utils/BattleBetHighlightStyle;Lorg/betup/utils/BattleBetHighlightStyle;)Lorg/betup/utils/OrderedBattleParticipants;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleParticipantOrder {
    public static final int $stable = 0;
    public static final BattleParticipantOrder INSTANCE = new BattleParticipantOrder();

    private BattleParticipantOrder() {
    }

    public final OrderedBattleParticipants reorderTwoUsers(List<NewChallengeParticipantModel> users, List<NewChallengeBetModel> bets, Long currentUserId, BattleBetHighlightStyle firstHighlight, BattleBetHighlightStyle secondHighlight) {
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(firstHighlight, "firstHighlight");
        Intrinsics.checkNotNullParameter(secondHighlight, "secondHighlight");
        if (users.size() < 2) {
            return null;
        }
        NewChallengeParticipantModel newChallengeParticipantModel = users.get(0);
        NewChallengeParticipantModel newChallengeParticipantModel2 = users.get(1);
        NewChallengeBetModel newChallengeBetModel = (NewChallengeBetModel) CollectionsKt.getOrNull(bets, 0);
        NewChallengeBetModel newChallengeBetModel2 = (NewChallengeBetModel) CollectionsKt.getOrNull(bets, 1);
        Iterator<NewChallengeParticipantModel> it = users.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (currentUserId != null && it.next().getId() == currentUserId.longValue()) {
                break;
            }
            i++;
        }
        if (i == 1) {
            return new OrderedBattleParticipants(newChallengeParticipantModel2, newChallengeParticipantModel, newChallengeBetModel2, newChallengeBetModel, secondHighlight, firstHighlight);
        }
        return new OrderedBattleParticipants(newChallengeParticipantModel, newChallengeParticipantModel2, newChallengeBetModel, newChallengeBetModel2, firstHighlight, secondHighlight);
    }
}
