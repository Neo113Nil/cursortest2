package org.betup.services.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.ReportDailyQuestClientEventInteractor;

/* loaded from: classes2.dex */
public final class UserServiceAccessor_MembersInjector implements MembersInjector<UserServiceAccessor> {
    private final Provider<ReportDailyQuestClientEventInteractor> reportDailyQuestClientEventInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public UserServiceAccessor_MembersInjector(Provider<UserService> userServiceProvider, Provider<ReportDailyQuestClientEventInteractor> reportDailyQuestClientEventInteractorProvider) {
        this.userServiceProvider = userServiceProvider;
        this.reportDailyQuestClientEventInteractorProvider = reportDailyQuestClientEventInteractorProvider;
    }

    public static MembersInjector<UserServiceAccessor> create(Provider<UserService> userServiceProvider, Provider<ReportDailyQuestClientEventInteractor> reportDailyQuestClientEventInteractorProvider) {
        return new UserServiceAccessor_MembersInjector(userServiceProvider, reportDailyQuestClientEventInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserServiceAccessor instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectReportDailyQuestClientEventInteractor(instance, this.reportDailyQuestClientEventInteractorProvider.get());
    }

    public static void injectUserService(UserServiceAccessor instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectReportDailyQuestClientEventInteractor(UserServiceAccessor instance, ReportDailyQuestClientEventInteractor reportDailyQuestClientEventInteractor) {
        instance.reportDailyQuestClientEventInteractor = reportDailyQuestClientEventInteractor;
    }
}
