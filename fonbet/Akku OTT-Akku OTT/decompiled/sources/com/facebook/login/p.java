package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.C0688a;
import com.facebook.C0724m;
import com.facebook.C0728q;
import com.facebook.login.u;
import com.facebook.login.v;
import com.facebook.login.z;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p extends z {
    public n c;
    public final String d;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<p> CREATOR = new a();

    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new p(source);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i) {
            return new p[i];
        }
    }

    public static final class b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.d = "get_token";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final void l() {
        n nVar = this.c;
        if (nVar != null) {
            nVar.d = false;
            nVar.c = null;
            this.c = null;
        }
    }

    @Override // com.facebook.login.z
    public final String o() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #1 {, blocks: (B:7:0x0030, B:25:0x0039, B:31:0x0060, B:35:0x006a, B:42:0x0057, B:39:0x0047), top: B:6:0x0030, inners: #0 }] */
    @Override // com.facebook.login.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int u(u.c request) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(request, "request");
        Context context = n().o();
        if (context == null) {
            context = com.facebook.w.a();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        n nVar = new n(context, request.d, String.valueOf(request.e), request.u);
        this.c = nVar;
        synchronized (nVar) {
            if (!nVar.d) {
                int i2 = nVar.l;
                com.facebook.internal.w wVar = com.facebook.internal.w.a;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.internal.w.class)) {
                    try {
                        i = com.facebook.internal.w.a.h(com.facebook.internal.w.b, new int[]{i2}).a;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.internal.w.class);
                    }
                    if (i == -1) {
                        Intent e = com.facebook.internal.w.e(nVar.a);
                        if (e == null) {
                            z = false;
                        } else {
                            nVar.d = true;
                            nVar.a.bindService(e, nVar, 1);
                            z = true;
                        }
                    }
                }
                i = 0;
                if (i == -1) {
                }
            }
            z = false;
        }
        if (!z) {
            return 0;
        }
        v.b bVar = n().e;
        if (bVar != null) {
            View view = v.this.e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                view = null;
            }
            view.setVisibility(0);
        }
        o oVar = new o(this, request);
        n nVar2 = this.c;
        if (nVar2 != null) {
            nVar2.c = oVar;
        }
        return 1;
    }

    public final void v(Bundle bundle, u.c request) {
        u.d c;
        C0688a a2;
        String str;
        String string;
        C0724m c0724m;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(bundle, "result");
        try {
            z.a aVar = z.Companion;
            String str2 = request.d;
            aVar.getClass();
            a2 = z.a.a(bundle, str2);
            str = request.u;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (C0728q e) {
            c = u.d.c.c(u.d.Companion, n().i, null, e.getMessage());
        }
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                c0724m = new C0724m(string, str);
                u.d.Companion.getClass();
                c = new u.d(request, u.d.a.SUCCESS, a2, c0724m, null, null);
                n().n(c);
            } catch (Exception e2) {
                throw new C0728q(e2.getMessage());
            }
        }
        c0724m = null;
        u.d.Companion.getClass();
        c = new u.d(request, u.d.a.SUCCESS, a2, c0724m, null, null);
        n().n(c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.d = "get_token";
    }
}
