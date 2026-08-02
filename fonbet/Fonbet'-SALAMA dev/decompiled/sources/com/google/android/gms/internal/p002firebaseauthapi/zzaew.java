package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.google.firebase.auth.PhoneAuthCredential;
import e1.k;
import i3.C1263a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.c;
import w1.L;

/* loaded from: classes.dex */
final class zzaew {
    private static final C1263a zza = new C1263a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzaez> zzd = new HashMap<>();

    public zzaew(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null || zzaezVar.zzh || zzag.zzc(zzaezVar.zzd)) {
            return;
        }
        zza.f("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzaezVar.zzd);
        }
        zzaezVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        if (!zzaezVar.zzi) {
            zze(str);
        }
        zzc(str);
    }

    public final boolean zzd(String str) {
        return this.zzd.get(str) != null;
    }

    public final String zzb() {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                apkContentsSigners = c.a(this.zzb).t(64, packageName).signatures;
            } else {
                signingInfo = c.a(this.zzb).t(134217728, packageName).signingInfo;
                apkContentsSigners = signingInfo.getApkContentsSigners();
            }
            String zza2 = zza(packageName, apkContentsSigners[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzc(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzaezVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzaezVar.zzf.cancel(false);
        }
        zzaezVar.zzb.clear();
        this.zzd.remove(str);
    }

    public final zzade zza(zzade zzadeVar, String str) {
        return new zzaex(this, zzadeVar, str);
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String f7 = k.f(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(f7.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e7) {
            zza.c(L.i("NoSuchAlgorithm: ", e7.getMessage()), new Object[0]);
            return null;
        }
    }

    public final void zzb(zzade zzadeVar, String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        zzaezVar.zzb.add(zzadeVar);
        if (zzaezVar.zzg) {
            zzadeVar.zzb(zzaezVar.zzd);
        }
        if (zzaezVar.zzh) {
            zzadeVar.zza(PhoneAuthCredential.n(zzaezVar.zzd, zzaezVar.zze));
        }
        if (zzaezVar.zzi) {
            zzadeVar.zza(zzaezVar.zzd);
        }
    }

    public static /* synthetic */ void zza(zzaew zzaewVar, String str) {
        zzaez zzaezVar = zzaewVar.zzd.get(str);
        if (zzaezVar == null || zzag.zzc(zzaezVar.zzd) || zzag.zzc(zzaezVar.zze) || zzaezVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(PhoneAuthCredential.n(zzaezVar.zzd, zzaezVar.zze));
        }
        zzaezVar.zzh = true;
    }

    public final void zza(final String str, zzade zzadeVar, long j, boolean z4) {
        this.zzd.put(str, new zzaez(j, z4));
        zzb(zzadeVar, str);
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar.zza <= 0) {
            zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaezVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzaev
            @Override // java.lang.Runnable
            public final void run() {
                zzaew.this.zzb(str);
            }
        }, zzaezVar.zza, TimeUnit.SECONDS);
        if (!zzaezVar.zzc) {
            zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafa zzafaVar = new zzafa(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzc.zza(this.zzb.getApplicationContext(), zzafaVar, intentFilter);
        new zzab(this.zzb).startSmsRetriever().addOnFailureListener(new zzaey(this));
    }
}
