package org.betup.model.local.interactor;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.local.AppDatabase;

@Singleton
/* loaded from: classes2.dex */
public class ReadAllEventsInteractor extends BaseLocalInteractor<Boolean, Integer> {
    @Inject
    public ReadAllEventsInteractor(Context context, AppDatabase database) {
        super(context, database);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.local.interactor.BaseLocalInteractor
    public Boolean doJob(AppDatabase appDatabase, Integer params, Bundle bundle) {
        appDatabase.eventDao().readAllNew(params.intValue());
        return true;
    }
}
