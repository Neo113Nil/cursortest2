package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public class EntryXComparator implements java.util.Comparator<com.github.mikephil.charting.data.Entry> {
    @Override // java.util.Comparator
    public int compare(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.data.Entry entry2) {
        float x = entry.getX() - entry2.getX();
        if (x == 0.0f) {
            return 0;
        }
        return x > 0.0f ? 1 : -1;
    }
}
