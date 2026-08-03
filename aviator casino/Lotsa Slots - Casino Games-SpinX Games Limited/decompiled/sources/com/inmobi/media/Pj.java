package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Pj implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4900a;

    public Pj(int i) {
        this.f4900a = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(java.lang.Math.abs(((com.inmobi.media.ads.network.inmobiJson.model.Image) obj).getWidth() - this.f4900a)), java.lang.Integer.valueOf(java.lang.Math.abs(((com.inmobi.media.ads.network.inmobiJson.model.Image) obj2).getWidth() - this.f4900a)));
    }
}
