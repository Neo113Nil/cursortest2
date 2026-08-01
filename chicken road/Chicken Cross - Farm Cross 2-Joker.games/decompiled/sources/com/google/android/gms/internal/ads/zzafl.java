package com.google.android.gms.internal.ads;

import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzafl {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;

    private zzafl(int i, String str, int i2, int i3, int i4) {
        this.zza = i;
        this.zze = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f5, code lost:
    
        if (r4.zzj(1) > 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0224 A[Catch: RuntimeException -> 0x026f, TryCatch #0 {RuntimeException -> 0x026f, blocks: (B:3:0x0008, B:6:0x001b, B:9:0x0039, B:13:0x005f, B:16:0x0080, B:18:0x00d0, B:20:0x00df, B:22:0x00e9, B:24:0x0114, B:26:0x011a, B:28:0x012e, B:30:0x0137, B:32:0x013f, B:34:0x0153, B:36:0x0160, B:38:0x0174, B:40:0x017a, B:42:0x018e, B:44:0x0194, B:46:0x01a8, B:48:0x01b0, B:50:0x01bc, B:52:0x01bf, B:55:0x01c2, B:57:0x01d8, B:58:0x01de, B:60:0x01e7, B:61:0x01ea, B:64:0x01f7, B:66:0x01fd, B:68:0x0202, B:69:0x0205, B:72:0x0210, B:73:0x0217, B:76:0x021e, B:78:0x0224, B:80:0x0233, B:87:0x0257, B:90:0x0262, B:95:0x0253, B:100:0x01f1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0233 A[Catch: RuntimeException -> 0x026f, TryCatch #0 {RuntimeException -> 0x026f, blocks: (B:3:0x0008, B:6:0x001b, B:9:0x0039, B:13:0x005f, B:16:0x0080, B:18:0x00d0, B:20:0x00df, B:22:0x00e9, B:24:0x0114, B:26:0x011a, B:28:0x012e, B:30:0x0137, B:32:0x013f, B:34:0x0153, B:36:0x0160, B:38:0x0174, B:40:0x017a, B:42:0x018e, B:44:0x0194, B:46:0x01a8, B:48:0x01b0, B:50:0x01bc, B:52:0x01bf, B:55:0x01c2, B:57:0x01d8, B:58:0x01de, B:60:0x01e7, B:61:0x01ea, B:64:0x01f7, B:66:0x01fd, B:68:0x0202, B:69:0x0205, B:72:0x0210, B:73:0x0217, B:76:0x021e, B:78:0x0224, B:80:0x0233, B:87:0x0257, B:90:0x0262, B:95:0x0253, B:100:0x01f1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafl zza(byte[] bArr) throws zzat {
        int i;
        int i2;
        int zzj;
        try {
            zzet zzetVar = new zzet(bArr, bArr.length);
            zzetVar.zzg();
            int zzj2 = zzetVar.zzj(7);
            if (zzj2 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(zzj2);
                zzeh.zzc("Av1Config", sb.toString());
                return null;
            }
            int zzj3 = zzetVar.zzj(3);
            int zzj4 = zzetVar.zzj(5);
            boolean zzi = zzetVar.zzi();
            int i3 = zzetVar.zzi() ? true != zzetVar.zzi() ? 10 : 12 : 8;
            zzetVar.zzh(13);
            Object[] objArr = {Integer.valueOf(zzj4)};
            String str = zzfm.zza;
            String format = String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, objArr);
            String str2 = true != zzi ? "M" : "H";
            String format2 = String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzj3).length() + 6 + String.valueOf(format).length() + 2 + String.valueOf(format2).length());
            sb2.append("av01.");
            sb2.append(zzj3);
            sb2.append(".");
            sb2.append(format);
            sb2.append(str2);
            sb2.append(".");
            sb2.append(format2);
            String sb3 = sb2.toString();
            if (zzetVar.zzc() <= 0) {
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            zzetVar.zzg();
            int zzj5 = zzetVar.zzj(4);
            if (zzj5 != 1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(zzj5).length() + 22);
                sb4.append("Unsupported obu_type: ");
                sb4.append(zzj5);
                zzeh.zzb("Av1Config", sb4.toString());
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported obu_extension_flag");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            boolean zzi2 = zzetVar.zzi();
            zzetVar.zzg();
            if (zzi2 && zzetVar.zzj(8) > 127) {
                zzeh.zzb("Av1Config", "Excessive obu_size");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            int zzj6 = zzetVar.zzj(3);
            zzetVar.zzg();
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported reduced_still_picture_header");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported timing_info_present_flag");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            if (zzetVar.zzi()) {
                zzeh.zzb("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new zzafl(i3, sb3, -1, -1, -1);
            }
            int zzj7 = zzetVar.zzj(5);
            boolean z = false;
            for (int i4 = 0; i4 <= zzj7; i4++) {
                zzetVar.zzh(12);
                if (zzetVar.zzj(5) > 7) {
                    zzetVar.zzg();
                }
            }
            int zzj8 = zzetVar.zzj(4);
            int zzj9 = zzetVar.zzj(4);
            zzetVar.zzh(zzj8 + 1);
            zzetVar.zzh(zzj9 + 1);
            if (zzetVar.zzi()) {
                i = 7;
                zzetVar.zzh(7);
            } else {
                i = 7;
            }
            zzetVar.zzh(i);
            boolean zzi3 = zzetVar.zzi();
            if (zzi3) {
                zzetVar.zzh(2);
            }
            if (!zzetVar.zzi()) {
            }
            if (!zzetVar.zzi()) {
                zzetVar.zzh(1);
            }
            if (zzi3) {
                zzetVar.zzh(3);
            }
            zzetVar.zzh(3);
            boolean zzi4 = zzetVar.zzi();
            if (zzj6 == 2) {
                if (zzi4) {
                    zzetVar.zzg();
                }
            } else if (zzj6 == 1) {
                if (zzetVar.zzi()) {
                    return new zzafl(i3, sb3, -1, -1, -1);
                }
                int zzj10 = zzetVar.zzj(8);
                int zzj11 = zzetVar.zzj(8);
                int zzj12 = zzetVar.zzj(8);
                if (z || zzj10 != 1) {
                    i2 = zzj11;
                } else {
                    if (zzj11 != 13) {
                        i2 = zzj11;
                    } else {
                        if (zzj12 == 0) {
                            i2 = 13;
                            zzj10 = 1;
                            zzj = 1;
                            return new zzafl(i3, sb3, zzi.zzb(zzj10), zzj != 1 ? 1 : 2, zzi.zzc(i2));
                        }
                        i2 = 13;
                    }
                    zzj10 = 1;
                }
                zzj = zzetVar.zzj(1);
                return new zzafl(i3, sb3, zzi.zzb(zzj10), zzj != 1 ? 1 : 2, zzi.zzc(i2));
            }
            if (zzetVar.zzi()) {
                z = true;
            }
            if (zzetVar.zzi()) {
            }
        } catch (RuntimeException e) {
            throw zzat.zzb("Error parsing AV1 config", e);
        }
    }
}
