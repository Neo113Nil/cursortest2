package org.betup;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.SieveCacheKt;
import androidx.multidex.MultiDex;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import com.vanniktech.emoji.EmojiManager;
import com.vanniktech.emoji.ios.IosEmojiProvider;
import dagger.Lazy;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasServiceInjector;
import javax.inject.Inject;
import org.betup.injection.component.AppComponent;
import org.betup.injection.component.DaggerAppComponent;
import org.betup.injection.module.AppModule;
import org.betup.model.local.entity.Event;
import org.betup.services.LocaleService;
import org.betup.services.MyFirebaseMessagingService;
import org.betup.services.chats.ChatService;
import org.betup.services.inappmessaging.InAppMessagingLinkHandler;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.user.UserService;
import org.betup.utils.FacebookSdkHelper;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public class BetUpApp extends Application implements PushStorageProvider, ChatService, Application.ActivityLifecycleCallbacks, HasServiceInjector {
    private static Context context;

    @Inject
    Lazy<BalanceHolder> balanceHolder;

    @Inject
    Lazy<ChatService> chatService;
    private AppComponent component;

    @Inject
    DispatchingAndroidInjector<Service> dispatchingServiceInjector;

    @Inject
    Lazy<LocaleService> localeService;
    private int numStarted;

    @Inject
    Lazy<PushStorageProvider> pushStorageProvider;

    @Inject
    Lazy<UserService> userService;

    private void initializeSentryIfConfigured() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public AppComponent getComponent() {
        return this.component;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleService.onAttach(base, LocaleService.getLanguage(base)));
        MultiDex.install(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        this.numStarted = 0;
        FirebaseApp.initializeApp(this);
        initializeSentryIfConfigured();
        initializeFacebookSdk();
        EmojiManager.install(new IosEmojiProvider());
        context = getBaseContext();
        AppComponent buildComponent = buildComponent();
        this.component = buildComponent;
        buildComponent.inject(this);
        MyFirebaseMessagingService.prepareNotificationChannel(this);
        registerActivityLifecycleCallbacks(this);
        Log.d("BetUpApp", "Setting up In-App Messaging link handler...");
        InAppMessagingLinkHandler.INSTANCE.setup();
        Log.d("BetUpApp", "In-App Messaging link handler setup completed");
        setupPicasso();
    }

    private void initializeFacebookSdk() {
        if (FacebookSdkHelper.ensureInitialized(this)) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Facebook SDK not initialized at application startup");
        Log.e("BetUpApp", "Facebook SDK init failed or incomplete", illegalStateException);
        FirebaseCrashlytics.getInstance().recordException(illegalStateException);
    }

    public void syncUser() {
        this.userService.get().invalidate(UserService.InfoKind.CHALLENGES, UserService.InfoKind.RANKS, UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
        this.userService.get().getProfile(null, UserService.InfoKind.PROGRESS);
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static Context getContext() {
        return context;
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void saveEvent(Event event) {
        this.pushStorageProvider.get().saveEvent(event);
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void refreshEventCount(Integer userId) {
        this.pushStorageProvider.get().refreshEventCount(userId);
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void readAll(Integer userId) {
        this.pushStorageProvider.get().readAll(userId);
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void readEvent(String uid) {
        this.pushStorageProvider.get().readEvent(uid);
    }

    @Override // org.betup.services.push.PushStorageProvider
    public int getEventsCount() {
        return this.pushStorageProvider.get().getEventsCount();
    }

    public boolean isInForeground() {
        return this.numStarted > 0;
    }

    @Override // org.betup.services.chats.ChatService
    public int getUnreadMessagesCount() {
        return this.chatService.get().getUnreadMessagesCount();
    }

    @Override // org.betup.services.chats.ChatService
    public void refreshUnreadMessagesCount() {
        this.chatService.get().refreshUnreadMessagesCount();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.numStarted++;
    }

    @Override // org.betup.services.push.PushStorageProvider
    public void refreshEventCountByUUID(String uuid) {
        this.pushStorageProvider.get().refreshEventCountByUUID(uuid);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.numStarted--;
    }

    private void setupPicasso() {
        Picasso.Builder builder = new Picasso.Builder(this);
        builder.downloader(new OkHttp3Downloader(this, SieveCacheKt.NodeLinkMask));
        Picasso.setSingletonInstance(builder.build());
    }

    @Override // dagger.android.HasServiceInjector
    public AndroidInjector<Service> serviceInjector() {
        return this.dispatchingServiceInjector;
    }
}
