package org.betup.ui.dialogs.interstitial;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.VideoView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.remote.entity.interstitial.InterstitialCampaignDto;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialBridgeContext;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialDismissPolicy;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler;
import org.betup.utils.ImmersiveOverlayGate;
import org.betup.utils.WebViewDialogStateGuard;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: InterstitialVideoDialogFragment.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001cH\u0016J\b\u0010(\u001a\u00020\u001aH\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, d2 = {"Lorg/betup/ui/dialogs/interstitial/InterstitialVideoDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/ui/dialogs/interstitial/InterstitialBackHandler;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "callbackKey", "", "bridgeContext", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialBridgeContext;", "restoreFailed", "", "skipButton", "Landroid/widget/Button;", "campaign", "Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "getCampaign", "()Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "bridgeHandler", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "getBridgeHandler", "()Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "dismissPolicy", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", "getDismissPolicy", "()Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onSaveInstanceState", "outState", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "handleHardwareBack", "refreshSkipButton", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterstitialVideoDialogFragment extends DialogFragment implements InterstitialBackHandler {
    private static final String ARG_CALLBACK_KEY = "arg_callback_key";
    public static final String TAG = "InterstitialVideoDialog";
    private InterstitialBridgeContext bridgeContext;
    private String callbackKey = "";
    private boolean restoreFailed;
    private Button skipButton;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private final InterstitialCampaignDto getCampaign() {
        InterstitialBridgeContext interstitialBridgeContext = this.bridgeContext;
        if (interstitialBridgeContext != null) {
            return interstitialBridgeContext.getCampaign();
        }
        return null;
    }

    private final InterstitialWebViewBridgeHandler getBridgeHandler() {
        InterstitialBridgeContext interstitialBridgeContext = this.bridgeContext;
        if (interstitialBridgeContext != null) {
            return interstitialBridgeContext.getHandler();
        }
        return null;
    }

    private final InterstitialDismissPolicy getDismissPolicy() {
        InterstitialBridgeContext interstitialBridgeContext = this.bridgeContext;
        if (interstitialBridgeContext != null) {
            return interstitialBridgeContext.getDismissPolicy();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
        String string = requireArguments().getString(ARG_CALLBACK_KEY);
        if (string == null) {
            string = "";
        }
        this.callbackKey = string;
        InterstitialBridgeContext peek = InterstitialBridgeCallbackRegistry.INSTANCE.peek(this.callbackKey);
        this.bridgeContext = peek;
        if (peek == null) {
            Log.w(TAG, "Interstitial context unavailable (process death or stale restore); dismissing");
            this.restoreFailed = true;
            ImmersiveOverlayGate.onImmersiveDismissed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        InterstitialCampaignDto campaign;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.restoreFailed) {
            return new View(requireContext());
        }
        final InterstitialWebViewBridgeHandler bridgeHandler = getBridgeHandler();
        if (bridgeHandler != null && (campaign = getCampaign()) != null) {
            View inflate = inflater.inflate(R.layout.fragment_interstitial_video, container, false);
            final VideoView videoView = (VideoView) inflate.findViewById(R.id.interstitialVideoView);
            Button button = (Button) inflate.findViewById(R.id.interstitialSkipButton);
            this.skipButton = button;
            String videoUrl = campaign.getVideoUrl();
            String obj = videoUrl != null ? StringsKt.trim((CharSequence) videoUrl).toString() : null;
            if (obj == null) {
                obj = "";
            }
            if (StringsKt.isBlank(obj)) {
                bridgeHandler.onClose();
                Intrinsics.checkNotNull(inflate);
                return inflate;
            }
            videoView.setVideoURI(Uri.parse(obj));
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment$$ExternalSyntheticLambda2
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    InterstitialVideoDialogFragment.onCreateView$lambda$0(videoView, mediaPlayer);
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment$$ExternalSyntheticLambda3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    InterstitialVideoDialogFragment.onCreateView$lambda$1(InterstitialWebViewBridgeHandler.this, mediaPlayer);
                }
            });
            videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment$$ExternalSyntheticLambda4
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    boolean onCreateView$lambda$2;
                    onCreateView$lambda$2 = InterstitialVideoDialogFragment.onCreateView$lambda$2(InterstitialWebViewBridgeHandler.this, mediaPlayer, i, i2);
                    return onCreateView$lambda$2;
                }
            });
            button.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterstitialVideoDialogFragment.onCreateView$lambda$3(InterstitialWebViewBridgeHandler.this, view);
                }
            });
            refreshSkipButton();
            Intrinsics.checkNotNull(inflate);
            return inflate;
        }
        return new View(requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(VideoView videoView, MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(false);
        videoView.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(InterstitialWebViewBridgeHandler interstitialWebViewBridgeHandler, MediaPlayer mediaPlayer) {
        interstitialWebViewBridgeHandler.onVideoComplete();
        interstitialWebViewBridgeHandler.onClose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreateView$lambda$2(InterstitialWebViewBridgeHandler interstitialWebViewBridgeHandler, MediaPlayer mediaPlayer, int i, int i2) {
        interstitialWebViewBridgeHandler.onClose();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$3(InterstitialWebViewBridgeHandler interstitialWebViewBridgeHandler, View view) {
        if (interstitialWebViewBridgeHandler.canSkip()) {
            interstitialWebViewBridgeHandler.onSkip();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.restoreFailed) {
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new OnBackPressedCallback() { // from class: org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment$onViewCreated$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                InterstitialVideoDialogFragment.this.handleHardwareBack();
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        if (this.restoreFailed) {
            dismissAllowingStateLoss();
            return;
        }
        InterstitialWebViewBridgeHandler bridgeHandler = getBridgeHandler();
        if (bridgeHandler != null) {
            bridgeHandler.onPresentationStarted();
        }
        InterstitialDismissPolicy dismissPolicy = getDismissPolicy();
        if (dismissPolicy != null) {
            dismissPolicy.setOnDismissReadyListener(new Function0() { // from class: org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit onStart$lambda$4;
                    onStart$lambda$4 = InterstitialVideoDialogFragment.onStart$lambda$4(InterstitialVideoDialogFragment.this);
                    return onStart$lambda$4;
                }
            });
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: org.betup.ui.dialogs.interstitial.InterstitialVideoDialogFragment$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    boolean onStart$lambda$5;
                    onStart$lambda$5 = InterstitialVideoDialogFragment.onStart$lambda$5(InterstitialVideoDialogFragment.this, dialogInterface, i, keyEvent);
                    return onStart$lambda$5;
                }
            });
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(-16777216));
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(InterstitialVideoDialogFragment interstitialVideoDialogFragment) {
        interstitialVideoDialogFragment.refreshSkipButton();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onStart$lambda$5(InterstitialVideoDialogFragment interstitialVideoDialogFragment, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            return interstitialVideoDialogFragment.handleHardwareBack();
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        WebViewDialogStateGuard.INSTANCE.stripFragmentViewState(outState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        VideoView videoView;
        InterstitialDismissPolicy dismissPolicy = getDismissPolicy();
        if (dismissPolicy != null) {
            dismissPolicy.cancel();
        }
        InterstitialDismissPolicy dismissPolicy2 = getDismissPolicy();
        if (dismissPolicy2 != null) {
            dismissPolicy2.setOnDismissReadyListener(null);
        }
        this.skipButton = null;
        View view = getView();
        if (view != null && (videoView = (VideoView) view.findViewById(R.id.interstitialVideoView)) != null) {
            videoView.stopPlayback();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.restoreFailed && this.callbackKey.length() > 0) {
            InterstitialBridgeCallbackRegistry.INSTANCE.remove(this.callbackKey);
        }
        ImmersiveOverlayGate.onImmersiveDismissed();
        super.onDismiss(dialog);
    }

    @Override // org.betup.ui.dialogs.interstitial.InterstitialBackHandler
    public boolean handleHardwareBack() {
        InterstitialWebViewBridgeHandler bridgeHandler = getBridgeHandler();
        if (bridgeHandler != null && bridgeHandler.canSkip()) {
            bridgeHandler.onSkip();
        }
        return true;
    }

    private final void refreshSkipButton() {
        InterstitialWebViewBridgeHandler bridgeHandler;
        Button button = this.skipButton;
        if (button == null || (bridgeHandler = getBridgeHandler()) == null) {
            return;
        }
        boolean canSkip = bridgeHandler.canSkip();
        button.setVisibility(0);
        button.setEnabled(canSkip);
        button.setAlpha(canSkip ? 1.0f : 0.45f);
    }

    /* compiled from: InterstitialVideoDialogFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/dialogs/interstitial/InterstitialVideoDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_CALLBACK_KEY", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/interstitial/InterstitialVideoDialogFragment;", "context", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialBridgeContext;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InterstitialVideoDialogFragment newInstance(InterstitialBridgeContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String put = InterstitialBridgeCallbackRegistry.INSTANCE.put(context);
            InterstitialVideoDialogFragment interstitialVideoDialogFragment = new InterstitialVideoDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(InterstitialVideoDialogFragment.ARG_CALLBACK_KEY, put);
            interstitialVideoDialogFragment.setArguments(bundle);
            return interstitialVideoDialogFragment;
        }
    }
}
