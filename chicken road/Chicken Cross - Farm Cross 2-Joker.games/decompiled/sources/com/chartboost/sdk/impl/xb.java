package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class xb {

    public static abstract class a extends xb {

        /* renamed from: com.chartboost.sdk.impl.xb$a$a, reason: collision with other inner class name */
        public static final class C0224a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0224a f5076a = new C0224a();

            public C0224a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0224a);
            }

            public int hashCode() {
                return 833515787;
            }

            public String toString() {
                return "AllUnsupported";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f5077a = new b();

            public b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -901980264;
            }

            public String toString() {
                return "AllVpaid";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f5078a = new c();

            public c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1072530378;
            }

            public String toString() {
                return "Empty";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends xb {

        /* renamed from: a, reason: collision with root package name */
        public final List f5079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List mediaFiles) {
            super(null);
            Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
            this.f5079a = mediaFiles;
            if (mediaFiles.isEmpty()) {
                throw new IllegalArgumentException("Selected.mediaFiles must be non-empty");
            }
        }

        public final List a() {
            return this.f5079a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f5079a, ((b) obj).f5079a);
        }

        public int hashCode() {
            return this.f5079a.hashCode();
        }

        public String toString() {
            return "Selected(mediaFiles=" + this.f5079a + ")";
        }
    }

    public /* synthetic */ xb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public xb() {
    }
}
