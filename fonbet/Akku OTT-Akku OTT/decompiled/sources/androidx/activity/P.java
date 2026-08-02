package androidx.activity;

import android.content.res.Resources;
import androidx.activity.SystemBarStyle;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ P(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean auto$lambda$0;
        Unit lambda$onScaleChanged$26;
        switch (this.a) {
            case 0:
                auto$lambda$0 = SystemBarStyle.Companion.auto$lambda$0((Resources) obj);
                return Boolean.valueOf(auto$lambda$0);
            default:
                lambda$onScaleChanged$26 = WebViewClientProxyApi.WebViewClientImpl.lambda$onScaleChanged$26((Result) obj);
                return lambda$onScaleChanged$26;
        }
    }
}
