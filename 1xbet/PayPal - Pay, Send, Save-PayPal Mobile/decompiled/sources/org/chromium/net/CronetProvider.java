package org.chromium.net;

/* loaded from: classes5.dex */
public abstract class CronetProvider {
    private static final java.lang.String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final java.lang.String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final java.lang.String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final java.lang.String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final java.lang.String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final java.lang.String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final java.lang.String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final java.lang.String TAG = "CronetProvider";
    protected final android.content.Context mContext;

    private static void logReflectiveOperationException(java.lang.String str, boolean z, java.lang.Exception exc) {
    }

    public abstract org.chromium.net.CronetEngine.Builder createBuilder();

    public abstract java.lang.String getName();

    public abstract java.lang.String getVersion();

    public abstract boolean isEnabled();

    public CronetProvider(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    public java.lang.String toString() {
        java.lang.String name2 = getClass().getName();
        java.lang.String name3 = getName();
        java.lang.String version = getVersion();
        boolean isEnabled = isEnabled();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[class=");
        sb.append(name2);
        sb.append(", name=");
        sb.append(name3);
        sb.append(", version=");
        sb.append(version);
        sb.append(", enabled=");
        sb.append(isEnabled);
        sb.append("]");
        return sb.toString();
    }

    static final class ProviderInfo {
        public org.chromium.net.impl.CronetLogger.CronetSource getHighResolutionOutputSizeshNQ4ISI;
        public org.chromium.net.CronetProvider getHighSpeedVideoSizes;

        ProviderInfo() {
        }

        public final int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof org.chromium.net.CronetProvider.ProviderInfo) && this.getHighSpeedVideoSizes.equals(((org.chromium.net.CronetProvider.ProviderInfo) obj).getHighSpeedVideoSizes);
        }
    }

    public static java.util.List<org.chromium.net.CronetProvider> getAllProviders(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<org.chromium.net.CronetProvider.ProviderInfo> it = getAllProviderInfos(context).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getHighSpeedVideoSizes);
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    static java.util.List<org.chromium.net.CronetProvider.ProviderInfo> getAllProviderInfos(android.content.Context context) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        addCronetProviderFromResourceFile(context, org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED, linkedHashSet);
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK, linkedHashSet, false);
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(linkedHashSet));
    }

    private static boolean addCronetProviderImplByClassName(android.content.Context context, java.lang.String str, org.chromium.net.impl.CronetLogger.CronetSource cronetSource, java.util.Set<org.chromium.net.CronetProvider.ProviderInfo> set, boolean z) {
        try {
            java.lang.reflect.Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(org.chromium.net.CronetProvider.class).getConstructor(android.content.Context.class);
            org.chromium.net.CronetProvider.ProviderInfo providerInfo = new org.chromium.net.CronetProvider.ProviderInfo();
            providerInfo.getHighSpeedVideoSizes = (org.chromium.net.CronetProvider) constructor.newInstance(context);
            providerInfo.getHighResolutionOutputSizeshNQ4ISI = cronetSource;
            set.add(providerInfo);
            return true;
        } catch (java.lang.ClassNotFoundException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (java.lang.IllegalAccessException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (java.lang.InstantiationException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (java.lang.NoSuchMethodException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (java.lang.reflect.InvocationTargetException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }

    private static boolean addCronetProviderFromResourceFile(android.content.Context context, org.chromium.net.impl.CronetLogger.CronetSource cronetSource, java.util.Set<org.chromium.net.CronetProvider.ProviderInfo> set) {
        if (PLAY_SERVICES_CRONET_PROVIDER_CLASS.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) || PLAY_SERVICES_CRONET_PROVIDER_CLASS.equals(GMS_CORE_CRONET_PROVIDER_CLASS) || PLAY_SERVICES_CRONET_PROVIDER_CLASS.equals(JAVA_CRONET_PROVIDER_CLASS) || PLAY_SERVICES_CRONET_PROVIDER_CLASS.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            return false;
        }
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, cronetSource, set, true);
        return true;
    }
}
