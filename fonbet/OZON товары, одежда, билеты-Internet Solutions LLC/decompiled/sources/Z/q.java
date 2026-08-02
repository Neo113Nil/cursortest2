package Z;

import C.S;
import Z.m;
import Z.o;
import a0.C4904a;
import a0.C4905b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class q implements o {

    /* renamed from: m, reason: collision with root package name */
    private static final long f35263m = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private AudioRecord f35264a;

    /* renamed from: b, reason: collision with root package name */
    private final Z.a f35265b;

    /* renamed from: f, reason: collision with root package name */
    private final int f35269f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35270g;

    /* renamed from: h, reason: collision with root package name */
    private o.a f35271h;

    /* renamed from: i, reason: collision with root package name */
    private Executor f35272i;

    /* renamed from: j, reason: collision with root package name */
    private long f35273j;

    /* renamed from: k, reason: collision with root package name */
    private AudioManager.AudioRecordingCallback f35274k;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f35266c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f35267d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<Boolean> f35268e = new AtomicReference<>(null);

    /* renamed from: l, reason: collision with root package name */
    private boolean f35275l = false;

    class a extends AudioManager.AudioRecordingCallback {
        a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
                q qVar = q.this;
                if (clientAudioSessionId == qVar.f35264a.getAudioSessionId()) {
                    qVar.e(C4904a.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public q(@NonNull Z.a aVar, Context context) throws IllegalArgumentException, o.b {
        if (!d(aVar.f(), aVar.e(), aVar.b())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(aVar.f()), Integer.valueOf(aVar.e()), Integer.valueOf(aVar.b())));
        }
        this.f35265b = aVar;
        this.f35270g = aVar.d();
        int f7 = aVar.f();
        int e11 = aVar.e();
        int minBufferSize = AudioRecord.getMinBufferSize(f7, e11 == 1 ? 16 : 12, aVar.b());
        x2.i.f(null, minBufferSize > 0);
        int i11 = minBufferSize * 2;
        this.f35269f = i11;
        AudioRecord c11 = c(i11, aVar, context);
        this.f35264a = c11;
        if (c11.getState() == 1) {
            return;
        }
        c11.release();
        throw new o.b("Unable to initialize AudioRecord");
    }

    private void b() {
        x2.i.f("AudioStream has been released.", !this.f35266c.get());
    }

    @NonNull
    private static AudioRecord c(int i11, @NonNull Z.a aVar, Context context) {
        int i12 = Build.VERSION.SDK_INT;
        AudioFormat build = new AudioFormat.Builder().setSampleRate(aVar.f()).setChannelMask(aVar.e() == 1 ? 16 : 12).setEncoding(aVar.b()).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i12 >= 31 && context != null) {
            C4905b.a(builder, context);
        }
        builder.setAudioSource(aVar.c());
        builder.setAudioFormat(build);
        builder.setBufferSizeInBytes(i11);
        return builder.build();
    }

    public static boolean d(int i11, int i12, int i13) {
        if (i11 <= 0 || i12 <= 0) {
            return false;
        }
        return AudioRecord.getMinBufferSize(i11, i12 == 1 ? 16 : 12, i13) > 0;
    }

    final void e(final boolean z11) {
        Executor executor = this.f35272i;
        final o.a aVar = this.f35271h;
        if (executor == null || aVar == null || Objects.equals(this.f35268e.getAndSet(Boolean.valueOf(z11)), Boolean.valueOf(z11))) {
            return;
        }
        executor.execute(new Runnable() { // from class: Z.p
            @Override // java.lang.Runnable
            public final void run() {
                m mVar = m.this;
                mVar.f35254q = z11;
                if (mVar.f35244g == m.c.STARTED) {
                    mVar.d();
                }
            }
        });
    }

    public final void f() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f35266c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f35274k) != null) {
            C4904a.d(this.f35264a, audioRecordingCallback);
        }
        this.f35264a.release();
    }

    public final void g(o.a aVar, Executor executor) {
        x2.i.f("AudioStream can not be started when setCallback.", !this.f35267d.get());
        b();
        this.f35271h = aVar;
        this.f35272i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f35274k;
            if (audioRecordingCallback != null) {
                C4904a.d(this.f35264a, audioRecordingCallback);
            }
            if (this.f35274k == null) {
                this.f35274k = new a();
            }
            C4904a.c(this.f35264a, executor, this.f35274k);
        }
    }

    public final void h() throws o.b {
        b();
        AtomicBoolean atomicBoolean = this.f35267d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (androidx.camera.video.internal.compat.quirk.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.f35264a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new o.b("Unable to initialize AudioRecord");
            }
        }
        this.f35264a.startRecording();
        boolean z11 = false;
        if (this.f35264a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new o.b("Unable to start AudioRecord with state: " + this.f35264a.getRecordingState());
        }
        this.f35273j = 0L;
        this.f35275l = false;
        this.f35268e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration a11 = C4904a.a(this.f35264a);
            z11 = a11 != null && C4904a.b(a11);
        }
        e(z11);
    }

    @SuppressLint({"MissingPermission"})
    public final void i() {
        b();
        if (this.f35267d.getAndSet(false)) {
            this.f35264a.stop();
            if (this.f35264a.getRecordingState() != 1) {
                S.k("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f35264a.getRecordingState());
            }
            if (androidx.camera.video.internal.compat.quirk.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                this.f35264a.release();
                this.f35264a = c(this.f35269f, this.f35265b, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    @Override // Z.o
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o.c read(@NonNull ByteBuffer byteBuffer) {
        b();
        x2.i.f("AudioStream has not been started.", this.f35267d.get());
        int read = this.f35264a.read(byteBuffer, this.f35269f);
        if (read > 0) {
            byteBuffer.limit(read);
            if (!this.f35275l) {
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                if (this.f35264a.getTimestamp(audioTimestamp, 0) == 0) {
                    int f7 = this.f35265b.f();
                    long j11 = this.f35273j;
                    x2.i.a("sampleRate must be greater than 0.", ((long) f7) > 0);
                    x2.i.a("framePosition must be no less than 0.", j11 >= 0);
                    long a11 = audioTimestamp.nanoTime + r.a(f7, j11 - audioTimestamp.framePosition);
                    r1 = a11 >= 0 ? a11 : 0L;
                    if (Math.abs(r1 - System.nanoTime()) > f35263m) {
                        this.f35275l = true;
                    }
                    if (r1 == -1) {
                        r1 = System.nanoTime();
                    }
                    this.f35273j = r.b(this.f35270g, read) + this.f35273j;
                } else {
                    S.k("AudioStreamImpl", "Unable to get audio timestamp");
                }
            }
            r1 = -1;
            if (r1 == -1) {
            }
            this.f35273j = r.b(this.f35270g, read) + this.f35273j;
        }
        return new t(read, r1);
    }
}
