package C0;

import android.text.TextUtils;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public int f1239a;

    /* renamed from: b, reason: collision with root package name */
    public int f1240b;

    /* renamed from: c, reason: collision with root package name */
    public int f1241c;

    /* renamed from: d, reason: collision with root package name */
    public int f1242d;

    /* renamed from: e, reason: collision with root package name */
    public int f1243e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static K b(String str) {
        char c3;
        AbstractC1664a.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < split.length; i11++) {
            String a02 = Y4.D.a0(split[i11].trim());
            a02.getClass();
            switch (a02.hashCode()) {
                case 100571:
                    if (a02.equals("end")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3556653:
                    if (a02.equals("text")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109757538:
                    if (a02.equals("start")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109780401:
                    if (a02.equals("style")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    i8 = i11;
                    break;
                case 1:
                    i9 = i11;
                    break;
                case 2:
                    i7 = i11;
                    break;
                case 3:
                    i10 = i11;
                    break;
            }
        }
        if (i7 == -1 || i8 == -1 || i9 == -1) {
            return null;
        }
        int length = split.length;
        K k7 = new K();
        k7.f1239a = i7;
        k7.f1240b = i8;
        k7.f1241c = i10;
        k7.f1242d = i9;
        k7.f1243e = length;
        return k7;
    }

    public boolean a() {
        int i7 = this.f1239a;
        int i8 = 2;
        if ((i7 & 7) != 0) {
            int i9 = this.f1242d;
            int i10 = this.f1240b;
            if (((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 112) != 0) {
            int i11 = this.f1242d;
            int i12 = this.f1241c;
            if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 1792) != 0) {
            int i13 = this.f1243e;
            int i14 = this.f1240b;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 8) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 28672) != 0) {
            int i15 = this.f1243e;
            int i16 = this.f1241c;
            if (i15 > i16) {
                i8 = 1;
            } else if (i15 != i16) {
                i8 = 4;
            }
            if ((i7 & (i8 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
