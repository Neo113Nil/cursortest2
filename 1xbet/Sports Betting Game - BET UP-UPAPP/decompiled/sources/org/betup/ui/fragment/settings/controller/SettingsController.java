package org.betup.ui.fragment.settings.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.protocol.Request;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.bus.SignOutMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.ChangeV7NameInteractor;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor;
import org.betup.model.remote.api.rest.user.UpdateV7PushPreferencesInteractor;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;
import org.betup.model.remote.api.rest.user.changephoto.ChangeV7ProfilePhotoInteractor;
import org.betup.model.remote.entity.MetaModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.referrals.ReferralResponse;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.ChangeCountryDialogFragment;
import org.betup.ui.dialogs.ChangeDisplayNameFragment;
import org.betup.ui.dialogs.ChangeLanguageFragment;
import org.betup.ui.dialogs.ChangeUserPhotoDialogFragment;
import org.betup.ui.dialogs.DefaultBetAmountDialogFragment;
import org.betup.ui.dialogs.InfoDialog;
import org.betup.ui.dialogs.OddsDialogFragment;
import org.betup.ui.dialogs.ProgressDialog;
import org.betup.ui.dialogs.QuestionDialog;
import org.betup.ui.dialogs.ReferralCodeFragment;
import org.betup.ui.dialogs.VisualEffectsFragment;
import org.betup.ui.fragment.settings.PhotoProcessor;
import org.betup.ui.fragment.settings.subscriptions.AllSubscriptionsFragment;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SettingsController.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0004Mfil\b\u0007\u0018\u0000 q2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001qB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010A\u001a\u00020B2\u0006\u00100\u001a\u000201J\b\u0010C\u001a\u00020BH\u0002J\u0006\u0010D\u001a\u00020BJ\u0006\u0010E\u001a\u00020BJ\u000e\u0010F\u001a\u00020B2\u0006\u0010G\u001a\u000208J\u000e\u0010H\u001a\u00020B2\u0006\u0010G\u001a\u000208J\u0018\u0010I\u001a\u00020B2\u0006\u0010J\u001a\u0002082\u0006\u0010K\u001a\u000208H\u0002J\u0006\u0010O\u001a\u00020BJ\u0006\u0010P\u001a\u00020BJ\u0006\u0010Q\u001a\u00020BJ\u0006\u0010R\u001a\u00020BJ\u000e\u0010U\u001a\u00020B2\u0006\u0010V\u001a\u00020TJ\u0006\u0010W\u001a\u00020BJ\u0006\u0010X\u001a\u00020BJ\u0006\u0010Y\u001a\u00020BJ\u0006\u0010Z\u001a\u00020BJ\u0006\u0010[\u001a\u00020BJ\u0006\u0010\\\u001a\u00020BJ \u0010]\u001a\u00020B2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020_2\b\u0010a\u001a\u0004\u0018\u00010bJ\b\u0010c\u001a\u00020BH\u0002J\b\u0010d\u001a\u00020BH\u0002J\u001c\u0010n\u001a\u00020B2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030pH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u0002080:¢\u0006\b\n\u0000\u001a\u0004\b9\u0010;R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u0002080:¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002080:¢\u0006\b\n\u0000\u001a\u0004\b@\u0010;R\u0010\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0010\u0010S\u001a\u0004\u0018\u00010TX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u00020fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010gR\u0010\u0010h\u001a\u00020iX\u0082\u0004¢\u0006\u0004\n\u0002\u0010jR\u0010\u0010k\u001a\u00020lX\u0082\u0004¢\u0006\u0004\n\u0002\u0010m¨\u0006r"}, d2 = {"Lorg/betup/ui/fragment/settings/controller/SettingsController;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/user/referrals/ReferralResponse;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "changeV7ProfilePhotoInteractor", "Lorg/betup/model/remote/api/rest/user/changephoto/ChangeV7ProfilePhotoInteractor;", "getChangeV7ProfilePhotoInteractor", "()Lorg/betup/model/remote/api/rest/user/changephoto/ChangeV7ProfilePhotoInteractor;", "setChangeV7ProfilePhotoInteractor", "(Lorg/betup/model/remote/api/rest/user/changephoto/ChangeV7ProfilePhotoInteractor;)V", "v7ReferralInteractor", "Lorg/betup/model/remote/api/rest/user/V7ReferralInteractor;", "getV7ReferralInteractor", "()Lorg/betup/model/remote/api/rest/user/V7ReferralInteractor;", "setV7ReferralInteractor", "(Lorg/betup/model/remote/api/rest/user/V7ReferralInteractor;)V", "getV7MyInfoInteractor", "Lorg/betup/model/remote/api/rest/user/GetV7MyInfoInteractor;", "getGetV7MyInfoInteractor", "()Lorg/betup/model/remote/api/rest/user/GetV7MyInfoInteractor;", "setGetV7MyInfoInteractor", "(Lorg/betup/model/remote/api/rest/user/GetV7MyInfoInteractor;)V", "updateV7PushPreferencesInteractor", "Lorg/betup/model/remote/api/rest/user/UpdateV7PushPreferencesInteractor;", "getUpdateV7PushPreferencesInteractor", "()Lorg/betup/model/remote/api/rest/user/UpdateV7PushPreferencesInteractor;", "setUpdateV7PushPreferencesInteractor", "(Lorg/betup/model/remote/api/rest/user/UpdateV7PushPreferencesInteractor;)V", "changeV7NameInteractor", "Lorg/betup/model/remote/api/rest/user/ChangeV7NameInteractor;", "getChangeV7NameInteractor", "()Lorg/betup/model/remote/api/rest/user/ChangeV7NameInteractor;", "setChangeV7NameInteractor", "(Lorg/betup/model/remote/api/rest/user/ChangeV7NameInteractor;)V", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "getLocalPreferencesService", "()Lorg/betup/services/storage/LocalPreferencesService;", "setLocalPreferencesService", "(Lorg/betup/services/storage/LocalPreferencesService;)V", "activity", "Landroid/app/Activity;", "photoProcessor", "Lorg/betup/ui/fragment/settings/PhotoProcessor;", "progressDialog", "Lorg/betup/ui/dialogs/ProgressDialog;", "_isBetPushEnabled", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isBetPushEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_isMatchPushEnabled", "isMatchPushEnabled", "_showInviteCode", "showInviteCode", "getShowInviteCode", "initialize", "", "loadSettings", "onOddsFormatClick", "onDefaultBetAmountClick", "onBetPushChanged", "enabled", "onMatchPushChanged", "updatePushes", "match", "bet", "updatePushPreferencesListener", "org/betup/ui/fragment/settings/controller/SettingsController$updatePushPreferencesListener$1", "Lorg/betup/ui/fragment/settings/controller/SettingsController$updatePushPreferencesListener$1;", "onChangeCountry", "onChangeLanguage", "onChangeName", "onEnterInviteCode", "parentFragment", "Landroidx/fragment/app/Fragment;", "setParentFragment", Request.JsonKeys.FRAGMENT, "onChangeProfilePhoto", "onVisualEffects", "onBalanceHistory", "onLogout", "onDeleteAccount", "onNotificationForMatches", "handleActivityResult", "requestCode", "", X3.f.f, "data", "Landroid/content/Intent;", "showProgress", "hideProgress", "profilePhotoChangedListener", "org/betup/ui/fragment/settings/controller/SettingsController$profilePhotoChangedListener$1", "Lorg/betup/ui/fragment/settings/controller/SettingsController$profilePhotoChangedListener$1;", "nameChangedListener", "org/betup/ui/fragment/settings/controller/SettingsController$nameChangedListener$1", "Lorg/betup/ui/fragment/settings/controller/SettingsController$nameChangedListener$1;", "removeAllSubscriptionsListener", "org/betup/ui/fragment/settings/controller/SettingsController$removeAllSubscriptionsListener$1", "Lorg/betup/ui/fragment/settings/controller/SettingsController$removeAllSubscriptionsListener$1;", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SettingsController implements BaseCachedSharedInteractor.OnFetchedListener<ReferralResponse, String> {
    public static final int CAMERA_REQUEST = 2;
    public static final int GALLERY_REQUEST = 1;
    private final MutableStateFlow<Boolean> _isBetPushEnabled;
    private final MutableStateFlow<Boolean> _isMatchPushEnabled;
    private final MutableStateFlow<Boolean> _showInviteCode;
    private Activity activity;

    @Inject
    public ChangeV7NameInteractor changeV7NameInteractor;

    @Inject
    public ChangeV7ProfilePhotoInteractor changeV7ProfilePhotoInteractor;

    @Inject
    public GetV7MyInfoInteractor getV7MyInfoInteractor;
    private final StateFlow<Boolean> isBetPushEnabled;
    private final StateFlow<Boolean> isMatchPushEnabled;

    @Inject
    public LocalPreferencesService localPreferencesService;
    private final SettingsController$nameChangedListener$1 nameChangedListener;
    private Fragment parentFragment;
    private PhotoProcessor photoProcessor;
    private final SettingsController$profilePhotoChangedListener$1 profilePhotoChangedListener;
    private ProgressDialog progressDialog;
    private final SettingsController$removeAllSubscriptionsListener$1 removeAllSubscriptionsListener;
    private final StateFlow<Boolean> showInviteCode;
    private final SettingsController$updatePushPreferencesListener$1 updatePushPreferencesListener;

    @Inject
    public UpdateV7PushPreferencesInteractor updateV7PushPreferencesInteractor;

    @Inject
    public UserService userService;

    @Inject
    public V7ReferralInteractor v7ReferralInteractor;
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r0v10, types: [org.betup.ui.fragment.settings.controller.SettingsController$nameChangedListener$1] */
    /* JADX WARN: Type inference failed for: r0v11, types: [org.betup.ui.fragment.settings.controller.SettingsController$removeAllSubscriptionsListener$1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.betup.ui.fragment.settings.controller.SettingsController$updatePushPreferencesListener$1] */
    @Inject
    public SettingsController() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isBetPushEnabled = MutableStateFlow;
        this.isBetPushEnabled = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isMatchPushEnabled = MutableStateFlow2;
        this.isMatchPushEnabled = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(true);
        this._showInviteCode = MutableStateFlow3;
        this.showInviteCode = FlowKt.asStateFlow(MutableStateFlow3);
        this.updatePushPreferencesListener = new BaseCachedSharedInteractor.OnFetchedListener<Boolean, Void>() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$updatePushPreferencesListener$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<Boolean, Void> responseMessage) {
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() == FetchStat.SUCCESS) {
                    Log.d("SettingsController", "Push preferences updated successfully");
                } else {
                    Log.e("SettingsController", "Failed to update push preferences: " + responseMessage.getStat());
                }
            }
        };
        this.profilePhotoChangedListener = new SettingsController$profilePhotoChangedListener$1(this);
        this.nameChangedListener = new BaseCachedSharedInteractor.OnFetchedListener<BaseUserModel, String>() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$nameChangedListener$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<BaseUserModel, String> responseMessage) {
                Activity activity;
                Activity activity2;
                Activity activity3;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                activity = SettingsController.this.activity;
                if (activity == null) {
                    return;
                }
                SettingsController.this.hideProgress();
                if (responseMessage.getStat() != FetchStat.SUCCESS) {
                    activity3 = SettingsController.this.activity;
                    SnackbarHelper.showShort(activity3, R.string.name_invalid);
                } else {
                    SettingsController.this.getUserService().invalidate(UserService.InfoKind.GENERAL);
                    SettingsController.this.getUserService().syncProfile(UserService.InfoKind.GENERAL);
                    activity2 = SettingsController.this.activity;
                    SnackbarHelper.showShort(activity2, R.string.changes_applied);
                }
            }
        };
        this.removeAllSubscriptionsListener = new BaseCachedSharedInteractor.OnFetchedListener<Void, Void>() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$removeAllSubscriptionsListener$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<Void, Void> responseMessage) {
                Activity activity;
                Activity activity2;
                Activity activity3;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                activity = SettingsController.this.activity;
                if (activity == null) {
                    return;
                }
                SettingsController.this.hideProgress();
                if (responseMessage.getStat() == FetchStat.SUCCESS) {
                    activity3 = SettingsController.this.activity;
                    SnackbarHelper.showShort(activity3, R.string.changes_applied);
                } else {
                    activity2 = SettingsController.this.activity;
                    SnackbarHelper.showShort(activity2, R.string.error_occured);
                }
            }
        };
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final ChangeV7ProfilePhotoInteractor getChangeV7ProfilePhotoInteractor() {
        ChangeV7ProfilePhotoInteractor changeV7ProfilePhotoInteractor = this.changeV7ProfilePhotoInteractor;
        if (changeV7ProfilePhotoInteractor != null) {
            return changeV7ProfilePhotoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("changeV7ProfilePhotoInteractor");
        return null;
    }

    public final void setChangeV7ProfilePhotoInteractor(ChangeV7ProfilePhotoInteractor changeV7ProfilePhotoInteractor) {
        Intrinsics.checkNotNullParameter(changeV7ProfilePhotoInteractor, "<set-?>");
        this.changeV7ProfilePhotoInteractor = changeV7ProfilePhotoInteractor;
    }

    public final V7ReferralInteractor getV7ReferralInteractor() {
        V7ReferralInteractor v7ReferralInteractor = this.v7ReferralInteractor;
        if (v7ReferralInteractor != null) {
            return v7ReferralInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7ReferralInteractor");
        return null;
    }

    public final void setV7ReferralInteractor(V7ReferralInteractor v7ReferralInteractor) {
        Intrinsics.checkNotNullParameter(v7ReferralInteractor, "<set-?>");
        this.v7ReferralInteractor = v7ReferralInteractor;
    }

    public final GetV7MyInfoInteractor getGetV7MyInfoInteractor() {
        GetV7MyInfoInteractor getV7MyInfoInteractor = this.getV7MyInfoInteractor;
        if (getV7MyInfoInteractor != null) {
            return getV7MyInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getV7MyInfoInteractor");
        return null;
    }

    public final void setGetV7MyInfoInteractor(GetV7MyInfoInteractor getV7MyInfoInteractor) {
        Intrinsics.checkNotNullParameter(getV7MyInfoInteractor, "<set-?>");
        this.getV7MyInfoInteractor = getV7MyInfoInteractor;
    }

    public final UpdateV7PushPreferencesInteractor getUpdateV7PushPreferencesInteractor() {
        UpdateV7PushPreferencesInteractor updateV7PushPreferencesInteractor = this.updateV7PushPreferencesInteractor;
        if (updateV7PushPreferencesInteractor != null) {
            return updateV7PushPreferencesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateV7PushPreferencesInteractor");
        return null;
    }

    public final void setUpdateV7PushPreferencesInteractor(UpdateV7PushPreferencesInteractor updateV7PushPreferencesInteractor) {
        Intrinsics.checkNotNullParameter(updateV7PushPreferencesInteractor, "<set-?>");
        this.updateV7PushPreferencesInteractor = updateV7PushPreferencesInteractor;
    }

    public final ChangeV7NameInteractor getChangeV7NameInteractor() {
        ChangeV7NameInteractor changeV7NameInteractor = this.changeV7NameInteractor;
        if (changeV7NameInteractor != null) {
            return changeV7NameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("changeV7NameInteractor");
        return null;
    }

    public final void setChangeV7NameInteractor(ChangeV7NameInteractor changeV7NameInteractor) {
        Intrinsics.checkNotNullParameter(changeV7NameInteractor, "<set-?>");
        this.changeV7NameInteractor = changeV7NameInteractor;
    }

    public final LocalPreferencesService getLocalPreferencesService() {
        LocalPreferencesService localPreferencesService = this.localPreferencesService;
        if (localPreferencesService != null) {
            return localPreferencesService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localPreferencesService");
        return null;
    }

    public final void setLocalPreferencesService(LocalPreferencesService localPreferencesService) {
        Intrinsics.checkNotNullParameter(localPreferencesService, "<set-?>");
        this.localPreferencesService = localPreferencesService;
    }

    public final StateFlow<Boolean> isBetPushEnabled() {
        return this.isBetPushEnabled;
    }

    public final StateFlow<Boolean> isMatchPushEnabled() {
        return this.isMatchPushEnabled;
    }

    public final StateFlow<Boolean> getShowInviteCode() {
        return this.showInviteCode;
    }

    public final void initialize(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.photoProcessor = new PhotoProcessor(activity.getApplicationContext());
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        loadSettings();
    }

    private final void loadSettings() {
        if (getUserService().isRegistered()) {
            BaseUserModel userModel = getUserService().getShortProfile().getUserModel();
            Intrinsics.checkNotNullExpressionValue(userModel, "getUserModel(...)");
            this._isBetPushEnabled.setValue(Boolean.valueOf(userModel.isBetPush()));
            this._isMatchPushEnabled.setValue(Boolean.valueOf(userModel.isMatchPush()));
            this._showInviteCode.setValue(Boolean.valueOf(userModel.getInvitedBy() == 0));
        }
    }

    public final void onOddsFormatClick() {
        FragmentManager supportFragmentManager;
        OddsDialogFragment newInstance = OddsDialogFragment.INSTANCE.newInstance(false);
        newInstance.setOddsOnDismissListener(new Function1() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onOddsFormatClick$lambda$1;
                onOddsFormatClick$lambda$1 = SettingsController.onOddsFormatClick$lambda$1(SettingsController.this, (OddType) obj);
                return onOddsFormatClick$lambda$1;
            }
        });
        Activity activity = this.activity;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        newInstance.show(supportFragmentManager, "OddsDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOddsFormatClick$lambda$1(SettingsController settingsController, OddType oddType) {
        if (oddType != null) {
            settingsController.getUserService().saveOddType(oddType);
        }
        return Unit.INSTANCE;
    }

    public final void onDefaultBetAmountClick() {
        FragmentManager supportFragmentManager;
        DefaultBetAmountDialogFragment newInstance = DefaultBetAmountDialogFragment.INSTANCE.newInstance(new Function0() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onDefaultBetAmountClick$lambda$3;
                onDefaultBetAmountClick$lambda$3 = SettingsController.onDefaultBetAmountClick$lambda$3(SettingsController.this);
                return onDefaultBetAmountClick$lambda$3;
            }
        });
        Activity activity = this.activity;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        newInstance.show(supportFragmentManager, "DefaultBetAmountDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDefaultBetAmountClick$lambda$3(SettingsController settingsController) {
        SnackbarHelper.showShort(settingsController.activity, R.string.changes_applied);
        return Unit.INSTANCE;
    }

    public final void onBetPushChanged(boolean enabled) {
        this._isBetPushEnabled.setValue(Boolean.valueOf(enabled));
        getUserService().getShortProfile().getUserModel().setBetPush(enabled);
        updatePushes(this._isMatchPushEnabled.getValue().booleanValue(), enabled);
    }

    public final void onMatchPushChanged(boolean enabled) {
        this._isMatchPushEnabled.setValue(Boolean.valueOf(enabled));
        getUserService().getShortProfile().getUserModel().setMatchPush(enabled);
        updatePushes(enabled, this._isBetPushEnabled.getValue().booleanValue());
    }

    private final void updatePushes(boolean match, boolean bet) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("matchPush", match);
        bundle.putBoolean("betPush", bet);
        getUpdateV7PushPreferencesInteractor().load(this.updatePushPreferencesListener, null, bundle);
    }

    public final void onChangeCountry() {
        Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        ChangeCountryDialogFragment.INSTANCE.newInstance().show(((FragmentActivity) activity).getSupportFragmentManager(), "ChangeCountryDialog");
    }

    public final void onChangeLanguage() {
        Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        ChangeLanguageFragment.INSTANCE.newInstance().show(((FragmentActivity) activity).getSupportFragmentManager(), "ChangeLanguageDialog");
    }

    public final void onChangeName() {
        Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        ChangeDisplayNameFragment.INSTANCE.newInstance().show(((FragmentActivity) activity).getSupportFragmentManager(), "ChangeDisplayNameDialog");
    }

    public final void onEnterInviteCode() {
        Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        ReferralCodeFragment.INSTANCE.newInstance().show(((FragmentActivity) activity).getSupportFragmentManager(), "ReferralCodeDialog");
    }

    public final void setParentFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.parentFragment = fragment;
    }

    public final void onChangeProfilePhoto() {
        final Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        ChangeUserPhotoDialogFragment newInstance = ChangeUserPhotoDialogFragment.INSTANCE.newInstance();
        newInstance.setOnPhotoDialogClickListener(new ChangeUserPhotoDialogFragment.OnPhotoDialogClickListener() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$onChangeProfilePhoto$1$1
            @Override // org.betup.ui.dialogs.ChangeUserPhotoDialogFragment.OnPhotoDialogClickListener
            public void onFromGalleryClick() {
                Fragment fragment;
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                fragment = SettingsController.this.parentFragment;
                if (fragment != null) {
                    fragment.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 1);
                    return;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                Intent createChooser = Intent.createChooser(intent, "Select Picture");
                Intrinsics.checkNotNullExpressionValue(createChooser, "createChooser(...)");
                fragmentActivity.startActivityForResult(createChooser, 1);
            }

            @Override // org.betup.ui.dialogs.ChangeUserPhotoDialogFragment.OnPhotoDialogClickListener
            public void onFromCameraClick() {
                PhotoProcessor photoProcessor;
                Intent cameraIntent;
                Fragment fragment;
                photoProcessor = SettingsController.this.photoProcessor;
                if (photoProcessor == null || (cameraIntent = photoProcessor.getCameraIntent()) == null) {
                    return;
                }
                SettingsController settingsController = SettingsController.this;
                Activity activity2 = activity;
                fragment = settingsController.parentFragment;
                if (fragment != null) {
                    fragment.startActivityForResult(cameraIntent, 2);
                } else {
                    ((FragmentActivity) activity2).startActivityForResult(cameraIntent, 2);
                }
            }
        });
        newInstance.show(((FragmentActivity) activity).getSupportFragmentManager(), "ChangeUserPhotoDialog");
    }

    public final void onVisualEffects() {
        Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        VisualEffectsFragment.INSTANCE.newInstance().show(((FragmentActivity) activity).getSupportFragmentManager(), "VisualEffectsDialog");
    }

    public final void onBalanceHistory() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.BALANCE_HISTORY, null));
    }

    public final void onLogout() {
        Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = activity.getString(R.string.lay_logout);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(R.string.sure_logout);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        companion.newInstance(string, string2, new Function0() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onLogout$lambda$14$lambda$12;
                onLogout$lambda$14$lambda$12 = SettingsController.onLogout$lambda$14$lambda$12();
                return onLogout$lambda$14$lambda$12;
            }
        }, new Function0() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }).show(((FragmentActivity) activity).getSupportFragmentManager(), "LogoutConfirmationDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLogout$lambda$14$lambda$12() {
        EventBus.getDefault().post(new SignOutMessage());
        return Unit.INSTANCE;
    }

    public final void onDeleteAccount() {
        Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = activity.getString(R.string.delete_my_account);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(R.string.sure_delete_account);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        companion.newInstance(string, string2, new Function0() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onDeleteAccount$lambda$17$lambda$15;
                onDeleteAccount$lambda$17$lambda$15 = SettingsController.onDeleteAccount$lambda$17$lambda$15();
                return onDeleteAccount$lambda$17$lambda$15;
            }
        }, new Function0() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }).show(((FragmentActivity) activity).getSupportFragmentManager(), "DeleteAccountConfirmationDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeleteAccount$lambda$17$lambda$15() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.DELETE_ACCOUNT, null));
        return Unit.INSTANCE;
    }

    public final void onNotificationForMatches() {
        Activity activity = this.activity;
        if (activity == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        AllSubscriptionsFragment.INSTANCE.newInstance().show(((FragmentActivity) activity).getSupportFragmentManager(), "AllSubscriptionsDialog");
    }

    public final void handleActivityResult(int requestCode, int resultCode, Intent data) {
        Uri data2;
        if (resultCode != -1) {
            return;
        }
        if (requestCode != 1) {
            if (requestCode != 2) {
                return;
            }
            showProgress();
            PhotoProcessor photoProcessor = this.photoProcessor;
            if (photoProcessor != null) {
                r1 = photoProcessor.getCompressedImagePath(photoProcessor != null ? photoProcessor.getCurrentPhotoPath() : null);
            }
            if (r1 == null) {
                Activity activity = this.activity;
                if (activity != null) {
                    SnackbarHelper.showShort(activity, R.string.error_occured);
                    return;
                }
                return;
            }
            getChangeV7ProfilePhotoInteractor().load(this.profilePhotoChangedListener, r1);
            return;
        }
        if (data == null || (data2 = data.getData()) == null) {
            return;
        }
        showProgress();
        try {
            Activity activity2 = this.activity;
            if (activity2 != null) {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(activity2.getContentResolver(), data2);
                PhotoProcessor photoProcessor2 = this.photoProcessor;
                r1 = photoProcessor2 != null ? photoProcessor2.getCompressedImagePath(bitmap) : null;
                if (r1 == null) {
                    SnackbarHelper.showShort(activity2, R.string.error_occured);
                } else {
                    getChangeV7ProfilePhotoInteractor().load(this.profilePhotoChangedListener, r1);
                    Unit unit = Unit.INSTANCE;
                }
            }
        } catch (IOException e) {
            Integer.valueOf(Log.e("SettingsController", "Error loading image", e));
        }
    }

    private final void showProgress() {
        try {
            ProgressDialog progressDialog = this.progressDialog;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            Activity activity = this.activity;
            if (activity != null) {
                this.progressDialog = ProgressDialog.showDialog(activity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideProgress() {
        try {
            try {
                ProgressDialog progressDialog = this.progressDialog;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.progressDialog = null;
        }
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<ReferralResponse, String> responseMessage) {
        int i;
        MetaModel metaModel;
        Integer code;
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        if (this.activity == null) {
            return;
        }
        hideProgress();
        if (responseMessage.getStat() != FetchStat.SUCCESS) {
            try {
                ReferralResponse model = responseMessage.getModel();
                i = ((model == null || (metaModel = model.metaModel) == null || (code = metaModel.getCode()) == null) ? 404 : code.intValue()) == 403 ? R.string.code_used_on_device : R.string.invalid_referral_code;
            } catch (Exception unused) {
                i = R.string.error;
            }
            SnackbarHelper.showShort(this.activity, i);
            return;
        }
        this._showInviteCode.setValue(false);
        ReferralResponse model2 = responseMessage.getModel();
        Log.d("SettingsController", "Money get = " + (model2 != null ? Integer.valueOf(model2.getMoneyGet()) : null));
        Activity activity = this.activity;
        if (activity != null) {
            InfoDialog.Builder desc = new InfoDialog.Builder(activity).allowDismiss(true).title(activity.getString(R.string.code_accepted)).desc(activity.getString(R.string.code_accepted_desc));
            ReferralResponse model3 = responseMessage.getModel();
            desc.money(model3 != null ? model3.getMoneyGet() : 0).dismissOnFirstButtonClick(true).dismissOnSecondButtonClick(true).build().show();
        }
    }
}
