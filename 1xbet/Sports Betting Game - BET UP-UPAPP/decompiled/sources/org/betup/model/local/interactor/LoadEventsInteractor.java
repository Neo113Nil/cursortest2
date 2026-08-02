package org.betup.model.local.interactor;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.local.AppDatabase;
import org.betup.model.local.entity.Event;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;

@Singleton
/* loaded from: classes2.dex */
public class LoadEventsInteractor extends BaseLocalInteractor<List<Event>, Integer> {
    private static final int DEFAULT_LIMIT = 100;
    private static final int DEFAULT_OFFSET = 0;

    @Inject
    public LoadEventsInteractor(Context context, AppDatabase appDatabase) {
        super(context, appDatabase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.local.interactor.BaseLocalInteractor
    public List<Event> doJob(AppDatabase appDatabase, Integer params, Bundle bundle) {
        int i;
        int i2;
        Log.d("EVENTTEST", "STARTING DOING JOB");
        if (bundle != null) {
            i = bundle.getInt("offset");
            i2 = bundle.getInt(MatchMyBetsInteractor.PARAM_LIMIT);
        } else {
            i = 0;
            i2 = 100;
        }
        List<Event> events = appDatabase.eventDao().getEvents(i2, i, params.intValue());
        for (Event event : events) {
            event.setEventParams(appDatabase.eventDao().getEventParamsForEvent(event.getEventId()));
        }
        Log.d("EVENTTEST", "LOADED EVENTS " + events.size());
        return events;
    }
}
