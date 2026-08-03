package com.ironsource;

/* loaded from: classes5.dex */
public final class Pe {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5926a;
    private final java.util.List<java.lang.String> b;
    private final boolean c;

    public Pe(java.lang.String str, java.util.List<java.lang.String> list, boolean z) {
        this.f5926a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean a() {
        if (this.c) {
            java.util.List<java.lang.String> list = this.b;
            if (list != null && !list.isEmpty()) {
                for (java.lang.String str : list) {
                    java.lang.String str2 = this.f5926a;
                    if (str2 != null && kotlin.text.StringsKt.startsWith$default(str2, str, false, 2, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
        } else {
            java.util.List<java.lang.String> list2 = this.b;
            if (list2 != null && !list2.isEmpty()) {
                for (java.lang.String str3 : list2) {
                    java.lang.String str4 = this.f5926a;
                    if (str4 != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) str3, false, 2, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final java.lang.String b() {
        return this.f5926a;
    }

    public /* synthetic */ Pe(java.lang.String str, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z);
    }
}
