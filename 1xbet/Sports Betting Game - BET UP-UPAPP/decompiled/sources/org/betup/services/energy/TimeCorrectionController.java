package org.betup.services.energy;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.server.V7GetServerInfoInteractor;
import org.betup.model.remote.entity.server.ServerInfoModel;
import org.betup.utils.DateHelper;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TimeCorrectionController.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/services/energy/TimeCorrectionController;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/server/ServerInfoModel;", "Ljava/lang/Void;", "context", "Landroid/content/Context;", "timeCorrectionController", "Lorg/betup/services/energy/TimeCorrectionListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Lorg/betup/services/energy/TimeCorrectionListener;)V", "serverInfoInteractor", "Lorg/betup/model/remote/api/rest/server/V7GetServerInfoInteractor;", "onFetched", "", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "getCorrectedTime", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeCorrectionController implements BaseCachedSharedInteractor.OnFetchedListener<ServerInfoModel, Void> {
    public static final int $stable = 8;
    private final Context context;
    private V7GetServerInfoInteractor serverInfoInteractor;
    private final TimeCorrectionListener timeCorrectionController;

    public TimeCorrectionController(Context context, TimeCorrectionListener timeCorrectionController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeCorrectionController, "timeCorrectionController");
        this.context = context;
        this.timeCorrectionController = timeCorrectionController;
        this.serverInfoInteractor = new V7GetServerInfoInteractor(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<ServerInfoModel, Void> responseMessage) {
        if ((responseMessage != null ? responseMessage.getStat() : null) != FetchStat.SUCCESS) {
            return;
        }
        Long currentTimestamp = responseMessage.getModel().getCurrentTimestamp();
        Intrinsics.checkNotNullExpressionValue(currentTimestamp, "getCurrentTimestamp(...)");
        this.timeCorrectionController.calculateTimestamp(DateHelper.getMillisFromSeconds(currentTimestamp.longValue()) - System.currentTimeMillis());
    }

    public final void getCorrectedTime() {
        Bundle bundle = new Bundle();
        bundle.putString("lang", SupportedLanguagesManager.getSupportedLanguage(this.context, SupportedLanguagesManager.LangTypeGroup.DEFAULT_4));
        this.serverInfoInteractor.load(this, null, bundle);
    }
}
