package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.fido.fido2.api.common.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0915t extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0915t> CREATOR = new Y();

    @Nullable
    public final String a;

    @NonNull
    public final String b;

    @Nullable
    public final zzgx c;

    @Nullable
    public final C0898h d;

    @Nullable
    public final C0896g e;

    @Nullable
    public final C0900i f;

    @Nullable
    public final C0892e i;

    @Nullable
    public final String j;

    @Nullable
    public String k;

    public C0915t(@Nullable String str, @NonNull String str2, @Nullable byte[] bArr, @Nullable C0898h c0898h, @Nullable C0896g c0896g, @Nullable C0900i c0900i, @Nullable C0892e c0892e, @Nullable String str3) {
        boolean z = false;
        zzgx zzl = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
        C0875q.b((c0898h != null && c0896g == null && c0900i == null) || (c0898h == null && c0896g != null && c0900i == null) || (c0898h == null && c0896g == null && c0900i != null), "Must provide a response object.");
        if (c0900i != null || (str != null && zzl != null)) {
            z = true;
        }
        C0875q.b(z, "Must provide id and rawId if not an error response.");
        this.a = str;
        this.b = str2;
        this.c = zzl;
        this.d = c0898h;
        this.e = c0896g;
        this.f = c0900i;
        this.i = c0892e;
        this.j = str3;
        this.k = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0915t)) {
            return false;
        }
        C0915t c0915t = (C0915t) obj;
        return C0874p.a(this.a, c0915t.a) && C0874p.a(this.b, c0915t.b) && C0874p.a(this.c, c0915t.c) && C0874p.a(this.d, c0915t.d) && C0874p.a(this.e, c0915t.e) && C0874p.a(this.f, c0915t.f) && C0874p.a(this.i, c0915t.i) && C0874p.a(this.j, c0915t.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.i, this.j});
    }

    @NonNull
    public final JSONObject l() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            zzgx zzgxVar = this.c;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject2.put("rawId", Base64Utils.encodeUrlSafeNoPadding(zzgxVar.zzm()));
            }
            String str = this.j;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            String str2 = this.b;
            C0900i c0900i = this.f;
            if (str2 != null && c0900i == null) {
                jSONObject2.put("type", str2);
            }
            String str3 = this.a;
            if (str3 != null) {
                jSONObject2.put("id", str3);
            }
            String str4 = "response";
            C0896g c0896g = this.e;
            boolean z = true;
            if (c0896g != null) {
                jSONObject = c0896g.l();
            } else {
                C0898h c0898h = this.d;
                if (c0898h != null) {
                    jSONObject = c0898h.l();
                } else {
                    z = false;
                    if (c0900i != null) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("code", c0900i.a.a);
                            String str5 = c0900i.b;
                            if (str5 != null) {
                                jSONObject3.put(Constants.MESSAGE, str5);
                            }
                            jSONObject = jSONObject3;
                            str4 = com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR;
                        } catch (JSONException e) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                        }
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str4, jSONObject);
            }
            C0892e c0892e = this.i;
            if (c0892e != null) {
                jSONObject2.put("clientExtensionResults", c0892e.l());
                return jSONObject2;
            }
            if (z) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject2;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
        }
    }

    @NonNull
    public final String toString() {
        zzgx zzgxVar = this.c;
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(zzgxVar == null ? null : zzgxVar.zzm());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.i);
        StringBuilder a = androidx.datastore.preferences.protobuf.c.a("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        androidx.collection.e.d(a, encodeUrlSafeNoPadding, ", \n registerResponse=", valueOf, ", \n signResponse=");
        androidx.collection.e.d(a, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        a.append(valueOf4);
        a.append(", \n authenticatorAttachment='");
        a.append(this.j);
        a.append("'}");
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (zzia.zzc()) {
            this.k = l().toString();
        }
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        zzgx zzgxVar = this.c;
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, zzgxVar == null ? null : zzgxVar.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 5, this.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 6, this.f, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 7, this.i, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 8, this.j, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 9, this.k, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
        this.k = null;
    }
}
