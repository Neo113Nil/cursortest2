package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: com.inmobi.media.kl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3857kl implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7206a;

    public C3857kl(int i) {
        this.f7206a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.f7206a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.f7206a)));
    }
}
