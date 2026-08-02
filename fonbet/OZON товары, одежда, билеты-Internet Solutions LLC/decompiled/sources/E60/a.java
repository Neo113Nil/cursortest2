package E60;

import U50.d;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f7587a;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7587a = context;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "is_widget_pin_supported";
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        AppWidgetManager appWidgetManager = (AppWidgetManager) this.f7587a.getSystemService(AppWidgetManager.class);
        String jSONObject = new JSONObject().put("is_supported", appWidgetManager != null ? appWidgetManager.isRequestPinAppWidgetSupported() : false).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return new NativeResult.Success(jSONObject);
    }
}
