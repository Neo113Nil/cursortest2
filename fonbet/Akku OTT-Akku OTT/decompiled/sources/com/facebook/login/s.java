package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.C0709e;
import com.facebook.internal.F;
import com.facebook.internal.w;
import com.facebook.login.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@VisibleForTesting(otherwise = 3)
/* loaded from: classes3.dex */
public final class s extends C {
    public final String d;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<s> CREATOR = new a();

    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new s(source);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i) {
            return new s[i];
        }
    }

    public static final class b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.d = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String o() {
        return this.d;
    }

    @Override // com.facebook.login.z
    public final int u(u.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        boolean z = com.facebook.w.o && C0709e.a() != null && request.a.e;
        u.Companion.getClass();
        String e2e = u.b.a();
        n().o();
        String applicationId = request.d;
        HashSet permissions = request.b;
        boolean h = request.h();
        EnumC0722d enumC0722d = request.c;
        if (enumC0722d == null) {
            enumC0722d = EnumC0722d.NONE;
        }
        EnumC0722d defaultAudience = enumC0722d;
        String clientState = m(request.i);
        String authType = request.l;
        String str = request.n;
        boolean z2 = request.o;
        boolean z3 = request.q;
        boolean z4 = request.r;
        String str2 = request.u;
        EnumC0719a enumC0719a = request.x;
        if (enumC0719a != null) {
            enumC0719a.name();
        }
        String str3 = request.e;
        String str4 = request.f;
        boolean z5 = request.s;
        String str5 = request.t;
        com.facebook.internal.w wVar = com.facebook.internal.w.a;
        boolean z6 = z2;
        ArrayList<Intent> arrayList = null;
        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.internal.w.class)) {
            try {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                Intrinsics.checkNotNullParameter(e2e, "e2e");
                Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
                Intrinsics.checkNotNullParameter(clientState, "clientState");
                Intrinsics.checkNotNullParameter(authType, "authType");
                ArrayList arrayList2 = com.facebook.internal.w.b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    boolean z7 = z3;
                    boolean z8 = z4;
                    boolean z9 = z6;
                    String str6 = str2;
                    String str7 = str3;
                    Intent d = com.facebook.internal.w.d(com.facebook.internal.w.a, (w.e) it.next(), applicationId, permissions, e2e, h, defaultAudience, clientState, authType, z, str, z9, A.FACEBOOK, z7, z8, str6, str7, str4, z5, str5, 1048576);
                    if (d != null) {
                        arrayList3.add(d);
                    }
                    z6 = z9;
                    z3 = z7;
                    z4 = z8;
                    str2 = str6;
                    str3 = str7;
                }
                arrayList = arrayList3;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.internal.w.class);
            }
        }
        h("e2e", e2e);
        int i = 0;
        for (Intent intent : arrayList) {
            i++;
            u.Companion.getClass();
            com.facebook.w wVar2 = com.facebook.w.a;
            F.f();
            if (z(intent)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.d = "katana_proxy_auth";
    }
}
