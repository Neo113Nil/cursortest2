package com.amplitude.android.internal;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public final Object a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;
        public static final /* synthetic */ EnumEntries c;

        static {
            a aVar = new a("Clickable", 0);
            a = aVar;
            a[] aVarArr = {aVar};
            b = aVarArr;
            c = EnumEntriesKt.enumEntries(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    public c(View view, String str, String str2, String str3, String str4, String source, String str5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.a = view;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = source;
        this.g = str5;
        this.h = z;
        this.i = z2;
        new WeakReference(view);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d) && Intrinsics.areEqual(this.e, cVar.e) && Intrinsics.areEqual(this.f, cVar.f) && Intrinsics.areEqual(this.g, cVar.g) && this.h == cVar.h && this.i == cVar.i;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int a2 = androidx.compose.runtime.collection.a.a((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f);
        String str5 = this.g;
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((a2 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewTarget(_view=");
        sb.append(this.a);
        sb.append(", className=");
        sb.append(this.b);
        sb.append(", resourceName=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", source=");
        sb.append(this.f);
        sb.append(", hierarchy=");
        sb.append(this.g);
        sb.append(", ampIgnoreRageClick=");
        sb.append(this.h);
        sb.append(", ampIgnoreDeadClick=");
        return androidx.appcompat.view.menu.a.c(sb, this.i, ')');
    }
}
