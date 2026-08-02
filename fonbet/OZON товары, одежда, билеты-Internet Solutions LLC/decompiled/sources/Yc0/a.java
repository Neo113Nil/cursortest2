package Yc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0648a f34893a = C0648a.f34894a;

    /* renamed from: Yc0.a$a, reason: collision with other inner class name */
    public static final class C0648a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0648a f34894a = new C0648a();
    }

    public static final class b implements a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain f34895b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO f34896c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO f34897d;

        public b(@NotNull FastEntryActionDTO.FastEntryDataDTO.AuthCurtain curtain, @NotNull FastEntryActionDTO.FastEntryDataDTO data, @NotNull FastEntryActionDTO action) {
            Intrinsics.checkNotNullParameter(curtain, "curtain");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f34895b = curtain;
            this.f34896c = data;
            this.f34897d = action;
        }

        @NotNull
        public final FastEntryActionDTO a() {
            return this.f34897d;
        }

        @NotNull
        public final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain b() {
            return this.f34895b;
        }

        @NotNull
        public final FastEntryActionDTO.FastEntryDataDTO c() {
            return this.f34896c;
        }
    }

    public static final class c implements a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f34898b = new c();
    }
}
