package org.betup.model.remote.api.rest.rewardedprompt;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.rest.base.BaseAnalyticsInteractor;
import org.betup.model.remote.entity.rewardedprompt.RewardedPromptActionRequest;
import org.betup.model.remote.entity.rewardedprompt.UserRewardedPromptStateDto;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: RewardedPromptInteractors.kt */
@Singleton
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0013"}, d2 = {"Lorg/betup/model/remote/api/rest/rewardedprompt/PostRewardedPromptActionInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseAnalyticsInteractor;", "Lorg/betup/model/remote/entity/rewardedprompt/UserRewardedPromptStateDto;", "Lorg/betup/model/remote/api/rest/rewardedprompt/PostRewardedPromptActionRequest;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/AnalyticsApi;", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "token", "", "getLifetime", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PostRewardedPromptActionInteractor extends BaseAnalyticsInteractor<UserRewardedPromptStateDto, PostRewardedPromptActionRequest> {
    public static final int $stable = 8;

    /* compiled from: RewardedPromptInteractors.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardedPromptActionType.values().length];
            try {
                iArr[RewardedPromptActionType.IMPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardedPromptActionType.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardedPromptActionType.WATCH_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardedPromptActionType.WATCH_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(PostRewardedPromptActionRequest id, Bundle parameters) {
        Intrinsics.checkNotNullParameter(id, "id");
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PostRewardedPromptActionInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<UserRewardedPromptStateDto> makeCall(AnalyticsApi api, PostRewardedPromptActionRequest id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        RewardedPromptActionRequest rewardedPromptActionRequest = new RewardedPromptActionRequest(id.getEventKey(), id.getScreenKey());
        int i = WhenMappings.$EnumSwitchMapping$0[id.getActionType().ordinal()];
        if (i == 1) {
            return api.markRewardedPromptImpression(token, id.getCampaignId(), rewardedPromptActionRequest);
        }
        if (i == 2) {
            return api.markRewardedPromptDismiss(token, id.getCampaignId(), rewardedPromptActionRequest);
        }
        if (i == 3) {
            return api.markRewardedPromptWatchStarted(token, id.getCampaignId(), rewardedPromptActionRequest);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return api.markRewardedPromptWatchCompleted(token, id.getCampaignId(), rewardedPromptActionRequest);
    }
}
