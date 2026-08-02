package B80;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.ui.image.FinImageView;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3072a;

    public /* synthetic */ d(int i11) {
        this.f3072a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit lambda$1$lambda$0;
        switch (this.f3072a) {
            case 0:
                ValueCallback valueCallback = (ValueCallback) obj;
                WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj2;
                Intrinsics.checkNotNullParameter(valueCallback, "valueCallback");
                Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
                return Unit.f71690a;
            default:
                lambda$1$lambda$0 = FinImageView.lambda$1$lambda$0((Function2) obj, (String) obj2);
                return lambda$1$lambda$0;
        }
    }
}
