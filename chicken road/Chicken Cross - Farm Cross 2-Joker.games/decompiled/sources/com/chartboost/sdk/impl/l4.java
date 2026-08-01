package com.chartboost.sdk.impl;

import com.ironsource.B1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l4 {
    public static final a d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final d f4853a;
    public final c b;
    public final b c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l4 a(String str) {
            return new l4(null, null, new b("Clickthrough has failed.", "CB_510", "CB_RENDER_CLICK_IGNORED_BUSY", str, false, 16, null));
        }

        public final l4 b(String cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new l4(null, null, b.f.a(cause, true));
        }

        public final l4 c(String cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new l4(d.c, c.d, b.f.a(cause, true));
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c c = new c("BROWSER", 0, "browser");
        public static final c d = new c("EXTERNAL", 1, B1.e);
        public static final /* synthetic */ c[] e;
        public static final /* synthetic */ EnumEntries f;
        public final String b;

        static {
            c[] a2 = a();
            e = a2;
            f = EnumEntriesKt.enumEntries(a2);
        }

        public c(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{c, d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }

        public final String b() {
            return this.b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d c = new d("CREATIVE", 0, "creative");
        public static final d d = new d("DEEPLINK", 1, "deeplink");
        public static final d e = new d("FALLBACK", 2, "fallback");
        public static final /* synthetic */ d[] f;
        public static final /* synthetic */ EnumEntries g;
        public final String b;

        static {
            d[] a2 = a();
            f = a2;
            g = EnumEntriesKt.enumEntries(a2);
        }

        public d(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{c, d, e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f.clone();
        }

        public final String b() {
            return this.b;
        }
    }

    public l4(d dVar, c cVar, b bVar) {
        this.f4853a = dVar;
        this.b = cVar;
        this.c = bVar;
    }

    public final b a() {
        return this.c;
    }

    public final c b() {
        return this.b;
    }

    public final d c() {
        return this.f4853a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.f4853a == l4Var.f4853a && this.b == l4Var.b && Intrinsics.areEqual(this.c, l4Var.c);
    }

    public int hashCode() {
        d dVar = this.f4853a;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ClickResult(source=" + this.f4853a + ", method=" + this.b + ", error=" + this.c + ")";
    }

    public /* synthetic */ l4(d dVar, c cVar, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, cVar, (i & 4) != 0 ? null : bVar);
    }

    public static final class b {
        public static final a f = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f4854a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ b a(a aVar, String str, boolean z, int i, Object obj) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return aVar.a(str, z);
            }

            public a() {
            }

            public final b a(String cause, boolean z) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new b("Ad rendering has failed. Invalid or unrecognized clickthrough URL.", "CB_502", "CB_RENDER_INVALID_CLICKTHROUGH_URL", cause, z);
            }
        }

        public b(String str, String str2, String str3, String str4, boolean z) {
            this.f4854a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.f4854a;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f4854a, bVar.f4854a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual(this.d, bVar.d) && this.e == bVar.e;
        }

        public int hashCode() {
            String str = this.f4854a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            return "Error(errorString=" + this.f4854a + ", errorCode=" + this.b + ", errorConstant=" + this.c + ", errorCauseDescription=" + this.d + ", isUrlRejection=" + this.e + ")";
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z);
        }
    }
}
