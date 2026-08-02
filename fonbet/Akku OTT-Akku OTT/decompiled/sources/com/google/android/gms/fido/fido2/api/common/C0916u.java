package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.fido2.api.common.EnumC0888c;
import com.google.android.gms.internal.fido.zzbl;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.fido.fido2.api.common.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0916u extends C {

    @NonNull
    public static final Parcelable.Creator<C0916u> CREATOR = new X();

    @NonNull
    public final C0920y a;

    @NonNull
    public final A b;

    @NonNull
    public final byte[] c;

    @NonNull
    public final List d;

    @Nullable
    public final Double e;

    @Nullable
    public final List f;

    @Nullable
    public final C0904k i;

    @Nullable
    public final Integer j;

    @Nullable
    public final E k;

    @Nullable
    public final EnumC0888c l;

    @Nullable
    public final C0890d m;

    @Nullable
    public final String n;

    @Nullable
    public final ResultReceiver o;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.u$a */
    public static final class a {
        public C0920y a;
        public A b;
        public byte[] c;
        public ArrayList d;
        public Double e;
        public ArrayList f;
        public C0904k g;
        public EnumC0888c h;
        public C0890d i;
    }

    public C0916u(@NonNull C0920y c0920y, @NonNull A a2, @NonNull byte[] bArr, @NonNull ArrayList arrayList, @Nullable Double d, @Nullable ArrayList arrayList2, @Nullable C0904k c0904k, @Nullable Integer num, @Nullable E e, @Nullable String str, @Nullable C0890d c0890d, @Nullable String str2, @Nullable ResultReceiver resultReceiver) {
        this.o = resultReceiver;
        if (str2 != null) {
            try {
                C0916u l = l(new JSONObject(str2));
                this.a = l.a;
                this.b = l.b;
                this.c = l.c;
                this.d = l.d;
                this.e = l.e;
                this.f = l.f;
                this.i = l.i;
                this.j = l.j;
                this.k = l.k;
                this.l = l.l;
                this.m = l.m;
                this.n = str2;
                return;
            } catch (JSONException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        C0875q.g(c0920y);
        this.a = c0920y;
        C0875q.g(a2);
        this.b = a2;
        C0875q.g(bArr);
        this.c = bArr;
        C0875q.g(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.i = c0904k;
        this.j = num;
        this.k = e;
        if (str != null) {
            try {
                this.l = EnumC0888c.h(str);
            } catch (EnumC0888c.a e3) {
                throw new IllegalArgumentException(e3);
            }
        } else {
            this.l = null;
        }
        this.m = c0890d;
        this.n = null;
    }

    @NonNull
    public static C0916u l(@NonNull JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        C0904k c0904k;
        EnumC0888c enumC0888c;
        zzbl zzc;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        C0920y c0920y = new C0920y(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject(Constants.USER);
        A a2 = new A(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), Base64Utils.decodeUrlSafeNoPadding(jSONObject3.getString("id")));
        byte[] decodeUrlSafeNoPadding = Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("challenge"));
        C0875q.g(decodeUrlSafeNoPadding);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            try {
                zzc = zzbl.zzd(new C0918w(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzc = zzbl.zzc();
            }
            if (zzc.zzb()) {
                arrayList2.add(zzc.zza());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList3.add(C0917v.l(jSONArray2.getJSONObject(i2)));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            c0904k = new C0904k(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null);
        } else {
            c0904k = null;
        }
        C0890d l = jSONObject.has("extensions") ? C0890d.l(jSONObject.getJSONObject("extensions")) : null;
        if (jSONObject.has("attestation")) {
            try {
                enumC0888c = EnumC0888c.h(jSONObject.getString("attestation"));
            } catch (EnumC0888c.a unused2) {
                enumC0888c = EnumC0888c.NONE;
            }
        } else {
            enumC0888c = null;
        }
        return new C0916u(c0920y, a2, decodeUrlSafeNoPadding, arrayList2, valueOf, arrayList, c0904k, null, null, enumC0888c != null ? enumC0888c.a : null, l, null, null);
    }

    public final boolean equals(@NonNull Object obj) {
        List list;
        if (!(obj instanceof C0916u)) {
            return false;
        }
        C0916u c0916u = (C0916u) obj;
        C0920y c0920y = c0916u.a;
        List list2 = c0916u.d;
        List list3 = c0916u.f;
        if (C0874p.a(this.a, c0920y) && C0874p.a(this.b, c0916u.b) && Arrays.equals(this.c, c0916u.c) && C0874p.a(this.e, c0916u.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && C0874p.a(this.i, c0916u.i) && C0874p.a(this.j, c0916u.j) && C0874p.a(this.k, c0916u.k) && C0874p.a(this.l, c0916u.l) && C0874p.a(this.m, c0916u.m) && C0874p.a(this.n, c0916u.n))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.i, this.j, this.k, this.l, this.m, this.n});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        String valueOf8 = String.valueOf(this.m);
        StringBuilder a2 = androidx.datastore.preferences.protobuf.c.a("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        androidx.collection.e.d(a2, encodeUrlSafeNoPadding, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        a2.append(this.e);
        a2.append(", \n excludeList=");
        a2.append(valueOf4);
        a2.append(", \n authenticatorSelection=");
        a2.append(valueOf5);
        a2.append(", \n requestId=");
        a2.append(this.j);
        a2.append(", \n tokenBinding=");
        a2.append(valueOf6);
        a2.append(", \n attestationConveyancePreference=");
        a2.append(valueOf7);
        a2.append(", \n authenticationExtensions=");
        a2.append(valueOf8);
        a2.append("}");
        return a2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 5, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.d(parcel, 6, this.e);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 7, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 8, this.i, i, false);
        com.google.android.gms.common.internal.safeparcel.c.i(parcel, 9, this.j);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 10, this.k, i, false);
        EnumC0888c enumC0888c = this.l;
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 11, enumC0888c == null ? null : enumC0888c.a, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 12, this.m, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 13, this.n, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 14, this.o, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public C0916u(@NonNull String str) {
        try {
            C0916u l = l(new JSONObject(str));
            this.a = l.a;
            this.b = l.b;
            this.c = l.c;
            this.d = l.d;
            this.e = l.e;
            this.f = l.f;
            this.i = l.i;
            this.j = l.j;
            this.k = l.k;
            this.l = l.l;
            this.m = l.m;
            this.n = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
