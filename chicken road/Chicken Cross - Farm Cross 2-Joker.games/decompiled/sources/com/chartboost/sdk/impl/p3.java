package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.caching.ExpirationReason;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class p3 {

    public static final class a extends p3 {

        /* renamed from: a, reason: collision with root package name */
        public final ExpirationReason f4952a;
        public final URL b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ExpirationReason reason, URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f4952a = reason;
            this.b = url;
        }

        public final ExpirationReason a() {
            return this.f4952a;
        }

        public final URL b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4952a == aVar.f4952a && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.f4952a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Evicted(reason=" + this.f4952a + ", url=" + this.b + ")";
        }
    }

    public /* synthetic */ p3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public p3() {
    }
}
