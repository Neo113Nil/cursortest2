package org.betup.ui.dialogs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.Log;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.Gson;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.model.local.entity.TicketBetlistConfig;
import org.betup.services.user.UserService;
import org.betup.utils.DimensionsUtil;
import org.betup.utils.OddHelper;

/* loaded from: classes2.dex */
public class TicketsInfoDialog extends BaseBlurredDialog {
    private static final String IMG_PLACEHOLDER = "[img]";
    private static final String TICKET_INFO_TAG = TicketBetlistConfig.class.getName();

    @BindView(R.id.bet_cost)
    TextView betCost;

    @BindView(R.id.bet_mega_win)
    TextView betMegaWin;

    @BindView(R.id.bet_win)
    TextView betWin;

    @Inject
    FirebaseRemoteConfig firebaseRemoteConfig;

    @BindView(R.id.introducing)
    TextView introducing;

    @Inject
    UserService userService;

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_tickets_info;
    }

    public TicketsInfoDialog(Context context) {
        super(context);
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getContext().getApplicationContext()).getComponent().inject(this);
        this.introducing.setText(Html.fromHtml(getContext().getString(R.string.introducing_tickets)));
        long j = this.firebaseRemoteConfig.getLong(RemoteConfigConstants.TICKET_FEE);
        TicketBetlistConfig ticketParams = getTicketParams();
        this.betCost.setText(prepareTextWithTicket(R.string.tickets_bet_cost, Long.valueOf(j)));
        this.betWin.setText(prepareTextWithTicket(R.string.tickets_if_bet_wins, Long.valueOf(j)));
        this.betMegaWin.setText(prepareTextWithTicket(R.string.tickets_if_bet_mega_wins, OddHelper.format(this.userService.getOddType(), ticketParams.getOdds()), Long.valueOf(j + ticketParams.getBonus())));
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }

    private Spannable prepareTextWithTicket(int strRes, Object... values) {
        int pixelsFromDp = DimensionsUtil.getPixelsFromDp(getContext(), 20);
        SpannableString spannableString = new SpannableString(Html.fromHtml(getContext().getString(strRes, values)));
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.ticket);
        drawable.setBounds(0, 0, pixelsFromDp, pixelsFromDp);
        ImageSpan imageSpan = new ImageSpan(drawable, 0);
        int indexOf = spannableString.toString().indexOf(IMG_PLACEHOLDER);
        if (indexOf < 0) {
            return new SpannableString("");
        }
        spannableString.setSpan(imageSpan, indexOf, IMG_PLACEHOLDER.length() + indexOf, 17);
        return spannableString;
    }

    private TicketBetlistConfig getTicketParams() {
        TicketBetlistConfig ticketBetlistConfig;
        try {
            ticketBetlistConfig = (TicketBetlistConfig) new Gson().fromJson(this.firebaseRemoteConfig.getString(RemoteConfigConstants.TICKET_BETLIST_WON_KEY), TicketBetlistConfig.class);
        } catch (Exception unused) {
            Log.d(TICKET_INFO_TAG, "Failed to parse ticket info config");
            ticketBetlistConfig = null;
        }
        return ticketBetlistConfig == null ? new TicketBetlistConfig() : ticketBetlistConfig;
    }
}
