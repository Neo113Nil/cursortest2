package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import t3.l;

@Deprecated
/* loaded from: classes.dex */
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new l(18);

    /* renamed from: a, reason: collision with root package name */
    public final KeyHandle f11546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11548c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        D.i(keyHandle);
        this.f11546a = keyHandle;
        this.f11548c = str;
        this.f11547b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.f11548c;
        if (str == null) {
            if (registeredKey.f11548c != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.f11548c)) {
            return false;
        }
        if (!this.f11546a.equals(registeredKey.f11546a)) {
            return false;
        }
        String str2 = registeredKey.f11547b;
        String str3 = this.f11547b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f11548c;
        int hashCode = this.f11546a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f11547b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        KeyHandle keyHandle = this.f11546a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.f11529b, 11));
            ProtocolVersion protocolVersion = keyHandle.f11530c;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.f11534a);
            }
            ArrayList arrayList = keyHandle.f11531d;
            if (arrayList != null) {
                jSONObject.put("transports", arrayList.toString());
            }
            String str = this.f11548c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f11547b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 2, this.f11546a, i7, false);
        Y4.D.s0(parcel, 3, this.f11548c, false);
        Y4.D.s0(parcel, 4, this.f11547b, false);
        Y4.D.z0(x02, parcel);
    }
}
