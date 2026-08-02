package org.betup.injection.module;

import android.app.Service;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import org.betup.services.MyFirebaseMessagingService;

@Module(subcomponents = {MyFirebaseMessagingServiceSubcomponent.class})
/* loaded from: classes2.dex */
public abstract class ServiceModule_ContributeMyFirebaseMessagingService {

    @Subcomponent
    public interface MyFirebaseMessagingServiceSubcomponent extends AndroidInjector<MyFirebaseMessagingService> {

        @Subcomponent.Builder
        public static abstract class Builder extends AndroidInjector.Builder<MyFirebaseMessagingService> {
        }
    }

    @Binds
    @IntoMap
    abstract AndroidInjector.Factory<? extends Service> bindAndroidInjectorFactory(MyFirebaseMessagingServiceSubcomponent.Builder builder);

    private ServiceModule_ContributeMyFirebaseMessagingService() {
    }
}
