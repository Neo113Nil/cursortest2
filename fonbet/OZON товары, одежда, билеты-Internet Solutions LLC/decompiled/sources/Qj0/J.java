package Qj0;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;

/* loaded from: classes7.dex */
public final class J extends U {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final PowerManagerRepository f23523j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f23524k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f23525l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f23526m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(@NotNull String key, @NotNull PowerManagerRepository powerManagerRepository, boolean z11, boolean z12) {
        super(key);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(powerManagerRepository, "powerManagerRepository");
        this.f23524k = new AtomicBoolean(false);
        this.f23523j = powerManagerRepository;
        this.f23525l = z11;
        this.f23526m = z12;
        t();
    }

    private final void t() {
        if (this.f23523j.isPowerSaveMode()) {
            this.f23524k.set(true);
        }
    }

    @Override // Qj0.U
    public final boolean m() {
        if (super.m()) {
            return !this.f23524k.get() || this.f23525l;
        }
        return false;
    }

    @Override // Qj0.U
    public final void n(@NotNull AbstractC3880a attribute, boolean z11) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        super.n(attribute, z11);
        t();
    }

    @Override // Qj0.U
    public final void o(@NotNull InterfaceC3892l type, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        super.o(type, j11, z11);
        t();
    }

    @Override // Qj0.U
    public final void q(@NotNull z0 videoMetric) {
        Intrinsics.checkNotNullParameter(videoMetric, "videoMetric");
        super.q(videoMetric);
        t();
    }

    @Override // Qj0.U
    public final void s() {
        if (this.f23525l && this.f23526m) {
            n(new r(this.f23524k.get()), true);
        }
        super.s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(@NotNull U trace, @NotNull PowerManagerRepository powerManagerRepository, boolean z11, boolean z12) {
        super(trace);
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(powerManagerRepository, "powerManagerRepository");
        this.f23524k = new AtomicBoolean(false);
        this.f23523j = powerManagerRepository;
        this.f23525l = z11;
        this.f23526m = z12;
        t();
    }
}
