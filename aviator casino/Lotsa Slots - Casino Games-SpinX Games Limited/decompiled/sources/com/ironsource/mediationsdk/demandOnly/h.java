package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public interface h extends com.ironsource.mediationsdk.demandOnly.q {

    public static abstract class a implements com.ironsource.mediationsdk.demandOnly.h {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6424a;
        private final java.lang.String b;
        private final boolean c;

        public a(java.lang.String str, java.lang.String str2, boolean z) {
            this.f6424a = str;
            this.b = str2;
            this.c = z;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        public abstract com.ironsource.mediationsdk.logger.IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public java.lang.String b() {
            return this.b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public java.lang.String e() {
            return this.f6424a;
        }
    }

    public static final class b extends com.ironsource.mediationsdk.demandOnly.h.a {
        private final java.lang.String d;
        private final android.app.Activity e;
        private final com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout f;

        public /* synthetic */ b(java.lang.String str, android.app.Activity activity, java.lang.String str2, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public com.ironsource.mediationsdk.logger.IronSourceError a() {
            com.ironsource.mediationsdk.logger.IronSourceError a2 = new com.ironsource.mediationsdk.demandOnly.q.a(this.d).a(this);
            if (a2 != null) {
                return a2;
            }
            return null;
        }

        public final android.app.Activity f() {
            return this.e;
        }

        public final com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout g() {
            return this.f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String adFormat, android.app.Activity activity, java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str2, boolean z) {
            super(str, str2, z);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.d = adFormat;
            this.e = activity;
            this.f = iSDemandOnlyBannerLayout;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f6425a = "";
        private android.app.Activity b;
        private java.lang.String c;
        private boolean d;
        private java.lang.String e;
        private com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout f;

        public final com.ironsource.mediationsdk.demandOnly.h.c a(com.ironsource.mediationsdk.IronSource.a adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            java.lang.String aVar = adFormat.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "adFormat.toString()");
            this.f6425a = aVar;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c b(java.lang.String str) {
            this.c = str;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(android.app.Activity activity) {
            this.b = activity;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.d b() {
            return new com.ironsource.mediationsdk.demandOnly.h.d(this.f6425a, this.b, this.c, this.e, this.d);
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(android.app.Activity activity, android.app.Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.b = activity;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(boolean z) {
            this.d = z;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(java.lang.String str) {
            this.e = str;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.c a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f = iSDemandOnlyBannerLayout;
            return this;
        }

        public final com.ironsource.mediationsdk.demandOnly.h.b a() {
            return new com.ironsource.mediationsdk.demandOnly.h.b(this.f6425a, this.b, this.c, this.f, this.e, this.d);
        }
    }

    public static final class d extends com.ironsource.mediationsdk.demandOnly.h.a implements com.ironsource.InterfaceC3103j {
        private final java.lang.String d;
        private final android.app.Activity e;

        public /* synthetic */ d(java.lang.String str, android.app.Activity activity, java.lang.String str2, java.lang.String str3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public com.ironsource.mediationsdk.logger.IronSourceError a() {
            com.ironsource.mediationsdk.logger.IronSourceError a2 = new com.ironsource.mediationsdk.demandOnly.q.b(this.d).a(this);
            if (a2 != null) {
                return a2;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC3103j
        public android.app.Activity d() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(java.lang.String adFormat, android.app.Activity activity, java.lang.String str, java.lang.String str2, boolean z) {
            super(str, str2, z);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.d = adFormat;
            this.e = activity;
        }
    }

    java.lang.String b();

    boolean c();

    java.lang.String e();
}
