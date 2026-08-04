package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.sentry.ProfileContext;
import io.sentry.TransactionOptions;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class zzaae extends zzsy implements zzaat {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private long zzC;
    private int zzD;
    private long zzE;
    private zzcc zzF;
    private zzcc zzG;
    private int zzH;
    private int zzI;
    private zzaar zzJ;
    private long zzK;
    private long zzL;
    private boolean zzM;
    private boolean zzN;
    private final Context zze;
    private final boolean zzf;
    private final zzabk zzg;
    private final boolean zzh;
    private final zzaau zzi;
    private final zzaas zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaad zzm;
    private boolean zzn;
    private boolean zzo;
    private zzabo zzp;
    private boolean zzq;
    private List zzr;
    private Surface zzs;
    private zzaah zzt;
    private zzee zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private int zzz;

    public zzaae(zzaac zzaacVar) {
        super(2, zzaacVar.zzd, zzaacVar.zzc, false, 30.0f);
        Context applicationContext = zzaacVar.zza.getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzabk(zzaacVar.zze, zzaacVar.zzf);
        this.zzf = this.zzp == null;
        this.zzi = new zzaau(applicationContext, this, 0L);
        this.zzj = new zzaas();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzu = zzee.zza;
        this.zzw = 1;
        this.zzx = 0;
        this.zzF = zzcc.zza;
        this.zzI = 0;
        this.zzG = null;
        this.zzH = -1000;
        this.zzK = -9223372036854775807L;
        this.zzL = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x015f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0163  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x016f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0177  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x019f  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0217  */
    /* JADX WARN: Code duplicated, block: B:155:0x021f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0223  */
    /* JADX WARN: Code duplicated, block: B:158:0x022b  */
    /* JADX WARN: Code duplicated, block: B:159:0x022f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0237  */
    /* JADX WARN: Code duplicated, block: B:162:0x023b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0243  */
    /* JADX WARN: Code duplicated, block: B:165:0x0247  */
    /* JADX WARN: Code duplicated, block: B:167:0x024f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0253  */
    /* JADX WARN: Code duplicated, block: B:170:0x025b  */
    /* JADX WARN: Code duplicated, block: B:171:0x025f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0267  */
    /* JADX WARN: Code duplicated, block: B:174:0x026b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0273  */
    /* JADX WARN: Code duplicated, block: B:177:0x0277  */
    /* JADX WARN: Code duplicated, block: B:179:0x027f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0283  */
    /* JADX WARN: Code duplicated, block: B:182:0x028b  */
    /* JADX WARN: Code duplicated, block: B:183:0x028f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0297  */
    /* JADX WARN: Code duplicated, block: B:186:0x029b  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x02af  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:198:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:203:0x02df  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:206:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:212:0x0302  */
    /* JADX WARN: Code duplicated, block: B:213:0x0306  */
    /* JADX WARN: Code duplicated, block: B:215:0x030e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0312  */
    /* JADX WARN: Code duplicated, block: B:218:0x031a  */
    /* JADX WARN: Code duplicated, block: B:219:0x031e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0326  */
    /* JADX WARN: Code duplicated, block: B:222:0x032a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0332  */
    /* JADX WARN: Code duplicated, block: B:225:0x0336  */
    /* JADX WARN: Code duplicated, block: B:227:0x033e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0342  */
    /* JADX WARN: Code duplicated, block: B:230:0x034a  */
    /* JADX WARN: Code duplicated, block: B:231:0x034e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0356  */
    /* JADX WARN: Code duplicated, block: B:234:0x035a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0362  */
    /* JADX WARN: Code duplicated, block: B:237:0x0366  */
    /* JADX WARN: Code duplicated, block: B:239:0x036e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0372  */
    /* JADX WARN: Code duplicated, block: B:242:0x037a  */
    /* JADX WARN: Code duplicated, block: B:243:0x037e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0386  */
    /* JADX WARN: Code duplicated, block: B:246:0x038a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0392  */
    /* JADX WARN: Code duplicated, block: B:249:0x0396  */
    /* JADX WARN: Code duplicated, block: B:251:0x039e  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:254:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:266:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:267:0x03db  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:272:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:275:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:276:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:278:0x0407  */
    /* JADX WARN: Code duplicated, block: B:279:0x040b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0413  */
    /* JADX WARN: Code duplicated, block: B:282:0x0417  */
    /* JADX WARN: Code duplicated, block: B:284:0x041f  */
    /* JADX WARN: Code duplicated, block: B:285:0x0423  */
    /* JADX WARN: Code duplicated, block: B:287:0x042b  */
    /* JADX WARN: Code duplicated, block: B:288:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0437  */
    /* JADX WARN: Code duplicated, block: B:291:0x043b  */
    /* JADX WARN: Code duplicated, block: B:293:0x0443  */
    /* JADX WARN: Code duplicated, block: B:294:0x0447  */
    /* JADX WARN: Code duplicated, block: B:296:0x044f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0453  */
    /* JADX WARN: Code duplicated, block: B:299:0x045b  */
    /* JADX WARN: Code duplicated, block: B:300:0x045f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0467  */
    /* JADX WARN: Code duplicated, block: B:303:0x046b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0473  */
    /* JADX WARN: Code duplicated, block: B:306:0x0477  */
    /* JADX WARN: Code duplicated, block: B:308:0x047f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0483  */
    /* JADX WARN: Code duplicated, block: B:311:0x048b  */
    /* JADX WARN: Code duplicated, block: B:312:0x048f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0497  */
    /* JADX WARN: Code duplicated, block: B:315:0x049a  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:318:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:320:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:321:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:323:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:324:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:327:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:332:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:333:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:335:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:336:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:339:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:341:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:342:0x0500  */
    /* JADX WARN: Code duplicated, block: B:344:0x0508  */
    /* JADX WARN: Code duplicated, block: B:345:0x050c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0514  */
    /* JADX WARN: Code duplicated, block: B:348:0x0518  */
    /* JADX WARN: Code duplicated, block: B:350:0x0520  */
    /* JADX WARN: Code duplicated, block: B:351:0x0524  */
    /* JADX WARN: Code duplicated, block: B:353:0x052c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0530  */
    /* JADX WARN: Code duplicated, block: B:356:0x0538  */
    /* JADX WARN: Code duplicated, block: B:357:0x053c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0544  */
    /* JADX WARN: Code duplicated, block: B:360:0x0548  */
    /* JADX WARN: Code duplicated, block: B:362:0x0550  */
    /* JADX WARN: Code duplicated, block: B:363:0x0554  */
    /* JADX WARN: Code duplicated, block: B:365:0x055c  */
    /* JADX WARN: Code duplicated, block: B:366:0x0560  */
    /* JADX WARN: Code duplicated, block: B:368:0x0568  */
    /* JADX WARN: Code duplicated, block: B:369:0x056c  */
    /* JADX WARN: Code duplicated, block: B:371:0x0574  */
    /* JADX WARN: Code duplicated, block: B:372:0x0578  */
    /* JADX WARN: Code duplicated, block: B:374:0x0580  */
    /* JADX WARN: Code duplicated, block: B:375:0x0584  */
    /* JADX WARN: Code duplicated, block: B:377:0x058c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0590  */
    /* JADX WARN: Code duplicated, block: B:380:0x0598  */
    /* JADX WARN: Code duplicated, block: B:381:0x059c  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:384:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:387:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:389:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:392:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:393:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:395:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:396:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:398:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:401:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:402:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:404:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:405:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:407:0x0604  */
    /* JADX WARN: Code duplicated, block: B:408:0x0608  */
    /* JADX WARN: Code duplicated, block: B:410:0x0610  */
    /* JADX WARN: Code duplicated, block: B:411:0x0614  */
    /* JADX WARN: Code duplicated, block: B:413:0x061c  */
    /* JADX WARN: Code duplicated, block: B:414:0x0620  */
    /* JADX WARN: Code duplicated, block: B:416:0x0628  */
    /* JADX WARN: Code duplicated, block: B:417:0x062c  */
    /* JADX WARN: Code duplicated, block: B:419:0x0634  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:420:0x0638  */
    /* JADX WARN: Code duplicated, block: B:422:0x0640  */
    /* JADX WARN: Code duplicated, block: B:423:0x0644  */
    /* JADX WARN: Code duplicated, block: B:425:0x064c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0650  */
    /* JADX WARN: Code duplicated, block: B:428:0x0658  */
    /* JADX WARN: Code duplicated, block: B:429:0x065b  */
    /* JADX WARN: Code duplicated, block: B:431:0x0663  */
    /* JADX WARN: Code duplicated, block: B:432:0x0666  */
    /* JADX WARN: Code duplicated, block: B:434:0x066e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0672  */
    /* JADX WARN: Code duplicated, block: B:437:0x067a  */
    /* JADX WARN: Code duplicated, block: B:438:0x067e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0686  */
    /* JADX WARN: Code duplicated, block: B:441:0x068a  */
    /* JADX WARN: Code duplicated, block: B:443:0x0692  */
    /* JADX WARN: Code duplicated, block: B:444:0x0696  */
    /* JADX WARN: Code duplicated, block: B:446:0x069e  */
    /* JADX WARN: Code duplicated, block: B:447:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:449:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:450:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:452:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:453:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:455:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:456:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:458:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:459:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:461:0x06da  */
    /* JADX WARN: Code duplicated, block: B:462:0x06de  */
    /* JADX WARN: Code duplicated, block: B:464:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:465:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:467:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:468:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:470:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:471:0x0702  */
    /* JADX WARN: Code duplicated, block: B:473:0x070a  */
    /* JADX WARN: Code duplicated, block: B:474:0x070e  */
    /* JADX WARN: Code duplicated, block: B:476:0x0716  */
    /* JADX WARN: Code duplicated, block: B:477:0x071a  */
    /* JADX WARN: Code duplicated, block: B:479:0x0722  */
    /* JADX WARN: Code duplicated, block: B:480:0x0726  */
    /* JADX WARN: Code duplicated, block: B:482:0x072e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0731  */
    /* JADX WARN: Code duplicated, block: B:485:0x0739  */
    /* JADX WARN: Code duplicated, block: B:486:0x073c  */
    /* JADX WARN: Code duplicated, block: B:488:0x0744  */
    /* JADX WARN: Code duplicated, block: B:489:0x0747  */
    /* JADX WARN: Code duplicated, block: B:491:0x074f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0752  */
    /* JADX WARN: Code duplicated, block: B:494:0x075a  */
    /* JADX WARN: Code duplicated, block: B:495:0x075d  */
    /* JADX WARN: Code duplicated, block: B:497:0x0765  */
    /* JADX WARN: Code duplicated, block: B:498:0x0768  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:500:0x0770  */
    /* JADX WARN: Code duplicated, block: B:501:0x0773  */
    /* JADX WARN: Code duplicated, block: B:503:0x077b  */
    /* JADX WARN: Code duplicated, block: B:504:0x077e  */
    /* JADX WARN: Code duplicated, block: B:506:0x0786  */
    /* JADX WARN: Code duplicated, block: B:507:0x0789  */
    /* JADX WARN: Code duplicated, block: B:509:0x078d A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:513:0x0797  */
    /* JADX WARN: Code duplicated, block: B:532:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean zzaT(String str) {
        String str2;
        byte b7;
        String str3;
        byte b8;
        boolean z4 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzaae.class) {
            if (!zzc) {
                int i7 = zzen.zza;
                byte b9 = 28;
                if (i7 <= 28) {
                    String str4 = Build.DEVICE;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b8 = !str4.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b8 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b8 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b8 = !str4.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b8 = !str4.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b8 = !str4.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b8 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b8 = !str4.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b8 = -1;
                            break;
                    }
                    switch (b8) {
                        default:
                            if (i7 <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                str2 = Build.MODEL;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b7 = -1;
                                        } else {
                                            b7 = 5;
                                        }
                                        break;
                                    default:
                                        b7 = -1;
                                        break;
                                }
                                switch (b7) {
                                    default:
                                        if (i7 <= 26) {
                                            str3 = Build.DEVICE;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 13;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 31;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 127;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 16;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b9 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 15;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 30;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 25;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 61;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 24;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 29;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 63;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 14;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b9 = -1;
                                                    } else {
                                                        b9 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b9 = -1;
                                                    break;
                                            }
                                            switch (b9) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case zzbbd.zzt.zzm /* 21 */:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case 76:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case 117:
                                                case 118:
                                                case 119:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case 125:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    z4 = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z4 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z4 = true;
                            break;
                    }
                } else if (i7 <= 27) {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b7 = -1;
                            } else {
                                b7 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b7 = -1;
                            } else {
                                b7 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b7 = -1;
                            } else {
                                b7 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b7 = -1;
                            } else {
                                b7 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b7 = -1;
                            } else {
                                b7 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b7 = -1;
                            } else {
                                b7 = 5;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    switch (b7) {
                        default:
                            if (i7 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b9 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 66;
                                        }
                                        break;
                                    default:
                                        b9 = -1;
                                        break;
                                }
                                switch (b9) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case zzbbd.zzt.zzm /* 21 */:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z4 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z4 = true;
                            break;
                    }
                } else {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b7 = -1;
                            } else {
                                b7 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b7 = -1;
                            } else {
                                b7 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b7 = -1;
                            } else {
                                b7 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b7 = -1;
                            } else {
                                b7 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b7 = -1;
                            } else {
                                b7 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b7 = -1;
                            } else {
                                b7 = 5;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    switch (b7) {
                        default:
                            if (i7 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b9 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b9 = -1;
                                        } else {
                                            b9 = 66;
                                        }
                                        break;
                                    default:
                                        b9 = -1;
                                        break;
                                }
                                switch (b9) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case zzbbd.zzt.zzm /* 21 */:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z4 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z4 = true;
                            break;
                    }
                }
                zzd = z4;
                zzc = true;
            }
        }
        return zzd;
    }

    public static final boolean zzaU(zzsr zzsrVar) {
        return zzen.zza >= 35 && zzsrVar.zzh;
    }

    private final Surface zzaV(zzsr zzsrVar) {
        if (this.zzp != null) {
            zzcv.zzf(false);
            zzcv.zzb(null);
            throw null;
        }
        Surface surface = this.zzs;
        if (surface != null) {
            return surface;
        }
        if (zzaU(zzsrVar)) {
            return null;
        }
        zzcv.zzf(zzaS(zzsrVar));
        zzaah zzaahVar = this.zzt;
        if (zzaahVar != null) {
            if (zzaahVar.zza != zzsrVar.zzf) {
                zzaY();
            }
        }
        if (this.zzt == null) {
            this.zzt = zzaah.zza(this.zze, zzsrVar.zzf);
        }
        return this.zzt;
    }

    private static List zzaW(Context context, zzta zztaVar, zzz zzzVar, boolean z4, boolean z7) {
        String str = zzzVar.zzo;
        if (str == null) {
            return zzfwh.zzn();
        }
        if (zzen.zza >= 26 && "video/dolby-vision".equals(str) && !zzaab.zza(context)) {
            List listZzc = zztl.zzc(zztaVar, zzzVar, z4, z7);
            if (!listZzc.isEmpty()) {
                return listZzc;
            }
        }
        return zztl.zze(zztaVar, zzzVar, z4, z7);
    }

    private final void zzaX() {
        zzcc zzccVar = this.zzG;
        if (zzccVar != null) {
            this.zzg.zzt(zzccVar);
        }
    }

    private final void zzaY() {
        zzaah zzaahVar = this.zzt;
        if (zzaahVar != null) {
            zzaahVar.release();
            this.zzt = null;
        }
    }

    private final void zzaZ(Object obj) throws zzia {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzs == surface) {
            if (surface != null) {
                zzaX();
                Surface surface2 = this.zzs;
                if (surface2 == null || !this.zzv) {
                    return;
                }
                this.zzg.zzq(surface2);
                return;
            }
            return;
        }
        this.zzs = surface;
        if (this.zzp == null) {
            this.zzi.zzm(surface);
        }
        this.zzv = false;
        int iZzcT = zzcT();
        zzso zzsoVarZzaz = zzaz();
        if (zzsoVarZzaz != null && this.zzp == null) {
            zzsr zzsrVarZzaB = zzaB();
            zzsrVarZzaB.getClass();
            boolean zZzba = zzba(zzsrVarZzaB);
            int i7 = zzen.zza;
            if (!zZzba || this.zzn) {
                zzaF();
                zzaC();
            } else {
                Surface surfaceZzaV = zzaV(zzsrVarZzaB);
                if (surfaceZzaV != null) {
                    zzsoVarZzaz.zzp(surfaceZzaV);
                } else {
                    if (zzen.zza < 35) {
                        throw new IllegalStateException();
                    }
                    zzsoVarZzaz.zzi();
                }
            }
        }
        if (surface == null) {
            this.zzG = null;
            zzabo zzaboVar = this.zzp;
            if (zzaboVar != null) {
                ((zzaal) zzaboVar).zza.zzn();
                return;
            }
            return;
        }
        zzaX();
        if (iZzcT == 2) {
            zzabo zzaboVar2 = this.zzp;
            if (zzaboVar2 != null) {
                zzaboVar2.zzf(true);
            } else {
                this.zzi.zzc(true);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    public static int zzad(zzsr zzsrVar, zzz zzzVar) {
        int i7 = zzzVar.zzv;
        int i8 = zzzVar.zzw;
        if (i7 != -1 && i8 != -1) {
            String str = zzzVar.zzo;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i9 = zztl.zza;
                Pair pairZza = zzda.zza(zzzVar);
                if (pairZza == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairZza.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            int i10 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i7 * i8) * 3) / i10;
                case "video/hevc":
                    return Math.max(2097152, ((i7 * i8) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzsrVar.zzf)))) {
                        int i11 = zzen.zza;
                        return ((((i8 + 15) / 16) * ((i7 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i10 = 8;
                    return ((i7 * i8) * 3) / i10;
            }
        }
        return -1;
    }

    public static int zzae(zzsr zzsrVar, zzz zzzVar) {
        if (zzzVar.zzp == -1) {
            return zzad(zzsrVar, zzzVar);
        }
        int size = zzzVar.zzr.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += ((byte[]) zzzVar.zzr.get(i7)).length;
        }
        return zzzVar.zzp + length;
    }

    private final boolean zzba(zzsr zzsrVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzs;
        return (surface != null && surface.isValid()) || zzaU(zzsrVar) || zzaS(zzsrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzA() {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar == null || !this.zzf) {
            return;
        }
        ((zzaal) zzaboVar).zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzq = false;
            this.zzK = -9223372036854775807L;
            zzaY();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzD() {
        this.zzz = 0;
        this.zzy = zzi().zzb();
        this.zzC = 0L;
        this.zzD = 0;
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            ((zzaal) zzaboVar).zza.zzg.zzj();
        } else {
            this.zzi.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzE() {
        if (this.zzz > 0) {
            long jZzb = zzi().zzb();
            this.zzg.zzn(this.zzz, jZzb - this.zzy);
            this.zzz = 0;
            this.zzy = jZzb;
        }
        int i7 = this.zzD;
        if (i7 != 0) {
            this.zzg.zzr(this.zzC, i7);
            this.zzC = 0L;
            this.zzD = 0;
        }
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            ((zzaal) zzaboVar).zza.zzg.zzk();
        } else {
            this.zzi.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzF(zzz[] zzzVarArr, long j, long j3, zzuq zzuqVar) {
        super.zzF(zzzVarArr, j, j3, zzuqVar);
        if (this.zzK == -9223372036854775807L) {
            this.zzK = j;
        }
        zzbn zzbnVarZzh = zzh();
        if (zzbnVarZzh.zzo()) {
            this.zzL = -9223372036854775807L;
        } else {
            this.zzL = zzbnVarZzh.zzn(zzuqVar.zza, new zzbl()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlm
    public final void zzM(float f7, float f8) throws zzia {
        super.zzM(f7, f8);
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            ((zzaal) zzaboVar).zza.zzg.zzn(f7);
        } else {
            this.zzi.zzn(f7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm, com.google.android.gms.internal.ads.zzlp
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzlm
    public final void zzV(long j, long j3) throws zzia {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            try {
                ((zzaal) zzaboVar).zza.zzg.zzl(j, j3);
            } catch (zzabn e7) {
                throw zzcW(e7, e7.zza, false, 7001);
            }
        }
        super.zzV(j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzlm
    public final boolean zzW() {
        return super.zzW() && this.zzp == null;
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzlm
    public final boolean zzX() {
        boolean zZzX = super.zzX();
        zzabo zzaboVar = this.zzp;
        boolean z4 = false;
        if (zzaboVar != null) {
            return ((zzaal) zzaboVar).zza.zzg.zzt(false);
        }
        if (zZzX) {
            z4 = true;
            if (zzaz() == null || this.zzs == null) {
                return true;
            }
        }
        return this.zzi.zzo(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final float zzZ(float f7, zzz zzzVar, zzz[] zzzVarArr) {
        float fMax = -1.0f;
        for (zzz zzzVar2 : zzzVarArr) {
            float f8 = zzzVar2.zzx;
            if (f8 != -1.0f) {
                fMax = Math.max(fMax, f8);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f7;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsq zzaA(Throwable th, zzsr zzsrVar) {
        return new zzzz(th, zzsrVar, this.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaD(long j) {
        super.zzaD(j);
        this.zzB--;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaE(zzhg zzhgVar) {
        this.zzB++;
        int i7 = zzen.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaG() {
        super.zzaG();
        this.zzl.clear();
        this.zzN = false;
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaM(zzz zzzVar) throws zzia {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar == null) {
            return true;
        }
        try {
            zzaaq.zzb(((zzaal) zzaboVar).zza, zzzVar, 0);
            return false;
        } catch (zzabn e7) {
            throw zzcW(e7, zzzVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaN(zzhg zzhgVar) {
        if (!zzQ() && !zzhgVar.zzh() && this.zzL != -9223372036854775807L) {
            if (this.zzL - (zzhgVar.zze - zzav()) > 100000 && !zzhgVar.zzl()) {
                boolean z4 = zzhgVar.zze < zzf();
                if ((z4 || this.zzN) && !zzhgVar.zze() && zzhgVar.zzi()) {
                    zzhgVar.zzb();
                    if (z4) {
                        ((zzsy) this).zza.zzd++;
                    } else if (this.zzN) {
                        this.zzl.add(Long.valueOf(zzhgVar.zze));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaO(zzsr zzsrVar) {
        return zzba(zzsrVar);
    }

    public final void zzaQ(long j) {
        zzhq zzhqVar = ((zzsy) this).zza;
        zzhqVar.zzk += j;
        zzhqVar.zzl++;
        this.zzC += j;
        this.zzD++;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final boolean zzaR(long j, long j3, long j7, boolean z4, boolean z7) throws zzia {
        int iZzd;
        long j8 = this.zzk;
        if (j8 != -9223372036854775807L) {
            this.zzN = j < j8;
        }
        if (j >= -500000 || z4 || (iZzd = zzd(j3)) == 0) {
            return false;
        }
        if (z7) {
            zzhq zzhqVar = ((zzsy) this).zza;
            int i7 = zzhqVar.zzd + iZzd;
            zzhqVar.zzd = i7;
            zzhqVar.zzf += this.zzB;
            zzhqVar.zzd = this.zzl.size() + i7;
        } else {
            ((zzsy) this).zza.zzj++;
            zzao(this.zzl.size() + iZzd, this.zzB);
        }
        zzaI();
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            zzaboVar.zze(false);
        }
        return true;
    }

    public final boolean zzaS(zzsr zzsrVar) {
        int i7 = zzen.zza;
        if (zzaT(zzsrVar.zza)) {
            return false;
        }
        return !zzsrVar.zzf || zzaah.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzaa(zzta zztaVar, zzz zzzVar) {
        boolean z4;
        if (!zzay.zzj(zzzVar.zzo)) {
            return 128;
        }
        Context context = this.zze;
        int i7 = 0;
        boolean z7 = zzzVar.zzs != null;
        List listZzaW = zzaW(context, zztaVar, zzzVar, z7, false);
        if (z7 && listZzaW.isEmpty()) {
            listZzaW = zzaW(context, zztaVar, zzzVar, false, false);
        }
        if (listZzaW.isEmpty()) {
            return 129;
        }
        if (!zzsy.zzaP(zzzVar)) {
            return 130;
        }
        zzsr zzsrVar = (zzsr) listZzaW.get(0);
        boolean zZze = zzsrVar.zze(zzzVar);
        if (!zZze) {
            int i8 = 1;
            while (true) {
                if (i8 >= listZzaW.size()) {
                    z4 = true;
                    break;
                }
                zzsr zzsrVar2 = (zzsr) listZzaW.get(i8);
                if (zzsrVar2.zze(zzzVar)) {
                    zZze = true;
                    z4 = false;
                    zzsrVar = zzsrVar2;
                    break;
                }
                i8++;
            }
        } else {
            z4 = true;
            break;
        }
        int i9 = true != zZze ? 3 : 4;
        int i10 = true != zzsrVar.zzf(zzzVar) ? 8 : 16;
        int i11 = true != zzsrVar.zzg ? 0 : 64;
        int i12 = true != z4 ? 0 : 128;
        if (zzen.zza >= 26 && "video/dolby-vision".equals(zzzVar.zzo) && !zzaab.zza(context)) {
            i12 = 256;
        }
        if (zZze) {
            List listZzaW2 = zzaW(context, zztaVar, zzzVar, z7, true);
            if (!listZzaW2.isEmpty()) {
                zzsr zzsrVar3 = (zzsr) zztl.zzf(listZzaW2, zzzVar).get(0);
                if (zzsrVar3.zze(zzzVar) && zzsrVar3.zzf(zzzVar)) {
                    i7 = 32;
                }
            }
        }
        return i12 | i9 | i10 | i7 | i11;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhr zzab(zzsr zzsrVar, zzz zzzVar, zzz zzzVar2) {
        int i7;
        int i8;
        zzhr zzhrVarZzb = zzsrVar.zzb(zzzVar, zzzVar2);
        int i9 = zzhrVarZzb.zze;
        zzaad zzaadVar = this.zzm;
        zzaadVar.getClass();
        if (zzzVar2.zzv > zzaadVar.zza || zzzVar2.zzw > zzaadVar.zzb) {
            i9 |= 256;
        }
        if (zzae(zzsrVar, zzzVar2) > zzaadVar.zzc) {
            i9 |= 64;
        }
        String str = zzsrVar.zza;
        if (i9 != 0) {
            i8 = i9;
            i7 = 0;
        } else {
            i7 = zzhrVarZzb.zzd;
            i8 = 0;
        }
        return new zzhr(str, zzzVar, zzzVar2, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhr zzac(zzkh zzkhVar) {
        zzhr zzhrVarZzac = super.zzac(zzkhVar);
        zzz zzzVar = zzkhVar.zza;
        zzzVar.getClass();
        this.zzg.zzp(zzzVar, zzhrVarZzac);
        return zzhrVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsl zzaf(zzsr zzsrVar, zzz zzzVar, MediaCrypto mediaCrypto, float f7) {
        Point pointZza;
        int i7;
        int iZzad;
        zzz[] zzzVarArrZzT = zzT();
        int length = zzzVarArrZzT.length;
        int iZzae = zzae(zzsrVar, zzzVar);
        int iMax = zzzVar.zzv;
        int iMax2 = zzzVar.zzw;
        if (length != 1) {
            boolean z4 = false;
            for (int i8 = 0; i8 < length; i8++) {
                zzz zzzVarZzaj = zzzVarArrZzT[i8];
                if (zzzVar.zzC != null && zzzVarZzaj.zzC == null) {
                    zzx zzxVarZzb = zzzVarZzaj.zzb();
                    zzxVarZzb.zzD(zzzVar.zzC);
                    zzzVarZzaj = zzxVarZzb.zzaj();
                }
                if (zzsrVar.zzb(zzzVar, zzzVarZzaj).zzd != 0) {
                    int i9 = zzzVarZzaj.zzv;
                    z4 |= i9 == -1 || zzzVarZzaj.zzw == -1;
                    iMax = Math.max(iMax, i9);
                    iMax2 = Math.max(iMax2, zzzVarZzaj.zzw);
                    iZzae = Math.max(iZzae, zzae(zzsrVar, zzzVarZzaj));
                }
            }
            if (z4) {
                zzdq.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i10 = zzzVar.zzw;
                int i11 = zzzVar.zzv;
                boolean z7 = i10 > i11;
                int i12 = z7 ? i10 : i11;
                if (true == z7) {
                    i10 = i11;
                }
                int[] iArr = zzb;
                int i13 = 0;
                while (true) {
                    if (i13 < 9) {
                        float f8 = i10;
                        float f9 = i12;
                        int i14 = iArr[i13];
                        int[] iArr2 = iArr;
                        float f10 = i14;
                        if (i14 > i12 && (i7 = (int) ((f8 / f9) * f10)) > i10) {
                            int i15 = true != z7 ? i14 : i7;
                            if (true != z7) {
                                i14 = i7;
                            }
                            pointZza = zzsrVar.zza(i15, i14);
                            float f11 = zzzVar.zzx;
                            if (pointZza != null) {
                                if (zzsrVar.zzg(pointZza.x, pointZza.y, f11)) {
                                    break;
                                }
                            }
                            i13++;
                            z7 = z7;
                            iArr = iArr2;
                            i10 = i10;
                        }
                    }
                    pointZza = null;
                    break;
                }
                if (pointZza != null) {
                    iMax = Math.max(iMax, pointZza.x);
                    iMax2 = Math.max(iMax2, pointZza.y);
                    zzx zzxVarZzb2 = zzzVar.zzb();
                    zzxVarZzb2.zzai(iMax);
                    zzxVarZzb2.zzM(iMax2);
                    iZzae = Math.max(iZzae, zzad(zzsrVar, zzxVarZzb2.zzaj()));
                    zzdq.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
        } else if (iZzae != -1 && (iZzad = zzad(zzsrVar, zzzVar)) != -1) {
            iZzae = Math.min((int) (iZzae * 1.5f), iZzad);
        }
        String str = zzsrVar.zzc;
        zzaad zzaadVar = new zzaad(iMax, iMax2, iZzae);
        this.zzm = zzaadVar;
        boolean z8 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzzVar.zzv);
        mediaFormat.setInteger("height", zzzVar.zzw);
        zzdt.zzb(mediaFormat, zzzVar.zzr);
        float f12 = zzzVar.zzx;
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        zzdt.zza(mediaFormat, "rotation-degrees", zzzVar.zzy);
        zzk zzkVar = zzzVar.zzC;
        if (zzkVar != null) {
            zzdt.zza(mediaFormat, "color-transfer", zzkVar.zzd);
            zzdt.zza(mediaFormat, "color-standard", zzkVar.zzb);
            zzdt.zza(mediaFormat, "color-range", zzkVar.zzc);
            byte[] bArr = zzkVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzzVar.zzo)) {
            int i16 = zztl.zza;
            Pair pairZza = zzda.zza(zzzVar);
            if (pairZza != null) {
                zzdt.zza(mediaFormat, ProfileContext.TYPE, ((Integer) pairZza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaadVar.zza);
        mediaFormat.setInteger("max-height", zzaadVar.zzb);
        zzdt.zza(mediaFormat, "max-input-size", zzaadVar.zzc);
        int i17 = zzen.zza;
        mediaFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        if (z8) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (zzen.zza >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzH));
        }
        Surface surfaceZzaV = zzaV(zzsrVar);
        if (this.zzp != null && !zzen.zzL(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsl.zzb(zzsrVar, mediaFormat, zzzVar, surfaceZzaV, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final List zzag(zzta zztaVar, zzz zzzVar, boolean z4) {
        return zztl.zzf(zzaW(this.zze, zztaVar, zzzVar, false, false), zzzVar);
    }

    public final void zzah(zzso zzsoVar, int i7, long j, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        zzsoVar.zzn(i7, j3);
        Trace.endSection();
        ((zzsy) this).zza.zze++;
        this.zzA = 0;
        if (this.zzp == null) {
            zzcc zzccVar = this.zzF;
            if (!zzccVar.equals(zzcc.zza) && !zzccVar.equals(this.zzG)) {
                this.zzG = zzccVar;
                this.zzg.zzt(zzccVar);
            }
            if (!this.zzi.zzp() || (surface = this.zzs) == null) {
                return;
            }
            this.zzg.zzq(surface);
            this.zzv = true;
        }
    }

    public final void zzai(zzso zzsoVar, int i7, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzsoVar.zzo(i7, false);
        Trace.endSection();
        ((zzsy) this).zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaj(zzhg zzhgVar) {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhgVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s7 == 60 && s8 == 1 && b8 == 4) {
                    if (b9 == 0 || b9 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzso zzsoVarZzaz = zzaz();
                        zzsoVarZzaz.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzsoVarZzaz.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzak(Exception exc) {
        zzdq.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzal(String str, zzsl zzslVar, long j, long j3) {
        this.zzg.zzk(str, j, j3);
        this.zzn = zzaT(str);
        zzsr zzsrVarZzaB = zzaB();
        zzsrVarZzaB.getClass();
        boolean z4 = false;
        if (zzen.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzsrVarZzaB.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzsrVarZzaB.zzh()) {
                if (codecProfileLevel.profile == 16384) {
                    z4 = true;
                    break;
                }
            }
        }
        this.zzo = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzam(String str) {
        this.zzg.zzl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzan(zzz zzzVar, MediaFormat mediaFormat) {
        zzso zzsoVarZzaz = zzaz();
        if (zzsoVarZzaz != null) {
            zzsoVarZzaz.zzr(this.zzw);
        }
        mediaFormat.getClass();
        boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f7 = zzzVar.zzz;
        int i7 = zzzVar.zzy;
        if (i7 == 90 || i7 == 270) {
            f7 = 1.0f / f7;
            int i8 = integer2;
            integer2 = integer;
            integer = i8;
        }
        this.zzF = new zzcc(integer, integer2, f7);
        zzabo zzaboVar = this.zzp;
        if (zzaboVar == null || !this.zzM) {
            this.zzi.zzl(zzzVar.zzx);
        } else {
            zzx zzxVarZzb = zzzVar.zzb();
            zzxVarZzb.zzai(integer);
            zzxVarZzb.zzM(integer2);
            zzxVarZzb.zzZ(f7);
            zzz zzzVarZzaj = zzxVarZzb.zzaj();
            List listZzn = this.zzr;
            if (listZzn == null) {
                listZzn = zzfwh.zzn();
            }
            zzaboVar.zzg(1, zzzVarZzaj, listZzn);
        }
        this.zzM = false;
    }

    public final void zzao(int i7, int i8) {
        zzhq zzhqVar = ((zzsy) this).zza;
        zzhqVar.zzh += i7;
        int i9 = i7 + i8;
        zzhqVar.zzg += i9;
        this.zzz += i9;
        int i10 = this.zzA + i9;
        this.zzA = i10;
        zzhqVar.zzi = Math.max(i10, zzhqVar.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzap() {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            zzaboVar.zzr();
            this.zzp.zzo(zzaw(), -this.zzK);
        } else {
            this.zzi.zzf();
        }
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaq() {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            zzaboVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzar(long j, long j3, zzso zzsoVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, zzz zzzVar) {
        zzsoVar.getClass();
        long jZzav = j7 - zzav();
        int i10 = 0;
        while (true) {
            Long l7 = (Long) this.zzl.peek();
            if (l7 == null || l7.longValue() >= j7) {
                break;
            }
            this.zzl.poll();
            i10++;
        }
        zzao(i10, 0);
        zzabo zzaboVar = this.zzp;
        boolean z8 = true;
        if (zzaboVar != null) {
            if (!z4) {
                z8 = z7;
            } else if (!z7) {
                zzai(zzsoVar, i7, jZzav);
                return true;
            }
            return zzaboVar.zzs(j7 + (-this.zzK), z8, new zzaaa(this, zzsoVar, i7, jZzav));
        }
        int iZza = this.zzi.zza(j7, j, j3, zzaw(), z7, this.zzj);
        if (iZza == 4) {
            return false;
        }
        if (z4 && !z7) {
            zzai(zzsoVar, i7, jZzav);
            return true;
        }
        if (this.zzs == null) {
            if (this.zzj.zzc() >= 0 && (this.zzj.zzc() >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION || iZza == 5)) {
                return false;
            }
            zzai(zzsoVar, i7, jZzav);
            zzaQ(this.zzj.zzc());
            return true;
        }
        if (iZza == 0) {
            zzah(zzsoVar, i7, jZzav, zzi().zzc());
            zzaQ(this.zzj.zzc());
            return true;
        }
        if (iZza == 1) {
            zzaas zzaasVar = this.zzj;
            long jZzd = zzaasVar.zzd();
            long jZzc = zzaasVar.zzc();
            if (jZzd == this.zzE) {
                zzai(zzsoVar, i7, jZzav);
            } else {
                zzah(zzsoVar, i7, jZzav, jZzd);
            }
            zzaQ(jZzc);
            this.zzE = jZzd;
            return true;
        }
        if (iZza == 2) {
            Trace.beginSection("dropVideoBuffer");
            zzsoVar.zzo(i7, false);
            Trace.endSection();
            zzao(0, 1);
            zzaQ(this.zzj.zzc());
            return true;
        }
        if (iZza != 3) {
            if (iZza == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(iZza));
        }
        zzai(zzsoVar, i7, jZzav);
        zzaQ(this.zzj.zzc());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzau(zzhg zzhgVar) {
        int i7 = zzen.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlm
    public final void zzt() {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            ((zzaal) zzaboVar).zza.zzg.zzd();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlh
    public final void zzu(int i7, Object obj) throws zzia {
        if (i7 == 1) {
            zzaZ(obj);
            return;
        }
        if (i7 == 7) {
            obj.getClass();
            zzaar zzaarVar = (zzaar) obj;
            this.zzJ = zzaarVar;
            zzabo zzaboVar = this.zzp;
            if (zzaboVar != null) {
                ((zzaal) zzaboVar).zza.zzg.zzq(zzaarVar);
                return;
            }
            return;
        }
        if (i7 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzI != iIntValue) {
                this.zzI = iIntValue;
                return;
            }
            return;
        }
        if (i7 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzw = iIntValue2;
            zzso zzsoVarZzaz = zzaz();
            if (zzsoVarZzaz != null) {
                zzsoVarZzaz.zzr(iIntValue2);
                return;
            }
            return;
        }
        if (i7 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzx = iIntValue3;
            zzabo zzaboVar2 = this.zzp;
            if (zzaboVar2 != null) {
                zzaboVar2.zzm(iIntValue3);
                return;
            } else {
                this.zzi.zzj(iIntValue3);
                return;
            }
        }
        if (i7 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.zzr = list;
            zzabo zzaboVar3 = this.zzp;
            if (zzaboVar3 != null) {
                zzaboVar3.zzp(list);
                return;
            }
            return;
        }
        if (i7 == 14) {
            obj.getClass();
            zzee zzeeVar = (zzee) obj;
            if (zzeeVar.zzb() == 0 || zzeeVar.zza() == 0) {
                return;
            }
            this.zzu = zzeeVar;
            zzabo zzaboVar4 = this.zzp;
            if (zzaboVar4 != null) {
                Surface surface = this.zzs;
                zzcv.zzb(surface);
                ((zzaal) zzaboVar4).zza.zzp(surface, zzeeVar);
                return;
            }
            return;
        }
        if (i7 != 16) {
            if (i7 != 17) {
                super.zzu(i7, obj);
                return;
            }
            Surface surface2 = this.zzs;
            zzaZ(null);
            obj.getClass();
            ((zzaae) obj).zzu(1, surface2);
            return;
        }
        obj.getClass();
        this.zzH = ((Integer) obj).intValue();
        zzso zzsoVarZzaz2 = zzaz();
        if (zzsoVarZzaz2 == null || zzen.zza < 35) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("importance", Math.max(0, -this.zzH));
        zzsoVarZzaz2.zzq(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzx() {
        this.zzG = null;
        this.zzL = -9223372036854775807L;
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            ((zzaal) zzaboVar).zza.zzg.zzh();
        } else {
            this.zzi.zzd();
        }
        this.zzv = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzm(((zzsy) this).zza);
            this.zzg.zzt(zzcc.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzy(boolean z4, boolean z7) {
        super.zzy(z4, z7);
        zzn();
        this.zzg.zzo(((zzsy) this).zza);
        if (!this.zzq) {
            if (this.zzr != null && this.zzp == null) {
                zzaak zzaakVar = new zzaak(this.zze, this.zzi);
                zzaakVar.zze(zzi());
                zzaaq zzaaqVarZzf = zzaakVar.zzf();
                zzaaqVarZzf.zzq(1);
                this.zzp = zzaaqVarZzf.zze(0);
            }
            this.zzq = true;
        }
        zzabo zzaboVar = this.zzp;
        if (zzaboVar == null) {
            this.zzi.zzk(zzi());
            this.zzi.zze(z7);
            return;
        }
        zzaar zzaarVar = this.zzJ;
        if (zzaarVar != null) {
            ((zzaal) zzaboVar).zza.zzg.zzq(zzaarVar);
        }
        if (this.zzs != null && !this.zzu.equals(zzee.zza)) {
            zzabo zzaboVar2 = this.zzp;
            ((zzaal) zzaboVar2).zza.zzp(this.zzs, this.zzu);
        }
        this.zzp.zzm(this.zzx);
        ((zzaal) this.zzp).zza.zzg.zzn(zzat());
        List list = this.zzr;
        if (list != null) {
            this.zzp.zzp(list);
        }
        ((zzaal) this.zzp).zza.zzg.zzi(z7);
        if (zzay() != null) {
            zzaaq zzaaqVar = ((zzaal) this.zzp).zza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzz(long j, boolean z4) {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            if (!z4) {
                zzaboVar.zze(true);
            }
            this.zzp.zzo(zzaw(), -this.zzK);
            this.zzM = true;
        }
        super.zzz(j, z4);
        if (this.zzp == null) {
            this.zzi.zzi();
        }
        if (z4) {
            zzabo zzaboVar2 = this.zzp;
            if (zzaboVar2 != null) {
                zzaboVar2.zzf(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzA = 0;
    }
}
