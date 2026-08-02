package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.media3.session.C0510i;
import androidx.media3.session.MediaSessionService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nAuthenticationTokenClaims.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationTokenClaims.kt\ncom/facebook/AuthenticationTokenClaims\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,584:1\n1#2:585\n*E\n"})
/* renamed from: com.facebook.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0725n implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final Set<String> p;
    public final String q;
    public final Map<String, Integer> r;
    public final Map<String, String> s;
    public final Map<String, String> t;
    public final String u;
    public final String v;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<C0725n> CREATOR = new a();

    /* renamed from: com.facebook.n$a */
    public static final class a implements Parcelable.Creator<C0725n> {
        @Override // android.os.Parcelable.Creator
        public final C0725n createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C0725n(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C0725n[] newArray(int i) {
            return new C0725n[i];
        }
    }

    /* renamed from: com.facebook.n$b */
    public static final class b {
        public static String a(String name, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(new java.net.URL(r2).getHost(), "www.facebook.com") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0725n(String encodedClaims, String expectedNonce) {
        Set<String> unmodifiableSet;
        Intrinsics.checkNotNullParameter(encodedClaims, "encodedClaims");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        com.facebook.internal.F.c(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
        String jti = jSONObject.optString("jti");
        Intrinsics.checkNotNullExpressionValue(jti, "jti");
        if (jti.length() != 0) {
            try {
                String iss = jSONObject.optString("iss");
                Intrinsics.checkNotNullExpressionValue(iss, "iss");
                if (iss.length() != 0) {
                    if (!Intrinsics.areEqual(new URL(iss).getHost(), "facebook.com")) {
                    }
                    String aud = jSONObject.optString("aud");
                    Intrinsics.checkNotNullExpressionValue(aud, "aud");
                    if (aud.length() != 0 && Intrinsics.areEqual(aud, w.b())) {
                        long j = 1000;
                        if (!new Date().after(new Date(jSONObject.optLong("exp") * j))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * j) + MediaSessionService.DEFAULT_FOREGROUND_SERVICE_TIMEOUT_MS))) {
                                String sub = jSONObject.optString("sub");
                                Intrinsics.checkNotNullExpressionValue(sub, "sub");
                                if (sub.length() != 0) {
                                    String nonce = jSONObject.optString("nonce");
                                    Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
                                    if (nonce.length() != 0 && Intrinsics.areEqual(nonce, expectedNonce)) {
                                        String string = jSONObject.getString("jti");
                                        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(JSON_KEY_JIT)");
                                        this.a = string;
                                        String string2 = jSONObject.getString("iss");
                                        Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(JSON_KEY_ISS)");
                                        this.b = string2;
                                        String string3 = jSONObject.getString("aud");
                                        Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(JSON_KEY_AUD)");
                                        this.c = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        Intrinsics.checkNotNullExpressionValue(string4, "jsonObj.getString(JSON_KEY_NONCE)");
                                        this.d = string4;
                                        this.e = jSONObject.getLong("exp");
                                        this.f = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        Intrinsics.checkNotNullExpressionValue(string5, "jsonObj.getString(JSON_KEY_SUB)");
                                        this.i = string5;
                                        Companion.getClass();
                                        this.j = b.a("name", jSONObject);
                                        this.k = b.a("given_name", jSONObject);
                                        this.l = b.a("middle_name", jSONObject);
                                        this.m = b.a("family_name", jSONObject);
                                        this.n = b.a("email", jSONObject);
                                        this.o = b.a("picture", jSONObject);
                                        JSONArray jsonArray = jSONObject.optJSONArray("user_friends");
                                        if (jsonArray == null) {
                                            unmodifiableSet = null;
                                        } else {
                                            com.facebook.internal.E e = com.facebook.internal.E.a;
                                            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
                                            HashSet hashSet = new HashSet();
                                            int length = jsonArray.length();
                                            for (int i = 0; i < length; i++) {
                                                String string6 = jsonArray.getString(i);
                                                Intrinsics.checkNotNullExpressionValue(string6, "jsonArray.getString(i)");
                                                hashSet.add(string6);
                                            }
                                            unmodifiableSet = Collections.unmodifiableSet(hashSet);
                                        }
                                        this.p = unmodifiableSet;
                                        Companion.getClass();
                                        this.q = b.a("user_birthday", jSONObject);
                                        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
                                        this.r = optJSONObject == null ? null : Collections.unmodifiableMap(com.facebook.internal.E.g(optJSONObject));
                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        this.s = optJSONObject2 == null ? null : Collections.unmodifiableMap(com.facebook.internal.E.h(optJSONObject2));
                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.t = optJSONObject3 != null ? Collections.unmodifiableMap(com.facebook.internal.E.h(optJSONObject3)) : null;
                                        this.u = b.a("user_gender", jSONObject);
                                        this.v = b.a("user_link", jSONObject);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        throw new IllegalArgumentException("Invalid claims");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0725n)) {
            return false;
        }
        C0725n c0725n = (C0725n) obj;
        return Intrinsics.areEqual(this.a, c0725n.a) && Intrinsics.areEqual(this.b, c0725n.b) && Intrinsics.areEqual(this.c, c0725n.c) && Intrinsics.areEqual(this.d, c0725n.d) && this.e == c0725n.e && this.f == c0725n.f && Intrinsics.areEqual(this.i, c0725n.i) && Intrinsics.areEqual(this.j, c0725n.j) && Intrinsics.areEqual(this.k, c0725n.k) && Intrinsics.areEqual(this.l, c0725n.l) && Intrinsics.areEqual(this.m, c0725n.m) && Intrinsics.areEqual(this.n, c0725n.n) && Intrinsics.areEqual(this.o, c0725n.o) && Intrinsics.areEqual(this.p, c0725n.p) && Intrinsics.areEqual(this.q, c0725n.q) && Intrinsics.areEqual(this.r, c0725n.r) && Intrinsics.areEqual(this.s, c0725n.s) && Intrinsics.areEqual(this.t, c0725n.t) && Intrinsics.areEqual(this.u, c0725n.u) && Intrinsics.areEqual(this.v, c0725n.v);
    }

    public final int hashCode() {
        int a2 = androidx.compose.runtime.collection.a.a(C0510i.a(this.f, C0510i.a(this.e, androidx.compose.runtime.collection.a.a(androidx.compose.runtime.collection.a.a(androidx.compose.runtime.collection.a.a(androidx.compose.runtime.collection.a.a(527, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.i);
        String str = this.j;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.l;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.m;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.n;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.o;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set<String> set = this.p;
        int hashCode7 = (hashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.q;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, Integer> map = this.r;
        int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.s;
        int hashCode10 = (hashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.t;
        int hashCode11 = (hashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.u;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.v;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.a);
        jSONObject.put("iss", this.b);
        jSONObject.put("aud", this.c);
        jSONObject.put("nonce", this.d);
        jSONObject.put("exp", this.e);
        jSONObject.put("iat", this.f);
        String str = this.i;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.j;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.k;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.l;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.m;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.n;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.o;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set<String> set = this.p;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.q;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map<String, Integer> map = this.r;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map<String, String> map2 = this.s;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map<String, String> map3 = this.t;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.u;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.v;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "claimsJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
        dest.writeString(this.d);
        dest.writeLong(this.e);
        dest.writeLong(this.f);
        dest.writeString(this.i);
        dest.writeString(this.j);
        dest.writeString(this.k);
        dest.writeString(this.l);
        dest.writeString(this.m);
        dest.writeString(this.n);
        dest.writeString(this.o);
        Set<String> set = this.p;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.q);
        dest.writeMap(this.r);
        dest.writeMap(this.s);
        dest.writeMap(this.t);
        dest.writeString(this.u);
        dest.writeString(this.v);
    }

    public C0725n(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        com.facebook.internal.F.e(readString, "jti");
        this.a = readString;
        String readString2 = parcel.readString();
        com.facebook.internal.F.e(readString2, "iss");
        this.b = readString2;
        String readString3 = parcel.readString();
        com.facebook.internal.F.e(readString3, "aud");
        this.c = readString3;
        String readString4 = parcel.readString();
        com.facebook.internal.F.e(readString4, "nonce");
        this.d = readString4;
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        String readString5 = parcel.readString();
        com.facebook.internal.F.e(readString5, "sub");
        this.i = readString5;
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.p = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.q = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(IntCompanionObject.INSTANCE.getClass().getClassLoader());
        readHashMap = readHashMap == null ? null : readHashMap;
        this.r = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(StringCompanionObject.INSTANCE.getClass().getClassLoader());
        readHashMap2 = readHashMap2 == null ? null : readHashMap2;
        this.s = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(StringCompanionObject.class.getClassLoader());
        readHashMap3 = readHashMap3 == null ? null : readHashMap3;
        this.t = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.u = parcel.readString();
        this.v = parcel.readString();
    }
}
