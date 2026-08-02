package org.betup.ui.fragment.settings.controller;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.changephoto.model.ChangePhotoModel;
import org.betup.services.user.UserService;
import org.betup.utils.SnackbarHelper;

/* compiled from: SettingsController.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\b"}, d2 = {"org/betup/ui/fragment/settings/controller/SettingsController$profilePhotoChangedListener$1", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/api/rest/user/changephoto/model/ChangePhotoModel;", "", "onFetched", "", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SettingsController$profilePhotoChangedListener$1 implements BaseCachedSharedInteractor.OnFetchedListener<ChangePhotoModel, String> {
    final /* synthetic */ SettingsController this$0;

    SettingsController$profilePhotoChangedListener$1(SettingsController settingsController) {
        this.this$0 = settingsController;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<ChangePhotoModel, String> responseMessage) {
        Activity activity;
        Activity activity2;
        Activity activity3;
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        activity = this.this$0.activity;
        if (activity == null) {
            return;
        }
        if (responseMessage.getStat() != FetchStat.SUCCESS) {
            activity3 = this.this$0.activity;
            SnackbarHelper.showShort(activity3, R.string.invalid_server_response);
            this.this$0.hideProgress();
        } else {
            activity2 = this.this$0.activity;
            SnackbarHelper.showShort(activity2, R.string.changes_applied);
            Handler handler = new Handler(Looper.getMainLooper());
            final SettingsController settingsController = this.this$0;
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.fragment.settings.controller.SettingsController$profilePhotoChangedListener$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsController$profilePhotoChangedListener$1.onFetched$lambda$0(SettingsController.this);
                }
            }, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$0(SettingsController settingsController) {
        settingsController.hideProgress();
        settingsController.getUserService().invalidate(UserService.InfoKind.GENERAL);
        settingsController.getUserService().syncProfile(UserService.InfoKind.GENERAL);
    }
}
