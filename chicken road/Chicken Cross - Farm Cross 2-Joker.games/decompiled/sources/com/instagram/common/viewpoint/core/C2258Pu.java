package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2258Pu implements Comparator<View> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(View view, View view2) {
        C2252Po c2252Po = (C2252Po) view.getLayoutParams();
        C2252Po c2252Po2 = (C2252Po) view2.getLayoutParams();
        if (c2252Po.A05 != c2252Po2.A05) {
            return c2252Po.A05 ? 1 : -1;
        }
        return c2252Po.A02 - c2252Po2.A02;
    }
}
