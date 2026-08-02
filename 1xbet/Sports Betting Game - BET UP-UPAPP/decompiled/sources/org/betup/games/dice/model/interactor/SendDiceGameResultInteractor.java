package org.betup.games.dice.model.interactor;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.Gson;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.common.remote.GamesErrorCodeModel;
import org.betup.games.dice.model.rest.DiceBetType;
import org.betup.games.dice.model.rest.DiceGameRecordModel;
import org.betup.games.dice.model.rest.DicePlayGameRequest;
import org.betup.model.remote.api.infrastructure.MiniGameApi;
import org.betup.model.remote.api.rest.base.BaseGamesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: SendDiceGameResultInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ9\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006\u0017"}, d2 = {"Lorg/betup/games/dice/model/interactor/SendDiceGameResultInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseGamesInteractor;", "Lorg/betup/games/dice/model/rest/DiceGameRecordModel;", "", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLifetime", "", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "(Lkotlin/Unit;Landroid/os/Bundle;)J", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/MiniGameApi;", "token", "", "(Lorg/betup/model/remote/api/infrastructure/MiniGameApi;Lkotlin/Unit;Landroid/os/Bundle;Ljava/lang/String;)Lretrofit2/Call;", "transformErrorBody", "body", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SendDiceGameResultInteractor extends BaseGamesInteractor<DiceGameRecordModel, Unit> {
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Unit id, Bundle parameters) {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SendDiceGameResultInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<DiceGameRecordModel> makeCall(MiniGameApi api, Unit id, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(token, "token");
        Double valueOf = parameters != null ? Double.valueOf(parameters.getDouble("betAmount")) : null;
        String string = parameters != null ? parameters.getString("diceGameBetType") : null;
        if (valueOf == null || string == null) {
            return null;
        }
        return api.playDiceGame(token, new DicePlayGameRequest((int) valueOf.doubleValue(), DiceBetType.valueOf(string)));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public DiceGameRecordModel transformErrorBody(String body) {
        try {
            GamesErrorCodeModel gamesErrorCodeModel = (GamesErrorCodeModel) new Gson().fromJson(body, GamesErrorCodeModel.class);
            DiceGameRecordModel diceGameRecordModel = (DiceGameRecordModel) new Gson().fromJson(body, DiceGameRecordModel.class);
            diceGameRecordModel.setGamesErrorCodeModel(gamesErrorCodeModel);
            return diceGameRecordModel;
        } catch (Exception e) {
            Log.d("GAMEERRORCODES", "ERROR!");
            e.printStackTrace();
            return null;
        }
    }
}
