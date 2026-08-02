package org.betup.model.local.interactor;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.local.AppDatabase;

@Singleton
/* loaded from: classes2.dex */
public class ReadEventInteractor extends BaseLocalInteractor<Boolean, String> {
    @Inject
    public ReadEventInteractor(Context context, AppDatabase appDatabase) {
        super(context, appDatabase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.local.interactor.BaseLocalInteractor
    public Boolean doJob(AppDatabase appDatabase, String params, Bundle bundle) {
        appDatabase.eventDao().readEvent(params);
        return true;
    }
}
