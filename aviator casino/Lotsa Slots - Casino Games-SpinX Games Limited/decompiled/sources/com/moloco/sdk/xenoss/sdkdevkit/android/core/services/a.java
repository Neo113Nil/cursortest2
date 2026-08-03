package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0325a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7985a = 0;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$a, reason: collision with other inner class name */
        public static final class C0326a extends com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a {
            public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.C0326a b = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.C0326a();
            public static final int c = 0;

            public C0326a() {
                super(null);
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$b */
        public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a {
            public static final int c = 0;
            public final long b;

            public b(long j) {
                super(null);
                this.b = j;
            }

            public final long a() {
                return this.b;
            }

            public final long b() {
                return this.b;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.b) && this.b == ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.b) obj).b;
            }

            public int hashCode() {
                return kotlin.UByte$$ExternalSyntheticBackport0.m(this.b);
            }

            public java.lang.String toString() {
                return "AppForeground(lastBgTimestamp=" + this.b + ')';
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.b a(long j) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.b(j);
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.b a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.b bVar, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = bVar.b;
                }
                return bVar.a(j);
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c */
        public static final class c {
            public static final int d = 0;

            /* renamed from: a, reason: collision with root package name */
            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a f7986a;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f b;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c$a, reason: collision with other inner class name */
            public static final class EnumC0327a {

                /* renamed from: a, reason: collision with root package name */
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a f7987a = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a("NONE", 0);
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a b = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a("CLOSE", 1);
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a c = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a("SKIP", 2);
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a d = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a("SKIP_DEC", 3);
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a e = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a("MUTE", 4);
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a f = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a("UNMUTE", 5);
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a g = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a(com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.CTA, 6);
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a h = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a("REPLAY", 7);
                public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a i = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a("AD_BADGE", 8);
                public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a[] j;
                public static final /* synthetic */ kotlin.enums.EnumEntries k;

                static {
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a[] a2 = a();
                    j = a2;
                    k = kotlin.enums.EnumEntriesKt.enumEntries(a2);
                }

                public EnumC0327a(java.lang.String str, int i2) {
                }

                public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a[] a() {
                    return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a[]{f7987a, b, c, d, e, f, g, h, i};
                }

                public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a> b() {
                    return k;
                }

                public static com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a valueOf(java.lang.String str) {
                    return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.class, str);
                }

                public static com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a[] values() {
                    return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a[]) j.clone();
                }
            }

            public c(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f position, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g size) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
                this.f7986a = buttonType;
                this.b = position;
                this.c = size;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a a() {
                return this.f7986a;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f b() {
                return this.b;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g c() {
                return this.c;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a d() {
                return this.f7986a;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f e() {
                return this.b;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c)) {
                    return false;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c) obj;
                return this.f7986a == cVar.f7986a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, cVar.c);
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g f() {
                return this.c;
            }

            public int hashCode() {
                return (((this.f7986a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
            }

            public java.lang.String toString() {
                return "Button(buttonType=" + this.f7986a + ", position=" + this.b + ", size=" + this.c + ')';
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f position, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g size) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
                return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c(buttonType, position, size);
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a enumC0327a, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g gVar, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    enumC0327a = cVar.f7986a;
                }
                if ((i & 2) != 0) {
                    fVar = cVar.b;
                }
                if ((i & 4) != 0) {
                    gVar = cVar.c;
                }
                return cVar.a(enumC0327a, fVar, gVar);
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$e */
        public static final class e extends com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a {
            public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.e b = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.e();
            public static final int c = 0;

            public e() {
                super(null);
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$f */
        public static final class f {
            public static final int c = 0;

            /* renamed from: a, reason: collision with root package name */
            public final float f7988a;
            public final float b;

            public f(float f, float f2) {
                this.f7988a = f;
                this.b = f2;
            }

            public final float a() {
                return this.f7988a;
            }

            public final float b() {
                return this.b;
            }

            public final float c() {
                return this.f7988a;
            }

            public final float d() {
                return this.b;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f)) {
                    return false;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f) obj;
                return java.lang.Float.compare(this.f7988a, fVar.f7988a) == 0 && java.lang.Float.compare(this.b, fVar.b) == 0;
            }

            public int hashCode() {
                return (java.lang.Float.floatToIntBits(this.f7988a) * 31) + java.lang.Float.floatToIntBits(this.b);
            }

            public java.lang.String toString() {
                return "Position(topLeftXDp=" + this.f7988a + ", topLeftYDp=" + this.b + ')';
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f a(float f, float f2) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f(f, f2);
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar, float f, float f2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    f = fVar.f7988a;
                }
                if ((i & 2) != 0) {
                    f2 = fVar.b;
                }
                return fVar.a(f, f2);
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$g */
        public static final class g {
            public static final int c = 0;

            /* renamed from: a, reason: collision with root package name */
            public final float f7989a;
            public final float b;

            public g(float f, float f2) {
                this.f7989a = f;
                this.b = f2;
            }

            public final float a() {
                return this.f7989a;
            }

            public final float b() {
                return this.b;
            }

            public final float c() {
                return this.b;
            }

            public final float d() {
                return this.f7989a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g)) {
                    return false;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g) obj;
                return java.lang.Float.compare(this.f7989a, gVar.f7989a) == 0 && java.lang.Float.compare(this.b, gVar.b) == 0;
            }

            public int hashCode() {
                return (java.lang.Float.floatToIntBits(this.f7989a) * 31) + java.lang.Float.floatToIntBits(this.b);
            }

            public java.lang.String toString() {
                return "Size(widthDp=" + this.f7989a + ", heightDp=" + this.b + ')';
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g a(float f, float f2) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g(f, f2);
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g gVar, float f, float f2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    f = gVar.f7989a;
                }
                if ((i & 2) != 0) {
                    f2 = gVar.b;
                }
                return gVar.a(f, f2);
            }
        }

        public /* synthetic */ AbstractC0325a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$d */
        public static final class d extends com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a {
            public static final int f = 8;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f b;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f c;
            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g d;
            public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> e;

            public /* synthetic */ d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g gVar, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(fVar, (i & 2) != 0 ? null : fVar2, (i & 4) != 0 ? null : gVar, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
            }

            public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> a() {
                return this.e;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f b() {
                return this.b;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f c() {
                return this.c;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g d() {
                return this.d;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f clickPosition, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g gVar, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> buttonLayout) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonLayout, "buttonLayout");
                this.b = clickPosition;
                this.c = fVar;
                this.d = gVar;
                this.e = buttonLayout;
            }
        }

        public AbstractC0325a() {
        }
    }

    java.lang.Object a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a abstractC0325a, java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}
