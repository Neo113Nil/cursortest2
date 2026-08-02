package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.C0688a;
import com.facebook.C0724m;
import com.facebook.C0728q;
import com.facebook.EnumC0718l;
import com.facebook.F;
import com.facebook.S;
import com.facebook.login.u;
import com.facebook.z;
import java.io.UnsupportedEncodingException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting(otherwise = 3)
/* loaded from: classes3.dex */
public abstract class z implements Parcelable {
    public static final a Companion = new a();
    public Map<String, String> a;
    public u b;

    @SourceDebugExtension({"SMAP\nLoginMethodHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginMethodHandler.kt\ncom/facebook/login/LoginMethodHandler$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,324:1\n37#2,2:325\n37#2,2:327\n37#2,2:329\n37#2,2:331\n*S KotlinDebug\n*F\n+ 1 LoginMethodHandler.kt\ncom/facebook/login/LoginMethodHandler$Companion\n*L\n273#1:325,2\n278#1:327,2\n283#1:329,2\n312#1:331,2\n*E\n"})
    public static final class a {
        @JvmStatic
        public static C0688a a(Bundle bundle, String applicationId) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Date m = com.facebook.internal.E.m(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date m2 = com.facebook.internal.E.m(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new C0688a(string2, applicationId, string, stringArrayList, null, null, EnumC0718l.FACEBOOK_APPLICATION_SERVICE, m, new Date(), m2, bundle.getString("graph_domain"));
        }

        @JvmStatic
        public static C0688a b(HashSet hashSet, Bundle bundle, EnumC0718l enumC0718l, String applicationId) throws C0728q {
            ArrayList arrayList;
            ArrayList arrayList2;
            List split$default;
            List split$default2;
            List split$default3;
            List split$default4;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Date m = com.facebook.internal.E.m(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string != null) {
                Date m2 = com.facebook.internal.E.m(bundle, "data_access_expiration_time", new Date(0L));
                String string2 = bundle.getString("granted_scopes");
                AbstractCollection abstractCollection = hashSet;
                if (string2 != null) {
                    abstractCollection = hashSet;
                    if (string2.length() > 0) {
                        split$default4 = StringsKt__StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                        String[] strArr = (String[]) split$default4.toArray(new String[0]);
                        abstractCollection = CollectionsKt.arrayListOf(Arrays.copyOf(strArr, strArr.length));
                    }
                }
                String string3 = bundle.getString("denied_scopes");
                if (string3 == null || string3.length() <= 0) {
                    arrayList = null;
                } else {
                    split$default3 = StringsKt__StringsKt.split$default(string3, new String[]{","}, false, 0, 6, (Object) null);
                    String[] strArr2 = (String[]) split$default3.toArray(new String[0]);
                    arrayList = CollectionsKt.arrayListOf(Arrays.copyOf(strArr2, strArr2.length));
                }
                String string4 = bundle.getString("expired_scopes");
                if (string4 == null || string4.length() <= 0) {
                    arrayList2 = null;
                } else {
                    split$default2 = StringsKt__StringsKt.split$default(string4, new String[]{","}, false, 0, 6, (Object) null);
                    String[] strArr3 = (String[]) split$default2.toArray(new String[0]);
                    arrayList2 = CollectionsKt.arrayListOf(Arrays.copyOf(strArr3, strArr3.length));
                }
                if (!com.facebook.internal.E.z(string)) {
                    String string5 = bundle.getString("graph_domain");
                    String string6 = bundle.getString("signed_request");
                    if (string6 == null || string6.length() == 0) {
                        throw new C0728q("Authorization response does not contain the signed_request");
                    }
                    try {
                        split$default = StringsKt__StringsKt.split$default(string6, new String[]{"."}, false, 0, 6, (Object) null);
                        String[] strArr4 = (String[]) split$default.toArray(new String[0]);
                        if (strArr4.length == 2) {
                            byte[] data = Base64.decode(strArr4[1], 0);
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            String string7 = new JSONObject(new String(data, Charsets.UTF_8)).getString("user_id");
                            Intrinsics.checkNotNullExpressionValue(string7, "jsonObject.getString(\"user_id\")");
                            return new C0688a(string, applicationId, string7, abstractCollection, arrayList, arrayList2, enumC0718l, m, new Date(), m2, string5);
                        }
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    throw new C0728q("Failed to retrieve user_id from signed_request");
                }
            }
            return null;
        }

        @JvmStatic
        public static C0724m c(Bundle bundle, String str) throws C0728q {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new C0724m(string, str);
            } catch (Exception e) {
                throw new C0728q(e.getMessage(), e);
            }
        }
    }

    public z(u loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.b = loginClient;
    }

    public final void h(String str, String str2) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        Map<String, String> map = this.a;
        if (map != null) {
            map.put(str, str2 != null ? str2.toString() : null);
        }
    }

    public void l() {
    }

    public final String m(String authId) {
        Intrinsics.checkNotNullParameter(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", o());
            t(jSONObject);
        } catch (JSONException e) {
            e.getMessage();
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final u n() {
        u uVar = this.b;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        return null;
    }

    public abstract String o();

    public String p() {
        return "fb" + com.facebook.w.b() + "://authorize/";
    }

    public final void q(String str) {
        String b;
        u.c cVar = n().i;
        if (cVar == null || (b = cVar.d) == null) {
            b = com.facebook.w.b();
        }
        com.facebook.appevents.p loggerImpl = new com.facebook.appevents.p(n().o(), b);
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", b);
        com.facebook.w wVar = com.facebook.w.a;
        if (S.c()) {
            loggerImpl.h(bundle, "fb_dialogs_web_login_dialog_complete");
        }
    }

    public boolean r(int i, int i2, Intent intent) {
        return false;
    }

    public final void s(Bundle values, u.c request) throws C0728q {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(values, "values");
        String authorizationCode = values.getString("code");
        if (com.facebook.internal.E.z(authorizationCode)) {
            throw new C0728q("No code param found from the request");
        }
        if (authorizationCode == null) {
            throw new C0728q("Failed to create code exchange request");
        }
        String redirectUri = p();
        String codeVerifier = request.v;
        if (codeVerifier == null) {
            codeVerifier = "";
        }
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", com.facebook.w.b());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        com.facebook.z.Companion.getClass();
        com.facebook.z g = z.c.g(null, "oauth/access_token", null);
        g.h = F.a;
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        g.d = bundle;
        com.facebook.E c = g.c();
        com.facebook.t tVar = c.c;
        if (tVar != null) {
            throw new com.facebook.y(tVar, tVar.h());
        }
        try {
            JSONObject jSONObject = c.b;
            String string = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || com.facebook.internal.E.z(string)) {
                throw new C0728q("No access token found from result");
            }
            values.putString("access_token", string);
            if (jSONObject.has("id_token")) {
                values.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e) {
            throw new C0728q("Fail to process code exchange response: " + e.getMessage());
        }
    }

    public void t(JSONObject param) throws JSONException {
        Intrinsics.checkNotNullParameter(param, "param");
    }

    public abstract int u(u.c cVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Map<String, String> map = this.a;
        com.facebook.internal.E e = com.facebook.internal.E.a;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public z(Parcel parcel) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(parcel, "source");
        com.facebook.internal.E e = com.facebook.internal.E.a;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (int i = 0; i < readInt; i++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
        }
        this.a = hashMap != null ? MapsKt.toMutableMap(hashMap) : null;
    }
}
