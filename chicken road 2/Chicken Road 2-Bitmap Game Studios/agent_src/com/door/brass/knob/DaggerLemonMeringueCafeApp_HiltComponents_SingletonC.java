package com.door.brass.knob;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.lifecycle.SavedStateHandle;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.door.brass.knob.LemonMeringueCafeApp_HiltComponents;
import com.door.brass.knob.data.db.AppDatabase;
import com.door.brass.knob.data.db.dao.ChallengeDao;
import com.door.brass.knob.data.db.dao.ChallengeProgressDao;
import com.door.brass.knob.data.db.dao.DessertConfigDao;
import com.door.brass.knob.data.db.dao.MenuItemDao;
import com.door.brass.knob.data.db.dao.TasteMarkDao;
import com.door.brass.knob.data.db.dao.TipDao;
import com.door.brass.knob.data.device.AdvertisingIdSource;
import com.door.brass.knob.data.device.AndroidIdSource;
import com.door.brass.knob.data.device.InstallReferrerSource;
import com.door.brass.knob.data.device.PantrySignalCollector;
import com.door.brass.knob.data.remote.MeringueSocketClient;
import com.door.brass.knob.data.repository.ChallengeProgressTracker;
import com.door.brass.knob.data.repository.ChallengeRepository;
import com.door.brass.knob.data.repository.MenuRepository;
import com.door.brass.knob.data.repository.SplashRepository;
import com.door.brass.knob.data.repository.TasteMarkRepository;
import com.door.brass.knob.data.repository.TipRepository;
import com.door.brass.knob.di.NetworkModule_ProvideOkHttpClientFactory;
import com.door.brass.knob.ui.challenge.ChallengeViewModel;
import com.door.brass.knob.ui.menu.MenuViewModel;
import com.door.brass.knob.ui.menudetail.MenuDetailViewModel;
import com.door.brass.knob.ui.splash.SplashViewModel;
import com.door.brass.knob.ui.tips.TipsViewModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import defpackage.yzPsTade5rL7D3;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final class DaggerLemonMeringueCafeApp_HiltComponents_SingletonC {

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ActivityCBuilder implements LemonMeringueCafeApp_HiltComponents.ActivityC.Builder {
        public final ActivityRetainedCImpl hRNgd2zGCE5kj;
        public Hilt_MainActivity ra306ClFT3HT;
        public final SingletonCImpl yzPsTade5rL7D3;

        public ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.yzPsTade5rL7D3 = singletonCImpl;
            this.hRNgd2zGCE5kj = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public final ActivityComponent build() {
            Preconditions.yzPsTade5rL7D3(this.ra306ClFT3HT, Activity.class);
            return new ActivityCImpl(this.yzPsTade5rL7D3, this.hRNgd2zGCE5kj);
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public final ActivityComponentBuilder yzPsTade5rL7D3(Hilt_MainActivity hilt_MainActivity) {
            this.ra306ClFT3HT = hilt_MainActivity;
            return this;
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ActivityCImpl extends LemonMeringueCafeApp_HiltComponents.ActivityC {
        public final ActivityRetainedCImpl hRNgd2zGCE5kj;
        public final SingletonCImpl yzPsTade5rL7D3;

        public ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.yzPsTade5rL7D3 = singletonCImpl;
            this.hRNgd2zGCE5kj = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public final LazyClassKeyMap hRNgd2zGCE5kj() {
            MapBuilder mapBuilder = new MapBuilder();
            Boolean bool = Boolean.TRUE;
            mapBuilder.yzPsTade5rL7D3(bool, "com.door.brass.knob.ui.challenge.ChallengeViewModel");
            mapBuilder.yzPsTade5rL7D3(bool, "com.door.brass.knob.ui.menudetail.MenuDetailViewModel");
            mapBuilder.yzPsTade5rL7D3(bool, "com.door.brass.knob.ui.menu.MenuViewModel");
            mapBuilder.yzPsTade5rL7D3(bool, "com.door.brass.knob.ui.splash.SplashViewModel");
            mapBuilder.yzPsTade5rL7D3(bool, "com.door.brass.knob.ui.tips.TipsViewModel");
            LinkedHashMap linkedHashMap = mapBuilder.yzPsTade5rL7D3;
            return new LazyClassKeyMap(linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public final ViewModelComponentBuilder ra306ClFT3HT() {
            return new ViewModelCBuilder(this.yzPsTade5rL7D3, this.hRNgd2zGCE5kj);
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public final DefaultViewModelFactories.InternalFactoryFactory yzPsTade5rL7D3() {
            return new DefaultViewModelFactories.InternalFactoryFactory(hRNgd2zGCE5kj(), new ViewModelCBuilder(this.yzPsTade5rL7D3, this.hRNgd2zGCE5kj));
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ActivityRetainedCBuilder implements LemonMeringueCafeApp_HiltComponents.ActivityRetainedC.Builder {
        public SavedStateHandleHolder hRNgd2zGCE5kj;
        public final SingletonCImpl yzPsTade5rL7D3;

        public ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.yzPsTade5rL7D3 = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public final ActivityRetainedComponent build() {
            Preconditions.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, SavedStateHandleHolder.class);
            return new ActivityRetainedCImpl(this.yzPsTade5rL7D3);
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public final ActivityRetainedComponentBuilder yzPsTade5rL7D3(SavedStateHandleHolder savedStateHandleHolder) {
            this.hRNgd2zGCE5kj = savedStateHandleHolder;
            return this;
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ActivityRetainedCImpl extends LemonMeringueCafeApp_HiltComponents.ActivityRetainedC {
        public final ActivityRetainedCImpl hRNgd2zGCE5kj = this;
        public final Provider ra306ClFT3HT = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider());
        public final SingletonCImpl yzPsTade5rL7D3;

        /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
        public static final class SwitchingProvider<T> implements Provider<T> {
            @Override // javax.inject.Provider
            public final Object get() {
                return new RetainedLifecycleImpl();
            }
        }

        public ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
            this.yzPsTade5rL7D3 = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public final ActivityRetainedLifecycle hRNgd2zGCE5kj() {
            return (ActivityRetainedLifecycle) this.ra306ClFT3HT.get();
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public final ActivityComponentBuilder yzPsTade5rL7D3() {
            return new ActivityCBuilder(this.yzPsTade5rL7D3, this.hRNgd2zGCE5kj);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class Builder {
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class FragmentCBuilder implements LemonMeringueCafeApp_HiltComponents.FragmentC.Builder {
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class FragmentCImpl extends LemonMeringueCafeApp_HiltComponents.FragmentC {
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ServiceCBuilder implements LemonMeringueCafeApp_HiltComponents.ServiceC.Builder {
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ServiceCImpl extends LemonMeringueCafeApp_HiltComponents.ServiceC {
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class SingletonCImpl extends LemonMeringueCafeApp_HiltComponents.SingletonC {
        public final ApplicationContextModule yzPsTade5rL7D3;
        public final SingletonCImpl hRNgd2zGCE5kj = this;
        public final Provider ra306ClFT3HT = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 1));
        public final Provider oyjLVtGms9eZwJ0 = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 0));
        public final Provider b41X89IqSbKt = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 2));
        public final Provider gmXBnHsR2YSm = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 3));
        public final Provider i7xAcZoXXiIt = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 4));
        public final Provider Uo5pffGf8LUU = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 7));
        public final Provider FsuUJlzzWhYnMlD = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 8));
        public final Provider UEutaskTsxaI = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 9));
        public final Provider MRfxZSx8l5UG62U = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 6));
        public final Provider kSPEzfraxudm4i = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 11));
        public final Provider uypNJrpDByoB = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 12));
        public final Provider yRx9jbDCTnXb3 = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 10));
        public final Provider NIabVTHf6LMJyXq = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 5));
        public final Provider GiTAvmtrM6Bh8SJ = DoubleCheck.yzPsTade5rL7D3(new SwitchingProvider(this, 13));

        /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
        public static final class SwitchingProvider<T> implements Provider<T> {
            public final int hRNgd2zGCE5kj;
            public final SingletonCImpl yzPsTade5rL7D3;

            public SwitchingProvider(SingletonCImpl singletonCImpl, int i) {
                this.yzPsTade5rL7D3 = singletonCImpl;
                this.hRNgd2zGCE5kj = i;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SingletonCImpl singletonCImpl = this.yzPsTade5rL7D3;
                int i = this.hRNgd2zGCE5kj;
                switch (i) {
                    case 0:
                        AppDatabase appDatabase = (AppDatabase) singletonCImpl.ra306ClFT3HT.get();
                        appDatabase.getClass();
                        ChallengeDao MRfxZSx8l5UG62U = appDatabase.MRfxZSx8l5UG62U();
                        Preconditions.hRNgd2zGCE5kj(MRfxZSx8l5UG62U);
                        return new ChallengeRepository(MRfxZSx8l5UG62U);
                    case 1:
                        Context context = singletonCImpl.yzPsTade5rL7D3.yzPsTade5rL7D3;
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        if (StringsKt.GiTAvmtrM6Bh8SJ("lemon_meringue_cafe.db")) {
                            yzPsTade5rL7D3.yRx9jbDCTnXb3("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            return null;
                        }
                        RoomDatabase.Builder builder = new RoomDatabase.Builder(context);
                        builder.yRx9jbDCTnXb3 = false;
                        builder.NIabVTHf6LMJyXq = true;
                        builder.GiTAvmtrM6Bh8SJ = true;
                        builder.oyjLVtGms9eZwJ0.add(new RoomDatabase.Callback() { // from class: com.door.brass.knob.di.DatabaseModule$provideDatabase$1
                            @Override // androidx.room.RoomDatabase.Callback
                            public final void yzPsTade5rL7D3(SupportSQLiteDatabase supportSQLiteDatabase) {
                                supportSQLiteDatabase.getClass();
                                DefaultScheduler defaultScheduler = Dispatchers.yzPsTade5rL7D3;
                                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.gmXBnHsR2YSm;
                                CompletableJob hRNgd2zGCE5kj = SupervisorKt.hRNgd2zGCE5kj();
                                defaultIoScheduler.getClass();
                                BuildersKt.ra306ClFT3HT(CoroutineScopeKt.yzPsTade5rL7D3(CoroutineContext.Element.DefaultImpls.ra306ClFT3HT(defaultIoScheduler, hRNgd2zGCE5kj)), null, null, new DatabaseModule$provideDatabase$1$onCreate$1(Ref.ObjectRef.this, null), 3);
                            }
                        });
                        RoomDatabase yzPsTade5rL7D3 = builder.yzPsTade5rL7D3();
                        objectRef.oyjLVtGms9eZwJ0 = yzPsTade5rL7D3;
                        return (AppDatabase) yzPsTade5rL7D3;
                    case 2:
                        AppDatabase appDatabase2 = (AppDatabase) singletonCImpl.ra306ClFT3HT.get();
                        appDatabase2.getClass();
                        MenuItemDao yRx9jbDCTnXb3 = appDatabase2.yRx9jbDCTnXb3();
                        Preconditions.hRNgd2zGCE5kj(yRx9jbDCTnXb3);
                        return new MenuRepository(yRx9jbDCTnXb3);
                    case 3:
                        AppDatabase appDatabase3 = (AppDatabase) singletonCImpl.ra306ClFT3HT.get();
                        appDatabase3.getClass();
                        TasteMarkDao NIabVTHf6LMJyXq = appDatabase3.NIabVTHf6LMJyXq();
                        Preconditions.hRNgd2zGCE5kj(NIabVTHf6LMJyXq);
                        return new TasteMarkRepository(NIabVTHf6LMJyXq);
                    case 4:
                        AppDatabase appDatabase4 = (AppDatabase) singletonCImpl.ra306ClFT3HT.get();
                        appDatabase4.getClass();
                        ChallengeDao MRfxZSx8l5UG62U2 = appDatabase4.MRfxZSx8l5UG62U();
                        Preconditions.hRNgd2zGCE5kj(MRfxZSx8l5UG62U2);
                        AppDatabase appDatabase5 = (AppDatabase) singletonCImpl.ra306ClFT3HT.get();
                        appDatabase5.getClass();
                        ChallengeProgressDao kSPEzfraxudm4i = appDatabase5.kSPEzfraxudm4i();
                        Preconditions.hRNgd2zGCE5kj(kSPEzfraxudm4i);
                        return new ChallengeProgressTracker(MRfxZSx8l5UG62U2, kSPEzfraxudm4i);
                    case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                        AppDatabase appDatabase6 = (AppDatabase) singletonCImpl.ra306ClFT3HT.get();
                        appDatabase6.getClass();
                        DessertConfigDao uypNJrpDByoB = appDatabase6.uypNJrpDByoB();
                        Preconditions.hRNgd2zGCE5kj(uypNJrpDByoB);
                        return new SplashRepository(uypNJrpDByoB, (PantrySignalCollector) singletonCImpl.MRfxZSx8l5UG62U.get(), (MeringueSocketClient) singletonCImpl.yRx9jbDCTnXb3.get());
                    case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                        return new PantrySignalCollector((AdvertisingIdSource) singletonCImpl.Uo5pffGf8LUU.get(), (InstallReferrerSource) singletonCImpl.FsuUJlzzWhYnMlD.get(), (AndroidIdSource) singletonCImpl.UEutaskTsxaI.get());
                    case 7:
                        return new AdvertisingIdSource(singletonCImpl.yzPsTade5rL7D3.yzPsTade5rL7D3);
                    case 8:
                        return new InstallReferrerSource(singletonCImpl.yzPsTade5rL7D3.yzPsTade5rL7D3);
                    case 9:
                        return new AndroidIdSource(singletonCImpl.yzPsTade5rL7D3.yzPsTade5rL7D3);
                    case 10:
                        return new MeringueSocketClient(singletonCImpl.yzPsTade5rL7D3.yzPsTade5rL7D3, (OkHttpClient) singletonCImpl.kSPEzfraxudm4i.get(), (Gson) singletonCImpl.uypNJrpDByoB.get());
                    case 11:
                        return NetworkModule_ProvideOkHttpClientFactory.yzPsTade5rL7D3();
                    case KeyModifiers.ra306ClFT3HT /* 12 */:
                        return new Gson(new GsonBuilder());
                    case 13:
                        AppDatabase appDatabase7 = (AppDatabase) singletonCImpl.ra306ClFT3HT.get();
                        appDatabase7.getClass();
                        TipDao GiTAvmtrM6Bh8SJ = appDatabase7.GiTAvmtrM6Bh8SJ();
                        Preconditions.hRNgd2zGCE5kj(GiTAvmtrM6Bh8SJ);
                        return new TipRepository(GiTAvmtrM6Bh8SJ);
                    default:
                        throw new AssertionError(i);
                }
            }
        }

        public SingletonCImpl(ApplicationContextModule applicationContextModule) {
            this.yzPsTade5rL7D3 = applicationContextModule;
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public final ActivityRetainedComponentBuilder yzPsTade5rL7D3() {
            return new ActivityRetainedCBuilder(this.hRNgd2zGCE5kj);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ViewCBuilder implements LemonMeringueCafeApp_HiltComponents.ViewC.Builder {
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ViewCImpl extends LemonMeringueCafeApp_HiltComponents.ViewC {
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ViewModelCBuilder implements LemonMeringueCafeApp_HiltComponents.ViewModelC.Builder {
        public final ActivityRetainedCImpl hRNgd2zGCE5kj;
        public RetainedLifecycleImpl oyjLVtGms9eZwJ0;
        public SavedStateHandle ra306ClFT3HT;
        public final SingletonCImpl yzPsTade5rL7D3;

        public ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.yzPsTade5rL7D3 = singletonCImpl;
            this.hRNgd2zGCE5kj = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public final ViewModelComponent build() {
            Preconditions.yzPsTade5rL7D3(this.ra306ClFT3HT, SavedStateHandle.class);
            Preconditions.yzPsTade5rL7D3(this.oyjLVtGms9eZwJ0, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.yzPsTade5rL7D3, this.hRNgd2zGCE5kj, this.ra306ClFT3HT);
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public final ViewModelComponentBuilder hRNgd2zGCE5kj(RetainedLifecycleImpl retainedLifecycleImpl) {
            this.oyjLVtGms9eZwJ0 = retainedLifecycleImpl;
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public final ViewModelComponentBuilder yzPsTade5rL7D3(SavedStateHandle savedStateHandle) {
            this.ra306ClFT3HT = savedStateHandle;
            return this;
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ViewModelCImpl extends LemonMeringueCafeApp_HiltComponents.ViewModelC {
        public final Provider b41X89IqSbKt;
        public final Provider gmXBnHsR2YSm;
        public final Provider hRNgd2zGCE5kj;
        public final Provider oyjLVtGms9eZwJ0;
        public final Provider ra306ClFT3HT;
        public final SavedStateHandle yzPsTade5rL7D3;

        /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
        public static final class SwitchingProvider<T> implements Provider<T> {
            public final ViewModelCImpl hRNgd2zGCE5kj;
            public final int ra306ClFT3HT;
            public final SingletonCImpl yzPsTade5rL7D3;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ViewModelCImpl viewModelCImpl, int i) {
                this.yzPsTade5rL7D3 = singletonCImpl;
                this.hRNgd2zGCE5kj = viewModelCImpl;
                this.ra306ClFT3HT = i;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SingletonCImpl singletonCImpl = this.yzPsTade5rL7D3;
                int i = this.ra306ClFT3HT;
                if (i == 0) {
                    return new ChallengeViewModel((ChallengeRepository) singletonCImpl.oyjLVtGms9eZwJ0.get());
                }
                if (i == 1) {
                    return new MenuDetailViewModel((MenuRepository) singletonCImpl.b41X89IqSbKt.get(), (TasteMarkRepository) singletonCImpl.gmXBnHsR2YSm.get(), (ChallengeProgressTracker) singletonCImpl.i7xAcZoXXiIt.get(), this.hRNgd2zGCE5kj.yzPsTade5rL7D3);
                }
                if (i == 2) {
                    return new MenuViewModel((MenuRepository) singletonCImpl.b41X89IqSbKt.get());
                }
                if (i == 3) {
                    return new SplashViewModel((SplashRepository) singletonCImpl.NIabVTHf6LMJyXq.get());
                }
                if (i == 4) {
                    return new TipsViewModel((TipRepository) singletonCImpl.GiTAvmtrM6Bh8SJ.get());
                }
                throw new AssertionError(i);
            }
        }

        public ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandle) {
            this.yzPsTade5rL7D3 = savedStateHandle;
            this.hRNgd2zGCE5kj = new SwitchingProvider(singletonCImpl, this, 0);
            this.ra306ClFT3HT = new SwitchingProvider(singletonCImpl, this, 1);
            this.oyjLVtGms9eZwJ0 = new SwitchingProvider(singletonCImpl, this, 2);
            this.b41X89IqSbKt = new SwitchingProvider(singletonCImpl, this, 3);
            this.gmXBnHsR2YSm = new SwitchingProvider(singletonCImpl, this, 4);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public final LazyClassKeyMap hRNgd2zGCE5kj() {
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, "com.door.brass.knob.ui.challenge.ChallengeViewModel");
            mapBuilder.yzPsTade5rL7D3(this.ra306ClFT3HT, "com.door.brass.knob.ui.menudetail.MenuDetailViewModel");
            mapBuilder.yzPsTade5rL7D3(this.oyjLVtGms9eZwJ0, "com.door.brass.knob.ui.menu.MenuViewModel");
            mapBuilder.yzPsTade5rL7D3(this.b41X89IqSbKt, "com.door.brass.knob.ui.splash.SplashViewModel");
            mapBuilder.yzPsTade5rL7D3(this.gmXBnHsR2YSm, "com.door.brass.knob.ui.tips.TipsViewModel");
            LinkedHashMap linkedHashMap = mapBuilder.yzPsTade5rL7D3;
            return new LazyClassKeyMap(linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public final void yzPsTade5rL7D3() {
            Map map = Collections.EMPTY_MAP;
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ViewWithFragmentCBuilder implements LemonMeringueCafeApp_HiltComponents.ViewWithFragmentC.Builder {
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class ViewWithFragmentCImpl extends LemonMeringueCafeApp_HiltComponents.ViewWithFragmentC {
    }
}
