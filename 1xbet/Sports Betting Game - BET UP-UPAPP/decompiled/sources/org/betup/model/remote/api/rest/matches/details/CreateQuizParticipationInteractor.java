package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.Language;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.matches.details.CreateQuizParticipationModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationResponseModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import retrofit2.Call;

/* compiled from: CreateQuizParticipationInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¨\u0006\u0015"}, d2 = {"Lorg/betup/model/remote/api/rest/matches/details/CreateQuizParticipationInteractor;", "Lorg/betup/model/remote/api/rest/base/BaseNewVersionBettingInteractor;", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationResponseModel;", "Lorg/betup/model/remote/entity/matches/details/CreateQuizParticipationModel;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLifetime", "", "id", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Landroid/os/Bundle;", "makeCall", "Lretrofit2/Call;", "api", "Lorg/betup/model/remote/api/infrastructure/NewVersionBettingApi;", "participation", "token", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateQuizParticipationInteractor extends BaseNewVersionBettingInteractor<QuizParticipationResponseModel, CreateQuizParticipationModel> {
    private static final long LIFETIME = 5000;
    public static final int $stable = 8;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(CreateQuizParticipationModel id, Bundle parameters) {
        return 5000L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public CreateQuizParticipationInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<QuizParticipationResponseModel> makeCall(NewVersionBettingApi api, CreateQuizParticipationModel participation, Bundle parameters, String token) {
        Intrinsics.checkNotNullParameter(participation, "participation");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNull(api);
        Call<QuizParticipationResponseModel> addQuizParticipation = api.addQuizParticipation(token, participation.getQuizId(), participation, Language.getCurrent().getCode());
        Intrinsics.checkNotNullExpressionValue(addQuizParticipation, "addQuizParticipation(...)");
        return addQuizParticipation;
    }
}
