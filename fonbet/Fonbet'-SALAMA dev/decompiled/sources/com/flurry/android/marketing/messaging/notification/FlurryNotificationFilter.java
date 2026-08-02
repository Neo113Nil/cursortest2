package com.flurry.android.marketing.messaging.notification;

import java.util.LinkedList;
import java.util.List;
import w1.AbstractC1706i0;

/* loaded from: classes.dex */
public final class FlurryNotificationFilter<T> {

    /* renamed from: a, reason: collision with root package name */
    public LinkedList f10488a;

    /* renamed from: b, reason: collision with root package name */
    public String f10489b;

    /* renamed from: c, reason: collision with root package name */
    public FlurryNotificationFilterListener f10490c;

    public static final class Builder<T> {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedList f10491a = new LinkedList();

        /* renamed from: b, reason: collision with root package name */
        public String f10492b;

        /* renamed from: c, reason: collision with root package name */
        public FlurryNotificationFilterListener f10493c;

        public final FlurryNotificationFilter<T> build() {
            if (this.f10493c == null) {
                AbstractC1706i0.q("FlurryNotificationFilterListener can not be null");
                return null;
            }
            LinkedList linkedList = this.f10491a;
            if (linkedList.isEmpty()) {
                AbstractC1706i0.q("Can not pass an empty path to FlurryNotificationFilter");
                return null;
            }
            String str = this.f10492b;
            FlurryNotificationFilterListener flurryNotificationFilterListener = this.f10493c;
            FlurryNotificationFilter<T> flurryNotificationFilter = new FlurryNotificationFilter<>();
            flurryNotificationFilter.f10488a = linkedList;
            flurryNotificationFilter.f10489b = str;
            flurryNotificationFilter.f10490c = flurryNotificationFilterListener;
            return flurryNotificationFilter;
        }

        public final Builder<T> withEqual(String str) {
            this.f10492b = str;
            return this;
        }

        public final Builder<T> withListener(FlurryNotificationFilterListener<T> flurryNotificationFilterListener) {
            this.f10493c = flurryNotificationFilterListener;
            return this;
        }

        public final Builder<T> withNextPath(String str) {
            this.f10491a.add(str);
            return this;
        }
    }

    public final String getEqual() {
        return this.f10489b;
    }

    public final FlurryNotificationFilterListener<T> getFilterListener() {
        return this.f10490c;
    }

    public final List<String> getPathList() {
        return this.f10488a;
    }
}
