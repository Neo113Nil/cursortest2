package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class H7 {

    /* renamed from: b, reason: collision with root package name */
    public static final H7 f9333b = new H7(0);

    /* renamed from: c, reason: collision with root package name */
    public static final H7 f9334c = new H7(1);

    /* renamed from: d, reason: collision with root package name */
    public static final H7 f9335d = new H7(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9336a;

    public /* synthetic */ H7(int i) {
        this.f9336a = i;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i5 = 0;
        while (i5 < str.length() && str.charAt(i5) == ',') {
            i5++;
        }
        while (length > 0) {
            int i6 = length - 1;
            if (str.charAt(i6) != ',') {
                break;
            }
            length = i6;
        }
        if (length < i5) {
            return null;
        }
        if (i5 != 0) {
            i = i5;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    public final String a(String str, String str2) {
        switch (this.f9336a) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String b3 = b(str);
                String b5 = b(str2);
                return TextUtils.isEmpty(b3) ? b5 : TextUtils.isEmpty(b5) ? b3 : AbstractC0467k.v(b3, ",", b5);
        }
    }
}
