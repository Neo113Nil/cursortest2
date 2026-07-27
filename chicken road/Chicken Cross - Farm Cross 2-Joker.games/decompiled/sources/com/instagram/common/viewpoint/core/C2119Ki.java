package com.instagram.common.viewpoint.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Ki, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2119Ki {
    public static String[] A02 = {"qTeBguUhuyM1MFes5Wth7HwI8JVW0esL", "wy2OEDVCsbs7Li1HpnMScgVTk8nNd5Di", "4", "CU9fduzhq9VQNbJmZcJcyCUxTgO6nbWs", CampaignEx.CLICKMODE_ON, CmcdData.Factory.STREAMING_FORMAT_SS, "JcGduWYdz", "iAKvMVZDfF33p8y0i7fbnjg8iQoR6jrx"};
    public static final Comparator<C2119Ki> A03 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Kh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((C2119Ki) obj).A01.A00, ((C2119Ki) obj2).A01.A00);
            return compare;
        }
    };
    public final int A00;
    public final C2120Kj A01;

    public C2119Ki(C2120Kj c2120Kj, int i) {
        this.A01 = c2120Kj;
        this.A00 = i;
    }

    public static /* synthetic */ Comparator A03() {
        Comparator<C2119Ki> comparator = A03;
        if (A02[1].charAt(25) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "h";
        strArr[5] = "u";
        return comparator;
    }
}
