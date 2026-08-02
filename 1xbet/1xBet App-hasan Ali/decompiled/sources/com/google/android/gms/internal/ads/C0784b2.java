package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784b2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12754a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12755b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12756c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12757d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12758e;

    public C0784b2(int i, int i5, int i6, int i7, int i8) {
        this.f12754a = i;
        this.f12755b = i5;
        this.f12756c = i6;
        this.f12757d = i7;
        this.f12758e = i8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C0784b2 a(String str) {
        char c5;
        AbstractC1668us.S(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i5 == -1 || i6 == -1 || i8 == -1) {
                    return null;
                }
                return new C0784b2(i5, i6, i7, i8, length);
            }
            String n5 = AbstractC0952et.n(split[i].trim());
            switch (n5.hashCode()) {
                case 100571:
                    if (n5.equals("end")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3556653:
                    if (n5.equals("text")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 109757538:
                    if (n5.equals("start")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 109780401:
                    if (n5.equals("style")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            if (c5 == 0) {
                i5 = i;
            } else if (c5 == 1) {
                i6 = i;
            } else if (c5 == 2) {
                i7 = i;
            } else if (c5 == 3) {
                i8 = i;
            }
            i++;
        }
    }
}
