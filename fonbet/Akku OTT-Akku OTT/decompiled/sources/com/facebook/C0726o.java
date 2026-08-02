package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nAuthenticationTokenHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationTokenHeader.kt\ncom/facebook/AuthenticationTokenHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* renamed from: com.facebook.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0726o implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<C0726o> CREATOR = new a();

    /* renamed from: com.facebook.o$a */
    public static final class a implements Parcelable.Creator<C0726o> {
        @Override // android.os.Parcelable.Creator
        public final C0726o createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C0726o(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C0726o[] newArray(int i) {
            return new C0726o[i];
        }
    }

    /* renamed from: com.facebook.o$b */
    public static final class b {
    }

    public C0726o(String encodedHeaderString) {
        Intrinsics.checkNotNullParameter(encodedHeaderString, "encodedHeaderString");
        com.facebook.internal.F.c(encodedHeaderString, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        Charset charset = Charsets.UTF_8;
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, charset));
            String alg = jSONObject.optString("alg");
            Intrinsics.checkNotNullExpressionValue(alg, "alg");
            boolean z = alg.length() > 0 && Intrinsics.areEqual(alg, "RS256");
            String optString = jSONObject.optString("kid");
            Intrinsics.checkNotNullExpressionValue(optString, "jsonObj.optString(\"kid\")");
            boolean z2 = optString.length() > 0;
            String optString2 = jSONObject.optString("typ");
            Intrinsics.checkNotNullExpressionValue(optString2, "jsonObj.optString(\"typ\")");
            boolean z3 = optString2.length() > 0;
            if (z && z2 && z3) {
                byte[] decodedBytes2 = Base64.decode(encodedHeaderString, 0);
                Intrinsics.checkNotNullExpressionValue(decodedBytes2, "decodedBytes");
                JSONObject jSONObject2 = new JSONObject(new String(decodedBytes2, charset));
                String string = jSONObject2.getString("alg");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"alg\")");
                this.a = string;
                String string2 = jSONObject2.getString("typ");
                Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"typ\")");
                this.b = string2;
                String string3 = jSONObject2.getString("kid");
                Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(\"kid\")");
                this.c = string3;
                return;
            }
        } catch (JSONException unused) {
        }
        throw new IllegalArgumentException("Invalid Header");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0726o)) {
            return false;
        }
        C0726o c0726o = (C0726o) obj;
        return Intrinsics.areEqual(this.a, c0726o.a) && Intrinsics.areEqual(this.b, c0726o.b) && Intrinsics.areEqual(this.c, c0726o.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.compose.runtime.collection.a.a(androidx.compose.runtime.collection.a.a(527, 31, this.a), 31, this.b);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.a);
        jSONObject.put("typ", this.b);
        jSONObject.put("kid", this.c);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "headerJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
    }

    public C0726o(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        com.facebook.internal.F.e(readString, "alg");
        this.a = readString;
        String readString2 = parcel.readString();
        com.facebook.internal.F.e(readString2, "typ");
        this.b = readString2;
        String readString3 = parcel.readString();
        com.facebook.internal.F.e(readString3, "kid");
        this.c = readString3;
    }
}
