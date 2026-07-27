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
import androidx.compose.material.MenuKt;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.TsExtractor;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.common.Scopes;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.C4761z5;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzadn extends zzvz implements zzaec {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private long zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private zznl zzG;
    private long zzH;
    private boolean zzI;
    private long zzJ;
    private int zzK;
    private long zzL;
    private zzbv zzM;
    private zzbv zzN;
    private int zzO;
    private int zzP;
    private zzaea zzQ;
    private long zzR;
    private boolean zzS;
    private int zzT;
    private final Context zze;
    private final boolean zzf;
    private final zzaex zzg;
    private final boolean zzh;
    private final zzaed zzi;
    private final zzaeb zzj;
    private final zzadf zzk;
    private final zzact zzl;
    private final long zzm;
    private final zzaee zzn;
    private final PriorityQueue zzo;
    private zzadl zzp;
    private boolean zzq;
    private boolean zzr;
    private zzafd zzs;
    private boolean zzt;
    private int zzu;
    private List zzv;
    private Surface zzw;
    private zzadp zzx;
    private zzev zzy;
    private boolean zzz;

    protected zzadn(zzadk zzadkVar) {
        super(zzadkVar.zze().getApplicationContext(), 2, zzadkVar.zzg(), zzadkVar.zzf(), false, 0.0f);
        Context applicationContext = zzadkVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzs = null;
        this.zzg = new zzaex(zzadkVar.zzh(), zzadkVar.zzi());
        this.zzf = this.zzs == null;
        zzaed zzaedVar = new zzaed(applicationContext, this, 0L);
        this.zzi = zzaedVar;
        zzaedVar.zza(50000L);
        this.zzj = new zzaeb();
        this.zzk = new zzadf(new zzadd() { // from class: com.google.android.gms.internal.ads.zzadm
            @Override // com.google.android.gms.internal.ads.zzadd
            public final /* synthetic */ void zza(float f) {
                zzadn.this.zzbq(f);
            }
        });
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzy = zzev.zza;
        this.zzA = 1;
        this.zzB = 0;
        this.zzM = zzbv.zza;
        this.zzP = 0;
        this.zzN = null;
        this.zzO = -1000;
        this.zzR = -9223372036854775807L;
        this.zzl = new zzact();
        this.zzo = new PriorityQueue();
        this.zzm = -15000L;
        this.zzn = new zzaee(1.0f);
        this.zzG = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        if (r3.equals("video/av01") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzay(zzvs zzvsVar, zzv zzvVar) {
        int i = zzvVar.zzw;
        int i2 = zzvVar.zzx;
        if (i != -1 && i2 != -1) {
            String str = zzvVar.zzp;
            str.getClass();
            char c = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair zze = zzdr.zze(zzvVar);
                if (zze != null) {
                    int intValue = ((Integer) zze.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            int i3 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i * i2) * 3) / i3;
                case 4:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    if (!"BRAVIA 4K 2015".equals(Build.MODEL) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(Build.MODEL) && (!"AFTS".equals(Build.MODEL) || !zzvsVar.zzf)))) {
                        String str2 = zzfm.zza;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * ViewUtils.EDGE_TO_EDGE_FLAGS) / 4;
                    }
                    break;
                case 6:
                    i3 = 8;
                    return ((i * i2) * 3) / i3;
            }
        }
        return -1;
    }

    private final boolean zzbA(zzvs zzvsVar) {
        if (this.zzs != null) {
            return true;
        }
        Surface surface = this.zzw;
        return (surface != null && surface.isValid()) || zzbu(zzvsVar) || zzaE(zzvsVar);
    }

    private final Surface zzbB(zzvs zzvsVar) {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            return zzafdVar.zzk();
        }
        Surface surface = this.zzw;
        if (surface != null) {
            return surface;
        }
        if (zzbu(zzvsVar)) {
            return null;
        }
        zzguk.zzi(zzaE(zzvsVar));
        zzadp zzadpVar = this.zzx;
        if (zzadpVar != null) {
            if (zzadpVar.zza != zzvsVar.zzf) {
                zzbC();
            }
        }
        if (this.zzx == null) {
            this.zzx = zzadp.zzb(this.zze, zzvsVar.zzf);
        }
        return this.zzx;
    }

    private final void zzbC() {
        zzadp zzadpVar = this.zzx;
        if (zzadpVar != null) {
            zzadpVar.release();
            this.zzx = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* renamed from: zzbD, reason: merged with bridge method [inline-methods] */
    public final void zzbr() {
        this.zzg.zzg(this.zzw);
        this.zzz = true;
    }

    private final void zzbE() {
        zzbv zzbvVar = this.zzN;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    protected static int zzbo(zzvs zzvsVar, zzv zzvVar) {
        int i = zzvVar.zzq;
        if (i == -1) {
            return zzay(zzvsVar, zzvVar);
        }
        List list = zzvVar.zzs;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x04c3, code lost:
    
        if (r1.equals("deb") != false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x07a0, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L515;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzbt(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzadn.class) {
            if (!zzc) {
                char c = 28;
                if (Build.VERSION.SDK_INT <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z2 = 7;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = 4;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z2 = 6;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z2 = 5;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z3 = true;
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
                if (Build.VERSION.SDK_INT > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z = 6;
                                break;
                            }
                            z = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z = 7;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z = 4;
                                break;
                            }
                            z = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z = 8;
                                break;
                            }
                            z = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z = 5;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        default:
                            if (Build.VERSION.SDK_INT <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c = '6';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c = '7';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c = '8';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c = 'J';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c = GMTDateParser.YEAR;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c = 'Z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c = 'e';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c = 'f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c = 'g';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c = '\r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c = 't';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c = 137;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c = GMTDateParser.HOURS;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c = '_';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c = 130;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c = 'a';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c = 'b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c = 'c';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c = '4';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c = 'F';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c = 'v';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c = 'W';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c = 'x';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c = '\"';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c = '~';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c = 'X';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c = 'w';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c = 131;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c = 132;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c = AbstractJsonLexerKt.BEGIN_LIST;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c = '3';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c = '5';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c = 'i';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c = 'y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c = 138;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c = 134;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c = 'q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c = Ascii.MAX;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c = 129;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c = 'T';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c = 'I';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c = 'O';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c = 'P';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c = 'V';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c = '^';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c = 'k';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c = GMTDateParser.SECONDS;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c = 139;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c = '1';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c = Typography.dollar;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c = '%';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c = Typography.amp;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c = '\'';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c = '(';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c = ')';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c = AbstractJsonLexerKt.END_LIST;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c = GMTDateParser.MINUTES;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c = 'o';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c = 136;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c = '2';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c = 'K';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c = 'U';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c = '\\';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c = 'S';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c = GMTDateParser.ANY;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c = '+';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c = AbstractJsonLexerKt.COMMA;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c = '-';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c = '.';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c = FileSystemKt.UnixPathSeparator;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c = '0';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c = 'l';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c = 'n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c = 'p';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c = 128;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c = 135;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c = 'C';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c = 'L';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c = GMTDateParser.MONTH;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c = 'R';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c = Typography.less;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c = GMTDateParser.ZONE;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c = AbstractJsonLexerKt.BEGIN_OBJ;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c = '|';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c = AbstractJsonLexerKt.END_OBJ;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c = 'j';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c = 'r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c = '9';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c = AbstractJsonLexerKt.COLON;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c = ';';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c = 'Q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c = 'H';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c = '`';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c = 'N';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c = 'G';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c = Typography.greater;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c = '#';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c = C4761z5.U;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c = 133;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c = 'D';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c = AbstractJsonLexerKt.UNICODE_ESC;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c = GMTDateParser.DAY_OF_MONTH;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c = 'E';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c = '?';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c = '@';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c = ' ';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c = '!';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c = 'A';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c = 'B';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    default:
                                        String str5 = Build.MODEL;
                                        if (str5.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
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
                                    case ' ':
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case '-':
                                    case '.':
                                    case '/':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                                    case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case CUSTOM_ACTION_07_VALUE:
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case ASSET_FAILED_STATUS_CODE_VALUE:
                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                    case JSON_ENCODE_ERROR_VALUE:
                                    case MenuKt.InTransitionDuration /* 120 */:
                                    case TPAT_ERROR_VALUE:
                                    case INVALID_ADS_ENDPOINT_VALUE:
                                    case INVALID_RI_ENDPOINT_VALUE:
                                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                    case '~':
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case 138:
                                    case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                                        break;
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    zzd = z3;
                    zzc = true;
                }
                z3 = true;
                zzd = z3;
                zzc = true;
            }
        }
        return zzd;
    }

    protected static final boolean zzbu(zzvs zzvsVar) {
        return Build.VERSION.SDK_INT >= 35 && zzvsVar.zzh;
    }

    private static List zzbv(Context context, zzwb zzwbVar, zzv zzvVar, boolean z, boolean z2) throws zzwd {
        String str = zzvVar.zzp;
        if (str == null) {
            return zzgxm.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadj.zza(context)) {
            List zzd2 = zzwl.zzd(zzwbVar, zzvVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zzwl.zzc(zzwbVar, zzvVar, z, z2);
    }

    private final void zzbw(Object obj) throws zzjn {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzw == surface) {
            if (surface != null) {
                zzbE();
                Surface surface2 = this.zzw;
                if (surface2 == null || !this.zzz) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzw = surface;
        if (this.zzs == null) {
            this.zzi.zze(surface);
        }
        this.zzz = false;
        int zze = zze();
        zzvp zzaK = zzaK();
        if (zzaK != null && this.zzs == null) {
            zzvs zzaN = zzaN();
            zzaN.getClass();
            if (!zzbA(zzaN) || this.zzq) {
                zzaO();
                zzaG();
            } else {
                Surface zzbB = zzbB(zzaN);
                if (zzbB != null) {
                    zzaK.zzn(zzbB);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzaK.zzo();
                }
            }
        }
        if (surface != null) {
            zzbE();
        } else {
            this.zzN = null;
            zzafd zzafdVar = this.zzs;
            if (zzafdVar != null) {
                zzafdVar.zzq();
            }
        }
        if (zze == 2) {
            zzafd zzafdVar2 = this.zzs;
            if (zzafdVar2 != null) {
                zzafdVar2.zzw(true);
            } else {
                this.zzi.zzk(true);
            }
        }
    }

    private final boolean zzbx(zziy zziyVar) {
        if (zzcW() || zziyVar.zzd() || zzP() == -9223372036854775807L) {
            return true;
        }
        return zzP() - (zziyVar.zzd - zzbi()) <= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private final boolean zzby(zziy zziyVar) {
        return zziyVar.zzd < zzH();
    }

    private final void zzbz(long j, long j2, zzv zzvVar) {
        zzaea zzaeaVar = this.zzQ;
        if (zzaeaVar != null) {
            zzaeaVar.zzcS(j, j2, zzvVar, zzaM());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzA(long j, boolean z, boolean z2) throws zzjn {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null && !z) {
            zzafdVar.zzg(true);
        }
        if (z2) {
            this.zzH = j;
        }
        super.zzA(j, z, z2);
        if (this.zzs == null) {
            this.zzi.zzm();
        }
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzd();
        }
        if (z) {
            zzafd zzafdVar2 = this.zzs;
            if (zzafdVar2 != null) {
                zzafdVar2.zzw(false);
            } else {
                this.zzi.zzk(false);
            }
        }
        this.zzE = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected final void zzB() {
        this.zzD = 0;
        this.zzC = zzM().zzb();
        this.zzJ = 0L;
        this.zzK = 0;
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zza();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected final void zzC() {
        if (this.zzD > 0) {
            long zzb2 = zzM().zzb();
            this.zzg.zzd(this.zzD, zzb2 - this.zzC);
            this.zzD = 0;
            this.zzC = zzb2;
        }
        int i = this.zzK;
        if (i != 0) {
            this.zzg.zze(this.zzJ, i);
            this.zzJ = 0L;
            this.zzK = 0;
        }
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzb();
        } else {
            this.zzi.zzd();
        }
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzD() {
        this.zzN = null;
        this.zzz = false;
        this.zzI = true;
        try {
            super.zzD();
        } finally {
            zzaex zzaexVar = this.zzg;
            zzaexVar.zzi(this.zza);
            zzaexVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzt = false;
            this.zzR = -9223372036854775807L;
            zzbC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected final void zzF() {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null || !this.zzf) {
            return;
        }
        zzafdVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzne, com.google.android.gms.internal.ads.zzng
    public final String zzV() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean zzX(long j) {
        if (zzbh() == -9223372036854775807L || j < this.zzH) {
            return false;
        }
        long zzba = zzba();
        return zzba == -9223372036854775807L || j > zzba;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final void zzY(float f, float f2) throws zzjn {
        super.zzY(f, f2);
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzm(f);
        } else {
            this.zzi.zzo(f);
        }
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzc(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzZ() {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null) {
            this.zzi.zzi();
            return;
        }
        int i = this.zzu;
        if (i == 0 || i == 1) {
            this.zzu = 0;
        } else {
            zzafdVar.zzt();
        }
    }

    protected final void zzaA(zzvp zzvpVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzvpVar.zzc(i, false);
        Trace.endSection();
        zzaB(0, 1);
    }

    protected final void zzaB(int i, int i2) {
        zzje zzjeVar = this.zza;
        zzjeVar.zzh += i;
        int i3 = i + i2;
        zzjeVar.zzg += i3;
        this.zzD += i3;
        int i4 = this.zzE + i3;
        this.zzE = i4;
        zzjeVar.zzi = Math.max(i4, zzjeVar.zzi);
    }

    protected final void zzaC(long j) {
        zzje zzjeVar = this.zza;
        zzjeVar.zzk += j;
        zzjeVar.zzl++;
        this.zzJ += j;
        this.zzK++;
    }

    protected final void zzaD(zzvp zzvpVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzvpVar.zzd(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzE = 0;
        if (this.zzs == null) {
            zzbv zzbvVar = this.zzM;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzN)) {
                this.zzN = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzg() || this.zzw == null) {
                return;
            }
            zzbr();
        }
    }

    protected final boolean zzaE(zzvs zzvsVar) {
        if (zzbt(zzvsVar.zza)) {
            return false;
        }
        return !zzvsVar.zzf || zzadp.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final boolean zzaI(zzvs zzvsVar) {
        return zzbA(zzvsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final boolean zzaQ() {
        zzvs zzaN = zzaN();
        if (this.zzs != null && zzaN != null) {
            String str = zzaN.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.zzaQ();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final boolean zzaR() {
        boolean z;
        zzv zzaL = zzaL();
        long zzP = zzP();
        if (zzP != -9223372036854775807L) {
            if (zzaS() + 1 + zzP <= Long.MAX_VALUE - (zzbi() + zzP)) {
                z = false;
                return this.zzG == null || this.zzI || (zzaL != null && zzaL.zzr > 0) || z || zzbg() != -9223372036854775807L;
            }
        }
        z = true;
        if (this.zzG == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzaT() {
        super.zzaT();
        this.zzo.clear();
        this.zzF = 0;
        this.zzT = 0;
        this.zzI = false;
        zzact zzactVar = this.zzl;
        if (zzactVar != null) {
            zzactVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final zzvr zzaV(Throwable th, zzvs zzvsVar) {
        return new zzadg(th, zzvsVar, this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final boolean zzaW(zzv zzvVar) throws zzjn {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null || zzafdVar.zze()) {
            return true;
        }
        try {
            zzafdVar.zzd(zzvVar);
            return true;
        } catch (zzafc e) {
            throw zzQ(e, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzaX(zziy zziyVar) throws zzjn {
        ByteBuffer byteBuffer;
        zzi zziVar;
        zzvs zzaN = zzaN();
        zzaN.getClass();
        if (zzaN.zzb.equals("video/av01") && (byteBuffer = zziyVar.zzc) != null) {
            zzv zzaL = zzaL();
            if (zzaL != null && (zziVar = zzaL.zzG) != null && zziVar.zzf > 8) {
                zzacs.zza(byteBuffer);
            }
            zzact zzactVar = this.zzl;
            if (zzactVar != null && zziyVar.zzc()) {
                zzactVar.zzb(byteBuffer);
            }
        }
        this.zzT = 0;
        int zzaY = zzaY(zziyVar);
        if (Build.VERSION.SDK_INT < 34 || (zzaY & 32) == 0) {
            this.zzF++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final int zzaY(zziy zziyVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzG == null || !zzby(zziyVar) || zzbx(zziyVar)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean zzaZ(zziy zziyVar) {
        boolean z;
        ByteBuffer byteBuffer;
        boolean z2 = false;
        if (zzbx(zziyVar)) {
            return false;
        }
        boolean zzby = zzby(zziyVar);
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            long zzb2 = zzaeeVar.zzb(zziyVar.zzd);
            if (zzb2 != -9223372036854775807L && zzb2 < this.zzm) {
                z = true;
                if ((zzby && !z) || zziyVar.zze()) {
                    return false;
                }
                if (zziyVar.zzf()) {
                    zzact zzactVar = this.zzl;
                    if (zzactVar != null) {
                        zzvs zzaN = zzaN();
                        zzaN.getClass();
                        if (zzaN.zzb.equals("video/av01") && (byteBuffer = zziyVar.zzc) != null) {
                            boolean z3 = zzby || this.zzT <= 0;
                            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            asReadOnlyBuffer.flip();
                            int zza = zzactVar.zza(asReadOnlyBuffer, z3);
                            if (zza == 0) {
                                zziyVar.zza();
                            } else if (zza != asReadOnlyBuffer.limit()) {
                                zzadl zzadlVar = this.zzp;
                                zzadlVar.getClass();
                                if (zzadlVar.zzc + zza < asReadOnlyBuffer.capacity() && !zziyVar.zzk()) {
                                    ByteBuffer byteBuffer2 = zziyVar.zzc;
                                    byteBuffer2.getClass();
                                    byteBuffer2.position(zza);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (zzby) {
                            this.zza.zzd++;
                        } else {
                            this.zzT++;
                        }
                        this.zzo.add(Long.valueOf(zziyVar.zzd));
                    }
                    return z2;
                }
                zziyVar.zza();
                z2 = true;
                if (z2) {
                }
                return z2;
            }
        }
        z = false;
        if (zzby) {
        }
        if (zziyVar.zzf()) {
        }
        z2 = true;
        if (z2) {
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final void zzaa(long j, long j2) throws zzjn {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            try {
                zzafdVar.zzv(j, j2);
            } catch (zzafc e) {
                throw zzQ(e, e.zza, false, 7001);
            }
        }
        super.zzaa(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean zzab() {
        boolean zzbc = zzbc();
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            return zzafdVar.zzh(zzbc);
        }
        if (zzbc && zzaK() == null) {
            return true;
        }
        return this.zzi.zzj(zzbc);
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean zzac() {
        if (!super.zzac()) {
            return false;
        }
        zzafd zzafdVar = this.zzs;
        return zzafdVar == null || zzafdVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final int zzaf(zzwb zzwbVar, zzv zzvVar) throws zzwd {
        boolean z;
        String str = zzvVar.zzp;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzvVar.zzt != null;
        List zzbv = zzbv(context, zzwbVar, zzvVar, z2, false);
        if (z2 && zzbv.isEmpty()) {
            zzbv = zzbv(context, zzwbVar, zzvVar, false, false);
        }
        if (zzbv.isEmpty()) {
            return 129;
        }
        if (!zzbl(zzvVar)) {
            return 130;
        }
        zzvs zzvsVar = (zzvs) zzbv.get(0);
        boolean zzc2 = zzvsVar.zzc(context, zzvVar);
        if (!zzc2) {
            for (int i2 = 1; i2 < zzbv.size(); i2++) {
                zzvs zzvsVar2 = (zzvs) zzbv.get(i2);
                if (zzvsVar2.zzc(context, zzvVar)) {
                    zzc2 = true;
                    z = false;
                    zzvsVar = zzvsVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != zzc2 ? 3 : 4;
        int i4 = true != zzvsVar.zze(zzvVar) ? 8 : 16;
        int i5 = true != zzvsVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadj.zza(context)) {
            i6 = 256;
        }
        if (zzc2) {
            List zzbv2 = zzbv(context, zzwbVar, zzvVar, z2, true);
            if (!zzbv2.isEmpty()) {
                zzvs zzvsVar3 = (zzvs) zzwl.zze(context, zzbv2, zzvVar).get(0);
                if (zzvsVar3.zzc(context, zzvVar) && zzvsVar3.zze(zzvVar)) {
                    i = 32;
                }
            }
        }
        return i6 | i3 | i4 | i | i5;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final List zzag(zzwb zzwbVar, zzv zzvVar, boolean z) throws zzwd {
        Context context = this.zze;
        return zzwl.zze(context, zzbv(context, zzwbVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final zzvm zzai(zzvs zzvsVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        int i;
        int i2;
        zzadl zzadlVar;
        Point point;
        int i3;
        boolean z;
        zzv[] zzvVarArr;
        char c;
        boolean z2;
        Pair zze;
        int zzay;
        zzv[] zzJ = zzJ();
        int length = zzJ.length;
        int zzbo = zzbo(zzvsVar, zzvVar);
        int i4 = zzvVar.zzx;
        int i5 = zzvVar.zzw;
        if (length == 1) {
            if (zzbo != -1 && (zzay = zzay(zzvsVar, zzvVar)) != -1) {
                zzbo = Math.min((int) (zzbo * 1.5f), zzay);
            }
            zzadlVar = new zzadl(i5, i4, zzbo);
            i = i4;
            i2 = i5;
        } else {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z3 = false;
            while (i8 < length) {
                zzv zzvVar2 = zzJ[i8];
                zzi zziVar = zzvVar.zzG;
                if (zziVar != null && zzvVar2.zzG == null) {
                    zzt zza = zzvVar2.zza();
                    zza.zzF(zziVar);
                    zzvVar2 = zza.zzQ();
                }
                if (zzvsVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    int i9 = zzvVar2.zzw;
                    c = 65535;
                    if (i9 != -1) {
                        zzvVarArr = zzJ;
                        if (zzvVar2.zzx != -1) {
                            z2 = false;
                            z3 |= z2;
                            i7 = Math.max(i7, i9);
                            i6 = Math.max(i6, zzvVar2.zzx);
                            zzbo = Math.max(zzbo, zzbo(zzvsVar, zzvVar2));
                        }
                    } else {
                        zzvVarArr = zzJ;
                    }
                    z2 = true;
                    z3 |= z2;
                    i7 = Math.max(i7, i9);
                    i6 = Math.max(i6, zzvVar2.zzx);
                    zzbo = Math.max(zzbo, zzbo(zzvsVar, zzvVar2));
                } else {
                    zzvVarArr = zzJ;
                    c = 65535;
                }
                i8++;
                zzJ = zzvVarArr;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 44 + String.valueOf(i6).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i7);
                sb.append("x");
                sb.append(i6);
                zzeh.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z4 = i4 > i5;
                int i10 = z4 ? i4 : i5;
                int i11 = true != z4 ? i4 : i5;
                int[] iArr = zzb;
                int i12 = 0;
                while (true) {
                    if (i12 >= 9) {
                        i = i4;
                        i2 = i5;
                        break;
                    }
                    float f2 = i11;
                    i = i4;
                    float f3 = i10;
                    i2 = i5;
                    int i13 = iArr[i12];
                    int[] iArr2 = iArr;
                    float f4 = i13;
                    if (i13 <= i10 || (i3 = (int) (f4 * (f2 / f3))) <= i11) {
                        break;
                    }
                    int i14 = true != z4 ? i13 : i3;
                    if (true != z4) {
                        i13 = i3;
                    }
                    point = zzvsVar.zzi(i14, i13);
                    float f5 = zzvVar.zzA;
                    if (point != null) {
                        z = z4;
                        if (zzvsVar.zzg(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i12++;
                    i4 = i;
                    i5 = i2;
                    iArr = iArr2;
                    z4 = z;
                }
                point = null;
                if (point != null) {
                    i7 = Math.max(i7, point.x);
                    i6 = Math.max(i6, point.y);
                    zzt zza2 = zzvVar.zza();
                    zza2.zzv(i7);
                    zza2.zzw(i6);
                    zzbo = Math.max(zzbo, zzay(zzvsVar, zza2.zzQ()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 35 + String.valueOf(i6).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i7);
                    sb2.append("x");
                    sb2.append(i6);
                    zzeh.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            } else {
                i = i4;
                i2 = i5;
            }
            zzadlVar = new zzadl(i7, i6, zzbo);
        }
        String str = zzvsVar.zzc;
        this.zzp = zzadlVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        zzek.zza(mediaFormat, zzvVar.zzs);
        float f6 = zzvVar.zzA;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzek.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        zzi zziVar2 = zzvVar.zzG;
        if (zziVar2 != null) {
            zzek.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzek.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzek.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzp) && (zze = zzdr.zze(zzvVar)) != null) {
            zzek.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzadlVar.zza);
        mediaFormat.setInteger("max-height", zzadlVar.zzb);
        zzek.zzb(mediaFormat, "max-input-size", zzadlVar.zzc);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzO));
        }
        zzbk(mediaFormat);
        Surface zzbB = zzbB(zzvsVar);
        if (this.zzs != null && !zzfm.zzW(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzvm.zzb(zzvsVar, mediaFormat, zzvVar, zzbB, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final zzjf zzaj(zzvs zzvsVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        int i;
        int i2;
        zzjf zzf = zzvsVar.zzf(zzvVar, zzvVar2);
        int i3 = zzf.zze;
        zzadl zzadlVar = this.zzp;
        zzadlVar.getClass();
        if (zzvVar2.zzw > zzadlVar.zza || zzvVar2.zzx > zzadlVar.zzb) {
            i3 |= 256;
        }
        if (zzbo(zzvsVar, zzvVar2) > zzadlVar.zzc) {
            i3 |= 64;
        }
        if (this.zzB != Integer.MIN_VALUE && Build.VERSION.SDK_INT < 31 && (Build.VERSION.SDK_INT != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f = zzvVar.zzA;
            if (f != -1.0f) {
                float f2 = zzvVar2.zzA;
                if (f2 != -1.0f && (!zzvsVar.zzf || !z)) {
                    if (Math.abs((Math.max(f2, f) / Math.min(f2, f)) - Math.round(r12)) > 0.01f) {
                        i3 |= 65536;
                    }
                }
            }
        }
        String str = zzvsVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzf.zzd;
        }
        return new zzjf(str, zzvVar, zzvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final float zzal(float f, zzv zzvVar, zzv[] zzvVarArr) {
        zzvs zzaN;
        float f2 = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f3 = zzvVar2.zzA;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f && zzaK() != null) {
            if (this.zzk.zzc() != -9223372036854775807L) {
                f2 = 1.0E9f / r10.zzc();
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzG == null || (zzaN = zzaN()) == null) {
            return f4;
        }
        float zzh = zzaN.zzh(zzvVar.zzw, zzvVar.zzx);
        return f4 != -1.0f ? Math.max(f4, zzh) : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzam(String str, zzvm zzvmVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzq = zzbt(str);
        zzvs zzaN = zzaN();
        zzaN.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzaN.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb2 = zzaN.zzb();
            int length = zzb2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzb2[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzr = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzan(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzao(Exception exc) {
        zzeh.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final zzjf zzap(zzma zzmaVar) throws zzjn {
        zzjf zzap = super.zzap(zzmaVar);
        zzv zzvVar = zzmaVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzap);
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzd();
        }
        return zzap;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzaq(zzv zzvVar, MediaFormat mediaFormat) {
        zzvp zzaK = zzaK();
        if (zzaK != null) {
            zzaK.zzq(this.zzA);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzvVar.zzD;
        int i = zzvVar.zzB;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzM = new zzbv(integer, integer2, f);
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null || !this.zzS) {
            this.zzk.zza(zzvVar.zzA);
        } else {
            zzt zza = zzvVar.zza();
            zza.zzv(integer);
            zza.zzw(integer2);
            zza.zzC(f);
            zzv zzQ = zza.zzQ();
            int i3 = this.zzu;
            List list = this.zzv;
            if (list == null) {
                list = zzgxm.zzi();
            }
            zzafdVar.zzs(1, zzQ, zzbj(), i3, list);
            this.zzu = 2;
        }
        this.zzS = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final boolean zzar(long j, long j2, long j3, boolean z, boolean z2) throws zzjn {
        int zzS;
        if (this.zzs != null && this.zzf) {
            j2 -= -this.zzR;
        }
        if (j >= -500000 || z || (zzS = zzS(j2)) == 0) {
            return false;
        }
        this.zzH = j2;
        Iterator it = this.zzo.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() >= zzH()) {
                i++;
            }
        }
        if (z2) {
            zzje zzjeVar = this.zza;
            int i2 = zzjeVar.zzd + zzS;
            zzjeVar.zzd = i2;
            zzjeVar.zzf += this.zzF;
            zzjeVar.zzd = i2 + i;
        } else {
            this.zza.zzj++;
            zzaB(zzS + i, this.zzF);
        }
        zzaP();
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzas() {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzi();
            long j = this.zzR;
            if (j == -9223372036854775807L) {
                j = zzbj();
                this.zzR = j;
            }
            this.zzs.zzo(-j);
        } else {
            this.zzi.zzb(2);
        }
        this.zzS = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzau(zzjc zzjcVar) {
        this.zzg.zzk(zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzav() {
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            zzafdVar.zzi();
        } else if (zzbg() != -9223372036854775807L) {
            zzbg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzax(zziy zziyVar) throws zzjn {
        if (this.zzr) {
            ByteBuffer byteBuffer = zziyVar.zze;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzvp zzaK = zzaK();
                        zzaK.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaK.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzaz(zzvp zzvpVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzvpVar.zzc(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzbb(long j) {
        super.zzbb(j);
        this.zzF--;
    }

    final /* synthetic */ void zzbq(float f) {
        this.zzi.zzf(f);
        zzbf();
    }

    final /* synthetic */ Surface zzbs() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzy(boolean z, boolean z2) throws zzjn {
        super.zzy(z, z2);
        zzK();
        this.zzg.zza(this.zza);
        if (!this.zzt) {
            if (this.zzv != null && this.zzs == null) {
                zzadr zzadrVar = new zzadr(this.zze, this.zzi);
                zzadrVar.zza(true);
                zzadrVar.zzc(-this.zzm);
                zzadrVar.zzb(zzM());
                zzadz zzd2 = zzadrVar.zzd();
                zzd2.zza(1);
                this.zzs = zzd2.zzb(0);
            }
            this.zzt = true;
        }
        int i = !z2 ? 1 : 0;
        zzafd zzafdVar = this.zzs;
        if (zzafdVar == null) {
            zzaed zzaedVar = this.zzi;
            zzaedVar.zzh(zzM());
            zzaedVar.zzb(i);
            return;
        }
        zzafdVar.zzc(new zzadh(this), zzhdp.zza());
        zzaea zzaeaVar = this.zzQ;
        if (zzaeaVar != null) {
            this.zzs.zzl(zzaeaVar);
        }
        if (this.zzw != null && !this.zzy.equals(zzev.zza)) {
            this.zzs.zzp(this.zzw, this.zzy);
        }
        this.zzs.zzr(this.zzB);
        this.zzs.zzm(zzbd());
        List list = this.zzv;
        if (list != null) {
            this.zzs.zzn(list);
        }
        this.zzu = i;
        zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzz(zzv[] zzvVarArr, long j, long j2, zzxo zzxoVar) throws zzjn {
        super.zzz(zzvVarArr, j, j2, zzxoVar);
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            zzaeeVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final boolean zzat(long j, long j2, zzvp zzvpVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzjn {
        zzvpVar.getClass();
        long zzbi = j3 - zzbi();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzo;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            this.zzk.zzb(l.longValue() * 1000);
            if (l.longValue() >= zzH()) {
                i4++;
            }
        }
        zzaB(i4, 0);
        zzadf zzadfVar = this.zzk;
        zzadfVar.zzb(j3 * 1000);
        zzafd zzafdVar = this.zzs;
        if (zzafdVar != null) {
            if (!z || z2) {
                return zzafdVar.zzu(j3, new zzadi(this, zzvpVar, i, zzbi));
            }
            zzaz(zzvpVar, i, zzbi);
            return true;
        }
        zzaed zzaedVar = this.zzi;
        long zzbj = zzbj();
        long zzc2 = zzadfVar.zzc();
        long zzd2 = zzadfVar.zzd();
        zzaeb zzaebVar = this.zzj;
        int zzl = zzaedVar.zzl(j3, j, j2, zzbj, z, z2, zzc2, zzd2, zzaebVar);
        zzaee zzaeeVar = this.zzn;
        if (zzaeeVar != null) {
            if (zzl == 5 || zzl == 4) {
                return false;
            }
            zzaeeVar.zza(j3, zzaebVar.zza());
        }
        if (zzl == 0) {
            long zzc3 = zzM().zzc();
            zzbz(zzbi, zzc3, zzvVar);
            zzaD(zzvpVar, i, zzbi, zzc3);
            zzaC(zzaebVar.zza());
            return true;
        }
        if (zzl != 1) {
            if (zzl == 2) {
                zzaA(zzvpVar, i, zzbi);
                zzaC(zzaebVar.zza());
                return true;
            }
            if (zzl != 3) {
                return false;
            }
            zzaz(zzvpVar, i, zzbi);
            zzaC(zzaebVar.zza());
            return true;
        }
        long zzb2 = zzaebVar.zzb();
        long zza = zzaebVar.zza();
        if (zzb2 == this.zzL) {
            zzaz(zzvpVar, i, zzbi);
        } else {
            zzbz(zzbi, zzb2, zzvVar);
            zzaD(zzvpVar, i, zzbi, zzb2);
        }
        zzaC(zza);
        this.zzL = zzb2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzmz
    public final void zzx(int i, Object obj) throws zzjn {
        if (i == 1) {
            zzbw(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaea zzaeaVar = (zzaea) obj;
            this.zzQ = zzaeaVar;
            zzafd zzafdVar = this.zzs;
            if (zzafdVar != null) {
                zzafdVar.zzl(zzaeaVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzP != intValue) {
                this.zzP = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzA = intValue2;
            zzvp zzaK = zzaK();
            if (zzaK != null) {
                zzaK.zzq(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzB = intValue3;
            zzafd zzafdVar2 = this.zzs;
            if (zzafdVar2 != null) {
                zzafdVar2.zzr(intValue3);
                return;
            } else {
                this.zzi.zzn(intValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzafd zzafdVar3 = this.zzs;
                if (zzafdVar3 == null || !zzafdVar3.zze()) {
                    return;
                }
                zzafdVar3.zzf();
                return;
            }
            this.zzv = list;
            zzafd zzafdVar4 = this.zzs;
            if (zzafdVar4 != null) {
                zzafdVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzev zzevVar = (zzev) obj;
            if (zzevVar.zza() == 0 || zzevVar.zzb() == 0) {
                return;
            }
            this.zzy = zzevVar;
            zzafd zzafdVar5 = this.zzs;
            if (zzafdVar5 != null) {
                Surface surface = this.zzw;
                surface.getClass();
                zzafdVar5.zzp(surface, zzevVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzO = ((Integer) obj).intValue();
                zzvp zzaK2 = zzaK();
                if (zzaK2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzO));
                    zzaK2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzw;
                zzbw(null);
                obj.getClass();
                ((zzadn) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzG != null;
                zznl zznlVar = (zznl) obj;
                this.zzG = zznlVar;
                if (z != (zznlVar != null)) {
                    zzbf();
                    break;
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }
}
