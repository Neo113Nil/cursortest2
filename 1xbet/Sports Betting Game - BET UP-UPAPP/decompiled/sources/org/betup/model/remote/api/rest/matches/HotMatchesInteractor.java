package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.matches.topmatches.HotMatchesResponseModel;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: HotMatchesInteractor.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/matches/topmatches/HotMatchesResponseModel;", "", "context", "Landroid/content/Context;", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Lorg/betup/services/storage/LocalPreferencesService;)V", "invalidateRequest", "", "isLive", "params", "Landroid/os/Bundle;", "invalidateInitialPages", "getExpandedBetsInfo", MatchMyBetsInteractor.PARAM_LIMIT, "", "getHash", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", "", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
/* loaded from: classes2.dex */
public final class HotMatchesInteractor extends BaseNewVersionBettingInteractor<HotMatchesResponseModel, Boolean> {
    public static final int DEFAULT_PAGE_SIZE = 20;
    private static final long LIFETIME = 60000;
    private final LocalPreferencesService localPreferencesService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public long getLifetime(boolean id, Bundle parameters) {
        return 60000L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ int getHash(Object obj, Bundle bundle) {
        return getHash(((Boolean) obj).booleanValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ long getLifetime(Object obj, Bundle bundle) {
        return getLifetime(((Boolean) obj).booleanValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public /* bridge */ /* synthetic */ Call makeCall(NewVersionBettingApi newVersionBettingApi, Object obj, Bundle bundle, String str) {
        return makeCall(newVersionBettingApi, ((Boolean) obj).booleanValue(), bundle, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public HotMatchesInteractor(Context context, LocalPreferencesService localPreferencesService) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localPreferencesService, "localPreferencesService");
        this.localPreferencesService = localPreferencesService;
    }

    /* compiled from: HotMatchesInteractor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LIFETIME", "", "DEFAULT_PAGE_SIZE", "", "requestBundle", "Landroid/os/Bundle;", "offset", MatchMyBetsInteractor.PARAM_LIMIT, "getExpandedBetsInfo", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Bundle requestBundle$default(Companion companion, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 20;
            }
            return companion.requestBundle(i, i2, z);
        }

        public final Bundle requestBundle(int offset, int limit, boolean getExpandedBetsInfo) {
            Bundle bundle = new Bundle();
            bundle.putInt("offset", offset);
            bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, limit);
            bundle.putBoolean("getExpandedBetsInfo", getExpandedBetsInfo);
            return bundle;
        }
    }

    public final void invalidateRequest(boolean isLive, Bundle params) {
        Intrinsics.checkNotNullParameter(params, "params");
        invalidate(Boolean.valueOf(isLive), params);
    }

    public static /* synthetic */ void invalidateInitialPages$default(HotMatchesInteractor hotMatchesInteractor, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 20;
        }
        hotMatchesInteractor.invalidateInitialPages(z, z2, i);
    }

    public final void invalidateInitialPages(boolean isLive, boolean getExpandedBetsInfo, int limit) {
        invalidateRequest(isLive, INSTANCE.requestBundle(0, limit, getExpandedBetsInfo));
    }

    public int getHash(boolean isLive, Bundle params) {
        boolean globalExpandedBets;
        int i = params != null ? params.getInt("offset", 0) : 0;
        int i2 = params != null ? params.getInt(MatchMyBetsInteractor.PARAM_LIMIT, 20) : 20;
        if (params != null) {
            globalExpandedBets = params.getBoolean("getExpandedBetsInfo");
        } else {
            globalExpandedBets = this.localPreferencesService.getGlobalExpandedBets();
        }
        return HashCoder.hashCode(Boolean.valueOf(isLive), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(globalExpandedBets), Locale.getDefault().getLanguage());
    }

    protected Call<HotMatchesResponseModel> makeCall(NewVersionBettingApi bettingApi, boolean isLive, Bundle params, String token) {
        boolean globalExpandedBets;
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(token, "token");
        int i = params.getInt("offset", 0);
        int i2 = params.getInt(MatchMyBetsInteractor.PARAM_LIMIT, 20);
        String supportedLanguage = SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9);
        Boolean valueOf = Boolean.valueOf(params.getBoolean("getExpandedBetsInfo", false));
        valueOf.booleanValue();
        if (!params.containsKey("getExpandedBetsInfo")) {
            valueOf = null;
        }
        if (valueOf != null) {
            globalExpandedBets = valueOf.booleanValue();
        } else {
            globalExpandedBets = this.localPreferencesService.getGlobalExpandedBets();
        }
        boolean z = globalExpandedBets;
        if (isLive) {
            Call<HotMatchesResponseModel> hotLiveMatches = bettingApi.getHotLiveMatches(token, i, i2, z, supportedLanguage);
            Intrinsics.checkNotNull(hotLiveMatches);
            return hotLiveMatches;
        }
        Call<HotMatchesResponseModel> hotMatches = bettingApi.getHotMatches(token, i, i2, z, supportedLanguage);
        Intrinsics.checkNotNull(hotMatches);
        return hotMatches;
    }
}
