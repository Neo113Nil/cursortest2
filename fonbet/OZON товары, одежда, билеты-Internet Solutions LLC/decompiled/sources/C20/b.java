package C20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f4365a;

    /* renamed from: b, reason: collision with root package name */
    private final Exception f4366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Exception exc) {
        super("Не удалось прочитать файл localz-string-resources-report.json из асетов", exc);
        Intrinsics.checkNotNullParameter("Не удалось прочитать файл localz-string-resources-report.json из асетов", "message");
        this.f4365a = "Не удалось прочитать файл localz-string-resources-report.json из асетов";
        this.f4366b = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f4366b;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f4365a;
    }
}
