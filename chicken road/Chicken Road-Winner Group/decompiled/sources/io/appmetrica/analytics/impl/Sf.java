package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Sf implements InterfaceC0918vo {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0918vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(S8 s8, C0756ph c0756ph) {
        C0832sg c0832sg;
        int ordinal;
        if (!TextUtils.isEmpty(s8.f6568b)) {
            try {
                byte[] decode = Base64.decode(s8.f6568b, 0);
                if (decode != null && decode.length != 0) {
                    c0832sg = new C0832sg(decode);
                    C0367ag c0367ag = new C0367ag();
                    String str = c0832sg.f8308a;
                    c0367ag.f6992a = str != null ? new byte[0] : str.getBytes();
                    c0367ag.f6994c = c0832sg.f8309b;
                    c0367ag.f6993b = c0832sg.f8310c;
                    ordinal = c0832sg.f8311d.ordinal();
                    int i3 = 1;
                    if (ordinal != 1) {
                        i3 = 2;
                        if (ordinal != 2) {
                            i3 = 0;
                        }
                    }
                    c0367ag.f6995d = i3;
                    return MessageNano.toByteArray(c0367ag);
                }
                c0832sg = null;
                C0367ag c0367ag2 = new C0367ag();
                String str2 = c0832sg.f8308a;
                c0367ag2.f6992a = str2 != null ? new byte[0] : str2.getBytes();
                c0367ag2.f6994c = c0832sg.f8309b;
                c0367ag2.f6993b = c0832sg.f8310c;
                ordinal = c0832sg.f8311d.ordinal();
                int i32 = 1;
                if (ordinal != 1) {
                }
                c0367ag2.f6995d = i32;
                return MessageNano.toByteArray(c0367ag2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
