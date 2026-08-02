package org.betup.services.experiments;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.domain.RemoteConfigConstants;

@Singleton
/* loaded from: classes2.dex */
public class ABTestService {
    private final FirebaseRemoteConfig firebaseRemoteConfig;

    @Inject
    public ABTestService(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public boolean offersEnabled() {
        return this.firebaseRemoteConfig.getBoolean(RemoteConfigConstants.OFFERS_ENABLED);
    }
}
