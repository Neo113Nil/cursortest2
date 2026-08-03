package com.inmobi.media;

/* renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2680pn implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2760sn f5398a;

    public C2680pn(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.C2760sn c2760sn) {
        this.f5398a = c2760sn;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.widget.ProgressBar progressBar;
        com.inmobi.media.AbstractC2493im abstractC2493im = (com.inmobi.media.AbstractC2493im) obj;
        com.inmobi.media.C2760sn c2760sn = this.f5398a;
        c2760sn.getClass();
        if (abstractC2493im instanceof com.inmobi.media.Bn) {
            android.widget.ProgressBar progressBar2 = c2760sn.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (abstractC2493im instanceof com.inmobi.media.C2653on) {
            int i = ((com.inmobi.media.C2653on) abstractC2493im).b;
            android.widget.ProgressBar progressBar3 = c2760sn.e;
            if (progressBar3 != null) {
                com.inmobi.media.L6.a(c2760sn.f);
                c2760sn.f = com.inmobi.media.T4.a(c2760sn.f5453a, new com.inmobi.media.C2731rn(progressBar3, c2760sn, i, null));
            }
        } else if ((abstractC2493im instanceof com.inmobi.media.C2442gm) && c2760sn.c.b && (progressBar = c2760sn.e) != null) {
            progressBar.setVisibility(8);
        }
        return kotlin.Unit.INSTANCE;
    }
}
