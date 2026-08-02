package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.fido.fido2.api.common.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0919x extends C {

    @NonNull
    public static final Parcelable.Creator<C0919x> CREATOR = new C0887b0();

    @NonNull
    public final byte[] a;

    @Nullable
    public final Double b;

    @NonNull
    public final String c;

    @Nullable
    public final List d;

    @Nullable
    public final Integer e;

    @Nullable
    public final E f;

    @Nullable
    public final G i;

    @Nullable
    public final C0890d j;

    @Nullable
    public final Long k;

    @Nullable
    public final ResultReceiver l;

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5 A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131 A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106 A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007f A[Catch: n0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {n0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0134, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0919x(@NonNull byte[] bArr, @Nullable Double d, @NonNull String str, @Nullable ArrayList arrayList, @Nullable Integer num, @Nullable E e, @Nullable String str2, @Nullable C0890d c0890d, @Nullable Long l, @Nullable String str3, @Nullable ResultReceiver resultReceiver) {
        Double d2;
        Double valueOf;
        JSONArray jSONArray;
        ArrayList arrayList2;
        E e2;
        C0890d c0890d2;
        C0890d l2;
        this.l = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            C0875q.g(bArr);
            this.a = bArr;
            this.b = d;
            C0875q.g(str);
            this.c = str;
            this.d = arrayList;
            this.e = num;
            this.f = e;
            this.k = l;
            if (str2 != null) {
                try {
                    this.i = G.h(str2);
                } catch (n0 e3) {
                    throw new IllegalArgumentException(e3);
                }
            } else {
                this.i = null;
            }
            this.j = c0890d;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            byte[] decodeUrlSafeNoPadding = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("challenge"));
            C0875q.g(decodeUrlSafeNoPadding);
            if (jSONObject.has("timeout")) {
                valueOf = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
            } else {
                if (!jSONObject.has("timeoutSeconds")) {
                    d2 = null;
                    String string = jSONObject.getString("rpId");
                    C0875q.g(string);
                    jSONArray = !jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
                    if (jSONArray == null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList3.add(C0917v.l(jSONArray.getJSONObject(i)));
                        }
                        arrayList2 = arrayList3;
                    } else {
                        arrayList2 = null;
                    }
                    Integer valueOf2 = !jSONObject.has("requestId") ? Integer.valueOf(jSONObject.getInt("requestId")) : null;
                    if (jSONObject.has("tokenBinding")) {
                        e2 = null;
                    } else {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                        e2 = new E(jSONObject2.getString(NotificationCompat.CATEGORY_STATUS), jSONObject2.has("id") ? jSONObject2.getString("id") : null);
                    }
                    G h = !jSONObject.has("userVerification") ? G.h(jSONObject.getString("userVerification")) : null;
                    if (!jSONObject.has("authenticationExtensions")) {
                        l2 = C0890d.l(jSONObject.getJSONObject("authenticationExtensions"));
                    } else {
                        if (!jSONObject.has("extensions")) {
                            c0890d2 = null;
                            C0919x c0919x = new C0919x(decodeUrlSafeNoPadding, d2, string, arrayList2, valueOf2, e2, h != null ? h.a : null, c0890d2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
                            this.a = c0919x.a;
                            this.b = c0919x.b;
                            this.c = c0919x.c;
                            this.d = c0919x.d;
                            this.e = c0919x.e;
                            this.f = c0919x.f;
                            this.i = c0919x.i;
                            this.j = c0919x.j;
                            this.k = c0919x.k;
                        }
                        l2 = C0890d.l(jSONObject.getJSONObject("extensions"));
                    }
                    c0890d2 = l2;
                    C0919x c0919x2 = new C0919x(decodeUrlSafeNoPadding, d2, string, arrayList2, valueOf2, e2, h != null ? h.a : null, c0890d2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
                    this.a = c0919x2.a;
                    this.b = c0919x2.b;
                    this.c = c0919x2.c;
                    this.d = c0919x2.d;
                    this.e = c0919x2.e;
                    this.f = c0919x2.f;
                    this.i = c0919x2.i;
                    this.j = c0919x2.j;
                    this.k = c0919x2.k;
                }
                valueOf = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
            }
            d2 = valueOf;
            String string2 = jSONObject.getString("rpId");
            C0875q.g(string2);
            if (!jSONObject.has("allowList")) {
            }
            if (jSONArray == null) {
            }
            if (!jSONObject.has("requestId")) {
            }
            if (jSONObject.has("tokenBinding")) {
            }
            if (!jSONObject.has("userVerification")) {
            }
            if (!jSONObject.has("authenticationExtensions")) {
            }
            c0890d2 = l2;
            C0919x c0919x22 = new C0919x(decodeUrlSafeNoPadding, d2, string2, arrayList2, valueOf2, e2, h != null ? h.a : null, c0890d2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
            this.a = c0919x22.a;
            this.b = c0919x22.b;
            this.c = c0919x22.c;
            this.d = c0919x22.d;
            this.e = c0919x22.e;
            this.f = c0919x22.f;
            this.i = c0919x22.i;
            this.j = c0919x22.j;
            this.k = c0919x22.k;
        } catch (n0 e4) {
            e = e4;
            throw new IllegalArgumentException(e);
        } catch (JSONException e5) {
            e = e5;
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@NonNull Object obj) {
        List list;
        if (!(obj instanceof C0919x)) {
            return false;
        }
        C0919x c0919x = (C0919x) obj;
        byte[] bArr = c0919x.a;
        List list2 = c0919x.d;
        return Arrays.equals(this.a, bArr) && C0874p.a(this.b, c0919x.b) && C0874p.a(this.c, c0919x.c) && (((list = this.d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && C0874p.a(this.e, c0919x.e) && C0874p.a(this.f, c0919x.f) && C0874p.a(this.i, c0919x.i) && C0874p.a(this.j, c0919x.j) && C0874p.a(this.k, c0919x.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.k});
    }

    @NonNull
    public final String toString() {
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(this.a);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.j);
        StringBuilder a = androidx.appcompat.view.a.a("PublicKeyCredentialRequestOptions{\n challenge=", encodeUrlSafeNoPadding, ", \n timeoutSeconds=");
        a.append(this.b);
        a.append(", \n rpId='");
        androidx.collection.e.d(a, this.c, "', \n allowList=", valueOf, ", \n requestId=");
        a.append(this.e);
        a.append(", \n tokenBinding=");
        a.append(valueOf2);
        a.append(", \n userVerification=");
        androidx.collection.e.d(a, valueOf3, ", \n authenticationExtensions=", valueOf4, ", \n longRequestId=");
        a.append(this.k);
        a.append("}");
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.d(parcel, 3, this.b);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 5, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.i(parcel, 6, this.e);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 7, this.f, i, false);
        G g = this.i;
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 8, g == null ? null : g.a, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 9, this.j, i, false);
        com.google.android.gms.common.internal.safeparcel.c.j(parcel, 10, this.k);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 12, this.l, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
