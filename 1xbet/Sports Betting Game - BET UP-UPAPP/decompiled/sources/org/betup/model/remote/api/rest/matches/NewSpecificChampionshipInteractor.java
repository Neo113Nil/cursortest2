package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.BetPresentation;
import org.betup.model.remote.api.MatchType;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.matches.championship.specific.NewMatchesForLeagueModel;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;
import org.betup.ui.FilterController;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: NewSpecificChampionshipInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lorg/betup/model/remote/api/rest/matches/NewSpecificChampionshipInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchesForLeagueModel;", "", "context", "Landroid/content/Context;", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "userService", "Lorg/betup/services/user/UserService;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Lorg/betup/services/storage/LocalPreferencesService;Lorg/betup/services/user/UserService;)V", "invalidate", "", "id", "getHash", "sid", "params", "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", "", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewSpecificChampionshipInteractor extends BaseNewVersionBettingInteractor<NewMatchesForLeagueModel, Integer> {
    private static final long LIFETIME = 60000;
    private static final long LIFETIME_FUTURE = 300000;
    private final LocalPreferencesService localPreferencesService;
    private final UserService userService;
    public static final int $stable = 8;

    /* compiled from: NewSpecificChampionshipInteractor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterController.MatchesFilter.values().length];
            try {
                iArr[FilterController.MatchesFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterController.MatchesFilter.ONE_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterController.MatchesFilter.LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterController.MatchesFilter.ONE_HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterController.MatchesFilter.THREE_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FilterController.MatchesFilter.SIX_HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FilterController.MatchesFilter.TWELVE_HOURS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ int getHash(Object obj, Bundle bundle) {
        return getHash(((Number) obj).intValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ long getLifetime(Object obj, Bundle bundle) {
        return getLifetime(((Number) obj).intValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ void invalidate(Object obj) {
        invalidate(((Number) obj).intValue());
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public /* bridge */ /* synthetic */ Call makeCall(NewVersionBettingApi newVersionBettingApi, Object obj, Bundle bundle, String str) {
        return makeCall(newVersionBettingApi, ((Number) obj).intValue(), bundle, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public NewSpecificChampionshipInteractor(Context context, LocalPreferencesService localPreferencesService, UserService userService) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localPreferencesService, "localPreferencesService");
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.localPreferencesService = localPreferencesService;
        this.userService = userService;
    }

    public void invalidate(int id) {
        clearCache();
    }

    public int getHash(int sid, Bundle params) {
        if ((params != null ? params.get("type") : null) == null) {
            throw new IllegalArgumentException("No type provided for request in NewSpecificChampionshipInteractor");
        }
        if (params.get("filter") == null) {
            throw new IllegalArgumentException("No filter provided for request in NewSpecificChampionshipInteractor");
        }
        if (params.get("bets") != null) {
            return HashCoder.hashCode(Integer.valueOf(sid), params.get("filter"), params.get("bets"), Integer.valueOf(params.getInt("offset", 0)), Integer.valueOf(params.getInt(MatchMyBetsInteractor.PARAM_LIMIT, 100)), Boolean.valueOf(params.getBoolean("isTour", false)), Locale.getDefault().getLanguage(), Long.valueOf(this.userService.getBetupUserIdOrZero()));
        }
        throw new IllegalArgumentException("No bet format for request in NewSpecificChampionshipInteractor");
    }

    protected Call<NewMatchesForLeagueModel> makeCall(NewVersionBettingApi bettingApi, int sid, Bundle params, String token) {
        String str;
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(token, "token");
        Object obj = params.get("filter");
        FilterController.MatchesFilter matchesFilter = obj instanceof FilterController.MatchesFilter ? (FilterController.MatchesFilter) obj : null;
        String valueOf = String.valueOf(params.getString("type"));
        switch (matchesFilter == null ? -1 : WhenMappings.$EnumSwitchMapping$0[matchesFilter.ordinal()]) {
            case 1:
            default:
                str = "All";
                break;
            case 2:
                str = "Today";
                break;
            case 3:
                str = "Live";
                break;
            case 4:
                str = "OneHour";
                break;
            case 5:
                str = "ThreeHours";
                break;
            case 6:
                str = "SixHours";
                break;
            case 7:
                str = "TwelveHours";
                break;
        }
        Object obj2 = params.get("bets");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.betup.model.local.entity.BetPresentation");
        Call<NewMatchesForLeagueModel> newSpecificChampionship = bettingApi.getNewSpecificChampionship(token, sid, str, params.getInt("offset", 0), params.getInt(MatchMyBetsInteractor.PARAM_LIMIT, 100), this.localPreferencesService.getGlobalExpandedBets() || ((BetPresentation) obj2) == BetPresentation.FULL, valueOf, SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9), null, params.getBoolean("isTour", false) ? true : null);
        Intrinsics.checkNotNullExpressionValue(newSpecificChampionship, "getNewSpecificChampionship(...)");
        return newSpecificChampionship;
    }

    public long getLifetime(int id, Bundle parameters) {
        return (parameters != null ? parameters.get("type") : null) == MatchType.LIVE ? 60000L : 300000L;
    }
}
