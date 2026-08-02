package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzalt implements zzakt {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalr zzh = new zzalr(30.0f, 1, 1);

    private static long zzc(String str, zzalr zzalrVar) throws zzakp {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d3 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d4 = d3 + parseLong3;
            return (long) ((d4 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r12) / zzalrVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / zzalrVar.zzb) / zzalrVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzakp("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                d = zzalrVar.zza;
                parseDouble2 /= d;
            }
            return (long) (parseDouble2 * 1000000.0d);
        }
        if (hashCode != 104) {
            if (hashCode != 109) {
                if (hashCode != 3494) {
                    if (hashCode == 115) {
                        group6.equals("s");
                    } else if (hashCode == 116 && group6.equals("t")) {
                        d = zzalrVar.zzc;
                        parseDouble2 /= d;
                    }
                } else if (group6.equals("ms")) {
                    d = 1000.0d;
                    parseDouble2 /= d;
                }
            } else if (group6.equals("m")) {
                d2 = 60.0d;
                parseDouble2 *= d2;
            }
        } else if (group6.equals("h")) {
            d2 = 3600.0d;
            parseDouble2 *= d2;
        }
        return (long) (parseDouble2 * 1000000.0d);
    }

    private static Layout.Alignment zzd(String str) {
        String zza2 = zzfuv.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!zza2.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!zza2.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!zza2.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!zza2.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static zzalw zze(zzalw zzalwVar) {
        return zzalwVar == null ? new zzalw() : zzalwVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123 A[Catch: zzakp -> 0x0181, TryCatch #1 {zzakp -> 0x0181, blocks: (B:47:0x00b3, B:49:0x00c3, B:50:0x00d9, B:53:0x00e1, B:55:0x00e7, B:64:0x0102, B:65:0x011d, B:67:0x0123, B:70:0x012f, B:73:0x0130, B:74:0x0149, B:78:0x010e, B:82:0x011a, B:85:0x014a, B:87:0x014b, B:88:0x0164, B:90:0x00cc, B:92:0x0165, B:93:0x0180), top: B:46:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzalw zzf(XmlPullParser xmlPullParser, zzalw zzalwVar) {
        Matcher matcher;
        String group;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzu("italic".equalsIgnoreCase(attributeValue));
                        break;
                    } else {
                        break;
                    }
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzo(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzq(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzB(zzd(attributeValue));
                        break;
                    } else {
                        break;
                    }
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzx(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        String zza2 = zzfuv.zza(attributeValue);
                        switch (zza2.hashCode()) {
                            case -1461280213:
                                if (zza2.equals("nounderline")) {
                                    zzalwVar = zze(zzalwVar);
                                    zzalwVar.zzE(false);
                                    break;
                                } else {
                                    break;
                                }
                            case -1026963764:
                                if (zza2.equals("underline")) {
                                    zzalwVar = zze(zzalwVar);
                                    zzalwVar.zzE(true);
                                    break;
                                } else {
                                    break;
                                }
                            case 913457136:
                                if (zza2.equals("nolinethrough")) {
                                    zzalwVar = zze(zzalwVar);
                                    zzalwVar.zzv(false);
                                    break;
                                } else {
                                    break;
                                }
                            case 1679736913:
                                if (zza2.equals("linethrough")) {
                                    zzalwVar = zze(zzalwVar);
                                    zzalwVar.zzv(true);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        break;
                    }
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzn("bold".equalsIgnoreCase(attributeValue));
                        break;
                    } else {
                        break;
                    }
                case 3355:
                    if (attributeName.equals(FacebookMediationAdapter.KEY_ID) && "style".equals(xmlPullParser.getName())) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzt(attributeValue);
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String zza3 = zzfuv.zza(attributeValue);
                        switch (zza3.hashCode()) {
                            case -618561360:
                                if (!zza3.equals("baseContainer")) {
                                    break;
                                }
                                zzalwVar = zze(zzalwVar);
                                zzalwVar.zzz(2);
                                break;
                            case -410956671:
                                if (zza3.equals("container")) {
                                    zzalwVar = zze(zzalwVar);
                                    zzalwVar.zzz(1);
                                    break;
                                } else {
                                    break;
                                }
                            case -250518009:
                                if (zza3.equals("delimiter")) {
                                    zzalwVar = zze(zzalwVar);
                                    zzalwVar.zzz(4);
                                    break;
                                } else {
                                    break;
                                }
                            case -136074796:
                                if (!zza3.equals("textContainer")) {
                                    break;
                                }
                                zzalwVar = zze(zzalwVar);
                                zzalwVar.zzz(3);
                                break;
                            case 3016401:
                                if (!zza3.equals("base")) {
                                    break;
                                }
                                zzalwVar = zze(zzalwVar);
                                zzalwVar.zzz(2);
                                break;
                            case 3556653:
                                if (!zza3.equals("text")) {
                                    break;
                                }
                                zzalwVar = zze(zzalwVar);
                                zzalwVar.zzz(3);
                                break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        zzalwVar = zze(zzalwVar);
                        try {
                            zzalwVar.zzp(zzdl.zzb(attributeValue));
                            break;
                        } catch (IllegalArgumentException unused) {
                            zzea.zzf("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                            break;
                        }
                    } else {
                        break;
                    }
                case 109403361:
                    if (attributeName.equals("shear")) {
                        zzalwVar = zze(zzalwVar);
                        Matcher matcher2 = zza.matcher(attributeValue);
                        float f = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(1);
                                if (group2 == null) {
                                    throw null;
                                    break;
                                } else {
                                    String str = group2;
                                    f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group2)));
                                }
                            } catch (NumberFormatException e) {
                                zzea.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                            }
                        } else {
                            zzea.zzf("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                        }
                        zzalwVar.zzA(f);
                        break;
                    } else {
                        continue;
                    }
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String zza4 = zzfuv.zza(attributeValue);
                        int hashCode = zza4.hashCode();
                        if (hashCode != 96673) {
                            if (hashCode == 3387192 && zza4.equals("none")) {
                                zzalwVar = zze(zzalwVar);
                                zzalwVar.zzC(false);
                                break;
                            }
                        } else if (zza4.equals("all")) {
                            zzalwVar = zze(zzalwVar);
                            zzalwVar.zzC(true);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            zzalwVar = zze(zzalwVar);
                            String str2 = zzex.zza;
                            String[] split = attributeValue.split("\\s+", -1);
                            int length = split.length;
                            if (length == 1) {
                                matcher = zze.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    throw new zzakp("Invalid number of entries for fontSize: " + length + ".");
                                }
                                matcher = zze.matcher(split[1]);
                                zzea.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                throw new zzakp("Invalid expression for fontSize: '" + attributeValue + "'.");
                            }
                            String group3 = matcher.group(3);
                            if (group3 == null) {
                                throw null;
                            }
                            String str3 = group3;
                            int hashCode2 = group3.hashCode();
                            if (hashCode2 != 37) {
                                if (hashCode2 != 3240) {
                                    if (hashCode2 == 3592 && group3.equals("px")) {
                                        zzalwVar.zzs(1);
                                        group = matcher.group(1);
                                        if (group == null) {
                                            throw null;
                                        }
                                        String str4 = group;
                                        zzalwVar.zzr(Float.parseFloat(group));
                                        break;
                                    }
                                    throw new zzakp("Invalid unit for fontSize: '" + group3 + "'.");
                                }
                                if (!group3.equals("em")) {
                                    throw new zzakp("Invalid unit for fontSize: '" + group3 + "'.");
                                }
                                zzalwVar.zzs(2);
                                group = matcher.group(1);
                                if (group == null) {
                                }
                            } else {
                                if (!group3.equals("%")) {
                                    throw new zzakp("Invalid unit for fontSize: '" + group3 + "'.");
                                }
                                zzalwVar.zzs(3);
                                group = matcher.group(1);
                                if (group == null) {
                                }
                            }
                        } catch (zzakp unused2) {
                            zzea.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                            break;
                        }
                    } else {
                        continue;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzD(zzalp.zza(attributeValue));
                        break;
                    } else {
                        break;
                    }
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String zza5 = zzfuv.zza(attributeValue);
                        int hashCode3 = zza5.hashCode();
                        if (hashCode3 != -1392885889) {
                            if (hashCode3 == 92734940 && zza5.equals("after")) {
                                zzalwVar = zze(zzalwVar);
                                zzalwVar.zzy(2);
                                break;
                            }
                        } else if (zza5.equals("before")) {
                            zzalwVar = zze(zzalwVar);
                            zzalwVar.zzy(1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        zzalwVar = zze(zzalwVar);
                        try {
                            zzalwVar.zzm(zzdl.zzb(attributeValue));
                            break;
                        } catch (IllegalArgumentException unused3) {
                            zzea.zzf("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                            break;
                        }
                    } else {
                        break;
                    }
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        zzalwVar = zze(zzalwVar);
                        zzalwVar.zzw(zzd(attributeValue));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return zzalwVar;
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzex.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final void zza(byte[] bArr, int i, int i2, zzaks zzaksVar, zzdn zzdnVar) {
        zzakn.zza(zzb(bArr, i, i2), zzaksVar, zzdnVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:358|(1:(10:361|362|363|364|365|366|34|(2:331|(1:333)(4:334|335|336|(2:338|(2:340|37)(2:341|342))(2:343|344)))|36|37)(1:372))(1:374)|373|362|363|364|365|366|34|(0)|36|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:234|(2:235|236)|(3:238|239|73)|295|296|(3:298|(4:300|(1:302)(1:326)|303|(1:305)(1:306))|327)(1:328)|307|(2:309|(1:311)(2:(2:321|(1:323))|324))(1:325)|312|313|314|315|(1:317)) */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04f5, code lost:
    
        if (r0.equals("tblr") != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0500, code lost:
    
        r37 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04fe, code lost:
    
        if (r0.equals("tb") != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0658, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:239:0x0563. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0514 A[Catch: IOException -> 0x06ee, XmlPullParserException -> 0x06f7, TryCatch #16 {IOException -> 0x06ee, XmlPullParserException -> 0x06f7, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:17:0x008c, B:20:0x0096, B:23:0x00aa, B:24:0x00c3, B:26:0x00cf, B:27:0x00d3, B:29:0x00df, B:30:0x00e3, B:34:0x017d, B:38:0x01db, B:41:0x01ef, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021d, B:55:0x0223, B:57:0x022b, B:59:0x0233, B:61:0x0239, B:63:0x023f, B:65:0x0245, B:67:0x024d, B:70:0x0256, B:73:0x06d0, B:74:0x0278, B:76:0x027e, B:78:0x0287, B:80:0x0296, B:82:0x02a1, B:84:0x02b5, B:86:0x02bb, B:88:0x0519, B:98:0x02bf, B:101:0x02c9, B:103:0x02cf, B:105:0x02d8, B:107:0x02de, B:108:0x02e5, B:112:0x02ef, B:116:0x0514, B:117:0x02fb, B:119:0x0303, B:121:0x0309, B:123:0x0311, B:125:0x0317, B:129:0x032c, B:131:0x0332, B:133:0x0342, B:135:0x03b3, B:137:0x03bb, B:139:0x03c1, B:141:0x03c9, B:143:0x03cf, B:147:0x03e4, B:149:0x03ea, B:151:0x03fa, B:152:0x0482, B:154:0x048a, B:163:0x04c5, B:165:0x04cd, B:175:0x0507, B:187:0x0409, B:190:0x040a, B:191:0x040b, B:193:0x0419, B:196:0x0421, B:199:0x0430, B:201:0x0436, B:203:0x0444, B:205:0x045b, B:207:0x045c, B:208:0x045d, B:209:0x046b, B:212:0x034e, B:214:0x034f, B:215:0x0350, B:216:0x035a, B:219:0x0364, B:222:0x036f, B:224:0x0375, B:226:0x0383, B:228:0x0395, B:230:0x0396, B:231:0x0397, B:232:0x03a2, B:236:0x052f, B:238:0x0552, B:244:0x05ec, B:254:0x0573, B:257:0x057c, B:249:0x0661, B:266:0x0590, B:273:0x05a8, B:279:0x05c0, B:284:0x05d3, B:289:0x05e4, B:298:0x0602, B:302:0x060c, B:305:0x0615, B:311:0x0628, B:312:0x063d, B:315:0x064b, B:317:0x0650, B:321:0x062f, B:331:0x0188, B:333:0x0194, B:336:0x019f, B:338:0x01a5, B:340:0x01b3, B:342:0x01c2, B:344:0x01c3, B:345:0x01c4, B:346:0x00fd, B:348:0x0109, B:351:0x0115, B:353:0x011b, B:356:0x0126, B:358:0x012c, B:363:0x0143, B:366:0x014a, B:368:0x0172, B:377:0x0164, B:383:0x016b, B:393:0x067c, B:396:0x068c, B:399:0x0690, B:401:0x069a, B:403:0x06a4, B:404:0x06af, B:407:0x06ac, B:411:0x06c1, B:416:0x06c9, B:420:0x06e7, B:423:0x06ed), top: B:2:0x0006, inners: #1, #2, #8, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04cd A[Catch: IOException -> 0x06ee, XmlPullParserException -> 0x06f7, TRY_LEAVE, TryCatch #16 {IOException -> 0x06ee, XmlPullParserException -> 0x06f7, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:17:0x008c, B:20:0x0096, B:23:0x00aa, B:24:0x00c3, B:26:0x00cf, B:27:0x00d3, B:29:0x00df, B:30:0x00e3, B:34:0x017d, B:38:0x01db, B:41:0x01ef, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021d, B:55:0x0223, B:57:0x022b, B:59:0x0233, B:61:0x0239, B:63:0x023f, B:65:0x0245, B:67:0x024d, B:70:0x0256, B:73:0x06d0, B:74:0x0278, B:76:0x027e, B:78:0x0287, B:80:0x0296, B:82:0x02a1, B:84:0x02b5, B:86:0x02bb, B:88:0x0519, B:98:0x02bf, B:101:0x02c9, B:103:0x02cf, B:105:0x02d8, B:107:0x02de, B:108:0x02e5, B:112:0x02ef, B:116:0x0514, B:117:0x02fb, B:119:0x0303, B:121:0x0309, B:123:0x0311, B:125:0x0317, B:129:0x032c, B:131:0x0332, B:133:0x0342, B:135:0x03b3, B:137:0x03bb, B:139:0x03c1, B:141:0x03c9, B:143:0x03cf, B:147:0x03e4, B:149:0x03ea, B:151:0x03fa, B:152:0x0482, B:154:0x048a, B:163:0x04c5, B:165:0x04cd, B:175:0x0507, B:187:0x0409, B:190:0x040a, B:191:0x040b, B:193:0x0419, B:196:0x0421, B:199:0x0430, B:201:0x0436, B:203:0x0444, B:205:0x045b, B:207:0x045c, B:208:0x045d, B:209:0x046b, B:212:0x034e, B:214:0x034f, B:215:0x0350, B:216:0x035a, B:219:0x0364, B:222:0x036f, B:224:0x0375, B:226:0x0383, B:228:0x0395, B:230:0x0396, B:231:0x0397, B:232:0x03a2, B:236:0x052f, B:238:0x0552, B:244:0x05ec, B:254:0x0573, B:257:0x057c, B:249:0x0661, B:266:0x0590, B:273:0x05a8, B:279:0x05c0, B:284:0x05d3, B:289:0x05e4, B:298:0x0602, B:302:0x060c, B:305:0x0615, B:311:0x0628, B:312:0x063d, B:315:0x064b, B:317:0x0650, B:321:0x062f, B:331:0x0188, B:333:0x0194, B:336:0x019f, B:338:0x01a5, B:340:0x01b3, B:342:0x01c2, B:344:0x01c3, B:345:0x01c4, B:346:0x00fd, B:348:0x0109, B:351:0x0115, B:353:0x011b, B:356:0x0126, B:358:0x012c, B:363:0x0143, B:366:0x014a, B:368:0x0172, B:377:0x0164, B:383:0x016b, B:393:0x067c, B:396:0x068c, B:399:0x0690, B:401:0x069a, B:403:0x06a4, B:404:0x06af, B:407:0x06ac, B:411:0x06c1, B:416:0x06c9, B:420:0x06e7, B:423:0x06ed), top: B:2:0x0006, inners: #1, #2, #8, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0188 A[Catch: IOException -> 0x06ee, XmlPullParserException -> 0x06f7, TryCatch #16 {IOException -> 0x06ee, XmlPullParserException -> 0x06f7, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:17:0x008c, B:20:0x0096, B:23:0x00aa, B:24:0x00c3, B:26:0x00cf, B:27:0x00d3, B:29:0x00df, B:30:0x00e3, B:34:0x017d, B:38:0x01db, B:41:0x01ef, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021d, B:55:0x0223, B:57:0x022b, B:59:0x0233, B:61:0x0239, B:63:0x023f, B:65:0x0245, B:67:0x024d, B:70:0x0256, B:73:0x06d0, B:74:0x0278, B:76:0x027e, B:78:0x0287, B:80:0x0296, B:82:0x02a1, B:84:0x02b5, B:86:0x02bb, B:88:0x0519, B:98:0x02bf, B:101:0x02c9, B:103:0x02cf, B:105:0x02d8, B:107:0x02de, B:108:0x02e5, B:112:0x02ef, B:116:0x0514, B:117:0x02fb, B:119:0x0303, B:121:0x0309, B:123:0x0311, B:125:0x0317, B:129:0x032c, B:131:0x0332, B:133:0x0342, B:135:0x03b3, B:137:0x03bb, B:139:0x03c1, B:141:0x03c9, B:143:0x03cf, B:147:0x03e4, B:149:0x03ea, B:151:0x03fa, B:152:0x0482, B:154:0x048a, B:163:0x04c5, B:165:0x04cd, B:175:0x0507, B:187:0x0409, B:190:0x040a, B:191:0x040b, B:193:0x0419, B:196:0x0421, B:199:0x0430, B:201:0x0436, B:203:0x0444, B:205:0x045b, B:207:0x045c, B:208:0x045d, B:209:0x046b, B:212:0x034e, B:214:0x034f, B:215:0x0350, B:216:0x035a, B:219:0x0364, B:222:0x036f, B:224:0x0375, B:226:0x0383, B:228:0x0395, B:230:0x0396, B:231:0x0397, B:232:0x03a2, B:236:0x052f, B:238:0x0552, B:244:0x05ec, B:254:0x0573, B:257:0x057c, B:249:0x0661, B:266:0x0590, B:273:0x05a8, B:279:0x05c0, B:284:0x05d3, B:289:0x05e4, B:298:0x0602, B:302:0x060c, B:305:0x0615, B:311:0x0628, B:312:0x063d, B:315:0x064b, B:317:0x0650, B:321:0x062f, B:331:0x0188, B:333:0x0194, B:336:0x019f, B:338:0x01a5, B:340:0x01b3, B:342:0x01c2, B:344:0x01c3, B:345:0x01c4, B:346:0x00fd, B:348:0x0109, B:351:0x0115, B:353:0x011b, B:356:0x0126, B:358:0x012c, B:363:0x0143, B:366:0x014a, B:368:0x0172, B:377:0x0164, B:383:0x016b, B:393:0x067c, B:396:0x068c, B:399:0x0690, B:401:0x069a, B:403:0x06a4, B:404:0x06af, B:407:0x06ac, B:411:0x06c1, B:416:0x06c9, B:420:0x06e7, B:423:0x06ed), top: B:2:0x0006, inners: #1, #2, #8, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ef A[Catch: IOException -> 0x06ee, XmlPullParserException -> 0x06f7, TRY_ENTER, TryCatch #16 {IOException -> 0x06ee, XmlPullParserException -> 0x06f7, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:17:0x008c, B:20:0x0096, B:23:0x00aa, B:24:0x00c3, B:26:0x00cf, B:27:0x00d3, B:29:0x00df, B:30:0x00e3, B:34:0x017d, B:38:0x01db, B:41:0x01ef, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021d, B:55:0x0223, B:57:0x022b, B:59:0x0233, B:61:0x0239, B:63:0x023f, B:65:0x0245, B:67:0x024d, B:70:0x0256, B:73:0x06d0, B:74:0x0278, B:76:0x027e, B:78:0x0287, B:80:0x0296, B:82:0x02a1, B:84:0x02b5, B:86:0x02bb, B:88:0x0519, B:98:0x02bf, B:101:0x02c9, B:103:0x02cf, B:105:0x02d8, B:107:0x02de, B:108:0x02e5, B:112:0x02ef, B:116:0x0514, B:117:0x02fb, B:119:0x0303, B:121:0x0309, B:123:0x0311, B:125:0x0317, B:129:0x032c, B:131:0x0332, B:133:0x0342, B:135:0x03b3, B:137:0x03bb, B:139:0x03c1, B:141:0x03c9, B:143:0x03cf, B:147:0x03e4, B:149:0x03ea, B:151:0x03fa, B:152:0x0482, B:154:0x048a, B:163:0x04c5, B:165:0x04cd, B:175:0x0507, B:187:0x0409, B:190:0x040a, B:191:0x040b, B:193:0x0419, B:196:0x0421, B:199:0x0430, B:201:0x0436, B:203:0x0444, B:205:0x045b, B:207:0x045c, B:208:0x045d, B:209:0x046b, B:212:0x034e, B:214:0x034f, B:215:0x0350, B:216:0x035a, B:219:0x0364, B:222:0x036f, B:224:0x0375, B:226:0x0383, B:228:0x0395, B:230:0x0396, B:231:0x0397, B:232:0x03a2, B:236:0x052f, B:238:0x0552, B:244:0x05ec, B:254:0x0573, B:257:0x057c, B:249:0x0661, B:266:0x0590, B:273:0x05a8, B:279:0x05c0, B:284:0x05d3, B:289:0x05e4, B:298:0x0602, B:302:0x060c, B:305:0x0615, B:311:0x0628, B:312:0x063d, B:315:0x064b, B:317:0x0650, B:321:0x062f, B:331:0x0188, B:333:0x0194, B:336:0x019f, B:338:0x01a5, B:340:0x01b3, B:342:0x01c2, B:344:0x01c3, B:345:0x01c4, B:346:0x00fd, B:348:0x0109, B:351:0x0115, B:353:0x011b, B:356:0x0126, B:358:0x012c, B:363:0x0143, B:366:0x014a, B:368:0x0172, B:377:0x0164, B:383:0x016b, B:393:0x067c, B:396:0x068c, B:399:0x0690, B:401:0x069a, B:403:0x06a4, B:404:0x06af, B:407:0x06ac, B:411:0x06c1, B:416:0x06c9, B:420:0x06e7, B:423:0x06ed), top: B:2:0x0006, inners: #1, #2, #8, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027e A[Catch: IOException -> 0x06ee, XmlPullParserException -> 0x06f7, LOOP:1: B:76:0x027e->B:90:0x0527, LOOP_START, PHI: r1 r15
      0x027e: PHI (r1v39 java.lang.String) = (r1v11 java.lang.String), (r1v61 java.lang.String) binds: [B:75:0x027c, B:90:0x0527] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r15v9 com.google.android.gms.internal.ads.zzalr) = (r15v6 com.google.android.gms.internal.ads.zzalr), (r15v33 com.google.android.gms.internal.ads.zzalr) binds: [B:75:0x027c, B:90:0x0527] A[DONT_GENERATE, DONT_INLINE], TryCatch #16 {IOException -> 0x06ee, XmlPullParserException -> 0x06f7, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:17:0x008c, B:20:0x0096, B:23:0x00aa, B:24:0x00c3, B:26:0x00cf, B:27:0x00d3, B:29:0x00df, B:30:0x00e3, B:34:0x017d, B:38:0x01db, B:41:0x01ef, B:43:0x01f5, B:45:0x01fd, B:47:0x0205, B:49:0x020d, B:51:0x0215, B:53:0x021d, B:55:0x0223, B:57:0x022b, B:59:0x0233, B:61:0x0239, B:63:0x023f, B:65:0x0245, B:67:0x024d, B:70:0x0256, B:73:0x06d0, B:74:0x0278, B:76:0x027e, B:78:0x0287, B:80:0x0296, B:82:0x02a1, B:84:0x02b5, B:86:0x02bb, B:88:0x0519, B:98:0x02bf, B:101:0x02c9, B:103:0x02cf, B:105:0x02d8, B:107:0x02de, B:108:0x02e5, B:112:0x02ef, B:116:0x0514, B:117:0x02fb, B:119:0x0303, B:121:0x0309, B:123:0x0311, B:125:0x0317, B:129:0x032c, B:131:0x0332, B:133:0x0342, B:135:0x03b3, B:137:0x03bb, B:139:0x03c1, B:141:0x03c9, B:143:0x03cf, B:147:0x03e4, B:149:0x03ea, B:151:0x03fa, B:152:0x0482, B:154:0x048a, B:163:0x04c5, B:165:0x04cd, B:175:0x0507, B:187:0x0409, B:190:0x040a, B:191:0x040b, B:193:0x0419, B:196:0x0421, B:199:0x0430, B:201:0x0436, B:203:0x0444, B:205:0x045b, B:207:0x045c, B:208:0x045d, B:209:0x046b, B:212:0x034e, B:214:0x034f, B:215:0x0350, B:216:0x035a, B:219:0x0364, B:222:0x036f, B:224:0x0375, B:226:0x0383, B:228:0x0395, B:230:0x0396, B:231:0x0397, B:232:0x03a2, B:236:0x052f, B:238:0x0552, B:244:0x05ec, B:254:0x0573, B:257:0x057c, B:249:0x0661, B:266:0x0590, B:273:0x05a8, B:279:0x05c0, B:284:0x05d3, B:289:0x05e4, B:298:0x0602, B:302:0x060c, B:305:0x0615, B:311:0x0628, B:312:0x063d, B:315:0x064b, B:317:0x0650, B:321:0x062f, B:331:0x0188, B:333:0x0194, B:336:0x019f, B:338:0x01a5, B:340:0x01b3, B:342:0x01c2, B:344:0x01c3, B:345:0x01c4, B:346:0x00fd, B:348:0x0109, B:351:0x0115, B:353:0x011b, B:356:0x0126, B:358:0x012c, B:363:0x0143, B:366:0x014a, B:368:0x0172, B:377:0x0164, B:383:0x016b, B:393:0x067c, B:396:0x068c, B:399:0x0690, B:401:0x069a, B:403:0x06a4, B:404:0x06af, B:407:0x06ac, B:411:0x06c1, B:416:0x06c9, B:420:0x06e7, B:423:0x06ed), top: B:2:0x0006, inners: #1, #2, #8, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0527 A[LOOP:1: B:76:0x027e->B:90:0x0527, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x051f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v44 */
    /* JADX WARN: Type inference failed for: r16v45 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v52 */
    /* JADX WARN: Type inference failed for: r16v53 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.google.android.gms.internal.ads.zzalr] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.google.android.gms.internal.ads.zzalr] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r43v1, types: [com.google.android.gms.internal.ads.zzalw, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.xmlpull.v1.XmlPullParser] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzako zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        ArrayDeque arrayDeque;
        zzalr zzalrVar;
        zzalx zzalxVar;
        int i3;
        zzalr zzalrVar2;
        ?? r2;
        zzalr zzalrVar3;
        zzalr zzalrVar4;
        zzalr zzalrVar5;
        int attributeCount;
        zzalw zzf2;
        ?? r1;
        String str3;
        long j;
        long j2;
        long j3;
        String[] strArr;
        String str4;
        zzalq zzalqVar;
        long j4;
        int i4;
        zzalr zzalrVar6;
        zzalr zzalrVar7;
        zzalr zzalrVar8;
        float f;
        float f2;
        float f3;
        String str5;
        float f4;
        float f5;
        int i5;
        float f6;
        String zza2;
        int i6;
        zzalu zzaluVar;
        String zza3;
        zzalw zzalwVar;
        float f7;
        String zza4;
        zzalw zzalwVar2;
        String zza5;
        float f8;
        zzalr zzalrVar9;
        String group;
        String group2;
        boolean z;
        String zza6;
        String group3;
        String str6 = "";
        String str7 = "http://www.w3.org/ns/ttml#parameter";
        try {
            ?? newPullParser = this.zzi.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new zzalu("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzalr zzalrVar10 = zzh;
            zzalx zzalxVar2 = null;
            zzals zzalsVar = null;
            zzalr zzalrVar11 = zzalrVar10;
            int i7 = 0;
            ?? r16 = 15;
            while (eventType != 1) {
                zzalq zzalqVar2 = (zzalq) arrayDeque2.peek();
                ?? r43 = obj;
                if (i7 == 0) {
                    String name = newPullParser.getName();
                    str = str6;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str7, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str7, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str8 = zzex.zza;
                                zzalxVar = zzalxVar2;
                                zzdd.zze(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f8 = Integer.parseInt(r13[0]) / Integer.parseInt(r13[1]);
                            } else {
                                zzalxVar = zzalxVar2;
                                f8 = 1.0f;
                            }
                            int i8 = zzalrVar10.zzb;
                            float f9 = f8;
                            String attributeValue3 = newPullParser.getAttributeValue(str7, "subFrameRate");
                            if (attributeValue3 != null) {
                                i8 = Integer.parseInt(attributeValue3);
                            }
                            int i9 = zzalrVar10.zzc;
                            zzalrVar = zzalrVar10;
                            String attributeValue4 = newPullParser.getAttributeValue(str7, "tickRate");
                            if (attributeValue4 != null) {
                                i9 = Integer.parseInt(attributeValue4);
                            }
                            zzalr zzalrVar12 = new zzalr(parseInt * f9, i8, i9);
                            String attributeValue5 = newPullParser.getAttributeValue(str7, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = zzg.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        group = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        str2 = str7;
                                    }
                                    if (group == null) {
                                        throw r43;
                                    }
                                    String str9 = group;
                                    int parseInt2 = Integer.parseInt(group);
                                    str2 = str7;
                                    try {
                                        group2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        zzalrVar9 = zzalrVar12;
                                        i3 = i7;
                                        zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        r2 = 15;
                                        zza6 = zzey.zza(newPullParser, "extent");
                                        if (zza6 != null) {
                                        }
                                        zzalsVar = r43;
                                        zzalrVar11 = zzalrVar9;
                                        zzals zzalsVar2 = zzalsVar;
                                        String str10 = "image";
                                        ArrayDeque arrayDeque3 = arrayDeque2;
                                        if (!name.equals("tt")) {
                                        }
                                        if ("head".equals(name)) {
                                        }
                                        zzalrVar11 = zzalrVar7;
                                        zzalsVar = zzalsVar2;
                                        zzalrVar2 = zzalrVar6;
                                        zzalxVar2 = zzalxVar;
                                        r16 = zzalrVar2;
                                        i7 = i3;
                                        newPullParser.next();
                                        eventType = newPullParser.getEventType();
                                        arrayDeque2 = arrayDeque;
                                        str6 = str;
                                        zzalrVar10 = zzalrVar;
                                        str7 = str2;
                                        obj = null;
                                        r16 = r16;
                                    }
                                    if (group2 == null) {
                                        throw r43;
                                    }
                                    String str11 = group2;
                                    r2 = Integer.parseInt(group2);
                                    if (parseInt2 == 0) {
                                        z = false;
                                    } else if (r2 != 0) {
                                        zzalrVar9 = zzalrVar12;
                                        z = true;
                                        ?? sb = new StringBuilder();
                                        i3 = i7;
                                        sb.append("Invalid cell resolution ");
                                        sb.append(parseInt2);
                                        sb.append(" ");
                                        sb.append(r2);
                                        zzdd.zze(z, sb.toString());
                                        zza6 = zzey.zza(newPullParser, "extent");
                                        if (zza6 != null) {
                                            Matcher matcher2 = zzf.matcher(zza6);
                                            if (matcher2.matches()) {
                                                try {
                                                    group3 = matcher2.group(1);
                                                } catch (NumberFormatException unused3) {
                                                    zzea.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(zza6));
                                                }
                                                if (group3 == null) {
                                                    throw r43;
                                                }
                                                String str12 = group3;
                                                int parseInt3 = Integer.parseInt(group3);
                                                String group4 = matcher2.group(2);
                                                if (group4 == null) {
                                                    throw r43;
                                                }
                                                String str13 = group4;
                                                zzalsVar = new zzals(parseInt3, Integer.parseInt(group4));
                                                zzalrVar11 = zzalrVar9;
                                            } else {
                                                zzea.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(zza6));
                                            }
                                        }
                                        zzalsVar = r43;
                                        zzalrVar11 = zzalrVar9;
                                    } else {
                                        r2 = 0;
                                        z = false;
                                    }
                                    zzalrVar9 = zzalrVar12;
                                    ?? sb2 = new StringBuilder();
                                    i3 = i7;
                                    sb2.append("Invalid cell resolution ");
                                    sb2.append(parseInt2);
                                    sb2.append(" ");
                                    sb2.append(r2);
                                    zzdd.zze(z, sb2.toString());
                                    zza6 = zzey.zza(newPullParser, "extent");
                                    if (zza6 != null) {
                                    }
                                    zzalsVar = r43;
                                    zzalrVar11 = zzalrVar9;
                                } else {
                                    zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str7;
                            zzalrVar9 = zzalrVar12;
                            i3 = i7;
                            r2 = 15;
                            zza6 = zzey.zza(newPullParser, "extent");
                            if (zza6 != null) {
                            }
                            zzalsVar = r43;
                            zzalrVar11 = zzalrVar9;
                        } else {
                            str2 = str7;
                            zzalrVar = zzalrVar10;
                            zzalxVar = zzalxVar2;
                            i3 = i7;
                            r2 = r16;
                        }
                        zzals zzalsVar22 = zzalsVar;
                        String str102 = "image";
                        ArrayDeque arrayDeque32 = arrayDeque2;
                        if (!name.equals("tt") && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) && !name.equals("information")) {
                            zzea.zze("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            r16 = r2;
                            zzalsVar = zzalsVar22;
                            zzalxVar2 = zzalxVar;
                            arrayDeque = arrayDeque32;
                            i7 = 1;
                            newPullParser.next();
                            eventType = newPullParser.getEventType();
                            arrayDeque2 = arrayDeque;
                            str6 = str;
                            zzalrVar10 = zzalrVar;
                            str7 = str2;
                            obj = null;
                            r16 = r16;
                        }
                        if ("head".equals(name)) {
                            zzalr zzalrVar13 = zzalrVar11;
                            try {
                                attributeCount = newPullParser.getAttributeCount();
                                zzf2 = zzf(newPullParser, r43);
                                r1 = 0;
                                str3 = str;
                                j = -9223372036854775807L;
                                j2 = -9223372036854775807L;
                                j3 = -9223372036854775807L;
                                strArr = null;
                                str4 = null;
                            } catch (zzakp e) {
                                e = e;
                            }
                            while (r1 < attributeCount) {
                                String attributeName = newPullParser.getAttributeName(r1);
                                String attributeValue6 = newPullParser.getAttributeValue(r1);
                                switch (attributeName.hashCode()) {
                                    case -934795532:
                                        i4 = r1;
                                        r1 = zzalrVar13;
                                        zzalrVar13 = r2;
                                        if (attributeName.equals("region") && hashMap2.containsKey(attributeValue6)) {
                                            str3 = attributeValue6;
                                        }
                                        zzalr zzalrVar14 = zzalrVar13;
                                        zzalrVar13 = r1;
                                        r1 = i4 + 1;
                                        r2 = zzalrVar14;
                                        break;
                                    case 99841:
                                        i4 = r1;
                                        r1 = zzalrVar13;
                                        zzalrVar13 = r2;
                                        if (attributeName.equals("dur")) {
                                            j3 = zzc(attributeValue6, r1);
                                        }
                                        zzalr zzalrVar142 = zzalrVar13;
                                        zzalrVar13 = r1;
                                        r1 = i4 + 1;
                                        r2 = zzalrVar142;
                                    case 100571:
                                        i4 = r1;
                                        r1 = zzalrVar13;
                                        zzalrVar13 = r2;
                                        if (attributeName.equals("end")) {
                                            try {
                                                j = zzc(attributeValue6, r1);
                                            } catch (zzakp e2) {
                                                e = e2;
                                                zzalrVar5 = r1;
                                                zzalrVar4 = zzalrVar13;
                                                arrayDeque = arrayDeque32;
                                                zzea.zzg("TtmlParser", "Suppressing parser error", e);
                                                zzalrVar11 = zzalrVar5;
                                                zzalsVar = zzalsVar22;
                                                zzalxVar2 = zzalxVar;
                                                r16 = zzalrVar4;
                                                i7 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque2 = arrayDeque;
                                                str6 = str;
                                                zzalrVar10 = zzalrVar;
                                                str7 = str2;
                                                obj = null;
                                                r16 = r16;
                                            }
                                        }
                                        zzalr zzalrVar1422 = zzalrVar13;
                                        zzalrVar13 = r1;
                                        r1 = i4 + 1;
                                        r2 = zzalrVar1422;
                                    case 93616297:
                                        i4 = r1;
                                        if (attributeName.equals("begin")) {
                                            zzalrVar3 = zzalrVar13;
                                            try {
                                                j2 = zzc(attributeValue6, zzalrVar3);
                                                r1 = zzalrVar3;
                                                zzalrVar13 = r2;
                                                zzalr zzalrVar14222 = zzalrVar13;
                                                zzalrVar13 = r1;
                                                r1 = i4 + 1;
                                                r2 = zzalrVar14222;
                                            } catch (zzakp e3) {
                                                e = e3;
                                                zzalrVar4 = r2;
                                                zzalrVar5 = zzalrVar3;
                                                arrayDeque = arrayDeque32;
                                                zzea.zzg("TtmlParser", "Suppressing parser error", e);
                                                zzalrVar11 = zzalrVar5;
                                                zzalsVar = zzalsVar22;
                                                zzalxVar2 = zzalxVar;
                                                r16 = zzalrVar4;
                                                i7 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque2 = arrayDeque;
                                                str6 = str;
                                                zzalrVar10 = zzalrVar;
                                                str7 = str2;
                                                obj = null;
                                                r16 = r16;
                                            }
                                        }
                                        r1 = zzalrVar13;
                                        zzalrVar13 = r2;
                                        zzalr zzalrVar142222 = zzalrVar13;
                                        zzalrVar13 = r1;
                                        r1 = i4 + 1;
                                        r2 = zzalrVar142222;
                                    case 109780401:
                                        i4 = r1;
                                        if (attributeName.equals("style")) {
                                            String[] zzg2 = zzg(attributeValue6);
                                            if (zzg2.length > 0) {
                                                strArr = zzg2;
                                            }
                                        }
                                        r1 = zzalrVar13;
                                        zzalrVar13 = r2;
                                        zzalr zzalrVar1422222 = zzalrVar13;
                                        zzalrVar13 = r1;
                                        r1 = i4 + 1;
                                        r2 = zzalrVar1422222;
                                    case 1292595405:
                                        i4 = r1;
                                        if (attributeName.equals("backgroundImage")) {
                                            try {
                                                if (attributeValue6.startsWith("#")) {
                                                    str4 = attributeValue6.substring(1);
                                                }
                                            } catch (zzakp e4) {
                                                e = e4;
                                                zzalrVar3 = zzalrVar13;
                                                zzalrVar4 = r2;
                                                zzalrVar5 = zzalrVar3;
                                                arrayDeque = arrayDeque32;
                                                zzea.zzg("TtmlParser", "Suppressing parser error", e);
                                                zzalrVar11 = zzalrVar5;
                                                zzalsVar = zzalsVar22;
                                                zzalxVar2 = zzalxVar;
                                                r16 = zzalrVar4;
                                                i7 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                arrayDeque2 = arrayDeque;
                                                str6 = str;
                                                zzalrVar10 = zzalrVar;
                                                str7 = str2;
                                                obj = null;
                                                r16 = r16;
                                            }
                                        }
                                        r1 = zzalrVar13;
                                        zzalrVar13 = r2;
                                        zzalr zzalrVar14222222 = zzalrVar13;
                                        zzalrVar13 = r1;
                                        r1 = i4 + 1;
                                        r2 = zzalrVar14222222;
                                    default:
                                        i4 = r1;
                                        r1 = zzalrVar13;
                                        zzalrVar13 = r2;
                                        zzalr zzalrVar142222222 = zzalrVar13;
                                        zzalrVar13 = r1;
                                        r1 = i4 + 1;
                                        r2 = zzalrVar142222222;
                                }
                                newPullParser.next();
                                eventType = newPullParser.getEventType();
                                arrayDeque2 = arrayDeque;
                                str6 = str;
                                zzalrVar10 = zzalrVar;
                                str7 = str2;
                                obj = null;
                                r16 = r16;
                            }
                            zzalrVar5 = zzalrVar13;
                            zzalrVar4 = r2;
                            if (zzalqVar2 != null) {
                                long j5 = zzalqVar2.zzd;
                                if (j5 != -9223372036854775807L) {
                                    j2 = j2 != -9223372036854775807L ? j2 + j5 : -9223372036854775807L;
                                    if (j != -9223372036854775807L) {
                                        j += j5;
                                    } else {
                                        zzalqVar = zzalqVar2;
                                        j = -9223372036854775807L;
                                    }
                                }
                                zzalqVar = zzalqVar2;
                            } else {
                                zzalqVar = null;
                            }
                            if (j != -9223372036854775807L) {
                                j4 = j;
                            } else if (j3 != -9223372036854775807L) {
                                j4 = j2 + j3;
                            } else {
                                if (zzalqVar != null) {
                                    long j6 = zzalqVar.zze;
                                    if (j6 != -9223372036854775807L) {
                                        j4 = j6;
                                    }
                                }
                                j4 = -9223372036854775807L;
                            }
                            zzalq zzb2 = zzalq.zzb(newPullParser.getName(), j2, j4, zzf2, strArr, str3, str4, zzalqVar);
                            arrayDeque = arrayDeque32;
                            arrayDeque.push(zzb2);
                            zzalrVar7 = zzalrVar5;
                            zzalrVar6 = zzalrVar4;
                            if (zzalqVar2 != null) {
                                zzalqVar2.zzf(zzb2);
                                zzalrVar7 = zzalrVar5;
                                zzalrVar6 = zzalrVar4;
                            }
                        } else {
                            while (true) {
                                newPullParser.next();
                                if (zzey.zzc(newPullParser, "style")) {
                                    String zza7 = zzey.zza(newPullParser, "style");
                                    zzalw zzf3 = zzf(newPullParser, new zzalw());
                                    if (zza7 != null) {
                                        String[] zzg3 = zzg(zza7);
                                        zzalrVar8 = zzalrVar11;
                                        int i10 = 0;
                                        for (int length = zzg3.length; i10 < length; length = length) {
                                            zzf3.zzl((zzalw) hashMap.get(zzg3[i10]));
                                            i10++;
                                        }
                                    } else {
                                        zzalrVar8 = zzalrVar11;
                                    }
                                    String zzH = zzf3.zzH();
                                    if (zzH != null) {
                                        hashMap.put(zzH, zzf3);
                                    }
                                } else {
                                    zzalrVar8 = zzalrVar11;
                                    if (zzey.zzc(newPullParser, "region")) {
                                        String zza8 = zzey.zza(newPullParser, FacebookMediationAdapter.KEY_ID);
                                        if (zza8 != null) {
                                            String zza9 = zzey.zza(newPullParser, "origin");
                                            if (zza9 == null && (zza4 = zzey.zza(newPullParser, "style")) != null && (zzalwVar2 = (zzalw) hashMap.get(zza4)) != null) {
                                                zza9 = zzalwVar2.zzI();
                                            }
                                            if (zza9 != null) {
                                                Matcher matcher3 = zzb.matcher(zza9);
                                                Matcher matcher4 = zzf.matcher(zza9);
                                                if (matcher3.matches()) {
                                                    f = 100.0f;
                                                    try {
                                                        String group5 = matcher3.group(1);
                                                        if (group5 == null) {
                                                            throw r43;
                                                        }
                                                        String str14 = group5;
                                                        f7 = Float.parseFloat(group5) / 100.0f;
                                                        String group6 = matcher3.group(2);
                                                        if (group6 == null) {
                                                            throw r43;
                                                        }
                                                        String str15 = group6;
                                                        f2 = Float.parseFloat(group6) / 100.0f;
                                                        f3 = f7;
                                                    } catch (NumberFormatException unused4) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(zza9));
                                                    }
                                                } else {
                                                    f = 100.0f;
                                                    if (!matcher4.matches()) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(zza9));
                                                    } else if (zzalsVar22 == null) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(zza9));
                                                    } else {
                                                        try {
                                                            String group7 = matcher4.group(1);
                                                            if (group7 == null) {
                                                                throw r43;
                                                            }
                                                            String str16 = group7;
                                                            int parseInt4 = Integer.parseInt(group7);
                                                            String group8 = matcher4.group(2);
                                                            if (group8 == null) {
                                                                throw r43;
                                                            }
                                                            String str17 = group8;
                                                            f7 = parseInt4 / zzalsVar22.zza;
                                                            f2 = Integer.parseInt(group8) / zzalsVar22.zzb;
                                                            f3 = f7;
                                                        } catch (NumberFormatException unused5) {
                                                            zzea.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(zza9));
                                                        }
                                                    }
                                                }
                                            } else {
                                                f = 100.0f;
                                                f2 = 0.0f;
                                                f3 = 0.0f;
                                            }
                                            String zza10 = zzey.zza(newPullParser, "extent");
                                            if (zza10 == null && (zza3 = zzey.zza(newPullParser, "style")) != null && (zzalwVar = (zzalw) hashMap.get(zza3)) != null) {
                                                zza10 = zzalwVar.zzF();
                                            }
                                            if (zza10 != null) {
                                                Matcher matcher5 = zzb.matcher(zza10);
                                                str5 = str102;
                                                Matcher matcher6 = zzf.matcher(zza10);
                                                if (matcher5.matches()) {
                                                    try {
                                                        String group9 = matcher5.group(1);
                                                        if (group9 == null) {
                                                            throw r43;
                                                        }
                                                        String str18 = group9;
                                                        float parseFloat = Float.parseFloat(group9) / f;
                                                        String group10 = matcher5.group(2);
                                                        if (group10 == null) {
                                                            throw r43;
                                                        }
                                                        String str19 = group10;
                                                        f5 = Float.parseFloat(group10) / f;
                                                        f4 = parseFloat;
                                                    } catch (NumberFormatException unused6) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(zza9)));
                                                    }
                                                } else {
                                                    if (!matcher6.matches()) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(zza9)));
                                                    } else if (zzalsVar22 == null) {
                                                        zzea.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(zza9)));
                                                    } else {
                                                        try {
                                                            String group11 = matcher6.group(1);
                                                            if (group11 == null) {
                                                                throw r43;
                                                            }
                                                            String str20 = group11;
                                                            int parseInt5 = Integer.parseInt(group11);
                                                            String group12 = matcher6.group(2);
                                                            if (group12 == null) {
                                                                throw r43;
                                                            }
                                                            String str21 = group12;
                                                            f5 = Integer.parseInt(group12) / zzalsVar22.zzb;
                                                            f4 = parseInt5 / zzalsVar22.zza;
                                                        } catch (NumberFormatException unused7) {
                                                            zzea.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(zza9)));
                                                        }
                                                    }
                                                    zzaluVar = r43;
                                                }
                                                if (zzaluVar != null) {
                                                    hashMap2.put(zzaluVar.zza, zzaluVar);
                                                }
                                                if (zzey.zzb(newPullParser, "head")) {
                                                    zzalrVar7 = zzalrVar8;
                                                    zzalrVar6 = r2;
                                                    arrayDeque = arrayDeque32;
                                                } else {
                                                    zzalrVar11 = zzalrVar8;
                                                    str102 = str5;
                                                }
                                            } else {
                                                str5 = str102;
                                                f4 = 1.0f;
                                                f5 = 1.0f;
                                            }
                                            String zza11 = zzey.zza(newPullParser, "displayAlign");
                                            if (zza11 != null) {
                                                String zza12 = zzfuv.zza(zza11);
                                                int hashCode = zza12.hashCode();
                                                if (hashCode != -1364013995) {
                                                    if (hashCode == 92734940 && zza12.equals("after")) {
                                                        f6 = f2 + f5;
                                                        i5 = 2;
                                                        float f10 = 1.0f / ((float) r2);
                                                        zza2 = zzey.zza(newPullParser, "writingMode");
                                                        if (zza2 != null) {
                                                            String zza13 = zzfuv.zza(zza2);
                                                            int hashCode2 = zza13.hashCode();
                                                            if (hashCode2 != 3694) {
                                                                if (hashCode2 != 3553396) {
                                                                    if (hashCode2 == 3553576 && zza13.equals("tbrl")) {
                                                                        i6 = 1;
                                                                    }
                                                                }
                                                            }
                                                            zzaluVar = new zzalu(zza8, f3, f6, 0, i5, f4, f5, 1, f10, i6);
                                                            if (zzaluVar != null) {
                                                            }
                                                            if (zzey.zzb(newPullParser, "head")) {
                                                            }
                                                        }
                                                        i6 = Integer.MIN_VALUE;
                                                        zzaluVar = new zzalu(zza8, f3, f6, 0, i5, f4, f5, 1, f10, i6);
                                                        if (zzaluVar != null) {
                                                        }
                                                        if (zzey.zzb(newPullParser, "head")) {
                                                        }
                                                    }
                                                } else if (zza12.equals("center")) {
                                                    f6 = f2 + (f5 / 2.0f);
                                                    i5 = 1;
                                                    float f102 = 1.0f / ((float) r2);
                                                    zza2 = zzey.zza(newPullParser, "writingMode");
                                                    if (zza2 != null) {
                                                    }
                                                    i6 = Integer.MIN_VALUE;
                                                    zzaluVar = new zzalu(zza8, f3, f6, 0, i5, f4, f5, 1, f102, i6);
                                                    if (zzaluVar != null) {
                                                    }
                                                    if (zzey.zzb(newPullParser, "head")) {
                                                    }
                                                }
                                            }
                                            i5 = 0;
                                            f6 = f2;
                                            float f1022 = 1.0f / ((float) r2);
                                            zza2 = zzey.zza(newPullParser, "writingMode");
                                            if (zza2 != null) {
                                            }
                                            i6 = Integer.MIN_VALUE;
                                            zzaluVar = new zzalu(zza8, f3, f6, 0, i5, f4, f5, 1, f1022, i6);
                                            if (zzaluVar != null) {
                                            }
                                            if (zzey.zzb(newPullParser, "head")) {
                                            }
                                        }
                                        zzaluVar = r43;
                                        str5 = str102;
                                        if (zzaluVar != null) {
                                        }
                                        if (zzey.zzb(newPullParser, "head")) {
                                        }
                                    } else if (zzey.zzc(newPullParser, "metadata")) {
                                        do {
                                            newPullParser.next();
                                            if (zzey.zzc(newPullParser, str102) && (zza5 = zzey.zza(newPullParser, FacebookMediationAdapter.KEY_ID)) != null) {
                                                hashMap3.put(zza5, newPullParser.nextText());
                                            }
                                        } while (!zzey.zzb(newPullParser, "metadata"));
                                    }
                                }
                                str5 = str102;
                                if (zzey.zzb(newPullParser, "head")) {
                                }
                            }
                        }
                        zzalrVar11 = zzalrVar7;
                        zzalsVar = zzalsVar22;
                        zzalrVar2 = zzalrVar6;
                    } else {
                        str2 = str7;
                        arrayDeque = arrayDeque2;
                        zzalrVar = zzalrVar10;
                        zzalxVar = zzalxVar2;
                        i3 = i7;
                        if (eventType != 4) {
                            zzalrVar2 = r16;
                            if (eventType == 3) {
                                if (newPullParser.getName().equals("tt")) {
                                    zzalq zzalqVar3 = (zzalq) arrayDeque.peek();
                                    if (zzalqVar3 == null) {
                                        throw null;
                                    }
                                    zzalq zzalqVar4 = zzalqVar3;
                                    zzalxVar2 = new zzalx(zzalqVar3, hashMap, hashMap2, hashMap3);
                                } else {
                                    zzalxVar2 = zzalxVar;
                                }
                                arrayDeque.pop();
                                r16 = r16;
                            }
                        } else {
                            if (zzalqVar2 == null) {
                                throw null;
                            }
                            zzalq zzalqVar5 = zzalqVar2;
                            zzalqVar2.zzf(zzalq.zzc(newPullParser.getText()));
                            zzalrVar2 = r16;
                        }
                    }
                    zzalxVar2 = zzalxVar;
                    r16 = zzalrVar2;
                } else {
                    str = str6;
                    str2 = str7;
                    arrayDeque = arrayDeque2;
                    zzalrVar = zzalrVar10;
                    zzalxVar = zzalxVar2;
                    i3 = i7;
                    if (eventType == 2) {
                        i7 = i3 + 1;
                    } else {
                        zzalrVar2 = r16;
                        if (eventType == 3) {
                            i7 = i3 - 1;
                        }
                        zzalxVar2 = zzalxVar;
                        r16 = zzalrVar2;
                    }
                    zzalxVar2 = zzalxVar;
                    newPullParser.next();
                    eventType = newPullParser.getEventType();
                    arrayDeque2 = arrayDeque;
                    str6 = str;
                    zzalrVar10 = zzalrVar;
                    str7 = str2;
                    obj = null;
                    r16 = r16;
                }
                i7 = i3;
                newPullParser.next();
                eventType = newPullParser.getEventType();
                arrayDeque2 = arrayDeque;
                str6 = str;
                zzalrVar10 = zzalrVar;
                str7 = str2;
                obj = null;
                r16 = r16;
            }
            zzalx zzalxVar3 = zzalxVar2;
            if (zzalxVar3 != null) {
                return zzalxVar3;
            }
            throw null;
        } catch (IOException e5) {
            throw new IllegalStateException("Unexpected error when reading input.", e5);
        } catch (XmlPullParserException e6) {
            throw new IllegalStateException("Unable to decode source", e6);
        }
    }

    public zzalt() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
