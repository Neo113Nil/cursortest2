package Z50;

import U50.j;
import android.content.Context;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.CameraAvailableResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class a implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f35586a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f35587b;

    public a(@NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f35586a = context;
        this.f35587b = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "camera_available";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean hasSystemFeature = this.f35586a.getPackageManager().hasSystemFeature("android.hardware.camera.any");
        Moshi moshi = this.f35587b;
        try {
            str = moshi.c(CameraAvailableResult.class).toJson(new CameraAvailableResult(hasSystemFeature));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        ((j) callback).invoke(new NativeResult.Success(str));
    }
}
