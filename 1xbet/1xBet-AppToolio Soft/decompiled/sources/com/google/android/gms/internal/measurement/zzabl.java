package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzabl {
    static String zza(zzzb zzzbVar) {
        String str;
        zzabm zzabmVar = new zzabm(zzzbVar);
        StringBuilder sb = new StringBuilder(zzabmVar.size());
        for (int i = 0; i < zzabmVar.size(); i++) {
            int zzae = zzabmVar.zzae(i);
            if (zzae == 34) {
                str = "\\\"";
            } else if (zzae == 39) {
                str = "\\'";
            } else if (zzae != 92) {
                switch (zzae) {
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
                        if (zzae < 32 || zzae > 126) {
                            sb.append('\\');
                            sb.append((char) (((zzae >>> 6) & 3) + 48));
                            sb.append((char) (((zzae >>> 3) & 7) + 48));
                            zzae = (zzae & 7) + 48;
                        }
                        sb.append((char) zzae);
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
