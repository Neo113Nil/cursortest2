package org.betup.injection.module;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class AppModule_ProvideFirebaseAuthFactory implements Factory<FirebaseAuth> {
    private final AppModule module;

    public AppModule_ProvideFirebaseAuthFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public FirebaseAuth get() {
        return (FirebaseAuth) Preconditions.checkNotNull(this.module.provideFirebaseAuth(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideFirebaseAuthFactory create(AppModule module) {
        return new AppModule_ProvideFirebaseAuthFactory(module);
    }

    public static FirebaseAuth proxyProvideFirebaseAuth(AppModule instance) {
        return (FirebaseAuth) Preconditions.checkNotNull(instance.provideFirebaseAuth(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
