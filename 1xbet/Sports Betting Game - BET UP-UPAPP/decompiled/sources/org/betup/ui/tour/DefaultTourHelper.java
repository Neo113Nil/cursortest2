package org.betup.ui.tour;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.betup.R;
import org.betup.bus.TourCloseMessage;
import org.betup.bus.TourMessage;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTutorialCompleteInteractor;
import org.betup.model.remote.entity.user.TutorialCompleteResponseModel;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.StartTourDialog;
import org.betup.ui.dialogs.WelcomeDialog;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import tourguide.tourguide.Overlay;
import tourguide.tourguide.Pointer;
import tourguide.tourguide.TourGuide;

/* loaded from: classes4.dex */
public class DefaultTourHelper implements TourHelper, StartTourDialog.StartTourDialogListener {
    private final Activity context;
    private WeakReference<View> startView;
    private final UserService userService;
    private V7UpdateTutorialCompleteInteractor v7UpdateTutorialCompleteInteractor;
    private boolean started = false;
    private boolean completed = true;
    private final BaseCachedSharedInteractor.OnFetchedListener<TutorialCompleteResponseModel, Void> onTutorialCompletedSent = new BaseCachedSharedInteractor.OnFetchedListener<TutorialCompleteResponseModel, Void>() { // from class: org.betup.ui.tour.DefaultTourHelper.1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<TutorialCompleteResponseModel, Void> responseMessage) {
            DefaultTourHelper.this.userService.invalidate(UserService.InfoKind.GENERAL);
        }
    };
    private boolean isTour = false;
    private final Map<Tour, TourGuide> map = new HashMap();
    private final HashSet<Tour> shown = new HashSet<>();

    @Override // org.betup.ui.LifecycleListener
    public void onStop() {
    }

    public DefaultTourHelper(MainActivity context, UserService userService, V7UpdateTutorialCompleteInteractor v7UpdateTutorialCompleteInteractor) {
        this.context = context;
        this.userService = userService;
        this.v7UpdateTutorialCompleteInteractor = v7UpdateTutorialCompleteInteractor;
    }

    @Override // org.betup.ui.tour.TourHelper
    public void resetTour() {
        this.shown.clear();
        this.started = false;
    }

    @Override // org.betup.ui.tour.TourHelper
    public void complete() {
        Log.d("TOUR", "tour completed");
        this.completed = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("tutorialComplete", true);
        this.v7UpdateTutorialCompleteInteractor.load(this.onTutorialCompletedSent, null, bundle);
    }

    @Override // org.betup.ui.tour.TourHelper
    public void setIsTour(boolean isTour) {
        this.isTour = isTour && FirebaseRemoteConfig.getInstance().getBoolean("tour_enabled");
        if (isTour) {
            this.completed = false;
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public boolean isTour() {
        return this.isTour && !this.completed;
    }

    @Override // org.betup.ui.tour.TourHelper
    public void hideTours() {
        Iterator<TourGuide> it = this.map.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().cleanUp();
            } catch (Exception e) {
                Log.e("TOUR", "cleanup ERROR", e);
            }
        }
        this.map.clear();
    }

    @Override // org.betup.ui.tour.TourHelper
    public boolean wasShown(Tour type) {
        return this.shown.contains(type);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void hideTourMessage(TourCloseMessage closeMessage) {
        hideTours();
    }

    @Override // org.betup.ui.tour.TourHelper
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayTour(final TourMessage tourMessage) {
        if (!isTour() || wasShown(tourMessage.getType())) {
            return;
        }
        this.shown.add(tourMessage.getType());
        new BrandedTourOverlay(this.context, new TourStep(tourMessage.getPosition(), tourMessage.getSign(), new TourTooltipData(tourMessage.getTitle(), tourMessage.getSubtitle())), new TourOverlayListener() { // from class: org.betup.ui.tour.DefaultTourHelper$$ExternalSyntheticLambda0
            @Override // org.betup.ui.tour.TourOverlayListener
            public final void onClosed() {
                DefaultTourHelper.this.m14340lambda$displayTour$0$orgbetupuitourDefaultTourHelper(tourMessage);
            }
        }).show();
    }

    /* renamed from: lambda$displayTour$0$org-betup-ui-tour-DefaultTourHelper, reason: not valid java name */
    /* synthetic */ void m14340lambda$displayTour$0$orgbetupuitourDefaultTourHelper(TourMessage tourMessage) {
        createTour(tourMessage.getView(), tourMessage.getType(), tourMessage.getStyle(), tourMessage.isDisplayPointer());
    }

    private void createTour(View view, Tour type, Overlay.Style style, final boolean showPointer) {
        hideTours();
        if (view == null) {
            return;
        }
        FirebaseAnalyticsHelper.addEvent(this.context, FirebaseAnalyticsHelper.Event.TOUR_SCREEN, type.name());
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 200.0f, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new BounceInterpolator());
        this.map.put(type, TourGuide.init(this.context).with(TourGuide.Technique.CLICK).setPointer(showPointer ? new Pointer() : null).setOverlay(new Overlay().setBackgroundColor(Color.parseColor("#AA000000")).disableClick(true).setStyle(style)).playOn(view));
    }

    @Override // org.betup.ui.LifecycleListener
    public void onResume() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    @Override // org.betup.ui.LifecycleListener
    public void onPause() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public void setCompleted(Tour type) {
        this.shown.add(type);
    }

    @Override // org.betup.ui.tour.TourHelper
    public void start(View view) {
        this.startView = new WeakReference<>(view);
        if (this.isTour && this.shown.size() == 0 && !this.started) {
            this.started = true;
            WelcomeDialog.showDialog(this.context, new DialogInterface.OnDismissListener() { // from class: org.betup.ui.tour.DefaultTourHelper$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    DefaultTourHelper.this.m14341lambda$start$1$orgbetupuitourDefaultTourHelper(dialogInterface);
                }
            });
        }
    }

    /* renamed from: lambda$start$1$org-betup-ui-tour-DefaultTourHelper, reason: not valid java name */
    /* synthetic */ void m14341lambda$start$1$orgbetupuitourDefaultTourHelper(DialogInterface dialogInterface) {
        StartTourDialog.showDialog(this.context, this);
    }

    @Override // org.betup.ui.dialogs.StartTourDialog.StartTourDialogListener
    public void onSkip() {
        this.completed = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("tutorialComplete", true);
        this.v7UpdateTutorialCompleteInteractor.load(this.onTutorialCompletedSent, null, bundle);
    }

    @Override // org.betup.ui.dialogs.StartTourDialog.StartTourDialogListener
    public void onStart() {
        View view = this.startView.get();
        if (view != null) {
            this.completed = false;
            displayTour(new TourMessage.Builder(Tour.MENU_LIVE_MATCHES).setSign(TourHelperSign.Side).setPosition(TourHelperPosition.Right).setStyle(Overlay.Style.RECTANGLE).setTitle(this.context.getString(R.string.tour_menu_live_matches_title)).setView(view).setSubtitle(this.context.getString(R.string.tour_menu_live_matches_desc)).build());
        } else {
            this.completed = true;
            Bundle bundle = new Bundle();
            bundle.putBoolean("tutorialComplete", true);
            this.v7UpdateTutorialCompleteInteractor.load(this.onTutorialCompletedSent, null, bundle);
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public boolean isCompleted() {
        return this.completed;
    }
}
