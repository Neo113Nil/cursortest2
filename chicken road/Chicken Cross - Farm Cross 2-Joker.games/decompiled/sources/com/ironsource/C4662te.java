package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.te, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4662te {

    /* renamed from: a, reason: collision with root package name */
    private final String f8680a;
    private final String b;
    private final List<IronSource.a> c;

    public C4662te(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.f8680a = appKey;
        this.b = str;
        this.c = legacyAdFormats;
    }

    public final String a() {
        return this.f8680a;
    }

    public final String b() {
        return this.b;
    }

    public final List<IronSource.a> c() {
        return this.c;
    }

    public final String d() {
        return this.f8680a;
    }

    public final List<IronSource.a> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4662te)) {
            return false;
        }
        C4662te c4662te = (C4662te) obj;
        return Intrinsics.areEqual(this.f8680a, c4662te.f8680a) && Intrinsics.areEqual(this.b, c4662te.b) && Intrinsics.areEqual(this.c, c4662te.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.f8680a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "SdkInitRequest(appKey=" + this.f8680a + ", userId=" + this.b + ", legacyAdFormats=" + this.c + ")";
    }

    public final C4662te a(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C4662te(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4662te a(C4662te c4662te, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4662te.f8680a;
        }
        if ((i & 2) != 0) {
            str2 = c4662te.b;
        }
        if ((i & 4) != 0) {
            list = c4662te.c;
        }
        return c4662te.a(str, str2, list);
    }

    public final void a(List<? extends IronSource.a> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.c.clear();
        this.c.addAll(adFormats);
    }

    public /* synthetic */ C4662te(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}
