package com.google.android.gms.internal.firebase_auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
final class zzez<FieldDescriptorType> extends zzey<FieldDescriptorType, Object> {
    zzez(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzey
    public final void zzbs() {
        if (!isImmutable()) {
            for (int i = 0; i < zzfo(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzau = zzau(i);
                if (((zzcu) zzau.getKey()).zzdv()) {
                    zzau.setValue(Collections.unmodifiableList((List) zzau.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzfp()) {
                if (((zzcu) entry.getKey()).zzdv()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzbs();
    }
}
