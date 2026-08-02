package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.EnumC0718l;
import com.facebook.internal.C0713i;
import com.facebook.internal.F;
import com.facebook.internal.w;
import com.facebook.login.u;
import java.util.HashSet;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends C {
    public final String d;
    public final EnumC0718l e;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<r> CREATOR = new a();

    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new r(source);
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i) {
            return new r[i];
        }
    }

    public static final class b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.d = "instagram_login";
        this.e = EnumC0718l.INSTAGRAM_APPLICATION_WEB;
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
        Object obj;
        String str;
        Intent intent;
        String str2;
        ResolveInfo resolveActivity;
        Intrinsics.checkNotNullParameter(request, "request");
        u.Companion.getClass();
        String e2e = u.b.a();
        Context context = n().o();
        if (context == null) {
            context = com.facebook.w.a();
        }
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
        String str3 = request.n;
        boolean z = request.o;
        boolean z2 = request.q;
        boolean z3 = request.r;
        com.facebook.internal.w wVar = com.facebook.internal.w.a;
        Intent intent2 = null;
        if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.internal.w.class)) {
            str2 = "e2e";
            intent = null;
        } else {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                Intrinsics.checkNotNullParameter(e2e, "e2e");
                Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
                Intrinsics.checkNotNullParameter(clientState, "clientState");
                Intrinsics.checkNotNullParameter(authType, "authType");
                str = "e2e";
                try {
                    Intent d = com.facebook.internal.w.d(com.facebook.internal.w.a, new w.b(), applicationId, permissions, e2e, h, defaultAudience, clientState, authType, false, str3, z, A.INSTAGRAM, z2, z3, "", null, null, false, null, 3670016);
                    if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.internal.w.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (d != null && (resolveActivity = context.getPackageManager().resolveActivity(d, 0)) != null) {
                                String str4 = resolveActivity.activityInfo.packageName;
                                Intrinsics.checkNotNullExpressionValue(str4, "resolveInfo.activityInfo.packageName");
                                if (C0713i.a(context, str4)) {
                                    intent2 = d;
                                }
                            }
                        } catch (Throwable th) {
                            obj = com.facebook.internal.w.class;
                            try {
                                com.facebook.internal.instrument.crashshield.a.a(th, obj);
                            } catch (Throwable th2) {
                                th = th2;
                                com.facebook.internal.instrument.crashshield.a.a(th, obj);
                                intent = intent2;
                                str2 = str;
                                h(str2, e2e);
                                u.Companion.getClass();
                                com.facebook.w wVar2 = com.facebook.w.a;
                                F.f();
                                return z(intent) ? 1 : 0;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = com.facebook.internal.w.class;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = com.facebook.internal.w.class;
                str = "e2e";
            }
            intent = intent2;
            str2 = str;
        }
        h(str2, e2e);
        u.Companion.getClass();
        com.facebook.w wVar22 = com.facebook.w.a;
        F.f();
        return z(intent) ? 1 : 0;
    }

    @Override // com.facebook.login.C
    public final EnumC0718l w() {
        return this.e;
    }

    @Override // com.facebook.login.z, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.d = "instagram_login";
        this.e = EnumC0718l.INSTAGRAM_APPLICATION_WEB;
    }
}
