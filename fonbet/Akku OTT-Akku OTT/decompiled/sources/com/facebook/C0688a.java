package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0688a implements Parcelable {
    public final Date a;
    public final Set<String> b;
    public final Set<String> c;
    public final Set<String> d;
    public final String e;
    public final EnumC0718l f;
    public final Date i;
    public final String j;
    public final String k;
    public final Date l;
    public final String m;
    public static final b Companion = new b();
    public static final Date n = new Date(Long.MAX_VALUE);
    public static final Date o = new Date();
    public static final EnumC0718l p = EnumC0718l.FACEBOOK_APPLICATION_WEB;

    @JvmField
    public static final Parcelable.Creator<C0688a> CREATOR = new C0069a();

    /* renamed from: com.facebook.a$a, reason: collision with other inner class name */
    public static final class C0069a implements Parcelable.Creator<C0688a> {
        @Override // android.os.Parcelable.Creator
        public final C0688a createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C0688a(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C0688a[] newArray(int i) {
            return new C0688a[i];
        }
    }

    /* renamed from: com.facebook.a$b */
    public static final class b {
        @JvmStatic
        public static C0688a a(JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new C0728q("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString(Constants.TOKEN);
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            EnumC0718l valueOf = EnumC0718l.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String optString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            ArrayList B = com.facebook.internal.E.B(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            return new C0688a(token, applicationId, userId, B, com.facebook.internal.E.B(declinedPermissionsArray), optJSONArray == null ? new ArrayList() : com.facebook.internal.E.B(optJSONArray), valueOf, date, date2, date3, optString);
        }

        @JvmStatic
        public static C0688a b() {
            return C0717k.Companion.a().c;
        }

        @JvmStatic
        public static boolean c() {
            C0688a c0688a = C0717k.Companion.a().c;
            return (c0688a == null || new Date().after(c0688a.a)) ? false : true;
        }
    }

    public /* synthetic */ C0688a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC0718l enumC0718l, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, enumC0718l, date, date2, date3, "facebook");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0688a)) {
            return false;
        }
        C0688a c0688a = (C0688a) obj;
        if (Intrinsics.areEqual(this.a, c0688a.a) && Intrinsics.areEqual(this.b, c0688a.b) && Intrinsics.areEqual(this.c, c0688a.c) && Intrinsics.areEqual(this.d, c0688a.d) && Intrinsics.areEqual(this.e, c0688a.e) && this.f == c0688a.f && Intrinsics.areEqual(this.i, c0688a.i) && Intrinsics.areEqual(this.j, c0688a.j) && Intrinsics.areEqual(this.k, c0688a.k) && Intrinsics.areEqual(this.l, c0688a.l)) {
            String str = this.m;
            String str2 = c0688a.m;
            if (str == null ? str2 == null : Intrinsics.areEqual(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(Constants.TOKEN, this.e);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.d));
        jSONObject.put("last_refresh", this.i.getTime());
        jSONObject.put("source", this.f.name());
        jSONObject.put("application_id", this.j);
        jSONObject.put("user_id", this.k);
        jSONObject.put("data_access_expiration_time", this.l.getTime());
        String str = this.m;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final int hashCode() {
        int hashCode = (this.l.hashCode() + androidx.compose.runtime.collection.a.a(androidx.compose.runtime.collection.a.a((this.i.hashCode() + ((this.f.hashCode() + androidx.compose.runtime.collection.a.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31)) * 31, 31, this.j), 31, this.k)) * 31;
        String str = this.m;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        w.h(G.b);
        sb.append(TextUtils.join(", ", this.b));
        sb.append("]}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.a.getTime());
        dest.writeStringList(new ArrayList(this.b));
        dest.writeStringList(new ArrayList(this.c));
        dest.writeStringList(new ArrayList(this.d));
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeLong(this.i.getTime());
        dest.writeString(this.j);
        dest.writeString(this.k);
        dest.writeLong(this.l.getTime());
        dest.writeString(this.m);
    }

    @JvmOverloads
    public C0688a(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC0718l enumC0718l, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        com.facebook.internal.F.c(accessToken, Constants.ACCESS_TOKEN);
        com.facebook.internal.F.c(applicationId, "applicationId");
        com.facebook.internal.F.c(userId, io.flutter.plugins.firebase.analytics.Constants.USER_ID);
        Date date4 = n;
        this.a = date == null ? date4 : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.b = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.c = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.d = unmodifiableSet3;
        this.e = accessToken;
        enumC0718l = enumC0718l == null ? p : enumC0718l;
        if (str != null && str.equals("instagram")) {
            int ordinal = enumC0718l.ordinal();
            if (ordinal == 1) {
                enumC0718l = EnumC0718l.INSTAGRAM_APPLICATION_WEB;
            } else if (ordinal == 4) {
                enumC0718l = EnumC0718l.INSTAGRAM_WEB_VIEW;
            } else if (ordinal == 5) {
                enumC0718l = EnumC0718l.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f = enumC0718l;
        this.i = date2 == null ? o : date2;
        this.j = applicationId;
        this.k = userId;
        this.l = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.m = str == null ? "facebook" : str;
    }

    public C0688a(Parcel parcel) {
        EnumC0718l enumC0718l;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.d = unmodifiableSet3;
        String readString = parcel.readString();
        com.facebook.internal.F.e(readString, Constants.TOKEN);
        this.e = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            enumC0718l = EnumC0718l.valueOf(readString2);
        } else {
            enumC0718l = p;
        }
        this.f = enumC0718l;
        this.i = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        com.facebook.internal.F.e(readString3, "applicationId");
        this.j = readString3;
        String readString4 = parcel.readString();
        com.facebook.internal.F.e(readString4, io.flutter.plugins.firebase.analytics.Constants.USER_ID);
        this.k = readString4;
        this.l = new Date(parcel.readLong());
        this.m = parcel.readString();
    }
}
