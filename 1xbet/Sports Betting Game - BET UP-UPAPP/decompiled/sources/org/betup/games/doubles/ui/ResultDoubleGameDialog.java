package org.betup.games.doubles.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Spread;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import nl.dionsegijn.konfetti.xml.image.ImageUtil;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.VideoRewardReceivedMessage;
import org.betup.databinding.FragmentResultDoubleGameDialogBinding;
import org.betup.games.doubles.model.rest.DoubleBetType;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.utils.FormatHelper;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: ResultDoubleGameDialog.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001CB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010'\u001a\u00020\u000eH\u0016J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020)2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u00100\u001a\u00020\u000eH\u0003J\b\u00101\u001a\u00020\u000eH\u0002J\b\u00102\u001a\u00020\u000eH\u0016J\b\u00103\u001a\u00020\u000eH\u0002J\u0010\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u000206H\u0017J\u0018\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u0015H\u0002J\u0018\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020<2\u0006\u00109\u001a\u00020\u0015H\u0017J\u0012\u0010=\u001a\u00020\u000e2\b\u0010>\u001a\u0004\u0018\u00010?H\u0007J\u0010\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020BH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lorg/betup/games/doubles/ui/ResultDoubleGameDialog;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "result", "Lorg/betup/games/doubles/ui/ResultDialogDoubleGameDto;", "_binding", "Lorg/betup/databinding/FragmentResultDoubleGameDialogBinding;", "binding", "getBinding", "()Lorg/betup/databinding/FragmentResultDoubleGameDialogBinding;", "onHomeClick", "Lkotlin/Function0;", "", "onVideoClicked", "onGamePlayed", "Lkotlin/reflect/KFunction1;", "", "onDismissCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "returnAmount", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "videoRewardCheckJob", "Lkotlinx/coroutines/Job;", "VIDEO_REWARD_CHECK_INTERVAL", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onStart", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "initLayout", "initListeners", "onDestroy", "schedulePeriodicVideoRewardCheck", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "updateOfferState", "isAvailable", "amount", "onVideoRewardRequestProcessed", "videoRedeemResult", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "onVideoRewardReceived", "message", "Lorg/betup/bus/VideoRewardReceivedMessage;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultDoubleGameDialog extends DialogFragment implements VideoRewardService.VideoRewardServiceClient {
    private static final String ARGS_RESULT = "result";
    private final long VIDEO_REWARD_CHECK_INTERVAL = 5000;
    private FragmentResultDoubleGameDialogBinding _binding;
    private Function1<? super Long, Unit> onDismissCallback;
    private KFunction<Unit> onGamePlayed;
    private Function0<Unit> onHomeClick;
    private Function0<Unit> onVideoClicked;
    private ResultDialogDoubleGameDto result;
    private Job videoRewardCheckJob;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ResultDoubleGameDialog.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DoubleBetType.values().length];
            try {
                iArr[DoubleBetType.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DoubleBetType.BLACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DoubleBetType.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentResultDoubleGameDialogBinding getBinding() {
        FragmentResultDoubleGameDialogBinding fragmentResultDoubleGameDialogBinding = this._binding;
        if (fragmentResultDoubleGameDialogBinding != null) {
            return fragmentResultDoubleGameDialogBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_binding");
        return null;
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

    /* compiled from: ResultDoubleGameDialog.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\f0\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/betup/games/doubles/ui/ResultDoubleGameDialog$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARGS_RESULT", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/games/doubles/ui/ResultDoubleGameDialog;", "result", "Lorg/betup/games/doubles/ui/ResultDialogDoubleGameDto;", "onHomeClick", "Lkotlin/Function0;", "", "onVideoClicked", "onGamePlayed", "Lkotlin/reflect/KFunction1;", "", "onDismiss", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "returnAmount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ResultDoubleGameDialog newInstance(ResultDialogDoubleGameDto result, Function0<Unit> onHomeClick, Function0<Unit> onVideoClicked, KFunction<Unit> onGamePlayed, Function1<? super Long, Unit> onDismiss) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(onHomeClick, "onHomeClick");
            Intrinsics.checkNotNullParameter(onVideoClicked, "onVideoClicked");
            Intrinsics.checkNotNullParameter(onGamePlayed, "onGamePlayed");
            Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
            ResultDoubleGameDialog resultDoubleGameDialog = new ResultDoubleGameDialog();
            Bundle bundle = new Bundle();
            bundle.putSerializable("result", result);
            resultDoubleGameDialog.setArguments(bundle);
            resultDoubleGameDialog.onHomeClick = onHomeClick;
            resultDoubleGameDialog.onVideoClicked = onVideoClicked;
            resultDoubleGameDialog.onGamePlayed = onGamePlayed;
            resultDoubleGameDialog.onDismissCallback = onDismiss;
            return resultDoubleGameDialog;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.result == null) {
            Bundle arguments = getArguments();
            Serializable serializable = arguments != null ? arguments.getSerializable("result") : null;
            ResultDialogDoubleGameDto resultDialogDoubleGameDto = serializable instanceof ResultDialogDoubleGameDto ? (ResultDialogDoubleGameDto) serializable : null;
            if (resultDialogDoubleGameDto != null) {
                this.result = resultDialogDoubleGameDto;
            }
        }
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        getVideoRewardService().connectClient(PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE, null, this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.setDimAmount(0.7f);
        }
        if (window != null) {
            window.setLayout(-1, -1);
        }
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.double_game_result_dialog_bg);
        }
        if (window != null) {
            window.setFlags(512, 512);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentResultDoubleGameDialogBinding.inflate(inflater, container, false);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.result == null) {
            dismissAllowingStateLoss();
            return;
        }
        initLayout();
        initListeners();
        KFunction<Unit> kFunction = this.onGamePlayed;
        if (kFunction != null) {
            Function1 function1 = (Function1) kFunction;
            ResultDialogDoubleGameDto resultDialogDoubleGameDto = this.result;
            if (resultDialogDoubleGameDto == null) {
                Intrinsics.throwUninitializedPropertyAccessException("result");
                resultDialogDoubleGameDto = null;
            }
            function1.invoke(Boolean.valueOf(resultDialogDoubleGameDto.isWin()));
        }
        ResultDialogDoubleGameDto resultDialogDoubleGameDto2 = this.result;
        if (resultDialogDoubleGameDto2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            resultDialogDoubleGameDto2 = null;
        }
        if (resultDialogDoubleGameDto2.isWin()) {
            getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE, 1000L, null);
        }
    }

    private final void initLayout() {
        int i;
        FragmentResultDoubleGameDialogBinding binding = getBinding();
        ResultDialogDoubleGameDto resultDialogDoubleGameDto = this.result;
        ResultDialogDoubleGameDto resultDialogDoubleGameDto2 = null;
        if (resultDialogDoubleGameDto == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            resultDialogDoubleGameDto = null;
        }
        if (resultDialogDoubleGameDto.isWin()) {
            binding.resultTv.setText(getString(R.string.double_game_result_title_win));
            binding.resultTv.setTextColor(getResources().getColor(R.color.double_game_result_dialog_win_text, requireContext().getTheme()));
            binding.subtitleTv.setVisibility(8);
            binding.resultIv.setImageResource(R.drawable.double_game_result_dialog_win);
            binding.amountTypeTv.setText(getString(R.string.double_game_result_amount_win));
            binding.amountTypeTv.setTextColor(getResources().getColor(R.color.double_game_result_dialog_win_text, requireContext().getTheme()));
            TextView textView = binding.amountTv;
            ResultDialogDoubleGameDto resultDialogDoubleGameDto3 = this.result;
            if (resultDialogDoubleGameDto3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("result");
                resultDialogDoubleGameDto3 = null;
            }
            textView.setText(FormatHelper.getShopBetcoinsFormated(resultDialogDoubleGameDto3.getPrizeAmount()));
            binding.confirmTv.setText(getString(R.string.double_game_result_confirm_win));
            binding.confirmTv.setTextColor(getResources().getColor(R.color.double_game_zero_bet_type_text, requireContext().getTheme()));
            binding.confirmLl.setBackgroundTintList(ContextCompat.getColorStateList(requireContext(), R.color.double_game_result_dialog_win_text));
            List listOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.confeti), Integer.valueOf(R.drawable.confeti2), Integer.valueOf(R.drawable.confeti3), Integer.valueOf(R.drawable.confeti4), Integer.valueOf(R.drawable.confeti5), Integer.valueOf(R.drawable.confeti6), Integer.valueOf(R.drawable.confeti7), Integer.valueOf(R.drawable.confeti8), Integer.valueOf(R.drawable.confeti9), Integer.valueOf(R.drawable.confeti10), Integer.valueOf(R.drawable.confeti11), Integer.valueOf(R.drawable.confeti12), Integer.valueOf(R.drawable.confeti13), Integer.valueOf(R.drawable.confeti14), Integer.valueOf(R.drawable.confeti15)});
            KonfettiView konfettiView = binding.konfettiView;
            List listOf2 = CollectionsKt.listOf((Object[]) new Integer[]{16572810, 16740973, 16003181, 11832815});
            EmitterConfig max = new Emitter(100L, TimeUnit.MILLISECONDS).max(100);
            Position.Relative relative = new Position.Relative(0.5d, 0.3d);
            List list = listOf;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Drawable drawable = getResources().getDrawable(((Number) it.next()).intValue(), requireContext().getTheme());
                Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                arrayList.add(ImageUtil.loadDrawable$default(drawable, false, false, 6, null));
            }
            konfettiView.start(new Party(0, Spread.ROUND, 0.0f, 30.0f, 0.9f, null, listOf2, arrayList, 0L, false, relative, 0, null, max, 6945, null));
            binding.watchAdIconIv.setVisibility(0);
        } else {
            binding.resultTv.setText(getString(R.string.double_game_result_title_lost));
            binding.resultTv.setTextColor(getResources().getColor(R.color.double_game_result_dialog_lose_text, requireContext().getTheme()));
            binding.subtitleTv.setVisibility(0);
            binding.subtitleTv.setText(getString(R.string.double_game_result_subtitle_lost));
            binding.subtitleTv.setTextColor(getResources().getColor(R.color.double_game_result_dialog_lose_text, requireContext().getTheme()));
            binding.resultIv.setImageResource(R.drawable.double_game_result_dialog_lost);
            binding.amountTypeTv.setText(getString(R.string.double_game_result_amount_lost));
            binding.amountTypeTv.setTextColor(getResources().getColor(R.color.double_game_result_dialog_lose_text, requireContext().getTheme()));
            TextView textView2 = binding.amountTv;
            ResultDialogDoubleGameDto resultDialogDoubleGameDto4 = this.result;
            if (resultDialogDoubleGameDto4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("result");
                resultDialogDoubleGameDto4 = null;
            }
            textView2.setText(FormatHelper.getShopBetcoinsFormated(resultDialogDoubleGameDto4.getBetAmount()));
            binding.confirmTv.setText(getString(R.string.double_game_result_confirm_lost));
            binding.confirmTv.setTextColor(getResources().getColor(R.color.double_game_text, requireContext().getTheme()));
            binding.confirmLl.setBackgroundTintList(ContextCompat.getColorStateList(requireContext(), R.color.double_game_result_dialog_home_btn_bg));
            binding.confirmLl.setVisibility(8);
            binding.watchAdLl.setVisibility(0);
            binding.watchAdIv.setVisibility(8);
            binding.watchAdTv.setText(getString(R.string.double_game_result_watch_ad_lost));
            binding.watchAdIconIv.setVisibility(8);
        }
        View view = binding.selectedBetTypeV;
        Resources resources = getResources();
        ResultDialogDoubleGameDto resultDialogDoubleGameDto5 = this.result;
        if (resultDialogDoubleGameDto5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            resultDialogDoubleGameDto5 = null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[resultDialogDoubleGameDto5.getSelectedBetType().ordinal()];
        int i3 = R.drawable.double_game_bet_type_result_dialog_zero_bg;
        if (i2 == 1) {
            i = R.drawable.double_game_bet_type_result_dialog_red_bg;
        } else if (i2 == 2) {
            i = R.drawable.double_game_bet_type_result_dialog_black_bg;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.double_game_bet_type_result_dialog_zero_bg;
        }
        view.setBackground(resources.getDrawable(i, getBinding().getRoot().getContext().getTheme()));
        View view2 = binding.resultBetTypeV;
        Resources resources2 = getResources();
        ResultDialogDoubleGameDto resultDialogDoubleGameDto6 = this.result;
        if (resultDialogDoubleGameDto6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
        } else {
            resultDialogDoubleGameDto2 = resultDialogDoubleGameDto6;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[resultDialogDoubleGameDto2.getBetType().ordinal()];
        if (i4 == 1) {
            i3 = R.drawable.double_game_bet_type_result_dialog_red_bg;
        } else if (i4 == 2) {
            i3 = R.drawable.double_game_bet_type_result_dialog_black_bg;
        } else if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        view2.setBackground(resources2.getDrawable(i3, getBinding().getRoot().getContext().getTheme()));
    }

    private final void initListeners() {
        final FragmentResultDoubleGameDialogBinding binding = getBinding();
        binding.confirmLl.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.doubles.ui.ResultDoubleGameDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultDoubleGameDialog.initListeners$lambda$5$lambda$3(ResultDoubleGameDialog.this, view);
            }
        });
        binding.watchAdLl.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.doubles.ui.ResultDoubleGameDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultDoubleGameDialog.initListeners$lambda$5$lambda$4(ResultDoubleGameDialog.this, binding, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$5$lambda$3(ResultDoubleGameDialog resultDoubleGameDialog, View view) {
        ResultDialogDoubleGameDto resultDialogDoubleGameDto = resultDoubleGameDialog.result;
        if (resultDialogDoubleGameDto == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            resultDialogDoubleGameDto = null;
        }
        if (resultDialogDoubleGameDto.isWin()) {
            resultDoubleGameDialog.dismiss();
            return;
        }
        Function0<Unit> function0 = resultDoubleGameDialog.onHomeClick;
        if (function0 != null) {
            function0.invoke();
        } else {
            resultDoubleGameDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$5$lambda$4(ResultDoubleGameDialog resultDoubleGameDialog, FragmentResultDoubleGameDialogBinding fragmentResultDoubleGameDialogBinding, View view) {
        ResultDialogDoubleGameDto resultDialogDoubleGameDto = resultDoubleGameDialog.result;
        if (resultDialogDoubleGameDto == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            resultDialogDoubleGameDto = null;
        }
        if (resultDialogDoubleGameDto.isWin() && fragmentResultDoubleGameDialogBinding.watchAdLl.isEnabled()) {
            Function0<Unit> function0 = resultDoubleGameDialog.onVideoClicked;
            if (function0 != null) {
                function0.invoke();
            }
            resultDoubleGameDialog.getVideoRewardService().redeemReward(PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE, 1000L, null);
            return;
        }
        resultDoubleGameDialog.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = null;
        if (this.videoRewardService != null) {
            getVideoRewardService().disconnectClient(PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE, null);
        }
    }

    private final void schedulePeriodicVideoRewardCheck() {
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ResultDoubleGameDialog$schedulePeriodicVideoRewardCheck$1(this, null), 3, null);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (!isAdded() || this.result == null) {
            return;
        }
        Log.i("DoubleGame", "onVideoRewardInfoUpdated: available=" + info.isAvailable() + ", amount=" + info.getPrizeAmount());
        try {
            boolean isRewardedReady = getVideoRewardService().isRewardedReady(PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE);
            boolean z = info.isAvailable() && !info.isQuotaExhausted();
            boolean z2 = z && isRewardedReady;
            Log.d("DoubleGame", "Video reward updated: backendAvailable=" + z + ", adSdkAvailable=" + isRewardedReady + ", finalAvailable=" + z2);
            if (z && !getVideoRewardService().isRewardedReady(PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE)) {
                getVideoRewardService().preloadRewarded();
            }
            ResultDialogDoubleGameDto resultDialogDoubleGameDto = this.result;
            if (resultDialogDoubleGameDto == null) {
                Intrinsics.throwUninitializedPropertyAccessException("result");
                resultDialogDoubleGameDto = null;
            }
            if (!resultDialogDoubleGameDto.isWin()) {
                getBinding().watchAdLl.setVisibility(8);
                updateOfferState(false, info.getPrizeAmount());
                return;
            }
            boolean isEnabled = getBinding().watchAdLl.isEnabled();
            FragmentResultDoubleGameDialogBinding binding = getBinding();
            binding.watchAdLl.setVisibility(0);
            binding.watchAdLl.setEnabled(z2);
            binding.watchAdLl.setAlpha(z2 ? 1.0f : 0.5f);
            if (z2) {
                binding.watchAdLl.setBackgroundTintList(ContextCompat.getColorStateList(requireContext(), R.color.double_game_make_bet_active_bg));
            } else {
                binding.watchAdLl.setBackgroundTintList(ContextCompat.getColorStateList(requireContext(), R.color.double_game_result_dialog_home_btn_bg));
            }
            binding.watchAdIv.setVisibility(0);
            binding.watchAdTv.setText("+" + FormatHelper.getShopBetcoinsFormated(info.getPrizeAmount()));
            updateOfferState(z2, info.getPrizeAmount());
            if (!z2 && isEnabled) {
                schedulePeriodicVideoRewardCheck();
                Log.d("DoubleGame", "Video reward unavailable, starting periodic checks");
            } else {
                if (!z2 || isEnabled) {
                    return;
                }
                Job job = this.videoRewardCheckJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.videoRewardCheckJob = null;
                Log.d("DoubleGame", "Video reward available, stopping periodic checks");
            }
        } catch (Exception e) {
            Log.e("DoubleGame", "Error in onVideoRewardInfoUpdated", e);
            getBinding().watchAdLl.setVisibility(8);
            updateOfferState(false, 0L);
        }
    }

    private final void updateOfferState(boolean isAvailable, long amount) {
        ResultDialogDoubleGameDto resultDialogDoubleGameDto;
        if (!isAdded() || (resultDialogDoubleGameDto = this.result) == null) {
            return;
        }
        if (resultDialogDoubleGameDto == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            resultDialogDoubleGameDto = null;
        }
        if (resultDialogDoubleGameDto.isWin()) {
            getBinding().watchAdLl.setVisibility(0);
            getBinding().watchAdLl.setEnabled(isAvailable);
            getBinding().watchAdLl.setAlpha(isAvailable ? 1.0f : 0.5f);
            if (isAvailable) {
                getBinding().watchAdLl.setBackgroundTintList(ContextCompat.getColorStateList(requireContext(), R.color.double_game_make_bet_active_bg));
                return;
            } else {
                getBinding().watchAdLl.setBackgroundTintList(ContextCompat.getColorStateList(requireContext(), R.color.double_game_result_dialog_home_btn_bg));
                return;
            }
        }
        getBinding().watchAdLl.setVisibility(8);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult videoRedeemResult, long amount) {
        Intrinsics.checkNotNullParameter(videoRedeemResult, "videoRedeemResult");
        if (!isAdded() || this.result == null) {
            return;
        }
        if (videoRedeemResult == VideoRewardService.RewardedVideoResult.SUCCESS) {
            updateOfferState(false, 0L);
            TextView textView = getBinding().amountTv;
            ResultDialogDoubleGameDto resultDialogDoubleGameDto = this.result;
            if (resultDialogDoubleGameDto == null) {
                Intrinsics.throwUninitializedPropertyAccessException("result");
                resultDialogDoubleGameDto = null;
            }
            textView.setText(FormatHelper.getShopBetcoinsFormated(resultDialogDoubleGameDto.getBetAmount() + amount));
            getVideoRewardService().triggerCaching();
            schedulePeriodicVideoRewardCheck();
            return;
        }
        updateOfferState(false, 0L);
        getVideoRewardService().triggerCaching();
        schedulePeriodicVideoRewardCheck();
        Context context = getContext();
        if (context != null) {
            SnackbarHelper.showShort(context, R.string.error);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onVideoRewardReceived(VideoRewardReceivedMessage message) {
        if (!isAdded() || this.result == null) {
            return;
        }
        getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE, 1000L, null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Function1<? super Long, Unit> function1;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        ResultDialogDoubleGameDto resultDialogDoubleGameDto = this.result;
        if (resultDialogDoubleGameDto != null && (function1 = this.onDismissCallback) != null) {
            if (resultDialogDoubleGameDto == null) {
                Intrinsics.throwUninitializedPropertyAccessException("result");
                resultDialogDoubleGameDto = null;
            }
            function1.invoke(Long.valueOf(resultDialogDoubleGameDto.getPrizeAmount()));
        }
        super.onDismiss(dialog);
    }
}
