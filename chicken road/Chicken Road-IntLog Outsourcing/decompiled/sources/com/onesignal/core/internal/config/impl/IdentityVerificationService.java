package com.onesignal.core.internal.config.impl;

import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.features.FeatureFlag;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.user.internal.jwt.JwtRequirement;
import kotlin.jvm.internal.i;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class IdentityVerificationService implements IStartableService, ISingletonModelStoreChangeHandler<ConfigModel> {
    private final ConfigModelStore configModelStore;
    private final IFeatureManager featureManager;
    private final Object handlerLock;
    private InterfaceC1441l onJwtConfigHydrated;

    public IdentityVerificationService(IFeatureManager featureManager, ConfigModelStore configModelStore) {
        i.e(featureManager, "featureManager");
        i.e(configModelStore, "configModelStore");
        this.featureManager = featureManager;
        this.configModelStore = configModelStore;
        this.handlerLock = new Object();
    }

    public final boolean getIvBehaviorActive() {
        return this.configModelStore.getModel().getUseIdentityVerification$com_onesignal_core() == JwtRequirement.REQUIRED;
    }

    public final boolean getNewCodePathsRun() {
        return this.featureManager.isEnabled(FeatureFlag.SDK_IDENTITY_VERIFICATION) || getIvBehaviorActive();
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
    }

    public final void setOnJwtConfigHydratedHandler(InterfaceC1441l interfaceC1441l) {
        synchronized (this.handlerLock) {
            this.onJwtConfigHydrated = interfaceC1441l;
        }
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this.configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        InterfaceC1441l interfaceC1441l;
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals(ModelChangeTags.HYDRATE)) {
            synchronized (this.handlerLock) {
                interfaceC1441l = this.onJwtConfigHydrated;
            }
            if (interfaceC1441l != null) {
                interfaceC1441l.invoke(Boolean.valueOf(model.getUseIdentityVerification$com_onesignal_core() == JwtRequirement.REQUIRED));
            }
        }
    }
}
