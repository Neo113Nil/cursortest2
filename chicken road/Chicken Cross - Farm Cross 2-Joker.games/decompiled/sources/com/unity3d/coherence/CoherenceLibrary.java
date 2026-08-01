package com.unity3d.coherence;

import android.content.Context;

/* loaded from: classes7.dex */
public final class CoherenceLibrary {
    private static final String PREFS_NAME = "com.unity3d.coherence.prefs";
    private static volatile CoherenceLibrary instance;
    private final long apiPtr;
    private final AttributesProvider attributesProvider;
    private final CoherenceProvider coherenceProvider;
    private final IdentityProvider identityProvider;

    private CoherenceLibrary(Context context, int i) {
        long init = CoherenceBridge.init(new Coherence(context, context.getSharedPreferences(PREFS_NAME, 0)), BuildConfig.VERSION_NAME, i);
        if (init == 0) {
            throw new IllegalStateException("unity_coherence_library_init returned null (source=" + i + ")");
        }
        this.apiPtr = init;
        this.identityProvider = new NativeIdentityProvider(this);
        this.attributesProvider = new NativeAttributesProvider(this);
        this.coherenceProvider = new NativeCoherenceProvider(this);
    }

    public static void init(CoherenceInitConfig coherenceInitConfig) {
        if (coherenceInitConfig == null) {
            throw new IllegalArgumentException("config must not be null");
        }
        if (instance == null) {
            synchronized (CoherenceLibrary.class) {
                if (instance == null) {
                    instance = new CoherenceLibrary(coherenceInitConfig.getContext(), coherenceInitConfig.getSource());
                }
            }
        }
    }

    public static CoherenceLibrary getInstance() {
        CoherenceLibrary coherenceLibrary = instance;
        if (coherenceLibrary != null) {
            return coherenceLibrary;
        }
        throw new IllegalStateException("CoherenceLibrary not initialized — call CoherenceLibrary.init(CoherenceInitConfig) first");
    }

    long apiPtr() {
        return this.apiPtr;
    }

    public AttributesProvider getAttributesProvider() {
        return this.attributesProvider;
    }

    public IdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    public CoherenceProvider getCoherenceProvider() {
        return this.coherenceProvider;
    }

    public byte[] getVersions() {
        return CoherenceBridge.getVersions(this.apiPtr);
    }
}
