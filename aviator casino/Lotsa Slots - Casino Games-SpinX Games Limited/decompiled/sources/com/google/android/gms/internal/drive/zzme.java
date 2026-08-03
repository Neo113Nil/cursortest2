package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzme implements com.google.android.gms.internal.drive.zzlo {
    private final int flags;
    private final java.lang.String info;
    private final java.lang.Object[] zzue;
    private final com.google.android.gms.internal.drive.zzlq zzuh;

    zzme(com.google.android.gms.internal.drive.zzlq zzlqVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zzuh = zzlqVar;
        this.info = str;
        this.zzue = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    final java.lang.String zzek() {
        return this.info;
    }

    final java.lang.Object[] zzel() {
        return this.zzue;
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final com.google.android.gms.internal.drive.zzlq zzee() {
        return this.zzuh;
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final int zzec() {
        return (this.flags & 1) == 1 ? com.google.android.gms.internal.drive.zzkk.zze.zzsf : com.google.android.gms.internal.drive.zzkk.zze.zzsg;
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final boolean zzed() {
        return (this.flags & 2) == 2;
    }
}
