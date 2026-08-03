package com.facebook;

/* compiled from: ProfileManager.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/ProfileManager;", "", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "profileCache", "Lcom/facebook/ProfileCache;", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/ProfileCache;)V", "value", "Lcom/facebook/Profile;", "currentProfile", "getCurrentProfile", "()Lcom/facebook/Profile;", "setCurrentProfile", "(Lcom/facebook/Profile;)V", "currentProfileField", "loadCurrentProfile", "", "sendCurrentProfileChangedBroadcast", "", "oldProfile", "writeToCache", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileManager {
    public static final java.lang.String ACTION_CURRENT_PROFILE_CHANGED = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.ProfileManager.Companion INSTANCE = new com.facebook.ProfileManager.Companion(null);
    public static final java.lang.String EXTRA_NEW_PROFILE = "com.facebook.sdk.EXTRA_NEW_PROFILE";
    public static final java.lang.String EXTRA_OLD_PROFILE = "com.facebook.sdk.EXTRA_OLD_PROFILE";
    private static volatile com.facebook.ProfileManager instance;
    private com.facebook.Profile currentProfileField;
    private final androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager;
    private final com.facebook.ProfileCache profileCache;

    @kotlin.jvm.JvmStatic
    public static final synchronized com.facebook.ProfileManager getInstance() {
        com.facebook.ProfileManager companion;
        synchronized (com.facebook.ProfileManager.class) {
            companion = INSTANCE.getInstance();
        }
        return companion;
    }

    public ProfileManager(androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager, com.facebook.ProfileCache profileCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.localBroadcastManager = localBroadcastManager;
        this.profileCache = profileCache;
    }

    /* renamed from: getCurrentProfile, reason: from getter */
    public final com.facebook.Profile getCurrentProfileField() {
        return this.currentProfileField;
    }

    public final void setCurrentProfile(com.facebook.Profile profile) {
        setCurrentProfile(profile, true);
    }

    public final boolean loadCurrentProfile() {
        com.facebook.Profile load = this.profileCache.load();
        if (load == null) {
            return false;
        }
        setCurrentProfile(load, false);
        return true;
    }

    private final void setCurrentProfile(com.facebook.Profile currentProfile, boolean writeToCache) {
        com.facebook.Profile profile = this.currentProfileField;
        this.currentProfileField = currentProfile;
        if (writeToCache) {
            if (currentProfile != null) {
                this.profileCache.save(currentProfile);
            } else {
                this.profileCache.clear();
            }
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.areObjectsEqual(profile, currentProfile)) {
            return;
        }
        sendCurrentProfileChangedBroadcast(profile, currentProfile);
    }

    private final void sendCurrentProfileChangedBroadcast(com.facebook.Profile oldProfile, com.facebook.Profile currentProfile) {
        android.content.Intent intent = new android.content.Intent(ACTION_CURRENT_PROFILE_CHANGED);
        intent.putExtra(EXTRA_OLD_PROFILE, oldProfile);
        intent.putExtra(EXTRA_NEW_PROFILE, currentProfile);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    /* compiled from: ProfileManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/ProfileManager$Companion;", "", "()V", "ACTION_CURRENT_PROFILE_CHANGED", "", "EXTRA_NEW_PROFILE", "EXTRA_OLD_PROFILE", com.ironsource.C3232q2.p, "Lcom/facebook/ProfileManager;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final synchronized com.facebook.ProfileManager getInstance() {
            com.facebook.ProfileManager profileManager;
            if (com.facebook.ProfileManager.instance == null) {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(com.facebook.FacebookSdk.getApplicationContext());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                com.facebook.ProfileManager.instance = new com.facebook.ProfileManager(localBroadcastManager, new com.facebook.ProfileCache());
            }
            profileManager = com.facebook.ProfileManager.instance;
            if (profileManager == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.ironsource.C3232q2.p);
                throw null;
            }
            return profileManager;
        }
    }
}
