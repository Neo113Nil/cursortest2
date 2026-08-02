package E60;

import H30.q;
import N30.a;
import Sc.C4001c;
import U50.j;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.widget.PinWidgetRequest;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class b implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f7588a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final N30.b f7589b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Moshi f7590c;

    public b(@NotNull Context context, @NotNull N30.b widgetConfig, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f7588a = context;
        this.f7589b = widgetConfig;
        this.f7590c = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "pin";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        N30.c cVar;
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Moshi moshi = this.f7590c;
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(PinWidgetRequest.class, "clazz");
        Object a11 = q.a(moshi, parameterJson, PinWidgetRequest.class);
        if (a11 == null) {
            ((j) callback).invoke(new NativeResult.Error("Ошибка парсинга Json'а", NativeResult.Error.a.SDK_ERROR));
        }
        PinWidgetRequest pinWidgetRequest = (PinWidgetRequest) a11;
        if (pinWidgetRequest != null) {
            a.C0357a c0357a = N30.a.Companion;
            String widget = pinWidgetRequest.getWidget();
            c0357a.getClass();
            Intrinsics.checkNotNullParameter(widget, "<this>");
            String lowerCase = widget.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            N30.a aVar = Intrinsics.d(lowerCase, "bank") ? N30.a.BANK : Intrinsics.d(lowerCase, "qr") ? N30.a.QR : null;
            if (aVar == null) {
                ((j) callback).invoke(new NativeResult.Error("Приложение не может добавить виджет с таким именем", null, 2, null));
                L80.a.b("AddWidgetBridgeInterface", "Приложение не может добавить виджет с таким именем");
                return;
            }
            try {
                cVar = this.f7589b.a().get(aVar);
            } catch (Exception e11) {
                L80.a.b("AddWidgetBridgeInterface", C4001c.b(e11));
                ((j) callback).invoke(new NativeResult.Error("Приложение не может добавить виджет с таким именем", null, 2, null));
                cVar = null;
            }
            if (cVar == null) {
                return;
            }
            Context context = this.f7588a;
            AppWidgetManager appWidgetManager = (AppWidgetManager) context.getSystemService(AppWidgetManager.class);
            if (appWidgetManager == null) {
                ((j) callback).invoke(new NativeResult.Error("Отсутствует системный сервис для работы с виджетами", null, 2, null));
                L80.a.b("AddWidgetBridgeInterface", "Отсутствует системный сервис для работы с виджетами");
                return;
            }
            if (!appWidgetManager.isRequestPinAppWidgetSupported()) {
                ((j) callback).invoke(new NativeResult.Error("Не поддерживается запрос на добавление виджета", null, 2, null));
                L80.a.b("AddWidgetBridgeInterface", "Не поддерживается запрос на добавление виджета");
                return;
            }
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 0);
            Bundle bundle = new Bundle();
            bundle.putParcelable("appWidgetPreview", remoteViews);
            try {
                appWidgetManager.requestPinAppWidget(null, bundle, null);
                NativeResult.Success.INSTANCE.getClass();
                success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
                ((j) callback).invoke(success);
            } catch (Exception e12) {
                L80.a.b("AddWidgetBridgeInterface", "Ошибка при вызове шторки для добавления виджета " + C4001c.b(e12));
                ((j) callback).invoke(new NativeResult.Error("Ошибка при вызове шторки для добавления виджета", null, 2, null));
            }
        }
    }
}
