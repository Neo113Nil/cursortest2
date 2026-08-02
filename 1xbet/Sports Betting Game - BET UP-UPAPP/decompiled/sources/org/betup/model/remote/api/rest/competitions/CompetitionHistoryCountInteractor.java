package org.betup.model.remote.api.rest.competitions;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.dynamiclinks.DynamicLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.competitions.CompetitionHistoryCountModel;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: CompetitionHistoryCountInteractor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lorg/betup/model/remote/api/rest/competitions/CompetitionHistoryCountInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/competitions/CompetitionHistoryCountModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "token", "", "(Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;Ljava/lang/Long;Landroid/os/Bundle;Ljava/lang/String;)Lretrofit2/Call;", "getLifetime", "(Ljava/lang/Long;Landroid/os/Bundle;)J", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompetitionHistoryCountInteractor extends BaseNewVersionBettingInteractor<CompetitionHistoryCountModel, Long> {
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Long id, Bundle parameters) {
        return 300000L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public CompetitionHistoryCountInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<CompetitionHistoryCountModel> makeCall(NewVersionBettingApi api, Long id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(token, "token");
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9);
        Log.d("CompetitionHistoryCountInteractor", "makeCall - lang: " + supportedLanguage + ", token: " + StringsKt.take(token, 20) + "...");
        Call<CompetitionHistoryCountModel> competitionsHistoryCount = api.getCompetitionsHistoryCount(token, supportedLanguage);
        Intrinsics.checkNotNullExpressionValue(competitionsHistoryCount, "getCompetitionsHistoryCount(...)");
        return competitionsHistoryCount;
    }
}
