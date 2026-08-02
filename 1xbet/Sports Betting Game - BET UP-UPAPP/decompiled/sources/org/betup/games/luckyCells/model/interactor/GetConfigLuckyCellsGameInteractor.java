package org.betup.games.luckyCells.model.interactor;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.luckyCells.model.rest.LuckyCellsGameConfig;
import org.betup.model.remote.api.infrastructure.MiniGameApi;
import org.betup.model.remote.api.rest.base.BaseGamesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: GetConfigLuckyCellsGameInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014¨\u0006\u0013"}, d2 = {"Lorg/betup/games/luckyCells/model/interactor/GetConfigLuckyCellsGameInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseGamesInteractor;", "Lorg/betup/games/luckyCells/model/rest/LuckyCellsGameConfig;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLifetime", "", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/MiniGameApi;", "token", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetConfigLuckyCellsGameInteractor extends BaseGamesInteractor<LuckyCellsGameConfig, Integer> {
    public static final int $stable = 8;

    public long getLifetime(int id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public /* bridge */ /* synthetic */ long getLifetime(Object obj, Bundle bundle) {
        return getLifetime(((Number) obj).intValue(), bundle);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public /* bridge */ /* synthetic */ Call makeCall(MiniGameApi miniGameApi, Object obj, Bundle bundle, String str) {
        return makeCall(miniGameApi, ((Number) obj).intValue(), bundle, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetConfigLuckyCellsGameInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected Call<LuckyCellsGameConfig> makeCall(MiniGameApi api, int id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(token, "token");
        return api.getConfigLuckyCellsGame(token);
    }
}
