package org.betup.model.local.interactor;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.local.AppDatabase;
import org.betup.model.local.entity.Event;
import org.betup.model.local.entity.EventParam;

@Singleton
/* loaded from: classes2.dex */
public class AddEventInteractor extends BaseLocalInteractor<Event, Event> {
    @Inject
    public AddEventInteractor(Context context, AppDatabase appDatabase) {
        super(context, appDatabase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.local.interactor.BaseLocalInteractor
    public Event doJob(AppDatabase appDatabase, Event params, Bundle bundle) {
        long insertEvent = appDatabase.eventDao().insertEvent(params);
        Iterator<EventParam> it = params.getEventParams().iterator();
        while (it.hasNext()) {
            it.next().setEventId(insertEvent);
        }
        appDatabase.eventDao().insertEventParams((EventParam[]) params.getEventParams().toArray(new EventParam[params.getEventParams().size()]));
        return params;
    }
}
