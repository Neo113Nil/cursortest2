package Xc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: Xc0.a$a, reason: collision with other inner class name */
    public static final class C0614a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0614a f34279a = new C0614a();
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final OtpDTO.AgreementSheet f34280a;

        public b(@NotNull OtpDTO.AgreementSheet dto) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.f34280a = dto;
        }

        @NotNull
        public final OtpDTO.AgreementSheet a() {
            return this.f34280a;
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain f34281a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO f34282b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO f34283c;

        public c(@NotNull FastEntryActionDTO.FastEntryDataDTO.AuthCurtain curtain, @NotNull FastEntryActionDTO.FastEntryDataDTO data, @NotNull FastEntryActionDTO action) {
            Intrinsics.checkNotNullParameter(curtain, "curtain");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f34281a = curtain;
            this.f34282b = data;
            this.f34283c = action;
        }

        @NotNull
        public final FastEntryActionDTO a() {
            return this.f34283c;
        }

        @NotNull
        public final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain b() {
            return this.f34281a;
        }

        @NotNull
        public final FastEntryActionDTO.FastEntryDataDTO c() {
            return this.f34282b;
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f34284a = new d();
    }
}
