package com.ironsource;

import com.ironsource.C4524m1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4470j1 {

    /* renamed from: com.ironsource.j1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1327a f8255a = new C1327a(null);

        /* renamed from: com.ironsource.j1$a$a, reason: collision with other inner class name */
        public static final class C1327a {
            public /* synthetic */ C1327a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC4470j1 a(C4524m1.j errorCode, C4524m1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(403, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @JvmStatic
            public final InterfaceC4470j1 b(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(404, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC4470j1 c(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(409, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC4470j1 d(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(401, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC4470j1 e(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(408, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC4470j1 f(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(405, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            private C1327a() {
            }

            @JvmStatic
            public final InterfaceC4470j1 a() {
                return new b(406, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC4470j1 a(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(407, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC4470j1 a(boolean z) {
                if (z) {
                    return new b(410, new ArrayList());
                }
                return new b(411, new ArrayList());
            }
        }

        /* renamed from: com.ironsource.j1$a$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f8256a = new b();
            public static final int b = 401;
            public static final int c = 403;
            public static final int d = 404;
            public static final int e = 405;
            public static final int f = 406;
            public static final int g = 407;
            public static final int h = 408;
            public static final int i = 409;
            public static final int j = 410;
            public static final int k = 411;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC4470j1 a() {
            return f8255a.a();
        }

        @JvmStatic
        public static final InterfaceC4470j1 b(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8255a.b(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 c(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8255a.c(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 d(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8255a.d(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 e(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8255a.e(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 f(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8255a.f(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8255a.a(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(boolean z) {
            return f8255a.a(z);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(C4524m1.j jVar, C4524m1.k kVar) {
            return f8255a.a(jVar, kVar);
        }
    }

    /* renamed from: com.ironsource.j1$b */
    public static final class b implements InterfaceC4470j1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f8257a;
        private final List<InterfaceC4542n1> b;

        public b(int i, List<InterfaceC4542n1> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            this.f8257a = i;
            this.b = arrayList;
        }

        @Override // com.ironsource.InterfaceC4470j1
        public void a(InterfaceC4596q1 analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            analytics.a(this.f8257a, this.b);
        }
    }

    /* renamed from: com.ironsource.j1$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8258a = new a(null);

        /* renamed from: com.ironsource.j1$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC4470j1 a() {
                return new b(201, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC4470j1 b() {
                return new b(206, new ArrayList());
            }

            private a() {
            }

            @JvmStatic
            public final InterfaceC4470j1 a(C4524m1.l ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(207, CollectionsKt.mutableListOf(ext1));
            }

            @JvmStatic
            public final InterfaceC4470j1 a(InterfaceC4542n1 duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(202, CollectionsKt.mutableListOf(duration));
            }

            @JvmStatic
            public final InterfaceC4470j1 a(C4524m1.j errorCode, C4524m1.k errorReason, C4524m1.f duration) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(203, CollectionsKt.mutableListOf(errorCode, errorReason, duration));
            }

            @JvmStatic
            public final InterfaceC4470j1 a(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(204, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        /* renamed from: com.ironsource.j1$c$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f8259a = new b();
            public static final int b = 201;
            public static final int c = 202;
            public static final int d = 203;
            public static final int e = 204;
            public static final int f = 205;
            public static final int g = 206;
            public static final int h = 207;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8258a.a(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 b() {
            return f8258a.b();
        }

        @JvmStatic
        public static final InterfaceC4470j1 a() {
            return f8258a.a();
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(C4524m1.j jVar, C4524m1.k kVar, C4524m1.f fVar) {
            return f8258a.a(jVar, kVar, fVar);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(InterfaceC4542n1 interfaceC4542n1) {
            return f8258a.a(interfaceC4542n1);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(C4524m1.l lVar) {
            return f8258a.a(lVar);
        }
    }

    /* renamed from: com.ironsource.j1$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8260a = new a(null);

        /* renamed from: com.ironsource.j1$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC4470j1 a() {
                return new b(101, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC4470j1 b(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(110, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final b c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            @JvmStatic
            public final InterfaceC4470j1 a(InterfaceC4542n1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(102, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC4470j1 b() {
                return new b(112, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC4470j1 a(C4524m1.f duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(103, CollectionsKt.mutableListOf(duration));
            }

            @JvmStatic
            public final InterfaceC4470j1 a(C4524m1.j errorCode, C4524m1.k errorReason, C4524m1.f duration, C4524m1.l loaderState) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(loaderState, "loaderState");
                return new b(104, CollectionsKt.mutableListOf(errorCode, errorReason, duration, loaderState));
            }

            @JvmStatic
            public final InterfaceC4470j1 a(C4524m1.j errorCode, C4524m1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(109, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @JvmStatic
            public final InterfaceC4470j1 a(InterfaceC4542n1 ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(111, CollectionsKt.mutableListOf(ext1));
            }

            @JvmStatic
            public final InterfaceC4470j1 a(C4524m1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(113, CollectionsKt.mutableListOf(errorReason));
            }
        }

        /* renamed from: com.ironsource.j1$d$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f8261a = new b();
            public static final int b = 101;
            public static final int c = 102;
            public static final int d = 103;
            public static final int e = 104;
            public static final int f = 105;
            public static final int g = 109;
            public static final int h = 110;
            public static final int i = 111;
            public static final int j = 112;
            public static final int k = 113;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC4470j1 a() {
            return f8260a.a();
        }

        @JvmStatic
        public static final InterfaceC4470j1 b() {
            return f8260a.b();
        }

        @JvmStatic
        public static final b c() {
            return f8260a.c();
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8260a.a(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 b(InterfaceC4542n1... interfaceC4542n1Arr) {
            return f8260a.b(interfaceC4542n1Arr);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(C4524m1.j jVar, C4524m1.k kVar) {
            return f8260a.a(jVar, kVar);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(C4524m1.j jVar, C4524m1.k kVar, C4524m1.f fVar, C4524m1.l lVar) {
            return f8260a.a(jVar, kVar, fVar, lVar);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(InterfaceC4542n1 interfaceC4542n1) {
            return f8260a.a(interfaceC4542n1);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(C4524m1.f fVar) {
            return f8260a.a(fVar);
        }

        @JvmStatic
        public static final InterfaceC4470j1 a(C4524m1.k kVar) {
            return f8260a.a(kVar);
        }
    }

    void a(InterfaceC4596q1 interfaceC4596q1);
}
