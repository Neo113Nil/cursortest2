package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7487a = 0;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c {
        public static final int c = 8;
        public final java.io.File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.io.File file) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            this.b = file;
        }

        public final java.io.File a() {
            return this.b;
        }

        public final java.io.File b() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public java.lang.String toString() {
            return "Complete(file=" + this.b + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a a(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a(file);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.a aVar, java.io.File file, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                file = aVar.b;
            }
            return aVar.a(file);
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c {
        public static final int c = 0;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a failure) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "failure");
            this.b = failure;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a a() {
            return this.b;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a b() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public java.lang.String toString() {
            return "Failure(failure=" + this.b + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a failure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "failure");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b(failure);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.AbstractC0234a abstractC0234a, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC0234a = bVar.b;
            }
            return bVar.a(abstractC0234a);
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c$c, reason: collision with other inner class name */
    public static final class C0237c extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c {
        public static final int d = 8;
        public final java.io.File b;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0237c(java.io.File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d progress) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
            this.b = file;
            this.c = progress;
        }

        public final java.io.File a() {
            return this.b;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d b() {
            return this.c;
        }

        public final java.io.File c() {
            return this.b;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d d() {
            return this.c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c c0237c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0237c.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c0237c.c);
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public java.lang.String toString() {
            return "InProgress(file=" + this.b + ", progress=" + this.c + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c a(java.io.File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d progress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c(file, progress);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.C0237c c0237c, java.io.File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d dVar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                file = c0237c.b;
            }
            if ((i & 2) != 0) {
                dVar = c0237c.c;
            }
            return c0237c.a(file, dVar);
        }
    }

    public static final class d {
        public static final int c = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long f7488a;
        public final long b;

        public d(long j, long j2) {
            this.f7488a = j;
            this.b = j2;
        }

        public final long a() {
            return this.f7488a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.f7488a;
        }

        public final long d() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d) obj;
            return this.f7488a == dVar.f7488a && this.b == dVar.b;
        }

        public int hashCode() {
            return (kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7488a) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b);
        }

        public java.lang.String toString() {
            return "Progress(bytesDownloaded=" + this.f7488a + ", totalBytes=" + this.b + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d a(long j, long j2) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d(j, j2);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c.d dVar, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = dVar.f7488a;
            }
            if ((i & 2) != 0) {
                j2 = dVar.b;
            }
            return dVar.a(j, j2);
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public c() {
    }
}
