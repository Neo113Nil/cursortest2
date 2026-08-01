package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: com.inmobi.media.ll, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3887ll implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7230a;

    public C3887ll(int i) {
        this.f7230a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.f7230a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.f7230a)));
    }
}
