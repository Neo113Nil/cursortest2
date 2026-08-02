package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzgq implements Cloneable {
    private Object value;
    private zzgo<?, ?> zzxx;
    private List<zzgv> zzxy = new ArrayList();

    zzgq() {
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzb()];
        zza(zzgl.zzf(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: zzgo, reason: merged with bridge method [inline-methods] */
    public final zzgq clone() {
        Object clone;
        zzgq zzgqVar = new zzgq();
        try {
            zzgqVar.zzxx = this.zzxx;
            if (this.zzxy == null) {
                zzgqVar.zzxy = null;
            } else {
                zzgqVar.zzxy.addAll(this.zzxy);
            }
            if (this.value != null) {
                if (this.value instanceof zzgt) {
                    clone = (zzgt) ((zzgt) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    clone = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzgqVar.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        clone = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        clone = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        clone = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        clone = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        clone = ((double[]) this.value).clone();
                    } else if (this.value instanceof zzgt[]) {
                        zzgt[] zzgtVarArr = (zzgt[]) this.value;
                        zzgt[] zzgtVarArr2 = new zzgt[zzgtVarArr.length];
                        zzgqVar.value = zzgtVarArr2;
                        while (i < zzgtVarArr.length) {
                            zzgtVarArr2[i] = (zzgt) zzgtVarArr[i].clone();
                            i++;
                        }
                    }
                }
                zzgqVar.value = clone;
            }
            return zzgqVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        List<zzgv> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgq)) {
            return false;
        }
        zzgq zzgqVar = (zzgq) obj;
        if (this.value == null || zzgqVar.value == null) {
            List<zzgv> list2 = this.zzxy;
            if (list2 != null && (list = zzgqVar.zzxy) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), zzgqVar.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        zzgo<?, ?> zzgoVar = this.zzxx;
        if (zzgoVar != zzgqVar.zzxx) {
            return false;
        }
        if (!zzgoVar.zzxs.isArray()) {
            return this.value.equals(zzgqVar.value);
        }
        Object obj2 = this.value;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) zzgqVar.value) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) zzgqVar.value) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) zzgqVar.value) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) zzgqVar.value) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) zzgqVar.value) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) zzgqVar.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) zzgqVar.value);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final void zza(zzgl zzglVar) throws IOException {
        if (this.value != null) {
            throw new NoSuchMethodError();
        }
        for (zzgv zzgvVar : this.zzxy) {
            zzglVar.zzba(zzgvVar.tag);
            zzglVar.zzg(zzgvVar.zzmp);
        }
    }

    final void zza(zzgv zzgvVar) throws IOException {
        List<zzgv> list = this.zzxy;
        if (list != null) {
            list.add(zzgvVar);
            return;
        }
        Object obj = this.value;
        if (!(obj instanceof zzgt)) {
            if (obj instanceof zzgt[]) {
                Collections.singletonList(zzgvVar);
                throw new NoSuchMethodError();
            }
            Collections.singletonList(zzgvVar);
            throw new NoSuchMethodError();
        }
        byte[] bArr = zzgvVar.zzmp;
        zzgk zzi = zzgk.zzi(bArr, 0, bArr.length);
        int zzcu = zzi.zzcu();
        if (zzcu != bArr.length - zzgl.zzab(zzcu)) {
            throw zzgs.zzgp();
        }
        zzgt zza = ((zzgt) this.value).zza(zzi);
        this.zzxx = this.zzxx;
        this.value = zza;
        this.zzxy = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final int zzb() {
        if (this.value != null) {
            throw new NoSuchMethodError();
        }
        int i = 0;
        for (zzgv zzgvVar : this.zzxy) {
            i += zzgl.zzai(zzgvVar.tag) + 0 + zzgvVar.zzmp.length;
        }
        return i;
    }
}
