package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class D implements I {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f8131m = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: n, reason: collision with root package name */
    public static final C1390oj f8132n = new C1390oj((C) new C1543s1(13));

    /* renamed from: o, reason: collision with root package name */
    public static final C1390oj f8133o = new C1390oj((C) new C1543s1(14));

    /* renamed from: k, reason: collision with root package name */
    public C1761wv f8134k;

    /* renamed from: l, reason: collision with root package name */
    public final C1543s1 f8135l = new C1543s1(21);

    public final void a(int i, ArrayList arrayList) {
        C1543s1 c1543s1 = this.f8135l;
        switch (i) {
            case 0:
                arrayList.add(new E1(1));
                break;
            case 1:
                arrayList.add(new E1(2));
                break;
            case 2:
                arrayList.add(new B2());
                break;
            case 3:
                arrayList.add(new C0871d0());
                break;
            case 4:
                F e3 = f8132n.e(0);
                if (e3 == null) {
                    arrayList.add(new C1408p0());
                    break;
                } else {
                    arrayList.add(e3);
                    break;
                }
            case 5:
                arrayList.add(new C1497r0());
                break;
            case 6:
                arrayList.add(new C0738a1(new Y0(), 0, c1543s1));
                break;
            case 7:
                arrayList.add(new C0916e1());
                break;
            case 8:
                arrayList.add(new C1498r1(c1543s1, 0, C1761wv.f16184o));
                arrayList.add(new C1633u1(c1543s1, 0));
                break;
            case 9:
                arrayList.add(new E1(0));
                break;
            case 10:
                arrayList.add(new X2());
                break;
            case 11:
                if (this.f8134k == null) {
                    C0954ev c0954ev = AbstractC1044gv.f13676l;
                    this.f8134k = C1761wv.f16184o;
                }
                arrayList.add(new C0740a3(c1543s1, new Kn(), new C1529ro(3, this.f8134k)));
                break;
            case 12:
                C1098i3 c1098i3 = new C1098i3();
                c1098i3.f13865c = 0;
                c1098i3.f13866d = -1L;
                c1098i3.f = -1;
                c1098i3.f13868g = -1L;
                arrayList.add(c1098i3);
                break;
            case 14:
                arrayList.add(new C1318n0(2));
                break;
            case 15:
                F e5 = f8133o.e(new Object[0]);
                if (e5 != null) {
                    arrayList.add(e5);
                    break;
                }
                break;
            case 16:
                arrayList.add(new C0960f0(c1543s1));
                break;
            case 17:
                arrayList.add(new C1318n0(1));
                break;
            case 18:
                arrayList.add(new C1273m0(2));
                break;
            case 19:
                arrayList.add(new C1318n0(0));
                break;
            case 20:
                arrayList.add(new C1273m0(1));
                break;
            case C1639u7.zzm /* 21 */:
                arrayList.add(new C1273m0(0));
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x03b5, code lost:
    
        if (r14 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03b7, code lost:
    
        a(r14, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0201 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b7, B:21:0x03ba, B:23:0x03bf, B:26:0x03c5, B:28:0x03c8, B:32:0x03cb, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0386, B:117:0x038e, B:119:0x0399, B:121:0x03a1, B:124:0x03aa, B:139:0x0050, B:140:0x0058, B:143:0x01c8, B:166:0x005d, B:169:0x0069, B:172:0x0075, B:175:0x0081, B:178:0x008d, B:181:0x0098, B:184:0x00a3, B:187:0x00ae, B:190:0x00b9, B:193:0x00c5, B:196:0x00d1, B:199:0x00dc, B:202:0x00e7, B:205:0x00f2, B:208:0x00fd, B:211:0x0109, B:214:0x0115, B:217:0x0121, B:220:0x012d, B:223:0x0139, B:226:0x0145, B:229:0x0151, B:232:0x015c, B:235:0x0168, B:238:0x0173, B:241:0x017e, B:244:0x0189, B:247:0x0194, B:250:0x019f, B:253:0x01a9, B:256:0x01b3, B:259:0x01bd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03bf A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b7, B:21:0x03ba, B:23:0x03bf, B:26:0x03c5, B:28:0x03c8, B:32:0x03cb, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0386, B:117:0x038e, B:119:0x0399, B:121:0x03a1, B:124:0x03aa, B:139:0x0050, B:140:0x0058, B:143:0x01c8, B:166:0x005d, B:169:0x0069, B:172:0x0075, B:175:0x0081, B:178:0x008d, B:181:0x0098, B:184:0x00a3, B:187:0x00ae, B:190:0x00b9, B:193:0x00c5, B:196:0x00d1, B:199:0x00dc, B:202:0x00e7, B:205:0x00f2, B:208:0x00fd, B:211:0x0109, B:214:0x0115, B:217:0x0121, B:220:0x012d, B:223:0x0139, B:226:0x0145, B:229:0x0151, B:232:0x015c, B:235:0x0168, B:238:0x0173, B:241:0x017e, B:244:0x0189, B:247:0x0194, B:250:0x019f, B:253:0x01a9, B:256:0x01b3, B:259:0x01bd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x0201, B:15:0x0204, B:20:0x03b7, B:21:0x03ba, B:23:0x03bf, B:26:0x03c5, B:28:0x03c8, B:32:0x03cb, B:37:0x020d, B:39:0x0215, B:41:0x0220, B:44:0x022b, B:46:0x0233, B:48:0x023e, B:51:0x0249, B:54:0x0254, B:57:0x025f, B:59:0x0267, B:61:0x026f, B:63:0x027b, B:65:0x0289, B:67:0x0295, B:70:0x02a0, B:72:0x02a8, B:74:0x02b6, B:76:0x02c4, B:78:0x02d6, B:80:0x02e4, B:82:0x02f0, B:84:0x02f8, B:86:0x0300, B:88:0x0308, B:90:0x0314, B:92:0x031c, B:94:0x032e, B:96:0x0336, B:98:0x0341, B:100:0x0349, B:102:0x0355, B:104:0x035d, B:106:0x0368, B:109:0x0372, B:112:0x037c, B:115:0x0386, B:117:0x038e, B:119:0x0399, B:121:0x03a1, B:124:0x03aa, B:139:0x0050, B:140:0x0058, B:143:0x01c8, B:166:0x005d, B:169:0x0069, B:172:0x0075, B:175:0x0081, B:178:0x008d, B:181:0x0098, B:184:0x00a3, B:187:0x00ae, B:190:0x00b9, B:193:0x00c5, B:196:0x00d1, B:199:0x00dc, B:202:0x00e7, B:205:0x00f2, B:208:0x00fd, B:211:0x0109, B:214:0x0115, B:217:0x0121, B:220:0x012d, B:223:0x0139, B:226:0x0145, B:229:0x0151, B:232:0x015c, B:235:0x0168, B:238:0x0173, B:241:0x017e, B:244:0x0189, B:247:0x0194, B:250:0x019f, B:253:0x01a9, B:256:0x01b3, B:259:0x01bd), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized F[] e(Uri uri, Map map) {
        ArrayList arrayList;
        char c5;
        int i;
        String lastPathSegment;
        int i5;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i6 = 20;
            if (str != null) {
                String e3 = AbstractC1593t6.e(str);
                switch (e3.hashCode()) {
                    case -2123537834:
                        if (e3.equals("audio/eac3-joc")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1662384011:
                        if (e3.equals("video/mp2p")) {
                            c5 = 20;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1662384007:
                        if (e3.equals("video/mp2t")) {
                            c5 = 21;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1662095187:
                        if (e3.equals("video/webm")) {
                            c5 = '\f';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1606874997:
                        if (e3.equals("audio/amr-wb")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1487656890:
                        if (e3.equals("image/avif")) {
                            c5 = 31;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1487464693:
                        if (e3.equals("image/heic")) {
                            c5 = 30;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1487464690:
                        if (e3.equals("image/heif")) {
                            c5 = 29;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1487394660:
                        if (e3.equals("image/jpeg")) {
                            c5 = 24;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1487018032:
                        if (e3.equals("image/webp")) {
                            c5 = 27;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1248337486:
                        if (e3.equals("application/mp4")) {
                            c5 = 18;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1079884372:
                        if (e3.equals("video/x-msvideo")) {
                            c5 = 25;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1004728940:
                        if (e3.equals("text/vtt")) {
                            c5 = 23;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -879272239:
                        if (e3.equals("image/bmp")) {
                            c5 = 28;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -879258763:
                        if (e3.equals("image/png")) {
                            c5 = 26;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -387023398:
                        if (e3.equals("audio/x-matroska")) {
                            c5 = 11;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -43467528:
                        if (e3.equals("application/webm")) {
                            c5 = 14;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 13915911:
                        if (e3.equals("video/x-flv")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 187078296:
                        if (e3.equals("audio/ac3")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 187078297:
                        if (e3.equals("audio/ac4")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 187078669:
                        if (e3.equals("audio/amr")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 187090232:
                        if (e3.equals("audio/mp4")) {
                            c5 = 17;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 187091926:
                        if (e3.equals("audio/ogg")) {
                            c5 = 19;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 187099443:
                        if (e3.equals("audio/wav")) {
                            c5 = 22;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1331848029:
                        if (e3.equals("video/mp4")) {
                            c5 = 16;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1503095341:
                        if (e3.equals("audio/3gpp")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1504578661:
                        if (e3.equals("audio/eac3")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1504619009:
                        if (e3.equals("audio/flac")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1504824762:
                        if (e3.equals("audio/midi")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1504831518:
                        if (e3.equals("audio/mpeg")) {
                            c5 = 15;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1505118770:
                        if (e3.equals("audio/webm")) {
                            c5 = '\r';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 2039520277:
                        if (e3.equals("video/x-matroska")) {
                            c5 = '\n';
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                    case 1:
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 3;
                        break;
                    case 7:
                        i = 4;
                        break;
                    case '\b':
                        i = 5;
                        break;
                    case '\t':
                        i = 15;
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        i = 6;
                        break;
                    case 15:
                        i = 7;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i = 8;
                        break;
                    case 19:
                        i = 9;
                        break;
                    case 20:
                        i = 10;
                        break;
                    case C1639u7.zzm /* 21 */:
                        i = 11;
                        break;
                    case 22:
                        i = 12;
                        break;
                    case 23:
                        i = 13;
                        break;
                    case 24:
                        i = 14;
                        break;
                    case 25:
                        i = 16;
                        break;
                    case 26:
                        i = 17;
                        break;
                    case 27:
                        i = 18;
                        break;
                    case 28:
                        i = 19;
                        break;
                    case 29:
                    case 30:
                        i = 20;
                        break;
                    case 31:
                        i = 21;
                        break;
                }
                if (i != -1) {
                    a(i, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                        i6 = 0;
                    } else if (lastPathSegment.endsWith(".ac4")) {
                        i6 = 1;
                    } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        i6 = 2;
                    } else if (lastPathSegment.endsWith(".amr")) {
                        i6 = 3;
                    } else if (lastPathSegment.endsWith(".flac")) {
                        i6 = 4;
                    } else if (lastPathSegment.endsWith(".flv")) {
                        i6 = 5;
                    } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        i6 = 15;
                    } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        i6 = 6;
                    } else if (lastPathSegment.endsWith(".mp3")) {
                        i6 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i6 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i6 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i6 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i6 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i6 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i6 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i6 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i6 = 16;
                    } else if (lastPathSegment.endsWith(".png")) {
                        i6 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i6 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i6 = 19;
                    } else if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                        if (lastPathSegment.endsWith(".avif")) {
                            i6 = 21;
                        }
                    }
                    int[] iArr = f8131m;
                    for (i5 = 0; i5 < 21; i5++) {
                        int i7 = iArr[i5];
                        if (i7 != i && i7 != i6) {
                            a(i7, arrayList);
                        }
                    }
                }
                i6 = -1;
                int[] iArr2 = f8131m;
                while (i5 < 21) {
                }
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i6 = -1;
            int[] iArr22 = f8131m;
            while (i5 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (F[]) arrayList.toArray(new F[arrayList.size()]);
    }
}
