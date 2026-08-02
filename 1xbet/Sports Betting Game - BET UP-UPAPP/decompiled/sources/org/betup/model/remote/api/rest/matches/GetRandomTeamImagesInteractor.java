package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.teams.TeamImageUrlModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: GetRandomTeamImagesInteractor.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J6\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/api/rest/matches/GetRandomTeamImagesInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "", "Lorg/betup/model/remote/entity/teams/TeamImageUrlModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getHash", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Singleton
/* loaded from: classes2.dex */
public final class GetRandomTeamImagesInteractor extends BaseNewVersionBettingInteractor<List<? extends TeamImageUrlModel>, Integer> {
    public static final String KEY_SLOT = "slot";
    public static final String KEY_SPORT_ID = "sportId";
    public static final int $stable = 8;

    public long getLifetime(int id, Bundle parameters) {
        return 0L;
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
    public GetRandomTeamImagesInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public int getHash(int id, Bundle parameters) {
        String string;
        int hashCode = Integer.hashCode(id);
        if (parameters != null && (string = parameters.getString(KEY_SLOT)) != null) {
            hashCode = (hashCode * 31) + string.hashCode();
        }
        if (parameters == null) {
            return hashCode;
        }
        long j = parameters.getLong(KEY_SPORT_ID, -1L);
        return j >= 0 ? (hashCode * 31) + ((int) j) : hashCode;
    }

    protected Call<List<TeamImageUrlModel>> makeCall(NewVersionBettingApi bettingApi, int id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(token, "token");
        int coerceIn = RangesKt.coerceIn(id, 1, 50);
        Long l = null;
        if (parameters != null) {
            Long valueOf = Long.valueOf(parameters.getLong(KEY_SPORT_ID, -1L));
            if (valueOf.longValue() >= 0) {
                l = valueOf;
            }
        }
        Call<List<TeamImageUrlModel>> randomTeamImages = bettingApi.getRandomTeamImages(token, coerceIn, l);
        Intrinsics.checkNotNullExpressionValue(randomTeamImages, "getRandomTeamImages(...)");
        return randomTeamImages;
    }
}
