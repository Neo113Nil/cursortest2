package Zl0;

import com.vk.push.common.messaging.RemoteMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class s {

    public static final class a extends s {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final RemoteMessage f36101a;

        public a(@NotNull RemoteMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f36101a = message;
        }
    }

    public static final class b extends s {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f36102a;

        public b(@NotNull String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.f36102a = token;
        }
    }

    public static final class c extends s {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f36103a = new c();
    }

    public static final class d extends s {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<Sl0.a> f36104a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull List<? extends Sl0.a> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f36104a = errors;
        }
    }
}
