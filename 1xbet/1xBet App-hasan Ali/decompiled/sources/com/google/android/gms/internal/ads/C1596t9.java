package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.t9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1596t9 implements InterfaceC1311mu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15637b;

    public /* synthetic */ C1596t9(String str, int i) {
        this.f15636a = i;
        this.f15637b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
    public final Object apply(Object obj) {
        String str = this.f15637b;
        switch (this.f15636a) {
            case 0:
                String str2 = (String) obj;
                C1551s9 c1551s9 = AbstractC1776x9.f16242a;
                if (str2 == null) {
                    return str;
                }
                if (((Boolean) AbstractC1013g8.f.s()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(str).getHost();
                    for (int i = 0; i < 3; i++) {
                        if (!host.endsWith(strArr[i])) {
                        }
                    }
                    return str;
                }
                String str3 = (String) AbstractC1013g8.f13563a.s();
                String str4 = (String) AbstractC1013g8.f13564b.s();
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replace(str3, str2);
                }
                if (TextUtils.isEmpty(str4)) {
                    return str;
                }
                Uri parse = Uri.parse(str);
                return TextUtils.isEmpty(parse.getQueryParameter(str4)) ? parse.buildUpon().appendQueryParameter(str4, str2).toString() : str;
            case 1:
                Throwable th = (Throwable) obj;
                C1551s9 c1551s92 = AbstractC1776x9.f16242a;
                if (((Boolean) AbstractC1013g8.i.s()).booleanValue()) {
                    P2.o.f4767B.f4774g.i("prepareClickUrl.attestation2", th);
                }
                return str;
            case 2:
                return new C1481qk(str, (BinderC1865z8) obj);
            default:
                Throwable th2 = (Throwable) obj;
                U2.j.f("Error calling adapter: ".concat(String.valueOf(str)));
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Cc)).booleanValue()) {
                    P2.o.f4767B.f4774g.h("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                    return null;
                }
                P2.o.f4767B.f4774g.i("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                return null;
        }
    }
}
