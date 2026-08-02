package T30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f26599a = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f26600b = Executors.newFixedThreadPool(3);

    @Override // T30.c
    @NotNull
    public final ExecutorService a() {
        ExecutorService cpu = this.f26600b;
        Intrinsics.checkNotNullExpressionValue(cpu, "cpu");
        return cpu;
    }
}
