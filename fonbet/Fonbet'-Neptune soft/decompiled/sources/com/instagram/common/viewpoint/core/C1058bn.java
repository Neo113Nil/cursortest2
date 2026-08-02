package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1058bn implements InterfaceC0752Sh {
    public static byte[] A04;
    public Context A00;
    public final InterfaceC0751Sg A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C0749Se A01 = A00();

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C1058bn(Context context, InterfaceC0751Sg interfaceC0751Sg) {
        this.A00 = context;
        this.A02 = interfaceC0751Sg;
    }

    private C0749Se A00() {
        return C0749Se.A00(AbstractC0825Ve.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.ABw(new C1115ci(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C0749Se c0749Se = new C0749Se(strArr, num, num2);
        C0749Se newSettings = this.A01;
        if (c0749Se.equals(newSettings)) {
            return;
        }
        this.A01 = c0749Se;
        this.A03.set(true);
        SharedPreferences.Editor edit = AbstractC0825Ve.A00(this.A00).edit();
        C0749Se newSettings2 = this.A01;
        edit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0752Sh
    public final C0749Se A7c() {
        A02();
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0752Sh
    public final boolean AAY() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0a = U7.A0a(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = A0a.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0752Sh
    public final boolean AJC() {
        A02();
        return this.A03.getAndSet(false);
    }
}
