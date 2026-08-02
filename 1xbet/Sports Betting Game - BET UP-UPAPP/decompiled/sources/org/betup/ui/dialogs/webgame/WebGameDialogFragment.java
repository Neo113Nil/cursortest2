package org.betup.ui.dialogs.webgame;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.BetUpApp;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.games.promo.MiniGameRoundPromoHelper;
import org.betup.games.webgame.WebGameWinVideoConfig;
import org.betup.model.remote.api.rest.user.ReportDailyQuestClientEventInteractor;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment;
import org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeHandler;
import org.betup.ui.dialogs.webgame.bridge.WebGameHostBridge;
import org.betup.utils.DialogManager;
import org.betup.utils.SharedPrefs;
import org.betup.utils.WebViewDialogStateGuard;
import org.betup.utils.balance.BalanceHolder;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: WebGameDialogFragment.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020*H\u0016J$\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u000101H\u0016J\u0010\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020*H\u0002J\b\u0010C\u001a\u00020*H\u0002J\u0010\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020\"H\u0016J\u0006\u0010F\u001a\u00020*J\b\u0010G\u001a\u00020*H\u0002J\b\u0010H\u001a\u00020AH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006J"}, d2 = {"Lorg/betup/ui/dialogs/webgame/WebGameDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/utils/balance/BalanceHolder$BalanceUpdateListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "balanceHolder", "Lorg/betup/utils/balance/BalanceHolder;", "getBalanceHolder", "()Lorg/betup/utils/balance/BalanceHolder;", "setBalanceHolder", "(Lorg/betup/utils/balance/BalanceHolder;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "reportDailyQuestClientEventInteractor", "Lorg/betup/model/remote/api/rest/user/ReportDailyQuestClientEventInteractor;", "getReportDailyQuestClientEventInteractor", "()Lorg/betup/model/remote/api/rest/user/ReportDailyQuestClientEventInteractor;", "setReportDailyQuestClientEventInteractor", "(Lorg/betup/model/remote/api/rest/user/ReportDailyQuestClientEventInteractor;)V", "promoService", "Lorg/betup/services/offer/PromoService;", "getPromoService", "()Lorg/betup/services/offer/PromoService;", "setPromoService", "(Lorg/betup/services/offer/PromoService;)V", "mainHandler", "Landroid/os/Handler;", "gameWebView", "Landroid/webkit/WebView;", "lastWinProfitAmount", "", "playUrl", "", "getPlayUrl", "()Ljava/lang/String;", "gameCode", "getGameCode", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onStop", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onDestroyView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "createBridgeHandler", "Lorg/betup/ui/dialogs/webgame/bridge/BetupWebGameBridgeHandler;", "handleRoundEnded", "won", "", "showWinVideoBonusOffer", "showNotEnoughBetcoinsOffer", "onBalanceUpdated", "balance", "scheduleBalanceSyncFromHost", "syncBalanceToWebGame", "canShowRewardedAdOffers", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebGameDialogFragment extends DialogFragment implements BalanceHolder.BalanceUpdateListener {
    private static final String ARG_GAME_CODE = "arg_game_code";
    private static final String ARG_PLAY_URL = "arg_play_url";
    private static final long HOST_BALANCE_SYNC_RETRY_MS = 700;
    public static final String TAG = "WebGameDialogFragment";
    private static final long WIN_VIDEO_OFFER_DELAY_MS = 600;

    @Inject
    public BalanceHolder balanceHolder;
    private WebView gameWebView;
    private long lastWinProfitAmount;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    @Inject
    public PromoService promoService;

    @Inject
    public ReportDailyQuestClientEventInteractor reportDailyQuestClientEventInteractor;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final BalanceHolder getBalanceHolder() {
        BalanceHolder balanceHolder = this.balanceHolder;
        if (balanceHolder != null) {
            return balanceHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("balanceHolder");
        return null;
    }

    public final void setBalanceHolder(BalanceHolder balanceHolder) {
        Intrinsics.checkNotNullParameter(balanceHolder, "<set-?>");
        this.balanceHolder = balanceHolder;
    }

    public final VideoRewardService getVideoRewardService() {
        VideoRewardService videoRewardService = this.videoRewardService;
        if (videoRewardService != null) {
            return videoRewardService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoRewardService");
        return null;
    }

    public final void setVideoRewardService(VideoRewardService videoRewardService) {
        Intrinsics.checkNotNullParameter(videoRewardService, "<set-?>");
        this.videoRewardService = videoRewardService;
    }

    public final ReportDailyQuestClientEventInteractor getReportDailyQuestClientEventInteractor() {
        ReportDailyQuestClientEventInteractor reportDailyQuestClientEventInteractor = this.reportDailyQuestClientEventInteractor;
        if (reportDailyQuestClientEventInteractor != null) {
            return reportDailyQuestClientEventInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reportDailyQuestClientEventInteractor");
        return null;
    }

    public final void setReportDailyQuestClientEventInteractor(ReportDailyQuestClientEventInteractor reportDailyQuestClientEventInteractor) {
        Intrinsics.checkNotNullParameter(reportDailyQuestClientEventInteractor, "<set-?>");
        this.reportDailyQuestClientEventInteractor = reportDailyQuestClientEventInteractor;
    }

    public final PromoService getPromoService() {
        PromoService promoService = this.promoService;
        if (promoService != null) {
            return promoService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promoService");
        return null;
    }

    public final void setPromoService(PromoService promoService) {
        Intrinsics.checkNotNullParameter(promoService, "<set-?>");
        this.promoService = promoService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPlayUrl() {
        String string = requireArguments().getString(ARG_PLAY_URL);
        return string == null ? "" : string;
    }

    private final String getGameCode() {
        String string = requireArguments().getString(ARG_GAME_CODE);
        return string == null ? "" : string;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        getBalanceHolder().addListener(this);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawableResource(R.color.black);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getBalanceHolder().removeListener(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        WebViewDialogStateGuard.INSTANCE.stripFragmentViewState(outState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        WebViewDialogStateGuard.INSTANCE.destroy(this.gameWebView);
        this.gameWebView = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        BetupWebGameBridgeHandler createBridgeHandler = createBridgeHandler();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setBackgroundColor(-16777216);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1817059443, true, new WebGameDialogFragment$onCreateView$1$1(this, createBridgeHandler)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }

    private final BetupWebGameBridgeHandler createBridgeHandler() {
        final String gameCode = getGameCode();
        return new BetupWebGameBridgeHandler() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$createBridgeHandler$1
            @Override // org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeHandler
            public void onBalanceUpdatedJson(String payload) {
                Intrinsics.checkNotNullParameter(payload, "payload");
                WebGameDialogFragment webGameDialogFragment = WebGameDialogFragment.this;
                String str = gameCode;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    WebGameDialogFragment$createBridgeHandler$1 webGameDialogFragment$createBridgeHandler$1 = this;
                    JSONObject jSONObject = new JSONObject(payload);
                    if (Intrinsics.areEqual(jSONObject.optString("eventType"), "BALANCE_UPDATED")) {
                        long optLong = jSONObject.optLong("balanceDelta", 0L);
                        if (optLong != 0) {
                            long lastBalance = webGameDialogFragment.getBalanceHolder().getLastBalance();
                            if (lastBalance >= 0) {
                                webGameDialogFragment.getBalanceHolder().postOptimisticBalance(RangesKt.coerceAtLeast(lastBalance + optLong, 0L));
                            }
                        }
                        EventBus.getDefault().post(new UserProfileUpdatedMessage());
                        AnalyticsHelper.INSTANCE.logMiniGameBalanceUpdated(str);
                        Result.m10853constructorimpl(Unit.INSTANCE);
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
            }

            @Override // org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeHandler
            public void onGameResultJson(String payload) {
                Intrinsics.checkNotNullParameter(payload, "payload");
                AnalyticsHelper.INSTANCE.logMiniGameResult(gameCode);
                WebGameDialogFragment webGameDialogFragment = WebGameDialogFragment.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    WebGameDialogFragment$createBridgeHandler$1 webGameDialogFragment$createBridgeHandler$1 = this;
                    JSONObject jSONObject = new JSONObject(payload);
                    if (Intrinsics.areEqual(jSONObject.optString("eventType"), "GAME_RESULT")) {
                        boolean areEqual = Intrinsics.areEqual(jSONObject.optString("result"), "Won");
                        if (areEqual) {
                            long optLong = jSONObject.optLong("profitAmount", Long.MIN_VALUE);
                            if (optLong < 0) {
                                optLong = RangesKt.coerceAtLeast(jSONObject.optLong("returnAmount", 0L) - jSONObject.optLong("betAmount", 0L), 0L);
                            }
                            webGameDialogFragment.lastWinProfitAmount = optLong;
                        }
                        webGameDialogFragment.handleRoundEnded(areEqual);
                        EventBus.getDefault().post(new UserProfileUpdatedMessage());
                    }
                    Result.m10853constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
            }

            @Override // org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeHandler
            public void onNotEnoughMoneyJson(String payload) {
                Intrinsics.checkNotNullParameter(payload, "payload");
                AnalyticsHelper.INSTANCE.logMiniGameInsufficientFunds(gameCode);
                AnalyticsHelper.INSTANCE.logNotEnoughMoney("mini_game");
                WebGameDialogFragment.this.showNotEnoughBetcoinsOffer();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRoundEnded(boolean won) {
        if (isAdded()) {
            MiniGameRoundPromoHelper.PromoAction onRoundEnded = MiniGameRoundPromoHelper.INSTANCE.onRoundEnded(requireContext(), won, getGameCode(), new Function0() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleRoundEnded$lambda$2;
                    handleRoundEnded$lambda$2 = WebGameDialogFragment.handleRoundEnded$lambda$2(WebGameDialogFragment.this);
                    return handleRoundEnded$lambda$2;
                }
            });
            if (won && canShowRewardedAdOffers() && onRoundEnded != MiniGameRoundPromoHelper.PromoAction.INTERSTITIAL_SCHEDULED && WebGameWinVideoConfig.INSTANCE.supportsWinVideoBonus(getGameCode())) {
                SharedPrefs.trackWebGameWinForDoubleDialog(requireContext());
                WebGameWinVideoConfig webGameWinVideoConfig = WebGameWinVideoConfig.INSTANCE;
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                if (webGameWinVideoConfig.shouldShowWinVideoBonusDialog(requireContext, canShowRewardedAdOffers())) {
                    SharedPrefs.resetWebGameWinDoubleDialogCounter(requireContext());
                    this.mainHandler.postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            WebGameDialogFragment.this.showWinVideoBonusOffer();
                        }
                    }, WIN_VIDEO_OFFER_DELAY_MS);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleRoundEnded$lambda$2(WebGameDialogFragment webGameDialogFragment) {
        webGameDialogFragment.getReportDailyQuestClientEventInteractor().reportMinigameWon();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWinVideoBonusOffer() {
        if (canShowRewardedAdOffers() && isAdded() && getChildFragmentManager().findFragmentByTag(WebGameWinVideoOfferDialogFragment.TAG) == null) {
            WebGameWinVideoOfferDialogFragment newInstance = WebGameWinVideoOfferDialogFragment.INSTANCE.newInstance(this.lastWinProfitAmount);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            DialogManager.showDialogSafely(newInstance, childFragmentManager, WebGameWinVideoOfferDialogFragment.TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotEnoughBetcoinsOffer() {
        if (isAdded()) {
            this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    WebGameDialogFragment.showNotEnoughBetcoinsOffer$lambda$5(WebGameDialogFragment.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNotEnoughBetcoinsOffer$lambda$5(final WebGameDialogFragment webGameDialogFragment) {
        if (webGameDialogFragment.isAdded()) {
            if (!webGameDialogFragment.canShowRewardedAdOffers()) {
                NotEnoughBetcoinsVideoOfferDialogFragment newInstance = NotEnoughBetcoinsVideoOfferDialogFragment.INSTANCE.newInstance(0L, 0L);
                FragmentManager childFragmentManager = webGameDialogFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                DialogManager.showDialogSafely(newInstance, childFragmentManager, NotEnoughBetcoinsVideoOfferDialogFragment.TAG);
                return;
            }
            webGameDialogFragment.getVideoRewardService().checkVideoRewardAndContinue(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, null, new VideoRewardService.VideoRewardInfoListener() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$$ExternalSyntheticLambda0
                @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
                public final void onVideoRewardInfoUpdated(VideoRewardPlacementInfo videoRewardPlacementInfo) {
                    WebGameDialogFragment.showNotEnoughBetcoinsOffer$lambda$5$lambda$4(WebGameDialogFragment.this, videoRewardPlacementInfo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNotEnoughBetcoinsOffer$lambda$5$lambda$4(WebGameDialogFragment webGameDialogFragment, VideoRewardPlacementInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (webGameDialogFragment.isAdded()) {
            NotEnoughBetcoinsVideoOfferDialogFragment newInstance = NotEnoughBetcoinsVideoOfferDialogFragment.INSTANCE.newInstance((!info.isAvailable() || info.isQuotaExhausted()) ? 0L : info.getPrizeAmount(), 0L);
            FragmentManager childFragmentManager = webGameDialogFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            DialogManager.showDialogSafely(newInstance, childFragmentManager, NotEnoughBetcoinsVideoOfferDialogFragment.TAG);
        }
    }

    @Override // org.betup.utils.balance.BalanceHolder.BalanceUpdateListener
    public void onBalanceUpdated(long balance) {
        syncBalanceToWebGame();
    }

    public final void scheduleBalanceSyncFromHost() {
        if (isAdded()) {
            this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    WebGameDialogFragment.this.syncBalanceToWebGame();
                }
            });
            this.mainHandler.postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    WebGameDialogFragment.this.syncBalanceToWebGame();
                }
            }, 700L);
            this.mainHandler.postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    WebGameDialogFragment.this.syncBalanceToWebGame();
                }
            }, 1400L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncBalanceToWebGame() {
        final WebView webView = this.gameWebView;
        if (webView != null && isAdded()) {
            webView.post(new Runnable() { // from class: org.betup.ui.dialogs.webgame.WebGameDialogFragment$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    WebGameDialogFragment.syncBalanceToWebGame$lambda$9(WebGameDialogFragment.this, webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncBalanceToWebGame$lambda$9(WebGameDialogFragment webGameDialogFragment, WebView webView) {
        if (webGameDialogFragment.isAdded()) {
            webView.evaluateJavascript(WebGameHostBridge.INSTANCE.getRefreshBalanceScript(), null);
        }
    }

    private final boolean canShowRewardedAdOffers() {
        return getPromoService().isUserPromoEnabled();
    }

    /* compiled from: WebGameDialogFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lorg/betup/ui/dialogs/webgame/WebGameDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_PLAY_URL", "ARG_GAME_CODE", "WIN_VIDEO_OFFER_DELAY_MS", "", "HOST_BALANCE_SYNC_RETRY_MS", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/webgame/WebGameDialogFragment;", "playUrl", "gameCode", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WebGameDialogFragment newInstance(String playUrl, String gameCode) {
            Intrinsics.checkNotNullParameter(playUrl, "playUrl");
            Intrinsics.checkNotNullParameter(gameCode, "gameCode");
            WebGameDialogFragment webGameDialogFragment = new WebGameDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(WebGameDialogFragment.ARG_PLAY_URL, playUrl);
            bundle.putString(WebGameDialogFragment.ARG_GAME_CODE, gameCode);
            webGameDialogFragment.setArguments(bundle);
            return webGameDialogFragment;
        }
    }
}
