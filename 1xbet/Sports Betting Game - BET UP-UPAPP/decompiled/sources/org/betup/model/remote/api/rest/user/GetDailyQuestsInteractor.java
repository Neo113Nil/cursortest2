package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.rest.base.BaseAnalyticsInteractor;
import org.betup.model.remote.entity.quest.UserDailyQuestInstanceDto;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: GetDailyQuestsInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/api/rest/user/GetDailyQuestsInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseAnalyticsInteractor;", "Lorg/betup/model/remote/entity/quest/UserDailyQuestInstanceDto;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "makeCall", "Lretrofit2/Call;", "analyticsApi", "Lorg/betup/model/remote/api/infrastructure/AnalyticsApi;", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "token", "", "(Lorg/betup/model/remote/api/infrastructure/AnalyticsApi;Lkotlin/Unit;Landroid/os/Bundle;Ljava/lang/String;)Lretrofit2/Call;", "getLifetime", "", "(Lkotlin/Unit;Landroid/os/Bundle;)J", "getHash", "", "(Lkotlin/Unit;Landroid/os/Bundle;)I", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetDailyQuestsInteractor extends BaseAnalyticsInteractor<UserDailyQuestInstanceDto, Unit> {
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Unit id, Bundle parameters) {
        return 15000L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetDailyQuestsInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<UserDailyQuestInstanceDto> makeCall(AnalyticsApi analyticsApi, Unit id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(token, "token");
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9);
        Intrinsics.checkNotNull(supportedLanguage);
        return analyticsApi.getDailyQuests(token, supportedLanguage);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(Unit id, Bundle parameters) {
        return ("daily_quests_" + SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9)).hashCode();
    }
}
