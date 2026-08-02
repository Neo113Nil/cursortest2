package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.EnumC0921z;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.fido.fido2.api.common.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0917v extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0917v> CREATOR;

    @NonNull
    public final EnumC0921z a;

    @NonNull
    public final zzgx b;

    @Nullable
    public final List c;

    static {
        zzcf.zzm(zzh.zza, zzh.zzb);
        CREATOR = new Z();
    }

    public C0917v() {
        throw null;
    }

    public C0917v(@NonNull String str, @NonNull byte[] bArr, @Nullable ArrayList arrayList) {
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl = zzgx.zzl(bArr, 0, bArr.length);
        C0875q.g(str);
        try {
            this.a = EnumC0921z.h(str);
            C0875q.g(zzl);
            this.b = zzl;
            this.c = arrayList;
        } catch (EnumC0921z.a e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static C0917v l(@NonNull JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        String string = jSONObject.getString("type");
        byte[] decode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports") && (jSONArray = jSONObject.getJSONArray("transports")) != null) {
            HashSet hashSet = new HashSet(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                String string2 = jSONArray.getString(i);
                if (string2 != null && !string2.isEmpty()) {
                    try {
                        hashSet.add(Transport.h(string2));
                    } catch (Transport.a unused) {
                        "Ignoring unrecognized transport ".concat(string2);
                    }
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        return new C0917v(string, decode, arrayList);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0917v)) {
            return false;
        }
        C0917v c0917v = (C0917v) obj;
        EnumC0921z enumC0921z = c0917v.a;
        List list = c0917v.c;
        if (!this.a.equals(enumC0921z) || !C0874p.a(this.b, c0917v.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(this.b.zzm());
        return androidx.concurrent.futures.a.a(androidx.datastore.preferences.protobuf.c.a("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", encodeUrlSafeNoPadding, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        this.a.getClass();
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, "public-key", false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, this.b.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 4, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
