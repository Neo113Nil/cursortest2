package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
final class zzabe<FieldDescriptorType> extends zzabd<FieldDescriptorType, Object> {
    zzabe(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzabd
    public final void zzru() {
        if (!isImmutable()) {
            for (int i = 0; i < zzuy(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzah = zzah(i);
                if (((zzzt) zzah.getKey()).zztz()) {
                    zzah.setValue(Collections.unmodifiableList((List) zzah.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzuz()) {
                if (((zzzt) entry.getKey()).zztz()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzru();
    }
}
