package Gg0;

import V5.q;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m6.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTarget;
import ru.ozon.app.android.pikazon.glide.targets.TargetExtKt;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;

/* loaded from: classes7.dex */
public final class e<T> implements PikazonRequestListener<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f10238a;

    public e(@NotNull f placeholderTimeHandler) {
        Intrinsics.checkNotNullParameter(placeholderTimeHandler, "placeholderTimeHandler");
        this.f10238a = placeholderTimeHandler;
    }

    private static Integer a(h hVar) {
        if (hVar instanceof OzonMetricTarget) {
            return Integer.valueOf(((OzonMetricTarget) hVar).getLoadPriority().getValue());
        }
        return null;
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public final void onLoadCancelled(Object obj, h<T> hVar) {
        m6.f asImageViewTargetOrNull;
        if (obj != null) {
            PikazonUrl pikazonUrl = obj instanceof PikazonUrl ? (PikazonUrl) obj : null;
            String uuid = pikazonUrl != null ? pikazonUrl.getUuid() : null;
            if (uuid == null) {
                return;
            }
            this.f10238a.c((hVar == null || (asImageViewTargetOrNull = TargetExtKt.asImageViewTargetOrNull(hVar)) == null) ? null : asImageViewTargetOrNull.a(), uuid, new b(null, hVar != null ? a(hVar) : null));
        }
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public final void onLoadFailed(Object obj, h<T> hVar, q qVar) {
        m6.f asImageViewTargetOrNull;
        if (obj != null) {
            PikazonUrl pikazonUrl = obj instanceof PikazonUrl ? (PikazonUrl) obj : null;
            String uuid = pikazonUrl != null ? pikazonUrl.getUuid() : null;
            if (uuid == null) {
                return;
            }
            ImageView a11 = (hVar == null || (asImageViewTargetOrNull = TargetExtKt.asImageViewTargetOrNull(hVar)) == null) ? null : asImageViewTargetOrNull.a();
            b bVar = new b(null, hVar != null ? a(hVar) : null);
            Object obj2 = qVar;
            while (obj2 instanceof q) {
                List<Throwable> e11 = ((q) obj2).e();
                Intrinsics.checkNotNullExpressionValue(e11, "getCauses(...)");
                obj2 = (Throwable) C7714v.M(e11);
            }
            this.f10238a.d(a11, bVar, uuid);
        }
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public final void onLoadStarted(@NotNull Object model, Object obj) {
        Intrinsics.checkNotNullParameter(model, "model");
        if ((model instanceof PikazonUrl) && (obj instanceof View)) {
            String uuid = ((PikazonUrl) model).getUuid();
            this.f10238a.a((View) obj, uuid);
        }
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public final void onLoadSucceed(Object obj, T t2, h<T> hVar, T5.a aVar) {
        m6.f asImageViewTargetOrNull;
        if (obj != null) {
            PikazonUrl pikazonUrl = obj instanceof PikazonUrl ? (PikazonUrl) obj : null;
            String uuid = pikazonUrl != null ? pikazonUrl.getUuid() : null;
            if (uuid == null) {
                return;
            }
            this.f10238a.b((hVar == null || (asImageViewTargetOrNull = TargetExtKt.asImageViewTargetOrNull(hVar)) == null) ? null : asImageViewTargetOrNull.a(), new b(Boolean.valueOf(aVar == T5.a.REMOTE), hVar != null ? a(hVar) : null), uuid);
        }
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public final void onPreviewFailed(@NotNull PikazonUrl pikazonUrl, h<T> hVar, q qVar) {
        PikazonRequestListener.DefaultImpls.onPreviewFailed(this, pikazonUrl, hVar, qVar);
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public final void onPreviewSucceed(@NotNull PikazonUrl model, T t2, h<T> hVar, T5.a aVar) {
        m6.f asImageViewTargetOrNull;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f10238a.e((hVar == null || (asImageViewTargetOrNull = TargetExtKt.asImageViewTargetOrNull(hVar)) == null) ? null : asImageViewTargetOrNull.a(), model.getUuid());
    }
}
