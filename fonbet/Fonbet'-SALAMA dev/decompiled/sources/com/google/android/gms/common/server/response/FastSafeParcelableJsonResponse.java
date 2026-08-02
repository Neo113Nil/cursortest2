package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import k3.AbstractC1336a;

/* loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse extends AbstractC1336a implements SafeParcelable {
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
        AbstractC1336a abstractC1336a = (AbstractC1336a) obj;
        for (FastJsonResponse$Field<?, ?> fastJsonResponse$Field : getFieldMappings().values()) {
            if (isFieldSet(fastJsonResponse$Field)) {
                if (!abstractC1336a.isFieldSet(fastJsonResponse$Field) || !D.m(getFieldValue(fastJsonResponse$Field), abstractC1336a.getFieldValue(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (abstractC1336a.isFieldSet(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // k3.AbstractC1336a
    @VisibleForTesting
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i7 = 0;
        for (FastJsonResponse$Field<?, ?> fastJsonResponse$Field : getFieldMappings().values()) {
            if (isFieldSet(fastJsonResponse$Field)) {
                Object fieldValue = getFieldValue(fastJsonResponse$Field);
                D.i(fieldValue);
                i7 = (i7 * 31) + fieldValue.hashCode();
            }
        }
        return i7;
    }

    @Override // k3.AbstractC1336a
    @VisibleForTesting
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
