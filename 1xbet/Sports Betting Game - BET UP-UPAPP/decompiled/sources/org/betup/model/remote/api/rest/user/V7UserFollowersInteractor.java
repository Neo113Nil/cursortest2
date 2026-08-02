package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.entity.user.NewUserFollowersModel;
import org.betup.utils.HashCoder;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: V7UserFollowersInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/api/rest/user/V7UserFollowersInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/user/NewUserFollowersModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "invalidate", "", "id", "getHash", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "bettingApi", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "token", "", "getLifetime", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class V7UserFollowersInteractor extends BaseNewVersionBettingInteractor<NewUserFollowersModel, Integer> {
    private static final long LIFETIME = 0;
    public static final int $stable = 8;

    public long getLifetime(int id, Bundle parameters) {
        return 0L;
    }

    public void invalidate(int id) {
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
    public V7UserFollowersInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public int getHash(int id, Bundle parameters) {
        return HashCoder.hashCode(Integer.valueOf(id), Integer.valueOf(parameters != null ? parameters.getInt("offset") : 0), Integer.valueOf(parameters != null ? parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT) : 10), Locale.getDefault().getLanguage());
    }

    protected Call<NewUserFollowersModel> makeCall(NewVersionBettingApi bettingApi, int id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(bettingApi, "bettingApi");
        Intrinsics.checkNotNullParameter(token, "token");
        Call<NewUserFollowersModel> v7UserFollowers = bettingApi.getV7UserFollowers(token, id, parameters != null ? parameters.getInt("offset") : 0, parameters != null ? parameters.getInt(MatchMyBetsInteractor.PARAM_LIMIT) : 10, SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.BIG_9));
        Intrinsics.checkNotNullExpressionValue(v7UserFollowers, "getV7UserFollowers(...)");
        return v7UserFollowers;
    }
}
