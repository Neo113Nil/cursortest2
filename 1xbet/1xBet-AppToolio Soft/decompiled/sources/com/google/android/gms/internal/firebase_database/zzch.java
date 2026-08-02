package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzch implements Comparable<zzch>, Iterable<zzid> {
    private static final zzch zzhs = new zzch("");
    private final int end;
    private final int start;
    private final zzid[] zzhr;

    public zzch(String str) {
        String[] split = str.split("/");
        int i = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i++;
            }
        }
        this.zzhr = new zzid[i];
        int i2 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.zzhr[i2] = zzid.zzt(str3);
                i2++;
            }
        }
        this.start = 0;
        this.end = this.zzhr.length;
    }

    public zzch(List<String> list) {
        this.zzhr = new zzid[list.size()];
        Iterator<String> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.zzhr[i] = zzid.zzt(it.next());
            i++;
        }
        this.start = 0;
        this.end = list.size();
    }

    public zzch(zzid... zzidVarArr) {
        this.zzhr = (zzid[]) Arrays.copyOf(zzidVarArr, zzidVarArr.length);
        this.start = 0;
        this.end = zzidVarArr.length;
    }

    private zzch(zzid[] zzidVarArr, int i, int i2) {
        this.zzhr = zzidVarArr;
        this.start = i;
        this.end = i2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static zzch zza(zzch zzchVar, zzch zzchVar2) {
        while (true) {
            zzid zzbw = zzchVar.zzbw();
            zzid zzbw2 = zzchVar2.zzbw();
            if (zzbw == null) {
                return zzchVar2;
            }
            if (!zzbw.equals(zzbw2)) {
                String valueOf = String.valueOf(zzchVar2);
                String valueOf2 = String.valueOf(zzchVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
                sb.append("INTERNAL ERROR: ");
                sb.append(valueOf);
                sb.append(" is not contained in ");
                sb.append(valueOf2);
                throw new DatabaseException(sb.toString());
            }
            zzchVar = zzchVar.zzbx();
            zzchVar2 = zzchVar2.zzbx();
        }
    }

    public static zzch zzbt() {
        return zzhs;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzch)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzch zzchVar = (zzch) obj;
        if (size() != zzchVar.size()) {
            return false;
        }
        int i = this.start;
        for (int i2 = zzchVar.start; i < this.end && i2 < zzchVar.end; i2++) {
            if (!this.zzhr[i].equals(zzchVar.zzhr[i2])) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 37) + this.zzhr[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.start >= this.end;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzid> iterator() {
        return new zzci(this);
    }

    public final int size() {
        return this.end - this.start;
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.start; i < this.end; i++) {
            sb.append("/");
            sb.append(this.zzhr[i].zzfg());
        }
        return sb.toString();
    }

    public final zzch zza(zzid zzidVar) {
        int size = size();
        int i = size + 1;
        zzid[] zzidVarArr = new zzid[i];
        System.arraycopy(this.zzhr, this.start, zzidVarArr, 0, size);
        zzidVarArr[size] = zzidVar;
        return new zzch(zzidVarArr, 0, i);
    }

    public final String zzbu() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.start; i < this.end; i++) {
            if (i > this.start) {
                sb.append("/");
            }
            sb.append(this.zzhr[i].zzfg());
        }
        return sb.toString();
    }

    public final List<String> zzbv() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<zzid> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().zzfg());
        }
        return arrayList;
    }

    public final zzid zzbw() {
        if (isEmpty()) {
            return null;
        }
        return this.zzhr[this.start];
    }

    public final zzch zzbx() {
        int i = this.start;
        if (!isEmpty()) {
            i++;
        }
        return new zzch(this.zzhr, i, this.end);
    }

    public final zzch zzby() {
        if (isEmpty()) {
            return null;
        }
        return new zzch(this.zzhr, this.start, this.end - 1);
    }

    public final zzid zzbz() {
        if (isEmpty()) {
            return null;
        }
        return this.zzhr[this.end - 1];
    }

    public final zzch zzh(zzch zzchVar) {
        int size = size() + zzchVar.size();
        zzid[] zzidVarArr = new zzid[size];
        System.arraycopy(this.zzhr, this.start, zzidVarArr, 0, size());
        System.arraycopy(zzchVar.zzhr, zzchVar.start, zzidVarArr, size(), zzchVar.size());
        return new zzch(zzidVarArr, 0, size);
    }

    public final boolean zzi(zzch zzchVar) {
        if (size() > zzchVar.size()) {
            return false;
        }
        int i = this.start;
        int i2 = zzchVar.start;
        while (i < this.end) {
            if (!this.zzhr[i].equals(zzchVar.zzhr[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzch zzchVar) {
        int i = this.start;
        int i2 = zzchVar.start;
        while (i < this.end && i2 < zzchVar.end) {
            int compareTo = this.zzhr[i].compareTo(zzchVar.zzhr[i2]);
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
            i2++;
        }
        if (i == this.end && i2 == zzchVar.end) {
            return 0;
        }
        return i == this.end ? -1 : 1;
    }
}
