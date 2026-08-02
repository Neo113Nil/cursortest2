package Si;

import B0.C2454a;
import Hi.k;
import Kk.C3532b;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Si.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC4010a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f26240a = b.f26246a;

    /* renamed from: Si.a$a, reason: collision with other inner class name */
    public static final class C0522a implements InterfaceC4010a {

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private static final LinkedHashSet f26241f;

        /* renamed from: b, reason: collision with root package name */
        private final long f26242b;

        /* renamed from: c, reason: collision with root package name */
        private int f26243c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26244d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26245e;

        static {
            InterfaceC4010a.f26240a.getClass();
            Set a11 = b.a();
            Integer[] elements = {6, 7};
            Intrinsics.checkNotNullParameter(elements, "elements");
            f26241f = e0.f(a11, C7705l.j0(elements));
        }

        public C0522a(int i11, boolean z11, long j11, boolean z12) {
            this.f26242b = j11;
            this.f26243c = i11;
            this.f26244d = z11;
            this.f26245e = z12;
        }

        @Override // Si.InterfaceC4010a
        @NotNull
        public final LinkedHashSet b(@NotNull InterfaceC4010a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            LinkedHashSet a11 = c.a(this, other);
            if (!(other instanceof C0522a)) {
                return a11;
            }
            LinkedHashSet X02 = C7714v.X0(a11);
            C0522a c0522a = (C0522a) other;
            if (this.f26244d != c0522a.f26244d) {
                X02.add(6);
            }
            if (this.f26245e != c0522a.f26245e) {
                X02.add(7);
            }
            return X02;
        }

        public final boolean e() {
            return this.f26244d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0522a)) {
                return false;
            }
            C0522a c0522a = (C0522a) obj;
            return this.f26242b == c0522a.f26242b && this.f26243c == c0522a.f26243c && this.f26244d == c0522a.f26244d && this.f26245e == c0522a.f26245e;
        }

        public final boolean f() {
            return this.f26245e;
        }

        @Override // Si.InterfaceC4010a
        public final long getId() {
            return this.f26242b;
        }

        @Override // Si.InterfaceC4010a
        public final int getPosition() {
            return this.f26243c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f26245e) + C3532b.a(C2454a.a(this.f26243c, Long.hashCode(this.f26242b) * 31, 31), 31, this.f26244d);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CameraPreview(id=");
            sb2.append(this.f26242b);
            sb2.append(", position=");
            sb2.append(this.f26243c);
            sb2.append(", isEnabled=");
            sb2.append(this.f26244d);
            sb2.append(", isFullSpan=");
            return Pk0.a.a(")", sb2, this.f26245e);
        }
    }

    /* renamed from: Si.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f26246a = new b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Set<Integer> f26247b = e0.h(5);

        @NotNull
        public static Set a() {
            return f26247b;
        }
    }

    /* renamed from: Si.a$c */
    public static final class c {
        @NotNull
        public static LinkedHashSet a(@NotNull InterfaceC4010a interfaceC4010a, @NotNull InterfaceC4010a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (interfaceC4010a.getPosition() != other.getPosition()) {
                linkedHashSet.add(5);
            }
            return linkedHashSet;
        }
    }

    /* renamed from: Si.a$d */
    public static final class d implements InterfaceC4010a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private static final LinkedHashSet f26248d;

        /* renamed from: b, reason: collision with root package name */
        private final long f26249b;

        /* renamed from: c, reason: collision with root package name */
        private int f26250c;

        static {
            InterfaceC4010a.f26240a.getClass();
            f26248d = e0.f(b.a(), e0.h(9));
        }

        public d(long j11, int i11) {
            this.f26249b = j11;
            this.f26250c = i11;
        }

        @Override // Si.InterfaceC4010a
        @NotNull
        public final LinkedHashSet b(@NotNull InterfaceC4010a interfaceC4010a) {
            return c.a(this, interfaceC4010a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f26249b == dVar.f26249b && this.f26250c == dVar.f26250c;
        }

        @Override // Si.InterfaceC4010a
        public final long getId() {
            return this.f26249b;
        }

        @Override // Si.InterfaceC4010a
        public final int getPosition() {
            return this.f26250c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f26250c) + (Long.hashCode(this.f26249b) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EmptyState(id=");
            sb2.append(this.f26249b);
            sb2.append(", position=");
            return K00.b.e(this.f26250c, ")", sb2);
        }
    }

    /* renamed from: Si.a$e */
    public interface e extends InterfaceC4010a {

        /* renamed from: Si.a$e$a, reason: collision with other inner class name */
        public static final class C0523a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private static final LinkedHashSet f26251a;

            static {
                InterfaceC4010a.f26240a.getClass();
                Set a11 = b.a();
                Integer[] elements = {2, 1, 4, 3};
                Intrinsics.checkNotNullParameter(elements, "elements");
                f26251a = e0.f(a11, C7705l.j0(elements));
            }
        }

        /* renamed from: Si.a$e$b */
        public static final class b {
            @NotNull
            public static LinkedHashSet a(@NotNull e eVar, @NotNull InterfaceC4010a other) {
                Intrinsics.checkNotNullParameter(other, "other");
                LinkedHashSet a11 = c.a(eVar, other);
                if (!(other instanceof e)) {
                    return a11;
                }
                LinkedHashSet X02 = C7714v.X0(a11);
                e eVar2 = (e) other;
                if (eVar.c() != eVar2.c()) {
                    X02.add(1);
                }
                if (eVar.v() != eVar2.v()) {
                    X02.add(4);
                }
                if (!Intrinsics.d(eVar.getUri(), eVar2.getUri())) {
                    X02.add(2);
                }
                return X02;
            }
        }

        /* renamed from: Si.a$e$c */
        public static final class c implements e {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final k.a f26252b;

            /* renamed from: c, reason: collision with root package name */
            private int f26253c;

            public c(@NotNull k.a ozMedia, int i11) {
                Intrinsics.checkNotNullParameter(ozMedia, "ozMedia");
                this.f26252b = ozMedia;
                this.f26253c = i11;
            }

            public static c e(c cVar, int i11) {
                k.a ozMedia = cVar.f26252b;
                Intrinsics.checkNotNullParameter(ozMedia, "ozMedia");
                return new c(ozMedia, i11);
            }

            @Override // Si.InterfaceC4010a.e
            @NotNull
            public final LinkedHashSet a() {
                return C0523a.f26251a;
            }

            @Override // Si.InterfaceC4010a
            @NotNull
            public final LinkedHashSet b(@NotNull InterfaceC4010a interfaceC4010a) {
                return b.a(this, interfaceC4010a);
            }

            @Override // Si.InterfaceC4010a.e
            public final int c() {
                return this.f26253c;
            }

            @Override // Si.InterfaceC4010a.e
            public final Hi.k d() {
                return this.f26252b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.d(this.f26252b, cVar.f26252b) && this.f26253c == cVar.f26253c;
            }

            @Override // Si.InterfaceC4010a
            public final long getId() {
                return ((k.a) d()).getId();
            }

            @Override // Si.InterfaceC4010a
            public final int getPosition() {
                return this.f26252b.a();
            }

            @Override // Si.InterfaceC4010a.e
            @NotNull
            public final Uri getUri() {
                return ((k.a) d()).getUri();
            }

            public final int hashCode() {
                return Integer.hashCode(this.f26253c) + (this.f26252b.hashCode() * 31);
            }

            @Override // Si.InterfaceC4010a.e
            public final boolean isSelected() {
                return c() >= 0;
            }

            @NotNull
            public final String toString() {
                return "Image(ozMedia=" + this.f26252b + ", selectionIndex=" + this.f26253c + ")";
            }

            @Override // Si.InterfaceC4010a.e
            public final boolean v() {
                return ((k.a) d()).v();
            }
        }

        /* renamed from: Si.a$e$d */
        public static final class d implements e {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final k.b f26254b;

            /* renamed from: c, reason: collision with root package name */
            private int f26255c;

            public d(@NotNull k.b ozMedia, int i11) {
                Intrinsics.checkNotNullParameter(ozMedia, "ozMedia");
                this.f26254b = ozMedia;
                this.f26255c = i11;
            }

            public static d e(d dVar, int i11) {
                k.b ozMedia = dVar.f26254b;
                Intrinsics.checkNotNullParameter(ozMedia, "ozMedia");
                return new d(ozMedia, i11);
            }

            @Override // Si.InterfaceC4010a.e
            @NotNull
            public final LinkedHashSet a() {
                return C0523a.f26251a;
            }

            @Override // Si.InterfaceC4010a
            @NotNull
            public final LinkedHashSet b(@NotNull InterfaceC4010a other) {
                Intrinsics.checkNotNullParameter(other, "other");
                LinkedHashSet a11 = b.a(this, other);
                if (!(other instanceof d)) {
                    return a11;
                }
                LinkedHashSet X02 = C7714v.X0(a11);
                if (this.f26254b.getDuration() != ((d) other).f26254b.getDuration()) {
                    X02.add(3);
                }
                return X02;
            }

            @Override // Si.InterfaceC4010a.e
            public final int c() {
                return this.f26255c;
            }

            @Override // Si.InterfaceC4010a.e
            public final Hi.k d() {
                return this.f26254b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.d(this.f26254b, dVar.f26254b) && this.f26255c == dVar.f26255c;
            }

            public final long f() {
                return this.f26254b.getDuration();
            }

            @Override // Si.InterfaceC4010a
            public final long getId() {
                return ((k.b) d()).getId();
            }

            @Override // Si.InterfaceC4010a
            public final int getPosition() {
                return this.f26254b.a();
            }

            @Override // Si.InterfaceC4010a.e
            @NotNull
            public final Uri getUri() {
                return ((k.b) d()).getUri();
            }

            public final int hashCode() {
                return Integer.hashCode(this.f26255c) + (this.f26254b.hashCode() * 31);
            }

            @Override // Si.InterfaceC4010a.e
            public final boolean isSelected() {
                return c() >= 0;
            }

            @NotNull
            public final String toString() {
                return "Video(ozMedia=" + this.f26254b + ", selectionIndex=" + this.f26255c + ")";
            }

            @Override // Si.InterfaceC4010a.e
            public final boolean v() {
                return ((k.b) d()).v();
            }
        }

        @NotNull
        LinkedHashSet a();

        int c();

        @NotNull
        Hi.k d();

        @NotNull
        Uri getUri();

        boolean isSelected();

        boolean v();
    }

    /* renamed from: Si.a$f */
    public static final class f implements InterfaceC4010a {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private static final LinkedHashSet f26256e;

        /* renamed from: b, reason: collision with root package name */
        private final long f26257b;

        /* renamed from: c, reason: collision with root package name */
        private int f26258c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26259d;

        static {
            InterfaceC4010a.f26240a.getClass();
            f26256e = e0.f(b.a(), e0.h(8));
        }

        public f(long j11, int i11, int i12) {
            this.f26257b = j11;
            this.f26258c = i11;
            this.f26259d = i12;
        }

        @Override // Si.InterfaceC4010a
        @NotNull
        public final LinkedHashSet b(@NotNull InterfaceC4010a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            LinkedHashSet a11 = c.a(this, other);
            if (!(other instanceof f)) {
                return a11;
            }
            LinkedHashSet X02 = C7714v.X0(a11);
            if (this.f26259d != ((f) other).f26259d) {
                X02.add(8);
            }
            return X02;
        }

        public final int e() {
            return this.f26259d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f26257b == fVar.f26257b && this.f26258c == fVar.f26258c && this.f26259d == fVar.f26259d;
        }

        @Override // Si.InterfaceC4010a
        public final long getId() {
            return this.f26257b;
        }

        @Override // Si.InterfaceC4010a
        public final int getPosition() {
            return this.f26258c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f26259d) + C2454a.a(this.f26258c, Long.hashCode(this.f26257b) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PermissionsWarning(id=");
            sb2.append(this.f26257b);
            sb2.append(", position=");
            sb2.append(this.f26258c);
            sb2.append(", message=");
            return K00.b.e(this.f26259d, ")", sb2);
        }
    }

    @NotNull
    LinkedHashSet b(@NotNull InterfaceC4010a interfaceC4010a);

    long getId();

    int getPosition();
}
