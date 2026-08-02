package A60;

import H30.q;
import U50.j;
import V50.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import h90.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k90.AbstractC7611a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.qr.ShareQrRequest;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import s90.InterfaceC9636e;
import s90.i;
import t90.AbstractC9782b;

/* loaded from: classes3.dex */
public final class b extends c implements U50.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f509b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f510c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final U30.a f511d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f512e;

    /* renamed from: f, reason: collision with root package name */
    private final r90.f f513f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Moshi f514g;

    /* renamed from: h, reason: collision with root package name */
    private j f515h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f516i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f517j;

    /* renamed from: k, reason: collision with root package name */
    private a f518k;

    public b(@NotNull Context context, @NotNull S80.b navigation, @NotNull U30.a fileManager, @NotNull f notificationInteractor, r90.f fVar, @NotNull Moshi moshi, @NotNull ru.ozon.fintech.settings.domain.a settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f509b = context;
        this.f510c = navigation;
        this.f511d = fileManager;
        this.f512e = notificationInteractor;
        this.f513f = fVar;
        this.f514g = moshi;
        this.f516i = settings.i();
        this.f517j = Intrinsics.d(Build.MANUFACTURER, "Xiaomi");
    }

    public static Unit e(b bVar, byte[] bArr) {
        Intrinsics.f(bArr);
        bVar.f(bArr);
        return Unit.f71690a;
    }

    private final void f(byte[] bArr) {
        if (this.f515h == null || this.f511d.l("shared_image.png", bArr) == null) {
            return;
        }
        String string = this.f509b.getString(R.string.fintech_ui_download_qr_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f512e.b(new AbstractC7611a.C1161a("", "", "shared_image.png", string, Integer.valueOf(R.drawable.fintech_ui_file_download_24), "", 0, null));
        h(true);
    }

    private final void h(boolean z11) {
        String str;
        if (z11) {
            j jVar = this.f515h;
            if (jVar != null) {
                Moshi moshi = this.f514g;
                try {
                    str = moshi.c(Boolean.class).toJson(Boolean.TRUE);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    str = "";
                }
                jVar.invoke(new NativeResult.Success(str));
            }
        } else {
            j jVar2 = this.f515h;
            if (jVar2 != null) {
                jVar2.invoke(new NativeResult.Error("Ошибка при декодинге QR...", null, 2, null));
            }
        }
        this.f515h = null;
    }

    @Override // V50.c
    public final boolean b(AbstractC9782b abstractC9782b) {
        List<InterfaceC9636e> a11;
        if (abstractC9782b == null || (a11 = abstractC9782b.a()) == null) {
            return false;
        }
        List<InterfaceC9636e> list = a11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC9636e) it.next()) instanceof i) {
                return true;
            }
        }
        return false;
    }

    @Override // V50.c
    public final void d(boolean z11) {
        if (z11) {
            a aVar = this.f518k;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f518k = null;
        }
    }

    public final Function1<NativeResult, Unit> g() {
        return this.f515h;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "qr";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[], java.lang.Cloneable, java.lang.Object] */
    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        r90.f fVar;
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Moshi moshi = this.f514g;
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(ShareQrRequest.class, "clazz");
        Object a11 = q.a(moshi, parameterJson, ShareQrRequest.class);
        if (a11 == null) {
            ((j) callback).invoke(new NativeResult.Error("Ошибка парсинга Json'а", NativeResult.Error.a.SDK_ERROR));
        }
        ShareQrRequest shareQrRequest = (ShareQrRequest) a11;
        if (shareQrRequest != null) {
            this.f515h = (j) callback;
            String qrBase64 = shareQrRequest.getQrBase64();
            Uri uri = null;
            r parentFragmentActivity = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
            ?? decode = Base64.decode(qrBase64, 0);
            if (this.f517j) {
                if (Build.VERSION.SDK_INT >= 29) {
                    Intrinsics.f(decode);
                    f(decode);
                    return;
                }
                this.f518k = new a(this, decode, 0);
                if (parentFragmentActivity == null || (fVar = this.f513f) == null) {
                    return;
                }
                fVar.g(parentFragmentActivity);
                return;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            Intrinsics.f(decodeByteArray);
            Context context = this.f509b;
            File file = new File(context.getCacheDir(), "images");
            try {
                file.mkdirs();
                File file2 = new File(file, "shared_image.png");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                decodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                uri = FileProvider.d(context, this.f516i, file2);
            } catch (IOException e11) {
                L80.a.b("ShareQrBridgeInterface", "IOException while trying to write file for sharing: " + e11.getMessage());
            }
            if (uri != null) {
                this.f510c.O0(uri);
            }
            h(uri != null);
        }
    }

    public final void i() {
        this.f515h = null;
    }
}
