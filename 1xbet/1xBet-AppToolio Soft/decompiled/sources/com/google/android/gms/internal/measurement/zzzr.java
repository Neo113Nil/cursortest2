package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzzr<FieldDescriptorType extends zzzt<FieldDescriptorType>> {
    private static final zzzr zzbub = new zzzr(true);
    private boolean zzbnw;
    private boolean zzbua = false;
    private final zzabd<FieldDescriptorType, Object> zzbtz = zzabd.zzag(16);

    private zzzr() {
    }

    private zzzr(boolean z) {
        if (this.zzbnw) {
            return;
        }
        this.zzbtz.zzru();
        this.zzbnw = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzzx) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzzz) == false) goto L27;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzabu zzabuVar, Object obj) {
        boolean z;
        zzzw.checkNotNull(obj);
        boolean z2 = false;
        switch (zzzs.zzbuc[zzabuVar.zzvk().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                break;
            case 2:
                z = obj instanceof Long;
                z2 = z;
                break;
            case 3:
                z = obj instanceof Float;
                z2 = z;
                break;
            case 4:
                z = obj instanceof Double;
                z2 = z;
                break;
            case 5:
                z = obj instanceof Boolean;
                z2 = z;
                break;
            case 6:
                z = obj instanceof String;
                z2 = z;
                break;
            case 7:
                if (!(obj instanceof zzzb)) {
                    break;
                }
                z2 = true;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = true;
                break;
            case 9:
                if (!(obj instanceof zzaaq)) {
                    break;
                }
                z2 = true;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zztz()) {
            zza(fielddescriptortype.zzty(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzty(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzzz) {
            this.zzbua = true;
        }
        this.zzbtz.zza((zzabd<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    public static <T extends zzzt<T>> zzzr<T> zztx() {
        return zzbub;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzzr zzzrVar = new zzzr();
        for (int i = 0; i < this.zzbtz.zzuy(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzah = this.zzbtz.zzah(i);
            zzzrVar.zza((zzzr) zzah.getKey(), zzah.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzbtz.zzuz()) {
            zzzrVar.zza((zzzr) entry.getKey(), entry.getValue());
        }
        zzzrVar.zzbua = this.zzbua;
        return zzzrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzzr) {
            return this.zzbtz.equals(((zzzr) obj).zzbtz);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbtz.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzbua ? new zzaac(this.zzbtz.entrySet().iterator()) : this.zzbtz.entrySet().iterator();
    }
}
