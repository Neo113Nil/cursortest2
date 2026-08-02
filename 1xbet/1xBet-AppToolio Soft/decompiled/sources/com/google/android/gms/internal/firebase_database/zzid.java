package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public class zzid implements Comparable<zzid> {
    private static final zzid zzqx = new zzid("[MIN_KEY]");
    private static final zzid zzqy = new zzid("[MAX_KEY]");
    private static final zzid zzqz = new zzid(".priority");
    private static final zzid zzra = new zzid(".info");
    private final String zzqw;

    private static class zza extends zzid {
        private final int zzrb;

        zza(String str, int i) {
            super(str);
            this.zzrb = i;
        }

        @Override // com.google.android.gms.internal.firebase_database.zzid
        protected final int intValue() {
            return this.zzrb;
        }

        @Override // com.google.android.gms.internal.firebase_database.zzid
        public final String toString() {
            String str = ((zzid) this).zzqw;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20);
            sb.append("IntegerChildName(\"");
            sb.append(str);
            sb.append("\")");
            return sb.toString();
        }

        @Override // com.google.android.gms.internal.firebase_database.zzid
        protected final boolean zzfi() {
            return true;
        }
    }

    private zzid(String str) {
        this.zzqw = str;
    }

    public static zzid zzfc() {
        return zzqx;
    }

    public static zzid zzfd() {
        return zzqy;
    }

    public static zzid zzfe() {
        return zzqz;
    }

    public static zzid zzff() {
        return zzra;
    }

    public static zzid zzt(String str) {
        Integer zzaa = zzkq.zzaa(str);
        return zzaa != null ? new zza(str, zzaa.intValue()) : str.equals(".priority") ? zzqz : new zzid(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzid)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.zzqw.equals(((zzid) obj).zzqw);
    }

    public int hashCode() {
        return this.zzqw.hashCode();
    }

    protected int intValue() {
        return 0;
    }

    public String toString() {
        String str = this.zzqw;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append("ChildKey(\"");
        sb.append(str);
        sb.append("\")");
        return sb.toString();
    }

    public final String zzfg() {
        return this.zzqw;
    }

    public final boolean zzfh() {
        return this == zzqz;
    }

    protected boolean zzfi() {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzid zzidVar) {
        zzid zzidVar2;
        if (this == zzidVar) {
            return 0;
        }
        zzid zzidVar3 = zzqx;
        if (this == zzidVar3 || zzidVar == (zzidVar2 = zzqy)) {
            return -1;
        }
        if (zzidVar == zzidVar3 || this == zzidVar2) {
            return 1;
        }
        if (!zzfi()) {
            if (zzidVar.zzfi()) {
                return 1;
            }
            return this.zzqw.compareTo(zzidVar.zzqw);
        }
        if (!zzidVar.zzfi()) {
            return -1;
        }
        int zza2 = zzkq.zza(intValue(), zzidVar.intValue());
        return zza2 == 0 ? zzkq.zza(this.zzqw.length(), zzidVar.zzqw.length()) : zza2;
    }
}
