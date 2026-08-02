package org.betup.model.local.interactor;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import org.betup.model.local.AppDatabase;

/* loaded from: classes2.dex */
public class GetNewEventsCountInteractorByUUID extends BaseLocalInteractor<Integer, String> {
    @Inject
    public GetNewEventsCountInteractorByUUID(Context context, AppDatabase appDatabase) {
        super(context, appDatabase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.local.interactor.BaseLocalInteractor
    public Integer doJob(AppDatabase appDatabase, String params, Bundle bundle) {
        return Integer.valueOf(appDatabase.eventDao().getNewCountByUUID(true, params));
    }
}
