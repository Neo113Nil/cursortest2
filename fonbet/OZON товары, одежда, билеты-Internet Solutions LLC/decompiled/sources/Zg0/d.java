package Zg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f35927a = new a(0);
    }

    public static final class b extends d {
        public b() {
            super(0);
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d f35928a;

        /* renamed from: b, reason: collision with root package name */
        private final sj.d f35929b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull d defaultLogs, sj.d dVar) {
            super(0);
            Intrinsics.checkNotNullParameter(defaultLogs, "defaultLogs");
            this.f35928a = defaultLogs;
            this.f35929b = dVar;
        }

        @NotNull
        public final d a() {
            return this.f35928a;
        }

        public final ru.ozon.android.ozonLogger.core.h b() {
            return this.f35929b;
        }
    }

    public /* synthetic */ d(int i11) {
        this();
    }

    private d() {
    }
}
