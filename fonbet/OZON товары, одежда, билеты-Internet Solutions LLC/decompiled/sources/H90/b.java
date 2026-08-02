package H90;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import D90.h;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import android.util.Log;
import c90.InterfaceC5773a;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.models.TestingFeaturesV2DeleteDto;
import ru.ozon.fintech.network.models.TestingFeaturesV2Dto;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class b extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f10705a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f10706b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f10707c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC5773a f10708d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f10709e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private String f10710f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f10711g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private String f10712h;

    /* renamed from: i, reason: collision with root package name */
    private TestingFeaturesV2Dto f10713i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<d> f10714j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C0 f10715k;

    public b(@NotNull Application application, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b fintechNavigation, @NotNull InterfaceC5773a testEnvironmentManager) {
        d dVar;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(testEnvironmentManager, "testEnvironmentManager");
        this.f10705a = application;
        this.f10706b = fintechSettings;
        this.f10707c = fintechNavigation;
        this.f10708d = testEnvironmentManager;
        this.f10709e = k.b(new h(this, 2));
        this.f10710f = "";
        this.f10711g = "";
        this.f10712h = "";
        dVar = d.f10721f;
        this.f10714j = O0.a(dVar);
        this.f10715k = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
    }

    public static L90.a d0(b bVar) {
        return new L90.a(bVar.f10705a, bVar.f10706b);
    }

    private final void handleState() {
        d dVar;
        TestingFeaturesV2Dto testingFeaturesV2Dto = this.f10713i;
        if (testingFeaturesV2Dto == null) {
            int i11 = d.f10722g;
            dVar = d.f10721f;
        } else {
            String json = testingFeaturesV2Dto.toJson();
            String str = json == null ? "" : json;
            dVar = new d(this.f10710f, this.f10711g, testingFeaturesV2Dto.getEdit().isEmpty() ? "" : this.f10712h, str, str.length() > 0);
        }
        this.f10714j.setValue(dVar);
    }

    @NotNull
    public final C0 e0() {
        return this.f10715k;
    }

    @NotNull
    public final x0<d> f0() {
        return this.f10714j;
    }

    public final void g0() {
        this.f10707c.pop();
    }

    public final void h0() {
        TestingFeaturesV2Dto testingFeaturesV2Dto;
        String str;
        TestingFeaturesV2Dto testingFeaturesV2Dto2;
        TestingFeaturesV2Dto testingFeaturesV2Dto3;
        String editAsString;
        TestingFeaturesV2DeleteDto delete;
        List<String> realtimeSwitches;
        TestingFeaturesV2DeleteDto delete2;
        List<String> flags;
        String n11 = this.f10708d.n();
        TestingFeaturesV2Dto.INSTANCE.getClass();
        if (n11 != null && n11.length() != 0) {
            try {
                Object value = TestingFeaturesV2Dto.jsonAdapter$delegate.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                testingFeaturesV2Dto = (TestingFeaturesV2Dto) ((JsonAdapter) value).fromJson(n11);
            } catch (Throwable th2) {
                Log.d("TestingFeaturesV2Dto", "Не удалось распарсить json: ".concat(n11), th2);
            }
            this.f10713i = testingFeaturesV2Dto;
            str = "";
            if (testingFeaturesV2Dto != null || (delete2 = testingFeaturesV2Dto.getDelete()) == null || (flags = delete2.getFlags()) == null || (r0 = C7714v.V(flags, ",", null, null, null, 62)) == null) {
                String str2 = "";
            }
            this.f10710f = str2;
            testingFeaturesV2Dto2 = this.f10713i;
            if (testingFeaturesV2Dto2 != null || (delete = testingFeaturesV2Dto2.getDelete()) == null || (realtimeSwitches = delete.getRealtimeSwitches()) == null || (r0 = C7714v.V(realtimeSwitches, ",", null, null, null, 62)) == null) {
                String str3 = "";
            }
            this.f10711g = str3;
            testingFeaturesV2Dto3 = this.f10713i;
            if (testingFeaturesV2Dto3 != null && (editAsString = testingFeaturesV2Dto3.getEditAsString()) != null) {
                str = editAsString;
            }
            this.f10712h = str;
            handleState();
        }
        testingFeaturesV2Dto = null;
        this.f10713i = testingFeaturesV2Dto;
        str = "";
        if (testingFeaturesV2Dto != null) {
        }
        String str22 = "";
        this.f10710f = str22;
        testingFeaturesV2Dto2 = this.f10713i;
        if (testingFeaturesV2Dto2 != null) {
        }
        String str32 = "";
        this.f10711g = str32;
        testingFeaturesV2Dto3 = this.f10713i;
        if (testingFeaturesV2Dto3 != null) {
            str = editAsString;
        }
        this.f10712h = str;
        handleState();
    }

    public final void i0() {
        this.f10710f = "";
        this.f10711g = "";
        this.f10712h = "";
        this.f10713i = null;
        handleState();
        this.f10708d.c();
        InterfaceC5773a.C0860a c0860a = InterfaceC5773a.f56817a;
        InterfaceC4008j interfaceC4008j = this.f10709e;
        ((L90.a) interfaceC4008j.getValue()).a("", "/", "ob-testing-features-v2", true);
        ((L90.a) interfaceC4008j.getValue()).a(".", "", "ob-testing-features-v2", true);
        this.f10715k.tryEmit("Хэдер удалён. Для применения изменений перезагрузите приложение");
    }

    public final void j0(@NotNull String deleteFeaturesString, @NotNull String deleteSwitchesString, @NotNull String editFeaturesString) {
        Intrinsics.checkNotNullParameter(deleteFeaturesString, "deleteFeaturesString");
        Intrinsics.checkNotNullParameter(deleteSwitchesString, "deleteSwitchesString");
        Intrinsics.checkNotNullParameter(editFeaturesString, "editFeaturesString");
        this.f10710f = deleteFeaturesString;
        this.f10711g = deleteSwitchesString;
        this.f10712h = editFeaturesString;
        TestingFeaturesV2Dto.INSTANCE.getClass();
        TestingFeaturesV2Dto a11 = TestingFeaturesV2Dto.Companion.a(deleteFeaturesString, deleteSwitchesString, editFeaturesString);
        this.f10713i = a11;
        boolean K11 = kotlin.text.h.K(this.f10712h);
        C0 c02 = this.f10715k;
        if (!K11 && a11.getEdit().isEmpty()) {
            c02.tryEmit("Некорректный формат фичей для изменения");
        }
        this.f10708d.p(a11.getDelete().getFlags(), a11.getDelete().getRealtimeSwitches(), a11.getEdit());
        c02.tryEmit("Хэдер сохранён успешно. Для применения изменений перезагрузите приложение");
        handleState();
    }
}
