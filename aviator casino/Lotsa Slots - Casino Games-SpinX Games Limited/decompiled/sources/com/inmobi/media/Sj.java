package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Sj implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.inmobi.media.ads.network.inmobiJson.model.Image) obj2).getWidth()), java.lang.Integer.valueOf(((com.inmobi.media.ads.network.inmobiJson.model.Image) obj).getWidth()));
    }
}
