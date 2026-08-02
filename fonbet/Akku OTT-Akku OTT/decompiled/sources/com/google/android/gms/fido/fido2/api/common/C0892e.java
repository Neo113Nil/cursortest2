package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.fido.fido2.api.common.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0892e extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0892e> CREATOR = new q0();

    @Nullable
    public final H a;

    @Nullable
    public final t0 b;

    @Nullable
    public final C0894f c;

    @Nullable
    public final v0 d;

    @Nullable
    public final String e;

    public C0892e(@Nullable H h, @Nullable t0 t0Var, @Nullable C0894f c0894f, @Nullable v0 v0Var, @Nullable String str) {
        this.a = h;
        this.b = t0Var;
        this.c = c0894f;
        this.d = v0Var;
        this.e = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0892e)) {
            return false;
        }
        C0892e c0892e = (C0892e) obj;
        return C0874p.a(this.a, c0892e.a) && C0874p.a(this.b, c0892e.b) && C0874p.a(this.c, c0892e.c) && C0874p.a(this.d, c0892e.d) && C0874p.a(this.e, c0892e.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @NonNull
    public final JSONObject l() {
        try {
            JSONObject jSONObject = new JSONObject();
            C0894f c0894f = this.c;
            if (c0894f != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", c0894f.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            H h = this.a;
            if (h != null) {
                jSONObject.put("uvm", h.l());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.l());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
        }
    }

    @NonNull
    public final String toString() {
        return android.support.v4.media.b.b("AuthenticationExtensionsClientOutputs{", l().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 5, this.e, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
