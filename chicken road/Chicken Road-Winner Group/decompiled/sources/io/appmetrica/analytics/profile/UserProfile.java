package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC0530go;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f8957a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f8958a;

        public /* synthetic */ Builder(int i3) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC0530go> userProfileUpdate) {
            this.f8958a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f8958a, 0);
        }

        private Builder() {
            this.f8958a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i3) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC0530go>> getUserProfileUpdates() {
        return this.f8957a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f8957a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
