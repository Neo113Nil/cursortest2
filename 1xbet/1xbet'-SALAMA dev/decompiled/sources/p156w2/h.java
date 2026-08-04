package p156w2;

import A1.AbstractC0023i;
import A1.C0042s;
import A1.G0;
import A1.K;
import A1.L;
import A1.X;
import A1.r;
import C0.C0091j;
import D1.e;
import D1.i;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E4.M;
import R1.j;
import R1.k;
import R1.l;
import R1.m;
import R1.p;
import R1.q;
import R5.F;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.internal.w;
import io.sentry.ProfileContext;
import io.sentry.TransactionOptions;
import io.sentry.cache.f;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p018c2.W;
import p151v2.a;
import p151v2.t;
import p155w1.C1010l1;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p {

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public static final int[] f17986E1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public static boolean f17987F1;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public static boolean f17988G1;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public boolean f17989A1;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public int f17990B1;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public g f17991C1;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public L f17992D1;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final Context f17993V0;
    public final m W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final w f17994X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final long f17995Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public final int f17996Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final boolean f17997a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public C0091j f17998b1;
    public boolean c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f17999d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Surface f18000e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public PlaceholderSurface f18001f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f18002g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f18003h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f18004i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f18005j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f18006k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f18007l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public long f18008m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public long f18009n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f18010o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f18011p1;
    public int q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public long f18012r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public long f18013s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public long f18014t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f18015u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f18016v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f18017w1;
    public int x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public float f18018y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public o f18019z1;

    public h(Context context, j jVar, Handler handler, K k7) {
        super(2, jVar, 30.0f);
        this.f17995Y0 = 5000L;
        this.f17996Z0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f17993V0 = applicationContext;
        this.W0 = new m(applicationContext);
        this.f17994X0 = new w(23, handler, k7);
        this.f17997a1 = "NVIDIA".equals(t.f17161c);
        this.f18008m1 = -9223372036854775807L;
        this.f18016v1 = -1;
        this.f18017w1 = -1;
        this.f18018y1 = -1.0f;
        this.f18003h1 = 1;
        this.f17990B1 = 0;
        this.f18019z1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0157  */
    /* JADX WARN: Code duplicated, block: B:111:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0165  */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:118:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:122:0x0181  */
    /* JADX WARN: Code duplicated, block: B:123:0x0185  */
    /* JADX WARN: Code duplicated, block: B:126:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0193  */
    /* JADX WARN: Code duplicated, block: B:130:0x019d  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:135:0x01af  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:159:0x0203  */
    /* JADX WARN: Code duplicated, block: B:162:0x020d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0211  */
    /* JADX WARN: Code duplicated, block: B:166:0x021b  */
    /* JADX WARN: Code duplicated, block: B:167:0x021f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0229  */
    /* JADX WARN: Code duplicated, block: B:171:0x022d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0237  */
    /* JADX WARN: Code duplicated, block: B:175:0x023b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0245  */
    /* JADX WARN: Code duplicated, block: B:179:0x0249  */
    /* JADX WARN: Code duplicated, block: B:182:0x0253  */
    /* JADX WARN: Code duplicated, block: B:183:0x0257  */
    /* JADX WARN: Code duplicated, block: B:186:0x0261  */
    /* JADX WARN: Code duplicated, block: B:187:0x0265  */
    /* JADX WARN: Code duplicated, block: B:190:0x026f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0273  */
    /* JADX WARN: Code duplicated, block: B:194:0x027d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0281  */
    /* JADX WARN: Code duplicated, block: B:198:0x028b  */
    /* JADX WARN: Code duplicated, block: B:199:0x028f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0299  */
    /* JADX WARN: Code duplicated, block: B:203:0x029d  */
    /* JADX WARN: Code duplicated, block: B:206:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:210:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:214:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:215:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:218:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:219:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:222:0x02df  */
    /* JADX WARN: Code duplicated, block: B:223:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:226:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:227:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:230:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:231:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:234:0x0309  */
    /* JADX WARN: Code duplicated, block: B:235:0x030d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0317  */
    /* JADX WARN: Code duplicated, block: B:239:0x031b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0325  */
    /* JADX WARN: Code duplicated, block: B:243:0x0329  */
    /* JADX WARN: Code duplicated, block: B:246:0x0333  */
    /* JADX WARN: Code duplicated, block: B:247:0x0337  */
    /* JADX WARN: Code duplicated, block: B:250:0x0341  */
    /* JADX WARN: Code duplicated, block: B:251:0x0345  */
    /* JADX WARN: Code duplicated, block: B:254:0x034f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0353  */
    /* JADX WARN: Code duplicated, block: B:258:0x035d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0361  */
    /* JADX WARN: Code duplicated, block: B:262:0x036b  */
    /* JADX WARN: Code duplicated, block: B:263:0x036f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0379  */
    /* JADX WARN: Code duplicated, block: B:267:0x037d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0387  */
    /* JADX WARN: Code duplicated, block: B:271:0x038b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0395  */
    /* JADX WARN: Code duplicated, block: B:275:0x0399  */
    /* JADX WARN: Code duplicated, block: B:278:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:279:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:282:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:283:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:286:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:287:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:290:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:291:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:294:0x03db  */
    /* JADX WARN: Code duplicated, block: B:295:0x03df  */
    /* JADX WARN: Code duplicated, block: B:298:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:299:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:302:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:303:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:306:0x0405  */
    /* JADX WARN: Code duplicated, block: B:307:0x0409  */
    /* JADX WARN: Code duplicated, block: B:310:0x0413  */
    /* JADX WARN: Code duplicated, block: B:311:0x0417  */
    /* JADX WARN: Code duplicated, block: B:314:0x0421  */
    /* JADX WARN: Code duplicated, block: B:315:0x0425  */
    /* JADX WARN: Code duplicated, block: B:318:0x042f  */
    /* JADX WARN: Code duplicated, block: B:319:0x0433  */
    /* JADX WARN: Code duplicated, block: B:322:0x043d  */
    /* JADX WARN: Code duplicated, block: B:323:0x0441  */
    /* JADX WARN: Code duplicated, block: B:326:0x044b  */
    /* JADX WARN: Code duplicated, block: B:327:0x044f  */
    /* JADX WARN: Code duplicated, block: B:330:0x0459  */
    /* JADX WARN: Code duplicated, block: B:331:0x045d  */
    /* JADX WARN: Code duplicated, block: B:334:0x0467  */
    /* JADX WARN: Code duplicated, block: B:335:0x046b  */
    /* JADX WARN: Code duplicated, block: B:338:0x0475  */
    /* JADX WARN: Code duplicated, block: B:339:0x0479  */
    /* JADX WARN: Code duplicated, block: B:342:0x0483  */
    /* JADX WARN: Code duplicated, block: B:343:0x0487  */
    /* JADX WARN: Code duplicated, block: B:346:0x0491  */
    /* JADX WARN: Code duplicated, block: B:347:0x0495  */
    /* JADX WARN: Code duplicated, block: B:350:0x049f  */
    /* JADX WARN: Code duplicated, block: B:351:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:354:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:355:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:358:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:359:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:362:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:363:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:366:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:367:0x04db  */
    /* JADX WARN: Code duplicated, block: B:370:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:371:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:374:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:375:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:378:0x0501  */
    /* JADX WARN: Code duplicated, block: B:379:0x0505  */
    /* JADX WARN: Code duplicated, block: B:382:0x050f  */
    /* JADX WARN: Code duplicated, block: B:383:0x0513  */
    /* JADX WARN: Code duplicated, block: B:386:0x051d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0521  */
    /* JADX WARN: Code duplicated, block: B:390:0x052b  */
    /* JADX WARN: Code duplicated, block: B:391:0x052f  */
    /* JADX WARN: Code duplicated, block: B:394:0x0539  */
    /* JADX WARN: Code duplicated, block: B:395:0x053d  */
    /* JADX WARN: Code duplicated, block: B:398:0x0547  */
    /* JADX WARN: Code duplicated, block: B:399:0x054b  */
    /* JADX WARN: Code duplicated, block: B:402:0x0555  */
    /* JADX WARN: Code duplicated, block: B:403:0x0559  */
    /* JADX WARN: Code duplicated, block: B:406:0x0563  */
    /* JADX WARN: Code duplicated, block: B:407:0x0567  */
    /* JADX WARN: Code duplicated, block: B:410:0x0571  */
    /* JADX WARN: Code duplicated, block: B:411:0x0575  */
    /* JADX WARN: Code duplicated, block: B:414:0x057f  */
    /* JADX WARN: Code duplicated, block: B:415:0x0583  */
    /* JADX WARN: Code duplicated, block: B:418:0x058d  */
    /* JADX WARN: Code duplicated, block: B:419:0x0591  */
    /* JADX WARN: Code duplicated, block: B:422:0x059b  */
    /* JADX WARN: Code duplicated, block: B:423:0x059f  */
    /* JADX WARN: Code duplicated, block: B:426:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:427:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:430:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:431:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:434:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:435:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:438:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:439:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:442:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:443:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:446:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:447:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:450:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:451:0x0601  */
    /* JADX WARN: Code duplicated, block: B:454:0x060b  */
    /* JADX WARN: Code duplicated, block: B:455:0x060f  */
    /* JADX WARN: Code duplicated, block: B:458:0x0619  */
    /* JADX WARN: Code duplicated, block: B:459:0x061d  */
    /* JADX WARN: Code duplicated, block: B:462:0x0627  */
    /* JADX WARN: Code duplicated, block: B:463:0x062b  */
    /* JADX WARN: Code duplicated, block: B:466:0x0635  */
    /* JADX WARN: Code duplicated, block: B:467:0x0639  */
    /* JADX WARN: Code duplicated, block: B:470:0x0643  */
    /* JADX WARN: Code duplicated, block: B:471:0x0647  */
    /* JADX WARN: Code duplicated, block: B:474:0x0651  */
    /* JADX WARN: Code duplicated, block: B:475:0x0655  */
    /* JADX WARN: Code duplicated, block: B:478:0x065f  */
    /* JADX WARN: Code duplicated, block: B:479:0x0663  */
    /* JADX WARN: Code duplicated, block: B:482:0x066d  */
    /* JADX WARN: Code duplicated, block: B:483:0x0671  */
    /* JADX WARN: Code duplicated, block: B:486:0x067b  */
    /* JADX WARN: Code duplicated, block: B:487:0x067f  */
    /* JADX WARN: Code duplicated, block: B:490:0x0689  */
    /* JADX WARN: Code duplicated, block: B:491:0x068d  */
    /* JADX WARN: Code duplicated, block: B:494:0x0697  */
    /* JADX WARN: Code duplicated, block: B:495:0x069b  */
    /* JADX WARN: Code duplicated, block: B:498:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:499:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:502:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:503:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:506:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:507:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:510:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:511:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:514:0x06db  */
    /* JADX WARN: Code duplicated, block: B:517:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:518:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:521:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:522:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:525:0x0701  */
    /* JADX WARN: Code duplicated, block: B:526:0x0705  */
    /* JADX WARN: Code duplicated, block: B:529:0x070f  */
    /* JADX WARN: Code duplicated, block: B:530:0x0713  */
    /* JADX WARN: Code duplicated, block: B:533:0x071d  */
    /* JADX WARN: Code duplicated, block: B:534:0x0721  */
    /* JADX WARN: Code duplicated, block: B:537:0x072b  */
    /* JADX WARN: Code duplicated, block: B:538:0x072f  */
    /* JADX WARN: Code duplicated, block: B:541:0x0739  */
    /* JADX WARN: Code duplicated, block: B:542:0x073d  */
    /* JADX WARN: Code duplicated, block: B:545:0x0747  */
    /* JADX WARN: Code duplicated, block: B:546:0x074b  */
    /* JADX WARN: Code duplicated, block: B:549:0x0755  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:550:0x0759  */
    /* JADX WARN: Code duplicated, block: B:553:0x0763  */
    /* JADX WARN: Code duplicated, block: B:554:0x0767  */
    /* JADX WARN: Code duplicated, block: B:557:0x0771  */
    /* JADX WARN: Code duplicated, block: B:558:0x0775  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[Catch: all -> 0x086d, TRY_LEAVE, TryCatch #0 {all -> 0x086d, blocks: (B:7:0x001b, B:9:0x001f, B:11:0x0023, B:635:0x0868, B:51:0x0092, B:55:0x009f, B:619:0x0839, B:638:0x086f), top: B:643:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:561:0x077f  */
    /* JADX WARN: Code duplicated, block: B:562:0x0783  */
    /* JADX WARN: Code duplicated, block: B:565:0x078d  */
    /* JADX WARN: Code duplicated, block: B:566:0x0791  */
    /* JADX WARN: Code duplicated, block: B:569:0x079b  */
    /* JADX WARN: Code duplicated, block: B:570:0x079f  */
    /* JADX WARN: Code duplicated, block: B:573:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:574:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:577:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:578:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:581:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:582:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:585:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:586:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:589:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:590:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:593:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:594:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:597:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:598:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:601:0x0805  */
    /* JADX WARN: Code duplicated, block: B:602:0x0807  */
    /* JADX WARN: Code duplicated, block: B:605:0x0811  */
    /* JADX WARN: Code duplicated, block: B:606:0x0813  */
    /* JADX WARN: Code duplicated, block: B:609:0x081d  */
    /* JADX WARN: Code duplicated, block: B:610:0x081f  */
    /* JADX WARN: Code duplicated, block: B:613:0x0829  */
    /* JADX WARN: Code duplicated, block: B:614:0x082b  */
    /* JADX WARN: Code duplicated, block: B:617:0x0835  */
    /* JADX WARN: Code duplicated, block: B:619:0x0839 A[Catch: all -> 0x086d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x086d, blocks: (B:7:0x001b, B:9:0x001f, B:11:0x0023, B:635:0x0868, B:51:0x0092, B:55:0x009f, B:619:0x0839, B:638:0x086f), top: B:643:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:622:0x0845  */
    /* JADX WARN: Code duplicated, block: B:623:0x0847  */
    /* JADX WARN: Code duplicated, block: B:626:0x0850  */
    /* JADX WARN: Code duplicated, block: B:629:0x0859  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:630:0x085b  */
    /* JADX WARN: Code duplicated, block: B:633:0x0864  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
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
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:91:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static boolean r0(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p156w2.h.r0(java.lang.String):boolean");
    }

    public static int s0(m mVar, X x4) {
        int i7;
        int iG;
        int iIntValue;
        int i8 = 4;
        byte b7 = 1;
        int i9 = x4.f288H;
        if (i9 == -1 || (i7 = x4.f289I) == -1) {
            return -1;
        }
        String str = x4.f283C;
        if ("video/dolby-vision".equals(str)) {
            Pair pairD = R1.w.d(x4);
            str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                b7 = !str.equals("video/3gpp") ? (byte) -1 : (byte) 0;
                break;
            case -1662735862:
                if (!str.equals("video/av01")) {
                    b7 = -1;
                }
                break;
            case -1662541442:
                b7 = !str.equals("video/hevc") ? (byte) -1 : (byte) 2;
                break;
            case 1187890754:
                b7 = !str.equals("video/mp4v-es") ? (byte) -1 : (byte) 3;
                break;
            case 1331836730:
                b7 = !str.equals("video/avc") ? (byte) -1 : (byte) 4;
                break;
            case 1599127256:
                b7 = !str.equals("video/x-vnd.on2.vp8") ? (byte) -1 : (byte) 5;
                break;
            case 1599127257:
                b7 = !str.equals("video/x-vnd.on2.vp9") ? (byte) -1 : (byte) 6;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
            case 1:
            case 3:
            case 5:
                iG = i9 * i7;
                i8 = 2;
                return (iG * 3) / (i8 * 2);
            case 2:
            case 6:
                iG = i9 * i7;
                return (iG * 3) / (i8 * 2);
            case 4:
                String str2 = t.f17162d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(t.f17161c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mVar.f5930f)))) {
                    return -1;
                }
                iG = t.g(i7, 16) * t.g(i9, 16) * 256;
                i8 = 2;
                return (iG * 3) / (i8 * 2);
            default:
                return -1;
        }
    }

    public static AbstractC0167z t0(q qVar, X x4, boolean z4, boolean z7) {
        String str = x4.f283C;
        if (str == null) {
            C0165x c0165x = AbstractC0167z.f2083b;
            return E3.L.f2000e;
        }
        qVar.getClass();
        List listE = R1.w.e(str, z4, z7);
        String strB = R1.w.b(x4);
        if (strB == null) {
            return AbstractC0167z.E(listE);
        }
        List listE2 = R1.w.e(strB, z4, z7);
        C0165x c0165x2 = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        c0164w.c(listE);
        c0164w.c(listE2);
        return c0164w.d();
    }

    public static int u0(m mVar, X x4) {
        if (x4.f284D == -1) {
            return s0(mVar, x4);
        }
        List list = x4.f285E;
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += ((byte[]) list.get(i7)).length;
        }
        return x4.f284D + length;
    }

    public final boolean A0(m mVar) {
        return t.f17159a >= 23 && !this.f17989A1 && !r0(mVar.f5925a) && (!mVar.f5930f || PlaceholderSurface.b(this.f17993V0));
    }

    public final void B0(k kVar, int i7) {
        a.c("skipVideoBuffer");
        kVar.w(i7, false);
        a.m();
        this.f5968Q0.f1690f++;
    }

    @Override // R1.p
    public final i C(m mVar, X x4, X x7) {
        i iVarB = mVar.b(x4, x7);
        C0091j c0091j = this.f17998b1;
        int i7 = c0091j.f1289a;
        int i8 = iVarB.f1706e;
        if (x7.f288H > i7 || x7.f289I > c0091j.f1290b) {
            i8 |= 256;
        }
        if (u0(mVar, x7) > this.f17998b1.f1291c) {
            i8 |= 64;
        }
        int i9 = i8;
        return new i(mVar.f5925a, x4, x7, i9 != 0 ? 0 : iVarB.f1705d, i9);
    }

    public final void C0(int i7, int i8) {
        e eVar = this.f5968Q0;
        eVar.f1692h += i7;
        int i9 = i7 + i8;
        eVar.f1691g += i9;
        this.f18010o1 += i9;
        int i10 = this.f18011p1 + i9;
        this.f18011p1 = i10;
        eVar.f1693i = Math.max(i10, eVar.f1693i);
        int i11 = this.f17996Z0;
        if (i11 <= 0 || this.f18010o1 < i11) {
            return;
        }
        v0();
    }

    @Override // R1.p
    public final l D(IllegalStateException illegalStateException, m mVar) {
        Surface surface = this.f18000e1;
        f fVar = new f(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return fVar;
    }

    public final void D0(long j) {
        e eVar = this.f5968Q0;
        eVar.f1694k += j;
        eVar.f1695l++;
        this.f18014t1 += j;
        this.f18015u1++;
    }

    @Override // R1.p
    public final boolean L() {
        return this.f17989A1 && t.f17159a < 23;
    }

    @Override // R1.p
    public final float M(float f7, X[] xArr) {
        float fMax = -1.0f;
        for (X x4 : xArr) {
            float f8 = x4.f290J;
            if (f8 != -1.0f) {
                fMax = Math.max(fMax, f8);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f7;
    }

    @Override // R1.p
    public final ArrayList N(q qVar, X x4, boolean z4) {
        AbstractC0167z abstractC0167zT0 = t0(qVar, x4, z4, this.f17989A1);
        Pattern pattern = R1.w.f6011a;
        ArrayList arrayList = new ArrayList(abstractC0167zT0);
        Collections.sort(arrayList, new M(new C0042s(x4, 27), 3));
        return arrayList;
    }

    @Override // R1.p
    public final R1.i P(m mVar, X x4, MediaCrypto mediaCrypto, float f7) {
        int i7;
        int i8;
        C0091j c0091j;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        byte b7;
        boolean z4;
        Pair pairD;
        int iS0;
        PlaceholderSurface placeholderSurface = this.f18001f1;
        if (placeholderSurface != null && placeholderSurface.f10703a != mVar.f5930f) {
            if (this.f18000e1 == placeholderSurface) {
                this.f18000e1 = null;
            }
            placeholderSurface.release();
            this.f18001f1 = null;
        }
        String str = mVar.f5927c;
        X[] xArr = this.f382y;
        xArr.getClass();
        int iMax = x4.f288H;
        int iU0 = u0(mVar, x4);
        int length = xArr.length;
        float f8 = x4.f290J;
        int i9 = x4.f288H;
        b bVar = x4.f295O;
        int i10 = x4.f289I;
        if (length == 1) {
            if (iU0 != -1 && (iS0 = s0(mVar, x4)) != -1) {
                iU0 = Math.min((int) (iU0 * 1.5f), iS0);
            }
            c0091j = new C0091j(iMax, i10, iU0);
            i7 = i9;
            bVar = bVar;
            i8 = i10;
        } else {
            int iMax2 = i10;
            int i11 = 0;
            boolean z7 = false;
            for (int length2 = xArr.length; i11 < length2; length2 = length2) {
                X x7 = xArr[i11];
                X[] xArr2 = xArr;
                if (bVar != null && x7.f295O == null) {
                    Format$Builder format$BuilderA = x7.a();
                    format$BuilderA.f10549w = bVar;
                    x7 = new X(format$BuilderA);
                }
                if (mVar.b(x4, x7).f1705d != 0) {
                    int i12 = x7.f289I;
                    int i13 = x7.f288H;
                    b7 = -1;
                    z7 |= i13 == -1 || i12 == -1;
                    iMax = Math.max(iMax, i13);
                    iMax2 = Math.max(iMax2, i12);
                    iU0 = Math.max(iU0, u0(mVar, x7));
                } else {
                    b7 = -1;
                }
                i11++;
                xArr = xArr2;
            }
            if (z7) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z8 = i10 > i9;
                int i14 = z8 ? i10 : i9;
                int i15 = z8 ? i9 : i10;
                float f9 = i15 / i14;
                int[] iArr = f17986E1;
                i7 = i9;
                i8 = i10;
                int i16 = 0;
                while (true) {
                    if (i16 < 9) {
                        int i17 = iArr[i16];
                        int[] iArr2 = iArr;
                        int i18 = (int) (i17 * f9);
                        if (i17 > i14 && i18 > i15) {
                            int i19 = i14;
                            int i20 = i15;
                            if (t.f17159a < 21) {
                                f9 = f9;
                                try {
                                    int iG = t.g(i17, 16) * 16;
                                    int iG2 = t.g(i18, 16) * 16;
                                    if (iG * iG2 <= R1.w.i()) {
                                        int i21 = z8 ? iG2 : iG;
                                        if (!z8) {
                                            iG = iG2;
                                        }
                                        point = new Point(i21, iG);
                                        break;
                                    }
                                    i16++;
                                    iArr = iArr2;
                                    i14 = i19;
                                    i15 = i20;
                                    f9 = f9;
                                } catch (R1.t unused) {
                                    point = null;
                                    break;
                                }
                            } else {
                                int i22 = z8 ? i18 : i17;
                                if (!z8) {
                                    i17 = i18;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f5928d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(t.g(i22, widthAlignment) * widthAlignment, t.g(i17, heightAlignment) * heightAlignment);
                                }
                                Point point3 = point2;
                                if (mVar.e(point2.x, point2.y, f8)) {
                                    point = point3;
                                    break;
                                }
                                i16++;
                                iArr = iArr2;
                                i14 = i19;
                                i15 = i20;
                                f9 = f9;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    Format$Builder format$BuilderA2 = x4.a();
                    format$BuilderA2.f10542p = iMax;
                    format$BuilderA2.f10543q = iMax2;
                    iU0 = Math.max(iU0, s0(mVar, new X(format$BuilderA2)));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i7 = i9;
                bVar = bVar;
                i8 = i10;
            }
            c0091j = new C0091j(iMax, iMax2, iU0);
        }
        this.f17998b1 = c0091j;
        int i23 = this.f17989A1 ? this.f17990B1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i7);
        mediaFormat.setInteger("height", i8);
        a.E(mediaFormat, x4.f285E);
        if (f8 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f8);
        }
        a.w(mediaFormat, "rotation-degrees", x4.f291K);
        if (bVar != null) {
            b bVar2 = bVar;
            a.w(mediaFormat, "color-transfer", bVar2.f17964c);
            a.w(mediaFormat, "color-standard", bVar2.f17962a);
            a.w(mediaFormat, "color-range", bVar2.f17963b);
            byte[] bArr = bVar2.f17965d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(x4.f283C) && (pairD = R1.w.d(x4)) != null) {
            a.w(mediaFormat, ProfileContext.TYPE, ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0091j.f1289a);
        mediaFormat.setInteger("max-height", c0091j.f1290b);
        a.w(mediaFormat, "max-input-size", c0091j.f1291c);
        if (t.f17159a >= 23) {
            mediaFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (this.f17997a1) {
            z4 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z4 = true;
        }
        if (i23 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z4);
            mediaFormat.setInteger("audio-session-id", i23);
        }
        if (this.f18000e1 == null) {
            if (!A0(mVar)) {
                throw new IllegalStateException();
            }
            if (this.f18001f1 == null) {
                this.f18001f1 = PlaceholderSurface.c(this.f17993V0, mVar.f5930f);
            }
            this.f18000e1 = this.f18001f1;
        }
        return new R1.i(mVar, mediaFormat, x4, this.f18000e1, mediaCrypto);
    }

    @Override // R1.p
    public final void Q(D1.h hVar) {
        if (this.f17999d1) {
            ByteBuffer byteBuffer = hVar.f1700x;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s7 == 60 && s8 == 1 && b8 == 4 && b9 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    k kVar = this.f5980Z;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    kVar.l(bundle);
                }
            }
        }
    }

    @Override // R1.p
    public final void U(Exception exc) {
        a.l("MediaCodecVideoRenderer", "Video codec error", exc);
        w wVar = this.f17994X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, exc, 2));
        }
    }

    @Override // R1.p
    public final void V(long j, long j3, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        w wVar = this.f17994X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, str, j, j3));
        }
        this.c1 = r0(str);
        m mVar = this.f5986g0;
        mVar.getClass();
        boolean z4 = false;
        if (t.f17159a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f5926b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f5928d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f17999d1 = z4;
        if (t.f17159a < 23 || !this.f17989A1) {
            return;
        }
        k kVar = this.f5980Z;
        kVar.getClass();
        this.f17991C1 = new g(this, kVar);
    }

    @Override // R1.p
    public final void W(String str) {
        w wVar = this.f17994X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, str, 1));
        }
    }

    @Override // R1.p
    public final i X(V0 v6) {
        i iVarX = super.X(v6);
        X x4 = (X) v6.f17569c;
        w wVar = this.f17994X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, x4, iVarX));
        }
        return iVarX;
    }

    @Override // R1.p
    public final void Y(X x4, MediaFormat mediaFormat) {
        k kVar = this.f5980Z;
        if (kVar != null) {
            kVar.z(this.f18003h1);
        }
        if (this.f17989A1) {
            this.f18016v1 = x4.f288H;
            this.f18017w1 = x4.f289I;
        } else {
            mediaFormat.getClass();
            boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f18016v1 = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f18017w1 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f7 = x4.f292L;
        this.f18018y1 = f7;
        int i7 = t.f17159a;
        int i8 = x4.f291K;
        if (i7 < 21) {
            this.x1 = i8;
        } else if (i8 == 90 || i8 == 270) {
            int i9 = this.f18016v1;
            this.f18016v1 = this.f18017w1;
            this.f18017w1 = i9;
            this.f18018y1 = 1.0f / f7;
        }
        float f8 = x4.f290J;
        m mVar = this.W0;
        mVar.f18035f = f8;
        d dVar = mVar.f18030a;
        dVar.f17975a.c();
        dVar.f17976b.c();
        dVar.f17977c = false;
        dVar.f17978d = -9223372036854775807L;
        dVar.f17979e = 0;
        mVar.b();
    }

    @Override // R1.p
    public final void Z(long j) {
        super.Z(j);
        if (this.f17989A1) {
            return;
        }
        this.q1--;
    }

    @Override // R1.p
    public final void a0() {
        q0();
    }

    @Override // R1.p
    public final void b0(D1.h hVar) {
        boolean z4 = this.f17989A1;
        if (!z4) {
            this.q1++;
        }
        if (t.f17159a >= 23 || !z4) {
            return;
        }
        long j = hVar.f1699f;
        p0(j);
        x0();
        this.f5968Q0.f1689e++;
        w0();
        Z(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [R1.k] */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.exoplayer2.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // A1.AbstractC0023i, A1.C0
    public final void c(int i7, Object obj) throws r {
        ?? C3;
        Handler handler;
        Handler handler2;
        Surface surface;
        int iIntValue;
        m mVar = this.W0;
        if (i7 != 1) {
            if (i7 == 7) {
                this.f17992D1 = (L) obj;
                return;
            }
            if (i7 == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.f17990B1 != iIntValue2) {
                    this.f17990B1 = iIntValue2;
                    if (this.f17989A1) {
                        f0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 != 4) {
                if (i7 == 5 && mVar.j != (iIntValue = ((Integer) obj).intValue())) {
                    mVar.j = iIntValue;
                    mVar.c(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.f18003h1 = iIntValue3;
            k kVar = this.f5980Z;
            if (kVar != null) {
                kVar.z(iIntValue3);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            C3 = 0;
        }
        if (C3 == 0) {
            PlaceholderSurface placeholderSurface = this.f18001f1;
            if (placeholderSurface != null) {
                C3 = surface;
                C3 = placeholderSurface;
            } else {
                m mVar2 = this.f5986g0;
                if (mVar2 != null && A0(mVar2)) {
                    C3 = surface;
                    C3 = PlaceholderSurface.c(this.f17993V0, mVar2.f5930f);
                    this.f18001f1 = C3;
                }
            }
        }
        C3 = surface;
        C3 = surface;
        C3 = surface;
        Surface surface2 = this.f18000e1;
        w wVar = this.f17994X0;
        if (surface2 == C3) {
            if (C3 == 0 || C3 == this.f18001f1) {
                return;
            }
            o oVar = this.f18019z1;
            if (oVar != null && (handler = (Handler) wVar.f11335b) != null) {
                handler.post(new f(9, wVar, oVar));
            }
            if (this.f18002g1) {
                Surface surface3 = this.f18000e1;
                Handler handler3 = (Handler) wVar.f11335b;
                if (handler3 != null) {
                    handler3.post(new io.sentry.android.core.m(wVar, surface3, SystemClock.elapsedRealtime(), 2));
                    return;
                }
                return;
            }
            return;
        }
        this.f18000e1 = C3;
        mVar.getClass();
        ?? r10 = C3 instanceof PlaceholderSurface ? 0 : C3;
        if (mVar.f18034e != r10) {
            mVar.a();
            mVar.f18034e = r10;
            mVar.c(true);
        }
        this.f18002g1 = false;
        int i8 = this.f380f;
        ?? r7 = this.f5980Z;
        if (r7 != 0) {
            if (t.f17159a < 23 || C3 == 0 || this.c1) {
                f0();
                S();
            } else {
                r7.E(C3);
            }
        }
        if (C3 == 0 || C3 == this.f18001f1) {
            this.f18019z1 = null;
            q0();
            return;
        }
        o oVar2 = this.f18019z1;
        if (oVar2 != null && (handler2 = (Handler) wVar.f11335b) != null) {
            handler2.post(new f(9, wVar, oVar2));
        }
        q0();
        if (i8 == 2) {
            long j = this.f17995Y0;
            this.f18008m1 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    @Override // R1.p
    public final boolean d0(long j, long j3, k kVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, X x4) throws r {
        boolean z8;
        long j8;
        boolean z9;
        boolean z10;
        long j9;
        long j10;
        boolean z11;
        kVar.getClass();
        if (this.f18007l1 == -9223372036854775807L) {
            this.f18007l1 = j;
        }
        if (j7 != this.f18012r1) {
            m mVar = this.W0;
            long j11 = mVar.f18042n;
            if (j11 != -1) {
                mVar.f18044p = j11;
                mVar.f18045q = mVar.f18043o;
            }
            mVar.f18041m++;
            long j12 = j7 * 1000;
            d dVar = mVar.f18030a;
            dVar.f17975a.b(j12);
            if (dVar.f17975a.a()) {
                dVar.f17977c = false;
            } else if (dVar.f17978d != -9223372036854775807L) {
                if (dVar.f17977c) {
                    c cVar = dVar.f17976b;
                    long j13 = cVar.f17970d;
                    if (j13 == 0) {
                        z11 = false;
                    } else {
                        z11 = cVar.f17973g[(int) ((j13 - 1) % 15)];
                    }
                    if (z11) {
                        dVar.f17976b.c();
                        dVar.f17976b.b(dVar.f17978d);
                    }
                } else {
                    dVar.f17976b.c();
                    dVar.f17976b.b(dVar.f17978d);
                }
                dVar.f17977c = true;
                dVar.f17976b.b(j12);
            }
            if (dVar.f17977c && dVar.f17976b.a()) {
                c cVar2 = dVar.f17975a;
                dVar.f17975a = dVar.f17976b;
                dVar.f17976b = cVar2;
                dVar.f17977c = false;
            }
            dVar.f17978d = j12;
            dVar.f17979e = dVar.f17975a.a() ? 0 : dVar.f17979e + 1;
            mVar.b();
            this.f18012r1 = j7;
        }
        long j14 = this.f5972S0;
        long j15 = j7 - j14;
        if (z4 && !z7) {
            B0(kVar, i7);
            return true;
        }
        double d7 = this.f5978X;
        boolean z12 = this.f380f == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j16 = (long) ((j7 - j) / d7);
        if (z12) {
            j16 -= jElapsedRealtime - j3;
        }
        if (this.f18000e1 == this.f18001f1) {
            if (!(j16 < -30000)) {
                return false;
            }
            B0(kVar, i7);
            D0(j16);
            return true;
        }
        long j17 = jElapsedRealtime - this.f18013s1;
        boolean z13 = this.f18006k1 ? !this.f18004i1 : z12 || this.f18005j1;
        if (this.f18008m1 != -9223372036854775807L || j < j14) {
            z8 = false;
        } else {
            if (!z13) {
                if (z12) {
                    if (((j16 > (-30000L) ? 1 : (j16 == (-30000L) ? 0 : -1)) < 0) && j17 > 100000) {
                    }
                }
                z8 = false;
            }
            z8 = true;
        }
        if (z8) {
            long jNanoTime = System.nanoTime();
            L l7 = this.f17992D1;
            if (l7 != null) {
                l7.d(j15, jNanoTime);
            }
            if (t.f17159a >= 21) {
                z0(kVar, i7, jNanoTime);
            } else {
                y0(kVar, i7);
            }
            D0(j16);
            return true;
        }
        if (z12 && j != this.f18007l1) {
            long jNanoTime2 = System.nanoTime();
            long j18 = (j16 * 1000) + jNanoTime2;
            m mVar2 = this.W0;
            if (mVar2.f18044p == -1 || !mVar2.f18030a.f17975a.a()) {
                j8 = j15;
            } else {
                d dVar2 = mVar2.f18030a;
                if (dVar2.f17975a.a()) {
                    c cVar3 = dVar2.f17975a;
                    long j19 = cVar3.f17971e;
                    j10 = j19 == 0 ? 0L : cVar3.f17972f / j19;
                } else {
                    j10 = -9223372036854775807L;
                }
                j8 = j15;
                long j20 = mVar2.f18045q + ((long) (((mVar2.f18041m - mVar2.f18044p) * j10) / mVar2.f18038i));
                if (Math.abs(j18 - j20) <= 20000000) {
                    j18 = j20;
                } else {
                    mVar2.f18041m = 0L;
                    mVar2.f18044p = -1L;
                    mVar2.f18042n = -1L;
                }
            }
            mVar2.f18042n = mVar2.f18041m;
            mVar2.f18043o = j18;
            l lVar = mVar2.f18032c;
            if (lVar != null && mVar2.f18039k != -9223372036854775807L) {
                long j21 = lVar.f18026a;
                if (j21 != -9223372036854775807L) {
                    long j22 = mVar2.f18039k;
                    long j23 = (((j18 - j21) / j22) * j22) + j21;
                    if (j18 <= j23) {
                        j9 = j23 - j22;
                    } else {
                        j9 = j23;
                        j23 = j22 + j23;
                    }
                    if (j23 - j18 >= j18 - j9) {
                        j23 = j9;
                    }
                    j18 = j23 - mVar2.f18040l;
                }
            }
            long j24 = (j18 - jNanoTime2) / 1000;
            boolean z14 = this.f18008m1 != -9223372036854775807L;
            if (j24 < -500000 && !z7) {
                W w7 = this.f381x;
                w7.getClass();
                int iD = w7.d(j - this.f383z);
                if (iD == 0) {
                    z10 = false;
                } else {
                    if (z14) {
                        e eVar = this.f5968Q0;
                        eVar.f1688d += iD;
                        eVar.f1690f += this.q1;
                    } else {
                        this.f5968Q0.j++;
                        C0(iD, this.q1);
                    }
                    if (J()) {
                        S();
                    }
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
            }
            if (((j24 > (-30000L) ? 1 : (j24 == (-30000L) ? 0 : -1)) < 0) && !z7) {
                if (z14) {
                    B0(kVar, i7);
                    z9 = true;
                } else {
                    a.c("dropVideoBuffer");
                    kVar.w(i7, false);
                    a.m();
                    z9 = true;
                    C0(0, 1);
                }
                D0(j24);
                return z9;
            }
            if (t.f17159a < 21) {
                long j25 = j8;
                if (j24 < TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
                    if (j24 > 11000) {
                        try {
                            Thread.sleep((j24 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    L l8 = this.f17992D1;
                    if (l8 != null) {
                        l8.d(j25, j18);
                    }
                    y0(kVar, i7);
                    D0(j24);
                    return true;
                }
            } else if (j24 < 50000) {
                L l9 = this.f17992D1;
                if (l9 != null) {
                    l9.d(j8, j18);
                }
                z0(kVar, i7, j18);
                D0(j24);
                return true;
            }
        }
        return false;
    }

    @Override // R1.p
    public final void h0() {
        super.h0();
        this.q1 = 0;
    }

    @Override // A1.AbstractC0023i
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // R1.p
    public final boolean k0(m mVar) {
        return this.f18000e1 != null || A0(mVar);
    }

    @Override // R1.p, A1.AbstractC0023i
    public final boolean m() {
        PlaceholderSurface placeholderSurface;
        if (super.m() && (this.f18004i1 || (((placeholderSurface = this.f18001f1) != null && this.f18000e1 == placeholderSurface) || this.f5980Z == null || this.f17989A1))) {
            this.f18008m1 = -9223372036854775807L;
            return true;
        }
        if (this.f18008m1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f18008m1) {
            return true;
        }
        this.f18008m1 = -9223372036854775807L;
        return false;
    }

    @Override // R1.p
    public final int m0(q qVar, X x4) {
        boolean z4;
        int i7 = 0;
        if (!p151v2.i.j(x4.f283C)) {
            return AbstractC0023i.e(0, 0, 0);
        }
        boolean z7 = x4.f286F != null;
        AbstractC0167z abstractC0167zT0 = t0(qVar, x4, z7, false);
        if (z7 && abstractC0167zT0.isEmpty()) {
            abstractC0167zT0 = t0(qVar, x4, false, false);
        }
        if (abstractC0167zT0.isEmpty()) {
            return AbstractC0023i.e(1, 0, 0);
        }
        int i8 = x4.f302V;
        if (i8 != 0 && i8 != 2) {
            return AbstractC0023i.e(2, 0, 0);
        }
        m mVar = (m) abstractC0167zT0.get(0);
        boolean zC = mVar.c(x4);
        if (!zC) {
            int i9 = 1;
            while (true) {
                if (i9 >= abstractC0167zT0.size()) {
                    z4 = true;
                    break;
                }
                m mVar2 = (m) abstractC0167zT0.get(i9);
                if (mVar2.c(x4)) {
                    zC = true;
                    z4 = false;
                    mVar = mVar2;
                    break;
                }
                i9++;
            }
        } else {
            z4 = true;
            break;
        }
        int i10 = zC ? 4 : 3;
        int i11 = mVar.d(x4) ? 16 : 8;
        int i12 = mVar.f5931g ? 64 : 0;
        int i13 = z4 ? 128 : 0;
        if (zC) {
            AbstractC0167z abstractC0167zT1 = t0(qVar, x4, z7, true);
            if (!abstractC0167zT1.isEmpty()) {
                Pattern pattern = R1.w.f6011a;
                ArrayList arrayList = new ArrayList(abstractC0167zT1);
                Collections.sort(arrayList, new M(new C0042s(x4, 27), 3));
                m mVar3 = (m) arrayList.get(0);
                if (mVar3.c(x4) && mVar3.d(x4)) {
                    i7 = 32;
                }
            }
        }
        return i10 | i11 | i7 | i12 | i13;
    }

    @Override // A1.AbstractC0023i
    public final void n() {
        e eVar;
        w wVar = this.f17994X0;
        this.f18019z1 = null;
        q0();
        this.f18002g1 = false;
        this.f17991C1 = null;
        try {
            this.f5967Q = null;
            this.f5970R0 = -9223372036854775807L;
            this.f5972S0 = -9223372036854775807L;
            this.f5974T0 = 0;
            J();
            eVar = this.f5968Q0;
            wVar.getClass();
            synchronized (eVar) {
            }
        } finally {
            eVar = this.f5968Q0;
            wVar.getClass();
            synchronized (eVar) {
                Handler handler = (Handler) wVar.f11335b;
                if (handler != null) {
                    handler.post(new f(10, wVar, eVar));
                }
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final void o(boolean z4, boolean z7) {
        this.f5968Q0 = new e();
        G0 g3 = this.f377c;
        g3.getClass();
        boolean z8 = g3.f97a;
        a.h((z8 && this.f17990B1 == 0) ? false : true);
        if (this.f17989A1 != z8) {
            this.f17989A1 = z8;
            f0();
        }
        e eVar = this.f5968Q0;
        w wVar = this.f17994X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, eVar, 4));
        }
        this.f18005j1 = z7;
        this.f18006k1 = false;
    }

    @Override // R1.p, A1.AbstractC0023i
    public final void p(long j, boolean z4) {
        super.p(j, z4);
        q0();
        m mVar = this.W0;
        mVar.f18041m = 0L;
        mVar.f18044p = -1L;
        mVar.f18042n = -1L;
        this.f18012r1 = -9223372036854775807L;
        this.f18007l1 = -9223372036854775807L;
        this.f18011p1 = 0;
        if (!z4) {
            this.f18008m1 = -9223372036854775807L;
        } else {
            long j3 = this.f17995Y0;
            this.f18008m1 = j3 > 0 ? SystemClock.elapsedRealtime() + j3 : -9223372036854775807L;
        }
    }

    @Override // A1.AbstractC0023i
    public final void q() {
        try {
            try {
                E();
                f0();
                C1010l1 c1010l1 = this.f5973T;
                if (c1010l1 != null) {
                    c1010l1.F(null);
                }
                this.f5973T = null;
                PlaceholderSurface placeholderSurface = this.f18001f1;
                if (placeholderSurface != null) {
                    if (this.f18000e1 == placeholderSurface) {
                        this.f18000e1 = null;
                    }
                    placeholderSurface.release();
                    this.f18001f1 = null;
                }
            } catch (Throwable th) {
                C1010l1 c1010l2 = this.f5973T;
                if (c1010l2 != null) {
                    c1010l2.F(null);
                }
                this.f5973T = null;
                throw th;
            }
        } catch (Throwable th2) {
            PlaceholderSurface placeholderSurface2 = this.f18001f1;
            if (placeholderSurface2 != null) {
                if (this.f18000e1 == placeholderSurface2) {
                    this.f18000e1 = null;
                }
                placeholderSurface2.release();
                this.f18001f1 = null;
            }
            throw th2;
        }
    }

    public final void q0() {
        k kVar;
        this.f18004i1 = false;
        if (t.f17159a < 23 || !this.f17989A1 || (kVar = this.f5980Z) == null) {
            return;
        }
        this.f17991C1 = new g(this, kVar);
    }

    @Override // A1.AbstractC0023i
    public final void r() {
        this.f18010o1 = 0;
        this.f18009n1 = SystemClock.elapsedRealtime();
        this.f18013s1 = SystemClock.elapsedRealtime() * 1000;
        this.f18014t1 = 0L;
        this.f18015u1 = 0;
        m mVar = this.W0;
        mVar.f18033d = true;
        mVar.f18041m = 0L;
        mVar.f18044p = -1L;
        mVar.f18042n = -1L;
        k kVar = mVar.f18031b;
        if (kVar != null) {
            l lVar = mVar.f18032c;
            lVar.getClass();
            lVar.f18027b.sendEmptyMessage(1);
            kVar.h(new F(mVar, 19));
        }
        mVar.c(false);
    }

    @Override // A1.AbstractC0023i
    public final void s() {
        this.f18008m1 = -9223372036854775807L;
        v0();
        int i7 = this.f18015u1;
        if (i7 != 0) {
            long j = this.f18014t1;
            w wVar = this.f17994X0;
            Handler handler = (Handler) wVar.f11335b;
            if (handler != null) {
                handler.post(new n(wVar, j, i7));
            }
            this.f18014t1 = 0L;
            this.f18015u1 = 0;
        }
        m mVar = this.W0;
        mVar.f18033d = false;
        k kVar = mVar.f18031b;
        if (kVar != null) {
            kVar.a();
            l lVar = mVar.f18032c;
            lVar.getClass();
            lVar.f18027b.sendEmptyMessage(2);
        }
        mVar.a();
    }

    public final void v0() {
        if (this.f18010o1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f18009n1;
            int i7 = this.f18010o1;
            w wVar = this.f17994X0;
            Handler handler = (Handler) wVar.f11335b;
            if (handler != null) {
                handler.post(new n(wVar, i7, j));
            }
            this.f18010o1 = 0;
            this.f18009n1 = jElapsedRealtime;
        }
    }

    public final void w0() {
        this.f18006k1 = true;
        if (this.f18004i1) {
            return;
        }
        this.f18004i1 = true;
        Surface surface = this.f18000e1;
        w wVar = this.f17994X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new io.sentry.android.core.m(wVar, surface, SystemClock.elapsedRealtime(), 2));
        }
        this.f18002g1 = true;
    }

    public final void x0() {
        int i7 = this.f18016v1;
        if (i7 == -1 && this.f18017w1 == -1) {
            return;
        }
        o oVar = this.f18019z1;
        if (oVar != null && oVar.f18048a == i7 && oVar.f18049b == this.f18017w1 && oVar.f18050c == this.x1 && oVar.f18051d == this.f18018y1) {
            return;
        }
        o oVar2 = new o(i7, this.f18017w1, this.x1, this.f18018y1);
        this.f18019z1 = oVar2;
        w wVar = this.f17994X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new f(9, wVar, oVar2));
        }
    }

    @Override // R1.p, A1.AbstractC0023i
    public final void y(float f7, float f8) throws r {
        super.y(f7, f8);
        m mVar = this.W0;
        mVar.f18038i = f7;
        mVar.f18041m = 0L;
        mVar.f18044p = -1L;
        mVar.f18042n = -1L;
        mVar.c(false);
    }

    public final void y0(k kVar, int i7) {
        x0();
        a.c("releaseOutputBuffer");
        kVar.w(i7, true);
        a.m();
        this.f18013s1 = SystemClock.elapsedRealtime() * 1000;
        this.f5968Q0.f1689e++;
        this.f18011p1 = 0;
        w0();
    }

    public final void z0(k kVar, int i7, long j) {
        x0();
        a.c("releaseOutputBuffer");
        kVar.n(i7, j);
        a.m();
        this.f18013s1 = SystemClock.elapsedRealtime() * 1000;
        this.f5968Q0.f1689e++;
        this.f18011p1 = 0;
        w0();
    }
}
