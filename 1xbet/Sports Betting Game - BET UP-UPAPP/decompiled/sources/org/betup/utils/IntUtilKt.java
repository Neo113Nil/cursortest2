package org.betup.utils;

import kotlin.Metadata;

/* compiled from: IntUtil.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"countDigits", "", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IntUtilKt {
    public static final int countDigits(int i) {
        int i2 = 0;
        while (i != 0) {
            i /= 10;
            i2++;
        }
        return i2;
    }
}
