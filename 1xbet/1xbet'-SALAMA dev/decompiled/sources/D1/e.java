package D1;

import java.util.Locale;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1693i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
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
        int i18 = t.f17159a;
        Locale locale = Locale.US;
        StringBuilder sbG = p150v0.a.g("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i8, "\n queuedInputBuffers=");
        sbG.append(i9);
        sbG.append("\n skippedInputBuffers=");
        sbG.append(i10);
        sbG.append("\n renderedOutputBuffers=");
        sbG.append(i11);
        sbG.append("\n skippedOutputBuffers=");
        sbG.append(i12);
        sbG.append("\n droppedBuffers=");
        sbG.append(i13);
        sbG.append("\n droppedInputBuffers=");
        sbG.append(i14);
        sbG.append("\n maxConsecutiveDroppedBuffers=");
        sbG.append(i15);
        sbG.append("\n droppedToKeyframeEvents=");
        sbG.append(i16);
        sbG.append("\n totalVideoFrameProcessingOffsetUs=");
        sbG.append(j);
        sbG.append("\n videoFrameProcessingOffsetCount=");
        sbG.append(i17);
        sbG.append("\n}");
        return sbG.toString();
    }
}
