package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720Xf implements InterfaceC0699Uf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12203a;

    /* renamed from: b, reason: collision with root package name */
    public final Ul f12204b;

    public /* synthetic */ C0720Xf(Ul ul, int i) {
        this.f12203a = i;
        this.f12204b = ul;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0699Uf
    public final void a(HashMap hashMap) {
        char c5;
        switch (this.f12203a) {
            case 0:
                String str = (String) hashMap.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int hashCode = str.hashCode();
                    if (hashCode != 97520651) {
                        if (hashCode == 109399814 && str.equals("shake")) {
                            c5 = 0;
                        }
                        c5 = 65535;
                    } else {
                        if (str.equals("flick")) {
                            c5 = 1;
                        }
                        c5 = 65535;
                    }
                    Ul ul = this.f12204b;
                    if (c5 == 0) {
                        ul.k(Rl.f11448l, true);
                        break;
                    } else if (c5 == 1) {
                        ul.k(Rl.f11449m, true);
                        break;
                    } else {
                        ul.k(Rl.f11447k, true);
                        break;
                    }
                }
                break;
            default:
                String str2 = (String) hashMap.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.f12204b.e(str2.equals("true"));
                    break;
                }
                break;
        }
    }
}
