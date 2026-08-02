package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f10757c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f10758a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f10759b = -1;

    public final void a(C5 c5) {
        int i = 0;
        while (true) {
            InterfaceC1592t5[] interfaceC1592t5Arr = c5.f7964k;
            if (i >= interfaceC1592t5Arr.length) {
                return;
            }
            InterfaceC1592t5 interfaceC1592t5 = interfaceC1592t5Arr[i];
            if (interfaceC1592t5 instanceof H0) {
                H0 h02 = (H0) interfaceC1592t5;
                if ("iTunSMPB".equals(h02.f9298m) && b(h02.f9299n)) {
                    return;
                }
            } else if (interfaceC1592t5 instanceof M0) {
                M0 m02 = (M0) interfaceC1592t5;
                if ("com.apple.iTunes".equals(m02.f10566l) && "iTunSMPB".equals(m02.f10567m) && b(m02.f10568n)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }

    public final boolean b(String str) {
        Matcher matcher = f10757c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = AbstractC1260lo.f14419a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f10758a = parseInt;
            this.f10759b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
