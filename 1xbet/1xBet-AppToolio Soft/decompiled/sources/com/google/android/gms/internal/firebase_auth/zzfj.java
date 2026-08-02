package com.google.android.gms.internal.firebase_auth;

/* loaded from: classes.dex */
final class zzfj {
    static String zzd(zzbu zzbuVar) {
        String str;
        zzfk zzfkVar = new zzfk(zzbuVar);
        StringBuilder sb = new StringBuilder(zzfkVar.size());
        for (int i = 0; i < zzfkVar.size(); i++) {
            int zzk = zzfkVar.zzk(i);
            if (zzk == 34) {
                str = "\\\"";
            } else if (zzk == 39) {
                str = "\\'";
            } else if (zzk != 92) {
                switch (zzk) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (zzk < 32 || zzk > 126) {
                            sb.append('\\');
                            sb.append((char) (((zzk >>> 6) & 3) + 48));
                            sb.append((char) (((zzk >>> 3) & 7) + 48));
                            zzk = (zzk & 7) + 48;
                        }
                        sb.append((char) zzk);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
