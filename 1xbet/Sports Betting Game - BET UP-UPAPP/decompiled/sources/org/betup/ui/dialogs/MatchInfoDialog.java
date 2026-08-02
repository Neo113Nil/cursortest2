package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.Locale;
import org.betup.R;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.notifications.NotificationMatch;
import org.betup.model.remote.entity.notifications.NotificationTask;
import org.betup.utils.FormatHelper;
import org.betup.utils.PicassoHelper;

/* loaded from: classes2.dex */
public class MatchInfoDialog extends BaseDialog {

    @BindView(R.id.awayicon)
    ImageView awayIcon;

    @BindView(R.id.awayTeam)
    TextView awayTeam;

    @BindView(R.id.desc)
    TextView desc;

    @BindView(R.id.ok)
    TextView firstButton;

    @BindView(R.id.homeIcon)
    ImageView homeIcon;

    @BindView(R.id.homeTeam)
    TextView homeTeam;
    private OnMatchDialogClickListener listener;
    private NotificationMatch match;

    @BindView(R.id.score)
    TextView score;

    @BindView(R.id.secondButton)
    TextView secondButton;
    private NotificationTask.TaskType taskType;

    @BindView(R.id.subtitle)
    TextView title;

    public interface OnMatchDialogClickListener {
        void onFirstButtonClick(NotificationMatch match);

        void onSecondButtonClick();
    }

    public int getMatchId() {
        return this.match.getMatchId();
    }

    public MatchInfoDialog(Context context, NotificationMatch match, NotificationTask.TaskType taskType, OnMatchDialogClickListener listener) {
        super(R.layout.match_dialog, context);
        this.match = match;
        this.taskType = taskType;
        this.listener = listener;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ButterKnife.bind(this);
        this.desc.setVisibility(8);
        MatchDetailsDataModel match = this.match.getMatch();
        int i = AnonymousClass3.$SwitchMap$org$betup$model$remote$entity$notifications$NotificationTask$TaskType[this.taskType.ordinal()];
        if (i == 1) {
            this.title.setText(R.string.match_started_notification);
        } else if (i == 2) {
            this.title.setText(R.string.match_score_changed);
        } else if (i == 3) {
            this.title.setText(R.string.match_finished_notification);
        }
        PicassoHelper.with(getContext()).setImageUrl(match.getHomeTeam().getPhotoUrl()).setImageView(this.homeIcon).load();
        PicassoHelper.with(getContext()).setImageUrl(match.getAwayTeam().getPhotoUrl()).setImageView(this.awayIcon).load();
        this.awayTeam.setText(match.getAwayTeam().getName());
        this.homeTeam.setText(match.getHomeTeam().getName());
        this.score.setText(String.format(Locale.getDefault(), "%s : %s", FormatHelper.getScoreFormatted(match.getScoreHome().floatValue()), FormatHelper.getScoreFormatted(match.getScoreAway().floatValue())));
        this.firstButton.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.MatchInfoDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                MatchInfoDialog.this.dismiss();
                MatchInfoDialog.this.listener.onFirstButtonClick(MatchInfoDialog.this.match);
            }
        });
        this.secondButton.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.MatchInfoDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                MatchInfoDialog.this.dismiss();
                MatchInfoDialog.this.listener.onSecondButtonClick();
            }
        });
    }

    /* renamed from: org.betup.ui.dialogs.MatchInfoDialog$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$remote$entity$notifications$NotificationTask$TaskType;

        static {
            int[] iArr = new int[NotificationTask.TaskType.values().length];
            $SwitchMap$org$betup$model$remote$entity$notifications$NotificationTask$TaskType = iArr;
            try {
                iArr[NotificationTask.TaskType.MATCH_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$notifications$NotificationTask$TaskType[NotificationTask.TaskType.SCORE_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$model$remote$entity$notifications$NotificationTask$TaskType[NotificationTask.TaskType.MATCH_FINISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
