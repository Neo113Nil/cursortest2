package com.google.firebase.sessions;

/* compiled from: FirebaseSessionsComponent.kt */
@com.google.firebase.sessions.dagger.Component(modules = {com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.class})
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0002\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "", "firebaseSessions", "Lcom/google/firebase/sessions/FirebaseSessions;", "getFirebaseSessions", "()Lcom/google/firebase/sessions/FirebaseSessions;", "sessionDatastore", "Lcom/google/firebase/sessions/SessionDatastore;", "getSessionDatastore", "()Lcom/google/firebase/sessions/SessionDatastore;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "getSessionFirelogPublisher", "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "getSessionGenerator", "()Lcom/google/firebase/sessions/SessionGenerator;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getSessionsSettings", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "Builder", "MainModule", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FirebaseSessionsComponent {

    /* compiled from: FirebaseSessionsComponent.kt */
    @com.google.firebase.sessions.dagger.Component.Builder
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH'J\u0016\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH'¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "", "appContext", "Landroid/content/Context;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "build", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Builder {
        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder appContext(android.content.Context appContext);

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder backgroundDispatcher(@com.google.firebase.annotations.concurrent.Background kotlin.coroutines.CoroutineContext backgroundDispatcher);

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder blockingDispatcher(@com.google.firebase.annotations.concurrent.Blocking kotlin.coroutines.CoroutineContext blockingDispatcher);

        com.google.firebase.sessions.FirebaseSessionsComponent build();

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder firebaseApp(com.google.firebase.FirebaseApp firebaseApp);

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder firebaseInstallationsApi(com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi);

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder transportFactoryProvider(com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> transportFactoryProvider);
    }

    com.google.firebase.sessions.FirebaseSessions getFirebaseSessions();

    com.google.firebase.sessions.SessionDatastore getSessionDatastore();

    com.google.firebase.sessions.SessionFirelogPublisher getSessionFirelogPublisher();

    com.google.firebase.sessions.SessionGenerator getSessionGenerator();

    com.google.firebase.sessions.settings.SessionsSettings getSessionsSettings();

    /* compiled from: FirebaseSessionsComponent.kt */
    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0016H'¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule;", "", "crashlyticsSettingsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "impl", "Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "eventGDTLoggerInterface", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Lcom/google/firebase/sessions/EventGDTLogger;", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/settings/LocalOverrideSettings;", "remoteSettings", "Lcom/google/firebase/sessions/settings/RemoteSettings;", "sessionDatastore", "Lcom/google/firebase/sessions/SessionDatastore;", "Lcom/google/firebase/sessions/SessionDatastoreImpl;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "sessionLifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @com.google.firebase.sessions.dagger.Module
    public interface MainModule {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion INSTANCE = com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion.$$INSTANCE;

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher crashlyticsSettingsFetcher(com.google.firebase.sessions.settings.RemoteSettingsFetcher impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.EventGDTLoggerInterface eventGDTLoggerInterface(com.google.firebase.sessions.EventGDTLogger impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        @com.google.firebase.sessions.LocalOverrideSettingsProvider
        com.google.firebase.sessions.settings.SettingsProvider localOverrideSettings(com.google.firebase.sessions.settings.LocalOverrideSettings impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.RemoteSettingsProvider
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.settings.SettingsProvider remoteSettings(com.google.firebase.sessions.settings.RemoteSettings impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.SessionDatastore sessionDatastore(com.google.firebase.sessions.SessionDatastoreImpl impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.SessionFirelogPublisher sessionFirelogPublisher(com.google.firebase.sessions.SessionFirelogPublisherImpl impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.SessionLifecycleServiceBinder sessionLifecycleServiceBinder(com.google.firebase.sessions.SessionLifecycleServiceBinderImpl impl);

        /* compiled from: FirebaseSessionsComponent.kt */
        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule$Companion;", "", "()V", "TAG", "", "applicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "sessionConfigsDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "appContext", "Landroid/content/Context;", "sessionDetailsDataStore", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "uuidGenerator", "Lcom/google/firebase/sessions/UuidGenerator;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion $$INSTANCE = new com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion();
            private static final java.lang.String TAG = "FirebaseSessions";

            private Companion() {
            }

            @javax.inject.Singleton
            @com.google.firebase.sessions.dagger.Provides
            public final com.google.firebase.sessions.TimeProvider timeProvider() {
                return com.google.firebase.sessions.TimeProviderImpl.INSTANCE;
            }

            @javax.inject.Singleton
            @com.google.firebase.sessions.dagger.Provides
            public final com.google.firebase.sessions.UuidGenerator uuidGenerator() {
                return com.google.firebase.sessions.UuidGeneratorImpl.INSTANCE;
            }

            @javax.inject.Singleton
            @com.google.firebase.sessions.dagger.Provides
            public final com.google.firebase.sessions.ApplicationInfo applicationInfo(com.google.firebase.FirebaseApp firebaseApp) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
                return com.google.firebase.sessions.SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
            }

            @javax.inject.Singleton
            @com.google.firebase.sessions.SessionConfigsDataStore
            @com.google.firebase.sessions.dagger.Provides
            public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> sessionConfigsDataStore(final android.content.Context appContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
                return androidx.datastore.preferences.core.PreferenceDataStoreFactory.create$default(androidx.datastore.preferences.core.PreferenceDataStoreFactory.INSTANCE, new androidx.datastore.core.handlers.ReplaceFileCorruptionHandler(new kotlin.jvm.functions.Function1<androidx.datastore.core.CorruptionException, androidx.datastore.preferences.core.Preferences>() { // from class: com.google.firebase.sessions.FirebaseSessionsComponent$MainModule$Companion$sessionConfigsDataStore$1
                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.datastore.preferences.core.Preferences invoke(androidx.datastore.core.CorruptionException ex) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ex, "ex");
                        android.util.Log.w(com.google.firebase.sessions.FirebaseSessionsRegistrar.TAG, "CorruptionException in settings DataStore in " + com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', ex);
                        return androidx.datastore.preferences.core.PreferencesFactory.createEmpty();
                    }
                }), (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.google.firebase.sessions.FirebaseSessionsComponent$MainModule$Companion$sessionConfigsDataStore$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.io.File invoke() {
                        return androidx.datastore.preferences.PreferenceDataStoreFile.preferencesDataStoreFile(appContext, com.google.firebase.sessions.SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME());
                    }
                }, 6, (java.lang.Object) null);
            }

            @com.google.firebase.sessions.SessionDetailsDataStore
            @javax.inject.Singleton
            @com.google.firebase.sessions.dagger.Provides
            public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> sessionDetailsDataStore(final android.content.Context appContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
                return androidx.datastore.preferences.core.PreferenceDataStoreFactory.create$default(androidx.datastore.preferences.core.PreferenceDataStoreFactory.INSTANCE, new androidx.datastore.core.handlers.ReplaceFileCorruptionHandler(new kotlin.jvm.functions.Function1<androidx.datastore.core.CorruptionException, androidx.datastore.preferences.core.Preferences>() { // from class: com.google.firebase.sessions.FirebaseSessionsComponent$MainModule$Companion$sessionDetailsDataStore$1
                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.datastore.preferences.core.Preferences invoke(androidx.datastore.core.CorruptionException ex) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ex, "ex");
                        android.util.Log.w(com.google.firebase.sessions.FirebaseSessionsRegistrar.TAG, "CorruptionException in sessions DataStore in " + com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', ex);
                        return androidx.datastore.preferences.core.PreferencesFactory.createEmpty();
                    }
                }), (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.google.firebase.sessions.FirebaseSessionsComponent$MainModule$Companion$sessionDetailsDataStore$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.io.File invoke() {
                        return androidx.datastore.preferences.PreferenceDataStoreFile.preferencesDataStoreFile(appContext, com.google.firebase.sessions.SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME());
                    }
                }, 6, (java.lang.Object) null);
            }
        }
    }
}
