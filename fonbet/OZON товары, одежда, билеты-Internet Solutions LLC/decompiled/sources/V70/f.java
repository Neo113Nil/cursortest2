package V70;

import Pk0.g;
import android.media.MediaRecorder;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final File f28428a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f28429b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f28430c;

    /* renamed from: d, reason: collision with root package name */
    private MediaRecorder f28431d;

    /* renamed from: e, reason: collision with root package name */
    private File f28432e;

    /* renamed from: f, reason: collision with root package name */
    private int f28433f;

    public f(File file, @NotNull a quality, @NotNull String issueId) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        this.f28428a = file;
        this.f28429b = quality;
        this.f28430c = issueId;
    }

    private final void c() {
        File file = this.f28428a;
        if (!file.exists()) {
            throw new IllegalArgumentException("Output directory must exist");
        }
        int i11 = this.f28433f + 1;
        this.f28433f = i11;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        g.d(i11, this.f28430c, "_", "_", sb2);
        this.f28432e = new File(file, P4.f.a(currentTimeMillis, ".m4a", sb2));
        MediaRecorder mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(3);
        a aVar = this.f28429b;
        mediaRecorder.setAudioEncodingBitRate(aVar.a());
        mediaRecorder.setAudioSamplingRate(aVar.b());
        File file2 = this.f28432e;
        mediaRecorder.setOutputFile(file2 != null ? file2.getAbsolutePath() : null);
        mediaRecorder.prepare();
        mediaRecorder.start();
        this.f28431d = mediaRecorder;
    }

    public final File a(boolean z11) {
        MediaRecorder mediaRecorder = this.f28431d;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            mediaRecorder.release();
        }
        this.f28431d = null;
        File file = this.f28432e;
        if (z11) {
            c();
        }
        return file;
    }

    public final void b() {
        c();
    }
}
