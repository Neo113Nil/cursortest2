package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzan implements java.util.Comparator {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        com.google.android.libraries.places.api.model.FuelPrice.FuelType type;
        com.google.android.libraries.places.api.model.FuelPrice.FuelType type2 = ((com.google.android.libraries.places.api.model.FuelPrice) obj).getType();
        int i2 = 5;
        if (type2 != null) {
            int ordinal = type2.ordinal();
            if (ordinal == 1) {
                i = 4;
            } else if (ordinal == 2) {
                i = 1;
            } else if (ordinal == 3) {
                i = 2;
            } else if (ordinal == 4) {
                i = 3;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            type = ((com.google.android.libraries.places.api.model.FuelPrice) obj2).getType();
            if (type != null) {
                int ordinal2 = type.ordinal();
                if (ordinal2 == 1) {
                    i2 = 4;
                } else if (ordinal2 == 2) {
                    i2 = 1;
                } else if (ordinal2 == 3) {
                    i2 = 2;
                } else if (ordinal2 == 4) {
                    i2 = 3;
                }
            }
            return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Integer.valueOf(i2));
        }
        i = 5;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i);
        type = ((com.google.android.libraries.places.api.model.FuelPrice) obj2).getType();
        if (type != null) {
        }
        return kotlin.comparisons.ComparisonsKt.compareValues(valueOf2, java.lang.Integer.valueOf(i2));
    }
}
