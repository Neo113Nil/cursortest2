package io.appmetrica.analytics.flutter.impl;

/* loaded from: classes.dex */
public class ReporterImpl implements io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon {
    final android.content.Context context;

    public ReporterImpl(android.content.Context context) {
        this.context = context;
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void clearAppEnvironment(java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void pauseSession(java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).pauseSession();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void putAppEnvironmentValue(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).putAppEnvironmentValue(str2, str3);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportAdRevenue(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon adRevenuePigeon) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).reportAdRevenue(io.appmetrica.analytics.flutter.utils.Converter.toNative(adRevenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportECommerce(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon eCommerceEventPigeon) {
        io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent = io.appmetrica.analytics.flutter.utils.ECommerceConverter.toNative(eCommerceEventPigeon);
        if (eCommerceEvent != null) {
            io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).reportECommerce(eCommerceEvent);
        }
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportError(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon, java.lang.String str2) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).getPluginExtension().reportError(io.appmetrica.analytics.flutter.utils.Converter.toNative(errorDetailsPigeon), str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportErrorWithGroup(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon, java.lang.String str3) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).getPluginExtension().reportError(str2, str3, errorDetailsPigeon != null ? io.appmetrica.analytics.flutter.utils.Converter.toNative(errorDetailsPigeon) : null);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportEvent(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).reportEvent(str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportEventWithJson(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).reportEvent(str2, str3);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportRevenue(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon revenuePigeon) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).reportRevenue(io.appmetrica.analytics.flutter.utils.Converter.toNative(revenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportUnhandledException(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).getPluginExtension().reportUnhandledException(io.appmetrica.analytics.flutter.utils.Converter.toNative(errorDetailsPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportUserProfile(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon userProfilePigeon) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).reportUserProfile(io.appmetrica.analytics.flutter.utils.Converter.toNative(userProfilePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void resumeSession(java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).resumeSession();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void sendEventsBuffer(java.lang.String str) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void setDataSendingEnabled(java.lang.String str, java.lang.Boolean bool) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).setDataSendingEnabled(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void setUserProfileID(java.lang.String str, java.lang.String str2) {
        io.appmetrica.analytics.AppMetrica.getReporter(this.context, str).setUserProfileID(str2);
    }
}
