package com.inmobi.media;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes6.dex */
public final class Q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C3730g7 c3730g7 = (C3730g7) obj2;
        C3730g7 c3730g72 = (C3730g7) obj;
        return ComparisonsKt.compareValues(Integer.valueOf(c3730g7.c * c3730g7.d), Integer.valueOf(c3730g72.c * c3730g72.d));
    }
}
