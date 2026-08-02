package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.controller.ChallengePreviewController;
import org.betup.utils.BattleShareCaptureAnchor;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.TicketSharePixelCapture;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: ChallengePreviewNewDialogFragment.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J2\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u001a\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010#\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006%²\u0006\f\u0010&\u001a\u0004\u0018\u00010'X\u008a\u0084\u0002²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/ChallengePreviewNewDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/dialogs/controller/ChallengePreviewController;", "getController", "()Lorg/betup/ui/dialogs/controller/ChallengePreviewController;", "setController", "(Lorg/betup/ui/dialogs/controller/ChallengePreviewController;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "captureAndShareBattle", "activity", "Landroidx/fragment/app/FragmentActivity;", "shareCaptureAnchor", "Lorg/betup/utils/BattleShareCaptureAnchor;", "shareExpandPx", "", "shareExpandTopPx", "pixelCopyWindow", "Landroid/view/Window;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onDestroyView", VastTagName.COMPANION, "app_release", "shareChooser", "Lorg/betup/ui/dialogs/controller/ChallengePreviewController$BattleShareChooserState;", "boundChallengeIds", "", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengePreviewNewDialogFragment extends DialogFragment {
    private static final String ARG_CHALLENGE_ID = "challenge_id";
    private static final String ARG_CHALLENGE_IDS = "challenge_ids";

    @Inject
    public ChallengePreviewController controller;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final ChallengePreviewController getController() {
        ChallengePreviewController challengePreviewController = this.controller;
        if (challengePreviewController != null) {
            return challengePreviewController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(ChallengePreviewController challengePreviewController) {
        Intrinsics.checkNotNullParameter(challengePreviewController, "<set-?>");
        this.controller = challengePreviewController;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    /* compiled from: ChallengePreviewNewDialogFragment.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lorg/betup/ui/dialogs/ChallengePreviewNewDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_CHALLENGE_ID", "", "ARG_CHALLENGE_IDS", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/ChallengePreviewNewDialogFragment;", "challengeId", "", "challengeIds", "", "(Ljava/lang/Integer;Ljava/util/List;)Lorg/betup/ui/dialogs/ChallengePreviewNewDialogFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChallengePreviewNewDialogFragment newInstance$default(Companion companion, Integer num, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                list = null;
            }
            return companion.newInstance(num, list);
        }

        public final ChallengePreviewNewDialogFragment newInstance(Integer challengeId, List<Integer> challengeIds) {
            ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment = new ChallengePreviewNewDialogFragment();
            Bundle bundle = new Bundle();
            if (challengeId != null) {
                bundle.putInt(ChallengePreviewNewDialogFragment.ARG_CHALLENGE_ID, challengeId.intValue());
            }
            if (challengeIds != null) {
                if (challengeIds.isEmpty()) {
                    challengeIds = null;
                }
                if (challengeIds != null) {
                    List<Integer> list = challengeIds;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((Number) it.next()).intValue()));
                    }
                    bundle.putLongArray(ChallengePreviewNewDialogFragment.ARG_CHALLENGE_IDS, CollectionsKt.toLongArray(arrayList));
                }
            }
            challengePreviewNewDialogFragment.setArguments(bundle);
            return challengePreviewNewDialogFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<Long> emptyList;
        long[] longArray;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt(ARG_CHALLENGE_ID, -1)) : null;
        if (valueOf != null && valueOf.intValue() == -1) {
            valueOf = null;
        }
        Long valueOf2 = valueOf != null ? Long.valueOf(valueOf.intValue()) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (longArray = arguments2.getLongArray(ARG_CHALLENGE_IDS)) == null || (emptyList = ArraysKt.toList(longArray)) == null) {
            if (valueOf2 != null) {
                emptyList = CollectionsKt.listOf(Long.valueOf(valueOf2.longValue()));
            } else {
                emptyList = CollectionsKt.emptyList();
            }
        }
        if (valueOf2 == null) {
            valueOf2 = (Long) CollectionsKt.firstOrNull((List) emptyList);
        }
        ChallengePreviewController controller = getController();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        controller.bind((MainActivity) requireActivity, new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onCreateView$lambda$2;
                onCreateView$lambda$2 = ChallengePreviewNewDialogFragment.onCreateView$lambda$2(ChallengePreviewNewDialogFragment.this);
                return onCreateView$lambda$2;
            }
        }, valueOf2, emptyList);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1190483535, true, new ChallengePreviewNewDialogFragment$onCreateView$2$1(this, valueOf2)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$2(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureAndShareBattle(final FragmentActivity activity, BattleShareCaptureAnchor shareCaptureAnchor, int shareExpandPx, int shareExpandTopPx, Window pixelCopyWindow) {
        final ChallengePreviewController.BattleShareContent buildShareContent = getController().buildShareContent();
        if (buildShareContent == null) {
            getController().sharePlainTextFallback();
            return;
        }
        LayoutCoordinates coordinates = shareCaptureAnchor.getCoordinates();
        if (coordinates == null || !coordinates.isAttached()) {
            SnackbarHelper.showShort(activity, R.string.battle_share_capture_failed);
        } else {
            TicketSharePixelCapture.INSTANCE.captureToBitmap(activity, coordinates, pixelCopyWindow, shareExpandPx, shareExpandTopPx, shareExpandPx, shareExpandPx, new Function1() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit captureAndShareBattle$lambda$5;
                    captureAndShareBattle$lambda$5 = ChallengePreviewNewDialogFragment.captureAndShareBattle$lambda$5(FragmentActivity.this, this, buildShareContent, (Bitmap) obj);
                    return captureAndShareBattle$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit captureAndShareBattle$lambda$5(final FragmentActivity fragmentActivity, final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment, final ChallengePreviewController.BattleShareContent battleShareContent, final Bitmap bitmap) {
        View decorView;
        Window window = fragmentActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new Runnable() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ChallengePreviewNewDialogFragment.captureAndShareBattle$lambda$5$lambda$4(bitmap, fragmentActivity, challengePreviewNewDialogFragment, battleShareContent);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureAndShareBattle$lambda$5$lambda$4(Bitmap bitmap, FragmentActivity fragmentActivity, ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment, ChallengePreviewController.BattleShareContent battleShareContent) {
        if (bitmap == null) {
            SnackbarHelper.showShort(fragmentActivity, R.string.battle_share_capture_failed);
        } else {
            challengePreviewNewDialogFragment.getController().showShareChooser(bitmap, battleShareContent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.5f);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getController().destroy();
    }
}
