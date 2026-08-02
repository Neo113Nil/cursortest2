package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.user.TutorialCompleteResponseModel;
import org.betup.model.remote.entity.user.UpdateTutorialCompleteRequestModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: V7UpdateTutorialCompleteInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J2\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0015"}, d2 = {"Lorg/betup/model/remote/api/rest/user/V7UpdateTutorialCompleteInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/user/TutorialCompleteResponseModel;", "Ljava/lang/Void;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "invalidate", "", "id", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "token", "", "getLifetime", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class V7UpdateTutorialCompleteInteractor extends BaseNewVersionBettingInteractor<TutorialCompleteResponseModel, Void> {
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(Void id) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public V7UpdateTutorialCompleteInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<TutorialCompleteResponseModel> makeCall(NewVersionBettingApi bettingApi, Void id, Bundle parameters, String token) {
        UpdateTutorialCompleteRequestModel updateTutorialCompleteRequestModel;
        String string;
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(token, "token");
        boolean z = parameters != null ? parameters.getBoolean("tutorialComplete", true) : true;
        boolean z2 = parameters != null ? parameters.getBoolean("giveReward", false) : false;
        String str = null;
        if (parameters != null && (string = parameters.getString("tourDemoBetType")) != null && !StringsKt.isBlank(string)) {
            str = string;
        }
        if (str != null) {
            updateTutorialCompleteRequestModel = new UpdateTutorialCompleteRequestModel(Boolean.valueOf(z), Boolean.valueOf(z2), str);
        } else {
            updateTutorialCompleteRequestModel = new UpdateTutorialCompleteRequestModel(Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        Call<TutorialCompleteResponseModel> updateV7TutorialComplete = bettingApi.updateV7TutorialComplete(token, updateTutorialCompleteRequestModel);
        Intrinsics.checkNotNullExpressionValue(updateV7TutorialComplete, "updateV7TutorialComplete(...)");
        return updateV7TutorialComplete;
    }
}
