package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0862d;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.location.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0924c extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0924c> CREATOR = new S();

    @NonNull
    public static final Q e = new Q();
    public final List<C0923b> a;

    @Nullable
    public final String b;
    public final List<C0862d> c;

    @Nullable
    public final String d;

    public C0924c(@NonNull ArrayList arrayList, @Nullable String str, @Nullable ArrayList arrayList2, @Nullable String str2) {
        C0875q.h(arrayList, "transitions can't be null");
        C0875q.b(arrayList.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0923b c0923b = (C0923b) it.next();
            C0875q.b(treeSet.add(c0923b), "Found duplicated transition: " + c0923b + ".");
        }
        this.a = Collections.unmodifiableList(arrayList);
        this.b = str;
        this.c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.d = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0924c.class == obj.getClass()) {
            C0924c c0924c = (C0924c) obj;
            if (C0874p.a(this.a, c0924c.a) && C0874p.a(this.b, c0924c.b) && C0874p.a(this.d, c0924c.d) && C0874p.a(this.c, c0924c.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<C0862d> list = this.c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        int length = valueOf.length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int length3 = valueOf2.length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        androidx.collection.e.d(sb, "ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str);
        androidx.collection.e.d(sb, "', mClients=", valueOf2, ", mAttributionTag=", str2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        C0875q.g(parcel);
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
