package org.betup.utils;

import kotlin.Metadata;
import org.betup.R;

/* compiled from: QuizUiExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"getQuizIcon", "", "(Ljava/lang/Integer;)I", "getQuizTitle", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizUiExtensionsKt {
    public static final int getQuizIcon(Integer num) {
        return num == null ? R.drawable.puzzle_icon_new_selected : num.intValue() == 4 ? R.drawable.won_gold : num.intValue() == 8 ? R.drawable.lost_gold : num.intValue() == 2 ? R.drawable.in_play_gold : (num.intValue() == 1 || num.intValue() == 32) ? R.drawable.return_gold : R.drawable.puzzle_icon_new_selected;
    }

    public static final int getQuizTitle(Integer num) {
        return num == null ? R.string.drawer_sub_bets_all : num.intValue() == 2 ? R.string.drawer_sub_bets_in_play : num.intValue() == 4 ? R.string.drawer_sub_bets_won : num.intValue() == 8 ? R.string.drawer_sub_bets_lost : (num.intValue() == 1 || num.intValue() == 32) ? R.string.drawer_sub_bets_returned : R.string.drawer_sub_bets_all;
    }
}
