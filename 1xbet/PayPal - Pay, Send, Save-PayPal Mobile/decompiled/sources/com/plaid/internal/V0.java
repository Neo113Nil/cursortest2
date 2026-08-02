package com.plaid.internal;

/* loaded from: classes16.dex */
public final class V0 extends androidx.view.ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f5946a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f5947a;
        public final java.lang.String b;
        public final java.lang.String c;

        public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.f5947a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.plaid.internal.V0.a)) {
                return false;
            }
            com.plaid.internal.V0.a aVar = (com.plaid.internal.V0.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5947a, aVar.f5947a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + com.plaid.internal.C0679x.a(this.b, this.f5947a.hashCode() * 31, 31);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.f5947a;
            java.lang.String str2 = this.b;
            java.lang.String str3 = this.c;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorTexts(header=");
            sb.append(str);
            sb.append(", content=");
            sb.append(str2);
            sb.append(", buttonText=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    public final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5948a;

        static {
            int[] iArr = new int[com.plaid.internal.H3.values().length];
            try {
                iArr[com.plaid.internal.H3.NETWORK_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.H3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.H3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.plaid.internal.H3.HTTP_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.plaid.internal.H3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f5948a = iArr;
        }
    }

    @javax.inject.Inject
    public V0(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        this.f5946a = resources;
    }
}
