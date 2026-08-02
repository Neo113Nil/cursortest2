package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7K implements InterfaceC1465id {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public MX A01;
    public MY A02;
    public C1439iD A03;
    public C1437iB A04;
    public C6M A05;
    public Y8 A06;
    public Y9 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(C6M c6m, C1437iB c1437iB, SF sf, MX mx, Y9 y9) {
        String A7G = c1437iB.A7G();
        if (!TextUtils.isEmpty(A7G)) {
            sf.A0e(new C0796Ua(A7G, c6m.A0A()));
        }
        C0811Up A0F = c1437iB.A0F();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0F != null) {
            SD sd = new SD(c1437iB.A0F().getUrl(), c1437iB.A0F().getHeight(), c1437iB.A0F().getWidth(), c1437iB.A0Y(), A03(2, 16, 120));
            sd.A01 = new SL(false, -1, -1);
            sf.A0W();
            sf.A0c(sd);
        }
        if (c1437iB.A0E() != null) {
            sf.A0c(new SD(c1437iB.A0E().getUrl(), c1437iB.A0E().getHeight(), c1437iB.A0E().getWidth(), c1437iB.A0Y(), A03(2, 16, 120)));
        }
        String A0b = c1437iB.A0b();
        if (A0b != null && !TextUtils.isEmpty(A0b)) {
            sf.A0b(new SB(A0b, c1437iB.A0Y(), A03(2, 16, 120), c1437iB.A0A()));
        }
        C1451iP c1451iP = new C1451iP(this, y9, mx, c6m);
        String A0Y = c1437iB.A0Y();
        String clientToken2 = A03(2, 16, 120);
        sf.A0X(c1451iP, new S8(A0Y, clientToken2));
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final String A7G() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7G();
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final AdPlacementType A8c() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1465id
    public final void AAk(C6M c6m, US us, V4 v4, MX mx, JSONObject jSONObject, TF tf) {
        c6m.A0F().A4F();
        this.A05 = c6m;
        this.A01 = mx;
        SF sf = new SF(c6m);
        this.A00 = System.currentTimeMillis();
        C1437iB A00 = AbstractC0599Mg.A00(c6m, jSONObject, AbstractC0862Wr.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!ML.A06(c6m, A00, us)) {
            Y8 adViewListener = new C1453iR(this, c6m);
            this.A06 = adViewListener;
            Y9 y9 = new Y9(c6m, us, sf, new WeakReference(adViewListener), tf.A04(), tf.A07(), tf.A08(), tf.A09(), A00, this.A08);
            this.A07 = y9;
            this.A03 = new C1439iD(c6m, new C1452iQ(this, c6m, mx), y9.getViewabilityChecker(), us, A00);
            A05(c6m, A00, sf, mx, y9);
            this.A02 = new MY(c6m, this.A08, this, mx);
            this.A02.A02();
            return;
        }
        c6m.A0F().A4u();
        mx.ADj(this, V1.A00(AdErrorType.NO_FILL));
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final boolean AJa() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC1494j9 A0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            A0F.A4D(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        MY my = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (my != null) {
            this.A02.A03();
        }
    }
}
