package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC0679go;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f9937a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f9938a;

        public /* synthetic */ Builder(int i2) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC0679go> userProfileUpdate) {
            this.f9938a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f9938a, 0);
        }

        private Builder() {
            this.f9938a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i2) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC0679go>> getUserProfileUpdates() {
        return this.f9937a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f9937a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
