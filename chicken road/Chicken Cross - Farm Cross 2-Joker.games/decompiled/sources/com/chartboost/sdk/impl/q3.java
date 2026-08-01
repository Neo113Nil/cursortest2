package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class q3 {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4966a;
    public final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q3 a(String content) {
            Object obj;
            Object obj2;
            Intrinsics.checkNotNullParameter(content, "content");
            try {
                List<String> lines = StringsKt.lines(content);
                Iterator<T> it = lines.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (StringsKt.startsWith$default((String) obj, "url=", false, 2, (Object) null)) {
                        break;
                    }
                }
                String str = (String) obj;
                Iterator<T> it2 = lines.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (StringsKt.startsWith$default((String) obj2, "expiry=", false, 2, (Object) null)) {
                        break;
                    }
                }
                String str2 = (String) obj2;
                if (str != null && str2 != null) {
                    String substring = str.substring(4);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    String substring2 = str2.substring(7);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    Long longOrNull = StringsKt.toLongOrNull(substring2);
                    if (longOrNull != null) {
                        return new q3(substring, longOrNull.longValue());
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public a() {
        }
    }

    public q3(String originalUrl, long j) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.f4966a = originalUrl;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.f4966a;
    }

    public final String c() {
        return "url=" + this.f4966a + "\nexpiry=" + this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return Intrinsics.areEqual(this.f4966a, q3Var.f4966a) && this.b == q3Var.b;
    }

    public int hashCode() {
        return (this.f4966a.hashCode() * 31) + Long.hashCode(this.b);
    }

    public String toString() {
        return "CacheMetadata(originalUrl=" + this.f4966a + ", expiryTimestampMillis=" + this.b + ")";
    }
}
