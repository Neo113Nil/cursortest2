package R4;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import r.C1393c;
import u.C1469j;
import u.x;
import u.y;
import u.z;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2719a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2720b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2721c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2722d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2723e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2724f;

    public u(u.p pVar) {
        int i2;
        ArrayList arrayList;
        int i3;
        new ArrayList();
        this.f2724f = new Bundle();
        this.f2723e = pVar;
        Context context = pVar.f12004a;
        this.f2721c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2722d = u.w.a(context, pVar.f12022s);
        } else {
            this.f2722d = new Notification.Builder(pVar.f12004a);
        }
        Notification notification = pVar.f12025v;
        int i6 = 0;
        ((Notification.Builder) this.f2722d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(pVar.f12008e).setContentText(pVar.f12009f).setContentInfo(null).setContentIntent(pVar.f12010g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(pVar.f12012i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f2722d;
        IconCompat iconCompat = pVar.f12011h;
        u.u.b(builder, iconCompat == null ? null : y.b.c(iconCompat, context));
        ((Notification.Builder) this.f2722d).setSubText(null).setUsesChronometer(false).setPriority(pVar.f12013j);
        Iterator it = pVar.f12005b.iterator();
        while (it.hasNext()) {
            C1469j c1469j = (C1469j) it.next();
            if (c1469j.f11993b == null && (i3 = c1469j.f11996e) != 0) {
                c1469j.f11993b = IconCompat.b(i3);
            }
            IconCompat iconCompat2 = c1469j.f11993b;
            Notification.Action.Builder a6 = u.u.a(iconCompat2 != null ? y.b.c(iconCompat2, null) : null, c1469j.f11997f, c1469j.f11998g);
            Bundle bundle = c1469j.f11992a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z = c1469j.f11994c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i7 = Build.VERSION.SDK_INT;
            u.v.a(a6, z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i7 >= 28) {
                x.b(a6, 0);
            }
            if (i7 >= 29) {
                y.c(a6, false);
            }
            if (i7 >= 31) {
                z.a(a6, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c1469j.f11995d);
            u.s.b(a6, bundle2);
            u.s.a((Notification.Builder) this.f2722d, u.s.d(a6));
        }
        Bundle bundle3 = pVar.f12019p;
        if (bundle3 != null) {
            ((Bundle) this.f2724f).putAll(bundle3);
        }
        int i8 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f2722d).setShowWhen(pVar.f12014k);
        u.s.i((Notification.Builder) this.f2722d, pVar.f12018o);
        u.s.g((Notification.Builder) this.f2722d, pVar.f12016m);
        u.s.j((Notification.Builder) this.f2722d, null);
        u.s.h((Notification.Builder) this.f2722d, pVar.f12017n);
        this.f2720b = pVar.f12023t;
        u.t.b((Notification.Builder) this.f2722d, null);
        u.t.c((Notification.Builder) this.f2722d, pVar.f12020q);
        u.t.f((Notification.Builder) this.f2722d, pVar.f12021r);
        u.t.d((Notification.Builder) this.f2722d, null);
        u.t.e((Notification.Builder) this.f2722d, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = pVar.f12026w;
        ArrayList arrayList3 = pVar.f12006c;
        if (i8 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C1393c c1393c = new C1393c(arrayList2.size() + arrayList.size());
                    c1393c.addAll(arrayList);
                    c1393c.addAll(arrayList2);
                    arrayList2 = new ArrayList(c1393c);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                u.t.a((Notification.Builder) this.f2722d, (String) it3.next());
            }
        }
        ArrayList arrayList4 = pVar.f12007d;
        if (arrayList4.size() > 0) {
            if (pVar.f12019p == null) {
                pVar.f12019p = new Bundle();
            }
            Bundle bundle4 = pVar.f12019p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList4.size()) {
                String num = Integer.toString(i9);
                C1469j c1469j2 = (C1469j) arrayList4.get(i9);
                Bundle bundle7 = new Bundle();
                if (c1469j2.f11993b == null && (i2 = c1469j2.f11996e) != 0) {
                    c1469j2.f11993b = IconCompat.b(i2);
                }
                IconCompat iconCompat3 = c1469j2.f11993b;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i6);
                bundle7.putCharSequence(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, c1469j2.f11997f);
                bundle7.putParcelable("actionIntent", c1469j2.f11998g);
                Bundle bundle8 = c1469j2.f11992a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", c1469j2.f11994c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", c1469j2.f11995d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i9++;
                i6 = 0;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (pVar.f12019p == null) {
                pVar.f12019p = new Bundle();
            }
            pVar.f12019p.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f2724f).putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i10 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f2722d).setExtras(pVar.f12019p);
        u.v.e((Notification.Builder) this.f2722d, null);
        if (i10 >= 26) {
            u.w.b((Notification.Builder) this.f2722d, 0);
            u.w.e((Notification.Builder) this.f2722d, null);
            u.w.f((Notification.Builder) this.f2722d, null);
            u.w.g((Notification.Builder) this.f2722d, 0L);
            u.w.d((Notification.Builder) this.f2722d, pVar.f12023t);
            if (!TextUtils.isEmpty(pVar.f12022s)) {
                ((Notification.Builder) this.f2722d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i10 >= 29) {
            y.a((Notification.Builder) this.f2722d, pVar.f12024u);
            y.b((Notification.Builder) this.f2722d, null);
        }
    }

    public static /* synthetic */ void n(u uVar, String str, int i2, String str2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = uVar.f2720b;
        }
        if ((i3 & 4) != 0) {
            str2 = "";
        }
        uVar.m(i2, str, str2);
        throw null;
    }

    public int a(CharSequence charSequence, int i2) {
        int i3 = i2 + 4;
        if (i3 < charSequence.length()) {
            ((StringBuilder) this.f2724f).append((char) (p(charSequence, i2 + 3) + (p(charSequence, i2) << 12) + (p(charSequence, i2 + 1) << 8) + (p(charSequence, i2 + 2) << 4)));
            return i3;
        }
        this.f2720b = i2;
        if (i3 < charSequence.length()) {
            return a(charSequence, this.f2720b);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i2 = this.f2720b;
        if (i2 == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f2723e;
            if (i2 >= str.length()) {
                this.f2720b = i2;
                return false;
            }
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f2720b = i2;
                return !(charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',');
            }
            i2++;
        }
    }

    public void c(int i2, String str) {
        String str2 = (String) this.f2723e;
        if (str2.length() - i2 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) != (str2.charAt(i2 + i3) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f2720b = str.length() + i2;
    }

    public String d() {
        g('\"');
        int i2 = this.f2720b;
        String str = (String) this.f2723e;
        int W5 = B4.k.W(str, '\"', i2, false, 4);
        if (W5 == -1) {
            j();
            o((byte) 1, false);
            throw null;
        }
        int i3 = i2;
        while (i3 < W5) {
            if (str.charAt(i3) == '\\') {
                int i6 = this.f2720b;
                char charAt = str.charAt(i3);
                boolean z = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f2724f).append((CharSequence) str, i6, i3);
                        int r5 = r(i3 + 1);
                        if (r5 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i7 = r5 + 1;
                        char charAt2 = str.charAt(r5);
                        if (charAt2 == 'u') {
                            i7 = a(str, i7);
                        } else {
                            char c2 = charAt2 < 'u' ? d.f2678a[charAt2] : (char) 0;
                            if (c2 == 0) {
                                n(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f2724f).append(c2);
                        }
                        i6 = r(i7);
                        if (i6 == -1) {
                            n(this, "Unexpected EOF", i6, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            ((StringBuilder) this.f2724f).append((CharSequence) str, i6, i3);
                            i6 = r(i3);
                            if (i6 == -1) {
                                n(this, "Unexpected EOF", i6, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i3);
                        }
                    }
                    i3 = i6;
                    z = true;
                    charAt = str.charAt(i3);
                }
                String obj = !z ? str.subSequence(i6, i3).toString() : l(i6, i3);
                this.f2720b = i3 + 1;
                return obj;
            }
            i3++;
        }
        this.f2720b = W5 + 1;
        String substring = str.substring(i2, W5);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        byte e3;
        do {
            int i2 = this.f2720b;
            if (i2 == -1) {
                return (byte) 10;
            }
            String str = (String) this.f2723e;
            if (i2 >= str.length()) {
                return (byte) 10;
            }
            int i3 = this.f2720b;
            this.f2720b = i3 + 1;
            e3 = m.e(str.charAt(i3));
        } while (e3 == 3);
        return e3;
    }

    public byte f(byte b6) {
        byte e3 = e();
        if (e3 == b6) {
            return e3;
        }
        o(b6, true);
        throw null;
    }

    public void g(char c2) {
        if (this.f2720b == -1) {
            v(c2);
            throw null;
        }
        while (true) {
            int i2 = this.f2720b;
            String str = (String) this.f2723e;
            if (i2 >= str.length()) {
                this.f2720b = -1;
                v(c2);
                throw null;
            }
            int i3 = this.f2720b;
            this.f2720b = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c2) {
                    return;
                }
                v(c2);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
    
        n(r19, "Unexpected symbol '" + r5 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
    
        if (r3 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0138, code lost:
    
        if (r18.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
    
        n(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        n(r19, r17, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014f, code lost:
    
        r19.f2720b = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        if (r13 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0156, code lost:
    
        if (r16 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017c, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        r8 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        n(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0199, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        n(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
    
        if (r16 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a6, code lost:
    
        throw new C1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        if (r14 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ae, code lost:
    
        if (r8 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b1, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b2, code lost:
    
        n(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
    
        n(r19, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01be, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011d, code lost:
    
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long h() {
        boolean z;
        String str;
        String str2;
        boolean z5;
        int r5 = r(s());
        String str3 = (String) this.f2723e;
        String str4 = "EOF";
        if (r5 < str3.length() && r5 != -1) {
            if (str3.charAt(r5) == '\"') {
                r5++;
                if (r5 == str3.length()) {
                    n(this, "EOF", 0, null, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i2 = r5;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            long j2 = 0;
            long j6 = 0;
            while (true) {
                if (i2 == str3.length()) {
                    str = str3;
                    str2 = str4;
                    z5 = z8;
                    break;
                }
                char charAt = str3.charAt(i2);
                if ((charAt != 'e' && charAt != 'E') || z6) {
                    str2 = str4;
                    z5 = z8;
                    if (charAt == '-' && z6) {
                        if (i2 == r5) {
                            n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i2++;
                        str4 = str2;
                        z8 = false;
                    } else if (charAt != '+' || !z6) {
                        str = str3;
                        if (charAt != '-') {
                            if (m.e(charAt) != 0) {
                                break;
                            }
                            i2++;
                            int i3 = charAt - '0';
                            if (i3 < 0 || i3 >= 10) {
                                break;
                            }
                            if (z6) {
                                j6 = (j6 * 10) + i3;
                            } else {
                                j2 = (j2 * 10) - i3;
                                if (j2 > 0) {
                                    n(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            z8 = z5;
                            str4 = str2;
                            str3 = str;
                        } else {
                            if (i2 != r5) {
                                n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                                throw null;
                            }
                            i2++;
                            z8 = z5;
                            str4 = str2;
                            str3 = str;
                            z7 = true;
                        }
                    } else {
                        if (i2 == r5) {
                            n(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i2++;
                        str4 = str2;
                    }
                } else {
                    if (i2 == r5) {
                        n(this, "Unexpected symbol " + charAt + " in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i2++;
                    z6 = true;
                }
                z8 = true;
            }
        } else {
            n(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public String i() {
        String str = (String) this.f2722d;
        if (str == null) {
            return d();
        }
        kotlin.jvm.internal.i.b(str);
        this.f2722d = null;
        return str;
    }

    public String j() {
        String str = (String) this.f2722d;
        if (str != null) {
            kotlin.jvm.internal.i.b(str);
            this.f2722d = null;
            return str;
        }
        int s2 = s();
        String str2 = (String) this.f2723e;
        if (s2 >= str2.length() || s2 == -1) {
            n(this, "EOF", s2, null, 4);
            throw null;
        }
        byte e3 = m.e(str2.charAt(s2));
        if (e3 == 1) {
            return i();
        }
        if (e3 != 0) {
            n(this, "Expected beginning of the string, but got " + str2.charAt(s2), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (m.e(str2.charAt(s2)) == 0) {
            s2++;
            if (s2 >= str2.length()) {
                ((StringBuilder) this.f2724f).append((CharSequence) str2, this.f2720b, s2);
                int r5 = r(s2);
                if (r5 == -1) {
                    this.f2720b = s2;
                    return l(0, 0);
                }
                s2 = r5;
                z = true;
            }
        }
        String obj = !z ? str2.subSequence(this.f2720b, s2).toString() : l(this.f2720b, s2);
        this.f2720b = s2;
        return obj;
    }

    public String k() {
        String j2 = j();
        if (kotlin.jvm.internal.i.a(j2, "null")) {
            if (((String) this.f2723e).charAt(this.f2720b - 1) != '\"') {
                n(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return j2;
    }

    public String l(int i2, int i3) {
        ((StringBuilder) this.f2724f).append((CharSequence) this.f2723e, i2, i3);
        StringBuilder sb = (StringBuilder) this.f2724f;
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void m(int i2, String message, String hint) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(hint, "hint");
        throw m.b(i2, message + " at path: " + ((B3.d) this.f2721c).d() + (hint.length() == 0 ? "" : "\n".concat(hint)), (String) this.f2723e);
    }

    public void o(byte b6, boolean z) {
        String m6 = m.m(b6);
        int i2 = z ? this.f2720b - 1 : this.f2720b;
        int i3 = this.f2720b;
        String str = (String) this.f2723e;
        n(this, "Expected " + m6 + ", but had '" + ((i3 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, null, 4);
        throw null;
    }

    public int p(CharSequence charSequence, int i2) {
        char charAt = charSequence.charAt(i2);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public byte q() {
        int i2 = this.f2720b;
        while (true) {
            int r5 = r(i2);
            if (r5 == -1) {
                this.f2720b = r5;
                return (byte) 10;
            }
            char charAt = ((String) this.f2723e).charAt(r5);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f2720b = r5;
                return m.e(charAt);
            }
            i2 = r5 + 1;
        }
    }

    public int r(int i2) {
        if (i2 < ((String) this.f2723e).length()) {
            return i2;
        }
        return -1;
    }

    public int s() {
        char charAt;
        int i2 = this.f2720b;
        if (i2 == -1) {
            return i2;
        }
        while (true) {
            String str = (String) this.f2723e;
            if (i2 >= str.length() || !((charAt = str.charAt(i2)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i2++;
        }
        this.f2720b = i2;
        return i2;
    }

    public boolean t() {
        int s2 = s();
        String str = (String) this.f2723e;
        if (s2 == str.length() || s2 == -1 || str.charAt(s2) != ',') {
            return false;
        }
        this.f2720b++;
        return true;
    }

    public String toString() {
        switch (this.f2719a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f2723e);
                sb.append("', currentPosition=");
                return B0.o.k(sb, this.f2720b, ')');
            default:
                return super.toString();
        }
    }

    public boolean u(boolean z) {
        int r5 = r(s());
        String str = (String) this.f2723e;
        int length = str.length() - r5;
        if (length < 4 || r5 == -1) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if ("null".charAt(i2) != str.charAt(r5 + i2)) {
                return false;
            }
        }
        if (length > 4 && m.e(str.charAt(r5 + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.f2720b = r5 + 4;
        return true;
    }

    public void v(char c2) {
        int i2 = this.f2720b;
        if (i2 > 0 && c2 == '\"') {
            try {
                this.f2720b = i2 - 1;
                String j2 = j();
                this.f2720b = i2;
                if (kotlin.jvm.internal.i.a(j2, "null")) {
                    m(this.f2720b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f2720b = i2;
                throw th;
            }
        }
        o(m.e(c2), true);
        throw null;
    }

    public u(String source) {
        kotlin.jvm.internal.i.e(source, "source");
        B3.d dVar = new B3.d(4, (byte) 0);
        dVar.f277c = new Object[8];
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        dVar.f278d = iArr;
        dVar.f276b = -1;
        this.f2721c = dVar;
        this.f2724f = new StringBuilder();
        this.f2723e = source;
    }
}
