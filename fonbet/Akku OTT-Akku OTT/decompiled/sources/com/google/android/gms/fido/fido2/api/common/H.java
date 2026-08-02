package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class H extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<H> CREATOR = new o0();

    @Nullable
    public final List a;

    public H(@Nullable ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        List list;
        if (!(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        List list2 = this.a;
        if (list2 == null && h.a == null) {
            return true;
        }
        return list2 != null && (list = h.a) != null && list2.containsAll(list) && h.a.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @NonNull
    public final JSONArray l() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.a;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    I i2 = (I) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) i2.c);
                    jSONArray2.put((int) i2.b);
                    jSONArray2.put((int) i2.c);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
