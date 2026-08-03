package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.a f7518a;
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p("Portrait", 0);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p("Landscape", 1);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p("None", 2);
    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p[] e;
    public static final /* synthetic */ kotlin.enums.EnumEntries f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p a(java.lang.String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3387192) {
                    if (hashCode != 729267099) {
                        if (hashCode == 1430647483 && str.equals("landscape")) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.c;
                        }
                    } else if (str.equals("portrait")) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.b;
                    }
                } else if (str.equals("none")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.d;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p[] a2 = a();
        e = a2;
        f = kotlin.enums.EnumEntriesKt.enumEntries(a2);
        f7518a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.a(null);
    }

    public p(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p[] a() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p[]{b, c, d};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p> b() {
        return f;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p valueOf(java.lang.String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.class, str);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p[] values() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p[]) e.clone();
    }
}
