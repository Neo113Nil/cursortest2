package D1;

import java.util.Locale;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f1685a;

    /* renamed from: b, reason: collision with root package name */
    public int f1686b;

    /* renamed from: c, reason: collision with root package name */
    public int f1687c;

    /* renamed from: d, reason: collision with root package name */
    public int f1688d;

    /* renamed from: e, reason: collision with root package name */
    public int f1689e;

    /* renamed from: f, reason: collision with root package name */
    public int f1690f;

    /* renamed from: g, reason: collision with root package name */
    public int f1691g;

    /* renamed from: h, reason: collision with root package name */
    public int f1692h;

    /* renamed from: i, reason: collision with root package name */
    public int f1693i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f1694k;

    /* renamed from: l, reason: collision with root package name */
    public int f1695l;

    public final String toString() {
        int i7 = this.f1685a;
        int i8 = this.f1686b;
        int i9 = this.f1687c;
        int i10 = this.f1688d;
        int i11 = this.f1689e;
        int i12 = this.f1690f;
        int i13 = this.f1691g;
        int i14 = this.f1692h;
        int i15 = this.f1693i;
        int i16 = this.j;
        long j = this.f1694k;
        int i17 = this.f1695l;
        int i18 = t.f17153a;
        Locale locale = Locale.US;
        StringBuilder g3 = AbstractC1663a.g("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i8, "\n queuedInputBuffers=");
        g3.append(i9);
        g3.append("\n skippedInputBuffers=");
        g3.append(i10);
        g3.append("\n renderedOutputBuffers=");
        g3.append(i11);
        g3.append("\n skippedOutputBuffers=");
        g3.append(i12);
        g3.append("\n droppedBuffers=");
        g3.append(i13);
        g3.append("\n droppedInputBuffers=");
        g3.append(i14);
        g3.append("\n maxConsecutiveDroppedBuffers=");
        g3.append(i15);
        g3.append("\n droppedToKeyframeEvents=");
        g3.append(i16);
        g3.append("\n totalVideoFrameProcessingOffsetUs=");
        g3.append(j);
        g3.append("\n videoFrameProcessingOffsetCount=");
        g3.append(i17);
        g3.append("\n}");
        return g3.toString();
    }
}
