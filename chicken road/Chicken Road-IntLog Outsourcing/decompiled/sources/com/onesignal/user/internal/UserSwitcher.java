package com.onesignal.user.internal;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.ISingletonModelStore;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.services.ServiceProvider;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferencesExtensionV4Kt;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.identity.IdentityModelStoreKt;
import com.onesignal.user.internal.operations.LoginUserFromSubscriptionOperation;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
import t4.InterfaceC1430a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class UserSwitcher {
    private final AndroidUtils androidUtils;
    private final InterfaceC1430a appContextProvider;
    private final String carrierName;
    private final ConfigModel configModel;
    private final String deviceOS;
    private final IDManager idManager;
    private final IdentityModelStore identityModelStore;
    private final OneSignalUtils oneSignalUtils;
    private final IOperationRepo operationRepo;
    private final IPreferencesService preferencesService;
    private final PropertiesModelStore propertiesModelStore;
    private final ServiceProvider services;
    private final SubscriptionModelStore subscriptionModelStore;

    public UserSwitcher(IPreferencesService preferencesService, IOperationRepo operationRepo, ServiceProvider services, IDManager idManager, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, SubscriptionModelStore subscriptionModelStore, ConfigModel configModel, OneSignalUtils oneSignalUtils, String str, String str2, AndroidUtils androidUtils, InterfaceC1430a appContextProvider) {
        i.e(preferencesService, "preferencesService");
        i.e(operationRepo, "operationRepo");
        i.e(services, "services");
        i.e(idManager, "idManager");
        i.e(identityModelStore, "identityModelStore");
        i.e(propertiesModelStore, "propertiesModelStore");
        i.e(subscriptionModelStore, "subscriptionModelStore");
        i.e(configModel, "configModel");
        i.e(oneSignalUtils, "oneSignalUtils");
        i.e(androidUtils, "androidUtils");
        i.e(appContextProvider, "appContextProvider");
        this.preferencesService = preferencesService;
        this.operationRepo = operationRepo;
        this.services = services;
        this.idManager = idManager;
        this.identityModelStore = identityModelStore;
        this.propertiesModelStore = propertiesModelStore;
        this.subscriptionModelStore = subscriptionModelStore;
        this.configModel = configModel;
        this.oneSignalUtils = oneSignalUtils;
        this.carrierName = str;
        this.deviceOS = str2;
        this.androidUtils = androidUtils;
        this.appContextProvider = appContextProvider;
    }

    public static /* synthetic */ void createAndSwitchToNewUser$default(UserSwitcher userSwitcher, boolean z, InterfaceC1445p interfaceC1445p, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            interfaceC1445p = null;
        }
        userSwitcher.createAndSwitchToNewUser(z, interfaceC1445p);
    }

    private final void createNewUser() {
        Logging.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
        createAndSwitchToNewUser$default(this, false, null, 3, null);
        IOperationRepo.DefaultImpls.enqueue$default(this.operationRepo, new LoginUserOperation(this.configModel.getAppId(), this.identityModelStore.getModel().getOnesignalId(), this.identityModelStore.getModel().getExternalId(), null, 8, null), false, 2, null);
    }

    private final void migrateFromLegacyUser(String str) {
        boolean z;
        Logging.debug$default("initWithContext: creating user linked to subscription " + str, null, 2, null);
        String legacyUserSyncValues = PreferencesExtensionV4Kt.getLegacyUserSyncValues(this.preferencesService);
        if (legacyUserSyncValues != null) {
            createPushSubscriptionFromLegacySync(str, new JSONObject(legacyUserSyncValues), this.configModel, this.subscriptionModelStore, ((IApplicationService) this.services.getService(IApplicationService.class)).getAppContext());
            z = true;
        } else {
            z = false;
        }
        createAndSwitchToNewUser$default(this, z, null, 2, null);
        IOperationRepo.DefaultImpls.enqueue$default(this.operationRepo, new LoginUserFromSubscriptionOperation(this.configModel.getAppId(), this.identityModelStore.getModel().getOnesignalId(), this.identityModelStore.getModel().getExternalId(), str), false, 2, null);
        PreferencesExtensionV4Kt.clearLegacyPlayerId(this.preferencesService);
    }

    public final void createAndSwitchToNewUser(boolean z, InterfaceC1445p interfaceC1445p) {
        Object obj;
        String createLocalId;
        String str;
        SubscriptionStatus subscriptionStatus;
        Logging.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String createLocalId2 = this.idManager.createLocalId();
        IdentityModel identityModel = new IdentityModel();
        identityModel.setOnesignalId(createLocalId2);
        PropertiesModel propertiesModel = new PropertiesModel();
        propertiesModel.setOnesignalId(createLocalId2);
        if (interfaceC1445p != null) {
            interfaceC1445p.invoke(identityModel, propertiesModel);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (i.a(((SubscriptionModel) obj).getId(), this.configModel.getPushSubscriptionId())) {
                    break;
                }
            }
        }
        SubscriptionModel subscriptionModel = (SubscriptionModel) obj;
        SubscriptionModel subscriptionModel2 = new SubscriptionModel();
        if (subscriptionModel == null || (createLocalId = subscriptionModel.getId()) == null) {
            createLocalId = this.idManager.createLocalId();
        }
        subscriptionModel2.setId(createLocalId);
        subscriptionModel2.setType(SubscriptionType.PUSH);
        subscriptionModel2.setOptedIn(subscriptionModel != null ? subscriptionModel.getOptedIn() : true);
        if (subscriptionModel == null || (str = subscriptionModel.getAddress()) == null) {
            str = "";
        }
        subscriptionModel2.setAddress(str);
        if (subscriptionModel == null || (subscriptionStatus = subscriptionModel.getStatus()) == null) {
            subscriptionStatus = SubscriptionStatus.NO_PERMISSION;
        }
        subscriptionModel2.setStatus(subscriptionStatus);
        subscriptionModel2.setSdk(this.oneSignalUtils.getSdkVersion());
        String str2 = this.deviceOS;
        if (str2 == null) {
            str2 = "";
        }
        subscriptionModel2.setDeviceOS(str2);
        String str3 = this.carrierName;
        if (str3 == null) {
            str3 = "";
        }
        subscriptionModel2.setCarrier(str3);
        String appVersion = this.androidUtils.getAppVersion((Context) this.appContextProvider.invoke());
        subscriptionModel2.setAppVersion(appVersion != null ? appVersion : "");
        this.configModel.setPushSubscriptionId(subscriptionModel2.getId());
        arrayList.add(subscriptionModel2);
        this.subscriptionModelStore.clear(ModelChangeTags.NO_PROPOGATE);
        ISingletonModelStore.DefaultImpls.replace$default(this.identityModelStore, identityModel, null, 2, null);
        ISingletonModelStore.DefaultImpls.replace$default(this.propertiesModelStore, propertiesModel, null, 2, null);
        if (z) {
            this.subscriptionModelStore.replaceAll(arrayList, ModelChangeTags.NO_PROPOGATE);
        } else {
            IModelStore.DefaultImpls.replaceAll$default(this.subscriptionModelStore, arrayList, null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createPushSubscriptionFromLegacySync(String legacyPlayerId, JSONObject legacyUserSyncJSON, ConfigModel configModel, SubscriptionModelStore subscriptionModelStore, Context appContext) {
        boolean z;
        String safeString;
        SubscriptionStatus subscriptionStatus;
        String str;
        String str2;
        i.e(legacyPlayerId, "legacyPlayerId");
        i.e(legacyUserSyncJSON, "legacyUserSyncJSON");
        i.e(configModel, "configModel");
        i.e(subscriptionModelStore, "subscriptionModelStore");
        i.e(appContext, "appContext");
        Integer safeInt = JSONObjectExtensionsKt.safeInt(legacyUserSyncJSON, "notification_types");
        SubscriptionModel subscriptionModel = new SubscriptionModel();
        subscriptionModel.setId(legacyPlayerId);
        subscriptionModel.setType(SubscriptionType.PUSH);
        int value = SubscriptionStatus.NO_PERMISSION.getValue();
        if (safeInt == null || safeInt.intValue() != value) {
            int value2 = SubscriptionStatus.UNSUBSCRIBE.getValue();
            if (safeInt == null || safeInt.intValue() != value2) {
                z = true;
                subscriptionModel.setOptedIn(z);
                safeString = JSONObjectExtensionsKt.safeString(legacyUserSyncJSON, "identifier");
                if (safeString == null) {
                    safeString = "";
                }
                subscriptionModel.setAddress(safeString);
                if (safeInt != null) {
                    subscriptionStatus = SubscriptionStatus.Companion.fromInt(safeInt.intValue());
                }
                subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
                subscriptionModel.setStatus(subscriptionStatus);
                subscriptionModel.setSdk(OneSignalUtils.INSTANCE.getSdkVersion());
                str = this.deviceOS;
                if (str == null) {
                    str = "";
                }
                subscriptionModel.setDeviceOS(str);
                str2 = this.carrierName;
                if (str2 == null) {
                    str2 = "";
                }
                subscriptionModel.setCarrier(str2);
                String appVersion = AndroidUtils.INSTANCE.getAppVersion(appContext);
                subscriptionModel.setAppVersion(appVersion != null ? appVersion : "");
                configModel.setPushSubscriptionId(legacyPlayerId);
                subscriptionModelStore.add(subscriptionModel, ModelChangeTags.NO_PROPOGATE);
                return true;
            }
        }
        z = false;
        subscriptionModel.setOptedIn(z);
        safeString = JSONObjectExtensionsKt.safeString(legacyUserSyncJSON, "identifier");
        if (safeString == null) {
        }
        subscriptionModel.setAddress(safeString);
        if (safeInt != null) {
        }
        subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
        subscriptionModel.setStatus(subscriptionStatus);
        subscriptionModel.setSdk(OneSignalUtils.INSTANCE.getSdkVersion());
        str = this.deviceOS;
        if (str == null) {
        }
        subscriptionModel.setDeviceOS(str);
        str2 = this.carrierName;
        if (str2 == null) {
        }
        subscriptionModel.setCarrier(str2);
        String appVersion2 = AndroidUtils.INSTANCE.getAppVersion(appContext);
        subscriptionModel.setAppVersion(appVersion2 != null ? appVersion2 : "");
        configModel.setPushSubscriptionId(legacyPlayerId);
        subscriptionModelStore.add(subscriptionModel, ModelChangeTags.NO_PROPOGATE);
        return true;
    }

    public final void initUser(boolean z) {
        if (!z && IdentityModelStoreKt.hasOneSignalId(this.identityModelStore)) {
            Logging.debug$default("initWithContext: using cached user " + this.identityModelStore.getModel().getOnesignalId(), null, 2, null);
        } else {
            String legacyPlayerId = PreferencesExtensionV4Kt.getLegacyPlayerId(this.preferencesService);
            if (legacyPlayerId == null) {
                createNewUser();
            } else {
                migrateFromLegacyUser(legacyPlayerId);
            }
        }
    }

    public /* synthetic */ UserSwitcher(IPreferencesService iPreferencesService, IOperationRepo iOperationRepo, ServiceProvider serviceProvider, IDManager iDManager, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, SubscriptionModelStore subscriptionModelStore, ConfigModel configModel, OneSignalUtils oneSignalUtils, String str, String str2, AndroidUtils androidUtils, InterfaceC1430a interfaceC1430a, int i2, e eVar) {
        this(iPreferencesService, iOperationRepo, serviceProvider, (i2 & 8) != 0 ? IDManager.INSTANCE : iDManager, identityModelStore, propertiesModelStore, subscriptionModelStore, configModel, (i2 & 256) != 0 ? OneSignalUtils.INSTANCE : oneSignalUtils, (i2 & 512) != 0 ? null : str, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? AndroidUtils.INSTANCE : androidUtils, interfaceC1430a);
    }
}
