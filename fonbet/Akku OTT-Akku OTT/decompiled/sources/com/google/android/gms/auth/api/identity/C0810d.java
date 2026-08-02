package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Deprecated
/* renamed from: com.google.android.gms.auth.api.identity.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0810d extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0810d> CREATOR = new t();
    public final C0107d a;
    public final a b;

    @Nullable
    public final String c;
    public final boolean d;
    public final int e;
    public final c f;
    public final b i;
    public final boolean j;

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.identity.d$a */
    public static final class a extends com.google.android.gms.common.internal.safeparcel.a {

        @NonNull
        public static final Parcelable.Creator<a> CREATOR = new A();
        public final boolean a;

        @Nullable
        public final String b;

        @Nullable
        public final String c;
        public final boolean d;

        @Nullable
        public final String e;

        @Nullable
        public final ArrayList f;
        public final boolean i;

        @Nullable
        public final List j;

        /* renamed from: com.google.android.gms.auth.api.identity.d$a$a, reason: collision with other inner class name */
        public static final class C0106a {
            public boolean a;

            @Nullable
            public String b;

            @Nullable
            public String c;
            public boolean d;

            @NonNull
            public final a a() {
                return new a(this.a, this.b, this.c, this.d, null, null, false, null);
            }
        }

        public a(boolean z, @Nullable String str, @Nullable String str2, boolean z2, @Nullable String str3, @Nullable ArrayList arrayList, boolean z3, @Nullable ArrayList arrayList2) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            C0875q.b(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.a = z;
            if (z) {
                C0875q.h(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            ArrayList arrayList3 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList3 = new ArrayList(arrayList);
                Collections.sort(arrayList3);
            }
            this.f = arrayList3;
            this.e = str3;
            this.i = z3;
            this.j = arrayList2;
        }

        @NonNull
        public static C0106a l() {
            C0106a c0106a = new C0106a();
            c0106a.a = false;
            c0106a.b = null;
            c0106a.c = null;
            c0106a.d = true;
            return c0106a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && C0874p.a(this.b, aVar.b) && C0874p.a(this.c, aVar.c) && this.d == aVar.d && C0874p.a(this.e, aVar.e) && C0874p.a(this.f, aVar.f) && this.i == aVar.i && C0874p.a(this.j, aVar.j);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.i), this.j});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
            parcel.writeInt(this.d ? 1 : 0);
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 5, this.e, false);
            com.google.android.gms.common.internal.safeparcel.c.n(parcel, 6, this.f);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 7, 4);
            parcel.writeInt(this.i ? 1 : 0);
            com.google.android.gms.common.internal.safeparcel.c.p(parcel, 8, this.j, false);
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.identity.d$b */
    public static final class b extends com.google.android.gms.common.internal.safeparcel.a {

        @NonNull
        public static final Parcelable.Creator<b> CREATOR = new B();
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            if (z) {
                C0875q.g(str);
            }
            this.a = z;
            this.b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && C0874p.a(this.b, bVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.identity.d$c */
    public static final class c extends com.google.android.gms.common.internal.safeparcel.a {

        @NonNull
        public static final Parcelable.Creator<c> CREATOR = new C();
        public final boolean a;
        public final byte[] b;
        public final String c;

        public c(String str, byte[] bArr, boolean z) {
            if (z) {
                C0875q.g(bArr);
                C0875q.g(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Arrays.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, this.b, false);
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.identity.d$d, reason: collision with other inner class name */
    public static final class C0107d extends com.google.android.gms.common.internal.safeparcel.a {

        @NonNull
        public static final Parcelable.Creator<C0107d> CREATOR = new D();
        public final boolean a;

        public C0107d(boolean z) {
            this.a = z;
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof C0107d) && this.a == ((C0107d) obj).a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
        }
    }

    public C0810d(C0107d c0107d, a aVar, @Nullable String str, boolean z, int i, @Nullable c cVar, @Nullable b bVar, boolean z2) {
        C0875q.g(c0107d);
        this.a = c0107d;
        C0875q.g(aVar);
        this.b = aVar;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = cVar == null ? new c(null, null, false) : cVar;
        this.i = bVar == null ? new b(false, null) : bVar;
        this.j = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0810d)) {
            return false;
        }
        C0810d c0810d = (C0810d) obj;
        return C0874p.a(this.a, c0810d.a) && C0874p.a(this.b, c0810d.b) && C0874p.a(this.f, c0810d.f) && C0874p.a(this.i, c0810d.i) && C0874p.a(this.c, c0810d.c) && this.d == c0810d.d && this.e == c0810d.e && this.j == c0810d.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.i, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 6, this.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 7, this.i, i, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 8, 4);
        parcel.writeInt(this.j ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
