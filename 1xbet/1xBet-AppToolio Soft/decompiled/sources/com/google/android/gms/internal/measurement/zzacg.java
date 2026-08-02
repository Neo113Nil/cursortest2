package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzacg implements Cloneable {
    private Object value;
    private zzace<?, ?> zzbzl;
    private List<zzacl> zzbzm = new ArrayList();

    zzacg() {
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zza()];
        zza(zzacb.zzj(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: zzvv, reason: merged with bridge method [inline-methods] */
    public final zzacg clone() {
        Object clone;
        zzacg zzacgVar = new zzacg();
        try {
            zzacgVar.zzbzl = this.zzbzl;
            if (this.zzbzm == null) {
                zzacgVar.zzbzm = null;
            } else {
                zzacgVar.zzbzm.addAll(this.zzbzm);
            }
            if (this.value != null) {
                if (this.value instanceof zzacj) {
                    clone = (zzacj) ((zzacj) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    clone = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzacgVar.value = bArr2;
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
                    } else if (this.value instanceof zzacj[]) {
                        zzacj[] zzacjVarArr = (zzacj[]) this.value;
                        zzacj[] zzacjVarArr2 = new zzacj[zzacjVarArr.length];
                        zzacgVar.value = zzacjVarArr2;
                        while (i < zzacjVarArr.length) {
                            zzacjVarArr2[i] = (zzacj) zzacjVarArr[i].clone();
                            i++;
                        }
                    }
                }
                zzacgVar.value = clone;
            }
            return zzacgVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        List<zzacl> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacg)) {
            return false;
        }
        zzacg zzacgVar = (zzacg) obj;
        if (this.value == null || zzacgVar.value == null) {
            List<zzacl> list2 = this.zzbzm;
            if (list2 != null && (list = zzacgVar.zzbzm) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), zzacgVar.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        zzace<?, ?> zzaceVar = this.zzbzl;
        if (zzaceVar != zzacgVar.zzbzl) {
            return false;
        }
        if (!zzaceVar.zzbze.isArray()) {
            return this.value.equals(zzacgVar.value);
        }
        Object obj2 = this.value;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) zzacgVar.value) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) zzacgVar.value) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) zzacgVar.value) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) zzacgVar.value) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) zzacgVar.value) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) zzacgVar.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) zzacgVar.value);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    final int zza() {
        Object obj = this.value;
        if (obj == null) {
            int i = 0;
            for (zzacl zzaclVar : this.zzbzm) {
                i += zzacb.zzas(zzaclVar.tag) + 0 + zzaclVar.zzbtj.length;
            }
            return i;
        }
        zzace<?, ?> zzaceVar = this.zzbzl;
        if (!zzaceVar.zzbzf) {
            return zzaceVar.zzv(obj);
        }
        int length = Array.getLength(obj);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (Array.get(obj, i3) != null) {
                i2 += zzaceVar.zzv(Array.get(obj, i3));
            }
        }
        return i2;
    }

    final void zza(zzacb zzacbVar) throws IOException {
        Object obj = this.value;
        if (obj == null) {
            for (zzacl zzaclVar : this.zzbzm) {
                zzacbVar.zzar(zzaclVar.tag);
                zzacbVar.zzk(zzaclVar.zzbtj);
            }
            return;
        }
        zzace<?, ?> zzaceVar = this.zzbzl;
        if (!zzaceVar.zzbzf) {
            zzaceVar.zza(obj, zzacbVar);
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                zzaceVar.zza(obj2, zzacbVar);
            }
        }
    }

    final void zza(zzacl zzaclVar) throws IOException {
        Object zzi;
        List<zzacl> list = this.zzbzm;
        if (list != null) {
            list.add(zzaclVar);
            return;
        }
        Object obj = this.value;
        if (obj instanceof zzacj) {
            byte[] bArr = zzaclVar.zzbtj;
            zzaca zza = zzaca.zza(bArr, 0, bArr.length);
            int zzvn = zza.zzvn();
            if (zzvn != bArr.length - zzacb.zzao(zzvn)) {
                throw zzaci.zzvw();
            }
            zzi = ((zzacj) this.value).zzb(zza);
        } else if (obj instanceof zzacj[]) {
            zzacj[] zzacjVarArr = (zzacj[]) this.zzbzl.zzi(Collections.singletonList(zzaclVar));
            zzacj[] zzacjVarArr2 = (zzacj[]) this.value;
            zzacj[] zzacjVarArr3 = (zzacj[]) Arrays.copyOf(zzacjVarArr2, zzacjVarArr2.length + zzacjVarArr.length);
            System.arraycopy(zzacjVarArr, 0, zzacjVarArr3, zzacjVarArr2.length, zzacjVarArr.length);
            zzi = zzacjVarArr3;
        } else {
            zzi = this.zzbzl.zzi(Collections.singletonList(zzaclVar));
        }
        this.zzbzl = this.zzbzl;
        this.value = zzi;
        this.zzbzm = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final <T> T zzb(zzace<?, T> zzaceVar) {
        if (this.value == null) {
            this.zzbzl = zzaceVar;
            this.value = zzaceVar.zzi(this.zzbzm);
            this.zzbzm = null;
        } else if (!this.zzbzl.equals(zzaceVar)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return (T) this.value;
    }
}
