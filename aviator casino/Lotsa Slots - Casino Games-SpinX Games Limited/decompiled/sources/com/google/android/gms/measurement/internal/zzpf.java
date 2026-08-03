package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpf implements com.google.android.gms.measurement.internal.zzjf {
    private static volatile com.google.android.gms.measurement.internal.zzpf zzb;
    private java.util.List zzA;
    private long zzB;
    private final java.util.Map zzC;
    private final java.util.Map zzD;
    private final java.util.Map zzE;
    private com.google.android.gms.measurement.internal.zzlt zzG;
    private java.lang.String zzH;
    private com.google.android.gms.measurement.internal.zzay zzI;
    private long zzJ;
    long zza;
    private final com.google.android.gms.measurement.internal.zzhs zzc;
    private final com.google.android.gms.measurement.internal.zzgy zzd;
    private com.google.android.gms.measurement.internal.zzav zze;
    private com.google.android.gms.measurement.internal.zzha zzf;
    private com.google.android.gms.measurement.internal.zzoj zzg;
    private com.google.android.gms.measurement.internal.zzad zzh;
    private final com.google.android.gms.measurement.internal.zzpj zzi;
    private com.google.android.gms.measurement.internal.zzlo zzj;
    private com.google.android.gms.measurement.internal.zznm zzk;
    private final com.google.android.gms.measurement.internal.zzot zzl;
    private com.google.android.gms.measurement.internal.zzhj zzm;
    private final com.google.android.gms.measurement.internal.zzib zzn;
    private boolean zzp;
    private java.util.List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private java.nio.channels.FileLock zzx;
    private java.nio.channels.FileChannel zzy;
    private java.util.List zzz;
    private final java.util.concurrent.atomic.AtomicBoolean zzo = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.Deque zzr = new java.util.LinkedList();
    private final java.util.Map zzF = new java.util.HashMap();
    private final com.google.android.gms.measurement.internal.zzpn zzK = new com.google.android.gms.measurement.internal.zzpa(this);

    zzpf(com.google.android.gms.measurement.internal.zzpg zzpgVar, com.google.android.gms.measurement.internal.zzib zzibVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpgVar);
        this.zzn = com.google.android.gms.measurement.internal.zzib.zzy(zzpgVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new com.google.android.gms.measurement.internal.zzot(this);
        com.google.android.gms.measurement.internal.zzpj zzpjVar = new com.google.android.gms.measurement.internal.zzpj(this);
        zzpjVar.zzaz();
        this.zzi = zzpjVar;
        com.google.android.gms.measurement.internal.zzgy zzgyVar = new com.google.android.gms.measurement.internal.zzgy(this);
        zzgyVar.zzaz();
        this.zzd = zzgyVar;
        com.google.android.gms.measurement.internal.zzhs zzhsVar = new com.google.android.gms.measurement.internal.zzhs(this);
        zzhsVar.zzaz();
        this.zzc = zzhsVar;
        this.zzC = new java.util.HashMap();
        this.zzD = new java.util.HashMap();
        this.zzE = new java.util.HashMap();
        zzaW().zzj(new com.google.android.gms.measurement.internal.zzou(this, zzpgVar));
    }

    public static com.google.android.gms.measurement.internal.zzpf zza(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (com.google.android.gms.measurement.internal.zzpf.class) {
                if (zzb == null) {
                    zzb = new com.google.android.gms.measurement.internal.zzpf((com.google.android.gms.measurement.internal.zzpg) com.google.android.gms.common.internal.Preconditions.checkNotNull(new com.google.android.gms.measurement.internal.zzpg(context)), null);
                }
            }
        }
        return zzb;
    }

    static final void zzaA(com.google.android.gms.internal.measurement.zzhr zzhrVar, java.lang.String str) {
        java.util.List zza = zzhrVar.zza();
        for (int i = 0; i < zza.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i)).zzb())) {
                zzhrVar.zzj(i);
                return;
            }
        }
    }

    private final int zzaB(java.lang.String str, com.google.android.gms.measurement.internal.zzan zzanVar) {
        com.google.android.gms.measurement.internal.zzjj zzjjVar;
        com.google.android.gms.measurement.internal.zzjh zzA;
        com.google.android.gms.measurement.internal.zzhs zzhsVar = this.zzc;
        if (zzhsVar.zzx(str) == null) {
            zzanVar.zzc(com.google.android.gms.measurement.internal.zzjj.AD_PERSONALIZATION, com.google.android.gms.measurement.internal.zzam.FAILSAFE);
            return 1;
        }
        com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(str);
        if (zzu != null && com.google.android.gms.measurement.internal.zze.zzc(zzu.zzaH()).zza() == com.google.android.gms.measurement.internal.zzjh.POLICY && (zzA = zzhsVar.zzA(str, (zzjjVar = com.google.android.gms.measurement.internal.zzjj.AD_PERSONALIZATION))) != com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED) {
            zzanVar.zzc(zzjjVar, com.google.android.gms.measurement.internal.zzam.REMOTE_ENFORCED_DEFAULT);
            return zzA == com.google.android.gms.measurement.internal.zzjh.GRANTED ? 0 : 1;
        }
        com.google.android.gms.measurement.internal.zzjj zzjjVar2 = com.google.android.gms.measurement.internal.zzjj.AD_PERSONALIZATION;
        zzanVar.zzc(zzjjVar2, com.google.android.gms.measurement.internal.zzam.REMOTE_DEFAULT);
        return zzhsVar.zzv(str, zzjjVar2) ? 0 : 1;
    }

    private final java.util.Map zzaC(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        zzp();
        for (java.util.Map.Entry entry : com.google.android.gms.measurement.internal.zzpj.zzH(zzhsVar, "gad_").entrySet()) {
            hashMap.put((java.lang.String) entry.getKey(), java.lang.String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    private final com.google.android.gms.measurement.internal.zzay zzaD() {
        if (this.zzI == null) {
            this.zzI = new com.google.android.gms.measurement.internal.zzox(this, this.zzn);
        }
        return this.zzI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public final void zzau() {
        zzaW().zzg();
        if (this.zzr.isEmpty() || zzaD().zzc()) {
            return;
        }
        long max = java.lang.Math.max(0L, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzaB.zzb(null)).intValue() - (zzaZ().elapsedRealtime() - this.zzJ));
        zzaV().zzk().zzb("Scheduling notify next app runnable, delay in ms", java.lang.Long.valueOf(max));
        zzaD().zzb(max);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e2 A[Catch: all -> 0x0eca, TryCatch #2 {all -> 0x0eca, blocks: (B:3:0x000f, B:6:0x0027, B:9:0x002f, B:10:0x0043, B:13:0x005d, B:16:0x0083, B:18:0x00b8, B:21:0x00c9, B:23:0x00d3, B:26:0x066c, B:27:0x0103, B:30:0x0115, B:32:0x011b, B:34:0x0156, B:36:0x0164, B:39:0x0184, B:41:0x018a, B:43:0x019a, B:45:0x01a8, B:47:0x01b8, B:49:0x01c5, B:54:0x01c8, B:56:0x01dc, B:63:0x03d9, B:64:0x03e5, B:67:0x03ef, B:71:0x0412, B:72:0x0401, B:81:0x0491, B:83:0x049f, B:86:0x04b0, B:88:0x04c2, B:90:0x04ce, B:92:0x0535, B:94:0x053b, B:95:0x0547, B:97:0x054d, B:99:0x055d, B:101:0x0567, B:102:0x057a, B:104:0x0580, B:105:0x059b, B:107:0x05a1, B:109:0x05bf, B:111:0x05ca, B:113:0x05f1, B:114:0x05d0, B:116:0x05de, B:120:0x05fc, B:121:0x0616, B:123:0x061c, B:126:0x062f, B:131:0x063c, B:132:0x0640, B:134:0x0646, B:136:0x0656, B:143:0x04e2, B:145:0x04f0, B:148:0x0503, B:150:0x0515, B:152:0x0521, B:154:0x041a, B:156:0x0426, B:158:0x0432, B:162:0x0477, B:163:0x044f, B:166:0x0461, B:168:0x0467, B:170:0x0471, B:175:0x020b, B:178:0x0215, B:180:0x0223, B:182:0x026f, B:183:0x0241, B:185:0x0251, B:193:0x0280, B:195:0x02ac, B:196:0x02d6, B:198:0x030d, B:199:0x0314, B:202:0x0320, B:204:0x0357, B:205:0x0372, B:207:0x0378, B:209:0x0386, B:211:0x039a, B:212:0x038f, B:220:0x03a1, B:223:0x03a8, B:224:0x03c0, B:226:0x0121, B:228:0x012c, B:230:0x0138, B:232:0x013e, B:235:0x0149, B:240:0x0684, B:242:0x0692, B:244:0x069b, B:246:0x06cb, B:247:0x06a3, B:249:0x06ac, B:251:0x06b2, B:253:0x06be, B:255:0x06c6, B:262:0x06ce, B:263:0x06da, B:266:0x06e2, B:269:0x06f4, B:270:0x06ff, B:272:0x0707, B:273:0x072c, B:275:0x0746, B:276:0x075b, B:278:0x0775, B:279:0x078a, B:281:0x07cf, B:283:0x07d5, B:284:0x07fc, B:286:0x0804, B:287:0x080d, B:289:0x0813, B:290:0x0819, B:292:0x082e, B:294:0x083e, B:296:0x084e, B:299:0x0857, B:301:0x085d, B:302:0x086f, B:304:0x0875, B:307:0x0885, B:309:0x089d, B:311:0x08af, B:313:0x08d6, B:314:0x08ef, B:316:0x0901, B:317:0x0920, B:319:0x0947, B:321:0x0977, B:323:0x0982, B:325:0x0994, B:326:0x09b3, B:328:0x09da, B:330:0x0a0a, B:332:0x0a13, B:334:0x0a1c, B:338:0x0a20, B:394:0x0a92, B:396:0x0aab, B:398:0x0ac1, B:400:0x0ac6, B:402:0x0aca, B:404:0x0ace, B:406:0x0ad8, B:407:0x0ade, B:409:0x0ae2, B:411:0x0ae8, B:412:0x0af6, B:413:0x0aff, B:487:0x0b25, B:491:0x0b2c, B:502:0x07e3, B:504:0x07e9, B:506:0x07ef, B:507:0x0787, B:508:0x0758, B:509:0x070c, B:511:0x0712), top: B:2:0x000f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0b60 A[Catch: all -> 0x0eb3, TryCatch #0 {all -> 0x0eb3, blocks: (B:388:0x0a61, B:389:0x0a74, B:391:0x0a7a, B:417:0x0d56, B:419:0x0b0f, B:422:0x0b40, B:424:0x0b60, B:425:0x0b68, B:427:0x0b6e, B:431:0x0b80, B:436:0x0bac, B:438:0x0bd6, B:440:0x0be2, B:442:0x0bf8, B:443:0x0c37, B:446:0x0c4d, B:448:0x0c56, B:450:0x0c64, B:452:0x0c68, B:454:0x0c6c, B:456:0x0c70, B:457:0x0c7c, B:458:0x0c81, B:460:0x0c87, B:462:0x0ca3, B:463:0x0ca8, B:464:0x0d53, B:466:0x0cc1, B:468:0x0cc8, B:471:0x0cf1, B:473:0x0d14, B:474:0x0d24, B:476:0x0d39, B:478:0x0d41, B:481:0x0cd8, B:485:0x0b96, B:493:0x0d65, B:495:0x0d74, B:496:0x0d7a, B:497:0x0d82, B:499:0x0d88, B:341:0x0da2, B:343:0x0db2, B:344:0x0e33, B:368:0x0dca, B:370:0x0dd0, B:372:0x0dda, B:373:0x0de1, B:378:0x0df1, B:379:0x0df8, B:381:0x0e24, B:382:0x0e2b, B:383:0x0e28, B:384:0x0df5, B:386:0x0dde), top: B:387:0x0a61 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0bac A[Catch: all -> 0x0eb3, TryCatch #0 {all -> 0x0eb3, blocks: (B:388:0x0a61, B:389:0x0a74, B:391:0x0a7a, B:417:0x0d56, B:419:0x0b0f, B:422:0x0b40, B:424:0x0b60, B:425:0x0b68, B:427:0x0b6e, B:431:0x0b80, B:436:0x0bac, B:438:0x0bd6, B:440:0x0be2, B:442:0x0bf8, B:443:0x0c37, B:446:0x0c4d, B:448:0x0c56, B:450:0x0c64, B:452:0x0c68, B:454:0x0c6c, B:456:0x0c70, B:457:0x0c7c, B:458:0x0c81, B:460:0x0c87, B:462:0x0ca3, B:463:0x0ca8, B:464:0x0d53, B:466:0x0cc1, B:468:0x0cc8, B:471:0x0cf1, B:473:0x0d14, B:474:0x0d24, B:476:0x0d39, B:478:0x0d41, B:481:0x0cd8, B:485:0x0b96, B:493:0x0d65, B:495:0x0d74, B:496:0x0d7a, B:497:0x0d82, B:499:0x0d88, B:341:0x0da2, B:343:0x0db2, B:344:0x0e33, B:368:0x0dca, B:370:0x0dd0, B:372:0x0dda, B:373:0x0de1, B:378:0x0df1, B:379:0x0df8, B:381:0x0e24, B:382:0x0e2b, B:383:0x0e28, B:384:0x0df5, B:386:0x0dde), top: B:387:0x0a61 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0bd6 A[Catch: all -> 0x0eb3, TryCatch #0 {all -> 0x0eb3, blocks: (B:388:0x0a61, B:389:0x0a74, B:391:0x0a7a, B:417:0x0d56, B:419:0x0b0f, B:422:0x0b40, B:424:0x0b60, B:425:0x0b68, B:427:0x0b6e, B:431:0x0b80, B:436:0x0bac, B:438:0x0bd6, B:440:0x0be2, B:442:0x0bf8, B:443:0x0c37, B:446:0x0c4d, B:448:0x0c56, B:450:0x0c64, B:452:0x0c68, B:454:0x0c6c, B:456:0x0c70, B:457:0x0c7c, B:458:0x0c81, B:460:0x0c87, B:462:0x0ca3, B:463:0x0ca8, B:464:0x0d53, B:466:0x0cc1, B:468:0x0cc8, B:471:0x0cf1, B:473:0x0d14, B:474:0x0d24, B:476:0x0d39, B:478:0x0d41, B:481:0x0cd8, B:485:0x0b96, B:493:0x0d65, B:495:0x0d74, B:496:0x0d7a, B:497:0x0d82, B:499:0x0d88, B:341:0x0da2, B:343:0x0db2, B:344:0x0e33, B:368:0x0dca, B:370:0x0dd0, B:372:0x0dda, B:373:0x0de1, B:378:0x0df1, B:379:0x0df8, B:381:0x0e24, B:382:0x0e2b, B:383:0x0e28, B:384:0x0df5, B:386:0x0dde), top: B:387:0x0a61 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03d9 A[Catch: all -> 0x0eca, TryCatch #2 {all -> 0x0eca, blocks: (B:3:0x000f, B:6:0x0027, B:9:0x002f, B:10:0x0043, B:13:0x005d, B:16:0x0083, B:18:0x00b8, B:21:0x00c9, B:23:0x00d3, B:26:0x066c, B:27:0x0103, B:30:0x0115, B:32:0x011b, B:34:0x0156, B:36:0x0164, B:39:0x0184, B:41:0x018a, B:43:0x019a, B:45:0x01a8, B:47:0x01b8, B:49:0x01c5, B:54:0x01c8, B:56:0x01dc, B:63:0x03d9, B:64:0x03e5, B:67:0x03ef, B:71:0x0412, B:72:0x0401, B:81:0x0491, B:83:0x049f, B:86:0x04b0, B:88:0x04c2, B:90:0x04ce, B:92:0x0535, B:94:0x053b, B:95:0x0547, B:97:0x054d, B:99:0x055d, B:101:0x0567, B:102:0x057a, B:104:0x0580, B:105:0x059b, B:107:0x05a1, B:109:0x05bf, B:111:0x05ca, B:113:0x05f1, B:114:0x05d0, B:116:0x05de, B:120:0x05fc, B:121:0x0616, B:123:0x061c, B:126:0x062f, B:131:0x063c, B:132:0x0640, B:134:0x0646, B:136:0x0656, B:143:0x04e2, B:145:0x04f0, B:148:0x0503, B:150:0x0515, B:152:0x0521, B:154:0x041a, B:156:0x0426, B:158:0x0432, B:162:0x0477, B:163:0x044f, B:166:0x0461, B:168:0x0467, B:170:0x0471, B:175:0x020b, B:178:0x0215, B:180:0x0223, B:182:0x026f, B:183:0x0241, B:185:0x0251, B:193:0x0280, B:195:0x02ac, B:196:0x02d6, B:198:0x030d, B:199:0x0314, B:202:0x0320, B:204:0x0357, B:205:0x0372, B:207:0x0378, B:209:0x0386, B:211:0x039a, B:212:0x038f, B:220:0x03a1, B:223:0x03a8, B:224:0x03c0, B:226:0x0121, B:228:0x012c, B:230:0x0138, B:232:0x013e, B:235:0x0149, B:240:0x0684, B:242:0x0692, B:244:0x069b, B:246:0x06cb, B:247:0x06a3, B:249:0x06ac, B:251:0x06b2, B:253:0x06be, B:255:0x06c6, B:262:0x06ce, B:263:0x06da, B:266:0x06e2, B:269:0x06f4, B:270:0x06ff, B:272:0x0707, B:273:0x072c, B:275:0x0746, B:276:0x075b, B:278:0x0775, B:279:0x078a, B:281:0x07cf, B:283:0x07d5, B:284:0x07fc, B:286:0x0804, B:287:0x080d, B:289:0x0813, B:290:0x0819, B:292:0x082e, B:294:0x083e, B:296:0x084e, B:299:0x0857, B:301:0x085d, B:302:0x086f, B:304:0x0875, B:307:0x0885, B:309:0x089d, B:311:0x08af, B:313:0x08d6, B:314:0x08ef, B:316:0x0901, B:317:0x0920, B:319:0x0947, B:321:0x0977, B:323:0x0982, B:325:0x0994, B:326:0x09b3, B:328:0x09da, B:330:0x0a0a, B:332:0x0a13, B:334:0x0a1c, B:338:0x0a20, B:394:0x0a92, B:396:0x0aab, B:398:0x0ac1, B:400:0x0ac6, B:402:0x0aca, B:404:0x0ace, B:406:0x0ad8, B:407:0x0ade, B:409:0x0ae2, B:411:0x0ae8, B:412:0x0af6, B:413:0x0aff, B:487:0x0b25, B:491:0x0b2c, B:502:0x07e3, B:504:0x07e9, B:506:0x07ef, B:507:0x0787, B:508:0x0758, B:509:0x070c, B:511:0x0712), top: B:2:0x000f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x049f A[Catch: all -> 0x0eca, TryCatch #2 {all -> 0x0eca, blocks: (B:3:0x000f, B:6:0x0027, B:9:0x002f, B:10:0x0043, B:13:0x005d, B:16:0x0083, B:18:0x00b8, B:21:0x00c9, B:23:0x00d3, B:26:0x066c, B:27:0x0103, B:30:0x0115, B:32:0x011b, B:34:0x0156, B:36:0x0164, B:39:0x0184, B:41:0x018a, B:43:0x019a, B:45:0x01a8, B:47:0x01b8, B:49:0x01c5, B:54:0x01c8, B:56:0x01dc, B:63:0x03d9, B:64:0x03e5, B:67:0x03ef, B:71:0x0412, B:72:0x0401, B:81:0x0491, B:83:0x049f, B:86:0x04b0, B:88:0x04c2, B:90:0x04ce, B:92:0x0535, B:94:0x053b, B:95:0x0547, B:97:0x054d, B:99:0x055d, B:101:0x0567, B:102:0x057a, B:104:0x0580, B:105:0x059b, B:107:0x05a1, B:109:0x05bf, B:111:0x05ca, B:113:0x05f1, B:114:0x05d0, B:116:0x05de, B:120:0x05fc, B:121:0x0616, B:123:0x061c, B:126:0x062f, B:131:0x063c, B:132:0x0640, B:134:0x0646, B:136:0x0656, B:143:0x04e2, B:145:0x04f0, B:148:0x0503, B:150:0x0515, B:152:0x0521, B:154:0x041a, B:156:0x0426, B:158:0x0432, B:162:0x0477, B:163:0x044f, B:166:0x0461, B:168:0x0467, B:170:0x0471, B:175:0x020b, B:178:0x0215, B:180:0x0223, B:182:0x026f, B:183:0x0241, B:185:0x0251, B:193:0x0280, B:195:0x02ac, B:196:0x02d6, B:198:0x030d, B:199:0x0314, B:202:0x0320, B:204:0x0357, B:205:0x0372, B:207:0x0378, B:209:0x0386, B:211:0x039a, B:212:0x038f, B:220:0x03a1, B:223:0x03a8, B:224:0x03c0, B:226:0x0121, B:228:0x012c, B:230:0x0138, B:232:0x013e, B:235:0x0149, B:240:0x0684, B:242:0x0692, B:244:0x069b, B:246:0x06cb, B:247:0x06a3, B:249:0x06ac, B:251:0x06b2, B:253:0x06be, B:255:0x06c6, B:262:0x06ce, B:263:0x06da, B:266:0x06e2, B:269:0x06f4, B:270:0x06ff, B:272:0x0707, B:273:0x072c, B:275:0x0746, B:276:0x075b, B:278:0x0775, B:279:0x078a, B:281:0x07cf, B:283:0x07d5, B:284:0x07fc, B:286:0x0804, B:287:0x080d, B:289:0x0813, B:290:0x0819, B:292:0x082e, B:294:0x083e, B:296:0x084e, B:299:0x0857, B:301:0x085d, B:302:0x086f, B:304:0x0875, B:307:0x0885, B:309:0x089d, B:311:0x08af, B:313:0x08d6, B:314:0x08ef, B:316:0x0901, B:317:0x0920, B:319:0x0947, B:321:0x0977, B:323:0x0982, B:325:0x0994, B:326:0x09b3, B:328:0x09da, B:330:0x0a0a, B:332:0x0a13, B:334:0x0a1c, B:338:0x0a20, B:394:0x0a92, B:396:0x0aab, B:398:0x0ac1, B:400:0x0ac6, B:402:0x0aca, B:404:0x0ace, B:406:0x0ad8, B:407:0x0ade, B:409:0x0ae2, B:411:0x0ae8, B:412:0x0af6, B:413:0x0aff, B:487:0x0b25, B:491:0x0b2c, B:502:0x07e3, B:504:0x07e9, B:506:0x07ef, B:507:0x0787, B:508:0x0758, B:509:0x070c, B:511:0x0712), top: B:2:0x000f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x053b A[Catch: all -> 0x0eca, TryCatch #2 {all -> 0x0eca, blocks: (B:3:0x000f, B:6:0x0027, B:9:0x002f, B:10:0x0043, B:13:0x005d, B:16:0x0083, B:18:0x00b8, B:21:0x00c9, B:23:0x00d3, B:26:0x066c, B:27:0x0103, B:30:0x0115, B:32:0x011b, B:34:0x0156, B:36:0x0164, B:39:0x0184, B:41:0x018a, B:43:0x019a, B:45:0x01a8, B:47:0x01b8, B:49:0x01c5, B:54:0x01c8, B:56:0x01dc, B:63:0x03d9, B:64:0x03e5, B:67:0x03ef, B:71:0x0412, B:72:0x0401, B:81:0x0491, B:83:0x049f, B:86:0x04b0, B:88:0x04c2, B:90:0x04ce, B:92:0x0535, B:94:0x053b, B:95:0x0547, B:97:0x054d, B:99:0x055d, B:101:0x0567, B:102:0x057a, B:104:0x0580, B:105:0x059b, B:107:0x05a1, B:109:0x05bf, B:111:0x05ca, B:113:0x05f1, B:114:0x05d0, B:116:0x05de, B:120:0x05fc, B:121:0x0616, B:123:0x061c, B:126:0x062f, B:131:0x063c, B:132:0x0640, B:134:0x0646, B:136:0x0656, B:143:0x04e2, B:145:0x04f0, B:148:0x0503, B:150:0x0515, B:152:0x0521, B:154:0x041a, B:156:0x0426, B:158:0x0432, B:162:0x0477, B:163:0x044f, B:166:0x0461, B:168:0x0467, B:170:0x0471, B:175:0x020b, B:178:0x0215, B:180:0x0223, B:182:0x026f, B:183:0x0241, B:185:0x0251, B:193:0x0280, B:195:0x02ac, B:196:0x02d6, B:198:0x030d, B:199:0x0314, B:202:0x0320, B:204:0x0357, B:205:0x0372, B:207:0x0378, B:209:0x0386, B:211:0x039a, B:212:0x038f, B:220:0x03a1, B:223:0x03a8, B:224:0x03c0, B:226:0x0121, B:228:0x012c, B:230:0x0138, B:232:0x013e, B:235:0x0149, B:240:0x0684, B:242:0x0692, B:244:0x069b, B:246:0x06cb, B:247:0x06a3, B:249:0x06ac, B:251:0x06b2, B:253:0x06be, B:255:0x06c6, B:262:0x06ce, B:263:0x06da, B:266:0x06e2, B:269:0x06f4, B:270:0x06ff, B:272:0x0707, B:273:0x072c, B:275:0x0746, B:276:0x075b, B:278:0x0775, B:279:0x078a, B:281:0x07cf, B:283:0x07d5, B:284:0x07fc, B:286:0x0804, B:287:0x080d, B:289:0x0813, B:290:0x0819, B:292:0x082e, B:294:0x083e, B:296:0x084e, B:299:0x0857, B:301:0x085d, B:302:0x086f, B:304:0x0875, B:307:0x0885, B:309:0x089d, B:311:0x08af, B:313:0x08d6, B:314:0x08ef, B:316:0x0901, B:317:0x0920, B:319:0x0947, B:321:0x0977, B:323:0x0982, B:325:0x0994, B:326:0x09b3, B:328:0x09da, B:330:0x0a0a, B:332:0x0a13, B:334:0x0a1c, B:338:0x0a20, B:394:0x0a92, B:396:0x0aab, B:398:0x0ac1, B:400:0x0ac6, B:402:0x0aca, B:404:0x0ace, B:406:0x0ad8, B:407:0x0ade, B:409:0x0ae2, B:411:0x0ae8, B:412:0x0af6, B:413:0x0aff, B:487:0x0b25, B:491:0x0b2c, B:502:0x07e3, B:504:0x07e9, B:506:0x07ef, B:507:0x0787, B:508:0x0758, B:509:0x070c, B:511:0x0712), top: B:2:0x000f, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzaF(java.lang.String str, long j) {
        boolean z;
        boolean z2;
        int i;
        com.google.android.gms.internal.measurement.zzic zzicVar;
        com.google.android.gms.measurement.internal.zzpb zzpbVar;
        long parseLong;
        java.lang.Long l;
        int zzm;
        long j2;
        com.google.android.gms.measurement.internal.zzpb zzpbVar2;
        java.util.HashMap hashMap;
        java.security.SecureRandom secureRandom;
        com.google.android.gms.measurement.internal.zzbc zzbcVar;
        com.google.android.gms.internal.measurement.zzic zzicVar2;
        long zzaj;
        int i2;
        com.google.android.gms.internal.measurement.zzic zzicVar3;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        boolean z3;
        boolean z4;
        boolean z5;
        java.lang.String str8;
        com.google.android.gms.internal.measurement.zzic zzicVar4;
        boolean z6;
        int i3;
        java.lang.String str9;
        int i4;
        boolean z7;
        int i5;
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this;
        java.lang.String str10 = "_ai";
        java.lang.String str11 = com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE;
        java.lang.String str12 = com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS;
        zzj().zzb();
        try {
            com.google.android.gms.measurement.internal.zzpb zzpbVar3 = new com.google.android.gms.measurement.internal.zzpb(zzpfVar, null);
            zzj().zzav(str, j, zzpfVar.zzB, zzpbVar3);
            java.util.List list = zzpbVar3.zzc;
            try {
                if (list != null && !list.isEmpty()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar5 = (com.google.android.gms.internal.measurement.zzic) zzpbVar3.zza.zzcl();
                    zzicVar5.zzi();
                    com.google.android.gms.internal.measurement.zzhr zzhrVar = null;
                    com.google.android.gms.internal.measurement.zzhr zzhrVar2 = null;
                    int i6 = 0;
                    int i7 = 0;
                    boolean z8 = false;
                    boolean z9 = false;
                    int i8 = -1;
                    int i9 = -1;
                    while (true) {
                        z2 = z9;
                        i = i7;
                        java.lang.String str13 = "_e";
                        java.lang.String str14 = str12;
                        com.google.android.gms.internal.measurement.zzhr zzhrVar3 = zzhrVar;
                        int i10 = i9;
                        if (i6 >= zzpbVar3.zzc.size()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzhr zzhrVar4 = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) zzpbVar3.zzc.get(i6)).zzcl();
                        int i11 = i6;
                        if (zzh().zzj(zzpbVar3.zza.zzA(), zzhrVar4.zzk())) {
                            zzaV().zze().zzc("Dropping blocked raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzpbVar3.zza.zzA()), zzpfVar.zzn.zzl().zza(zzhrVar4.zzk()));
                            if (!zzh().zzn(zzpbVar3.zza.zzA()) && !zzh().zzo(zzpbVar3.zza.zzA()) && !"_err".equals(zzhrVar4.zzk())) {
                                zzt().zzN(zzpfVar.zzK, zzpbVar3.zza.zzA(), 11, "_ev", zzhrVar4.zzk(), 0);
                            }
                            z9 = z2;
                            str5 = str10;
                            str6 = str11;
                            z3 = z8;
                            i7 = i;
                            str9 = str14;
                            zzhrVar = zzhrVar3;
                            i9 = i10;
                            i4 = i11;
                            zzicVar4 = zzicVar5;
                        } else {
                            java.lang.String zzk = zzhrVar4.zzk();
                            com.google.android.gms.internal.measurement.zzic zzicVar6 = zzicVar5;
                            if (zzk.equals(str11) || zzk.equals("_iap") || zzk.equals("ecommerce_purchase")) {
                                com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn.zzb("_ct");
                                if (!z8) {
                                    java.lang.String zzA = zzpbVar3.zza.zzA();
                                    if (zzpfVar.zzaO(zzA, str11) && zzpfVar.zzaO(zzA, "_iap") && zzpfVar.zzaO(zzA, "ecommerce_purchase")) {
                                        str4 = "new";
                                        zzn.zzd(str4);
                                        zzhrVar4.zzf((com.google.android.gms.internal.measurement.zzhw) zzn.zzbc());
                                        z8 = true;
                                    }
                                }
                                str4 = "returning";
                                zzn.zzd(str4);
                                zzhrVar4.zzf((com.google.android.gms.internal.measurement.zzhw) zzn.zzbc());
                                z8 = true;
                            }
                            if (zzhrVar4.zzk().equals(com.google.android.gms.measurement.internal.zzjl.zza(str10))) {
                                zzhrVar4.zzl(str10);
                                zzaV().zzk().zza("Renaming ad_impression to _ai");
                                if (android.util.Log.isLoggable(zzaV().zzn(), 5)) {
                                    for (int i12 = 0; i12 < zzhrVar4.zzb(); i12++) {
                                        if (com.google.firebase.analytics.FirebaseAnalytics.Param.AD_PLATFORM.equals(zzhrVar4.zzc(i12).zzb()) && !zzhrVar4.zzc(i12).zzd().isEmpty() && com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB.equalsIgnoreCase(zzhrVar4.zzc(i12).zzd())) {
                                            zzaV().zzh().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            boolean zzk2 = zzh().zzk(zzpbVar3.zza.zzA(), zzhrVar4.zzk());
                            if (!zzk2) {
                                zzp();
                                java.lang.String zzk3 = zzhrVar4.zzk();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzk3);
                                if (zzk3.hashCode() != 95027 || !zzk3.equals("_ui")) {
                                    z4 = z2;
                                    str5 = str10;
                                    str6 = str11;
                                    str7 = "_e";
                                    z3 = z8;
                                    zzk2 = false;
                                    if (zzk2) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList(zzhrVar4.zza());
                                        int i13 = -1;
                                        int i14 = -1;
                                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                            if ("value".equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i15)).zzb())) {
                                                i13 = i15;
                                            } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i15)).zzb())) {
                                                i14 = i15;
                                            }
                                        }
                                        if (i13 != -1) {
                                            if (((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i13)).zze() || ((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i13)).zzi()) {
                                                if (i14 != -1) {
                                                    java.lang.String zzd = ((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i14)).zzd();
                                                    if (zzd.length() == 3) {
                                                        int i16 = 0;
                                                        while (i16 < zzd.length()) {
                                                            int codePointAt = zzd.codePointAt(i16);
                                                            if (java.lang.Character.isLetter(codePointAt)) {
                                                                i16 += java.lang.Character.charCount(codePointAt);
                                                            }
                                                        }
                                                    }
                                                }
                                                zzaV().zzh().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                zzhrVar4.zzj(i13);
                                                zzaA(zzhrVar4, "_c");
                                                zzaz(zzhrVar4, 19, "currency");
                                                break;
                                            }
                                            zzaV().zzh().zza("Value must be specified with a numeric type.");
                                            zzhrVar4.zzj(i13);
                                            zzaA(zzhrVar4, "_c");
                                            zzaz(zzhrVar4, 18, "value");
                                        }
                                        if (str7.equals(zzhrVar4.zzk())) {
                                            zzp();
                                            if (com.google.android.gms.measurement.internal.zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar4.zzbc(), "_fr") == null) {
                                                if (zzhrVar2 != null && java.lang.Math.abs(zzhrVar2.zzn() - zzhrVar4.zzn()) <= 1000) {
                                                    com.google.android.gms.internal.measurement.zzhr zzhrVar5 = (com.google.android.gms.internal.measurement.zzhr) zzhrVar2.clone();
                                                    if (zzpfVar.zzaH(zzhrVar4, zzhrVar5)) {
                                                        zzicVar4 = zzicVar6;
                                                        zzicVar4.zzf(i8, zzhrVar5);
                                                        i9 = i10;
                                                        zzhrVar = null;
                                                        zzhrVar2 = null;
                                                        if (zzhrVar4.zzb() == 0) {
                                                            zzp();
                                                            android.os.Bundle zzE = com.google.android.gms.measurement.internal.zzpj.zzE(zzhrVar4.zza());
                                                            int i17 = 0;
                                                            while (i17 < zzhrVar4.zzb()) {
                                                                com.google.android.gms.internal.measurement.zzhw zzc = zzhrVar4.zzc(i17);
                                                                java.lang.String str15 = str14;
                                                                if (!zzc.zzb().equals(str15) || zzc.zzk().isEmpty()) {
                                                                    z7 = z4;
                                                                    i5 = i8;
                                                                    if (!zzc.zzb().equals(str15)) {
                                                                        zzpfVar.zzT(zzhrVar4.zzk(), (com.google.android.gms.internal.measurement.zzhv) zzc.zzcl(), zzE, zzpbVar3.zza.zzA());
                                                                    }
                                                                } else {
                                                                    java.lang.String zzA2 = zzpbVar3.zza.zzA();
                                                                    java.util.List zzk4 = zzc.zzk();
                                                                    android.os.Bundle[] bundleArr = new android.os.Bundle[zzk4.size()];
                                                                    z7 = z4;
                                                                    int i18 = 0;
                                                                    while (i18 < zzk4.size()) {
                                                                        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzk4.get(i18);
                                                                        zzp();
                                                                        java.util.List list2 = zzk4;
                                                                        android.os.Bundle zzE2 = com.google.android.gms.measurement.internal.zzpj.zzE(zzhwVar.zzk());
                                                                        java.util.Iterator it = zzhwVar.zzk().iterator();
                                                                        while (it.hasNext()) {
                                                                            zzpfVar.zzT(zzhrVar4.zzk(), (com.google.android.gms.internal.measurement.zzhv) ((com.google.android.gms.internal.measurement.zzhw) it.next()).zzcl(), zzE2, zzA2);
                                                                            it = it;
                                                                            i8 = i8;
                                                                        }
                                                                        bundleArr[i18] = zzE2;
                                                                        i18++;
                                                                        zzk4 = list2;
                                                                        i8 = i8;
                                                                    }
                                                                    i5 = i8;
                                                                    zzE.putParcelableArray(str15, bundleArr);
                                                                }
                                                                i17++;
                                                                z4 = z7;
                                                                str14 = str15;
                                                                i8 = i5;
                                                            }
                                                            z6 = z4;
                                                            i3 = i8;
                                                            str9 = str14;
                                                            zzhrVar4.zzi();
                                                            com.google.android.gms.measurement.internal.zzpj zzp = zzp();
                                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                            for (java.lang.String str16 : zzE.keySet()) {
                                                                com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                                                zzn2.zzb(str16);
                                                                java.lang.Object obj = zzE.get(str16);
                                                                if (obj != null) {
                                                                    zzp.zzd(zzn2, obj);
                                                                    arrayList2.add((com.google.android.gms.internal.measurement.zzhw) zzn2.zzbc());
                                                                }
                                                            }
                                                            java.util.Iterator it2 = arrayList2.iterator();
                                                            while (it2.hasNext()) {
                                                                zzhrVar4.zzf((com.google.android.gms.internal.measurement.zzhw) it2.next());
                                                            }
                                                        } else {
                                                            z6 = z4;
                                                            i3 = i8;
                                                            str9 = str14;
                                                        }
                                                        i4 = i11;
                                                        zzpbVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar4.zzbc());
                                                        zzicVar4.zzg(zzhrVar4);
                                                        i7 = i + 1;
                                                        z9 = z6;
                                                        i8 = i3;
                                                    }
                                                }
                                                zzicVar4 = zzicVar6;
                                                zzhrVar = zzhrVar4;
                                                i9 = i;
                                                if (zzhrVar4.zzb() == 0) {
                                                }
                                                i4 = i11;
                                                zzpbVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar4.zzbc());
                                                zzicVar4.zzg(zzhrVar4);
                                                i7 = i + 1;
                                                z9 = z6;
                                                i8 = i3;
                                            } else {
                                                zzicVar4 = zzicVar6;
                                                i9 = i10;
                                                zzhrVar = zzhrVar3;
                                                if (zzhrVar4.zzb() == 0) {
                                                }
                                                i4 = i11;
                                                zzpbVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar4.zzbc());
                                                zzicVar4.zzg(zzhrVar4);
                                                i7 = i + 1;
                                                z9 = z6;
                                                i8 = i3;
                                            }
                                        } else {
                                            zzicVar4 = zzicVar6;
                                            if ("_vs".equals(zzhrVar4.zzk())) {
                                                zzp();
                                                if (com.google.android.gms.measurement.internal.zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar4.zzbc(), "_et") == null) {
                                                    if (zzhrVar3 != null && java.lang.Math.abs(zzhrVar3.zzn() - zzhrVar4.zzn()) <= 1000) {
                                                        com.google.android.gms.internal.measurement.zzhr zzhrVar6 = (com.google.android.gms.internal.measurement.zzhr) zzhrVar3.clone();
                                                        if (zzpfVar.zzaH(zzhrVar6, zzhrVar4)) {
                                                            zzicVar4.zzf(i10, zzhrVar6);
                                                            i9 = i10;
                                                            zzhrVar = null;
                                                            zzhrVar2 = null;
                                                            if (zzhrVar4.zzb() == 0) {
                                                            }
                                                            i4 = i11;
                                                            zzpbVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar4.zzbc());
                                                            zzicVar4.zzg(zzhrVar4);
                                                            i7 = i + 1;
                                                            z9 = z6;
                                                            i8 = i3;
                                                        }
                                                    }
                                                    zzhrVar2 = zzhrVar4;
                                                    i9 = i10;
                                                    i8 = i;
                                                    zzhrVar = zzhrVar3;
                                                    if (zzhrVar4.zzb() == 0) {
                                                    }
                                                    i4 = i11;
                                                    zzpbVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar4.zzbc());
                                                    zzicVar4.zzg(zzhrVar4);
                                                    i7 = i + 1;
                                                    z9 = z6;
                                                    i8 = i3;
                                                }
                                            }
                                            i9 = i10;
                                            zzhrVar = zzhrVar3;
                                            if (zzhrVar4.zzb() == 0) {
                                            }
                                            i4 = i11;
                                            zzpbVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar4.zzbc());
                                            zzicVar4.zzg(zzhrVar4);
                                            i7 = i + 1;
                                            z9 = z6;
                                            i8 = i3;
                                        }
                                    }
                                    if (str7.equals(zzhrVar4.zzk())) {
                                    }
                                }
                            }
                            str5 = str10;
                            int i19 = 0;
                            boolean z10 = false;
                            boolean z11 = false;
                            while (true) {
                                str6 = str11;
                                if (i19 >= zzhrVar4.zzb()) {
                                    break;
                                }
                                if ("_c".equals(zzhrVar4.zzc(i19).zzb())) {
                                    com.google.android.gms.internal.measurement.zzhv zzhvVar = (com.google.android.gms.internal.measurement.zzhv) zzhrVar4.zzc(i19).zzcl();
                                    z5 = z8;
                                    zzhvVar.zzf(1L);
                                    zzhrVar4.zzd(i19, (com.google.android.gms.internal.measurement.zzhw) zzhvVar.zzbc());
                                    str8 = str13;
                                    z10 = true;
                                } else {
                                    z5 = z8;
                                    if ("_r".equals(zzhrVar4.zzc(i19).zzb())) {
                                        com.google.android.gms.internal.measurement.zzhv zzhvVar2 = (com.google.android.gms.internal.measurement.zzhv) zzhrVar4.zzc(i19).zzcl();
                                        str8 = str13;
                                        zzhvVar2.zzf(1L);
                                        zzhrVar4.zzd(i19, (com.google.android.gms.internal.measurement.zzhw) zzhvVar2.zzbc());
                                        z11 = true;
                                    } else {
                                        str8 = str13;
                                    }
                                }
                                i19++;
                                str11 = str6;
                                z8 = z5;
                                str13 = str8;
                            }
                            str7 = str13;
                            z3 = z8;
                            if (!z10 && zzk2) {
                                zzaV().zzk().zzb("Marking event as conversion", zzpfVar.zzn.zzl().zza(zzhrVar4.zzk()));
                                com.google.android.gms.internal.measurement.zzhv zzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn3.zzb("_c");
                                zzn3.zzf(1L);
                                zzhrVar4.zzg(zzn3);
                            }
                            if (!z11) {
                                zzaV().zzk().zzb("Marking event as real-time", zzpfVar.zzn.zzl().zza(zzhrVar4.zzk()));
                                com.google.android.gms.internal.measurement.zzhv zzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn4.zzb("_r");
                                zzn4.zzf(1L);
                                zzhrVar4.zzg(zzn4);
                            }
                            if (zzj().zzw(zzC(), zzpbVar3.zza.zzA(), false, false, false, false, true, false, false).zze > zzd().zzm(zzpbVar3.zza.zzA(), com.google.android.gms.measurement.internal.zzfx.zzo)) {
                                zzaA(zzhrVar4, "_r");
                                z4 = z2;
                            } else {
                                z4 = true;
                            }
                            if (com.google.android.gms.measurement.internal.zzpo.zzh(zzhrVar4.zzk()) && zzk2 && zzj().zzw(zzC(), zzpbVar3.zza.zzA(), false, false, true, false, false, false, false).zzc > zzd().zzm(zzpbVar3.zza.zzA(), com.google.android.gms.measurement.internal.zzfx.zzn)) {
                                zzaV().zze().zzb("Too many conversions. Not logging as conversion. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzpbVar3.zza.zzA()));
                                boolean z12 = false;
                                int i20 = -1;
                                com.google.android.gms.internal.measurement.zzhv zzhvVar3 = null;
                                for (int i21 = 0; i21 < zzhrVar4.zzb(); i21++) {
                                    com.google.android.gms.internal.measurement.zzhw zzc2 = zzhrVar4.zzc(i21);
                                    if ("_c".equals(zzc2.zzb())) {
                                        zzhvVar3 = (com.google.android.gms.internal.measurement.zzhv) zzc2.zzcl();
                                        i20 = i21;
                                    } else if ("_err".equals(zzc2.zzb())) {
                                        z12 = true;
                                    }
                                }
                                if (z12) {
                                    if (zzhvVar3 != null) {
                                        zzhrVar4.zzj(i20);
                                    } else {
                                        zzhvVar3 = null;
                                    }
                                }
                                if (zzhvVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzhv zzhvVar4 = (com.google.android.gms.internal.measurement.zzhv) zzhvVar3.clone();
                                    zzhvVar4.zzb("_err");
                                    zzhvVar4.zzf(10L);
                                    zzhrVar4.zzd(i20, (com.google.android.gms.internal.measurement.zzhw) zzhvVar4.zzbc());
                                } else {
                                    zzaV().zzb().zzb("Did not find conversion parameter. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzpbVar3.zza.zzA()));
                                }
                            }
                            if (zzk2) {
                            }
                            if (str7.equals(zzhrVar4.zzk())) {
                            }
                        }
                        int i22 = i4 + 1;
                        str12 = str9;
                        zzicVar5 = zzicVar4;
                        str11 = str6;
                        z8 = z3;
                        i6 = i22;
                        str10 = str5;
                    }
                    com.google.android.gms.internal.measurement.zzic zzicVar7 = zzicVar5;
                    long j3 = 0;
                    long j4 = 0;
                    int i23 = i;
                    int i24 = 0;
                    while (i24 < i23) {
                        com.google.android.gms.internal.measurement.zzhs zzd2 = zzicVar7.zzd(i24);
                        if ("_e".equals(zzd2.zzd())) {
                            zzp();
                            if (com.google.android.gms.measurement.internal.zzpj.zzF(zzd2, "_fr") != null) {
                                zzicVar7.zzj(i24);
                                i23--;
                                i24--;
                                i24++;
                            }
                        }
                        zzp();
                        com.google.android.gms.internal.measurement.zzhw zzF = com.google.android.gms.measurement.internal.zzpj.zzF(zzd2, "_et");
                        if (zzF != null) {
                            java.lang.Long valueOf = zzF.zze() ? java.lang.Long.valueOf(zzF.zzf()) : null;
                            if (valueOf != null && valueOf.longValue() > 0) {
                                j4 += valueOf.longValue();
                            }
                        }
                        i24++;
                    }
                    zzpfVar.zzaG(zzicVar7, j4, false);
                    java.util.Iterator it3 = zzicVar7.zzb().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it3.next()).zzd())) {
                            zzj().zzk(zzicVar7.zzK(), "_se");
                            break;
                        }
                    }
                    if (com.google.android.gms.measurement.internal.zzpj.zzx(zzicVar7, "_sid") >= 0) {
                        zzpfVar.zzaG(zzicVar7, j4, true);
                    } else {
                        int zzx = com.google.android.gms.measurement.internal.zzpj.zzx(zzicVar7, "_se");
                        if (zzx >= 0) {
                            zzicVar7.zzr(zzx);
                            zzaV().zzb().zzb("Session engagement user property is in the bundle without session ID. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzpbVar3.zza.zzA()));
                        }
                    }
                    java.lang.String zzA3 = zzpbVar3.zza.zzA();
                    zzaW().zzg();
                    zzu();
                    com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(zzA3);
                    if (zzu == null) {
                        zzaV().zzb().zzb("Cannot fix consent fields without appInfo. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzA3));
                    } else {
                        zzpfVar.zzI(zzu, zzicVar7);
                    }
                    java.lang.String zzA4 = zzpbVar3.zza.zzA();
                    zzaW().zzg();
                    zzu();
                    com.google.android.gms.measurement.internal.zzh zzu2 = zzj().zzu(zzA4);
                    if (zzu2 == null) {
                        zzaV().zze().zzb("Cannot populate ad_campaign_info without appInfo. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzA4));
                    } else {
                        zzpfVar.zzJ(zzu2, zzicVar7);
                    }
                    zzaR(zzicVar7);
                    zzicVar7.zzak();
                    com.google.android.gms.measurement.internal.zzjk zzjkVar = com.google.android.gms.measurement.internal.zzjk.zza;
                    com.google.android.gms.measurement.internal.zzjk zzs = zzpfVar.zzB(zzpbVar3.zza.zzA()).zzs(com.google.android.gms.measurement.internal.zzjk.zzf(zzpbVar3.zza.zzaf(), 100));
                    com.google.android.gms.measurement.internal.zzjk zzaf = zzj().zzaf(zzpbVar3.zza.zzA());
                    zzj().zzae(zzpbVar3.zza.zzA(), zzs);
                    com.google.android.gms.measurement.internal.zzjj zzjjVar = com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE;
                    if (!zzs.zzo(zzjjVar) && zzaf.zzo(zzjjVar)) {
                        zzj().zzi(zzpbVar3.zza.zzA());
                    } else if (zzs.zzo(zzjjVar) && !zzaf.zzo(zzjjVar)) {
                        zzj().zzj(zzpbVar3.zza.zzA());
                    }
                    com.google.android.gms.measurement.internal.zzjj zzjjVar2 = com.google.android.gms.measurement.internal.zzjj.AD_STORAGE;
                    if (!zzs.zzo(zzjjVar2)) {
                        zzicVar7.zzR();
                        zzicVar7.zzU();
                        zzicVar7.zzan();
                    }
                    if (!zzs.zzo(zzjjVar)) {
                        zzicVar7.zzX();
                        zzicVar7.zzav();
                    }
                    com.google.android.gms.internal.measurement.zzql.zza();
                    if (zzd().zzp(zzpbVar3.zza.zzA(), com.google.android.gms.measurement.internal.zzfx.zzaP) && zzt().zzX(zzpbVar3.zza.zzA()) && zzpfVar.zzB(zzpbVar3.zza.zzA()).zzo(zzjjVar2) && zzpbVar3.zza.zzak()) {
                        for (int i25 = 0; i25 < zzicVar7.zzc(); i25++) {
                            com.google.android.gms.internal.measurement.zzhr zzhrVar7 = (com.google.android.gms.internal.measurement.zzhr) zzicVar7.zzd(i25).zzcl();
                            java.util.Iterator it4 = zzhrVar7.zza().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhw) it4.next()).zzb())) {
                                    if (zzpbVar3.zza.zzar() >= zzd().zzm(zzpbVar3.zza.zzA(), com.google.android.gms.measurement.internal.zzfx.zzal)) {
                                        int zzm2 = zzd().zzm(zzpbVar3.zza.zzA(), com.google.android.gms.measurement.internal.zzfx.zzay);
                                        if (zzm2 <= 0) {
                                            if (zzd().zzp(zzpbVar3.zza.zzA(), com.google.android.gms.measurement.internal.zzfx.zzaR)) {
                                                str2 = zzt().zzaw();
                                                com.google.android.gms.internal.measurement.zzhv zzn5 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                                zzn5.zzb("_tu");
                                                zzn5.zzd(str2);
                                                zzhrVar7.zzf((com.google.android.gms.internal.measurement.zzhw) zzn5.zzbc());
                                            } else {
                                                str2 = null;
                                            }
                                            com.google.android.gms.internal.measurement.zzhv zzn6 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                            zzn6.zzb("_tr");
                                            zzn6.zzf(1L);
                                            zzhrVar7.zzf((com.google.android.gms.internal.measurement.zzhw) zzn6.zzbc());
                                            com.google.android.gms.measurement.internal.zzog zzf = zzp().zzf(zzpbVar3.zza.zzA(), zzicVar7, zzhrVar7, str2);
                                            if (zzf != null) {
                                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpbVar3.zza.zzA(), zzf.zza);
                                                zzj().zzaa(zzpbVar3.zza.zzA(), zzf);
                                                java.util.Deque deque = zzpfVar.zzr;
                                                if (!deque.contains(zzpbVar3.zza.zzA())) {
                                                    deque.add(zzpbVar3.zza.zzA());
                                                }
                                            }
                                        } else if (zzj().zzw(zzC(), zzpbVar3.zza.zzA(), false, false, false, false, false, false, true).zzg > zzm2) {
                                            com.google.android.gms.internal.measurement.zzhv zzn7 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                            zzn7.zzb("_tnr");
                                            zzn7.zzf(1L);
                                            zzhrVar7.zzf((com.google.android.gms.internal.measurement.zzhw) zzn7.zzbc());
                                        } else {
                                            if (zzd().zzp(zzpbVar3.zza.zzA(), com.google.android.gms.measurement.internal.zzfx.zzaR)) {
                                                str3 = zzt().zzaw();
                                                com.google.android.gms.internal.measurement.zzhv zzn8 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                                zzn8.zzb("_tu");
                                                zzn8.zzd(str3);
                                                zzhrVar7.zzf((com.google.android.gms.internal.measurement.zzhw) zzn8.zzbc());
                                            } else {
                                                str3 = null;
                                            }
                                            com.google.android.gms.internal.measurement.zzhv zzn9 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                            zzn9.zzb("_tr");
                                            zzn9.zzf(1L);
                                            zzhrVar7.zzf((com.google.android.gms.internal.measurement.zzhw) zzn9.zzbc());
                                            com.google.android.gms.measurement.internal.zzog zzf2 = zzp().zzf(zzpbVar3.zza.zzA(), zzicVar7, zzhrVar7, str3);
                                            if (zzf2 != null) {
                                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpbVar3.zza.zzA(), zzf2.zza);
                                                zzj().zzaa(zzpbVar3.zza.zzA(), zzf2);
                                                java.util.Deque deque2 = zzpfVar.zzr;
                                                if (!deque2.contains(zzpbVar3.zza.zzA())) {
                                                    deque2.add(zzpbVar3.zza.zzA());
                                                }
                                            }
                                        }
                                    }
                                    zzicVar7.zze(i25, (com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc());
                                }
                            }
                        }
                    }
                    zzicVar7.zzag();
                    zzicVar7.zzaf(zzm().zzb(zzicVar7.zzK(), zzicVar7.zzb(), zzicVar7.zzk(), java.lang.Long.valueOf(zzicVar7.zzu()), java.lang.Long.valueOf(zzicVar7.zzw()), !zzs.zzo(zzjjVar)));
                    if (zzd().zzD(zzpbVar3.zza.zzA())) {
                        try {
                            java.util.HashMap hashMap2 = new java.util.HashMap();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.security.SecureRandom zzf3 = zzt().zzf();
                            int i26 = 0;
                            while (i26 < zzicVar7.zzc()) {
                                com.google.android.gms.internal.measurement.zzhr zzhrVar8 = (com.google.android.gms.internal.measurement.zzhr) zzicVar7.zzd(i26).zzcl();
                                if (zzhrVar8.zzk().equals("_ep")) {
                                    zzp();
                                    java.lang.String str17 = (java.lang.String) com.google.android.gms.measurement.internal.zzpj.zzI((com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc(), "_en");
                                    com.google.android.gms.measurement.internal.zzbc zzbcVar2 = (com.google.android.gms.measurement.internal.zzbc) hashMap2.get(str17);
                                    if (zzbcVar2 == null && (zzbcVar2 = zzj().zzf(zzpbVar3.zza.zzA(), (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str17))) != null) {
                                        hashMap2.put(str17, zzbcVar2);
                                    }
                                    if (zzbcVar2 != null && zzbcVar2.zzi == null) {
                                        java.lang.Long l2 = zzbcVar2.zzj;
                                        if (l2 != null && l2.longValue() > 1) {
                                            zzp();
                                            com.google.android.gms.measurement.internal.zzpj.zzC(zzhrVar8, "_sr", l2);
                                        }
                                        java.lang.Boolean bool = zzbcVar2.zzk;
                                        if (bool != null && bool.booleanValue()) {
                                            zzp();
                                            com.google.android.gms.measurement.internal.zzpj.zzC(zzhrVar8, "_efs", 1L);
                                        }
                                        arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc());
                                    }
                                    zzicVar7.zzf(i26, zzhrVar8);
                                    zzpbVar2 = zzpbVar3;
                                    secureRandom = zzf3;
                                    i2 = i26;
                                    zzicVar3 = zzicVar7;
                                    hashMap = hashMap2;
                                } else {
                                    com.google.android.gms.measurement.internal.zzhs zzh = zzh();
                                    java.lang.String zzA5 = zzpbVar3.zza.zzA();
                                    java.lang.String zza = zzh.zza(zzA5, "measurement.account.time_zone_offset_minutes");
                                    if (!android.text.TextUtils.isEmpty(zza)) {
                                        try {
                                            parseLong = java.lang.Long.parseLong(zza);
                                        } catch (java.lang.NumberFormatException e) {
                                            zzh.zzu.zzaV().zze().zzc("Unable to parse timezone offset. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzA5), e);
                                        }
                                        long zzaj2 = zzt().zzaj(zzhrVar8.zzn(), parseLong);
                                        com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc();
                                        java.lang.Long l3 = 1L;
                                        if (!android.text.TextUtils.isEmpty("_dbg")) {
                                            java.util.Iterator it5 = zzhsVar.zza().iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) it5.next();
                                                java.util.Iterator it6 = it5;
                                                if (!"_dbg".equals(zzhwVar2.zzb())) {
                                                    it5 = it6;
                                                } else if (l3.equals(java.lang.Long.valueOf(zzhwVar2.zzf()))) {
                                                    l = l3;
                                                    zzm = 1;
                                                }
                                            }
                                        }
                                        l = l3;
                                        zzm = zzh().zzm(zzpbVar3.zza.zzA(), zzhrVar8.zzk());
                                        if (zzm > 0) {
                                            zzaV().zze().zzc("Sample rate must be positive. event, rate", zzhrVar8.zzk(), java.lang.Integer.valueOf(zzm));
                                            arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc());
                                            zzicVar7.zzf(i26, zzhrVar8);
                                            zzpbVar2 = zzpbVar3;
                                        } else {
                                            com.google.android.gms.measurement.internal.zzbc zzbcVar3 = (com.google.android.gms.measurement.internal.zzbc) hashMap2.get(zzhrVar8.zzk());
                                            if (zzbcVar3 == null) {
                                                j2 = parseLong;
                                                zzbcVar3 = zzj().zzf(zzpbVar3.zza.zzA(), zzhrVar8.zzk());
                                                if (zzbcVar3 == null) {
                                                    zzaV().zze().zzc("Event being bundled has no eventAggregate. appId, eventName", zzpbVar3.zza.zzA(), zzhrVar8.zzk());
                                                    zzbcVar3 = new com.google.android.gms.measurement.internal.zzbc(zzpbVar3.zza.zzA(), zzhrVar8.zzk(), 1L, 1L, 1L, zzhrVar8.zzn(), 0L, null, null, null, null);
                                                }
                                            } else {
                                                j2 = parseLong;
                                            }
                                            zzp();
                                            java.lang.Long l4 = (java.lang.Long) com.google.android.gms.measurement.internal.zzpj.zzI((com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc(), "_eid");
                                            boolean z13 = l4 != null;
                                            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z13);
                                            zzpbVar2 = zzpbVar3;
                                            if (zzm == 1) {
                                                arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc());
                                                valueOf2.getClass();
                                                if (z13 && (zzbcVar3.zzi != null || zzbcVar3.zzj != null || zzbcVar3.zzk != null)) {
                                                    hashMap2.put(zzhrVar8.zzk(), zzbcVar3.zzc(null, null, null));
                                                }
                                                zzicVar7.zzf(i26, zzhrVar8);
                                            } else {
                                                if (zzf3.nextInt(zzm) == 0) {
                                                    zzp();
                                                    java.security.SecureRandom secureRandom2 = zzf3;
                                                    int i27 = i26;
                                                    java.lang.Long valueOf3 = java.lang.Long.valueOf(zzm);
                                                    com.google.android.gms.measurement.internal.zzpj.zzC(zzhrVar8, "_sr", valueOf3);
                                                    arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc());
                                                    valueOf2.getClass();
                                                    if (z13) {
                                                        zzbcVar3 = zzbcVar3.zzc(null, valueOf3, null);
                                                    }
                                                    hashMap2.put(zzhrVar8.zzk(), zzbcVar3.zzb(zzhrVar8.zzn(), zzaj2));
                                                    hashMap = hashMap2;
                                                    secureRandom = secureRandom2;
                                                    zzicVar3 = zzicVar7;
                                                    i2 = i27;
                                                } else {
                                                    java.security.SecureRandom secureRandom3 = zzf3;
                                                    int i28 = i26;
                                                    java.lang.Long l5 = zzbcVar3.zzh;
                                                    if (l5 != null) {
                                                        secureRandom = secureRandom3;
                                                        zzbcVar = zzbcVar3;
                                                        zzicVar2 = zzicVar7;
                                                        hashMap = hashMap2;
                                                        zzaj = l5.longValue();
                                                    } else {
                                                        hashMap = hashMap2;
                                                        secureRandom = secureRandom3;
                                                        zzbcVar = zzbcVar3;
                                                        zzicVar2 = zzicVar7;
                                                        zzaj = zzt().zzaj(zzhrVar8.zzp(), j2);
                                                    }
                                                    if (zzaj != zzaj2) {
                                                        zzp();
                                                        com.google.android.gms.measurement.internal.zzpj.zzC(zzhrVar8, "_efs", l);
                                                        zzp();
                                                        java.lang.Long valueOf4 = java.lang.Long.valueOf(zzm);
                                                        com.google.android.gms.measurement.internal.zzpj.zzC(zzhrVar8, "_sr", valueOf4);
                                                        arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc());
                                                        valueOf2.getClass();
                                                        hashMap.put(zzhrVar8.zzk(), (z13 ? zzbcVar.zzc(null, valueOf4, true) : zzbcVar).zzb(zzhrVar8.zzn(), zzaj2));
                                                        i2 = i28;
                                                        zzicVar3 = zzicVar2;
                                                    } else {
                                                        com.google.android.gms.measurement.internal.zzbc zzbcVar4 = zzbcVar;
                                                        valueOf2.getClass();
                                                        if (z13) {
                                                            hashMap.put(zzhrVar8.zzk(), zzbcVar4.zzc(l4, null, null));
                                                        }
                                                        i2 = i28;
                                                        zzicVar3 = zzicVar2;
                                                    }
                                                }
                                                zzicVar3.zzf(i2, zzhrVar8);
                                            }
                                        }
                                        secureRandom = zzf3;
                                        i2 = i26;
                                        zzicVar3 = zzicVar7;
                                        hashMap = hashMap2;
                                    }
                                    parseLong = j3;
                                    long zzaj22 = zzt().zzaj(zzhrVar8.zzn(), parseLong);
                                    com.google.android.gms.internal.measurement.zzhs zzhsVar2 = (com.google.android.gms.internal.measurement.zzhs) zzhrVar8.zzbc();
                                    java.lang.Long l32 = 1L;
                                    if (!android.text.TextUtils.isEmpty("_dbg")) {
                                    }
                                    l = l32;
                                    zzm = zzh().zzm(zzpbVar3.zza.zzA(), zzhrVar8.zzk());
                                    if (zzm > 0) {
                                    }
                                    secureRandom = zzf3;
                                    i2 = i26;
                                    zzicVar3 = zzicVar7;
                                    hashMap = hashMap2;
                                }
                                zzicVar7 = zzicVar3;
                                hashMap2 = hashMap;
                                zzpbVar3 = zzpbVar2;
                                zzf3 = secureRandom;
                                zzpfVar = this;
                                i26 = i2 + 1;
                                j3 = 0;
                            }
                            java.util.HashMap hashMap3 = hashMap2;
                            com.google.android.gms.measurement.internal.zzpb zzpbVar4 = zzpbVar3;
                            zzicVar = zzicVar7;
                            if (arrayList3.size() < zzicVar.zzc()) {
                                zzicVar.zzi();
                                zzicVar.zzh(arrayList3);
                            }
                            java.util.Iterator it7 = hashMap3.entrySet().iterator();
                            while (it7.hasNext()) {
                                zzj().zzh((com.google.android.gms.measurement.internal.zzbc) ((java.util.Map.Entry) it7.next()).getValue());
                            }
                            zzpbVar = zzpbVar4;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            java.lang.Throwable th2 = th;
                            zzj().zzd();
                            throw th2;
                        }
                    } else {
                        zzicVar = zzicVar7;
                        zzpbVar = zzpbVar3;
                    }
                    java.lang.String zzA6 = zzpbVar.zza.zzA();
                    com.google.android.gms.measurement.internal.zzh zzu3 = zzj().zzu(zzA6);
                    if (zzu3 == null) {
                        zzaV().zzb().zzb("Bundling raw events w/o app info. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzpbVar.zza.zzA()));
                    } else if (zzicVar.zzc() > 0) {
                        long zzp2 = zzu3.zzp();
                        if (zzp2 != 0) {
                            zzicVar.zzA(zzp2);
                        } else {
                            zzicVar.zzB();
                        }
                        long zzn10 = zzu3.zzn();
                        if (zzn10 != 0) {
                            zzp2 = zzn10;
                        }
                        if (zzp2 != 0) {
                            zzicVar.zzy(zzp2);
                        } else {
                            zzicVar.zzz();
                        }
                        zzu3.zzM(zzicVar.zzc());
                        zzicVar.zzaJ((int) zzu3.zzaF());
                        zzicVar.zzZ((int) zzu3.zzG());
                        zzu3.zzo(zzicVar.zzu());
                        zzu3.zzq(zzicVar.zzw());
                        java.lang.String zzaa = zzu3.zzaa();
                        if (zzaa != null) {
                            zzicVar.zzaa(zzaa);
                        } else {
                            zzicVar.zzab();
                        }
                        zzj().zzv(zzu3, false, false);
                    }
                    if (zzicVar.zzc() > 0) {
                        this.zzn.zzaU();
                        com.google.android.gms.internal.measurement.zzgl zzb2 = zzh().zzb(zzpbVar.zza.zzA());
                        if (zzb2 != null && zzb2.zza()) {
                            zzicVar.zzal(zzb2.zzb());
                            zzj().zzz((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc(), z2);
                        }
                        if (zzpbVar.zza.zzP().isEmpty()) {
                            zzicVar.zzal(-1L);
                        } else {
                            zzaV().zze().zzb("Did not find measurement config or missing version info. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzpbVar.zza.zzA()));
                        }
                        zzj().zzz((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc(), z2);
                    }
                    zzj().zzS(zzpbVar.zzb);
                    zzj().zzT(zzA6);
                    zzj().zzc();
                    z = true;
                    zzj().zzd();
                    return z;
                }
                z = false;
                zzj().zzc();
                zzj().zzd();
                return z;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    private final void zzaG(com.google.android.gms.internal.measurement.zzic zzicVar, long j, boolean z) {
        java.lang.Object obj;
        java.lang.String str = true != z ? "_lte" : "_se";
        com.google.android.gms.measurement.internal.zzpm zzm = zzj().zzm(zzicVar.zzK(), str);
        com.google.android.gms.measurement.internal.zzpm zzpmVar = (zzm == null || (obj = zzm.zze) == null) ? new com.google.android.gms.measurement.internal.zzpm(zzicVar.zzK(), "auto", str, zzaZ().currentTimeMillis(), java.lang.Long.valueOf(j)) : new com.google.android.gms.measurement.internal.zzpm(zzicVar.zzK(), "auto", str, zzaZ().currentTimeMillis(), java.lang.Long.valueOf(((java.lang.Long) obj).longValue() + j));
        com.google.android.gms.internal.measurement.zzit zzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
        zzm2.zzb(str);
        zzm2.zza(zzaZ().currentTimeMillis());
        java.lang.Object obj2 = zzpmVar.zze;
        zzm2.zze(((java.lang.Long) obj2).longValue());
        com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) zzm2.zzbc();
        int zzx = com.google.android.gms.measurement.internal.zzpj.zzx(zzicVar, str);
        if (zzx >= 0) {
            zzicVar.zzn(zzx, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j > 0) {
            zzj().zzl(zzpmVar);
            zzaV().zzk().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean zzaH(com.google.android.gms.internal.measurement.zzhr zzhrVar, com.google.android.gms.internal.measurement.zzhr zzhrVar2) {
        com.google.android.gms.common.internal.Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF = com.google.android.gms.measurement.internal.zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_sc");
        java.lang.String zzd = zzF == null ? null : zzF.zzd();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF2 = com.google.android.gms.measurement.internal.zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_pc");
        java.lang.String zzd2 = zzF2 != null ? zzF2.zzd() : null;
        if (zzd2 == null || !zzd2.equals(zzd)) {
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF3 = com.google.android.gms.measurement.internal.zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_et");
        if (zzF3 == null || !zzF3.zze() || zzF3.zzf() <= 0) {
            return true;
        }
        long zzf = zzF3.zzf();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF4 = com.google.android.gms.measurement.internal.zzpj.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_et");
        if (zzF4 != null && zzF4.zzf() > 0) {
            zzf += zzF4.zzf();
        }
        zzp();
        com.google.android.gms.measurement.internal.zzpj.zzC(zzhrVar2, "_et", java.lang.Long.valueOf(zzf));
        zzp();
        com.google.android.gms.measurement.internal.zzpj.zzC(zzhrVar, "_fr", 1L);
        return true;
    }

    private final boolean zzaI() {
        zzaW().zzg();
        zzu();
        return zzj().zzP() || !android.text.TextUtils.isEmpty(zzj().zzF());
    }

    private static java.lang.String zzaJ(java.util.Map map, java.lang.String str) {
        if (map == null) {
            return null;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((java.lang.String) entry.getKey())) {
                if (((java.util.List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (java.lang.String) ((java.util.List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaK() {
        long max;
        long j;
        zzaW().zzg();
        zzu();
        if (this.zza > 0) {
            long abs = 3600000 - java.lang.Math.abs(zzaZ().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzaV().zzk().zzb("Upload has been suspended. Will update scheduling later in approximately ms", java.lang.Long.valueOf(abs));
                zzk().zzb();
                zzl().zzd();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzH() || !zzaI()) {
            zzaV().zzk().zza("Nothing to upload or uploading impossible");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        long currentTimeMillis = zzaZ().currentTimeMillis();
        zzd();
        long max2 = java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzO.zzb(null)).longValue());
        boolean z = true;
        if (!zzj().zzR() && !zzj().zzG()) {
            z = false;
        }
        if (z) {
            java.lang.String zzA = zzd().zzA();
            if (android.text.TextUtils.isEmpty(zzA) || ".none.".equals(zzA)) {
                zzd();
                max = java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzI.zzb(null)).longValue());
            } else {
                zzd();
                max = java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzJ.zzb(null)).longValue());
            }
        } else {
            zzd();
            max = java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzH.zzb(null)).longValue());
        }
        long zza = this.zzk.zzd.zza();
        long zza2 = this.zzk.zze.zza();
        boolean z2 = z;
        long max3 = java.lang.Math.max(zzj().zzM(), zzj().zzO());
        if (max3 != 0) {
            long abs2 = currentTimeMillis - java.lang.Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - java.lang.Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - java.lang.Math.abs(zza2 - currentTimeMillis);
            j = abs2 + max2;
            long max4 = java.lang.Math.max(abs3, abs4);
            if (z2 && max4 > 0) {
                j = java.lang.Math.min(abs2, max4) + max;
            }
            if (!zzp().zzs(max4, max)) {
                j = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    zzd();
                    if (i >= java.lang.Math.min(20, java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzQ.zzb(null)).intValue()))) {
                        break;
                    }
                    zzd();
                    j += java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzP.zzb(null)).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (j != 0) {
                zzaV().zzk().zza("Next upload time is 0");
                zzk().zzb();
                zzl().zzd();
                return;
            }
            if (!zzi().zzb()) {
                zzaV().zzk().zza("No network");
                zzk().zza();
                zzl().zzd();
                return;
            }
            long zza3 = this.zzk.zzc.zza();
            zzd();
            long max5 = java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzF.zzb(null)).longValue());
            if (!zzp().zzs(zza3, max5)) {
                j = java.lang.Math.max(j, zza3 + max5);
            }
            zzk().zzb();
            long currentTimeMillis2 = j - zzaZ().currentTimeMillis();
            if (currentTimeMillis2 <= 0) {
                zzd();
                currentTimeMillis2 = java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzK.zzb(null)).longValue());
                this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
            }
            zzaV().zzk().zzb("Upload scheduled in approximately ms", java.lang.Long.valueOf(currentTimeMillis2));
            zzl().zzc(currentTimeMillis2);
            return;
        }
        j = 0;
        if (j != 0) {
        }
    }

    private final void zzaL() {
        zzaW().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaV().zzk().zzd("Not stopping services. fetch, network, upload", java.lang.Boolean.valueOf(this.zzu), java.lang.Boolean.valueOf(this.zzv), java.lang.Boolean.valueOf(this.zzw));
            return;
        }
        zzaV().zzk().zza("Stopping uploading service(s)");
        java.util.List list = this.zzq;
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final java.lang.Boolean zzaM(com.google.android.gms.measurement.internal.zzh zzhVar) {
        try {
            if (zzhVar.zzt() != -2147483648L) {
                if (zzhVar.zzt() == com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionCode) {
                    return true;
                }
            } else {
                java.lang.String str = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionName;
                java.lang.String zzr = zzhVar.zzr();
                if (zzr != null && zzr.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final com.google.android.gms.measurement.internal.zzr zzaN(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(str);
        if (zzu == null || android.text.TextUtils.isEmpty(zzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping", str);
            return null;
        }
        java.lang.Boolean zzaM = zzaM(zzu);
        if (zzaM == null || zzaM.booleanValue()) {
            return new com.google.android.gms.measurement.internal.zzr(str, zzu.zzf(), zzu.zzr(), zzu.zzt(), zzu.zzv(), zzu.zzx(), zzu.zzz(), (java.lang.String) null, zzu.zzD(), false, zzu.zzl(), 0L, 0, zzu.zzac(), false, zzu.zzae(), zzu.zzB(), zzu.zzag(), zzB(str).zzl(), "", (java.lang.String) null, zzu.zzai(), zzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzu.zzao(), zzu.zzaw(), zzu.zzay(), zzu.zzaH(), 0L, zzu.zzaL());
        }
        zzaV().zzb().zzb("App version does not match; dropping. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
        return null;
    }

    private final boolean zzaO(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.measurement.internal.zzbc zzf = zzj().zzf(str, str2);
        return zzf == null || zzf.zzc < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaP(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, android.app.BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private static final boolean zzaQ(com.google.android.gms.measurement.internal.zzr zzrVar) {
        return !android.text.TextUtils.isEmpty(zzrVar.zzb);
    }

    private static final void zzaR(com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzicVar.zzv(Long.MAX_VALUE);
        zzicVar.zzx(Long.MIN_VALUE);
        for (int i = 0; i < zzicVar.zzc(); i++) {
            com.google.android.gms.internal.measurement.zzhs zzd = zzicVar.zzd(i);
            if (zzd.zzf() < zzicVar.zzu()) {
                zzicVar.zzv(zzd.zzf());
            }
            if (zzd.zzf() > zzicVar.zzw()) {
                zzicVar.zzx(zzd.zzf());
            }
        }
    }

    private static final com.google.android.gms.measurement.internal.zzor zzaS(com.google.android.gms.measurement.internal.zzor zzorVar) {
        if (zzorVar == null) {
            throw new java.lang.IllegalStateException("Upload Component not created");
        }
        if (zzorVar.zzax()) {
            return zzorVar;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzorVar.getClass());
        java.lang.String.valueOf(valueOf);
        throw new java.lang.IllegalStateException("Component not initialized: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static final java.lang.Boolean zzaT(com.google.android.gms.measurement.internal.zzr zzrVar) {
        java.lang.Boolean bool = zzrVar.zzp;
        java.lang.String str = zzrVar.zzC;
        if (!android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.measurement.internal.zzjh zza = com.google.android.gms.measurement.internal.zze.zzc(str).zza();
            com.google.android.gms.measurement.internal.zzjh zzjhVar = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
            int ordinal = zza.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return true;
            }
            if (ordinal == 3) {
                return false;
            }
        }
        return bool;
    }

    static final void zzaz(com.google.android.gms.internal.measurement.zzhr zzhrVar, int i, java.lang.String str) {
        java.util.List zza = zzhrVar.zza();
        for (int i2 = 0; i2 < zza.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i2)).zzb())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn.zzb("_err");
        long j = i;
        java.lang.Long.valueOf(j).getClass();
        zzn.zzf(j);
        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzn.zzbc();
        com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn2.zzb("_ev");
        zzn2.zzd(str);
        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    final void zzA(java.lang.String str, com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        zzaW().zzg();
        zzu();
        this.zzC.put(str, zzjkVar);
        zzj().zzab(str, zzjkVar);
    }

    final com.google.android.gms.measurement.internal.zzjk zzB(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzjk zzjkVar = com.google.android.gms.measurement.internal.zzjk.zza;
        zzaW().zzg();
        zzu();
        com.google.android.gms.measurement.internal.zzjk zzjkVar2 = (com.google.android.gms.measurement.internal.zzjk) this.zzC.get(str);
        if (zzjkVar2 == null) {
            zzjkVar2 = zzj().zzZ(str);
            if (zzjkVar2 == null) {
                zzjkVar2 = com.google.android.gms.measurement.internal.zzjk.zza;
            }
            zzA(str, zzjkVar2);
        }
        return zzjkVar2;
    }

    final long zzC() {
        long currentTimeMillis = zzaZ().currentTimeMillis();
        com.google.android.gms.measurement.internal.zznm zznmVar = this.zzk;
        zznmVar.zzay();
        zznmVar.zzg();
        com.google.android.gms.measurement.internal.zzhd zzhdVar = zznmVar.zzf;
        long zza = zzhdVar.zza();
        if (zza == 0) {
            zza = zznmVar.zzu.zzk().zzf().nextInt(86400000) + 1;
            zzhdVar.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    final void zzD(com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str) {
        com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(str);
        if (zzu == null || android.text.TextUtils.isEmpty(zzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping event", str);
            return;
        }
        java.lang.Boolean zzaM = zzaM(zzu);
        if (zzaM == null) {
            if (!"_ui".equals(zzbgVar.zza)) {
                zzaV().zze().zzb("Could not find package. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
            }
        } else if (!zzaM.booleanValue()) {
            zzaV().zzb().zzb("App version does not match; dropping event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
            return;
        }
        zzE(zzbgVar, new com.google.android.gms.measurement.internal.zzr(str, zzu.zzf(), zzu.zzr(), zzu.zzt(), zzu.zzv(), zzu.zzx(), zzu.zzz(), (java.lang.String) null, zzu.zzD(), false, zzu.zzl(), 0L, 0, zzu.zzac(), false, zzu.zzae(), zzu.zzB(), zzu.zzag(), zzB(str).zzl(), "", (java.lang.String) null, zzu.zzai(), zzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzu.zzao(), zzu.zzaw(), zzu.zzay(), zzu.zzaH(), 0L, zzu.zzaL()));
    }

    final void zzE(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzgu zza = com.google.android.gms.measurement.internal.zzgu.zza(zzbgVar);
        zzt().zzI(zza.zzd, zzj().zzW(str));
        zzt().zzG(zza, zzd().zzd(str));
        com.google.android.gms.measurement.internal.zzbg zzb2 = zza.zzb();
        if (!zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbg) && com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzb2.zza)) {
            com.google.android.gms.measurement.internal.zzbe zzbeVar = zzb2.zzb;
            if ("referrer API v2".equals(zzbeVar.zzd("_cis"))) {
                java.lang.String zzd = zzbeVar.zzd("gclid");
                if (!android.text.TextUtils.isEmpty(zzd)) {
                    zzab(new com.google.android.gms.measurement.internal.zzpk("_lgclid", zzb2.zzd, zzd, "auto"), zzrVar);
                }
            }
        }
        zzF(zzb2, zzrVar);
    }

    final void zzF(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzbg zzbgVar2;
        java.util.List<com.google.android.gms.measurement.internal.zzah> zzt;
        java.util.List<com.google.android.gms.measurement.internal.zzah> zzt2;
        java.util.List<com.google.android.gms.measurement.internal.zzah> zzt3;
        java.lang.String str;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        java.lang.String str2 = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzaW().zzg();
        zzu();
        long j = zzbgVar.zzd;
        com.google.android.gms.measurement.internal.zzgu zza = com.google.android.gms.measurement.internal.zzgu.zza(zzbgVar);
        zzaW().zzg();
        com.google.android.gms.measurement.internal.zzpo.zzav((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zza.zzd, false);
        com.google.android.gms.measurement.internal.zzbg zzb2 = zza.zzb();
        zzp();
        if (com.google.android.gms.measurement.internal.zzpj.zzD(zzb2, zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            java.util.List list = zzrVar.zzr;
            if (list != null) {
                java.lang.String str3 = zzb2.zza;
                if (!list.contains(str3)) {
                    zzaV().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzb2.zza, zzb2.zzc);
                    return;
                } else {
                    android.os.Bundle zzf = zzb2.zzb.zzf();
                    zzf.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new com.google.android.gms.measurement.internal.zzbg(str3, new com.google.android.gms.measurement.internal.zzbe(zzf), zzb2.zzc, zzb2.zzd);
                }
            } else {
                zzbgVar2 = zzb2;
            }
            zzj().zzb();
            try {
                java.lang.String str4 = zzbgVar2.zza;
                if ("_s".equals(str4) && !zzj().zzQ(str2, "_s") && zzbgVar2.zzb.zzb("_sid").longValue() != 0) {
                    if (!zzj().zzQ(str2, "_f") && !zzj().zzQ(str2, "_v")) {
                        zzj().zzY(str2, java.lang.Long.valueOf(zzaZ().currentTimeMillis() - 15000), "_sid", zzG(str2, zzbgVar2));
                    }
                    zzj().zzY(str2, null, "_sid", zzG(str2, zzbgVar2));
                }
                com.google.android.gms.measurement.internal.zzav zzj = zzj();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
                zzj.zzg();
                zzj.zzay();
                if (j < 0) {
                    zzj.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", com.google.android.gms.measurement.internal.zzgt.zzl(str2), java.lang.Long.valueOf(j));
                    zzt = java.util.Collections.emptyList();
                } else {
                    zzt = zzj.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new java.lang.String[]{str2, java.lang.String.valueOf(j)});
                }
                for (com.google.android.gms.measurement.internal.zzah zzahVar : zzt) {
                    if (zzahVar != null) {
                        zzaV().zzk().zzd("User property timed out", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb), zzahVar.zzc.zza());
                        com.google.android.gms.measurement.internal.zzbg zzbgVar3 = zzahVar.zzg;
                        if (zzbgVar3 != null) {
                            zzH(new com.google.android.gms.measurement.internal.zzbg(zzbgVar3, j), zzrVar);
                        }
                        zzj().zzr(str2, zzahVar.zzc.zzb);
                    }
                }
                com.google.android.gms.measurement.internal.zzav zzj2 = zzj();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
                zzj2.zzg();
                zzj2.zzay();
                if (j < 0) {
                    zzj2.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", com.google.android.gms.measurement.internal.zzgt.zzl(str2), java.lang.Long.valueOf(j));
                    zzt2 = java.util.Collections.emptyList();
                } else {
                    zzt2 = zzj2.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new java.lang.String[]{str2, java.lang.String.valueOf(j)});
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(zzt2.size());
                for (com.google.android.gms.measurement.internal.zzah zzahVar2 : zzt2) {
                    if (zzahVar2 != null) {
                        zzaV().zzk().zzd("User property expired", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                        zzj().zzk(str2, zzahVar2.zzc.zzb);
                        com.google.android.gms.measurement.internal.zzbg zzbgVar4 = zzahVar2.zzk;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        zzj().zzr(str2, zzahVar2.zzc.zzb);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzH(new com.google.android.gms.measurement.internal.zzbg((com.google.android.gms.measurement.internal.zzbg) it.next(), j), zzrVar);
                }
                com.google.android.gms.measurement.internal.zzav zzj3 = zzj();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str4);
                zzj3.zzg();
                zzj3.zzay();
                if (j < 0) {
                    com.google.android.gms.measurement.internal.zzib zzibVar = zzj3.zzu;
                    zzibVar.zzaV().zze().zzd("Invalid time querying triggered conditional properties", com.google.android.gms.measurement.internal.zzgt.zzl(str2), zzibVar.zzl().zza(str4), java.lang.Long.valueOf(j));
                    zzt3 = java.util.Collections.emptyList();
                } else {
                    zzt3 = zzj3.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new java.lang.String[]{str2, str4, java.lang.String.valueOf(j)});
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(zzt3.size());
                for (com.google.android.gms.measurement.internal.zzah zzahVar3 : zzt3) {
                    if (zzahVar3 != null) {
                        com.google.android.gms.measurement.internal.zzpk zzpkVar = zzahVar3.zzc;
                        com.google.android.gms.measurement.internal.zzpm zzpmVar = new com.google.android.gms.measurement.internal.zzpm((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar3.zza), zzahVar3.zzb, zzpkVar.zzb, j, com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpkVar.zza()));
                        if (zzj().zzl(zzpmVar)) {
                            zzaV().zzk().zzd("User property triggered", zzahVar3.zza, this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                        } else {
                            zzaV().zzb().zzd("Too many active user properties, ignoring", com.google.android.gms.measurement.internal.zzgt.zzl(zzahVar3.zza), this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                        }
                        com.google.android.gms.measurement.internal.zzbg zzbgVar5 = zzahVar3.zzi;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.zzc = new com.google.android.gms.measurement.internal.zzpk(zzpmVar);
                        zzahVar3.zze = true;
                        zzj().zzp(zzahVar3);
                    }
                }
                zzH(zzbgVar2, zzrVar);
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzH(new com.google.android.gms.measurement.internal.zzbg((com.google.android.gms.measurement.internal.zzbg) it2.next(), j), zzrVar);
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final android.os.Bundle zzG(java.lang.String str, com.google.android.gms.measurement.internal.zzbg zzbgVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_sid", zzbgVar.zzb.zzb("_sid").longValue());
        com.google.android.gms.measurement.internal.zzpm zzm = zzj().zzm(str, "_sno");
        if (zzm != null) {
            java.lang.Object obj = zzm.zze;
            if (obj instanceof java.lang.Long) {
                bundle.putLong("_sno", ((java.lang.Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:367|(9:372|373|(1:375)|57|(0)(0)|60|(0)(0)|66|67)|376|377|378|379|373|(0)|57|(0)(0)|60|(0)(0)|66|67) */
    /* JADX WARN: Can't wrap try/catch for region: R(66:68|(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))|84|85|(1:87)(1:339)|88|(2:92|(1:94))|95|(2:101|(2:103|104))|107|(6:108|109|110|111|112|113)|114|(1:116)|117|(2:119|(1:123)(1:122))(1:331)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|(1:330)(6:146|(1:150)|151|(1:153)(1:329)|154|(1:156)(15:300|(1:302)(1:328)|303|(1:305)(1:327)|306|(1:308)(1:326)|309|(1:311)(1:325)|312|(1:314)(1:324)|315|(1:317)(1:323)|318|(1:320)(1:322)|321))|157|(1:159)|160|(1:162)(1:299)|(4:167|(4:170|(3:172|173|(2:175|(2:177|179)(1:289))(1:291))(1:296)|290|168)|297|180)|298|(1:183)|184|(1:186)|187|(2:191|(4:193|(1:195)|196|(28:204|(1:206)(1:287)|207|(1:209)|210|211|(2:213|(1:215))|216|(3:218|(1:220)|221)(1:286)|222|(1:226)|227|(1:229)|230|(4:233|(2:239|240)|241|231)|245|246|247|248|249|(2:250|(2:252|(1:254)(1:269))(3:270|271|(1:276)(1:275)))|256|257|258|(1:260)(2:265|266)|261|262|263)))|288|211|(0)|216|(0)(0)|222|(2:224|226)|227|(0)|230|(1:231)|245|246|247|248|249|(3:250|(0)(0)|269)|256|257|258|(0)(0)|261|262|263) */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x07e9, code lost:
    
        if (r12.isEmpty() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0a78, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0b2c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0b2d, code lost:
    
        r2.zzu.zzaV().zzb().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r3.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0b5e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0b60, code lost:
    
        zzaV().zzb().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r4.zzK()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0295, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0297, code lost:
    
        r10.zzu.zzaV().zzb().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x052a A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x056c A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x061f A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x062a A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0635 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0640 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x064c A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x065d A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0733 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0759 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x078c A[Catch: all -> 0x0ba6, TRY_LEAVE, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07ee A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07fe A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0835 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x08f2 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0909 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0972 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0993 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x09af A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a6b A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0b13 A[Catch: SQLiteException -> 0x0b2c, all -> 0x0ba6, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0b2c, blocks: (B:258:0x0b02, B:260:0x0b13), top: B:257:0x0b02, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a7a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x075e A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05db A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0318 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x019d A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0201 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02ce A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x01f3 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0384 A[Catch: all -> 0x0ba6, TryCatch #2 {all -> 0x0ba6, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:57:0x0302, B:60:0x033b, B:62:0x0384, B:64:0x038b, B:65:0x03a2, B:70:0x03af, B:72:0x03c7, B:74:0x03ce, B:75:0x03e5, B:78:0x0405, B:82:0x0428, B:83:0x043f, B:84:0x0448, B:87:0x0467, B:88:0x0480, B:90:0x048a, B:92:0x0496, B:94:0x049c, B:95:0x04a3, B:97:0x04b0, B:99:0x04b8, B:101:0x04c0, B:104:0x04c8, B:107:0x04d4, B:109:0x04e1, B:112:0x0506, B:116:0x052a, B:117:0x053f, B:119:0x056c, B:122:0x0583, B:123:0x05bf, B:124:0x05e7, B:126:0x061f, B:127:0x0622, B:129:0x062a, B:130:0x062d, B:132:0x0635, B:133:0x0638, B:135:0x0640, B:136:0x0643, B:138:0x064c, B:139:0x0650, B:141:0x065d, B:142:0x0660, B:144:0x068c, B:146:0x0696, B:150:0x06ab, B:154:0x06b8, B:157:0x072d, B:159:0x0733, B:160:0x0736, B:162:0x0759, B:164:0x0764, B:167:0x076c, B:168:0x0786, B:170:0x078c, B:173:0x07a0, B:175:0x07ac, B:177:0x07b9, B:294:0x07d3, B:180:0x07e5, B:183:0x07ee, B:184:0x07f1, B:186:0x07fe, B:187:0x0803, B:189:0x0821, B:191:0x0825, B:193:0x0835, B:195:0x0840, B:196:0x084b, B:198:0x0855, B:200:0x0861, B:202:0x086b, B:204:0x0871, B:206:0x0881, B:207:0x0895, B:209:0x089b, B:210:0x08a4, B:211:0x08b6, B:213:0x08f2, B:215:0x08fc, B:216:0x08ff, B:218:0x0909, B:220:0x0928, B:221:0x0933, B:222:0x096a, B:224:0x0972, B:226:0x097c, B:227:0x0989, B:229:0x0993, B:230:0x09a0, B:231:0x09a9, B:233:0x09af, B:235:0x09eb, B:237:0x09f3, B:239:0x0a05, B:246:0x0a0b, B:248:0x0a4f, B:249:0x0a5a, B:250:0x0a65, B:252:0x0a6b, B:256:0x0ab7, B:258:0x0b02, B:260:0x0b13, B:261:0x0b75, B:266:0x0b29, B:268:0x0b2d, B:271:0x0a7a, B:273:0x0aa4, B:280:0x0b46, B:281:0x0b5d, B:285:0x0b60, B:299:0x075e, B:300:0x06c1, B:303:0x06cd, B:306:0x06db, B:309:0x06e9, B:312:0x06f7, B:315:0x0705, B:318:0x0711, B:321:0x071e, B:331:0x05db, B:335:0x0512, B:340:0x0318, B:341:0x031f, B:343:0x0325, B:346:0x0334, B:351:0x018f, B:353:0x019d, B:355:0x01b2, B:360:0x01c9, B:363:0x01fb, B:365:0x0201, B:367:0x020f, B:369:0x0224, B:372:0x022b, B:373:0x02c4, B:375:0x02ce, B:376:0x0258, B:378:0x0278, B:379:0x02aa, B:383:0x0297, B:385:0x01d5, B:386:0x01f3), top: B:41:0x0157, inners: #1, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzH(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        boolean z;
        java.lang.String zzd;
        long longValue;
        java.lang.String str;
        com.google.android.gms.measurement.internal.zzbg zzbgVar2;
        java.lang.String str2;
        com.google.android.gms.measurement.internal.zzpm zzpmVar;
        com.google.android.gms.measurement.internal.zzbe zzbeVar;
        long j;
        long zzH;
        java.lang.String str3;
        long j2;
        com.google.android.gms.measurement.internal.zzbb zzbbVar;
        java.lang.String str4;
        com.google.android.gms.measurement.internal.zzbc zzf;
        com.google.android.gms.measurement.internal.zzbc zza;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        long j3;
        java.lang.String str9;
        long j4;
        java.util.Map emptyMap;
        java.util.ArrayList arrayList;
        java.lang.String str10;
        com.google.android.gms.measurement.internal.zzjk zzs;
        com.google.android.gms.measurement.internal.zzjj zzjjVar;
        com.google.android.gms.measurement.internal.zzjk zzjkVar;
        com.google.android.gms.measurement.internal.zzjj zzjjVar2;
        java.lang.String str11;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        com.google.android.gms.measurement.internal.zzh zzu;
        com.google.android.gms.measurement.internal.zzjk zzjkVar2;
        java.util.List zzn;
        int i;
        com.google.android.gms.measurement.internal.zzav zzj;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        com.google.android.gms.measurement.internal.zzav zzj2;
        com.google.android.gms.measurement.internal.zzbd zzbdVar;
        int i2;
        android.content.ContentValues contentValues;
        android.util.Pair zzc;
        com.google.android.gms.measurement.internal.zzh zzu2;
        com.google.android.gms.measurement.internal.zzpm zzm;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        java.lang.String str12 = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str12);
        long nanoTime = java.lang.System.nanoTime();
        zzaW().zzg();
        zzu();
        zzp();
        if (com.google.android.gms.measurement.internal.zzpj.zzD(zzbgVar, zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            com.google.android.gms.measurement.internal.zzhs zzh = zzh();
            java.lang.String str13 = zzbgVar.zza;
            if (zzh.zzj(str12, str13)) {
                zzaV().zze().zzc("Dropping blocked event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str12), this.zzn.zzl().zza(str13));
                if (!zzh().zzn(str12) && !zzh().zzo(str12)) {
                    if ("_err".equals(str13)) {
                        return;
                    }
                    zzt().zzN(this.zzK, str12, 11, "_ev", str13, 0);
                    return;
                }
                com.google.android.gms.measurement.internal.zzh zzu3 = zzj().zzu(str12);
                if (zzu3 != null) {
                    long abs = java.lang.Math.abs(zzaZ().currentTimeMillis() - java.lang.Math.max(zzu3.zzJ(), zzu3.zzH()));
                    zzd();
                    if (abs > ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzN.zzb(null)).longValue()) {
                        zzaV().zzj().zza("Fetching config for blocked app");
                        zzV(zzu3);
                        return;
                    }
                    return;
                }
                return;
            }
            com.google.android.gms.measurement.internal.zzgu zza2 = com.google.android.gms.measurement.internal.zzgu.zza(zzbgVar);
            zzt().zzG(zza2, zzd().zzd(str12));
            int zzn2 = zzd().zzn(str12, com.google.android.gms.measurement.internal.zzfx.zzag, 10, 35);
            android.os.Bundle bundle = zza2.zzd;
            for (java.lang.String str14 : new java.util.TreeSet(bundle.keySet())) {
                if (com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS.equals(str14)) {
                    zzt().zzH(bundle.getParcelableArray(str14), zzn2);
                }
            }
            com.google.android.gms.measurement.internal.zzbg zzb2 = zza2.zzb();
            if (android.util.Log.isLoggable(zzaV().zzn(), 2)) {
                zzaV().zzk().zzb("Logging event", this.zzn.zzl().zzd(zzb2));
            }
            zzj().zzb();
            try {
                zzan(zzrVar);
                java.lang.String str15 = zzb2.zza;
                if (!"ecommerce_purchase".equals(str15) && !com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE.equals(str15) && !com.google.firebase.analytics.FirebaseAnalytics.Event.REFUND.equals(str15)) {
                    z = false;
                    if (!"_iap".equals(str15)) {
                        if (!z) {
                            str = "app_id";
                            zzbgVar2 = zzb2;
                            str2 = "_err";
                            java.lang.String str16 = zzbgVar2.zza;
                            boolean zzh2 = com.google.android.gms.measurement.internal.zzpo.zzh(str16);
                            boolean equals = str2.equals(str16);
                            zzt();
                            zzbeVar = zzbgVar2.zzb;
                            if (zzbeVar == null) {
                                j = 0;
                            } else {
                                com.google.android.gms.measurement.internal.zzbd zzbdVar2 = new com.google.android.gms.measurement.internal.zzbd(zzbeVar);
                                j = 0;
                                while (zzbdVar2.hasNext()) {
                                    java.lang.String next = zzbdVar2.next();
                                    java.lang.String str17 = next;
                                    if (zzbeVar.zza(next) instanceof android.os.Parcelable[]) {
                                        j += ((android.os.Parcelable[]) r11).length;
                                    }
                                }
                            }
                            com.google.android.gms.measurement.internal.zzar zzx = zzj().zzx(zzC(), str12, j + 1, true, zzh2, false, equals, false, false, false);
                            long j5 = zzx.zzb;
                            zzd();
                            zzH = j5 - com.google.android.gms.measurement.internal.zzal.zzH();
                            if (zzH > 0) {
                                if (zzH % 1000 == 1) {
                                    zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", com.google.android.gms.measurement.internal.zzgt.zzl(str12), java.lang.Long.valueOf(zzx.zzb));
                                }
                                zzj().zzc();
                            } else {
                                if (zzh2) {
                                    long j6 = zzx.zza;
                                    zzd();
                                    long intValue = j6 - ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzm.zzb(null)).intValue();
                                    if (intValue > 0) {
                                        if (intValue % 1000 == 1) {
                                            zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", com.google.android.gms.measurement.internal.zzgt.zzl(str12), java.lang.Long.valueOf(zzx.zza));
                                        }
                                        zzt().zzN(this.zzK, str12, 16, "_ev", zzbgVar2.zza, 0);
                                        zzj().zzc();
                                    }
                                }
                                if (equals) {
                                    long max = zzx.zzd - java.lang.Math.max(0, java.lang.Math.min(1000000, zzd().zzm(zzrVar.zza, com.google.android.gms.measurement.internal.zzfx.zzl)));
                                    if (max > 0) {
                                        if (max == 1) {
                                            zzaV().zzb().zzc("Too many error events logged. appId, count", com.google.android.gms.measurement.internal.zzgt.zzl(str12), java.lang.Long.valueOf(zzx.zzd));
                                        }
                                        zzj().zzc();
                                    }
                                }
                                android.os.Bundle zzf2 = zzbeVar.zzf();
                                com.google.android.gms.measurement.internal.zzpo zzt = zzt();
                                java.lang.String str18 = zzbgVar2.zzc;
                                zzt.zzM(zzf2, "_o", str18);
                                if (zzt().zzaa(str12, zzrVar.zzB)) {
                                    zzt().zzM(zzf2, "_dbg", 1L);
                                    zzt().zzM(zzf2, "_r", 1L);
                                }
                                if ("_s".equals(str16) && (zzm = zzj().zzm(zzrVar.zza, "_sno")) != null) {
                                    java.lang.Object obj = zzm.zze;
                                    if (obj instanceof java.lang.Long) {
                                        zzt().zzM(zzf2, "_sno", obj);
                                    }
                                }
                                if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaX) && java.util.Objects.equals(str18, "am") && java.util.Objects.equals(str16, "_ai")) {
                                    java.lang.Object obj2 = zzf2.get("value");
                                    if (obj2 instanceof java.lang.String) {
                                        try {
                                            double parseDouble = java.lang.Double.parseDouble((java.lang.String) obj2);
                                            zzf2.remove("value");
                                            zzf2.putDouble("value", parseDouble);
                                        } catch (java.lang.NumberFormatException unused) {
                                        }
                                    }
                                }
                                com.google.android.gms.measurement.internal.zzav zzj3 = zzj();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str12);
                                zzj3.zzg();
                                zzj3.zzay();
                                try {
                                    str3 = "raw_events";
                                    try {
                                        j2 = zzj3.zze().delete(str3, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new java.lang.String[]{str12, java.lang.String.valueOf(java.lang.Math.max(0, java.lang.Math.min(1000000, zzj3.zzu.zzc().zzm(str12, com.google.android.gms.measurement.internal.zzfx.zzp))))});
                                    } catch (android.database.sqlite.SQLiteException e) {
                                        e = e;
                                        zzj3.zzu.zzaV().zzb().zzc("Error deleting over the limit events. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str12), e);
                                        j2 = 0;
                                        if (j2 > 0) {
                                        }
                                        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzn;
                                        str4 = str3;
                                        zzbbVar = new com.google.android.gms.measurement.internal.zzbb(zzibVar2, zzbgVar2.zzc, str12, zzbgVar2.zza, zzbgVar2.zzd, 0L, zzf2);
                                        com.google.android.gms.measurement.internal.zzav zzj4 = zzj();
                                        java.lang.String str19 = zzbbVar.zzb;
                                        zzf = zzj4.zzf(str12, str19);
                                        if (zzf == null) {
                                        }
                                        zzj().zzh(zza);
                                        zzaW().zzg();
                                        zzu();
                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbbVar);
                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                                        java.lang.String str20 = zzbbVar.zza;
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str20);
                                        str5 = zzrVar.zza;
                                        com.google.android.gms.common.internal.Preconditions.checkArgument(str20.equals(str5));
                                        com.google.android.gms.internal.measurement.zzic zzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                        boolean z2 = true;
                                        zzaE.zza(1);
                                        zzaE.zzC("android");
                                        if (!android.text.TextUtils.isEmpty(str5)) {
                                        }
                                        str6 = zzrVar.zzd;
                                        if (!android.text.TextUtils.isEmpty(str6)) {
                                        }
                                        str7 = zzrVar.zzc;
                                        if (!android.text.TextUtils.isEmpty(str7)) {
                                        }
                                        str8 = zzrVar.zzu;
                                        if (!android.text.TextUtils.isEmpty(str8)) {
                                        }
                                        j3 = zzrVar.zzj;
                                        if (j3 != -2147483648L) {
                                        }
                                        zzaE.zzN(zzrVar.zze);
                                        str9 = zzrVar.zzb;
                                        if (!android.text.TextUtils.isEmpty(str9)) {
                                        }
                                        com.google.android.gms.measurement.internal.zzjk zzs2 = zzB((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str5)).zzs(com.google.android.gms.measurement.internal.zzjk.zzf(zzrVar.zzs, 100));
                                        zzaE.zzat(zzs2.zzk());
                                        com.google.android.gms.internal.measurement.zzql.zza();
                                        if (!zzd().zzp(str5, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
                                        }
                                        j4 = zzrVar.zzf;
                                        if (j4 != 0) {
                                        }
                                        zzaE.zzar(zzrVar.zzq);
                                        com.google.android.gms.measurement.internal.zzpj zzp = zzp();
                                        com.google.android.gms.internal.measurement.zzjq zza3 = com.google.android.gms.internal.measurement.zzjq.zza(zzp.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), com.google.android.gms.measurement.internal.zzfu.zza);
                                        if (zza3 != null) {
                                        }
                                        if (emptyMap != null) {
                                            arrayList = new java.util.ArrayList();
                                            int intValue2 = ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzaf.zzb(null)).intValue();
                                            while (r8.hasNext()) {
                                            }
                                        }
                                        arrayList = null;
                                        if (arrayList != null) {
                                        }
                                        if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbb)) {
                                        }
                                        str10 = zzrVar.zza;
                                        zzs = zzB((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str10)).zzs(com.google.android.gms.measurement.internal.zzjk.zzf(zzrVar.zzs, 100));
                                        zzjjVar = com.google.android.gms.measurement.internal.zzjj.AD_STORAGE;
                                        if (zzs.zzo(zzjjVar)) {
                                            zzc = this.zzk.zzc(str10, zzs);
                                            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) zzc.first)) {
                                            }
                                        }
                                        zzjkVar = zzs;
                                        zzjjVar2 = zzjjVar;
                                        str11 = "_r";
                                        zzibVar = this.zzn;
                                        zzibVar.zzu().zzw();
                                        zzaE.zzF(android.os.Build.MODEL);
                                        zzibVar.zzu().zzw();
                                        zzaE.zzE(android.os.Build.VERSION.RELEASE);
                                        zzaE.zzI((int) zzibVar.zzu().zzb());
                                        zzaE.zzH(zzibVar.zzu().zzc());
                                        zzaE.zzay(zzrVar.zzw);
                                        if (zzibVar.zzB()) {
                                        }
                                        zzu = zzj().zzu(str10);
                                        if (zzu == null) {
                                        }
                                        if (zzjkVar2.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                                        }
                                        if (!android.text.TextUtils.isEmpty(zzu.zzl())) {
                                        }
                                        zzn = zzj().zzn(str10);
                                        while (i < zzn.size()) {
                                        }
                                        zzj = zzj();
                                        zzidVar = (com.google.android.gms.internal.measurement.zzid) zzaE.zzbc();
                                        zzj.zzg();
                                        zzj.zzay();
                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzidVar);
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzidVar.zzA());
                                        byte[] zzcc = zzidVar.zzcc();
                                        long zzt2 = zzj.zzg.zzp().zzt(zzcc);
                                        android.content.ContentValues contentValues2 = new android.content.ContentValues();
                                        java.lang.String str21 = str;
                                        contentValues2.put(str21, zzidVar.zzA());
                                        contentValues2.put("metadata_fingerprint", java.lang.Long.valueOf(zzt2));
                                        contentValues2.put("metadata", zzcc);
                                        zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                        zzj2 = zzj();
                                        zzbdVar = new com.google.android.gms.measurement.internal.zzbd(zzbbVar.zzf);
                                        while (true) {
                                            if (zzbdVar.hasNext()) {
                                            }
                                        }
                                        zzj2.zzg();
                                        zzj2.zzay();
                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbbVar);
                                        java.lang.String str22 = zzbbVar.zza;
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str22);
                                        byte[] zzcc2 = zzj2.zzg.zzp().zzh(zzbbVar).zzcc();
                                        contentValues = new android.content.ContentValues();
                                        contentValues.put(str21, str22);
                                        contentValues.put("name", zzbbVar.zzb);
                                        contentValues.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(zzbbVar.zzd));
                                        contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(zzt2));
                                        contentValues.put("data", zzcc2);
                                        contentValues.put("realtime", java.lang.Integer.valueOf(i2));
                                        if (zzj2.zze().insert(str4, null, contentValues) == -1) {
                                        }
                                        zzj().zzc();
                                        zzj().zzd();
                                        zzaK();
                                        zzaV().zzk().zzb("Background event processing time, ms", java.lang.Long.valueOf(((java.lang.System.nanoTime() - nanoTime) + 500000) / 1000000));
                                        return;
                                    }
                                } catch (android.database.sqlite.SQLiteException e2) {
                                    e = e2;
                                    str3 = "raw_events";
                                }
                                if (j2 > 0) {
                                    zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str12), java.lang.Long.valueOf(j2));
                                }
                                com.google.android.gms.measurement.internal.zzib zzibVar22 = this.zzn;
                                str4 = str3;
                                zzbbVar = new com.google.android.gms.measurement.internal.zzbb(zzibVar22, zzbgVar2.zzc, str12, zzbgVar2.zza, zzbgVar2.zzd, 0L, zzf2);
                                com.google.android.gms.measurement.internal.zzav zzj42 = zzj();
                                java.lang.String str192 = zzbbVar.zzb;
                                zzf = zzj42.zzf(str12, str192);
                                if (zzf == null) {
                                    zzbbVar = zzbbVar.zza(zzibVar22, zzf.zzf);
                                    zza = zzf.zza(zzbbVar.zzd);
                                } else if (zzj().zzU(str12) < zzd().zzh(str12) || !zzh2) {
                                    zza = new com.google.android.gms.measurement.internal.zzbc(str12, str192, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                } else {
                                    zzaV().zzb().zzd("Too many event names used, ignoring event. appId, name, supported count", com.google.android.gms.measurement.internal.zzgt.zzl(str12), zzibVar22.zzl().zza(str192), java.lang.Integer.valueOf(zzd().zzh(str12)));
                                    zzt().zzN(this.zzK, str12, 8, null, null, 0);
                                }
                                zzj().zzh(zza);
                                zzaW().zzg();
                                zzu();
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbbVar);
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                                java.lang.String str202 = zzbbVar.zza;
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str202);
                                str5 = zzrVar.zza;
                                com.google.android.gms.common.internal.Preconditions.checkArgument(str202.equals(str5));
                                com.google.android.gms.internal.measurement.zzic zzaE2 = com.google.android.gms.internal.measurement.zzid.zzaE();
                                boolean z22 = true;
                                zzaE2.zza(1);
                                zzaE2.zzC("android");
                                if (!android.text.TextUtils.isEmpty(str5)) {
                                    zzaE2.zzL(str5);
                                }
                                str6 = zzrVar.zzd;
                                if (!android.text.TextUtils.isEmpty(str6)) {
                                    zzaE2.zzJ(str6);
                                }
                                str7 = zzrVar.zzc;
                                if (!android.text.TextUtils.isEmpty(str7)) {
                                    zzaE2.zzM(str7);
                                }
                                str8 = zzrVar.zzu;
                                if (!android.text.TextUtils.isEmpty(str8)) {
                                    zzaE2.zzau(str8);
                                }
                                j3 = zzrVar.zzj;
                                if (j3 != -2147483648L) {
                                    zzaE2.zzaj((int) j3);
                                }
                                zzaE2.zzN(zzrVar.zze);
                                str9 = zzrVar.zzb;
                                if (!android.text.TextUtils.isEmpty(str9)) {
                                    zzaE2.zzad(str9);
                                }
                                com.google.android.gms.measurement.internal.zzjk zzs22 = zzB((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str5)).zzs(com.google.android.gms.measurement.internal.zzjk.zzf(zzrVar.zzs, 100));
                                zzaE2.zzat(zzs22.zzk());
                                com.google.android.gms.internal.measurement.zzql.zza();
                                if (!zzd().zzp(str5, com.google.android.gms.measurement.internal.zzfx.zzaP) && zzt().zzX(str5)) {
                                    zzaE2.zzaH(zzrVar.zzz);
                                    long j7 = zzrVar.zzA;
                                    if (!zzs22.zzo(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE) && j7 != 0) {
                                        j7 = (j7 & (-2)) | 32;
                                    }
                                    zzaE2.zzaz(j7 == 1);
                                    if (j7 != 0) {
                                        com.google.android.gms.internal.measurement.zzhd zzh3 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                        if ((j7 & 1) == 0) {
                                            z22 = false;
                                        }
                                        zzh3.zza(z22);
                                        zzh3.zzb((j7 & 2) != 0);
                                        zzh3.zzc((j7 & 4) != 0);
                                        zzh3.zzd((j7 & 8) != 0);
                                        zzh3.zze((j7 & 16) != 0);
                                        zzh3.zzf((j7 & 32) != 0);
                                        zzh3.zzg((64 & j7) != 0);
                                        zzaE2.zzaI((com.google.android.gms.internal.measurement.zzhe) zzh3.zzbc());
                                    }
                                }
                                j4 = zzrVar.zzf;
                                if (j4 != 0) {
                                    zzaE2.zzY(j4);
                                }
                                zzaE2.zzar(zzrVar.zzq);
                                com.google.android.gms.measurement.internal.zzpj zzp2 = zzp();
                                com.google.android.gms.internal.measurement.zzjq zza32 = com.google.android.gms.internal.measurement.zzjq.zza(zzp2.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement"), com.google.android.gms.measurement.internal.zzfu.zza);
                                emptyMap = zza32 != null ? java.util.Collections.emptyMap() : zza32.zzb();
                                if (emptyMap != null && !emptyMap.isEmpty()) {
                                    arrayList = new java.util.ArrayList();
                                    int intValue22 = ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzaf.zzb(null)).intValue();
                                    for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                                        if (((java.lang.String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = java.lang.Integer.parseInt((java.lang.String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(java.lang.Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue22) {
                                                        zzp2.zzu.zzaV().zze().zzb("Too many experiment IDs. Number of IDs", java.lang.Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (java.lang.NumberFormatException e3) {
                                                zzp2.zzu.zzaV().zze().zzb("Experiment ID NumberFormatException", e3);
                                            }
                                        }
                                    }
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                    zzaE2.zzaq(arrayList);
                                }
                                if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbb)) {
                                    zzaE2.zzaP("");
                                }
                                str10 = zzrVar.zza;
                                zzs = zzB((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str10)).zzs(com.google.android.gms.measurement.internal.zzjk.zzf(zzrVar.zzs, 100));
                                zzjjVar = com.google.android.gms.measurement.internal.zzjj.AD_STORAGE;
                                try {
                                    if (zzs.zzo(zzjjVar) && zzrVar.zzn) {
                                        zzc = this.zzk.zzc(str10, zzs);
                                        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) zzc.first)) {
                                            zzaE2.zzQ((java.lang.String) zzc.first);
                                            if (zzc.second != null) {
                                                zzaE2.zzT(((java.lang.Boolean) zzc.second).booleanValue());
                                            }
                                            if (!zzbbVar.zzb.equals("_fx") && !((java.lang.String) zzc.first).equals("00000000-0000-0000-0000-000000000000") && (zzu2 = zzj().zzu(str10)) != null && zzu2.zzaq()) {
                                                zzR(str10, false, null, null);
                                                android.os.Bundle bundle2 = new android.os.Bundle();
                                                java.lang.Long zzas = zzu2.zzas();
                                                if (zzas != null) {
                                                    zzjkVar = zzs;
                                                    zzjjVar2 = zzjjVar;
                                                    bundle2.putLong("_pfo", java.lang.Math.max(0L, zzas.longValue()));
                                                } else {
                                                    zzjkVar = zzs;
                                                    zzjjVar2 = zzjjVar;
                                                }
                                                java.lang.Long zzau = zzu2.zzau();
                                                if (zzau != null) {
                                                    bundle2.putLong("_uwa", zzau.longValue());
                                                }
                                                str11 = "_r";
                                                bundle2.putLong(str11, 1L);
                                                this.zzK.zza(str10, "_fx", bundle2);
                                                zzibVar = this.zzn;
                                                zzibVar.zzu().zzw();
                                                zzaE2.zzF(android.os.Build.MODEL);
                                                zzibVar.zzu().zzw();
                                                zzaE2.zzE(android.os.Build.VERSION.RELEASE);
                                                zzaE2.zzI((int) zzibVar.zzu().zzb());
                                                zzaE2.zzH(zzibVar.zzu().zzc());
                                                zzaE2.zzay(zzrVar.zzw);
                                                if (zzibVar.zzB()) {
                                                    zzaE2.zzK();
                                                    if (!android.text.TextUtils.isEmpty(null)) {
                                                        zzaE2.zzam(null);
                                                    }
                                                }
                                                zzu = zzj().zzu(str10);
                                                if (zzu == null) {
                                                    zzu = new com.google.android.gms.measurement.internal.zzh(zzibVar, str10);
                                                    zzjkVar2 = zzjkVar;
                                                    zzu.zze(zzK(zzjkVar2));
                                                    zzu.zzm(zzrVar.zzk);
                                                    zzu.zzg(zzrVar.zzb);
                                                    if (zzjkVar2.zzo(zzjjVar2)) {
                                                        zzu.zzk(this.zzk.zzf(str10, zzrVar.zzn));
                                                    }
                                                    zzu.zzF(0L);
                                                    zzu.zzo(0L);
                                                    zzu.zzq(0L);
                                                    zzu.zzs(zzrVar.zzc);
                                                    zzu.zzu(zzrVar.zzj);
                                                    zzu.zzw(zzrVar.zzd);
                                                    zzu.zzy(zzrVar.zze);
                                                    zzu.zzA(zzrVar.zzf);
                                                    zzu.zzE(zzrVar.zzh);
                                                    zzu.zzC(zzrVar.zzq);
                                                    zzj().zzv(zzu, false, false);
                                                } else {
                                                    zzjkVar2 = zzjkVar;
                                                }
                                                if (zzjkVar2.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE) && !android.text.TextUtils.isEmpty(zzu.zzd())) {
                                                    zzaE2.zzW((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzu.zzd()));
                                                }
                                                if (!android.text.TextUtils.isEmpty(zzu.zzl())) {
                                                    zzaE2.zzah((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzu.zzl()));
                                                }
                                                zzn = zzj().zzn(str10);
                                                for (i = 0; i < zzn.size(); i++) {
                                                    com.google.android.gms.internal.measurement.zzit zzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
                                                    zzm2.zzb(((com.google.android.gms.measurement.internal.zzpm) zzn.get(i)).zzc);
                                                    zzm2.zza(((com.google.android.gms.measurement.internal.zzpm) zzn.get(i)).zzd);
                                                    zzp().zzc(zzm2, ((com.google.android.gms.measurement.internal.zzpm) zzn.get(i)).zze);
                                                    zzaE2.zzp(zzm2);
                                                    if ("_sid".equals(((com.google.android.gms.measurement.internal.zzpm) zzn.get(i)).zzc) && zzu.zzam() != 0 && zzp().zzu(zzrVar.zzu) != zzu.zzam()) {
                                                        zzaE2.zzav();
                                                    }
                                                }
                                                zzj = zzj();
                                                zzidVar = (com.google.android.gms.internal.measurement.zzid) zzaE2.zzbc();
                                                zzj.zzg();
                                                zzj.zzay();
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzidVar);
                                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzidVar.zzA());
                                                byte[] zzcc3 = zzidVar.zzcc();
                                                long zzt22 = zzj.zzg.zzp().zzt(zzcc3);
                                                android.content.ContentValues contentValues22 = new android.content.ContentValues();
                                                java.lang.String str212 = str;
                                                contentValues22.put(str212, zzidVar.zzA());
                                                contentValues22.put("metadata_fingerprint", java.lang.Long.valueOf(zzt22));
                                                contentValues22.put("metadata", zzcc3);
                                                zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                                zzj2 = zzj();
                                                zzbdVar = new com.google.android.gms.measurement.internal.zzbd(zzbbVar.zzf);
                                                while (true) {
                                                    if (zzbdVar.hasNext()) {
                                                        java.lang.String next2 = zzbdVar.next();
                                                        java.lang.String str23 = next2;
                                                        if (str11.equals(next2)) {
                                                            break;
                                                        }
                                                    } else {
                                                        com.google.android.gms.measurement.internal.zzhs zzh4 = zzh();
                                                        java.lang.String str24 = zzbbVar.zza;
                                                        boolean zzk = zzh4.zzk(str24, zzbbVar.zzb);
                                                        com.google.android.gms.measurement.internal.zzar zzw = zzj().zzw(zzC(), str24, false, false, false, false, false, false, false);
                                                        if (!zzk || zzw.zze >= zzd().zzm(str24, com.google.android.gms.measurement.internal.zzfx.zzo)) {
                                                            i2 = 0;
                                                        }
                                                    }
                                                }
                                                zzj2.zzg();
                                                zzj2.zzay();
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbbVar);
                                                java.lang.String str222 = zzbbVar.zza;
                                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str222);
                                                byte[] zzcc22 = zzj2.zzg.zzp().zzh(zzbbVar).zzcc();
                                                contentValues = new android.content.ContentValues();
                                                contentValues.put(str212, str222);
                                                contentValues.put("name", zzbbVar.zzb);
                                                contentValues.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(zzbbVar.zzd));
                                                contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(zzt22));
                                                contentValues.put("data", zzcc22);
                                                contentValues.put("realtime", java.lang.Integer.valueOf(i2));
                                                if (zzj2.zze().insert(str4, null, contentValues) == -1) {
                                                    zzj2.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str222));
                                                } else {
                                                    this.zza = 0L;
                                                }
                                                zzj().zzc();
                                                zzj().zzd();
                                                zzaK();
                                                zzaV().zzk().zzb("Background event processing time, ms", java.lang.Long.valueOf(((java.lang.System.nanoTime() - nanoTime) + 500000) / 1000000));
                                                return;
                                            }
                                        }
                                    }
                                    zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    zzj2 = zzj();
                                    zzbdVar = new com.google.android.gms.measurement.internal.zzbd(zzbbVar.zzf);
                                    while (true) {
                                        if (zzbdVar.hasNext()) {
                                        }
                                    }
                                    zzj2.zzg();
                                    zzj2.zzay();
                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbbVar);
                                    java.lang.String str2222 = zzbbVar.zza;
                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2222);
                                    byte[] zzcc222 = zzj2.zzg.zzp().zzh(zzbbVar).zzcc();
                                    contentValues = new android.content.ContentValues();
                                    contentValues.put(str212, str2222);
                                    contentValues.put("name", zzbbVar.zzb);
                                    contentValues.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(zzbbVar.zzd));
                                    contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(zzt22));
                                    contentValues.put("data", zzcc222);
                                    contentValues.put("realtime", java.lang.Integer.valueOf(i2));
                                    if (zzj2.zze().insert(str4, null, contentValues) == -1) {
                                    }
                                    zzj().zzc();
                                    zzj().zzd();
                                    zzaK();
                                    zzaV().zzk().zzb("Background event processing time, ms", java.lang.Long.valueOf(((java.lang.System.nanoTime() - nanoTime) + 500000) / 1000000));
                                    return;
                                } catch (android.database.sqlite.SQLiteException e4) {
                                    zzj.zzu.zzaV().zzb().zzc("Error storing raw event metadata. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzidVar.zzA()), e4);
                                    throw e4;
                                }
                                zzjkVar = zzs;
                                zzjjVar2 = zzjjVar;
                                str11 = "_r";
                                zzibVar = this.zzn;
                                zzibVar.zzu().zzw();
                                zzaE2.zzF(android.os.Build.MODEL);
                                zzibVar.zzu().zzw();
                                zzaE2.zzE(android.os.Build.VERSION.RELEASE);
                                zzaE2.zzI((int) zzibVar.zzu().zzb());
                                zzaE2.zzH(zzibVar.zzu().zzc());
                                zzaE2.zzay(zzrVar.zzw);
                                if (zzibVar.zzB()) {
                                }
                                zzu = zzj().zzu(str10);
                                if (zzu == null) {
                                }
                                if (zzjkVar2.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                                    zzaE2.zzW((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzu.zzd()));
                                }
                                if (!android.text.TextUtils.isEmpty(zzu.zzl())) {
                                }
                                zzn = zzj().zzn(str10);
                                while (i < zzn.size()) {
                                }
                                zzj = zzj();
                                zzidVar = (com.google.android.gms.internal.measurement.zzid) zzaE2.zzbc();
                                zzj.zzg();
                                zzj.zzay();
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzidVar);
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzidVar.zzA());
                                byte[] zzcc32 = zzidVar.zzcc();
                                long zzt222 = zzj.zzg.zzp().zzt(zzcc32);
                                android.content.ContentValues contentValues222 = new android.content.ContentValues();
                                java.lang.String str2122 = str;
                                contentValues222.put(str2122, zzidVar.zzA());
                                contentValues222.put("metadata_fingerprint", java.lang.Long.valueOf(zzt222));
                                contentValues222.put("metadata", zzcc32);
                            }
                        }
                        z = true;
                    }
                    com.google.android.gms.measurement.internal.zzbe zzbeVar2 = zzb2.zzb;
                    zzd = zzbeVar2.zzd("currency");
                    if (z) {
                        longValue = zzbeVar2.zzb("value").longValue();
                    } else {
                        double doubleValue = zzbeVar2.zzc("value").doubleValue() * 1000000.0d;
                        if (doubleValue == 0.0d) {
                            doubleValue = zzbeVar2.zzb("value").longValue() * 1000000.0d;
                        }
                        if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                            zzaV().zze().zzc("Data lost. Currency value is too big. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str12), java.lang.Double.valueOf(doubleValue));
                            zzj().zzc();
                        } else {
                            longValue = java.lang.Math.round(doubleValue);
                            if (com.google.firebase.analytics.FirebaseAnalytics.Event.REFUND.equals(str15)) {
                                longValue = -longValue;
                            }
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(zzd)) {
                        java.lang.String upperCase = zzd.toUpperCase(java.util.Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            java.lang.String.valueOf(upperCase);
                            java.lang.String concat = "_ltv_".concat(java.lang.String.valueOf(upperCase));
                            com.google.android.gms.measurement.internal.zzpm zzm3 = zzj().zzm(str12, concat);
                            if (zzm3 != null && (zzm3.zze instanceof java.lang.Long)) {
                                str = "app_id";
                                str2 = "_err";
                                zzpmVar = new com.google.android.gms.measurement.internal.zzpm(str12, zzb2.zzc, concat, zzaZ().currentTimeMillis(), java.lang.Long.valueOf(((java.lang.Long) zzm3.zze).longValue() + longValue));
                                zzbgVar2 = zzb2;
                                if (!zzj().zzl(zzpmVar)) {
                                    zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str12), this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                                    zzt().zzN(this.zzK, str12, 9, null, null, 0);
                                }
                                java.lang.String str162 = zzbgVar2.zza;
                                boolean zzh22 = com.google.android.gms.measurement.internal.zzpo.zzh(str162);
                                boolean equals2 = str2.equals(str162);
                                zzt();
                                zzbeVar = zzbgVar2.zzb;
                                if (zzbeVar == null) {
                                }
                                com.google.android.gms.measurement.internal.zzar zzx2 = zzj().zzx(zzC(), str12, j + 1, true, zzh22, false, equals2, false, false, false);
                                long j52 = zzx2.zzb;
                                zzd();
                                zzH = j52 - com.google.android.gms.measurement.internal.zzal.zzH();
                                if (zzH > 0) {
                                }
                            }
                            str = "app_id";
                            str2 = "_err";
                            com.google.android.gms.measurement.internal.zzav zzj5 = zzj();
                            int zzm4 = zzd().zzm(str12, com.google.android.gms.measurement.internal.zzfx.zzT) - 1;
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str12);
                            zzj5.zzg();
                            zzj5.zzay();
                            zzj5.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new java.lang.String[]{str12, str12, java.lang.String.valueOf(zzm4)});
                            zzbgVar2 = zzb2;
                            zzpmVar = new com.google.android.gms.measurement.internal.zzpm(str12, zzbgVar2.zzc, concat, zzaZ().currentTimeMillis(), java.lang.Long.valueOf(longValue));
                            if (!zzj().zzl(zzpmVar)) {
                            }
                            java.lang.String str1622 = zzbgVar2.zza;
                            boolean zzh222 = com.google.android.gms.measurement.internal.zzpo.zzh(str1622);
                            boolean equals22 = str2.equals(str1622);
                            zzt();
                            zzbeVar = zzbgVar2.zzb;
                            if (zzbeVar == null) {
                            }
                            com.google.android.gms.measurement.internal.zzar zzx22 = zzj().zzx(zzC(), str12, j + 1, true, zzh222, false, equals22, false, false, false);
                            long j522 = zzx22.zzb;
                            zzd();
                            zzH = j522 - com.google.android.gms.measurement.internal.zzal.zzH();
                            if (zzH > 0) {
                            }
                        }
                    }
                    str = "app_id";
                    zzbgVar2 = zzb2;
                    str2 = "_err";
                    java.lang.String str16222 = zzbgVar2.zza;
                    boolean zzh2222 = com.google.android.gms.measurement.internal.zzpo.zzh(str16222);
                    boolean equals222 = str2.equals(str16222);
                    zzt();
                    zzbeVar = zzbgVar2.zzb;
                    if (zzbeVar == null) {
                    }
                    com.google.android.gms.measurement.internal.zzar zzx222 = zzj().zzx(zzC(), str12, j + 1, true, zzh2222, false, equals222, false, false, false);
                    long j5222 = zzx222.zzb;
                    zzd();
                    zzH = j5222 - com.google.android.gms.measurement.internal.zzal.zzH();
                    if (zzH > 0) {
                    }
                }
                z = true;
                if (!"_iap".equals(str15)) {
                }
                com.google.android.gms.measurement.internal.zzbe zzbeVar22 = zzb2.zzb;
                zzd = zzbeVar22.zzd("currency");
                if (z) {
                }
                if (!android.text.TextUtils.isEmpty(zzd)) {
                }
                str = "app_id";
                zzbgVar2 = zzb2;
                str2 = "_err";
                java.lang.String str162222 = zzbgVar2.zza;
                boolean zzh22222 = com.google.android.gms.measurement.internal.zzpo.zzh(str162222);
                boolean equals2222 = str2.equals(str162222);
                zzt();
                zzbeVar = zzbgVar2.zzb;
                if (zzbeVar == null) {
                }
                com.google.android.gms.measurement.internal.zzar zzx2222 = zzj().zzx(zzC(), str12, j + 1, true, zzh22222, false, equals2222, false, false, false);
                long j52222 = zzx2222.zzb;
                zzd();
                zzH = j52222 - com.google.android.gms.measurement.internal.zzal.zzH();
                if (zzH > 0) {
                }
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzI(com.google.android.gms.measurement.internal.zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        com.google.android.gms.internal.measurement.zziu zziuVar;
        zzaW().zzg();
        zzu();
        com.google.android.gms.measurement.internal.zzan zzd = com.google.android.gms.measurement.internal.zzan.zzd(zzicVar.zzaA());
        java.lang.String zzc = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        com.google.android.gms.measurement.internal.zzjk zzB = zzB(zzc);
        com.google.android.gms.measurement.internal.zzjh zzjhVar = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
        int ordinal = zzB.zzp().ordinal();
        if (ordinal == 1) {
            zzd.zzc(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE, com.google.android.gms.measurement.internal.zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal == 2 || ordinal == 3) {
            zzd.zzb(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE, zzB.zzb());
        } else {
            zzd.zzc(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE, com.google.android.gms.measurement.internal.zzam.FAILSAFE);
        }
        int ordinal2 = zzB.zzq().ordinal();
        if (ordinal2 == 1) {
            zzd.zzc(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE, com.google.android.gms.measurement.internal.zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            zzd.zzb(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE, zzB.zzb());
        } else {
            zzd.zzc(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE, com.google.android.gms.measurement.internal.zzam.FAILSAFE);
        }
        java.lang.String zzc2 = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        com.google.android.gms.measurement.internal.zzaz zzz = zzz(zzc2, zzx(zzc2), zzB(zzc2), zzd);
        zzicVar.zzaD(((java.lang.Boolean) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzz.zzj())).booleanValue());
        if (!android.text.TextUtils.isEmpty(zzz.zzk())) {
            zzicVar.zzaF(zzz.zzk());
        }
        zzaW().zzg();
        zzu();
        java.util.Iterator it = zzicVar.zzk().iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (com.google.android.gms.internal.measurement.zziu) it.next();
                if ("_npa".equals(zziuVar.zzc())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar != null) {
            com.google.android.gms.measurement.internal.zzjj zzjjVar = com.google.android.gms.measurement.internal.zzjj.AD_PERSONALIZATION;
            if (zzd.zza(zzjjVar) == com.google.android.gms.measurement.internal.zzam.UNSET) {
                com.google.android.gms.measurement.internal.zzpm zzm = zzj().zzm(zzhVar.zzc(), "_npa");
                if (zzm != null) {
                    java.lang.String str = zzm.zzb;
                    if ("tcf".equals(str)) {
                        zzd.zzc(zzjjVar, com.google.android.gms.measurement.internal.zzam.TCF);
                    } else if ("app".equals(str)) {
                        zzd.zzc(zzjjVar, com.google.android.gms.measurement.internal.zzam.API);
                    } else {
                        zzd.zzc(zzjjVar, com.google.android.gms.measurement.internal.zzam.MANIFEST);
                    }
                } else {
                    java.lang.Boolean zzae = zzhVar.zzae();
                    if (zzae == null || ((zzae.booleanValue() && zziuVar.zzg() != 1) || !(zzae.booleanValue() || zziuVar.zzg() == 0))) {
                        zzd.zzc(zzjjVar, com.google.android.gms.measurement.internal.zzam.API);
                    } else {
                        zzd.zzc(zzjjVar, com.google.android.gms.measurement.internal.zzam.MANIFEST);
                    }
                }
            }
        } else {
            int zzaB = zzaB(zzhVar.zzc(), zzd);
            com.google.android.gms.internal.measurement.zzit zzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
            zzm2.zzb("_npa");
            zzm2.zza(zzaZ().currentTimeMillis());
            zzm2.zze(zzaB);
            zzicVar.zzo((com.google.android.gms.internal.measurement.zziu) zzm2.zzbc());
            zzaV().zzk().zzc("Setting user property", "non_personalized_ads(_npa)", java.lang.Integer.valueOf(zzaB));
        }
        zzicVar.zzaB(zzd.toString());
        boolean zzy = this.zzc.zzy(zzhVar.zzc());
        java.util.List zzb2 = zzicVar.zzb();
        int i = 0;
        for (int i2 = 0; i2 < zzb2.size(); i2++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhs) zzb2.get(i2)).zzd())) {
                com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) zzb2.get(i2)).zzcl();
                java.util.List zza = zzhrVar.zza();
                int i3 = 0;
                while (true) {
                    if (i3 >= zza.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i3)).zzb())) {
                        java.lang.String zzd2 = ((com.google.android.gms.internal.measurement.zzhw) zza.get(i3)).zzd();
                        if (zzy && zzd2.length() > 4) {
                            char[] charArray = zzd2.toCharArray();
                            int i4 = 1;
                            while (true) {
                                if (i4 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4)) {
                                    i = i4;
                                    break;
                                }
                                i4++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
                            zzd2 = java.lang.String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzn.zzb("_tcfd");
                        zzn.zzd(zzd2);
                        zzhrVar.zze(i3, zzn);
                    } else {
                        i3++;
                    }
                }
                zzicVar.zzf(i2, zzhrVar);
                return;
            }
        }
    }

    final void zzJ(com.google.android.gms.measurement.internal.zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzaW().zzg();
        zzu();
        com.google.android.gms.internal.measurement.zzgx zzr = com.google.android.gms.internal.measurement.zzha.zzr();
        byte[] zzaJ = zzhVar.zzaJ();
        if (zzaJ != null) {
            try {
                zzr = (com.google.android.gms.internal.measurement.zzgx) com.google.android.gms.measurement.internal.zzpj.zzw(zzr, zzaJ);
            } catch (com.google.android.gms.internal.measurement.zzmq unused) {
                zzaV().zze().zzb("Failed to parse locally stored ad campaign info. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzhVar.zzc()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhs zzhsVar : zzicVar.zzb()) {
            if (zzhsVar.zzd().equals(com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                java.lang.String str = (java.lang.String) com.google.android.gms.measurement.internal.zzpj.zzJ(zzhsVar, "gclid", "");
                java.lang.String str2 = (java.lang.String) com.google.android.gms.measurement.internal.zzpj.zzJ(zzhsVar, "gbraid", "");
                java.lang.String str3 = (java.lang.String) com.google.android.gms.measurement.internal.zzpj.zzJ(zzhsVar, "gad_source", "");
                java.lang.String[] split = ((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzbh.zzb(null)).split(",");
                zzp();
                if (!com.google.android.gms.measurement.internal.zzpj.zzG(zzhsVar, split).isEmpty()) {
                    long longValue = ((java.lang.Long) com.google.android.gms.measurement.internal.zzpj.zzJ(zzhsVar, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzhsVar.zzf();
                    }
                    if ("referrer API v2".equals(com.google.android.gms.measurement.internal.zzpj.zzI(zzhsVar, "_cis"))) {
                        if (longValue > zzr.zzo()) {
                            if (str.isEmpty()) {
                                zzr.zzj();
                            } else {
                                zzr.zzi(str);
                            }
                            if (str2.isEmpty()) {
                                zzr.zzl();
                            } else {
                                zzr.zzk(str2);
                            }
                            if (str3.isEmpty()) {
                                zzr.zzn();
                            } else {
                                zzr.zzm(str3);
                            }
                            zzr.zzp(longValue);
                            zzr.zzs();
                            zzr.zzt(zzaC(zzhsVar));
                        }
                    } else if (longValue > zzr.zzg()) {
                        if (str.isEmpty()) {
                            zzr.zzb();
                        } else {
                            zzr.zza(str);
                        }
                        if (str2.isEmpty()) {
                            zzr.zzd();
                        } else {
                            zzr.zzc(str2);
                        }
                        if (str3.isEmpty()) {
                            zzr.zzf();
                        } else {
                            zzr.zze(str3);
                        }
                        zzr.zzh(longValue);
                        zzr.zzq();
                        zzr.zzr(zzaC(zzhsVar));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzha) zzr.zzbc()).equals(com.google.android.gms.internal.measurement.zzha.zzs())) {
            zzicVar.zzaM((com.google.android.gms.internal.measurement.zzha) zzr.zzbc());
        }
        zzhVar.zzaI(((com.google.android.gms.internal.measurement.zzha) zzr.zzbc()).zzcc());
        if (zzhVar.zza()) {
            zzj().zzv(zzhVar, false, false);
        }
        if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbg)) {
            zzj().zzk(zzhVar.zzc(), "_lgclid");
        }
    }

    final java.lang.String zzK(com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        if (!zzjkVar.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
    }

    final void zzL(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new java.util.ArrayList(list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0128, code lost:
    
        r12.zzB = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0125, code lost:
    
        if (r8 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0171, code lost:
    
        if (r0 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0173, code lost:
    
        r0.close();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
    
        r0 = android.text.TextUtils.isEmpty(r8);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019c, code lost:
    
        if (r0 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019e, code lost:
    
        r0 = zzj().zzu(r8);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a6, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:
    
        zzV(r0);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        if (r0 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        if (r0 != 0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0195 -> B:60:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0195 -> B:61:0x0198). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzM() {
        com.google.android.gms.measurement.internal.zzav zzj;
        long zzF;
        android.database.sqlite.SQLiteException e;
        com.google.android.gms.measurement.internal.zzav zzavVar;
        android.database.Cursor cursor;
        zzaW().zzg();
        zzu();
        ?? r0 = 1;
        this.zzw = true;
        try {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzn;
            zzibVar.zzaU();
            java.lang.Boolean zzJ = zzibVar.zzt().zzJ();
            if (zzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (zzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaK();
            } else {
                zzaW().zzg();
                if (this.zzz != null) {
                    zzaV().zzk().zza("Uploading requested multiple times");
                } else if (zzi().zzb()) {
                    long currentTimeMillis = zzaZ().currentTimeMillis();
                    android.database.Cursor cursor2 = null;
                    r8 = null;
                    android.database.Cursor cursor3 = null;
                    r8 = null;
                    r8 = null;
                    r8 = null;
                    java.lang.String str = null;
                    int zzm = zzd().zzm(null, com.google.android.gms.measurement.internal.zzfx.zzai);
                    zzd();
                    long zzF2 = currentTimeMillis - com.google.android.gms.measurement.internal.zzal.zzF();
                    for (int i = 0; i < zzm && zzaF(null, zzF2); i++) {
                    }
                    com.google.android.gms.internal.measurement.zzql.zza();
                    zzaW().zzg();
                    zzau();
                    long zza = this.zzk.zzd.zza();
                    if (zza != 0) {
                        zzaV().zzj().zzb("Uploading events. Elapsed time since last upload attempt (ms)", java.lang.Long.valueOf(java.lang.Math.abs(currentTimeMillis - zza)));
                    }
                    java.lang.String zzF3 = zzj().zzF();
                    long j = -1;
                    if (android.text.TextUtils.isEmpty(zzF3)) {
                        try {
                            this.zzB = -1L;
                            zzj = zzj();
                            zzd();
                            zzF = currentTimeMillis - com.google.android.gms.measurement.internal.zzal.zzF();
                            zzj.zzg();
                            zzj.zzay();
                        } catch (java.lang.Throwable th) {
                            th = th;
                            cursor2 = r0;
                        }
                        try {
                            r0 = zzj.zze().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new java.lang.String[]{java.lang.String.valueOf(zzF)});
                            try {
                                if (r0.moveToFirst()) {
                                    str = r0.getString(0);
                                    cursor = r0;
                                    zzavVar = zzj;
                                    zzj = zzj;
                                } else {
                                    zzj.zzu.zzaV().zzk().zza("No expired configs for apps with pending events");
                                    cursor = r0;
                                    zzavVar = zzj;
                                    zzj = zzj;
                                }
                            } catch (android.database.sqlite.SQLiteException e2) {
                                e = e2;
                                com.google.android.gms.measurement.internal.zzgr zzb2 = zzj.zzu.zzaV().zzb();
                                ?? r4 = "Error selecting expired configs";
                                zzb2.zzb("Error selecting expired configs", e);
                                cursor = r0;
                                zzavVar = r4;
                                zzj = r4;
                            }
                        } catch (android.database.sqlite.SQLiteException e3) {
                            e = e3;
                            r0 = 0;
                            com.google.android.gms.measurement.internal.zzgr zzb22 = zzj.zzu.zzaV().zzb();
                            ?? r42 = "Error selecting expired configs";
                            zzb22.zzb("Error selecting expired configs", e);
                            cursor = r0;
                            zzavVar = r42;
                            zzj = r42;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } else {
                        if (this.zzB == -1) {
                            com.google.android.gms.measurement.internal.zzav zzj2 = zzj();
                            try {
                                try {
                                    cursor3 = zzj2.zze().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursor3.moveToFirst()) {
                                        j = cursor3.getLong(0);
                                    }
                                } catch (android.database.sqlite.SQLiteException e4) {
                                    zzj2.zzu.zzaV().zzb().zzb("Error querying raw events", e4);
                                }
                            } finally {
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                            }
                        }
                        zzN(zzF3, currentTimeMillis);
                    }
                } else {
                    zzaV().zzk().zza("Network not connected, ignoring upload request");
                    zzaK();
                }
            }
        } finally {
            this.zzw = false;
            zzaL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:315:0x0430, code lost:
    
        if (r1 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0432, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0459, code lost:
    
        if (r1 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x01db, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x01fe, code lost:
    
        if (r10 == null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0728 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09d8  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzN(java.lang.String str, long j) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        java.util.List emptyList;
        java.util.List<android.util.Pair> list;
        java.lang.String str2;
        boolean z;
        java.lang.Object obj;
        long j2;
        java.lang.String str3;
        com.google.android.gms.measurement.internal.zzos zzosVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        java.util.List list2;
        java.lang.String str4;
        java.lang.String str5;
        android.database.Cursor cursor3;
        android.database.Cursor cursor4;
        android.database.sqlite.SQLiteDatabase zze;
        long currentTimeMillis;
        byte[] blob;
        com.google.android.gms.measurement.internal.zzpj zzp;
        long j3;
        long j4;
        int zzm = zzd().zzm(str, com.google.android.gms.measurement.internal.zzfx.zzg);
        int i = 0;
        int max = java.lang.Math.max(0, zzd().zzm(str, com.google.android.gms.measurement.internal.zzfx.zzh));
        com.google.android.gms.measurement.internal.zzav zzj = zzj();
        zzj.zzg();
        zzj.zzay();
        int i2 = 1;
        com.google.android.gms.common.internal.Preconditions.checkArgument(zzm > 0);
        ?? r10 = max > 0 ? 1 : 0;
        com.google.android.gms.common.internal.Preconditions.checkArgument(r10);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        try {
            try {
                cursor2 = zzj.zze().query("queue", new java.lang.String[]{"rowid", "data", "retry_count"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", java.lang.String.valueOf(zzm));
                try {
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    zzj.zzu.zzaV().zzb().zzc("Error querying bundles. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                    emptyList = java.util.Collections.emptyList();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = r10;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor2.moveToFirst()) {
            list = new java.util.ArrayList();
            int i3 = 0;
            while (true) {
                long j5 = cursor2.getLong(i);
                try {
                    blob = cursor2.getBlob(i2);
                    zzp = zzj.zzg.zzp();
                } catch (java.io.IOException e3) {
                    zzj.zzu.zzaV().zzb().zzc("Failed to unzip queued bundle. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e3);
                }
                try {
                    java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(blob);
                    java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = gZIPInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        java.io.ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        byteArrayOutputStream.write(bArr, 0, read);
                        byteArrayInputStream = byteArrayInputStream2;
                    }
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (!list.isEmpty() && byteArray.length + i3 > max) {
                        break;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), byteArray);
                        if (!list.isEmpty()) {
                            com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) ((android.util.Pair) list.get(0)).first;
                            com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc();
                            if (!zzidVar.zzaf().equals(zzidVar2.zzaf()) || !zzidVar.zzam().equals(zzidVar2.zzam()) || zzidVar.zzao() != zzidVar2.zzao() || !zzidVar.zzaq().equals(zzidVar2.zzaq())) {
                                break;
                            }
                            java.util.Iterator it = zzidVar.zzf().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    j3 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it.next();
                                java.util.Iterator it2 = it;
                                if ("_npa".equals(zziuVar.zzc())) {
                                    j3 = zziuVar.zzg();
                                    break;
                                }
                                it = it2;
                            }
                            java.util.Iterator it3 = zzidVar2.zzf().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    j4 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it3.next();
                                if ("_npa".equals(zziuVar2.zzc())) {
                                    j4 = zziuVar2.zzg();
                                    break;
                                }
                            }
                            if (j3 != j4) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            zzicVar.zzao(cursor2.getInt(2));
                        }
                        i3 += byteArray.length;
                        list.add(android.util.Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc(), java.lang.Long.valueOf(j5)));
                    } catch (java.io.IOException e4) {
                        zzj.zzu.zzaV().zzb().zzc("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e4);
                    }
                    if (!cursor2.moveToNext() || i3 > max) {
                        break;
                    }
                    i = 0;
                    i2 = 1;
                } catch (java.io.IOException e5) {
                    zzp.zzu.zzaV().zzb().zzb("Failed to ungzip content", e5);
                    throw e5;
                }
            }
            if (!list.isEmpty()) {
            }
        } else {
            emptyList = java.util.Collections.emptyList();
            if (cursor2 != null) {
                cursor2.close();
            }
            list = emptyList;
            if (!list.isEmpty()) {
                return;
            }
            com.google.android.gms.internal.measurement.zzpk.zza();
            com.google.android.gms.measurement.internal.zzal zzd = zzd();
            com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzbi;
            if (zzd.zzp(null, zzfwVar)) {
                com.google.android.gms.internal.measurement.zzpk.zza();
                if (zzd().zzp(null, zzfwVar)) {
                    if (zzB(str).zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE) || !zzh().zzB(str)) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        com.google.android.gms.measurement.internal.zzav zzj2 = zzj();
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                        zzj2.zzg();
                        zzj2.zzay();
                        java.util.List arrayList2 = new java.util.ArrayList();
                        try {
                            try {
                                zze = zzj2.zze();
                                currentTimeMillis = zzj2.zzu.zzaZ().currentTimeMillis();
                                str2 = "_f";
                                try {
                                    cursor4 = zze.query("no_data_mode_events", new java.lang.String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new java.lang.String[]{str, java.lang.String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                                } catch (android.database.sqlite.SQLiteException e6) {
                                    e = e6;
                                    cursor4 = null;
                                    zzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                                    arrayList2 = java.util.Collections.emptyList();
                                }
                            } catch (android.database.sqlite.SQLiteException e7) {
                                e = e7;
                                str2 = "_f";
                            }
                            try {
                                try {
                                    if (cursor4.moveToFirst()) {
                                        do {
                                            try {
                                                arrayList2.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursor4.getBlob(0))).zzbc());
                                            } catch (com.google.android.gms.internal.measurement.zzmq e8) {
                                                zzj2.zzu.zzaV().zzh().zzc("Failed to parse stored NO_DATA mode event, appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e8);
                                            }
                                        } while (cursor4.moveToNext());
                                        cursor4.close();
                                        int delete = zze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new java.lang.String[]{str, java.lang.String.valueOf(currentTimeMillis)});
                                        com.google.android.gms.measurement.internal.zzgr zzk = zzj2.zzu.zzaV().zzk();
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(delete).length() + 34);
                                        sb.append("Pruned ");
                                        sb.append(delete);
                                        sb.append(" NO_DATA mode events. appId");
                                        zzk.zzb(sb.toString(), str);
                                    }
                                } catch (android.database.sqlite.SQLiteException e9) {
                                    e = e9;
                                    zzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                                    arrayList2 = java.util.Collections.emptyList();
                                }
                                boolean z6 = true;
                                for (android.util.Pair pair : list) {
                                    com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair.first).zzcl();
                                    if (z6 && !arrayList2.isEmpty()) {
                                        java.util.List zzb2 = zzicVar2.zzb();
                                        zzicVar2.zzi();
                                        zzicVar2.zzh(arrayList2);
                                        zzicVar2.zzh(zzb2);
                                        z6 = false;
                                    }
                                    com.google.android.gms.internal.measurement.zzhh zzb3 = com.google.android.gms.internal.measurement.zzho.zzb();
                                    com.google.android.gms.internal.measurement.zzgf zzx = zzh().zzx(str);
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    if (zzx != null) {
                                        for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzx.zza()) {
                                            com.google.android.gms.internal.measurement.zzhk zza = com.google.android.gms.internal.measurement.zzhl.zza();
                                            int zzb4 = zzfuVar.zzb();
                                            com.google.android.gms.measurement.internal.zzjh zzjhVar = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
                                            int i4 = zzb4 - 1;
                                            zza.zza(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? 1 : 5 : 4 : 3 : 2);
                                            int zzd2 = zzfuVar.zzd() - 1;
                                            zza.zzb(zzd2 != 1 ? zzd2 != 2 ? 1 : 3 : 2);
                                            arrayList3.add((com.google.android.gms.internal.measurement.zzhl) zza.zzbc());
                                        }
                                    }
                                    zzb3.zza(arrayList3);
                                    zzicVar2.zzaQ(zzb3);
                                    arrayList.add(android.util.Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), (java.lang.Long) pair.second));
                                }
                                list = arrayList;
                                if (list.isEmpty()) {
                                    return;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                cursor3 = cursor4;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            cursor3 = null;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        java.util.List asList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzbj.zzb(null)).split(","));
                        for (android.util.Pair pair2 : list) {
                            try {
                                zzj().zzH(((java.lang.Long) pair2.second).longValue());
                                for (com.google.android.gms.internal.measurement.zzhs zzhsVar : ((com.google.android.gms.internal.measurement.zzid) pair2.first).zzc()) {
                                    if (asList.contains(zzhsVar.zzd())) {
                                        if (zzhsVar.zzd().equals("_f") || zzhsVar.zzd().equals("_v")) {
                                            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.zzcl();
                                            zzp();
                                            com.google.android.gms.measurement.internal.zzpj.zzC(zzhrVar, "_dac", 1L);
                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc();
                                        }
                                        com.google.android.gms.measurement.internal.zzav zzj3 = zzj();
                                        zzj3.zzg();
                                        zzj3.zzay();
                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhsVar);
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                                        com.google.android.gms.measurement.internal.zzib zzibVar = zzj3.zzu;
                                        zzibVar.zzaV().zzk().zzb("Caching events in NO_DATA mode", zzhsVar);
                                        android.content.ContentValues contentValues = new android.content.ContentValues();
                                        contentValues.put("app_id", str);
                                        contentValues.put("name", zzhsVar.zzd());
                                        contentValues.put("data", zzhsVar.zzcc());
                                        contentValues.put("timestamp_millis", java.lang.Long.valueOf(zzhsVar.zzf()));
                                        try {
                                            if (zzj3.zze().insert("no_data_mode_events", null, contentValues) == -1) {
                                                try {
                                                    zzibVar.zzaV().zzb().zzb("Failed to insert NO_DATA mode event (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                                                } catch (android.database.sqlite.SQLiteException e10) {
                                                    e = e10;
                                                    try {
                                                        zzj3.zzu.zzaV().zzb().zzc("Error storing NO_DATA mode event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                                                    } catch (android.database.sqlite.SQLiteException unused) {
                                                        zzaV().zzh().zzb("Failed handling NO_DATA mode bundles. appId", str);
                                                    }
                                                }
                                            }
                                        } catch (android.database.sqlite.SQLiteException e11) {
                                            e = e11;
                                        }
                                    }
                                }
                            } catch (android.database.sqlite.SQLiteException unused2) {
                            }
                        }
                        list = java.util.Collections.emptyList();
                    }
                }
                str2 = "_f";
                if (list.isEmpty()) {
                }
            } else {
                str2 = "_f";
            }
            com.google.android.gms.measurement.internal.zzjk zzB = zzB(str);
            com.google.android.gms.measurement.internal.zzjj zzjjVar = com.google.android.gms.measurement.internal.zzjj.AD_STORAGE;
            if (zzB.zzo(zzjjVar)) {
                java.util.Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        str5 = null;
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzid zzidVar3 = (com.google.android.gms.internal.measurement.zzid) ((android.util.Pair) it4.next()).first;
                    if (!zzidVar3.zzG().isEmpty()) {
                        str5 = zzidVar3.zzG();
                        break;
                    }
                }
                if (str5 != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzid zzidVar4 = (com.google.android.gms.internal.measurement.zzid) ((android.util.Pair) list.get(i5)).first;
                        if (!zzidVar4.zzG().isEmpty() && !zzidVar4.zzG().equals(str5)) {
                            list = list.subList(0, i5);
                            break;
                        }
                        i5++;
                    }
                }
            }
            com.google.android.gms.internal.measurement.zzhz zzh = com.google.android.gms.internal.measurement.zzib.zzh();
            int size = list.size();
            java.util.List arrayList4 = new java.util.ArrayList(list.size());
            boolean z7 = zzd().zzC(str) && zzB(str).zzo(zzjjVar);
            boolean zzo = zzB(str).zzo(zzjjVar);
            boolean zzo2 = zzB(str).zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE);
            com.google.android.gms.internal.measurement.zzqu.zza();
            boolean zzp2 = zzd().zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaM);
            com.google.android.gms.measurement.internal.zzot zzotVar = this.zzl;
            com.google.android.gms.measurement.internal.zzos zza2 = zzotVar.zza(str);
            int i6 = 0;
            while (i6 < size) {
                com.google.android.gms.internal.measurement.zzic zzicVar3 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) ((android.util.Pair) list.get(i6)).first).zzcl();
                arrayList4.add((java.lang.Long) ((android.util.Pair) list.get(i6)).second);
                zzd().zzi();
                zzicVar3.zzO(130000L);
                zzicVar3.zzs(j);
                int i7 = size;
                this.zzn.zzaU();
                zzicVar3.zzae(false);
                if (!z7) {
                    zzicVar3.zzan();
                }
                if (!zzo) {
                    zzicVar3.zzR();
                    zzicVar3.zzU();
                }
                if (!zzo2) {
                    zzicVar3.zzX();
                }
                zzS(str, zzicVar3);
                if (!zzp2) {
                    zzicVar3.zzav();
                }
                if (!zzo2) {
                    zzicVar3.zzag();
                }
                java.lang.String zzP = zzicVar3.zzP();
                if (android.text.TextUtils.isEmpty(zzP)) {
                    z2 = zzo;
                } else {
                    z2 = zzo;
                    if (!zzP.equals("00000000-0000-0000-0000-000000000000")) {
                        z3 = z7;
                        z4 = zzo2;
                        z5 = zzp2;
                        list2 = list;
                        str4 = str2;
                        if (zzicVar3.zzc() != 0) {
                            if (zzd().zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaC)) {
                                zzicVar3.zzas(zzp().zzt(((com.google.android.gms.internal.measurement.zzid) zzicVar3.zzbc()).zzcc()));
                            }
                            com.google.android.gms.internal.measurement.zzis zzd3 = zza2.zzd();
                            if (zzd3 != null) {
                                zzicVar3.zzaN(zzd3);
                            }
                            zzh.zze(zzicVar3);
                        }
                        i6++;
                        str2 = str4;
                        size = i7;
                        zzo = z2;
                        z7 = z3;
                        zzo2 = z4;
                        list = list2;
                        zzp2 = z5;
                    }
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList(zzicVar3.zzb());
                java.util.Iterator it5 = arrayList5.iterator();
                z3 = z7;
                z4 = zzo2;
                java.lang.Long l = null;
                java.lang.Long l2 = null;
                boolean z8 = false;
                boolean z9 = false;
                while (it5.hasNext()) {
                    boolean z10 = zzp2;
                    com.google.android.gms.internal.measurement.zzhs zzhsVar2 = (com.google.android.gms.internal.measurement.zzhs) it5.next();
                    java.util.List list3 = list;
                    if ("_fx".equals(zzhsVar2.zzd())) {
                        it5.remove();
                        list = list3;
                        zzp2 = z10;
                        z8 = true;
                        z9 = true;
                    } else {
                        java.lang.String str6 = str2;
                        if (str6.equals(zzhsVar2.zzd())) {
                            zzp();
                            com.google.android.gms.internal.measurement.zzhw zzF = com.google.android.gms.measurement.internal.zzpj.zzF(zzhsVar2, "_pfo");
                            if (zzF != null) {
                                l = java.lang.Long.valueOf(zzF.zzf());
                            }
                            zzp();
                            com.google.android.gms.internal.measurement.zzhw zzF2 = com.google.android.gms.measurement.internal.zzpj.zzF(zzhsVar2, "_uwa");
                            if (zzF2 != null) {
                                l2 = java.lang.Long.valueOf(zzF2.zzf());
                            }
                            str2 = str6;
                            list = list3;
                            zzp2 = z10;
                            z9 = true;
                        } else {
                            str2 = str6;
                            list = list3;
                            zzp2 = z10;
                        }
                    }
                }
                z5 = zzp2;
                list2 = list;
                str4 = str2;
                if (z8) {
                    zzicVar3.zzi();
                    zzicVar3.zzh(arrayList5);
                }
                if (z9) {
                    zzR(zzicVar3.zzK(), true, l, l2);
                }
                if (zzicVar3.zzc() != 0) {
                }
                i6++;
                str2 = str4;
                size = i7;
                zzo = z2;
                z7 = z3;
                zzo2 = z4;
                list = list2;
                zzp2 = z5;
            }
            if (zzh.zzb() == 0) {
                zzL(arrayList4);
                zzU(false, 204, null, null, str, java.util.Collections.emptyList());
                return;
            }
            com.google.android.gms.internal.measurement.zzib zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzh.zzbc();
            java.util.List arrayList6 = new java.util.ArrayList();
            boolean z11 = zza2.zzc() == com.google.android.gms.measurement.internal.zzlr.SGTM_CLIENT;
            if (zza2.zzc() == com.google.android.gms.measurement.internal.zzlr.SGTM) {
                z = z11;
            } else {
                if (!z11) {
                    j2 = j;
                    obj = null;
                    if (zzi().zzb()) {
                        return;
                    }
                    java.lang.Object zzi = android.util.Log.isLoggable(zzaV().zzn(), 2) ? zzp().zzi(zzibVar2) : obj;
                    zzp();
                    byte[] zzcc = zzibVar2.zzcc();
                    zzL(arrayList4);
                    this.zzk.zze.zzb(j2);
                    zzaV().zzk().zzd("Uploading data. app, uncompressed size, data", str, java.lang.Integer.valueOf(zzcc.length), zzi);
                    this.zzv = true;
                    zzi().zzc(str, zza2, zzibVar2, new com.google.android.gms.measurement.internal.zzov(this, str, arrayList6));
                    return;
                }
                z = true;
            }
            java.util.Iterator it6 = ((com.google.android.gms.internal.measurement.zzib) zzh.zzbc()).zza().iterator();
            while (true) {
                if (it6.hasNext()) {
                    if (((com.google.android.gms.internal.measurement.zzid) it6.next()).zzY()) {
                        str3 = java.util.UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    str3 = null;
                    break;
                }
            }
            com.google.android.gms.internal.measurement.zzib zzibVar3 = (com.google.android.gms.internal.measurement.zzib) zzh.zzbc();
            zzaW().zzg();
            zzu();
            com.google.android.gms.internal.measurement.zzhz zzi2 = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar3);
            if (!android.text.TextUtils.isEmpty(str3)) {
                zzi2.zzi(str3);
            }
            java.lang.String zzc = zzh().zzc(str);
            if (!android.text.TextUtils.isEmpty(zzc)) {
                zzi2.zzj(zzc);
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it7 = zzibVar3.zza().iterator();
            while (it7.hasNext()) {
                com.google.android.gms.internal.measurement.zzic zzaF = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it7.next());
                zzaF.zzan();
                arrayList7.add((com.google.android.gms.internal.measurement.zzid) zzaF.zzbc());
            }
            zzi2.zzg();
            zzi2.zzf(arrayList7);
            zzaV().zzk().zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", android.text.TextUtils.isEmpty(str3) ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : zzi2.zzh());
            com.google.android.gms.internal.measurement.zzib zzibVar4 = (com.google.android.gms.internal.measurement.zzib) zzi2.zzbc();
            if (android.text.TextUtils.isEmpty(str3)) {
                obj = null;
            } else {
                com.google.android.gms.internal.measurement.zzib zzibVar5 = (com.google.android.gms.internal.measurement.zzib) zzh.zzbc();
                zzaW().zzg();
                zzu();
                com.google.android.gms.internal.measurement.zzhz zzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", str3);
                zzh2.zzi(str3);
                for (com.google.android.gms.internal.measurement.zzid zzidVar5 : zzibVar5.zza()) {
                    com.google.android.gms.internal.measurement.zzic zzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzaE.zzam(zzidVar5.zzZ());
                    zzaE.zzaJ(zzidVar5.zzav());
                    zzh2.zze(zzaE);
                }
                com.google.android.gms.internal.measurement.zzib zzibVar6 = (com.google.android.gms.internal.measurement.zzib) zzh2.zzbc();
                java.lang.String zzc2 = zzotVar.zzg.zzh().zzc(str);
                if (android.text.TextUtils.isEmpty(zzc2)) {
                    obj = null;
                    zzosVar = new com.google.android.gms.measurement.internal.zzos((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzr.zzb(null), java.util.Collections.emptyMap(), z ? com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL_PENDING : com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL, null);
                } else {
                    android.net.Uri parse = android.net.Uri.parse((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzr.zzb(null));
                    android.net.Uri.Builder buildUpon = parse.buildUpon();
                    java.lang.String authority = parse.getAuthority();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzc2).length() + 1 + java.lang.String.valueOf(authority).length());
                    sb2.append(zzc2);
                    sb2.append(".");
                    sb2.append(authority);
                    buildUpon.authority(sb2.toString());
                    obj = null;
                    zzosVar = new com.google.android.gms.measurement.internal.zzos(buildUpon.build().toString(), java.util.Collections.emptyMap(), z ? com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL_PENDING : com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL, null);
                }
                arrayList6.add(android.util.Pair.create(zzibVar6, zzosVar));
            }
            if (z) {
                com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar4.zzcl();
                for (int i8 = 0; i8 < zzibVar4.zzb(); i8++) {
                    com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) zzibVar4.zzc(i8).zzcl();
                    zzicVar4.zzt();
                    zzicVar4.zzaO(j);
                    zzhzVar.zzd(i8, zzicVar4);
                }
                arrayList6.add(android.util.Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zza2));
                zzL(arrayList4);
                zzU(false, 204, null, null, str, arrayList6);
                if (zzO(str, zza2.zza())) {
                    zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent.setPackage(str);
                    zzaP(this.zzn.zzaY(), intent);
                    return;
                }
                return;
            }
            j2 = j;
            zzibVar2 = zzibVar4;
            if (zzi().zzb()) {
            }
        }
    }

    final boolean zzO(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(str);
        if (zzu != null && zzt().zzaa(str, zzu.zzay())) {
            this.zzF.remove(str2);
            return true;
        }
        com.google.android.gms.measurement.internal.zzpd zzpdVar = (com.google.android.gms.measurement.internal.zzpd) this.zzF.get(str2);
        if (zzpdVar == null) {
            return true;
        }
        return zzpdVar.zzb();
    }

    final void zzP(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzib zzd;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzn;
            zzibVar.zzaU();
            java.lang.Boolean zzJ = zzibVar.zzt().zzJ();
            if (zzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (zzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaK();
            } else if (!zzi().zzb()) {
                zzaV().zzk().zza("Network not connected, ignoring upload request");
                zzaK();
            } else if (zzj().zzD(str)) {
                com.google.android.gms.measurement.internal.zzav zzj = zzj();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                zzj.zzg();
                zzj.zzay();
                java.util.List zzC = zzj.zzC(str, com.google.android.gms.measurement.internal.zzon.zza(com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL), 1);
                com.google.android.gms.measurement.internal.zzpi zzpiVar = zzC.isEmpty() ? null : (com.google.android.gms.measurement.internal.zzpi) zzC.get(0);
                if (zzpiVar != null && (zzd = zzpiVar.zzd()) != null) {
                    zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpiVar.zzf(), zzpiVar.zze());
                    byte[] zzcc = zzd.zzcc();
                    if (android.util.Log.isLoggable(zzaV().zzn(), 2)) {
                        zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, java.lang.Integer.valueOf(zzcc.length), zzp().zzi(zzd));
                    }
                    com.google.android.gms.measurement.internal.zzos zza = zzpiVar.zza();
                    this.zzv = true;
                    zzi().zzc(str, zza, zzd, new com.google.android.gms.measurement.internal.zzow(this, str, zzpiVar));
                }
            } else {
                zzaV().zzk().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
        } finally {
            this.zzw = false;
            zzaL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzQ(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, com.google.android.gms.measurement.internal.zzpi zzpiVar) {
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (java.lang.Throwable th2) {
                this.zzv = false;
                zzaL();
                throw th2;
            }
        }
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            java.lang.String str2 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            ?? substring = str2.substring(0, java.lang.Math.min(32, str2.length()));
            com.google.android.gms.measurement.internal.zzgr zzh = zzaV().zzh();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            if (th == null) {
                th = substring;
            }
            zzh.zzd("Network upload failed. Will retry later. appId, status, error", str, valueOf, th);
            zzj().zzK(java.lang.Long.valueOf(zzpiVar.zzc()));
            zzaK();
            this.zzv = false;
            zzaL();
        }
        if (th == null) {
            zzj().zzE(java.lang.Long.valueOf(zzpiVar.zzc()));
            zzaV().zzk().zzc("Successfully uploaded batch from upload queue. appId, status", str, java.lang.Integer.valueOf(i));
            if (zzi().zzb() && zzj().zzD(str)) {
                zzP(str);
            } else {
                zzaK();
            }
            this.zzv = false;
            zzaL();
        }
        java.lang.String str22 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ?? substring2 = str22.substring(0, java.lang.Math.min(32, str22.length()));
        com.google.android.gms.measurement.internal.zzgr zzh2 = zzaV().zzh();
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i);
        if (th == null) {
        }
        zzh2.zzd("Network upload failed. Will retry later. appId, status, error", str, valueOf2, th);
        zzj().zzK(java.lang.Long.valueOf(zzpiVar.zzc()));
        zzaK();
        this.zzv = false;
        zzaL();
    }

    final void zzR(java.lang.String str, boolean z, java.lang.Long l, java.lang.Long l2) {
        com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(str);
        if (zzu != null) {
            zzu.zzar(z);
            zzu.zzat(l);
            zzu.zzav(l2);
            if (zzu.zza()) {
                zzj().zzv(zzu, false, false);
            }
        }
    }

    final void zzS(java.lang.String str, com.google.android.gms.internal.measurement.zzic zzicVar) {
        int zzx;
        int indexOf;
        java.util.Set zzl = zzh().zzl(str);
        if (zzl != null) {
            zzicVar.zzaw(zzl);
        }
        if (zzh().zzp(str)) {
            zzicVar.zzG();
        }
        if (zzh().zzq(str)) {
            java.lang.String zzD = zzicVar.zzD();
            if (!android.text.TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
                zzicVar.zzE(zzD.substring(0, indexOf));
            }
        }
        if (zzh().zzr(str) && (zzx = com.google.android.gms.measurement.internal.zzpj.zzx(zzicVar, "_id")) != -1) {
            zzicVar.zzr(zzx);
        }
        if (zzh().zzs(str)) {
            zzicVar.zzan();
        }
        if (zzh().zzt(str)) {
            zzicVar.zzX();
            if (zzB(str).zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                java.util.Map map = this.zzE;
                com.google.android.gms.measurement.internal.zzpc zzpcVar = (com.google.android.gms.measurement.internal.zzpc) map.get(str);
                if (zzpcVar == null || zzpcVar.zzb + zzd().zzl(str, com.google.android.gms.measurement.internal.zzfx.zzak) < zzaZ().elapsedRealtime()) {
                    zzpcVar = new com.google.android.gms.measurement.internal.zzpc(this, (byte[]) null);
                    map.put(str, zzpcVar);
                }
                zzicVar.zzax(zzpcVar.zza);
            }
        }
        if (zzh().zzu(str)) {
            zzicVar.zzav();
        }
    }

    final void zzT(java.lang.String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, android.os.Bundle bundle, java.lang.String str2) {
        java.util.List listOf = com.google.android.gms.common.util.CollectionUtils.listOf((java.lang.Object[]) new java.lang.String[]{"_o", "_sn", "_sc", "_si"});
        long zzf = (com.google.android.gms.measurement.internal.zzpo.zzZ(zzhvVar.zza()) || com.google.android.gms.measurement.internal.zzpo.zzZ(str)) ? zzd().zzf(str2, true) : zzd().zze(str2, true);
        long codePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        com.google.android.gms.measurement.internal.zzpo zzt = zzt();
        java.lang.String zza = zzhvVar.zza();
        zzd();
        java.lang.String zzC = zzt.zzC(zza, 40, true);
        if (codePointCount <= zzf || listOf.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            bundle.putString("_ev", zzt().zzC(zzhvVar.zzc(), zzd().zzf(str2, true), true));
            return;
        }
        zzaV().zzh().zzc("Param value is too long; discarded. Name, value length", zzC, java.lang.Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", zzC);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r23 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzU(boolean z, int i, java.lang.Throwable th, byte[] bArr, java.lang.String str, java.util.List list) {
        byte[] bArr2;
        int i2 = i;
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } finally {
                this.zzv = false;
                zzaL();
            }
        } else {
            bArr2 = bArr;
        }
        java.util.List<java.lang.Long> list2 = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzz);
        this.zzz = null;
        try {
            if (z) {
                if (i2 != 200) {
                    if (i2 == 204) {
                        i2 = 204;
                    }
                    java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
                    zzaV().zzh().zzd("Network upload failed. Will retry later. code, error", java.lang.Integer.valueOf(i2), th, str2.substring(0, java.lang.Math.min(32, str2.length())));
                    this.zzk.zze.zzb(zzaZ().currentTimeMillis());
                    if (i2 == 503 || i2 == 429) {
                        this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
                    }
                    zzj().zzJ(list2);
                    zzaK();
                    return;
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it.next();
                com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) pair.first;
                com.google.android.gms.measurement.internal.zzos zzosVar = (com.google.android.gms.measurement.internal.zzos) pair.second;
                if (zzosVar.zzc() != com.google.android.gms.measurement.internal.zzlr.SGTM_CLIENT) {
                    long zzA = zzj().zzA(str, zzibVar, zzosVar.zza(), zzosVar.zzb(), zzosVar.zzc(), null);
                    if (zzosVar.zzc() == com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL_PENDING && zzA != -1 && !zzibVar.zze().isEmpty()) {
                        hashMap.put(zzibVar.zze(), java.lang.Long.valueOf(zzA));
                    }
                }
            }
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                android.util.Pair pair2 = (android.util.Pair) it2.next();
                com.google.android.gms.internal.measurement.zzib zzibVar2 = (com.google.android.gms.internal.measurement.zzib) pair2.first;
                com.google.android.gms.measurement.internal.zzos zzosVar2 = (com.google.android.gms.measurement.internal.zzos) pair2.second;
                if (zzosVar2.zzc() == com.google.android.gms.measurement.internal.zzlr.SGTM_CLIENT) {
                    zzj().zzA(str, zzibVar2, zzosVar2.zza(), zzosVar2.zzb(), zzosVar2.zzc(), (java.lang.Long) hashMap.get(zzibVar2.zze()));
                }
            }
            java.util.List zzC = zzj().zzC(str, com.google.android.gms.measurement.internal.zzon.zza(com.google.android.gms.measurement.internal.zzlr.SGTM_CLIENT), 1);
            if (!zzC.isEmpty()) {
                long zzg = ((com.google.android.gms.measurement.internal.zzpi) zzC.get(0)).zzg();
                if (zzaZ().currentTimeMillis() > ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzE.zzb(null)).longValue() + zzg) {
                    zzaV().zze().zzc("[sgtm] client batches are queued too long. appId, creationTime", str, java.lang.Long.valueOf(zzg));
                }
            }
            for (java.lang.Long l : list2) {
                try {
                    zzj().zzH(l.longValue());
                } catch (android.database.sqlite.SQLiteException e) {
                    java.util.List list3 = this.zzA;
                    if (list3 == null || !list3.contains(l)) {
                        throw e;
                    }
                }
            }
            zzj().zzc();
            zzj().zzd();
            this.zzA = null;
            if (zzi().zzb() && zzj().zzD(str)) {
                zzP(str);
            } else if (zzi().zzb() && zzaI()) {
                zzM();
            } else {
                this.zzB = -1L;
                zzaK();
            }
            this.zza = 0L;
            return;
        } catch (java.lang.Throwable th2) {
            zzj().zzd();
            throw th2;
        }
        com.google.android.gms.measurement.internal.zzgr zzk = zzaV().zzk();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
        zzk.zzc("Network upload successful with code, uploadAttempted", valueOf, java.lang.Boolean.valueOf(z));
        if (z) {
            try {
                this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
            } catch (android.database.sqlite.SQLiteException e2) {
                zzaV().zzb().zzb("Database error while trying to delete uploaded bundles", e2);
                this.zza = zzaZ().elapsedRealtime();
                zzaV().zzk().zzb("Disable upload, time", java.lang.Long.valueOf(this.zza));
            }
        }
        this.zzk.zze.zzb(0L);
        zzaK();
        if (z) {
            zzaV().zzk().zzc("Successful upload. Got network response. code, size", valueOf, java.lang.Integer.valueOf(bArr2.length));
        } else {
            zzaV().zzk().zza("Purged empty bundles");
        }
        zzj().zzb();
    }

    final void zzV(com.google.android.gms.measurement.internal.zzh zzhVar) {
        zzaW().zzg();
        if (android.text.TextUtils.isEmpty(zzhVar.zzf())) {
            zzW((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVar.zzc()), 204, null, null, null);
            return;
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVar.zzc());
        zzaV().zzk().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgl zzb2 = zzh().zzb(str);
        java.lang.String zzd = zzh().zzd(str);
        androidx.collection.ArrayMap arrayMap = null;
        if (zzb2 != null) {
            if (!android.text.TextUtils.isEmpty(zzd)) {
                androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
                arrayMap2.put(com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE, zzd);
                arrayMap = arrayMap2;
            }
            java.lang.String zze = zzh().zze(str);
            if (!android.text.TextUtils.isEmpty(zze)) {
                if (arrayMap == null) {
                    arrayMap = new androidx.collection.ArrayMap();
                }
                arrayMap.put(com.google.common.net.HttpHeaders.IF_NONE_MATCH, zze);
            }
        }
        this.zzu = true;
        zzi().zzd(zzhVar, arrayMap, new com.google.android.gms.measurement.internal.zzgv() { // from class: com.google.android.gms.measurement.internal.zzpe
            @Override // com.google.android.gms.measurement.internal.zzgv
            public final /* synthetic */ void zza(java.lang.String str2, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
                com.google.android.gms.measurement.internal.zzpf.this.zzW(str2, i, th, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:5:0x002b, B:13:0x0048, B:14:0x014c, B:24:0x0062, B:28:0x00b2, B:29:0x00a3, B:30:0x00b7, B:34:0x00c8, B:35:0x00e2, B:37:0x00f6, B:38:0x0115, B:40:0x011f, B:42:0x0125, B:43:0x0129, B:45:0x0133, B:47:0x0141, B:48:0x0149, B:49:0x0104, B:50:0x00d0, B:52:0x00da), top: B:4:0x002b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:5:0x002b, B:13:0x0048, B:14:0x014c, B:24:0x0062, B:28:0x00b2, B:29:0x00a3, B:30:0x00b7, B:34:0x00c8, B:35:0x00e2, B:37:0x00f6, B:38:0x0115, B:40:0x011f, B:42:0x0125, B:43:0x0129, B:45:0x0133, B:47:0x0141, B:48:0x0149, B:49:0x0104, B:50:0x00d0, B:52:0x00da), top: B:4:0x002b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:5:0x002b, B:13:0x0048, B:14:0x014c, B:24:0x0062, B:28:0x00b2, B:29:0x00a3, B:30:0x00b7, B:34:0x00c8, B:35:0x00e2, B:37:0x00f6, B:38:0x0115, B:40:0x011f, B:42:0x0125, B:43:0x0129, B:45:0x0133, B:47:0x0141, B:48:0x0149, B:49:0x0104, B:50:0x00d0, B:52:0x00da), top: B:4:0x002b, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzW(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        boolean z;
        zzaW().zzg();
        zzu();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzaL();
            }
        }
        com.google.android.gms.measurement.internal.zzgr zzk = zzaV().zzk();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bArr.length);
        zzk.zzb("onConfigFetched. Response size", valueOf);
        zzj().zzb();
        try {
            com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (zzu == null) {
                    zzaV().zze().zzb("App does not exist in onConfigFetched. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                } else {
                    if (!z && i != 404) {
                        zzu.zzK(zzaZ().currentTimeMillis());
                        zzj().zzv(zzu, false, false);
                        zzaV().zzk().zzc("Fetching config failed. code, error", java.lang.Integer.valueOf(i), th);
                        zzh().zzf(str);
                        this.zzk.zze.zzb(zzaZ().currentTimeMillis());
                        if (i == 503 || i == 429) {
                            this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
                        }
                        zzaK();
                    }
                    java.lang.String zzaJ = zzaJ(map, com.google.common.net.HttpHeaders.LAST_MODIFIED);
                    java.lang.String zzaJ2 = zzaJ(map, com.google.common.net.HttpHeaders.ETAG);
                    if (i != 404 && i != 304) {
                        zzh().zzi(str, bArr, zzaJ, zzaJ2);
                        zzu.zzI(zzaZ().currentTimeMillis());
                        zzj().zzv(zzu, false, false);
                        if (i != 404) {
                            zzaV().zzh().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzaV().zzk().zzc("Successfully fetched config. Got network response. code, size", java.lang.Integer.valueOf(i), valueOf);
                        }
                        if (!zzi().zzb() && zzaI()) {
                            zzM();
                        } else if (zzi().zzb() || !zzj().zzD(zzu.zzc())) {
                            zzaK();
                        } else {
                            zzP(zzu.zzc());
                        }
                    }
                    if (zzh().zzb(str) == null) {
                        zzh().zzi(str, null, null, null);
                    }
                    zzu.zzI(zzaZ().currentTimeMillis());
                    zzj().zzv(zzu, false, false);
                    if (i != 404) {
                    }
                    if (!zzi().zzb()) {
                    }
                    if (zzi().zzb()) {
                    }
                    zzaK();
                }
                zzj().zzc();
            }
            if (th == null) {
                z = true;
                if (zzu == null) {
                }
                zzj().zzc();
            }
            z = false;
            if (zzu == null) {
            }
            zzj().zzc();
        } finally {
            zzj().zzd();
        }
    }

    final void zzX(java.lang.Runnable runnable) {
        zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new java.util.ArrayList();
        }
        this.zzq.add(runnable);
    }

    final void zzY() {
        zzaW().zzg();
        zzu();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            java.nio.channels.FileChannel fileChannel = this.zzy;
            zzaW().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaV().zzb().zza("Bad channel to read from");
            } else {
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        zzaV().zze().zzb("Unexpected data length. Bytes read", java.lang.Integer.valueOf(read));
                    }
                } catch (java.io.IOException e) {
                    zzaV().zzb().zzb("Failed to read from channel", e);
                }
            }
            int zzm = this.zzn.zzv().zzm();
            zzaW().zzg();
            if (i > zzm) {
                zzaV().zzb().zzc("Panic: can't downgrade version. Previous, current version", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(zzm));
                return;
            }
            if (i < zzm) {
                java.nio.channels.FileChannel fileChannel2 = this.zzy;
                zzaW().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaV().zzb().zza("Bad channel to read from");
                } else {
                    java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(4);
                    allocate2.putInt(zzm);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaV().zzb().zzb("Error writing to channel. Bytes written", java.lang.Long.valueOf(fileChannel2.size()));
                        }
                        zzaV().zzk().zzc("Storage version upgraded. Previous, current version", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(zzm));
                        return;
                    } catch (java.io.IOException e2) {
                        zzaV().zzb().zzb("Failed to write to channel", e2);
                    }
                }
                zzaV().zzb().zzc("Storage version upgrade failed. Previous, current version", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(zzm));
            }
        }
    }

    final boolean zzZ() {
        zzaW().zzg();
        java.nio.channels.FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaV().zzk().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzc();
        java.io.File filesDir = this.zzn.zzaY().getFilesDir();
        com.google.android.gms.internal.measurement.zzbv.zza();
        int i = com.google.android.gms.internal.measurement.zzca.zzb;
        try {
            java.nio.channels.FileChannel channel = new java.io.RandomAccessFile(new java.io.File(new java.io.File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            java.nio.channels.FileLock tryLock = channel.tryLock();
            this.zzx = tryLock;
            if (tryLock != null) {
                zzaV().zzk().zza("Storage concurrent access okay");
                return true;
            }
            zzaV().zzb().zza("Storage concurrent data access panic");
            return false;
        } catch (java.io.FileNotFoundException e) {
            zzaV().zzb().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (java.io.IOException e2) {
            zzaV().zzb().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (java.nio.channels.OverlappingFileLockException e3) {
            zzaV().zze().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final com.google.android.gms.measurement.internal.zzae zzaU() {
        return this.zzn.zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final com.google.android.gms.measurement.internal.zzgt zzaV() {
        return ((com.google.android.gms.measurement.internal.zzib) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final com.google.android.gms.measurement.internal.zzhy zzaW() {
        return ((com.google.android.gms.measurement.internal.zzib) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final android.content.Context zzaY() {
        return this.zzn.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final com.google.android.gms.common.util.Clock zzaZ() {
        return ((com.google.android.gms.measurement.internal.zzib) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzaZ();
    }

    final void zzaa(com.google.android.gms.measurement.internal.zzr zzrVar) {
        if (this.zzz != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        com.google.android.gms.measurement.internal.zzav zzj = zzj();
        java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzj.zzg();
        zzj.zzay();
        try {
            android.database.sqlite.SQLiteDatabase zze = zzj.zze();
            java.lang.String[] strArr = {str};
            int delete = zze.delete("apps", "app_id=?", strArr) + zze.delete("events", "app_id=?", strArr) + zze.delete("events_snapshot", "app_id=?", strArr) + zze.delete("user_attributes", "app_id=?", strArr) + zze.delete("conditional_properties", "app_id=?", strArr) + zze.delete("raw_events", "app_id=?", strArr) + zze.delete("raw_events_metadata", "app_id=?", strArr) + zze.delete("queue", "app_id=?", strArr) + zze.delete("audience_filter_values", "app_id=?", strArr) + zze.delete("main_event_params", "app_id=?", strArr) + zze.delete("default_event_params", "app_id=?", strArr) + zze.delete("trigger_uris", "app_id=?", strArr) + zze.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.zzpk.zza();
            com.google.android.gms.measurement.internal.zzib zzibVar = zzj.zzu;
            if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbi)) {
                delete += zze.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (delete > 0) {
                zzibVar.zzaV().zzk().zzc("Reset analytics data. app, records", str, java.lang.Integer.valueOf(delete));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            zzj.zzu.zzaV().zzb().zzc("Error resetting analytics data. appId, error", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
        }
        if (zzrVar.zzh) {
            zzag(zzrVar);
        }
    }

    final void zzab(com.google.android.gms.measurement.internal.zzpk zzpkVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        java.lang.String str;
        com.google.android.gms.measurement.internal.zzpm zzm;
        long j;
        zzaW().zzg();
        zzu();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            com.google.android.gms.measurement.internal.zzpo zzt = zzt();
            java.lang.String str2 = zzpkVar.zzb;
            int zzp = zzt.zzp(str2);
            if (zzp != 0) {
                com.google.android.gms.measurement.internal.zzpo zzt2 = zzt();
                zzd();
                zzt().zzN(this.zzK, zzrVar.zza, zzp, "_ev", zzt2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            int zzK = zzt().zzK(str2, zzpkVar.zza());
            if (zzK != 0) {
                com.google.android.gms.measurement.internal.zzpo zzt3 = zzt();
                zzd();
                java.lang.String zzC = zzt3.zzC(str2, 24, true);
                java.lang.Object zza = zzpkVar.zza();
                zzt().zzN(this.zzK, zzrVar.zza, zzK, "_ev", zzC, (zza == null || !((zza instanceof java.lang.String) || (zza instanceof java.lang.CharSequence))) ? 0 : zza.toString().length());
                return;
            }
            java.lang.Object zzL = zzt().zzL(str2, zzpkVar.zza());
            if (zzL != null) {
                if ("_sid".equals(str2)) {
                    long j2 = zzpkVar.zzc;
                    java.lang.String str3 = zzpkVar.zzf;
                    java.lang.String str4 = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
                    com.google.android.gms.measurement.internal.zzpm zzm2 = zzj().zzm(str4, "_sno");
                    if (zzm2 != null) {
                        java.lang.Object obj = zzm2.zze;
                        if (obj instanceof java.lang.Long) {
                            j = ((java.lang.Long) obj).longValue();
                            str = "_sid";
                            zzab(new com.google.android.gms.measurement.internal.zzpk("_sno", j2, java.lang.Long.valueOf(j + 1), str3), zzrVar);
                        }
                    }
                    if (zzm2 != null) {
                        zzaV().zze().zzb("Retrieved last session number from database does not contain a valid (long) value", zzm2.zze);
                    }
                    com.google.android.gms.measurement.internal.zzbc zzf = zzj().zzf(str4, "_s");
                    if (zzf != null) {
                        com.google.android.gms.measurement.internal.zzgr zzk = zzaV().zzk();
                        str = "_sid";
                        long j3 = zzf.zzc;
                        zzk.zzb("Backfill the session number. Last used session number", java.lang.Long.valueOf(j3));
                        j = j3;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    zzab(new com.google.android.gms.measurement.internal.zzpk("_sno", j2, java.lang.Long.valueOf(j + 1), str3), zzrVar);
                } else {
                    str = "_sid";
                }
                java.lang.String str5 = zzrVar.zza;
                com.google.android.gms.measurement.internal.zzpm zzpmVar = new com.google.android.gms.measurement.internal.zzpm((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str5), (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpkVar.zzf), str2, zzpkVar.zzc, zzL);
                com.google.android.gms.measurement.internal.zzgr zzk2 = zzaV().zzk();
                com.google.android.gms.measurement.internal.zzib zzibVar = this.zzn;
                java.lang.String str6 = zzpmVar.zzc;
                zzk2.zzc("Setting user property", zzibVar.zzl().zzc(str6), zzL);
                zzj().zzb();
                try {
                    if ("_id".equals(str6) && (zzm = zzj().zzm(str5, "_id")) != null && !zzpmVar.zze.equals(zzm.zze)) {
                        zzj().zzk(str5, "_lair");
                    }
                    zzan(zzrVar);
                    boolean zzl = zzj().zzl(zzpmVar);
                    if (str.equals(str2)) {
                        long zzu = zzp().zzu(zzrVar.zzu);
                        com.google.android.gms.measurement.internal.zzh zzu2 = zzj().zzu(str5);
                        if (zzu2 != null) {
                            zzu2.zzan(zzu);
                            if (zzu2.zza()) {
                                zzj().zzv(zzu2, false, false);
                            }
                        }
                    }
                    zzj().zzc();
                    if (!zzl) {
                        zzaV().zzb().zzc("Too many unique user properties are set. Ignoring user property", zzibVar.zzl().zzc(str6), zzpmVar.zze);
                        zzt().zzN(this.zzK, str5, 9, null, null, 0);
                    }
                } finally {
                    zzj().zzd();
                }
            }
        }
    }

    final void zzac(java.lang.String str, com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzaW().zzg();
        zzu();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            java.lang.Boolean zzaT = zzaT(zzrVar);
            if ("_npa".equals(str) && zzaT != null) {
                zzaV().zzj().zza("Falling back to manifest metadata value for ad personalization");
                zzab(new com.google.android.gms.measurement.internal.zzpk("_npa", zzaZ().currentTimeMillis(), java.lang.Long.valueOf(true != zzaT.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            com.google.android.gms.measurement.internal.zzgr zzj = zzaV().zzj();
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzn;
            zzj.zzb("Removing user property", zzibVar.zzl().zzc(str));
            zzj().zzb();
            try {
                zzan(zzrVar);
                if ("_id".equals(str)) {
                    zzj().zzk((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza), "_lair");
                }
                zzj().zzk((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza), str);
                zzj().zzc();
                zzaV().zzj().zzb("User property removed", zzibVar.zzl().zzc(str));
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzad() {
        this.zzs++;
    }

    final void zzae() {
        this.zzt++;
    }

    final com.google.android.gms.measurement.internal.zzib zzaf() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x00bb, code lost:
    
        if (true == r11.booleanValue()) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00bd, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00c2, code lost:
    
        r3 = new com.google.android.gms.measurement.internal.zzpk("_npa", r13, java.lang.Long.valueOf(r17), "auto");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00cf, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00d9, code lost:
    
        if (r10.zze.equals(r3.zzd) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00db, code lost:
    
        zzab(r3, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c0, code lost:
    
        r17 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03db A[Catch: all -> 0x040b, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010c A[Catch: all -> 0x040b, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f8 A[Catch: all -> 0x040b, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2 A[Catch: all -> 0x040b, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[Catch: all -> 0x040b, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119 A[Catch: all -> 0x040b, TRY_LEAVE, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027b A[Catch: all -> 0x040b, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a6 A[Catch: all -> 0x040b, TRY_LEAVE, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0371 A[Catch: all -> 0x040b, TryCatch #2 {all -> 0x040b, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x012e, B:43:0x0157, B:46:0x015f, B:48:0x016e, B:49:0x024d, B:51:0x027b, B:52:0x027e, B:54:0x02a6, B:58:0x0371, B:59:0x0374, B:60:0x03fc, B:65:0x02bb, B:67:0x02de, B:69:0x02e6, B:71:0x02ee, B:75:0x0301, B:77:0x0312, B:80:0x031e, B:82:0x032f, B:84:0x0354, B:86:0x035a, B:87:0x0362, B:89:0x0368, B:93:0x0340, B:95:0x030a, B:100:0x02ca, B:101:0x017f, B:103:0x01a8, B:104:0x01b7, B:106:0x01be, B:108:0x01c4, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01e9, B:121:0x0207, B:125:0x020c, B:126:0x0220, B:127:0x022e, B:128:0x023c, B:129:0x038c, B:131:0x03c1, B:132:0x03c4, B:133:0x03db, B:135:0x03e1, B:136:0x010c, B:137:0x00f8, B:139:0x00b3, B:142:0x00c2, B:144:0x00d1, B:146:0x00db, B:150:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzag(com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzbc zzf;
        boolean z;
        long j;
        long zzN;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        android.content.pm.PackageInfo packageInfo;
        android.content.pm.ApplicationInfo applicationInfo;
        android.content.pm.ApplicationInfo applicationInfo2;
        long j2;
        boolean z2;
        zzaW().zzg();
        zzu();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (zzaQ(zzrVar)) {
            com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(str);
            if (zzu != null && android.text.TextUtils.isEmpty(zzu.zzf()) && !android.text.TextUtils.isEmpty(zzrVar.zzb)) {
                zzu.zzI(0L);
                zzj().zzv(zzu, false, false);
                zzh().zzh(str);
            }
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            long j3 = zzrVar.zzl;
            if (j3 == 0) {
                j3 = zzaZ().currentTimeMillis();
            }
            int i = zzrVar.zzm;
            if (i != 0 && i != 1) {
                zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", com.google.android.gms.measurement.internal.zzgt.zzl(str), java.lang.Integer.valueOf(i));
                i = 0;
            }
            zzj().zzb();
            try {
                com.google.android.gms.measurement.internal.zzpm zzm = zzj().zzm(str, "_npa");
                java.lang.Boolean zzaT = zzaT(zzrVar);
                if (zzm != null && !"auto".equals(zzm.zzb)) {
                    if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbc)) {
                        zzam(zzrVar, j3);
                    } else {
                        zzam(zzrVar, zzrVar.zzD);
                    }
                    zzan(zzrVar);
                    if (i != 0) {
                        zzf = zzj().zzf(str, "_f");
                        z = false;
                    } else {
                        zzf = zzj().zzf(str, "_v");
                        z = true;
                    }
                    if (zzf != null) {
                        long j4 = ((j3 / 3600000) + 1) * 3600000;
                        if (z) {
                            long j5 = j3;
                            zzab(new com.google.android.gms.measurement.internal.zzpk("_fvt", j5, java.lang.Long.valueOf(j4), "auto"), zzrVar);
                            zzaW().zzg();
                            zzu();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (zzrVar.zzo) {
                                bundle.putLong("_dac", 1L);
                            }
                            zzE(new com.google.android.gms.measurement.internal.zzbg("_v", new com.google.android.gms.measurement.internal.zzbe(bundle), "auto", j5), zzrVar);
                        } else {
                            zzab(new com.google.android.gms.measurement.internal.zzpk("_fot", j3, java.lang.Long.valueOf(j4), "auto"), zzrVar);
                            zzaW().zzg();
                            com.google.android.gms.measurement.internal.zzhj zzhjVar = (com.google.android.gms.measurement.internal.zzhj) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzm);
                            if (str != null && !str.isEmpty()) {
                                com.google.android.gms.measurement.internal.zzib zzibVar2 = zzhjVar.zza;
                                zzibVar2.zzaW().zzg();
                                if (zzhjVar.zza()) {
                                    com.google.android.gms.measurement.internal.zzhi zzhiVar = new com.google.android.gms.measurement.internal.zzhi(zzhjVar, str);
                                    zzibVar2.zzaW().zzg();
                                    j = j3;
                                    android.content.Intent intent = new android.content.Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new android.content.ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    android.content.pm.PackageManager packageManager = zzibVar2.zzaY().getPackageManager();
                                    if (packageManager == null) {
                                        zzibVar2.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzibVar2.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            android.content.pm.ResolveInfo resolveInfo = queryIntentServices.get(0);
                                            if (resolveInfo.serviceInfo != null) {
                                                java.lang.String str2 = resolveInfo.serviceInfo.packageName;
                                                if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str2) && zzhjVar.zza()) {
                                                    try {
                                                        zzibVar2.zzaV().zzk().zzb("Install Referrer Service is", com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(zzibVar2.zzaY(), new android.content.Intent(intent), zzhiVar, 1) ? "available" : "not available");
                                                    } catch (java.lang.RuntimeException e) {
                                                        zzhjVar.zza.zzaV().zzb().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                    }
                                                } else {
                                                    zzibVar2.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzibVar2.zzaV().zzi().zza("Install Referrer Reporter is not available");
                                    j = j3;
                                }
                                zzaW().zzg();
                                zzu();
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                bundle2.putLong("_c", 1L);
                                bundle2.putLong("_r", 1L);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong("_et", 1L);
                                if (zzrVar.zzo) {
                                    bundle2.putLong("_dac", 1L);
                                }
                                java.lang.String str3 = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
                                com.google.android.gms.measurement.internal.zzav zzj = zzj();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
                                zzj.zzg();
                                zzj.zzay();
                                zzN = zzj.zzN(str3, "first_open_count");
                                zzibVar = this.zzn;
                                if (zzibVar.zzaY().getPackageManager() != null) {
                                    zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str3));
                                } else {
                                    try {
                                        packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(zzibVar.zzaY()).getPackageInfo(str3, 0);
                                    } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                                        zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str3), e2);
                                        packageInfo = null;
                                    }
                                    if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                        applicationInfo = null;
                                    } else {
                                        if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaI)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (zzN == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                zzN = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            applicationInfo = null;
                                            z2 = true;
                                        }
                                        zzab(new com.google.android.gms.measurement.internal.zzpk("_fi", j, java.lang.Long.valueOf(true != z2 ? 0L : 1L), "auto"), zzrVar);
                                    }
                                    try {
                                        applicationInfo2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzn.zzaY()).getApplicationInfo(str3, 0);
                                    } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                                        zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str3), e3);
                                        applicationInfo2 = applicationInfo;
                                    }
                                    if (applicationInfo2 != null) {
                                        if ((applicationInfo2.flags & 1) != 0) {
                                            j2 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j2 = 1;
                                        }
                                        if ((applicationInfo2.flags & 128) != 0) {
                                            bundle2.putLong("_sysu", j2);
                                        }
                                    }
                                }
                                if (zzN >= 0) {
                                    bundle2.putLong("_pfo", zzN);
                                }
                                zzE(new com.google.android.gms.measurement.internal.zzbg("_f", new com.google.android.gms.measurement.internal.zzbe(bundle2), "auto", j), zzrVar);
                            }
                            j = j3;
                            zzhjVar.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                            zzaW().zzg();
                            zzu();
                            android.os.Bundle bundle22 = new android.os.Bundle();
                            bundle22.putLong("_c", 1L);
                            bundle22.putLong("_r", 1L);
                            bundle22.putLong("_uwa", 0L);
                            bundle22.putLong("_pfo", 0L);
                            bundle22.putLong("_sys", 0L);
                            bundle22.putLong("_sysu", 0L);
                            bundle22.putLong("_et", 1L);
                            if (zzrVar.zzo) {
                            }
                            java.lang.String str32 = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
                            com.google.android.gms.measurement.internal.zzav zzj2 = zzj();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str32);
                            zzj2.zzg();
                            zzj2.zzay();
                            zzN = zzj2.zzN(str32, "first_open_count");
                            zzibVar = this.zzn;
                            if (zzibVar.zzaY().getPackageManager() != null) {
                            }
                            if (zzN >= 0) {
                            }
                            zzE(new com.google.android.gms.measurement.internal.zzbg("_f", new com.google.android.gms.measurement.internal.zzbe(bundle22), "auto", j), zzrVar);
                        }
                    } else {
                        long j6 = j3;
                        if (zzrVar.zzi) {
                            zzE(new com.google.android.gms.measurement.internal.zzbg("_cd", new com.google.android.gms.measurement.internal.zzbe(new android.os.Bundle()), "auto", j6), zzrVar);
                        }
                    }
                    zzj().zzc();
                }
                if (zzm != null) {
                    zzac("_npa", zzrVar);
                }
                if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbc)) {
                }
                zzan(zzrVar);
                if (i != 0) {
                }
                if (zzf != null) {
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzah(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzaW().zzg();
        zzu();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        int i = 0;
        if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaz)) {
            long currentTimeMillis = zzaZ().currentTimeMillis();
            int zzm = zzd().zzm(null, com.google.android.gms.measurement.internal.zzfx.zzai);
            zzd();
            long zzF = currentTimeMillis - com.google.android.gms.measurement.internal.zzal.zzF();
            while (i < zzm && zzaF(null, zzF)) {
                i++;
            }
        } else {
            zzd();
            long zzH = com.google.android.gms.measurement.internal.zzal.zzH();
            while (i < zzH && zzaF(str, 0L)) {
                i++;
            }
        }
        if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaA)) {
            zzaW().zzg();
            zzau();
        }
        if (this.zzl.zzc(str, com.google.android.gms.internal.measurement.zzin.zzb(zzrVar.zzE))) {
            zzaV().zzk().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzN(str, zzaZ().currentTimeMillis());
        }
    }

    final void zzai(com.google.android.gms.measurement.internal.zzah zzahVar) {
        com.google.android.gms.measurement.internal.zzr zzaN = zzaN((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zza));
        if (zzaN != null) {
            zzaj(zzahVar, zzaN);
        }
    }

    final void zzaj(com.google.android.gms.measurement.internal.zzah zzahVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzahVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zzb);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zzc);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            com.google.android.gms.measurement.internal.zzah zzahVar2 = new com.google.android.gms.measurement.internal.zzah(zzahVar);
            boolean z = false;
            zzahVar2.zze = false;
            zzj().zzb();
            try {
                com.google.android.gms.measurement.internal.zzah zzq = zzj().zzq((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzc.zzb);
                if (zzq != null && !zzq.zzb.equals(zzahVar2.zzb)) {
                    zzaV().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzb, zzq.zzb);
                }
                if (zzq != null && zzq.zze) {
                    zzahVar2.zzb = zzq.zzb;
                    zzahVar2.zzd = zzq.zzd;
                    zzahVar2.zzh = zzq.zzh;
                    zzahVar2.zzf = zzq.zzf;
                    zzahVar2.zzi = zzq.zzi;
                    zzahVar2.zze = true;
                    com.google.android.gms.measurement.internal.zzpk zzpkVar = zzahVar2.zzc;
                    zzahVar2.zzc = new com.google.android.gms.measurement.internal.zzpk(zzpkVar.zzb, zzq.zzc.zzc, zzpkVar.zza(), zzq.zzc.zzf);
                } else if (android.text.TextUtils.isEmpty(zzahVar2.zzf)) {
                    com.google.android.gms.measurement.internal.zzpk zzpkVar2 = zzahVar2.zzc;
                    zzahVar2.zzc = new com.google.android.gms.measurement.internal.zzpk(zzpkVar2.zzb, zzahVar2.zzd, zzpkVar2.zza(), zzahVar2.zzc.zzf);
                    zzahVar2.zze = true;
                    z = true;
                }
                if (zzahVar2.zze) {
                    com.google.android.gms.measurement.internal.zzpk zzpkVar3 = zzahVar2.zzc;
                    com.google.android.gms.measurement.internal.zzpm zzpmVar = new com.google.android.gms.measurement.internal.zzpm((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzb, zzpkVar3.zzb, zzpkVar3.zzc, com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpkVar3.zza()));
                    if (zzj().zzl(zzpmVar)) {
                        zzaV().zzj().zzd("User property updated immediately", zzahVar2.zza, this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                    } else {
                        zzaV().zzb().zzd("(2)Too many active user properties, ignoring", com.google.android.gms.measurement.internal.zzgt.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzpmVar.zzc), zzpmVar.zze);
                    }
                    if (z && zzahVar2.zzi != null) {
                        zzH(new com.google.android.gms.measurement.internal.zzbg(zzahVar2.zzi, zzahVar2.zzd), zzrVar);
                    }
                }
                if (zzj().zzp(zzahVar2)) {
                    zzaV().zzj().zzd("Conditional property added", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                } else {
                    zzaV().zzb().zzd("Too many conditional properties, ignoring", com.google.android.gms.measurement.internal.zzgt.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzak(com.google.android.gms.measurement.internal.zzah zzahVar) {
        com.google.android.gms.measurement.internal.zzr zzaN = zzaN((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zza));
        if (zzaN != null) {
            zzal(zzahVar, zzaN);
        }
    }

    final void zzal(com.google.android.gms.measurement.internal.zzah zzahVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzahVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zzc);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.zzh) {
                zzan(zzrVar);
                return;
            }
            zzj().zzb();
            try {
                zzan(zzrVar);
                java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zza);
                com.google.android.gms.measurement.internal.zzah zzq = zzj().zzq(str, zzahVar.zzc.zzb);
                if (zzq != null) {
                    zzaV().zzj().zzc("Removing conditional user property", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                    zzj().zzr(str, zzahVar.zzc.zzb);
                    if (zzq.zze) {
                        zzj().zzk(str, zzahVar.zzc.zzb);
                    }
                    com.google.android.gms.measurement.internal.zzbg zzbgVar = zzahVar.zzk;
                    if (zzbgVar != null) {
                        com.google.android.gms.measurement.internal.zzbe zzbeVar = zzbgVar.zzb;
                        zzH((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzt().zzac(str, ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbgVar)).zza, zzbeVar != null ? zzbeVar.zzf() : null, zzq.zzb, zzbgVar.zzd, true, true)), zzrVar);
                    }
                } else {
                    zzaV().zze().zzc("Conditional user property doesn't exist", com.google.android.gms.measurement.internal.zzgt.zzl(zzahVar.zza), this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzam(com.google.android.gms.measurement.internal.zzr zzrVar, long j) {
        com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza));
        if (zzu != null && zzt().zzB(zzrVar.zzb, zzu.zzf())) {
            zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzu.zzc()));
            com.google.android.gms.measurement.internal.zzav zzj = zzj();
            java.lang.String zzc = zzu.zzc();
            zzj.zzay();
            zzj.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzc);
            try {
                android.database.sqlite.SQLiteDatabase zze = zzj.zze();
                java.lang.String[] strArr = {zzc};
                int delete = zze.delete("events", "app_id=?", strArr) + zze.delete("user_attributes", "app_id=?", strArr) + zze.delete("conditional_properties", "app_id=?", strArr) + zze.delete("apps", "app_id=?", strArr) + zze.delete("raw_events", "app_id=?", strArr) + zze.delete("raw_events_metadata", "app_id=?", strArr) + zze.delete("event_filters", "app_id=?", strArr) + zze.delete("property_filters", "app_id=?", strArr) + zze.delete("audience_filter_values", "app_id=?", strArr) + zze.delete("consent_settings", "app_id=?", strArr) + zze.delete("default_event_params", "app_id=?", strArr) + zze.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.zzpk.zza();
                com.google.android.gms.measurement.internal.zzib zzibVar = zzj.zzu;
                if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbi)) {
                    delete += zze.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (delete > 0) {
                    zzibVar.zzaV().zzk().zzc("Deleted application data. app, records", zzc, java.lang.Integer.valueOf(delete));
                }
            } catch (android.database.sqlite.SQLiteException e) {
                zzj.zzu.zzaV().zzb().zzc("Error deleting application data. appId, error", com.google.android.gms.measurement.internal.zzgt.zzl(zzc), e);
            }
            zzu = null;
        }
        if (zzu != null) {
            boolean z = (zzu.zzt() == -2147483648L || zzu.zzt() == zzrVar.zzj) ? false : true;
            java.lang.String zzr = zzu.zzr();
            if (((zzu.zzt() != -2147483648L || zzr == null || zzr.equals(zzrVar.zzc)) ? false : true) || z) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("_pv", zzr);
                com.google.android.gms.measurement.internal.zzbg zzbgVar = new com.google.android.gms.measurement.internal.zzbg("_au", new com.google.android.gms.measurement.internal.zzbe(bundle), "auto", j);
                if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbd)) {
                    zzE(zzbgVar, zzrVar);
                } else {
                    zzF(zzbgVar, zzrVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01dc, code lost:
    
        if (r11 != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.gms.measurement.internal.zzh zzan(com.google.android.gms.measurement.internal.zzr zzrVar) {
        boolean z;
        java.lang.String str;
        long j;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        zzaW().zzg();
        zzu();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        java.lang.String str5 = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str5);
        java.lang.String str6 = zzrVar.zzt;
        byte[] bArr = null;
        if (!str6.isEmpty()) {
            this.zzE.put(str5, new com.google.android.gms.measurement.internal.zzpc(this, str6, bArr));
        }
        com.google.android.gms.measurement.internal.zzh zzu = zzj().zzu(str5);
        com.google.android.gms.measurement.internal.zzjk zzs = zzB(str5).zzs(com.google.android.gms.measurement.internal.zzjk.zzf(zzrVar.zzs, 100));
        com.google.android.gms.measurement.internal.zzjj zzjjVar = com.google.android.gms.measurement.internal.zzjj.AD_STORAGE;
        java.lang.String zzf = zzs.zzo(zzjjVar) ? this.zzk.zzf(str5, zzrVar.zzn) : "";
        boolean z2 = true;
        if (zzu == null) {
            com.google.android.gms.measurement.internal.zzh zzhVar = new com.google.android.gms.measurement.internal.zzh(this.zzn, str5);
            if (zzs.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                zzhVar.zze(zzK(zzs));
            }
            if (zzs.zzo(zzjjVar)) {
                zzhVar.zzk(zzf);
            }
            zzu = zzhVar;
        } else if (zzs.zzo(zzjjVar) && zzf != null && !zzf.equals(zzu.zzj())) {
            boolean isEmpty = android.text.TextUtils.isEmpty(zzu.zzj());
            zzu.zzk(zzf);
            if (zzrVar.zzn && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzc(str5, zzs).first) && !isEmpty) {
                if (zzs.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                    zzu.zze(zzK(zzs));
                    z = false;
                } else {
                    z = true;
                }
                if (zzj().zzm(str5, "_id") != null && zzj().zzm(str5, "_lair") == null) {
                    zzj().zzl(new com.google.android.gms.measurement.internal.zzpm(str5, "auto", "_lair", zzaZ().currentTimeMillis(), 1L));
                }
                zzu.zzg(zzrVar.zzb);
                str = zzrVar.zzk;
                if (!android.text.TextUtils.isEmpty(str)) {
                    zzu.zzm(str);
                }
                j = zzrVar.zze;
                if (j != 0) {
                    zzu.zzy(j);
                }
                str2 = zzrVar.zzc;
                if (!android.text.TextUtils.isEmpty(str2)) {
                    zzu.zzs(str2);
                }
                zzu.zzu(zzrVar.zzj);
                str3 = zzrVar.zzd;
                if (str3 != null) {
                    zzu.zzw(str3);
                }
                zzu.zzA(zzrVar.zzf);
                zzu.zzE(zzrVar.zzh);
                str4 = zzrVar.zzg;
                if (!android.text.TextUtils.isEmpty(str4)) {
                    zzu.zzab(str4);
                }
                zzu.zzad(zzrVar.zzn);
                zzu.zzaf(zzrVar.zzp);
                zzu.zzC(zzrVar.zzq);
                zzu.zzi(zzrVar.zzu);
                com.google.android.gms.internal.measurement.zzpn.zza();
                if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaL)) {
                    com.google.android.gms.internal.measurement.zzpn.zza();
                    if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaK)) {
                        zzu.zzah(null);
                    }
                } else {
                    zzu.zzah(zzrVar.zzr);
                }
                zzu.zzaj(zzrVar.zzv);
                zzu.zzaz(zzrVar.zzB);
                com.google.android.gms.internal.measurement.zzql.zza();
                if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
                    zzu.zzap(zzrVar.zzz);
                }
                zzu.zzal(zzrVar.zzw);
                zzu.zzaG(zzrVar.zzC);
                zzu.zzaK(zzrVar.zzE);
                if (!zzu.zza()) {
                    z2 = z;
                }
                zzj().zzv(zzu, z2, false);
                return zzu;
            }
            if (android.text.TextUtils.isEmpty(zzu.zzd()) && zzs.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                zzu.zze(zzK(zzs));
            }
        } else if (android.text.TextUtils.isEmpty(zzu.zzd()) && zzs.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
            zzu.zze(zzK(zzs));
        }
        z = false;
        zzu.zzg(zzrVar.zzb);
        str = zzrVar.zzk;
        if (!android.text.TextUtils.isEmpty(str)) {
        }
        j = zzrVar.zze;
        if (j != 0) {
        }
        str2 = zzrVar.zzc;
        if (!android.text.TextUtils.isEmpty(str2)) {
        }
        zzu.zzu(zzrVar.zzj);
        str3 = zzrVar.zzd;
        if (str3 != null) {
        }
        zzu.zzA(zzrVar.zzf);
        zzu.zzE(zzrVar.zzh);
        str4 = zzrVar.zzg;
        if (!android.text.TextUtils.isEmpty(str4)) {
        }
        zzu.zzad(zzrVar.zzn);
        zzu.zzaf(zzrVar.zzp);
        zzu.zzC(zzrVar.zzq);
        zzu.zzi(zzrVar.zzu);
        com.google.android.gms.internal.measurement.zzpn.zza();
        if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaL)) {
        }
        zzu.zzaj(zzrVar.zzv);
        zzu.zzaz(zzrVar.zzB);
        com.google.android.gms.internal.measurement.zzql.zza();
        if (zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
        }
        zzu.zzal(zzrVar.zzw);
        zzu.zzaG(zzrVar.zzC);
        zzu.zzaK(zzrVar.zzE);
        if (!zzu.zza()) {
        }
        zzj().zzv(zzu, z2, false);
        return zzu;
    }

    final java.lang.String zzao(com.google.android.gms.measurement.internal.zzr zzrVar) {
        try {
            return (java.lang.String) zzaW().zzh(new com.google.android.gms.measurement.internal.zzoy(this, zzrVar)).get(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            zzaV().zzb().zzc("Failed to get app instance id. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzrVar.zza), e);
            return null;
        }
    }

    final java.util.List zzap(com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) {
        int[] iArr;
        zzaW().zzg();
        com.google.android.gms.internal.measurement.zzql.zza();
        com.google.android.gms.measurement.internal.zzal zzd = zzd();
        java.lang.String str = zzrVar.zza;
        if (!zzd.zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaP) || str == null) {
            return new java.util.ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaV().zzb().zza("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        com.google.android.gms.measurement.internal.zzav zzj = zzj();
                        int i2 = intArray[i];
                        long j = longArray[i];
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                        zzj.zzg();
                        zzj.zzay();
                        try {
                            iArr = intArray;
                            try {
                                int delete = zzj.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new java.lang.String[]{str, java.lang.String.valueOf(i2), java.lang.String.valueOf(j)});
                                com.google.android.gms.measurement.internal.zzgr zzk = zzj.zzu.zzaV().zzk();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(delete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(delete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                zzk.zzd(sb.toString(), str, java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(j));
                            } catch (android.database.sqlite.SQLiteException e) {
                                e = e;
                                zzj.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                                i++;
                                intArray = iArr;
                            }
                        } catch (android.database.sqlite.SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        com.google.android.gms.measurement.internal.zzav zzj2 = zzj();
        java.lang.String str2 = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzj2.zzg();
        zzj2.zzay();
        java.util.List arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = zzj2.zze().query("trigger_uris", new java.lang.String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new java.lang.String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        java.lang.String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new com.google.android.gms.measurement.internal.zzog(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (java.lang.Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            zzj2.zzu.zzaV().zzb().zzc("Error querying trigger uris. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2), e3);
            arrayList = java.util.Collections.emptyList();
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    final void zzaq(java.lang.String str, com.google.android.gms.measurement.internal.zzaf zzafVar) {
        zzaW().zzg();
        zzu();
        com.google.android.gms.measurement.internal.zzav zzj = zzj();
        long j = zzafVar.zza;
        com.google.android.gms.measurement.internal.zzpi zzB = zzj.zzB(j);
        if (zzB == null) {
            zzaV().zze().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, java.lang.Long.valueOf(j));
            return;
        }
        java.lang.String zze = zzB.zze();
        if (zzafVar.zzb != com.google.android.gms.measurement.internal.zzlq.SUCCESS.zza()) {
            if (zzafVar.zzb == com.google.android.gms.measurement.internal.zzlq.BACKOFF.zza()) {
                java.util.Map map = this.zzF;
                com.google.android.gms.measurement.internal.zzpd zzpdVar = (com.google.android.gms.measurement.internal.zzpd) map.get(zze);
                if (zzpdVar == null) {
                    zzpdVar = new com.google.android.gms.measurement.internal.zzpd(this);
                    map.put(zze, zzpdVar);
                } else {
                    zzpdVar.zza();
                }
                zzaV().zzk().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, zze, java.lang.Long.valueOf((zzpdVar.zzc() - zzaZ().currentTimeMillis()) / 1000));
            }
            com.google.android.gms.measurement.internal.zzav zzj2 = zzj();
            java.lang.Long valueOf = java.lang.Long.valueOf(zzafVar.zza);
            zzj2.zzK(valueOf);
            zzaV().zzk().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
            return;
        }
        java.util.Map map2 = this.zzF;
        if (map2.containsKey(zze)) {
            map2.remove(zze);
        }
        com.google.android.gms.measurement.internal.zzav zzj3 = zzj();
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j);
        zzj3.zzE(valueOf2);
        zzaV().zzk().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
        long j2 = zzafVar.zzc;
        if (j2 > 0) {
            com.google.android.gms.measurement.internal.zzav zzj4 = zzj();
            zzj4.zzg();
            zzj4.zzay();
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j2);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(valueOf3);
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("upload_type", java.lang.Integer.valueOf(com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL.zza()));
            com.google.android.gms.measurement.internal.zzib zzibVar = zzj4.zzu;
            contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, java.lang.Long.valueOf(zzibVar.zzaZ().currentTimeMillis()));
            try {
                if (zzj4.zze().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new java.lang.String[]{java.lang.String.valueOf(j2), str, java.lang.String.valueOf(com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    zzibVar.zzaV().zze().zzc("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                }
                zzaV().zzk().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, java.lang.Long.valueOf(zzafVar.zzc));
                zzP(str);
            } catch (android.database.sqlite.SQLiteException e) {
                zzj4.zzu.zzaV().zzb().zzd("Failed to update google Signal pending batch. appid, rowId", str, java.lang.Long.valueOf(j2), e);
                throw e;
            }
        }
    }

    final void zzar(boolean z) {
        zzaK();
    }

    public final void zzas(java.lang.String str, com.google.android.gms.measurement.internal.zzlt zzltVar) {
        zzaW().zzg();
        java.lang.String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzltVar != null) {
            this.zzH = str;
            this.zzG = zzltVar;
        }
    }

    final /* synthetic */ void zzat(com.google.android.gms.measurement.internal.zzpg zzpgVar) {
        zzaW().zzg();
        this.zzm = new com.google.android.gms.measurement.internal.zzhj(this);
        com.google.android.gms.measurement.internal.zzav zzavVar = new com.google.android.gms.measurement.internal.zzav(this);
        zzavVar.zzaz();
        this.zze = zzavVar;
        zzd().zza((com.google.android.gms.measurement.internal.zzak) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc));
        com.google.android.gms.measurement.internal.zznm zznmVar = new com.google.android.gms.measurement.internal.zznm(this);
        zznmVar.zzaz();
        this.zzk = zznmVar;
        com.google.android.gms.measurement.internal.zzad zzadVar = new com.google.android.gms.measurement.internal.zzad(this);
        zzadVar.zzaz();
        this.zzh = zzadVar;
        com.google.android.gms.measurement.internal.zzlo zzloVar = new com.google.android.gms.measurement.internal.zzlo(this);
        zzloVar.zzaz();
        this.zzj = zzloVar;
        com.google.android.gms.measurement.internal.zzoj zzojVar = new com.google.android.gms.measurement.internal.zzoj(this);
        zzojVar.zzaz();
        this.zzg = zzojVar;
        this.zzf = new com.google.android.gms.measurement.internal.zzha(this);
        if (this.zzs != this.zzt) {
            zzaV().zzb().zzc("Not all upload components initialized", java.lang.Integer.valueOf(this.zzs), java.lang.Integer.valueOf(this.zzt));
        }
        this.zzo.set(true);
        zzaV().zzk().zza("UploadController is now fully initialized");
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzib zzaw() {
        return this.zzn;
    }

    final /* synthetic */ java.util.Deque zzax() {
        return this.zzr;
    }

    final /* synthetic */ void zzay(long j) {
        this.zzJ = j;
    }

    protected final void zzc() {
        zzaW().zzg();
        zzj().zzI();
        com.google.android.gms.measurement.internal.zzav zzj = zzj();
        zzj.zzg();
        zzj.zzay();
        if (zzj.zzai()) {
            com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzav;
            if (((java.lang.Long) zzfwVar.zzb(null)).longValue() != 0) {
                android.database.sqlite.SQLiteDatabase zze = zzj.zze();
                com.google.android.gms.measurement.internal.zzib zzibVar = zzj.zzu;
                int delete = zze.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new java.lang.String[]{java.lang.String.valueOf(zzibVar.zzaZ().currentTimeMillis()), java.lang.String.valueOf(zzfwVar.zzb(null))});
                if (delete > 0) {
                    zzibVar.zzaV().zzk().zzb("Deleted stale trigger uris. rowsDeleted", java.lang.Integer.valueOf(delete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaK();
    }

    public final com.google.android.gms.measurement.internal.zzal zzd() {
        return ((com.google.android.gms.measurement.internal.zzib) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzc();
    }

    public final com.google.android.gms.measurement.internal.zzot zzf() {
        return this.zzl;
    }

    public final com.google.android.gms.measurement.internal.zzhs zzh() {
        com.google.android.gms.measurement.internal.zzhs zzhsVar = this.zzc;
        zzaS(zzhsVar);
        return zzhsVar;
    }

    public final com.google.android.gms.measurement.internal.zzgy zzi() {
        com.google.android.gms.measurement.internal.zzgy zzgyVar = this.zzd;
        zzaS(zzgyVar);
        return zzgyVar;
    }

    public final com.google.android.gms.measurement.internal.zzav zzj() {
        com.google.android.gms.measurement.internal.zzav zzavVar = this.zze;
        zzaS(zzavVar);
        return zzavVar;
    }

    public final com.google.android.gms.measurement.internal.zzha zzk() {
        com.google.android.gms.measurement.internal.zzha zzhaVar = this.zzf;
        if (zzhaVar != null) {
            return zzhaVar;
        }
        throw new java.lang.IllegalStateException("Network broadcast receiver not created");
    }

    public final com.google.android.gms.measurement.internal.zzoj zzl() {
        com.google.android.gms.measurement.internal.zzoj zzojVar = this.zzg;
        zzaS(zzojVar);
        return zzojVar;
    }

    public final com.google.android.gms.measurement.internal.zzad zzm() {
        com.google.android.gms.measurement.internal.zzad zzadVar = this.zzh;
        zzaS(zzadVar);
        return zzadVar;
    }

    public final com.google.android.gms.measurement.internal.zzlo zzn() {
        com.google.android.gms.measurement.internal.zzlo zzloVar = this.zzj;
        zzaS(zzloVar);
        return zzloVar;
    }

    public final com.google.android.gms.measurement.internal.zzpj zzp() {
        com.google.android.gms.measurement.internal.zzpj zzpjVar = this.zzi;
        zzaS(zzpjVar);
        return zzpjVar;
    }

    public final com.google.android.gms.measurement.internal.zznm zzq() {
        return this.zzk;
    }

    public final com.google.android.gms.measurement.internal.zzgm zzs() {
        return this.zzn.zzl();
    }

    public final com.google.android.gms.measurement.internal.zzpo zzt() {
        return ((com.google.android.gms.measurement.internal.zzib) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzk();
    }

    final void zzu() {
        if (!this.zzo.get()) {
            throw new java.lang.IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzv(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzaW().zzg();
        zzu();
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzjk zzf = com.google.android.gms.measurement.internal.zzjk.zzf(zzrVar.zzs, zzrVar.zzx);
        zzB(str);
        zzaV().zzk().zzc("Setting storage consent for package", str, zzf);
        zzA(str, zzf);
    }

    final void zzw(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzaW().zzg();
        zzu();
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzaz zzg = com.google.android.gms.measurement.internal.zzaz.zzg(zzrVar.zzy);
        zzaV().zzk().zzc("Setting DMA consent for package", str, zzg);
        zzaW().zzg();
        zzu();
        com.google.android.gms.measurement.internal.zzjh zzc = com.google.android.gms.measurement.internal.zzaz.zzh(zzy(str), 100).zzc();
        this.zzD.put(str, zzg);
        zzj().zzad(str, zzg);
        com.google.android.gms.measurement.internal.zzjh zzc2 = com.google.android.gms.measurement.internal.zzaz.zzh(zzy(str), 100).zzc();
        zzaW().zzg();
        zzu();
        com.google.android.gms.measurement.internal.zzjh zzjhVar = com.google.android.gms.measurement.internal.zzjh.DENIED;
        boolean z = zzc == zzjhVar && zzc2 == com.google.android.gms.measurement.internal.zzjh.GRANTED;
        boolean z2 = zzc == com.google.android.gms.measurement.internal.zzjh.GRANTED && zzc2 == zzjhVar;
        if (z || z2) {
            zzaV().zzk().zzb("Generated _dcu event for", str);
            android.os.Bundle bundle = new android.os.Bundle();
            if (zzj().zzw(zzC(), str, false, false, false, false, false, false, false).zzf < zzd().zzm(str, com.google.android.gms.measurement.internal.zzfx.zzam)) {
                bundle.putLong("_r", 1L);
                zzaV().zzk().zzc("_dcu realtime event count", str, java.lang.Long.valueOf(zzj().zzw(zzC(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    final com.google.android.gms.measurement.internal.zzaz zzx(java.lang.String str) {
        zzaW().zzg();
        zzu();
        java.util.Map map = this.zzD;
        com.google.android.gms.measurement.internal.zzaz zzazVar = (com.google.android.gms.measurement.internal.zzaz) map.get(str);
        if (zzazVar != null) {
            return zzazVar;
        }
        com.google.android.gms.measurement.internal.zzaz zzac = zzj().zzac(str);
        map.put(str, zzac);
        return zzac;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final android.os.Bundle zzy(java.lang.String str) {
        zzaW().zzg();
        zzu();
        if (zzh().zzx(str) == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.measurement.internal.zzjk zzB = zzB(str);
        bundle.putAll(zzB.zzn());
        bundle.putAll(zzz(str, zzx(str), zzB, new com.google.android.gms.measurement.internal.zzan()).zzf());
        com.google.android.gms.measurement.internal.zzpm zzm = zzj().zzm(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzm != null ? zzm.zze.equals(1L) : zzaB(str, new com.google.android.gms.measurement.internal.zzan())) ? "granted" : "denied");
        return bundle;
    }

    final com.google.android.gms.measurement.internal.zzaz zzz(java.lang.String str, com.google.android.gms.measurement.internal.zzaz zzazVar, com.google.android.gms.measurement.internal.zzjk zzjkVar, com.google.android.gms.measurement.internal.zzan zzanVar) {
        com.google.android.gms.measurement.internal.zzjh zzjhVar;
        int i = 90;
        if (zzh().zzx(str) == null) {
            if (zzazVar.zzc() == com.google.android.gms.measurement.internal.zzjh.DENIED) {
                i = zzazVar.zzb();
                zzanVar.zzb(com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA, i);
            } else {
                zzanVar.zzc(com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA, com.google.android.gms.measurement.internal.zzam.FAILSAFE);
            }
            return new com.google.android.gms.measurement.internal.zzaz((java.lang.Boolean) false, i, (java.lang.Boolean) true, "-");
        }
        com.google.android.gms.measurement.internal.zzjh zzc = zzazVar.zzc();
        com.google.android.gms.measurement.internal.zzjh zzjhVar2 = com.google.android.gms.measurement.internal.zzjh.GRANTED;
        if (zzc == zzjhVar2 || zzc == (zzjhVar = com.google.android.gms.measurement.internal.zzjh.DENIED)) {
            i = zzazVar.zzb();
            zzanVar.zzb(com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA, i);
        } else {
            if (zzc == com.google.android.gms.measurement.internal.zzjh.POLICY) {
                com.google.android.gms.measurement.internal.zzhs zzhsVar = this.zzc;
                com.google.android.gms.measurement.internal.zzjj zzjjVar = com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA;
                com.google.android.gms.measurement.internal.zzjh zzA = zzhsVar.zzA(str, zzjjVar);
                if (zzA != com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED) {
                    zzanVar.zzc(zzjjVar, com.google.android.gms.measurement.internal.zzam.REMOTE_ENFORCED_DEFAULT);
                    zzc = zzA;
                }
            }
            com.google.android.gms.measurement.internal.zzhs zzhsVar2 = this.zzc;
            com.google.android.gms.measurement.internal.zzjj zzjjVar2 = com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA;
            com.google.android.gms.measurement.internal.zzjj zzw = zzhsVar2.zzw(str, zzjjVar2);
            com.google.android.gms.measurement.internal.zzjh zzp = zzjkVar.zzp();
            boolean z = zzp == zzjhVar2 || zzp == zzjhVar;
            if (zzw == com.google.android.gms.measurement.internal.zzjj.AD_STORAGE && z) {
                zzanVar.zzc(zzjjVar2, com.google.android.gms.measurement.internal.zzam.REMOTE_DELEGATION);
                zzc = zzp;
            } else {
                zzanVar.zzc(zzjjVar2, com.google.android.gms.measurement.internal.zzam.REMOTE_DEFAULT);
                zzc = true != zzhsVar2.zzv(str, zzjjVar2) ? zzjhVar : zzjhVar2;
            }
        }
        boolean zzy = this.zzc.zzy(str);
        java.util.SortedSet zzz = zzh().zzz(str);
        if (zzc == com.google.android.gms.measurement.internal.zzjh.DENIED || zzz.isEmpty()) {
            return new com.google.android.gms.measurement.internal.zzaz((java.lang.Boolean) false, i, java.lang.Boolean.valueOf(zzy), "-");
        }
        return new com.google.android.gms.measurement.internal.zzaz((java.lang.Boolean) true, i, java.lang.Boolean.valueOf(zzy), zzy ? android.text.TextUtils.join("", zzz) : "");
    }
}
