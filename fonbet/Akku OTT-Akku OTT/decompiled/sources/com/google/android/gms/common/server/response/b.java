package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes4.dex */
public abstract class b extends a implements com.google.android.gms.common.internal.safeparcel.d {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0113a<?, ?> c0113a : getFieldMappings().values()) {
            if (isFieldSet(c0113a)) {
                if (!aVar.isFieldSet(c0113a) || !C0874p.a(getFieldValue(c0113a), aVar.getFieldValue(c0113a))) {
                    return false;
                }
            } else if (aVar.isFieldSet(c0113a)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.a
    @Nullable
    public Object getValueObject(@NonNull String str) {
        return null;
    }

    public int hashCode() {
        int i = 0;
        for (a.C0113a<?, ?> c0113a : getFieldMappings().values()) {
            if (isFieldSet(c0113a)) {
                Object fieldValue = getFieldValue(c0113a);
                C0875q.g(fieldValue);
                i = (i * 31) + fieldValue.hashCode();
            }
        }
        return i;
    }

    @Override // com.google.android.gms.common.server.response.a
    public boolean isPrimitiveFieldSet(@NonNull String str) {
        return false;
    }

    @NonNull
    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
