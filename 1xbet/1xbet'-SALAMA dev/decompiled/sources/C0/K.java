package C0;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1243e;

    public static K b(String str) {
        p151v2.a.f(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            String strA0 = Y4.D.a0(strArrSplit[i11].trim());
            strA0.getClass();
            switch (strA0) {
                case "end":
                    i8 = i11;
                    break;
                case "text":
                    i9 = i11;
                    break;
                case "start":
                    i7 = i11;
                    break;
                case "style":
                    i10 = i11;
                    break;
            }
        }
        if (i7 == -1 || i8 == -1 || i9 == -1) {
            return null;
        }
        int length = strArrSplit.length;
        K k7 = new K();
        k7.f1239a = i7;
        k7.f1240b = i8;
        k7.f1241c = i10;
        k7.f1242d = i9;
        k7.f1243e = length;
        return k7;
    }

    public boolean a() {
        int i7;
        int i8;
        int i9;
        int i10 = this.f1239a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f1242d;
            int i13 = this.f1240b;
            if (i12 > i13) {
                i9 = 1;
            } else {
                i9 = i12 == i13 ? 2 : 4;
            }
            if ((i9 & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f1242d;
            int i15 = this.f1241c;
            if (i14 > i15) {
                i8 = 1;
            } else {
                i8 = i14 == i15 ? 2 : 4;
            }
            if (((i8 << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f1243e;
            int i17 = this.f1240b;
            if (i16 > i17) {
                i7 = 1;
            } else {
                i7 = i16 == i17 ? 2 : 4;
            }
            if (((i7 << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f1243e;
            int i19 = this.f1241c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
