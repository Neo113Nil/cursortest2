package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;
import org.betup.utils.SharedPrefs;

/* loaded from: classes2.dex */
public class LeaderboardInfoDialog extends BaseDialog {

    @BindView(R.id.desc)
    TextView desc;

    @BindView(R.id.investment)
    TextView investment;

    @BindView(R.id.question)
    TextView question;

    @BindView(R.id.theMore)
    TextView theMore;

    @BindView(R.id.title)
    TextView title;

    @OnClick({R.id.ok})
    public void onOkClick(View ok) {
        dismiss();
        SharedPrefs.saveLeaderboardDialogShown(getContext());
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.desc.setText(R.string.rankings_are_calculated_based_on_your);
        this.investment.setText(Html.fromHtml(getContext().getString(R.string.roi_return_on_investment)));
        this.theMore.setText(Html.fromHtml(getContext().getString(R.string.the_more_you_win_and_less_you_lose)));
        this.question.setText(Html.fromHtml(getContext().getString(R.string.do_you_have_what_it_takes_to_become)));
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
    }

    public LeaderboardInfoDialog(Context context) {
        super(R.layout.dialog_leaderboard, context);
    }
}
