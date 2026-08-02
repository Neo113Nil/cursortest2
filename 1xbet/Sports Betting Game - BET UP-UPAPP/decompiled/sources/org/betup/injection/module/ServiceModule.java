package org.betup.injection.module;

import dagger.Module;
import org.betup.services.MyFirebaseMessagingService;

@Module
/* loaded from: classes2.dex */
public abstract class ServiceModule {
    abstract MyFirebaseMessagingService contributeMyFirebaseMessagingService();
}
