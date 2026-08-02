package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import game.betting133.sports1xbet.R;
import java.util.Collections;
import java.util.Map;
import k4.AbstractC2036a;
import r.C2327e;
import r3.C2350b;

/* loaded from: classes.dex */
public final class B9 implements InterfaceC1821y9 {

    /* renamed from: n, reason: collision with root package name */
    public static final Map f7781n;

    /* renamed from: k, reason: collision with root package name */
    public final P2.a f7782k;

    /* renamed from: l, reason: collision with root package name */
    public final C1876zb f7783l;

    /* renamed from: m, reason: collision with root package name */
    public final Qt f7784m;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        C2327e c2327e = new C2327e(7);
        for (int i = 0; i < 7; i++) {
            c2327e.put(strArr[i], numArr[i]);
        }
        f7781n = Collections.unmodifiableMap(c2327e);
    }

    public B9(P2.a aVar, C1876zb c1876zb, Qt qt) {
        this.f7782k = aVar;
        this.f7783l = c1876zb;
        this.f7784m = qt;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0450 A[Catch: all -> 0x01c9, TryCatch #0 {all -> 0x01c9, blocks: (B:90:0x01be, B:92:0x01c2, B:93:0x01c7, B:95:0x01cc, B:97:0x01d6, B:98:0x01db, B:100:0x01dd, B:102:0x01eb, B:103:0x01f0, B:105:0x01f2, B:107:0x01fc, B:108:0x0201, B:110:0x0203, B:112:0x0211, B:113:0x0223, B:115:0x0231, B:116:0x0243, B:118:0x0251, B:119:0x0263, B:121:0x0271, B:122:0x0283, B:124:0x0291, B:125:0x029f, B:127:0x02ad, B:128:0x02af, B:130:0x02b3, B:132:0x02b7, B:134:0x02bf, B:137:0x02c7, B:140:0x0300, B:145:0x030e, B:148:0x0450, B:149:0x0455, B:151:0x0457, B:153:0x0471, B:155:0x0475, B:157:0x0480, B:158:0x04b5, B:172:0x0566, B:173:0x0599, B:175:0x05b2, B:176:0x05cc, B:178:0x05d4, B:179:0x05e3, B:180:0x0608, B:184:0x060b, B:186:0x0629, B:187:0x063c, B:189:0x056d, B:190:0x0574, B:191:0x057d, B:192:0x0584, B:193:0x058a, B:194:0x0593, B:211:0x04b2, B:212:0x063e, B:213:0x0643, B:215:0x0318, B:217:0x031c, B:230:0x0373, B:231:0x037d, B:233:0x03d0, B:235:0x03d4, B:237:0x03d8, B:240:0x03e0, B:241:0x0381, B:242:0x038b, B:243:0x0392, B:244:0x039e, B:245:0x03a6, B:246:0x03b9, B:247:0x03c6, B:264:0x03ef, B:267:0x042b, B:270:0x043b, B:271:0x0431, B:273:0x0439, B:274:0x0422, B:276:0x0428, B:279:0x0440, B:281:0x0447, B:282:0x0645, B:283:0x064a, B:285:0x064c, B:286:0x0651), top: B:89:0x01be, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0457 A[Catch: all -> 0x01c9, TryCatch #0 {all -> 0x01c9, blocks: (B:90:0x01be, B:92:0x01c2, B:93:0x01c7, B:95:0x01cc, B:97:0x01d6, B:98:0x01db, B:100:0x01dd, B:102:0x01eb, B:103:0x01f0, B:105:0x01f2, B:107:0x01fc, B:108:0x0201, B:110:0x0203, B:112:0x0211, B:113:0x0223, B:115:0x0231, B:116:0x0243, B:118:0x0251, B:119:0x0263, B:121:0x0271, B:122:0x0283, B:124:0x0291, B:125:0x029f, B:127:0x02ad, B:128:0x02af, B:130:0x02b3, B:132:0x02b7, B:134:0x02bf, B:137:0x02c7, B:140:0x0300, B:145:0x030e, B:148:0x0450, B:149:0x0455, B:151:0x0457, B:153:0x0471, B:155:0x0475, B:157:0x0480, B:158:0x04b5, B:172:0x0566, B:173:0x0599, B:175:0x05b2, B:176:0x05cc, B:178:0x05d4, B:179:0x05e3, B:180:0x0608, B:184:0x060b, B:186:0x0629, B:187:0x063c, B:189:0x056d, B:190:0x0574, B:191:0x057d, B:192:0x0584, B:193:0x058a, B:194:0x0593, B:211:0x04b2, B:212:0x063e, B:213:0x0643, B:215:0x0318, B:217:0x031c, B:230:0x0373, B:231:0x037d, B:233:0x03d0, B:235:0x03d4, B:237:0x03d8, B:240:0x03e0, B:241:0x0381, B:242:0x038b, B:243:0x0392, B:244:0x039e, B:245:0x03a6, B:246:0x03b9, B:247:0x03c6, B:264:0x03ef, B:267:0x042b, B:270:0x043b, B:271:0x0431, B:273:0x0439, B:274:0x0422, B:276:0x0428, B:279:0x0440, B:281:0x0447, B:282:0x0645, B:283:0x064a, B:285:0x064c, B:286:0x0651), top: B:89:0x01be, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, Map map) {
        int i;
        int[] iArr;
        char c5;
        int i5;
        char c6;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
        int intValue = ((Integer) f7781n.get((String) map.get("a"))).intValue();
        if (intValue != 5) {
            if (intValue != 7) {
                P2.a aVar = this.f7782k;
                if (!aVar.b()) {
                    aVar.a(null);
                    return;
                }
                if (intValue == 1) {
                    C1876zb c1876zb = this.f7783l;
                    synchronized (c1876zb.f16604w) {
                        try {
                            if (c1876zb.f16606y == null) {
                                c1876zb.t("Not an activity context. Cannot resize.");
                                return;
                            }
                            if (c1876zb.f16605x.f12501k.M() == null) {
                                c1876zb.t("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (c1876zb.f16605x.f12501k.M().b()) {
                                c1876zb.t("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (c1876zb.f16605x.f12501k.r0()) {
                                c1876zb.t("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                T2.L l5 = P2.o.f4767B.f4771c;
                                c1876zb.f16603v = T2.L.k((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                T2.L l6 = P2.o.f4767B.f4771c;
                                c1876zb.f16600s = T2.L.k((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                T2.L l7 = P2.o.f4767B.f4771c;
                                c1876zb.f16601t = T2.L.k((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                T2.L l8 = P2.o.f4767B.f4771c;
                                c1876zb.f16602u = T2.L.k((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                c1876zb.f16597p = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str)) {
                                c1876zb.f16596o = str;
                            }
                            if (c1876zb.f16603v < 0 || c1876zb.f16600s < 0) {
                                c1876zb.t("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = c1876zb.f16606y.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                T2.L l9 = P2.o.f4767B.f4771c;
                                Activity activity = c1876zb.f16606y;
                                int[] m5 = T2.L.m(activity);
                                C0379q c0379q = C0379q.f;
                                int[] iArr2 = {c0379q.f5048a.d(activity, m5[0]), c0379q.f5048a.d(activity, m5[1])};
                                int[] n5 = T2.L.n(c1876zb.f16606y);
                                int i10 = iArr2[0];
                                int i11 = iArr2[1];
                                int i12 = c1876zb.f16603v;
                                if (i12 < 50 || i12 > i10) {
                                    i = 50;
                                    U2.j.i("Width is too small or too large.");
                                } else {
                                    int i13 = c1876zb.f16600s;
                                    if (i13 < 50 || i13 > i11) {
                                        i = 50;
                                        U2.j.i("Height is too small or too large.");
                                    } else {
                                        if (i13 != i11 || i12 != i10) {
                                            if (c1876zb.f16597p) {
                                                String str2 = c1876zb.f16596o;
                                                i = 50;
                                                switch (str2.hashCode()) {
                                                    case -1364013995:
                                                        if (str2.equals("center")) {
                                                            c6 = 2;
                                                            break;
                                                        }
                                                        c6 = 65535;
                                                        break;
                                                    case -1012429441:
                                                        if (str2.equals("top-left")) {
                                                            c6 = 0;
                                                            break;
                                                        }
                                                        c6 = 65535;
                                                        break;
                                                    case -655373719:
                                                        if (str2.equals("bottom-left")) {
                                                            c6 = 3;
                                                            break;
                                                        }
                                                        c6 = 65535;
                                                        break;
                                                    case 1163912186:
                                                        if (str2.equals("bottom-right")) {
                                                            c6 = 5;
                                                            break;
                                                        }
                                                        c6 = 65535;
                                                        break;
                                                    case 1288627767:
                                                        if (str2.equals("bottom-center")) {
                                                            c6 = 4;
                                                            break;
                                                        }
                                                        c6 = 65535;
                                                        break;
                                                    case 1755462605:
                                                        if (str2.equals("top-center")) {
                                                            c6 = 1;
                                                            break;
                                                        }
                                                        c6 = 65535;
                                                        break;
                                                    default:
                                                        c6 = 65535;
                                                        break;
                                                }
                                                if (c6 == 0) {
                                                    i6 = c1876zb.f16598q + c1876zb.f16601t;
                                                    i7 = c1876zb.f16599r;
                                                } else if (c6 != 1) {
                                                    if (c6 != 2) {
                                                        if (c6 == 3) {
                                                            i6 = c1876zb.f16598q + c1876zb.f16601t;
                                                            i9 = c1876zb.f16599r;
                                                        } else if (c6 == 4) {
                                                            i6 = ((c1876zb.f16598q + c1876zb.f16601t) + (i12 >> 1)) - 25;
                                                            i9 = c1876zb.f16599r;
                                                        } else if (c6 != 5) {
                                                            i6 = ((c1876zb.f16598q + c1876zb.f16601t) + i12) - 50;
                                                            i7 = c1876zb.f16599r;
                                                        } else {
                                                            i6 = ((c1876zb.f16598q + c1876zb.f16601t) + i12) - 50;
                                                            i9 = c1876zb.f16599r;
                                                        }
                                                        i8 = ((i9 + c1876zb.f16602u) + i13) - 50;
                                                    } else {
                                                        i6 = ((c1876zb.f16598q + c1876zb.f16601t) + (i12 >> 1)) - 25;
                                                        i8 = ((c1876zb.f16599r + c1876zb.f16602u) + (i13 >> 1)) - 25;
                                                    }
                                                    if (i6 >= 0 && i6 + 50 <= i10 && i8 >= n5[0] && i8 + 50 <= n5[1]) {
                                                        iArr = new int[]{c1876zb.f16598q + c1876zb.f16601t, c1876zb.f16599r + c1876zb.f16602u};
                                                    }
                                                } else {
                                                    i6 = ((c1876zb.f16598q + c1876zb.f16601t) + (i12 >> 1)) - 25;
                                                    i7 = c1876zb.f16599r;
                                                }
                                                i8 = i7 + c1876zb.f16602u;
                                                if (i6 >= 0) {
                                                    iArr = new int[]{c1876zb.f16598q + c1876zb.f16601t, c1876zb.f16599r + c1876zb.f16602u};
                                                }
                                            } else {
                                                i = 50;
                                                Activity activity2 = c1876zb.f16606y;
                                                int[] m6 = T2.L.m(activity2);
                                                int[] iArr3 = {c0379q.f5048a.d(activity2, m6[0]), c0379q.f5048a.d(activity2, m6[1])};
                                                int[] n6 = T2.L.n(c1876zb.f16606y);
                                                int i14 = iArr3[0];
                                                int i15 = c1876zb.f16598q + c1876zb.f16601t;
                                                int i16 = c1876zb.f16599r + c1876zb.f16602u;
                                                if (i15 < 0) {
                                                    i5 = 0;
                                                } else {
                                                    int i17 = c1876zb.f16603v;
                                                    i5 = i15 + i17 > i14 ? i14 - i17 : i15;
                                                }
                                                int i18 = n6[0];
                                                if (i16 < i18) {
                                                    i16 = i18;
                                                } else {
                                                    int i19 = c1876zb.f16600s;
                                                    int i20 = i16 + i19;
                                                    int i21 = n6[1];
                                                    if (i20 > i21) {
                                                        i16 = i21 - i19;
                                                    }
                                                }
                                                iArr = new int[]{i5, i16};
                                            }
                                            if (iArr != null) {
                                                c1876zb.t("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            U2.e eVar = c0379q.f5048a;
                                            int l10 = U2.e.l(c1876zb.f16606y, c1876zb.f16603v);
                                            int l11 = U2.e.l(c1876zb.f16606y, c1876zb.f16600s);
                                            ViewParent parent = c1876zb.f16605x.getParent();
                                            if (parent == null || !(parent instanceof ViewGroup)) {
                                                c1876zb.t("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            ViewGroup viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView(c1876zb.f16605x);
                                            PopupWindow popupWindow = c1876zb.f16593D;
                                            if (popupWindow == null) {
                                                c1876zb.f16595F = viewGroup;
                                                C0733Ze c0733Ze = c1876zb.f16605x;
                                                c0733Ze.setDrawingCacheEnabled(true);
                                                Bitmap createBitmap = Bitmap.createBitmap(c0733Ze.getDrawingCache());
                                                c0733Ze.setDrawingCacheEnabled(false);
                                                ImageView imageView = new ImageView(c1876zb.f16606y);
                                                c1876zb.f16590A = imageView;
                                                imageView.setImageBitmap(createBitmap);
                                                c1876zb.f16607z = c1876zb.f16605x.f12501k.M();
                                                c1876zb.f16595F.addView(c1876zb.f16590A);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout = new RelativeLayout(c1876zb.f16606y);
                                            c1876zb.f16594E = relativeLayout;
                                            relativeLayout.setBackgroundColor(0);
                                            c1876zb.f16594E.setLayoutParams(new ViewGroup.LayoutParams(l10, l11));
                                            PopupWindow popupWindow2 = new PopupWindow((View) c1876zb.f16594E, l10, l11, false);
                                            c1876zb.f16593D = popupWindow2;
                                            popupWindow2.setOutsideTouchable(false);
                                            c1876zb.f16593D.setTouchable(true);
                                            c1876zb.f16593D.setClippingEnabled(!c1876zb.f16597p);
                                            c1876zb.f16594E.addView(c1876zb.f16605x, -1, -1);
                                            c1876zb.f16591B = new LinearLayout(c1876zb.f16606y);
                                            int i22 = i;
                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(U2.e.l(c1876zb.f16606y, i22), U2.e.l(c1876zb.f16606y, i22));
                                            String str3 = c1876zb.f16596o;
                                            switch (str3.hashCode()) {
                                                case -1364013995:
                                                    if (str3.equals("center")) {
                                                        c5 = 2;
                                                        break;
                                                    }
                                                    c5 = 65535;
                                                    break;
                                                case -1012429441:
                                                    if (str3.equals("top-left")) {
                                                        c5 = 0;
                                                        break;
                                                    }
                                                    c5 = 65535;
                                                    break;
                                                case -655373719:
                                                    if (str3.equals("bottom-left")) {
                                                        c5 = 3;
                                                        break;
                                                    }
                                                    c5 = 65535;
                                                    break;
                                                case 1163912186:
                                                    if (str3.equals("bottom-right")) {
                                                        c5 = 5;
                                                        break;
                                                    }
                                                    c5 = 65535;
                                                    break;
                                                case 1288627767:
                                                    if (str3.equals("bottom-center")) {
                                                        c5 = 4;
                                                        break;
                                                    }
                                                    c5 = 65535;
                                                    break;
                                                case 1755462605:
                                                    if (str3.equals("top-center")) {
                                                        c5 = 1;
                                                        break;
                                                    }
                                                    c5 = 65535;
                                                    break;
                                                default:
                                                    c5 = 65535;
                                                    break;
                                            }
                                            if (c5 == 0) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(9);
                                            } else if (c5 == 1) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(14);
                                            } else if (c5 == 2) {
                                                layoutParams.addRule(13);
                                            } else if (c5 == 3) {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(9);
                                            } else if (c5 == 4) {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(14);
                                            } else if (c5 != 5) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(11);
                                            }
                                            c1876zb.f16591B.setOnClickListener(new ViewOnClickListenerC1831yb(0, c1876zb));
                                            c1876zb.f16591B.setContentDescription("Close button");
                                            c1876zb.f16594E.addView(c1876zb.f16591B, layoutParams);
                                            try {
                                                c1876zb.f16593D.showAtLocation(window.getDecorView(), 0, U2.e.l(c1876zb.f16606y, iArr[0]), U2.e.l(c1876zb.f16606y, iArr[1]));
                                                int i23 = iArr[0];
                                                int i24 = iArr[1];
                                                Qt qt = c1876zb.f16592C;
                                                if (qt != null) {
                                                    ((Vk) qt.f11282l).f11915c.n1(new Jh(6));
                                                }
                                                c1876zb.f16605x.K0(new C1586t(1, l10, l11));
                                                c1876zb.w(iArr[0], iArr[1] - T2.L.n(c1876zb.f16606y)[0], c1876zb.f16603v, c1876zb.f16600s);
                                                c1876zb.x("resized");
                                                return;
                                            } catch (RuntimeException e3) {
                                                c1876zb.t("Cannot show popup window: " + e3.getMessage());
                                                c1876zb.f16594E.removeView(c1876zb.f16605x);
                                                ViewGroup viewGroup2 = c1876zb.f16595F;
                                                if (viewGroup2 != null) {
                                                    viewGroup2.removeView(c1876zb.f16590A);
                                                    c1876zb.f16595F.addView(c1876zb.f16605x);
                                                    c1876zb.f16605x.K0(c1876zb.f16607z);
                                                }
                                                return;
                                            }
                                        }
                                        U2.j.i("Cannot resize to a full-screen ad.");
                                        i = 50;
                                    }
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                            }
                            c1876zb.t("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (intValue == 3) {
                    C0558Bb c0558Bb = new C0558Bb(interfaceC0677Re, map);
                    Activity activity3 = c0558Bb.f7816o;
                    if (activity3 == null) {
                        c0558Bb.t("Activity context is not available");
                        return;
                    }
                    P2.o oVar = P2.o.f4767B;
                    T2.L l12 = oVar.f4771c;
                    if (!((Boolean) AbstractC2036a.l0(activity3, new CallableC1819y7(0))).booleanValue() || C2350b.a(activity3).f17113k.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        c0558Bb.t("Feature is not supported by the device.");
                        return;
                    }
                    String str4 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str4)) {
                        c0558Bb.t("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str4)) {
                        c0558Bb.t("Invalid image url: ".concat(String.valueOf(str4)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str4).getLastPathSegment();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        c0558Bb.t("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources b3 = oVar.f4774g.b();
                    AlertDialog.Builder j5 = T2.L.j(activity3);
                    j5.setTitle(b3 != null ? b3.getString(R.string.s1) : "Save image");
                    j5.setMessage(b3 != null ? b3.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    j5.setPositiveButton(b3 != null ? b3.getString(R.string.s3) : "Accept", new Ym(c0558Bb, str4, lastPathSegment));
                    j5.setNegativeButton(b3 != null ? b3.getString(R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC0550Ab(0, c0558Bb));
                    j5.create().show();
                    return;
                }
                if (intValue == 4) {
                    C1786xb c1786xb = new C1786xb(interfaceC0677Re, map);
                    Activity activity4 = c1786xb.f16294p;
                    if (activity4 == null) {
                        c1786xb.t("Activity context is not available.");
                        return;
                    }
                    P2.o oVar2 = P2.o.f4767B;
                    T2.L l13 = oVar2.f4771c;
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
                    m3.v.f("Intent can not be null", type);
                    if (activity4.getPackageManager().queryIntentActivities(type, 0).isEmpty()) {
                        c1786xb.t("This feature is not available on the device.");
                        return;
                    }
                    AlertDialog.Builder j6 = T2.L.j(activity4);
                    Resources b5 = oVar2.f4774g.b();
                    j6.setTitle(b5 != null ? b5.getString(R.string.s5) : "Create calendar event");
                    j6.setMessage(b5 != null ? b5.getString(R.string.s6) : "Allow Ad to create a calendar event?");
                    j6.setPositiveButton(b5 != null ? b5.getString(R.string.s3) : "Accept", new DialogInterfaceOnClickListenerC1741wb(c1786xb, 0));
                    j6.setNegativeButton(b5 != null ? b5.getString(R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC1741wb(c1786xb, 1));
                    j6.create().show();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.f7783l.A(true);
                        return;
                    } else if (intValue != 7) {
                        U2.j.h("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            ((Vk) this.f7784m.f11282l).f11923m.i();
            return;
        }
        String str5 = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC0677Re == null) {
            U2.j.i("AdWebView is null");
        } else {
            interfaceC0677Re.N("portrait".equalsIgnoreCase(str5) ? 7 : "landscape".equalsIgnoreCase(str5) ? 6 : parseBoolean ? -1 : 14);
        }
    }
}
