package com.onesignal.core.internal.features;

import A4.h;
import B0.o;
import B4.k;
import N4.g;
import Q4.y;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.common.threading.ThreadingMode;
import com.onesignal.core.internal.backend.impl.FeatureFlagsJsonParser;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.debug.internal.logging.Logging;
import g4.AbstractC0459d;
import g4.AbstractC0465j;
import g4.AbstractC0467l;
import g4.AbstractC0476u;
import g4.C0472q;
import g4.C0473r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class FeatureManager implements IFeatureManager, ISingletonModelStoreChangeHandler<ConfigModel> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> localFeatureOverrides = C0473r.f5752a;
    private final ConfigModelStore configModelStore;
    private volatile Map<FeatureFlag, Boolean> featureStates;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FeatureActivationMode.values().length];
            try {
                iArr[FeatureActivationMode.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureActivationMode.APP_STARTUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FeatureFlag.values().length];
            try {
                iArr2[FeatureFlag.SDK_BACKGROUND_THREADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FeatureFlag.SDK_IDENTITY_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FeatureManager(ConfigModelStore configModelStore) {
        i.e(configModelStore, "configModelStore");
        this.configModelStore = configModelStore;
        this.featureStates = C0472q.f5751a;
        Logging.debug$default("OneSignal: FeatureManager initializing from cached config features", null, 2, null);
        try {
            refreshEnabledFeatures(configModelStore.getModel(), true);
        } catch (Throwable th) {
            Logging.error("OneSignal: Failed to initialize feature states from cached config", th);
        }
        this.configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    private final void applySideEffects(FeatureFlag featureFlag, boolean z) {
        if (WhenMappings.$EnumSwitchMapping$1[featureFlag.ordinal()] != 1) {
            return;
        }
        ThreadingMode.INSTANCE.updateUseBackgroundThreading(z, "FeatureManager:" + featureFlag.getActivationMode());
    }

    private final String canonicalizeFeatureKey(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(Character.toLowerCase(str.charAt(i2)));
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    private final void refreshEnabledFeatures(ConfigModel configModel, boolean z) {
        List<String> sdkRemoteFeatureFlags = configModel.getSdkRemoteFeatureFlags();
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(sdkRemoteFeatureFlags, 10));
        Iterator<T> it = sdkRemoteFeatureFlags.iterator();
        while (it.hasNext()) {
            arrayList.add(canonicalizeFeatureKey((String) it.next()));
        }
        Set<String> set = localFeatureOverrides;
        ArrayList arrayList2 = new ArrayList(AbstractC0467l.D0(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(canonicalizeFeatureKey((String) it2.next()));
        }
        Set<String> X02 = AbstractC0465j.X0(AbstractC0465j.N0(arrayList, arrayList2));
        Set<String> set2 = localFeatureOverrides;
        if (!set2.isEmpty()) {
            Logging.warn$default("OneSignal: Local feature override enabled for testing only: " + set2, null, 2, null);
        }
        LinkedHashMap e02 = AbstractC0476u.e0(this.featureStates);
        AbstractC0459d abstractC0459d = (AbstractC0459d) FeatureFlag.getEntries();
        abstractC0459d.getClass();
        g gVar = new g(5, abstractC0459d);
        while (gVar.hasNext()) {
            FeatureFlag featureFlag = (FeatureFlag) gVar.next();
            boolean isEnabledIn = featureFlag.isEnabledIn(X02);
            int i2 = WhenMappings.$EnumSwitchMapping$0[featureFlag.getActivationMode().ordinal()];
            if (i2 == 1) {
                e02.put(featureFlag, Boolean.valueOf(isEnabledIn));
                applySideEffects(featureFlag, isEnabledIn);
            } else if (i2 == 2) {
                boolean containsKey = e02.containsKey(featureFlag);
                if (z || !containsKey) {
                    e02.put(featureFlag, Boolean.valueOf(isEnabledIn));
                    applySideEffects(featureFlag, isEnabledIn);
                } else {
                    Boolean bool = (Boolean) e02.get(featureFlag);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (booleanValue != isEnabledIn) {
                        Logging.info$default("OneSignal: Feature " + featureFlag.getKey() + " changed remotely to " + isEnabledIn + " but is NEXT_RUN, keeping current run value=" + booleanValue, null, 2, null);
                    }
                }
            }
        }
        this.featureStates = e02;
    }

    @Override // com.onesignal.core.internal.features.IFeatureManager
    public List<String> enabledFeatureKeys() {
        Set<Map.Entry<FeatureFlag, Boolean>> entrySet = this.featureStates.entrySet();
        i.e(entrySet, "<this>");
        A4.e O5 = A4.g.O(new h(1, entrySet), FeatureManager$enabledFeatureKeys$1.INSTANCE);
        FeatureManager$enabledFeatureKeys$2 transform = FeatureManager$enabledFeatureKeys$2.INSTANCE;
        i.e(transform, "transform");
        return A4.g.P(new A4.e(O5, transform, 1));
    }

    @Override // com.onesignal.core.internal.features.IFeatureManager
    public boolean isEnabled(FeatureFlag feature) {
        i.e(feature, "feature");
        Boolean bool = this.featureStates.get(feature);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (i.a(args.getProperty(), "sdkRemoteFeatureFlags") || i.a(args.getProperty(), "sdkRemoteFeatureFlagMetadata")) {
            Logging.debug$default("OneSignal: FeatureManager.onModelUpdated(property=" + args.getProperty() + ", tag=" + tag + ')', null, 2, null);
            try {
                refreshEnabledFeatures(this.configModelStore.getModel(), false);
            } catch (Throwable th) {
                Logging.error("OneSignal: Failed to refresh features on model update", th);
            }
        }
    }

    @Override // com.onesignal.core.internal.features.IFeatureManager
    public Map<String, y> remoteFeatureFlagMetadata() {
        String sdkRemoteFeatureFlagMetadata = this.configModelStore.getModel().getSdkRemoteFeatureFlagMetadata();
        if (sdkRemoteFeatureFlagMetadata == null || k.Z(sdkRemoteFeatureFlagMetadata)) {
            return null;
        }
        return FeatureFlagsJsonParser.INSTANCE.parseStoredMetadataMap(sdkRemoteFeatureFlagMetadata);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        Logging.debug$default(o.l(new StringBuilder("OneSignal: FeatureManager.onModelReplaced(tag="), tag, ')'), null, 2, null);
        if (tag.equals(ModelChangeTags.HYDRATE) || tag.equals(ModelChangeTags.NORMAL)) {
            try {
                refreshEnabledFeatures(model, false);
            } catch (Throwable th) {
                Logging.error("OneSignal: Failed to refresh features on model replace", th);
            }
        }
    }
}
