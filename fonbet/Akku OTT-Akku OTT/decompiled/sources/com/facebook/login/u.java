package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C0340y;
import com.facebook.C0688a;
import com.facebook.C0724m;
import com.facebook.C0728q;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.F;
import com.facebook.login.v;
import com.facebook.login.x;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.haryanvi.netstream.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nLoginClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginClient.kt\ncom/facebook/login/LoginClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,725:1\n37#2,2:726\n37#2,2:742\n26#3:728\n11653#4,9:729\n13579#4:738\n13580#4:740\n11662#4:741\n1#5:739\n*S KotlinDebug\n*F\n+ 1 LoginClient.kt\ncom/facebook/login/LoginClient\n*L\n167#1:726,2\n678#1:742,2\n671#1:728\n673#1:729,9\n673#1:738\n673#1:740\n673#1:741\n673#1:739\n*E\n"})
/* loaded from: classes3.dex */
public final class u implements Parcelable {
    public z[] a;
    public int b;
    public v c;
    public C0340y d;
    public v.b e;
    public boolean f;
    public c i;
    public Map<String, String> j;
    public Map<String, String> k;
    public x l;
    public int m;
    public int n;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<u> CREATOR = new a();

    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(source, "source");
            u uVar = new u();
            uVar.b = -1;
            Parcelable[] readParcelableArray = source.readParcelableArray(z.class.getClassLoader());
            if (readParcelableArray == null) {
                readParcelableArray = new Parcelable[0];
            }
            ArrayList arrayList = new ArrayList();
            int length = readParcelableArray.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Parcelable parcelable = readParcelableArray[i];
                z zVar = parcelable instanceof z ? (z) parcelable : null;
                if (zVar != null) {
                    Intrinsics.checkNotNullParameter(uVar, "<set-?>");
                    zVar.b = uVar;
                }
                if (zVar != null) {
                    arrayList.add(zVar);
                }
                i++;
            }
            uVar.a = (z[]) arrayList.toArray(new z[0]);
            uVar.b = source.readInt();
            uVar.i = (c) source.readParcelable(c.class.getClassLoader());
            HashMap G = com.facebook.internal.E.G(source);
            uVar.j = G != null ? MapsKt.toMutableMap(G) : null;
            HashMap G2 = com.facebook.internal.E.G(source);
            uVar.k = G2 != null ? MapsKt.toMutableMap(G2) : null;
            return uVar;
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i) {
            return new u[i];
        }
    }

    public static final class b {
        @JvmStatic
        public static String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
                com.facebook.internal.E e = com.facebook.internal.E.a;
                com.facebook.w wVar = com.facebook.w.a;
            }
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }
    }

    @SourceDebugExtension({"SMAP\nLoginClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginClient.kt\ncom/facebook/login/LoginClient$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,725:1\n1#2:726\n*E\n"})
    public static final class c implements Parcelable {
        public final t a;
        public HashSet b;
        public final EnumC0722d c;
        public final String d;
        public final String e;
        public final String f;
        public final String i;
        public final boolean j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final boolean o;
        public final A p;
        public final boolean q;
        public final boolean r;
        public final boolean s;
        public final String t;
        public final String u;
        public final String v;
        public final String w;
        public final EnumC0719a x;
        public static final b Companion = new b();

        @JvmField
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new c(source);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public static final class b {
        }

        public c(Parcel parcel) {
            String readString = parcel.readString();
            F.e(readString, "loginBehavior");
            this.a = t.valueOf(readString);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.c = readString2 != null ? EnumC0722d.valueOf(readString2) : EnumC0722d.NONE;
            String readString3 = parcel.readString();
            F.e(readString3, "applicationId");
            this.d = readString3;
            this.e = parcel.readString();
            this.f = parcel.readString();
            String readString4 = parcel.readString();
            F.e(readString4, "authId");
            this.i = readString4;
            this.j = parcel.readByte() != 0;
            this.k = parcel.readString();
            String readString5 = parcel.readString();
            F.e(readString5, "authType");
            this.l = readString5;
            this.m = parcel.readString();
            this.n = parcel.readString();
            this.o = parcel.readByte() != 0;
            String readString6 = parcel.readString();
            this.p = readString6 != null ? A.valueOf(readString6) : A.FACEBOOK;
            this.q = parcel.readByte() != 0;
            this.r = parcel.readByte() != 0;
            this.s = parcel.readByte() != 0;
            this.t = parcel.readString();
            String readString7 = parcel.readString();
            F.e(readString7, "nonce");
            this.u = readString7;
            this.v = parcel.readString();
            this.w = parcel.readString();
            String readString8 = parcel.readString();
            this.x = readString8 != null ? EnumC0719a.valueOf(readString8) : null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean h() {
            boolean startsWith$default;
            boolean startsWith$default2;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                y.Companion.getClass();
                if (str != null) {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "publish", false, 2, null);
                    if (startsWith$default) {
                        return true;
                    }
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "manage", false, 2, null);
                    if (startsWith$default2 || y.a.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.a.name());
            dest.writeStringList(new ArrayList(this.b));
            dest.writeString(this.c.name());
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.i);
            dest.writeByte(this.j ? (byte) 1 : (byte) 0);
            dest.writeString(this.k);
            dest.writeString(this.l);
            dest.writeString(this.m);
            dest.writeString(this.n);
            dest.writeByte(this.o ? (byte) 1 : (byte) 0);
            dest.writeString(this.p.name());
            dest.writeByte(this.q ? (byte) 1 : (byte) 0);
            dest.writeByte(this.r ? (byte) 1 : (byte) 0);
            dest.writeByte(this.s ? (byte) 1 : (byte) 0);
            dest.writeString(this.t);
            dest.writeString(this.u);
            dest.writeString(this.v);
            dest.writeString(this.w);
            EnumC0719a enumC0719a = this.x;
            dest.writeString(enumC0719a != null ? enumC0719a.name() : null);
        }
    }

    public static final class d implements Parcelable {

        @JvmField
        public final a a;

        @JvmField
        public final C0688a b;

        @JvmField
        public final C0724m c;

        @JvmField
        public final String d;

        @JvmField
        public final String e;

        @JvmField
        public final c f;

        @JvmField
        public Map<String, String> i;

        @JvmField
        public Map<String, String> j;
        public static final c Companion = new c();

        @JvmField
        public static final Parcelable.Creator<d> CREATOR = new b();

        public enum a {
            SUCCESS(FirebaseAnalytics.Param.SUCCESS),
            CANCEL("cancel"),
            ERROR(Constants.IPC_BUNDLE_KEY_SEND_ERROR);

            public final String a;

            a(String str) {
                this.a = str;
            }
        }

        public static final class b implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new d(source);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public static final class c {
            @JvmStatic
            public static d a(c cVar, String str) {
                return new d(cVar, a.CANCEL, null, str, null);
            }

            @JvmStatic
            @JvmOverloads
            public static d b(c cVar, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new d(cVar, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public static /* synthetic */ d c(c cVar, c cVar2, String str, String str2) {
                cVar.getClass();
                return b(cVar2, str, str2, null);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(c cVar, a code, C0688a c0688a, String str, String str2) {
            this(cVar, code, c0688a, null, str, str2);
            Intrinsics.checkNotNullParameter(code, "code");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.a.name());
            dest.writeParcelable(this.b, i);
            dest.writeParcelable(this.c, i);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
            com.facebook.internal.E.K(dest, this.i);
            com.facebook.internal.E.K(dest, this.j);
        }

        public d(c cVar, a code, C0688a c0688a, C0724m c0724m, String str, String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f = cVar;
            this.b = c0688a;
            this.c = c0724m;
            this.d = str;
            this.a = code;
            this.e = str2;
        }

        public d(Parcel parcel) {
            String readString = parcel.readString();
            this.a = a.valueOf(readString == null ? Constants.IPC_BUNDLE_KEY_SEND_ERROR : readString);
            this.b = (C0688a) parcel.readParcelable(C0688a.class.getClassLoader());
            this.c = (C0724m) parcel.readParcelable(C0724m.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = (c) parcel.readParcelable(c.class.getClassLoader());
            this.i = com.facebook.internal.E.G(parcel);
            this.j = com.facebook.internal.E.G(parcel);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void h(String str, String str2, boolean z) {
        Map<String, String> map = this.j;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.j == null) {
            this.j = map;
        }
        if (map.containsKey(str) && z) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean l() {
        if (this.f) {
            return true;
        }
        Intrinsics.checkNotNullParameter("android.permission.INTERNET", "permission");
        FragmentActivity o = o();
        if ((o != null ? o.checkCallingOrSelfPermission("android.permission.INTERNET") : -1) == 0) {
            this.f = true;
            return true;
        }
        FragmentActivity o2 = o();
        m(d.c.c(d.Companion, this.i, o2 != null ? o2.getString(R.string.com_facebook_internet_permission_error_title) : null, o2 != null ? o2.getString(R.string.com_facebook_internet_permission_error_message) : null));
        return false;
    }

    public final void m(d outcome) {
        u uVar;
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        z p = p();
        if (p != null) {
            uVar = this;
            uVar.r(p.o(), outcome.a.a, outcome.d, outcome.e, p.a);
        } else {
            uVar = this;
        }
        Map<String, String> map = uVar.j;
        if (map != null) {
            outcome.i = map;
        }
        Map<String, String> map2 = uVar.k;
        if (map2 != null) {
            outcome.j = map2;
        }
        uVar.a = null;
        uVar.b = -1;
        uVar.i = null;
        uVar.j = null;
        uVar.m = 0;
        uVar.n = 0;
        C0340y c0340y = uVar.d;
        if (c0340y != null) {
            v this$0 = (v) c0340y.b;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            this$0.b = null;
            int i = outcome.a == d.a.CANCEL ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            FragmentActivity activity = this$0.getActivity();
            if (!this$0.isAdded() || activity == null) {
                return;
            }
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    public final void n(d pendingResult) {
        d dVar;
        Intrinsics.checkNotNullParameter(pendingResult, "outcome");
        if (pendingResult.b != null) {
            C0688a.Companion.getClass();
            if (C0688a.b.c()) {
                Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
                C0688a c0688a = pendingResult.b;
                if (c0688a == null) {
                    throw new C0728q("Can't validate without a token");
                }
                C0688a b2 = C0688a.b.b();
                if (b2 != null) {
                    try {
                        if (Intrinsics.areEqual(b2.k, c0688a.k)) {
                            d.c cVar = d.Companion;
                            c cVar2 = this.i;
                            C0724m c0724m = pendingResult.c;
                            cVar.getClass();
                            dVar = new d(cVar2, d.a.SUCCESS, c0688a, c0724m, null, null);
                            m(dVar);
                            return;
                        }
                    } catch (Exception e) {
                        m(d.c.c(d.Companion, this.i, "Caught exception", e.getMessage()));
                        return;
                    }
                }
                dVar = d.c.c(d.Companion, this.i, "User logged in as different Facebook user.", null);
                m(dVar);
                return;
            }
        }
        m(pendingResult);
    }

    public final FragmentActivity o() {
        v vVar = this.c;
        if (vVar != null) {
            return vVar.getActivity();
        }
        return null;
    }

    public final z p() {
        z[] zVarArr;
        int i = this.b;
        if (i < 0 || (zVarArr = this.a) == null) {
            return null;
        }
        return zVarArr[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r3 != null ? r3.d : null) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x q() {
        String b2;
        String str;
        x xVar = this.l;
        if (xVar != null) {
            if (!com.facebook.internal.instrument.crashshield.a.b(xVar)) {
                try {
                    str = xVar.a;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, xVar);
                }
                c cVar = this.i;
            }
            str = null;
            c cVar2 = this.i;
        }
        Context o = o();
        if (o == null) {
            o = com.facebook.w.a();
        }
        c cVar3 = this.i;
        if (cVar3 == null || (b2 = cVar3.d) == null) {
            b2 = com.facebook.w.b();
        }
        xVar = new x(o, b2);
        this.l = xVar;
        return xVar;
    }

    public final void r(String str, String str2, String str3, String str4, Map<String, String> map) {
        c cVar = this.i;
        if (cVar == null) {
            x q = q();
            if (com.facebook.internal.instrument.crashshield.a.b(q)) {
                return;
            }
            try {
                Bundle a2 = x.a.a(x.Companion, "");
                a2.putString("2_result", Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                a2.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                a2.putString("3_method", str);
                q.a(a2, "fb_mobile_login_method_complete");
                return;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, q);
                return;
            }
        }
        x q2 = q();
        String str5 = cVar.i;
        String str6 = cVar.q ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (com.facebook.internal.instrument.crashshield.a.b(q2)) {
            return;
        }
        try {
            Bundle a3 = x.a.a(x.Companion, str5);
            a3.putString("2_result", str2);
            if (str3 != null) {
                a3.putString("5_error_message", str3);
            }
            if (str4 != null) {
                a3.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                a3.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            a3.putString("3_method", str);
            q2.a(a3, str6);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, q2);
        }
    }

    public final void s(int i, int i2, Intent intent) {
        this.m++;
        if (this.i != null) {
            if (intent != null) {
                CustomTabMainActivity.Companion companion = CustomTabMainActivity.INSTANCE;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    t();
                    return;
                }
            }
            z p = p();
            if (p != null) {
                if ((p instanceof s) && intent == null && this.m < this.n) {
                    return;
                }
                p.r(i, i2, intent);
            }
        }
    }

    public final void t() {
        u uVar;
        z p = p();
        if (p != null) {
            uVar = this;
            uVar.r(p.o(), "skipped", null, null, p.a);
        } else {
            uVar = this;
        }
        z[] zVarArr = uVar.a;
        while (zVarArr != null) {
            int i = uVar.b;
            if (i >= zVarArr.length - 1) {
                break;
            }
            uVar.b = i + 1;
            z p2 = p();
            if (p2 != null) {
                if (!(p2 instanceof E) || l()) {
                    c cVar = uVar.i;
                    if (cVar == null) {
                        continue;
                    } else {
                        boolean z = cVar.q;
                        String str = cVar.i;
                        int u = p2.u(cVar);
                        uVar.m = 0;
                        if (u > 0) {
                            x q = q();
                            String o = p2.o();
                            String str2 = z ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!com.facebook.internal.instrument.crashshield.a.b(q)) {
                                try {
                                    Bundle a2 = x.a.a(x.Companion, str);
                                    a2.putString("3_method", o);
                                    q.a(a2, str2);
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, q);
                                }
                            }
                            uVar.n = u;
                        } else {
                            x q2 = q();
                            String o2 = p2.o();
                            String str3 = z ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!com.facebook.internal.instrument.crashshield.a.b(q2)) {
                                try {
                                    Bundle a3 = x.a.a(x.Companion, str);
                                    a3.putString("3_method", o2);
                                    q2.a(a3, str3);
                                } catch (Throwable th2) {
                                    com.facebook.internal.instrument.crashshield.a.a(th2, q2);
                                }
                            }
                            h("not_tried", p2.o(), true);
                        }
                        if (u > 0) {
                            return;
                        }
                    }
                } else {
                    h("no_internet_permission", "1", false);
                }
            }
        }
        c cVar2 = uVar.i;
        if (cVar2 != null) {
            m(d.c.c(d.Companion, cVar2, "Login attempt failed.", null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.a, i);
        dest.writeInt(this.b);
        dest.writeParcelable(this.i, i);
        com.facebook.internal.E.K(dest, this.j);
        com.facebook.internal.E.K(dest, this.k);
    }
}
