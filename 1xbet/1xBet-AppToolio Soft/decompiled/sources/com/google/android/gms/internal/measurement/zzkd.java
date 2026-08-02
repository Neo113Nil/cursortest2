package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class zzkd extends zzhj {
    private static final String[] zzasx = {"firebase_", "google_", "ga_"};
    private int zzadj;
    private SecureRandom zzasy;
    private final AtomicLong zzasz;
    private Integer zzata;

    zzkd(zzgn zzgnVar) {
        super(zzgnVar);
        this.zzata = null;
        this.zzasz = new AtomicLong(0L);
    }

    static MessageDigest getMessageDigest() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    private static Object zza(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zza(String.valueOf(obj), i, z);
        }
        return null;
    }

    public static String zza(String str, int i, boolean z) {
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    @Nullable
    public static String zza(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            if (zzs(str, strArr[i])) {
                return strArr2[i];
            }
        }
        return null;
    }

    private static void zza(Bundle bundle, Object obj) {
        Preconditions.checkNotNull(bundle);
        if (obj != null) {
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", String.valueOf(obj).length());
            }
        }
    }

    static boolean zza(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return zzc(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    private static boolean zza(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    private final boolean zza(String str, String str2, int i, Object obj, boolean z) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if ((obj instanceof Bundle) && z) {
                    return true;
                }
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            zzgi().zziy().zze("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
                if (!(obj instanceof ArrayList) || !z) {
                    return false;
                }
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        zzgi().zziy().zze("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                zzgi().zziy().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @VisibleForTesting
    static long zzc(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i = 0;
        Preconditions.checkState(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    private static boolean zzc(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean zzcg(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static int zzcl(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    static boolean zzcm(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean zzd(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    @VisibleForTesting
    private final boolean zze(Context context, String str) {
        zzfk zziv;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            zziv = zzgi().zziv();
            str2 = "Package name not found";
            zziv.zzg(str2, e);
            return true;
        } catch (CertificateException e2) {
            e = e2;
            zziv = zzgi().zziv();
            str2 = "Error obtaining certificate";
            zziv.zzg(str2, e);
            return true;
        }
    }

    static Bundle[] zze(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    public static Object zzf(Object obj) {
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    try {
                        Object readObject = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        return readObject;
                    } catch (Throwable th) {
                        th = th;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    private final boolean zzr(String str, String str2) {
        if (str2 == null) {
            zzgi().zziv().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzgi().zziv().zzg("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzgi().zziv().zze("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzgi().zziv().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    static boolean zzs(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    final Bundle zza(@NonNull Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(FirebaseAnalytics.Param.MEDIUM, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            zzgi().zziy().zzg("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0071, code lost:
    
        if (zza("event param", 40, r14) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0052, code lost:
    
        if (zza("event param", 40, r14) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Bundle zza(String str, String str2, Bundle bundle, @Nullable List<String> list, boolean z, boolean z2) {
        int i;
        int i2;
        boolean z3;
        String str3;
        int i3;
        zzkd zzkdVar;
        String str4;
        int i4;
        int size;
        boolean z4;
        String[] strArr = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String next = it.next();
            if (list == null || !list.contains(next)) {
                i = 14;
                if (z) {
                    if (zzq("event param", next)) {
                        if (!zza("event param", strArr, next)) {
                            i2 = 14;
                            if (i2 == 0) {
                                if (zzr("event param", next)) {
                                    if (zza("event param", strArr, next)) {
                                    }
                                }
                                i = 3;
                            } else {
                                i = i2;
                            }
                            if (i != 0) {
                                Object obj = bundle.get(next);
                                zzab();
                                if (z2) {
                                    if (obj instanceof Parcelable[]) {
                                        size = ((Parcelable[]) obj).length;
                                    } else {
                                        if (obj instanceof ArrayList) {
                                            size = ((ArrayList) obj).size();
                                        }
                                        z4 = true;
                                        if (!z4) {
                                            i4 = 17;
                                            z3 = true;
                                            if (i4 != 0 || "_ev".equals(next)) {
                                                if (zzcg(next) || (i5 = i5 + 1) <= 25) {
                                                    strArr = null;
                                                } else {
                                                    StringBuilder sb = new StringBuilder(48);
                                                    sb.append("Event can't contain more than 25 params");
                                                    zzgi().zziv().zze(sb.toString(), zzgf().zzbm(str2), zzgf().zzb(bundle));
                                                    zza(bundle2, 5);
                                                }
                                            } else if (zza(bundle2, i4)) {
                                                bundle2.putString("_ev", zza(next, 40, z3));
                                                zza(bundle2, bundle.get(next));
                                            }
                                        }
                                    }
                                    if (size > 1000) {
                                        zzgi().zziy().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", next, Integer.valueOf(size));
                                        z4 = false;
                                        if (!z4) {
                                        }
                                    }
                                    z4 = true;
                                    if (!z4) {
                                    }
                                }
                                if ((zzgk().zzax(str) && zzcm(str2)) || zzcm(next)) {
                                    str3 = "param";
                                    zzkdVar = this;
                                    str4 = next;
                                    i3 = 256;
                                    z3 = true;
                                } else {
                                    z3 = true;
                                    str3 = "param";
                                    i3 = 100;
                                    zzkdVar = this;
                                    str4 = next;
                                }
                                i4 = zzkdVar.zza(str3, str4, i3, obj, z2) ? 0 : 4;
                                if (i4 != 0) {
                                }
                                if (zzcg(next)) {
                                }
                                strArr = null;
                            } else if (zza(bundle2, i)) {
                                bundle2.putString("_ev", zza(next, 40, true));
                                if (i == 3) {
                                    zza(bundle2, next);
                                }
                            }
                            bundle2.remove(next);
                            strArr = null;
                        }
                    }
                    i2 = 3;
                    if (i2 == 0) {
                    }
                    if (i != 0) {
                    }
                    bundle2.remove(next);
                    strArr = null;
                }
                i2 = 0;
                if (i2 == 0) {
                }
                if (i != 0) {
                }
                bundle2.remove(next);
                strArr = null;
            }
            i = 0;
            if (i != 0) {
            }
            bundle2.remove(next);
            strArr = null;
        }
        return bundle2;
    }

    final zzex zza(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzch(str2) != 0) {
            zzgi().zziv().zzg("Invalid conditional property event name", zzgf().zzbo(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        return new zzex(str2, new zzeu(zzd(zza(str, str2, bundle2, CollectionUtils.listOf("_o"), false, false))), str3, j);
    }

    public final void zza(int i, String str, String str2, int i2) {
        zza((String) null, i, str, str2, i2);
    }

    final void zza(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (str != null) {
            zzgi().zziz().zze("Not putting event parameter. Invalid value type. name, type", zzgf().zzbn(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    final void zza(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zza(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.zzacv.zzgl();
        this.zzacv.zzfy().logEvent("auto", "_err", bundle);
    }

    final boolean zza(String str, int i, String str2) {
        if (str2 == null) {
            zzgi().zziv().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        zzgi().zziv().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    final boolean zza(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            zzgi().zziv().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr2 = zzasx;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            zzgi().zziv().zze("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            Preconditions.checkNotNull(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                }
                if (zzs(str2, strArr[i2])) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                zzgi().zziv().zze("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    final int zzch(String str) {
        if (!zzr(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (zza(NotificationCompat.CATEGORY_EVENT, AppMeasurement.Event.zzacw, str)) {
            return !zza(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int zzci(String str) {
        if (!zzq("user property", str)) {
            return 6;
        }
        if (zza("user property", AppMeasurement.UserProperty.zzada, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final int zzcj(String str) {
        if (!zzr("user property", str)) {
            return 6;
        }
        if (zza("user property", AppMeasurement.UserProperty.zzada, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final boolean zzck(String str) {
        if (TextUtils.isEmpty(str)) {
            zzgi().zziv().log("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        zzgi().zziv().zzg("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    final boolean zzcn(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzhs = zzgk().zzhs();
        zzgl();
        return zzhs.equals(str);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0069 -> B:7:0x0076). Please report as a decompilation issue!!! */
    @WorkerThread
    final long zzd(Context context, String str) {
        zzab();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest messageDigest = getMessageDigest();
        long j = -1;
        if (messageDigest == null) {
            zzgi().zziv().log("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e) {
                    zzgi().zziv().zzg("Package name not found", e);
                }
                if (!zze(context, str)) {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(getContext().getPackageName(), 64);
                    if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                        zzgi().zziy().log("Could not get signatures");
                    } else {
                        j = zzc(messageDigest.digest(packageInfo.signatures[0].toByteArray()));
                    }
                }
            }
            j = 0;
        }
        return j;
    }

    final Bundle zzd(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzh = zzh(str, bundle.get(str));
                if (zzh == null) {
                    zzgi().zziy().zzg("Param value can't be null", zzgf().zzbn(str));
                } else {
                    zza(bundle2, str, zzh);
                }
            }
        }
        return bundle2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfu() {
        super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfv() {
        super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfw() {
        super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzer zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzfg zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzkd zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzgi zzgh() {
        return super.zzgh();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzfi zzgi() {
        return super.zzgi();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzft zzgj() {
        return super.zzgj();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzeh zzgk() {
        return super.zzgk();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzee zzgl() {
        return super.zzgl();
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    protected final boolean zzgn() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    @WorkerThread
    protected final void zzgo() {
        zzab();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzgi().zziy().log("Utils falling back to Random for random id");
            }
        }
        this.zzasz.set(nextLong);
    }

    final Object zzh(String str, Object obj) {
        boolean z;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            r1 = zzcm(str) ? 256 : 100;
            z = false;
        }
        return zza(r1, obj, z);
    }

    final int zzi(String str, Object obj) {
        return "_ldl".equals(str) ? zza("user property referrer", str, zzcl(str), obj, false) : zza("user property", str, zzcl(str), obj, false) ? 0 : 7;
    }

    final Object zzj(String str, Object obj) {
        int zzcl;
        boolean z;
        if ("_ldl".equals(str)) {
            zzcl = zzcl(str);
            z = true;
        } else {
            zzcl = zzcl(str);
            z = false;
        }
        return zza(zzcl, obj, z);
    }

    public final long zzln() {
        long andIncrement;
        long j;
        if (this.zzasz.get() != 0) {
            synchronized (this.zzasz) {
                this.zzasz.compareAndSet(-1L, 1L);
                andIncrement = this.zzasz.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzasz) {
            long nextLong = new Random(System.nanoTime() ^ zzbt().currentTimeMillis()).nextLong();
            int i = this.zzadj + 1;
            this.zzadj = i;
            j = nextLong + i;
        }
        return j;
    }

    @WorkerThread
    final SecureRandom zzlo() {
        zzab();
        if (this.zzasy == null) {
            this.zzasy = new SecureRandom();
        }
        return this.zzasy;
    }

    public final int zzlp() {
        if (this.zzata == null) {
            this.zzata = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(getContext()) / 1000);
        }
        return this.zzata.intValue();
    }

    final boolean zzq(String str, String str2) {
        if (str2 == null) {
            zzgi().zziv().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzgi().zziv().zzg("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzgi().zziv().zze("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzgi().zziv().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    @WorkerThread
    final boolean zzx(String str) {
        zzab();
        if (Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzgi().zzjb().zzg("Permission not granted", str);
        return false;
    }
}
