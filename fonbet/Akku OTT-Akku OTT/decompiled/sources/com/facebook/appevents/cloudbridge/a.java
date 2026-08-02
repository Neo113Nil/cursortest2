package com.facebook.appevents.cloudbridge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    public static final C0072a Companion;
    public static final a a;
    public static final a b;
    public static final a c;
    public static final /* synthetic */ a[] d;

    /* renamed from: com.facebook.appevents.cloudbridge.a$a, reason: collision with other inner class name */
    public static final class C0072a {
    }

    static {
        a aVar = new a("MOBILE_APP_INSTALL", 0);
        a = aVar;
        a aVar2 = new a("CUSTOM", 1);
        b = aVar2;
        a aVar3 = new a("OTHER", 2);
        c = aVar3;
        d = new a[]{aVar, aVar2, aVar3};
        Companion = new C0072a();
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
