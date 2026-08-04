package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import p074k3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse extends a implements SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
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
        for (FastJsonResponse$Field<?, ?> fastJsonResponse$Field : getFieldMappings().values()) {
            if (isFieldSet(fastJsonResponse$Field)) {
                if (!aVar.isFieldSet(fastJsonResponse$Field) || !D.m(getFieldValue(fastJsonResponse$Field), aVar.getFieldValue(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (aVar.isFieldSet(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // p074k3.a
    @VisibleForTesting
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse$Field<?, ?> fastJsonResponse$Field : getFieldMappings().values()) {
            if (isFieldSet(fastJsonResponse$Field)) {
                Object fieldValue = getFieldValue(fastJsonResponse$Field);
                D.i(fieldValue);
                iHashCode = (iHashCode * 31) + fieldValue.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // p074k3.a
    @VisibleForTesting
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
