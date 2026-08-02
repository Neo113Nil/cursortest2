package org.betup.model.local.interactor;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.local.AppDatabase;

@Singleton
/* loaded from: classes2.dex */
public class GetNewEventsCountInteractor extends BaseLocalInteractor<Integer, Integer> {
    @Inject
    public GetNewEventsCountInteractor(Context context, AppDatabase appDatabase) {
        super(context, appDatabase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.local.interactor.BaseLocalInteractor
    public Integer doJob(AppDatabase appDatabase, Integer params, Bundle bundle) {
        return Integer.valueOf(appDatabase.eventDao().getNewCountById(true, params.intValue()));
    }
}
