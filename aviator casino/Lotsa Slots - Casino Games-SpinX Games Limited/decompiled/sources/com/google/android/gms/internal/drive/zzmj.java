package com.google.android.gms.internal.drive;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes4.dex */
final class zzmj<FieldDescriptorType> extends com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object> {
    zzmj(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.drive.zzmi
    public final void zzbp() {
        if (!isImmutable()) {
            for (int i = 0; i < zzer(); i++) {
                java.util.Map.Entry<FieldDescriptorType, java.lang.Object> zzaw = zzaw(i);
                if (((com.google.android.gms.internal.drive.zzkd) zzaw.getKey()).zzcs()) {
                    zzaw.setValue(java.util.Collections.unmodifiableList((java.util.List) zzaw.getValue()));
                }
            }
            for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : zzes()) {
                if (((com.google.android.gms.internal.drive.zzkd) entry.getKey()).zzcs()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zzbp();
    }
}
