package org.betup.games.doubles.ui;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.betup.databinding.FragmentDoubleGameBinding;
import org.betup.games.doubles.model.rest.DoubleBetType;
import org.betup.games.doubles.model.rest.SessionDoubleGame;
import org.betup.games.doubles.model.rest.SessionHistoryDoubleGame;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;

/* compiled from: DoubleGameFragment.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J \u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"org/betup/games/doubles/ui/DoubleGameFragment$onGameStarted$1", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/doubles/model/rest/SessionDoubleGame;", "", "onFetched", "", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleGameFragment$onGameStarted$1 implements BaseCachedSharedInteractor.OnFetchedListener<SessionDoubleGame, Integer> {
    final /* synthetic */ DoubleGameFragment this$0;

    DoubleGameFragment$onGameStarted$1(DoubleGameFragment doubleGameFragment) {
        this.this$0 = doubleGameFragment;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<SessionDoubleGame, Integer> responseMessage) {
        boolean isActive;
        long j;
        boolean isActive2;
        if ((responseMessage != null ? responseMessage.getStat() : null) != FetchStat.SUCCESS) {
            j = this.this$0.stakeForCurrentRound;
            this.this$0.stakeForCurrentRound = 0L;
            if (j > 0) {
                this.this$0.refundOptimisticStake(j);
            }
            isActive2 = this.this$0.isActive();
            if (isActive2) {
                this.this$0.recoverFromFailedStartGameUi();
                return;
            }
            return;
        }
        isActive = this.this$0.isActive();
        if (isActive) {
            final SessionDoubleGame model = responseMessage.getModel();
            final SessionHistoryDoubleGame sessionHistoryDoubleGame = new SessionHistoryDoubleGame(model.getId(), model.getBetType(), model.getOrdinal());
            DoubleGameFragment doubleGameFragment = this.this$0;
            doubleGameFragment.stopRoulette(doubleGameFragment.getHandler(), model.getBetType(), model.getOrdinal());
            Handler handler = new Handler(Looper.getMainLooper());
            final DoubleGameFragment doubleGameFragment2 = this.this$0;
            handler.postDelayed(new Runnable() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$onGameStarted$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DoubleGameFragment$onGameStarted$1.onFetched$lambda$2(DoubleGameFragment.this, model, sessionHistoryDoubleGame);
                }
            }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$2(DoubleGameFragment doubleGameFragment, SessionDoubleGame sessionDoubleGame, SessionHistoryDoubleGame sessionHistoryDoubleGame) {
        FragmentDoubleGameBinding binding;
        FragmentDoubleGameBinding binding2;
        long j;
        DoubleBetType doubleBetType;
        binding = doubleGameFragment.getBinding();
        binding.rouletteCenterBgV.animate().alpha(1.0f).setDuration(300L).start();
        binding2 = doubleGameFragment.getBinding();
        RecyclerView recyclerView = binding2.historyRv;
        doubleGameFragment.setupHistoryRecycler();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        HistoryDoubleGameAdapter historyDoubleGameAdapter = adapter instanceof HistoryDoubleGameAdapter ? (HistoryDoubleGameAdapter) adapter : null;
        if (historyDoubleGameAdapter != null) {
            historyDoubleGameAdapter.addSession(sessionHistoryDoubleGame);
        }
        recyclerView.smoothScrollToPosition(0);
        doubleGameFragment._isGameStarted = false;
        doubleGameFragment.stopTimer();
        doubleGameFragment.toggleClickabilityButtons(true);
        j = doubleGameFragment.stakeForCurrentRound;
        Long valueOf = Long.valueOf(j);
        Long l = valueOf.longValue() > 0 ? valueOf : null;
        long longValue = l != null ? l.longValue() : doubleGameFragment.getAmount();
        boolean z = sessionDoubleGame.getReturnAmount() > 0;
        long coerceAtLeast = RangesKt.coerceAtLeast(sessionDoubleGame.getReturnAmount(), 0L);
        DoubleBetType betType = sessionDoubleGame.getBetType();
        doubleBetType = doubleGameFragment.betTypeSelected;
        doubleGameFragment.showResultDialog(new ResultDialogDoubleGameDto(doubleBetType, betType, (int) longValue, (int) sessionDoubleGame.getReturnAmount(), z), sessionDoubleGame.getId());
        if (z) {
            doubleGameFragment.scheduleOptimisticWinCreditThenServerRefresh(coerceAtLeast);
        } else {
            doubleGameFragment.scheduleServerBalanceRefreshDelayed();
        }
        doubleGameFragment.stakeForCurrentRound = 0L;
    }
}
