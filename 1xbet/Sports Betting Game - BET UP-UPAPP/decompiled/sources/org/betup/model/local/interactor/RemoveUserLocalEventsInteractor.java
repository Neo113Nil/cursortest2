package org.betup.model.local.interactor;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.local.AppDatabase;

@Singleton
/* loaded from: classes2.dex */
public class RemoveUserLocalEventsInteractor extends BaseLocalInteractor<Boolean, Integer> {
    @Inject
    public RemoveUserLocalEventsInteractor(Context context, AppDatabase appDatabase) {
        super(context, appDatabase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.local.interactor.BaseLocalInteractor
    public Boolean doJob(AppDatabase appDatabase, Integer params, Bundle bundle) {
        appDatabase.eventDao().clearEventParams(params.intValue());
        appDatabase.eventDao().clearEvents(params.intValue());
        return true;
    }
}
