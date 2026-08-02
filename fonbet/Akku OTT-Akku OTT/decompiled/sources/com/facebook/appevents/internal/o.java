package com.facebook.appevents.internal;

/* loaded from: classes3.dex */
public final class o {
    public static final a Companion = new a();
    public final String a;
    public final boolean b;

    public static final class a {
    }

    public o(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.b ? "Applink" : "Unclassified";
        String str2 = this.a;
        if (str2 == null) {
            return str;
        }
        return str + '(' + str2 + ')';
    }
}
