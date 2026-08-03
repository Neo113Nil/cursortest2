package io.appmetrica.analytics.profile;

/* loaded from: classes.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List f7469a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final java.util.LinkedList f7470a;

        public /* synthetic */ Builder(int i2) {
            this();
        }

        public io.appmetrica.analytics.profile.UserProfile.Builder apply(io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> userProfileUpdate) {
            this.f7470a.add(userProfileUpdate);
            return this;
        }

        public io.appmetrica.analytics.profile.UserProfile build() {
            return new io.appmetrica.analytics.profile.UserProfile(this.f7470a, 0);
        }

        private Builder() {
            this.f7470a = new java.util.LinkedList();
        }
    }

    public /* synthetic */ UserProfile(java.util.LinkedList linkedList, int i2) {
        this(linkedList);
    }

    public static io.appmetrica.analytics.profile.UserProfile.Builder newBuilder() {
        return new io.appmetrica.analytics.profile.UserProfile.Builder(0);
    }

    public java.util.List<io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo>> getUserProfileUpdates() {
        return this.f7469a;
    }

    private UserProfile(java.util.LinkedList linkedList) {
        this.f7469a = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
