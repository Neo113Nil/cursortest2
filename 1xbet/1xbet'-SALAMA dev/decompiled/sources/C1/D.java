package C1;

import A1.O;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import p155w1.C1010l1;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1050x1 f1339a;

    public D(C1050x1 c1050x1) {
        this.f1339a = c1050x1;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        O o7;
        p151v2.a.h(audioTrack == ((E) this.f1339a.f17933d).f1387u);
        E e7 = (E) this.f1339a.f17933d;
        C1010l1 c1010l1 = e7.f1384r;
        if (c1010l1 == null || !e7.f1360U || (o7 = ((H) c1010l1.f17777a).f1403f1) == null) {
            return;
        }
        o7.f181a.f275y.c(2);
    }

    public final void onTearDown(AudioTrack audioTrack) {
        O o7;
        p151v2.a.h(audioTrack == ((E) this.f1339a.f17933d).f1387u);
        E e7 = (E) this.f1339a.f17933d;
        C1010l1 c1010l1 = e7.f1384r;
        if (c1010l1 == null || !e7.f1360U || (o7 = ((H) c1010l1.f17777a).f1403f1) == null) {
            return;
        }
        o7.f181a.f275y.c(2);
    }
}
