package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.C0712h;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements Parcelable {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final Object i;
    public final String j;
    public final C0728q k;
    public static final c Companion = new c();

    @JvmField
    public static final Parcelable.Creator<t> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("LOGIN_RECOVERABLE", 0);
            a = aVar;
            a aVar2 = new a("OTHER", 1);
            b = aVar2;
            a aVar3 = new a("TRANSIENT", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
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

    public static final class b implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new t(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i) {
            return new t[i];
        }
    }

    public static final class c {
        @JvmStatic
        public final synchronized C0712h a() {
            com.facebook.internal.n b = com.facebook.internal.p.b(w.b());
            if (b == null) {
                return C0712h.Companion.a();
            }
            return b.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r2.contains(java.lang.Integer.valueOf(r3)) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(int i, int i2, int i3, String str, String str2, String str3, String str4, Object obj, C0728q c0728q, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str3;
        this.f = str4;
        this.i = obj;
        this.j = str2;
        a aVar = a.b;
        if (c0728q != null) {
            this.k = c0728q;
        } else {
            this.k = new y(this, h());
            C0712h a2 = Companion.a();
            Map<Integer, Set<Integer>> map = a2.b;
            Map<Integer, Set<Integer>> map2 = a2.c;
            Map<Integer, Set<Integer>> map3 = a2.a;
            a aVar2 = a.c;
            if (!z) {
                if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set2 = map3.get(Integer.valueOf(i2))) != null && !set2.contains(Integer.valueOf(i3)))) {
                    if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set = map2.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
                        aVar = a.a;
                    } else if (map != null) {
                        if (map.containsKey(Integer.valueOf(i2))) {
                            Set<Integer> set3 = map.get(Integer.valueOf(i2));
                            if (set3 != null) {
                            }
                        }
                    }
                }
            }
            aVar = aVar2;
        }
        Companion.a().getClass();
        int i4 = C0712h.b.$EnumSwitchMapping$0[aVar.ordinal()];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String h() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        C0728q c0728q = this.k;
        if (c0728q != null) {
            return c0728q.getLocalizedMessage();
        }
        return null;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.a + ", errorCode: " + this.b + ", subErrorCode: " + this.c + ", errorType: " + this.d + ", errorMessage: " + h() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.a);
        out.writeInt(this.b);
        out.writeInt(this.c);
        out.writeString(this.d);
        out.writeString(h());
        out.writeString(this.e);
        out.writeString(this.f);
    }

    @VisibleForTesting(otherwise = 4)
    public t(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof C0728q ? (C0728q) exc : new C0728q(exc), false);
    }

    public t(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, false);
    }
}
