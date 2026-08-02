package org.betup.model.remote.api.rest.rewardedprompt;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.rest.analytics.AnalyticsTrackDeviceParams;
import org.betup.model.remote.api.rest.base.BaseAnalyticsInteractor;
import org.betup.model.remote.entity.rewardedprompt.RewardedPromptCampaignDto;
import org.betup.rewardedprompt.RewardedPromptContextParams;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: RewardedPromptInteractors.kt */
@Singleton
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lorg/betup/model/remote/api/rest/rewardedprompt/GetEligibleRewardedPromptsInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseAnalyticsInteractor;", "", "Lorg/betup/model/remote/entity/rewardedprompt/RewardedPromptCampaignDto;", "Lorg/betup/model/remote/api/rest/rewardedprompt/RewardedPromptEligibilityRequest;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/AnalyticsApi;", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "token", "", "getLifetime", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetEligibleRewardedPromptsInteractor extends BaseAnalyticsInteractor<List<? extends RewardedPromptCampaignDto>, RewardedPromptEligibilityRequest> {
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(RewardedPromptEligibilityRequest id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetEligibleRewardedPromptsInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<List<RewardedPromptCampaignDto>> makeCall(AnalyticsApi api, RewardedPromptEligibilityRequest id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        String eventKey = id.getEventKey();
        String screenKey = id.getScreenKey();
        String json = RewardedPromptContextParams.INSTANCE.toJson(id.getContextParams());
        int buildNumber = AnalyticsTrackDeviceParams.INSTANCE.buildNumber();
        String lowerCase = AnalyticsTrackDeviceParams.INSTANCE.osTypeAndroid().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return api.getEligibleRewardedPrompts(token, eventKey, screenKey, json, buildNumber, lowerCase);
    }
}
