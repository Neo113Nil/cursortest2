package E90;

import Ae.O0;
import Ae.x0;
import Sc.o;
import com.squareup.moshi.Moshi;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinInputDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextAreaV22DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.ui.input.InputView;
import t40.EnumC9751a;
import t40.EnumC9752b;

/* loaded from: classes3.dex */
public final class m extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f7669a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f7670b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<InputView.Style> f7671c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7672a;

        static {
            int[] iArr = new int[InputView.Style.values().length];
            try {
                iArr[InputView.Style.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputView.Style.TEXTAREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7672a = iArr;
        }
    }

    public m(@NotNull S80.b fintechNavigation, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f7669a = fintechNavigation;
        this.f7670b = moshi;
        this.f7671c = O0.a(InputView.Style.INPUT);
    }

    public final void d0(@NotNull InputView.Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f7671c.setValue(style);
    }

    @NotNull
    public final x0<InputView.Style> e0() {
        return this.f7671c;
    }

    public final void f0(@NotNull String value, @NotNull InputView.Size size, @NotNull InputView.Theme theme, String str, String str2, String str3, @NotNull InputView.Status status, @NotNull InputView.State state, String str4, String str5, Integer num, String str6, @NotNull InputView.LabelPosition labelPosition, String str7, @NotNull InputView.InputMode inputMode, Boolean bool, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Boolean bool4) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        int i11 = a.f7672a[this.f7671c.getValue().ordinal()];
        S80.b bVar = this.f7669a;
        String str8 = "";
        Moshi moshi = this.f7670b;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new o();
            }
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(state, "state");
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            EnumC9752b enumC9752b = EnumC9752b.START;
            List b02 = C7714v.b0(enumC9752b, enumC9752b);
            CbottomElement2 cbottomElement2 = null;
            Integer num4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Integer num5 = null;
            Integer num6 = null;
            Float f7 = null;
            Float f11 = null;
            String str9 = null;
            List list = null;
            EnumC9751a enumC9751a = null;
            String str10 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            Float f12 = null;
            try {
                str8 = moshi.c(TextAreaV22DTO.class).toJson(new TextAreaV22DTO(cbottomElement2, uuid, num4, Boolean.TRUE, bool5, bool6, bool7, -1, -2, num5, num6, f7, C7714v.b0(0, 0, 0, 0), b02, f11, C7714v.b0(16, 16, 16, 24), C7714v.b0(0, 0, 0, 0), str9, list, enumC9751a, str10, num7, num8, num9, num10, f12, value, str, str2, str3, status, state, str6, bool, num2, num3, bool2, bool3, bool4.booleanValue(), null, null, null, null, null, null, null, 66997877, 16256, null));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            String jSONObject = new JSONObject(str8).toString(4);
            Intrinsics.f(jSONObject);
            bVar.C0("cBottom json", jSONObject);
            return;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        String uuid2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
        EnumC9752b enumC9752b2 = EnumC9752b.START;
        List b03 = C7714v.b0(enumC9752b2, enumC9752b2);
        CbottomElement2 cbottomElement22 = null;
        Integer num11 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        Integer num12 = null;
        Integer num13 = null;
        Float f13 = null;
        Float f14 = null;
        try {
            str8 = moshi.c(FinInputDTO.class).toJson(new FinInputDTO(cbottomElement22, uuid2, num11, Boolean.TRUE, bool8, bool9, bool10, -1, -2, num12, num13, f13, C7714v.b0(0, 0, 0, 0), b03, f14, C7714v.b0(16, 16, 16, 24), C7714v.b0(0, 0, 0, 0), null, null, null, null, null, null, null, null, null, null, value, size, theme, str, str2, str3, status, state, str4, str5, num, str6, labelPosition, str7, inputMode, null, null, null, null, null, null, 134106741, 64512, null));
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        String jSONObject2 = new JSONObject(str8).toString(4);
        Intrinsics.f(jSONObject2);
        bVar.C0("cBottom json", jSONObject2);
    }

    public final void g0() {
        this.f7669a.pop();
    }
}
