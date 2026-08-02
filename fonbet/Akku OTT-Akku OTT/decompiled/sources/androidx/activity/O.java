package androidx.activity;

import android.content.res.Resources;
import androidx.activity.SystemBarStyle;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ O(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dark$lambda$0;
        Unit lambda$onPageCommitVisible$18;
        switch (this.a) {
            case 0:
                dark$lambda$0 = SystemBarStyle.Companion.dark$lambda$0((Resources) obj);
                return Boolean.valueOf(dark$lambda$0);
            default:
                lambda$onPageCommitVisible$18 = WebViewClientProxyApi.WebViewClientImpl.lambda$onPageCommitVisible$18((Result) obj);
                return lambda$onPageCommitVisible$18;
        }
    }
}
