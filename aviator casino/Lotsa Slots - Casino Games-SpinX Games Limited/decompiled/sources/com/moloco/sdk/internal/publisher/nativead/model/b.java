package com.moloco.sdk.internal.publisher.nativead.model;

/* loaded from: classes5.dex */
public final class b {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7138a;
    public final java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> b;
    public final com.moloco.sdk.internal.publisher.nativead.model.b.c c;
    public final java.util.List<java.lang.String> d;
    public final java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.C0197b> e;
    public final java.lang.String f;

    public static abstract class a {
        public static final int c = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f7139a;
        public final boolean b;

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$a$a, reason: collision with other inner class name */
        public static final class C0195a extends com.moloco.sdk.internal.publisher.nativead.model.b.a {
            public static final int g = 0;
            public final java.lang.Integer d;
            public final java.lang.Integer e;
            public final java.lang.String f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0195a(int i, boolean z, java.lang.Integer num, java.lang.Integer num2, java.lang.String value) {
                super(i, z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                this.d = num;
                this.e = num2;
                this.f = value;
            }

            public final java.lang.Integer c() {
                return this.e;
            }

            public final java.lang.Integer d() {
                return this.d;
            }

            public final java.lang.String e() {
                return this.f;
            }
        }

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$a$b, reason: collision with other inner class name */
        public static final class C0196b extends com.moloco.sdk.internal.publisher.nativead.model.b.a {
            public static final int h = 0;
            public final java.lang.Integer d;
            public final java.lang.String e;
            public final java.lang.Integer f;
            public final java.lang.Integer g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0196b(int i, boolean z, java.lang.Integer num, java.lang.String url, java.lang.Integer num2, java.lang.Integer num3) {
                super(i, z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                this.d = num;
                this.e = url;
                this.f = num2;
                this.g = num3;
            }

            public final java.lang.Integer c() {
                return this.g;
            }

            public final java.lang.Integer d() {
                return this.d;
            }

            public final java.lang.String e() {
                return this.e;
            }

            public final java.lang.Integer f() {
                return this.f;
            }
        }

        public static final class c extends com.moloco.sdk.internal.publisher.nativead.model.b.a {
            public static final int f = 0;
            public final java.lang.String d;
            public final java.lang.Integer e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i, boolean z, java.lang.String text, java.lang.Integer num) {
                super(i, z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
                this.d = text;
                this.e = num;
            }

            public final java.lang.Integer c() {
                return this.e;
            }

            public final java.lang.String d() {
                return this.d;
            }
        }

        public static final class d extends com.moloco.sdk.internal.publisher.nativead.model.b.a {
            public static final int e = 0;
            public final java.lang.String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i, boolean z, java.lang.String vastTag) {
                super(i, z, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastTag, "vastTag");
                this.d = vastTag;
            }

            public final java.lang.String c() {
                return this.d;
            }
        }

        public /* synthetic */ a(int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z);
        }

        public final int a() {
            return this.f7139a;
        }

        public final boolean b() {
            return this.b;
        }

        public a(int i, boolean z) {
            this.f7139a = i;
            this.b = z;
        }
    }

    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$b, reason: collision with other inner class name */
    public static final class C0197b {
        public static final int d = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f7140a;
        public final int b;
        public final java.lang.String c;

        public C0197b(int i, int i2, java.lang.String str) {
            this.f7140a = i;
            this.b = i2;
            this.c = str;
        }

        public final int a() {
            return this.f7140a;
        }

        public final int b() {
            return this.b;
        }

        public final java.lang.String c() {
            return this.c;
        }
    }

    public static final class c {
        public static final int d = 8;

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f7141a;
        public final java.util.List<java.lang.String> b;
        public final java.lang.String c;

        public c(java.lang.String url, java.util.List<java.lang.String> clickTrackerUrls, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickTrackerUrls, "clickTrackerUrls");
            this.f7141a = url;
            this.b = clickTrackerUrls;
            this.c = str;
        }

        public final java.util.List<java.lang.String> a() {
            return this.b;
        }

        public final java.lang.String b() {
            return this.c;
        }

        public final java.lang.String c() {
            return this.f7141a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(java.lang.String str, java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.b.a> assets, com.moloco.sdk.internal.publisher.nativead.model.b.c cVar, java.util.List<java.lang.String> impressionTrackerUrls, java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.C0197b> eventTrackers, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assets, "assets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionTrackerUrls, "impressionTrackerUrls");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        this.f7138a = str;
        this.b = assets;
        this.c = cVar;
        this.d = impressionTrackerUrls;
        this.e = eventTrackers;
        this.f = str2;
    }

    public final java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> a() {
        return this.b;
    }

    public final java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.C0197b> b() {
        return this.e;
    }

    public final java.util.List<java.lang.String> c() {
        return this.d;
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.b.c d() {
        return this.c;
    }

    public final java.lang.String e() {
        return this.f;
    }

    public final java.lang.String f() {
        return this.f7138a;
    }
}
