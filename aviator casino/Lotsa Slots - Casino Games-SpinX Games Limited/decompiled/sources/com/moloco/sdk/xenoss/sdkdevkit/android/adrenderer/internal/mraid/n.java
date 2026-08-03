package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public abstract class n {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b(null);
    public static final int c = 0;
    public static final java.lang.String d = "close";
    public static final java.lang.String e = "expand";
    public static final java.lang.String f = "open";
    public static final java.lang.String g = "resize";
    public static final java.lang.String h = "setOrientationProperties";

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7516a;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.a i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.a();
        public static final int j = 0;

        public a() {
            super("close", null);
        }
    }

    public static final class b {

        public static final class a {
            public static final int c = 0;

            /* renamed from: a, reason: collision with root package name */
            public final boolean f7517a;
            public final java.lang.String b;

            public a(boolean z, java.lang.String description) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
                this.f7517a = z;
                this.b = description;
            }

            public final java.lang.String a() {
                return this.b;
            }

            public final boolean b() {
                return this.f7517a;
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e a() {
            return null;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.d b(java.util.Map<java.lang.String, java.lang.String> map) {
            java.lang.Object m10798constructorimpl;
            java.lang.String str = map.get("url");
            if (str == null) {
                return null;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                android.net.Uri parse = android.net.Uri.parse(str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.d(parse));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.d) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f c(java.util.Map<java.lang.String, java.lang.String> map) {
            java.lang.Boolean booleanStrictOrNull;
            java.lang.String str = map.get("allowOrientationChange");
            if (str == null || (booleanStrictOrNull = kotlin.text.StringsKt.toBooleanStrictOrNull(str)) == null) {
                return null;
            }
            boolean booleanValue = booleanStrictOrNull.booleanValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.f7518a.a(map.get("forceOrientation"));
            if (a2 == null) {
                return null;
            }
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f(booleanValue, a2);
        }

        public b() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a> a(java.lang.String str) {
            java.lang.Object m10798constructorimpl;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(android.net.Uri.parse(str));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Object obj = null;
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = null;
            }
            android.net.Uri uri = (android.net.Uri) m10798constructorimpl;
            if (uri == null) {
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a(false, "Invalid url: " + str));
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), "mraid")) {
                return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a(false, "Non-mraid url scheme: " + str));
            }
            java.util.Map<java.lang.String, java.lang.String> a2 = a(uri);
            java.lang.String host = uri.getHost();
            if (host != null) {
                switch (host.hashCode()) {
                    case -1289167206:
                        if (host.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e)) {
                            obj = a(a2);
                            break;
                        }
                        break;
                    case -934437708:
                        if (host.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g)) {
                            obj = a();
                            break;
                        }
                        break;
                    case 3417674:
                        if (host.equals("open")) {
                            obj = b(a2);
                            break;
                        }
                        break;
                    case 94756344:
                        if (host.equals("close")) {
                            obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.a.i;
                            break;
                        }
                        break;
                    case 133423073:
                        if (host.equals("setOrientationProperties")) {
                            obj = c(a2);
                            break;
                        }
                        break;
                }
            }
            if (obj != null) {
                return new com.moloco.sdk.internal.v.b(obj);
            }
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.b.a(true, "Unknown/unsupported mraid command " + uri.getHost()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.c a(java.util.Map<java.lang.String, java.lang.String> map) {
            android.net.Uri uri;
            java.lang.String str = map.get("url");
            if (str != null) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    uri = kotlin.Result.m10798constructorimpl(android.net.Uri.parse(str));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    uri = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                r0 = kotlin.Result.m10804isFailureimpl(uri) ? null : uri;
            }
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.c(r0);
        }

        public final java.util.Map<java.lang.String, java.lang.String> a(android.net.Uri uri) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.String str : uri.getQueryParameterNames()) {
                linkedHashMap.put(str, android.text.TextUtils.join(",", uri.getQueryParameters(str)));
            }
            return linkedHashMap;
        }
    }

    public static final class c extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n {
        public static final int j = 8;
        public final android.net.Uri i;

        public c(android.net.Uri uri) {
            super(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e, null);
            this.i = uri;
        }

        public final android.net.Uri b() {
            return this.i;
        }
    }

    public static final class d extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n {
        public static final int j = 8;
        public final android.net.Uri i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(android.net.Uri uri) {
            super("open", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            this.i = uri;
        }

        public final android.net.Uri b() {
            return this.i;
        }
    }

    public static final class e extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n {
        public static final int n = 0;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public e(int i, int i2, int i3, int i4, boolean z) {
            super(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, null);
            this.i = i;
            this.j = i2;
            this.k = i3;
            this.l = i4;
            this.m = z;
        }

        public final boolean b() {
            return this.m;
        }

        public final int c() {
            return this.j;
        }

        public final int d() {
            return this.k;
        }

        public final int e() {
            return this.l;
        }

        public final int f() {
            return this.i;
        }
    }

    public static final class f extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n {
        public static final int k = 0;
        public final boolean i;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p forceOrientation) {
            super("setOrientationProperties", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
            this.i = z;
            this.j = forceOrientation;
        }

        public final boolean b() {
            return this.i;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p c() {
            return this.j;
        }
    }

    public /* synthetic */ n(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final java.lang.String a() {
        return this.f7516a;
    }

    public n(java.lang.String str) {
        this.f7516a = str;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q.a(fVar.c()), fVar.b());
    }
}
