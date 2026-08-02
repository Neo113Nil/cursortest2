package Fc0;

import B0.C2454a;
import Kk.C3532b;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.b;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC0196c f9334a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f9335b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9336c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9337d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9338e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9339f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9340g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f9341h;

    /* renamed from: i, reason: collision with root package name */
    private final a f9342i;

    /* renamed from: j, reason: collision with root package name */
    private final a f9343j;

    /* renamed from: k, reason: collision with root package name */
    private final d f9344k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ButtonV3DTO.StyleTypes f9345a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9346b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f9347c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f9348d;

        public a(@NotNull ButtonV3DTO.StyleTypes styleType, int i11, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(styleType, "styleType");
            this.f9345a = styleType;
            this.f9346b = i11;
            this.f9347c = num;
            this.f9348d = num2;
        }

        private static String a(Context context, Integer num) {
            if (num == null) {
                return null;
            }
            String format = String.format(Locale.getDefault(), "#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(androidx.core.content.a.getColor(context, num.intValue()))}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        @NotNull
        public final ButtonV3DTO b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_500;
            String string = context.getString(this.f9346b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String a11 = a(context, this.f9347c);
            return new ButtonV3DTO(this.f9345a, sizes, string, null, null, null, null, a(context, this.f9348d), null, null, null, null, a11, null, null, null, null, null, 249720, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9345a == aVar.f9345a && this.f9346b == aVar.f9346b && Intrinsics.d(this.f9347c, aVar.f9347c) && Intrinsics.d(this.f9348d, aVar.f9348d);
        }

        public final int hashCode() {
            int a11 = C2454a.a(this.f9346b, this.f9345a.hashCode() * 31, 31);
            Integer num = this.f9347c;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f9348d;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonUI(styleType=");
            sb2.append(this.f9345a);
            sb2.append(", title=");
            sb2.append(this.f9346b);
            sb2.append(", backgroundColor=");
            sb2.append(this.f9347c);
            sb2.append(", titleColor=");
            return Ep.a.c(sb2, this.f9348d, ")");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f9349a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9350b;

        /* renamed from: c, reason: collision with root package name */
        private final int f9351c;

        /* renamed from: d, reason: collision with root package name */
        private final C7735q f9352d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i11, int i12, int i13, Function0<Unit> function0) {
            this.f9349a = i11;
            this.f9350b = i12;
            this.f9351c = i13;
            this.f9352d = (C7735q) function0;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
        @NotNull
        public final b.c.C2137b a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new b.c.C2137b(context.getString(this.f9349a), context.getString(this.f9350b), context.getString(this.f9351c), this.f9352d, null, 192);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9349a == bVar.f9349a && this.f9350b == bVar.f9350b && this.f9351c == bVar.f9351c && this.f9352d.equals(bVar.f9352d);
        }

        public final int hashCode() {
            return this.f9352d.hashCode() + C2454a.a(this.f9351c, C2454a.a(this.f9350b, Integer.hashCode(this.f9349a) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            return "ErrorUI(title=" + this.f9349a + ", description=" + this.f9350b + ", buttonText=" + this.f9351c + ", actionButtonClickListener=" + this.f9352d + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Fc0.c$c, reason: collision with other inner class name */
    public static final class EnumC0196c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0196c[] $VALUES;
        public static final EnumC0196c PASS;
        public static final EnumC0196c PASS_CHECK;
        public static final EnumC0196c SELFIE;

        static {
            EnumC0196c enumC0196c = new EnumC0196c("PASS", 0);
            PASS = enumC0196c;
            EnumC0196c enumC0196c2 = new EnumC0196c("PASS_CHECK", 1);
            PASS_CHECK = enumC0196c2;
            EnumC0196c enumC0196c3 = new EnumC0196c("SELFIE", 2);
            SELFIE = enumC0196c3;
            EnumC0196c[] enumC0196cArr = {enumC0196c, enumC0196c2, enumC0196c3};
            $VALUES = enumC0196cArr;
            $ENTRIES = Xc.b.a(enumC0196cArr);
        }

        private EnumC0196c() {
            throw null;
        }

        public static EnumC0196c valueOf(String str) {
            return (EnumC0196c) Enum.valueOf(EnumC0196c.class, str);
        }

        public static EnumC0196c[] values() {
            return (EnumC0196c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d CHECK;
        public static final d FRAME;
        public static final d SELF;
        private final int title;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9353a;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.SELF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.FRAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.CHECK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f9353a = iArr;
            }
        }

        static {
            d dVar = new d("SELF", 0, R.string.ozonid_camera_disclaimer_self);
            SELF = dVar;
            d dVar2 = new d("FRAME", 1, R.string.ozonid_camera_disclaimer_frame);
            FRAME = dVar2;
            d dVar3 = new d("CHECK", 2, R.string.ozonid_camera_disclaimer_check);
            CHECK = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            $VALUES = dVarArr;
            $ENTRIES = Xc.b.a(dVarArr);
        }

        private d(String str, int i11, int i12) {
            this.title = i12;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public final int a() {
            return this.title;
        }
    }

    public c(EnumC0196c enumC0196c, Uri uri, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Integer num, a aVar, a aVar2, d dVar) {
        this.f9334a = enumC0196c;
        this.f9335b = uri;
        this.f9336c = z11;
        this.f9337d = z12;
        this.f9338e = z13;
        this.f9339f = z14;
        this.f9340g = z15;
        this.f9341h = num;
        this.f9342i = aVar;
        this.f9343j = aVar2;
        this.f9344k = dVar;
    }

    public final Integer a() {
        return this.f9341h;
    }

    public final EnumC0196c b() {
        return this.f9334a;
    }

    public final a c() {
        return this.f9342i;
    }

    public final Uri d() {
        return this.f9335b;
    }

    public final d e() {
        return this.f9344k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9334a == cVar.f9334a && Intrinsics.d(this.f9335b, cVar.f9335b) && this.f9336c == cVar.f9336c && this.f9337d == cVar.f9337d && this.f9338e == cVar.f9338e && this.f9339f == cVar.f9339f && this.f9340g == cVar.f9340g && Intrinsics.d(this.f9341h, cVar.f9341h) && Intrinsics.d(this.f9342i, cVar.f9342i) && Intrinsics.d(this.f9343j, cVar.f9343j) && this.f9344k == cVar.f9344k;
    }

    public final boolean f() {
        return this.f9336c;
    }

    public final a g() {
        return this.f9343j;
    }

    public final boolean h() {
        return this.f9338e;
    }

    public final int hashCode() {
        EnumC0196c enumC0196c = this.f9334a;
        int hashCode = (enumC0196c == null ? 0 : enumC0196c.hashCode()) * 31;
        Uri uri = this.f9335b;
        int a11 = C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f9336c), 31, this.f9337d), 31, this.f9338e), 31, this.f9339f), 31, this.f9340g);
        Integer num = this.f9341h;
        int hashCode2 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.f9342i;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f9343j;
        int hashCode4 = (hashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        d dVar = this.f9344k;
        return hashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final boolean i() {
        return this.f9339f;
    }

    public final boolean j() {
        return this.f9340g;
    }

    public final boolean k() {
        return this.f9337d;
    }

    @NotNull
    public final String toString() {
        return "CameraUiState(frame=" + this.f9334a + ", savedImageURI=" + this.f9335b + ", shutter=" + this.f9336c + ", uploadProgress=" + this.f9337d + ", switchCamera=" + this.f9338e + ", torch=" + this.f9339f + ", torchOn=" + this.f9340g + ", disclaimer=" + this.f9341h + ", retakeButt=" + this.f9342i + ", submitButt=" + this.f9343j + ", selfieDisclaimerStage=" + this.f9344k + ")";
    }
}
