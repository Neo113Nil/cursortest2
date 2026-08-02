package G90;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import E30.d;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import android.util.Log;
import c90.InterfaceC5773a;
import com.squareup.moshi.JsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.models.TestingFeaturesDto;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f9792a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f9793b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f9794c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC5773a f9795d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f9796e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private String f9797f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<c> f9798g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C0 f9799h;

    public a(@NotNull Application application, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b fintechNavigation, @NotNull InterfaceC5773a testEnvironmentManager) {
        c cVar;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(testEnvironmentManager, "testEnvironmentManager");
        this.f9792a = application;
        this.f9793b = fintechSettings;
        this.f9794c = fintechNavigation;
        this.f9795d = testEnvironmentManager;
        this.f9796e = k.b(new A30.a(this, 2));
        this.f9797f = "";
        cVar = c.f9804d;
        this.f9798g = O0.a(cVar);
        this.f9799h = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
    }

    public static L90.a d0(a aVar) {
        return new L90.a(aVar.f9792a, aVar.f9793b);
    }

    private final void handleState() {
        String json;
        TestingFeaturesDto.Companion companion = TestingFeaturesDto.INSTANCE;
        String str = this.f9797f;
        companion.getClass();
        TestingFeaturesDto a11 = TestingFeaturesDto.Companion.a(str);
        String str2 = "";
        if (!a11.isEmpty() && (json = a11.toJson()) != null) {
            str2 = json;
        }
        this.f9798g.setValue(new c(this.f9797f, str2, !a11.isEmpty()));
    }

    @NotNull
    public final C0 e0() {
        return this.f9799h;
    }

    @NotNull
    public final x0<c> f0() {
        return this.f9798g;
    }

    public final void g0() {
        this.f9794c.pop();
    }

    public final void h0() {
        TestingFeaturesDto testingFeaturesDto;
        String testingFeaturesHeader = this.f9795d.getTestingFeaturesHeader();
        TestingFeaturesDto.INSTANCE.getClass();
        if (testingFeaturesHeader.length() != 0) {
            try {
                Object value = TestingFeaturesDto.jsonAdapter$delegate.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                testingFeaturesDto = (TestingFeaturesDto) ((JsonAdapter) value).fromJson(testingFeaturesHeader);
            } catch (Throwable th2) {
                Log.d("TestingFeaturesDto", "Не удалось распарсить json: ".concat(testingFeaturesHeader), th2);
            }
            if (testingFeaturesDto != null || (r0 = testingFeaturesDto.getFeaturesString()) == null) {
                String str = "";
            }
            this.f9797f = str;
            handleState();
        }
        testingFeaturesDto = null;
        if (testingFeaturesDto != null) {
        }
        String str2 = "";
        this.f9797f = str2;
        handleState();
    }

    public final void i0() {
        this.f9797f = "";
        handleState();
        this.f9795d.q();
        InterfaceC5773a.C0860a c0860a = InterfaceC5773a.f56817a;
        InterfaceC4008j interfaceC4008j = this.f9796e;
        ((L90.a) interfaceC4008j.getValue()).a("", "/", "ob-testing_features", true);
        ((L90.a) interfaceC4008j.getValue()).a("", "/m/lk", "ob-testing_features", true);
        ((L90.a) interfaceC4008j.getValue()).a(".", "", "ob-testing_features", true);
        ((L90.a) interfaceC4008j.getValue()).a(".", "/m/lk", "ob-testing_features", true);
        this.f9799h.tryEmit("Хэдер удалён. Для применения изменений перезагрузите приложение");
    }

    public final void j0(@NotNull String enableFeaturesString) {
        Intrinsics.checkNotNullParameter(enableFeaturesString, "enableFeaturesString");
        TestingFeaturesDto.INSTANCE.getClass();
        TestingFeaturesDto a11 = TestingFeaturesDto.Companion.a(enableFeaturesString);
        this.f9797f = enableFeaturesString;
        this.f9799h.tryEmit((a11.isEmpty() ? "Конфиг пустой. Хэдер будет удалён." : "Хэдер сохранён успешно.").concat(" Для применения изменений перезагрузите приложение"));
        this.f9795d.k(enableFeaturesString);
        handleState();
    }
}
