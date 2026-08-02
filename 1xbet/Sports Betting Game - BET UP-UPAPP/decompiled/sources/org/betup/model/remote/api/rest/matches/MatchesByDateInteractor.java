package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.time.LocalDate;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.matches.NewMatchesResponseModel;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: MatchesByDateInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/api/rest/matches/MatchesByDateInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/matches/NewMatchesResponseModel;", "", "context", "Landroid/content/Context;", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Lorg/betup/services/storage/LocalPreferencesService;)V", "getHash", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", "", "getRetryCount", "isCritical", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MatchesByDateInteractor extends BaseNewVersionBettingInteractor<NewMatchesResponseModel, Integer> {
    public static final int $stable = 8;
    private final LocalPreferencesService localPreferencesService;

    public long getLifetime(int id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getRetryCount() {
        return 1;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public boolean isCritical() {
        return true;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ int getHash(Object obj, Bundle bundle) {
        return getHash(((Number) obj).intValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ long getLifetime(Object obj, Bundle bundle) {
        return getLifetime(((Number) obj).intValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public /* bridge */ /* synthetic */ Call makeCall(NewVersionBettingApi newVersionBettingApi, Object obj, Bundle bundle, String str) {
        return makeCall(newVersionBettingApi, ((Number) obj).intValue(), bundle, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public MatchesByDateInteractor(Context context, LocalPreferencesService localPreferencesService) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localPreferencesService, "localPreferencesService");
        this.localPreferencesService = localPreferencesService;
    }

    public int getHash(int id, Bundle parameters) {
        String localDate;
        boolean globalExpandedBets;
        if (parameters == null || (localDate = parameters.getString("date")) == null) {
            localDate = LocalDate.now().toString();
            Intrinsics.checkNotNullExpressionValue(localDate, "toString(...)");
        }
        if (parameters != null) {
            globalExpandedBets = parameters.getBoolean("getExpandedBetsInfo");
        } else {
            globalExpandedBets = this.localPreferencesService.getGlobalExpandedBets();
        }
        return (id + "-" + localDate + "-" + globalExpandedBets).hashCode();
    }

    protected Call<NewMatchesResponseModel> makeCall(NewVersionBettingApi bettingApi, int id, Bundle parameters, String token) {
        boolean globalExpandedBets;
        String localDate;
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(token, "token");
        int i = parameters != null ? parameters.getInt("offset") : 0;
        int i2 = parameters != null ? parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT) : 10;
        if (parameters != null) {
            globalExpandedBets = parameters.getBoolean("getExpandedBetsInfo");
        } else {
            globalExpandedBets = this.localPreferencesService.getGlobalExpandedBets();
        }
        boolean z = globalExpandedBets;
        if (parameters == null || (localDate = parameters.getString("date")) == null) {
            localDate = LocalDate.now().toString();
            Intrinsics.checkNotNullExpressionValue(localDate, "toString(...)");
        }
        Call<NewMatchesResponseModel> leagueMatchesByDate = bettingApi.getLeagueMatchesByDate(token, id, i, i2, z, localDate, SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.DEFAULT_4));
        Intrinsics.checkNotNullExpressionValue(leagueMatchesByDate, "getLeagueMatchesByDate(...)");
        return leagueMatchesByDate;
    }
}
