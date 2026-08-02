package com.google.android.gms.internal.firebase_database;

import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class zzkq {
    private static final char[] zzuq = "0123456789abcdef".toCharArray();

    public static int zza(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static void zza(boolean z, String str) {
        if (z) {
            return;
        }
        String valueOf = String.valueOf(str);
        throw new AssertionError(valueOf.length() != 0 ? "hardAssert failed: ".concat(valueOf) : new String("hardAssert failed: "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (r2 > 2147483647L) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer zzaa(String str) {
        if (str.length() <= 11 && str.length() != 0) {
            int i = 0;
            boolean z = true;
            if (str.charAt(0) != '-') {
                z = false;
            } else {
                if (str.length() == 1) {
                    return null;
                }
                i = 1;
            }
            long j = 0;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt < '0' || charAt > '9') {
                    return null;
                }
                j = (j * 10) + (charAt - '0');
                i++;
            }
            if (z) {
                j = -j;
                if (j < -2147483648L) {
                    return null;
                }
            }
            return Integer.valueOf((int) j);
        }
        return null;
    }

    public static int zzb(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static zzkn<Task<Void>, DatabaseReference.CompletionListener> zzb(DatabaseReference.CompletionListener completionListener) {
        if (completionListener != null) {
            return new zzkn<>(null, completionListener);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        return new zzkn<>(taskCompletionSource.getTask(), new zzkr(taskCompletionSource));
    }

    public static String zzc(double d) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d);
        for (int i = 7; i >= 0; i--) {
            int i2 = (int) ((doubleToLongBits >>> (i << 3)) & 255);
            sb.append(zzuq[(i2 >> 4) & 15]);
            sb.append(zzuq[i2 & 15]);
        }
        return sb.toString();
    }

    public static void zzf(boolean z) {
        zza(z, "");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static zzko zzx(String str) throws DatabaseException {
        try {
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                throw new URISyntaxException(str, "Invalid scheme specified");
            }
            int i = indexOf + 2;
            int indexOf2 = str.substring(i).indexOf("/");
            if (indexOf2 != -1) {
                int i2 = indexOf2 + i;
                String[] split = str.substring(i2).split("/");
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < split.length; i3++) {
                    if (!split[i3].equals("")) {
                        sb.append("/");
                        sb.append(URLEncoder.encode(split[i3], "UTF-8"));
                    }
                }
                String valueOf = String.valueOf(str.substring(0, i2));
                String valueOf2 = String.valueOf(sb.toString());
                str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            URI uri = new URI(str);
            String replace = uri.getPath().replace("+", " ");
            zzks.zzac(replace);
            zzch zzchVar = new zzch(replace);
            String scheme = uri.getScheme();
            zzdn zzdnVar = new zzdn();
            zzdnVar.zzct = uri.getHost().toLowerCase();
            int port = uri.getPort();
            if (port != -1) {
                zzdnVar.zzcv = scheme.equals("https");
                String valueOf3 = String.valueOf(zzdnVar.zzct);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 12);
                sb2.append(valueOf3);
                sb2.append(":");
                sb2.append(port);
                zzdnVar.zzct = sb2.toString();
            } else {
                zzdnVar.zzcv = true;
            }
            zzdnVar.zzcu = zzdnVar.zzct.split("\\.")[0].toLowerCase();
            zzdnVar.zzka = zzdnVar.zzct;
            zzko zzkoVar = new zzko();
            zzkoVar.zzap = zzchVar;
            zzkoVar.zzag = zzdnVar;
            return zzkoVar;
        } catch (UnsupportedEncodingException e) {
            throw new DatabaseException("Failed to URLEncode the path", e);
        } catch (URISyntaxException e2) {
            throw new DatabaseException("Invalid Firebase Database url specified", e2);
        }
    }

    public static String zzy(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e);
        }
    }

    public static String zzz(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 2);
        sb.append('\"');
        sb.append(replace);
        sb.append('\"');
        return sb.toString();
    }
}
