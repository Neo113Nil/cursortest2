package com.google.android.gms.internal.ads;

import A0.AbstractC0039k;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* loaded from: classes.dex */
public final class B4 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7766a;

    /* renamed from: b, reason: collision with root package name */
    public final Xw f7767b;

    public /* synthetic */ B4(Xw xw) {
        this.f7766a = 1;
        this.f7767b = xw;
    }

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        int type2;
        byte[] value2;
        int i = 0;
        Xw xw = this.f7767b;
        switch (this.f7766a) {
            case 0:
                if (list == null) {
                    xw.f("");
                    break;
                } else {
                    try {
                        int size = list.size();
                        while (i < size) {
                            ApkChecksum c5 = AbstractC0039k.c(list.get(i));
                            type = c5.getType();
                            if (type == 8) {
                                Qv d5 = Qv.f11286d.d();
                                value = c5.getValue();
                                xw.f(d5.g(value.length, value));
                                break;
                            } else {
                                i++;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    xw.f("");
                    break;
                }
            default:
                if (list == null) {
                    xw.f(null);
                    break;
                } else {
                    try {
                        int size2 = list.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            ApkChecksum c6 = AbstractC0039k.c(list.get(i5));
                            type2 = c6.getType();
                            if (type2 == 8) {
                                value2 = c6.getValue();
                                char[] cArr = AbstractC1055h5.f13710a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i < value2.length) {
                                    byte b3 = value2[i];
                                    char[] cArr3 = AbstractC1055h5.f13710a;
                                    int i6 = i + i;
                                    cArr2[i6] = cArr3[(b3 & 255) >>> 4];
                                    cArr2[i6 + 1] = cArr3[b3 & 15];
                                    i++;
                                }
                                xw.f(new String(cArr2));
                                break;
                            }
                        }
                        xw.f(null);
                        break;
                    } catch (Throwable unused2) {
                        xw.f(null);
                    }
                }
        }
    }

    public B4() {
        this.f7766a = 0;
        this.f7767b = new Xw();
    }
}
