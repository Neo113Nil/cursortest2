package com.facebook.appevents;

import androidx.annotation.RestrictTo;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.facebook.appevents.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0689a implements Serializable {
    public static final C0070a Companion = new C0070a();
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;

    /* renamed from: com.facebook.appevents.a$a, reason: collision with other inner class name */
    public static final class C0070a {
    }

    /* renamed from: com.facebook.appevents.a$b */
    public static final class b implements Serializable {
        public static final C0071a Companion = new C0071a();
        private static final long serialVersionUID = -2488473066578201069L;
        public final String a;

        /* renamed from: com.facebook.appevents.a$b$a, reason: collision with other inner class name */
        public static final class C0071a {
        }

        public b(String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.a = appId;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new C0689a(null, this.a);
        }
    }

    public C0689a(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.a = applicationId;
        this.b = com.facebook.internal.E.z(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new b(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0689a) {
            C0689a c0689a = (C0689a) obj;
            String str = c0689a.b;
            com.facebook.internal.E e = com.facebook.internal.E.a;
            String str2 = this.b;
            if ((str == null ? str2 == null : Intrinsics.areEqual(str, str2)) && Intrinsics.areEqual(c0689a.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (str != null ? str.hashCode() : 0) ^ this.a.hashCode();
    }
}
