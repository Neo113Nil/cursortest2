package org.betup.model.remote.api.rest.user.changephoto;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ChangeV7ProfilePhotoInteractor_Factory implements Factory<ChangeV7ProfilePhotoInteractor> {
    private final Provider<Context> contextProvider;

    public ChangeV7ProfilePhotoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ChangeV7ProfilePhotoInteractor get() {
        return new ChangeV7ProfilePhotoInteractor(this.contextProvider.get());
    }

    public static ChangeV7ProfilePhotoInteractor_Factory create(Provider<Context> contextProvider) {
        return new ChangeV7ProfilePhotoInteractor_Factory(contextProvider);
    }
}
