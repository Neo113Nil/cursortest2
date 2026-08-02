package org.betup.services.user;

import javax.inject.Inject;
import org.betup.model.remote.api.rest.user.ReportDailyQuestClientEventInteractor;

/* loaded from: classes2.dex */
public class UserServiceAccessor {

    @Inject
    ReportDailyQuestClientEventInteractor reportDailyQuestClientEventInteractor;

    @Inject
    UserService userService;

    public UserService getUserService() {
        return this.userService;
    }

    public ReportDailyQuestClientEventInteractor getReportDailyQuestClientEventInteractor() {
        return this.reportDailyQuestClientEventInteractor;
    }
}
