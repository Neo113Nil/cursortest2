package com.instagram.common.viewpoint.core;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AV {
    public static byte[] A06;
    public static String[] A07 = {"eoBlep8s1FBIN6Rt", "z5PVad8lFvymSbVcRUVN6mCVOAyUTpZZ", "CSzRbjHFCczJ9I", "vibjkM4Umklha9WpeyLj2yq757BqeZSZ", "UWrS", "", "nE8lp", "HlO2gnmnWOpwEq19Q9DE2Hcik4TJ8nc9"};
    public static final AV A08;

    @Nullable
    public MediaCodecPoolTracker A01;

    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<AO>> A04 = new HashMap();
    public final AU A03 = new AU(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{-63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z, C1425hv c1425hv, EnumC1422hq enumC1422hq, String str, AO ao) {
        if (A0I(z, c1425hv) && A0G(str, c1425hv)) {
            boolean z2 = true;
            synchronized (this) {
                if (this.A00 < c1425hv.A05) {
                    Set<AO> set = this.A04.get(str);
                    if (set == null) {
                        set = A06();
                        this.A04.put(str, set);
                    }
                    if (set.contains(ao)) {
                        z2 = false;
                    } else if (((z && c1425hv.A0M) || (!z && c1425hv.A0L)) && set.size() < c1425hv.A04) {
                        set.add(ao);
                        this.A00++;
                        z2 = false;
                    }
                }
                if (!z2) {
                    try {
                        try {
                            this.A05 = SystemClock.elapsedRealtime();
                            ao.reset();
                            A03().A09(enumC1422hq, ao.hashCode());
                            return;
                        } catch (IllegalStateException unused) {
                            A0B(str, ao);
                        }
                    } finally {
                        this.A05 = -1L;
                    }
                }
            }
        }
        try {
            if (!c1425hv.A0Q || (!z && !c1425hv.A0P)) {
                ao.stop();
            }
        } finally {
            A03().A08(enumC1422hq, ao.hashCode());
            ao.AGr();
            A03().A07(enumC1422hq, ao.hashCode());
        }
    }

    static {
        A08();
        A08 = new AV();
    }

    private AO A01(boolean z, C1425hv c1425hv, EnumC1422hq enumC1422hq, String str) throws MediaCodecInitializationException {
        AO A03;
        if (A0I(z, c1425hv) && A0G(str, c1425hv)) {
            synchronized (this) {
                Set<AO> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<AO> it = set.iterator();
                    AO ret = it.next();
                    it.remove();
                    A03().A0A(z, str, enumC1422hq, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            C1420ho A05 = A03().A05(z, str, enumC1422hq);
            A03 = this.A03.A03(z, str);
            A03().A06(A05, A03.hashCode());
            return A03;
        } catch (Exception e) {
            throw new MediaCodecInitializationException(str, e);
        }
    }

    public static AV A02() {
        AV av = A08;
        String[] strArr = A07;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "gdX1n";
        strArr2[4] = "uqN6";
        return av;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaCodecPoolTracker A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return NoOpMediaCodecPoolTracker.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<AO> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(MediaCodecPoolTracker mediaCodecPoolTracker) {
        if (this.A01 == null) {
            this.A01 = mediaCodecPoolTracker;
        }
    }

    private void A0A(C1425hv c1425hv) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c1425hv.A0R);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, AO ao) {
        Set<AO> set = this.A04.get(str);
        if (set != null && set.remove(ao)) {
            int i = this.A00;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[1].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "FxBrmOrzGAHEl951IE67fieu752sH0JZ";
            strArr2[1] = "QwM4isUBZzXVsf3PyxWpFGvjBfZOcOMZ";
            this.A00 = i - 1;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 10));
    }

    public static boolean A0G(String str, C1425hv c1425hv) {
        if (A0E(str) && c1425hv.A0A) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z, C1425hv c1425hv) {
        if (c1425hv.A0C && this.A05 != -1 && SystemClock.elapsedRealtime() - this.A05 > 5000) {
            return false;
        }
        return A0J(z, c1425hv);
    }

    public static boolean A0J(boolean z, C1425hv c1425hv) {
        return (z && c1425hv.A0M) || (!z && c1425hv.A0L);
    }

    public final AO A0K(boolean z, C1425hv c1425hv, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC1422hq enumC1422hq, String str) throws MediaCodecInitializationException {
        AO A02;
        A09(mediaCodecPoolTracker);
        A0A(c1425hv);
        if (c1425hv.A0J) {
            A02 = this.A03.A02(z, c1425hv, enumC1422hq, str);
            String[] strArr = A07;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "ttyEUrXfsAwEm9Eniby4AXTGkmRMb34Z";
            strArr2[1] = "BAFCEyHtTeugEvQpUcdazZ0OUcRhptwZ";
            return A02;
        }
        return A01(z, c1425hv, enumC1422hq, str);
    }

    public final void A0L(boolean z, C1425hv c1425hv, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC1422hq enumC1422hq, String str, AO ao) {
        A09(mediaCodecPoolTracker);
        if (c1425hv.A0J) {
            this.A03.A0A(z, c1425hv, enumC1422hq, str, ao);
        } else {
            A0C(z, c1425hv, enumC1422hq, str, ao);
        }
    }
}
