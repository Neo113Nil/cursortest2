package C1;

import A1.O;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import v2.AbstractC1664a;
import w1.C1719l1;
import w1.C1759x1;

/* loaded from: classes.dex */
public final class D extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1759x1 f1339a;

    public D(C1759x1 c1759x1) {
        this.f1339a = c1759x1;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        O o7;
        AbstractC1664a.h(audioTrack == ((E) this.f1339a.f17927d).f1387u);
        E e7 = (E) this.f1339a.f17927d;
        C1719l1 c1719l1 = e7.f1384r;
        if (c1719l1 == null || !e7.f1360U || (o7 = ((H) c1719l1.f17771a).f1403f1) == null) {
            return;
        }
        o7.f181a.f275y.c(2);
    }

    public final void onTearDown(AudioTrack audioTrack) {
        O o7;
        AbstractC1664a.h(audioTrack == ((E) this.f1339a.f17927d).f1387u);
        E e7 = (E) this.f1339a.f17927d;
        C1719l1 c1719l1 = e7.f1384r;
        if (c1719l1 == null || !e7.f1360U || (o7 = ((H) c1719l1.f17771a).f1403f1) == null) {
            return;
        }
        o7.f181a.f275y.c(2);
    }
}
