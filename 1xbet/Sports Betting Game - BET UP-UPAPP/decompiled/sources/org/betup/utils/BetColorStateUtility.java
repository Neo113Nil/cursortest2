package org.betup.utils;

import android.util.Log;
import android.widget.TextView;
import org.betup.R;

/* loaded from: classes4.dex */
public final class BetColorStateUtility {
    private BetColorStateUtility() {
    }

    public static void displayBetPut(TextView match, TextView info, boolean animated) {
        Log.d("BETLIST", "DISPLAYING PUT ANIMATED = " + animated);
        match.setBackgroundResource(R.drawable.bet_item_put);
        match.setTextColor(-16777216);
        info.setBackgroundResource(R.drawable.bet_info_put);
        info.setTextColor(-16777216);
    }

    public static void displayBetState(TextView match, TextView info) {
        if (match.getText().toString().equals("-")) {
            displayBetNotAvailable(match, info);
        } else {
            displayBetAvailable(match, info);
        }
    }

    public static void displayBetAvailable(TextView match, TextView info) {
        match.setBackgroundResource(R.drawable.bet_item_available);
        match.setTextColor(-16777216);
        info.setBackgroundResource(R.drawable.bet_info);
        info.setTextColor(-1);
    }

    public static void displayBetNotAvailable(TextView match, TextView info) {
        match.setBackgroundResource(R.drawable.bet_item_not_available);
        int color = match.getContext().getResources().getColor(R.color.bet_text_color_put);
        match.setTextColor(color);
        info.setBackgroundResource(R.drawable.bet_info_not_available);
        info.setTextColor(color);
    }
}
