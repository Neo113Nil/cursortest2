package R5;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class X implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f6116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsResult f6117c;

    public /* synthetic */ X(Z z4, JsResult jsResult, int i7) {
        this.f6115a = i7;
        this.f6116b = z4;
        this.f6117c = jsResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        S s7 = (S) obj;
        switch (this.f6115a) {
            case 0:
                Z z4 = this.f6116b;
                z4.getClass();
                if (!s7.f6100d) {
                    boolean equals = Boolean.TRUE.equals(s7.f6098b);
                    JsResult jsResult = this.f6117c;
                    if (!equals) {
                        jsResult.cancel();
                        break;
                    } else {
                        jsResult.confirm();
                        break;
                    }
                } else {
                    I4.j jVar = z4.f6122b.f6213a;
                    Throwable th = s7.f6099c;
                    Objects.requireNonNull(th);
                    jVar.getClass();
                    I4.j.i(th);
                    break;
                }
            case 1:
                Z z7 = this.f6116b;
                z7.getClass();
                if (!s7.f6100d) {
                    this.f6117c.confirm();
                    break;
                } else {
                    I4.j jVar2 = z7.f6122b.f6213a;
                    Throwable th2 = s7.f6099c;
                    Objects.requireNonNull(th2);
                    jVar2.getClass();
                    I4.j.i(th2);
                    break;
                }
            default:
                Z z8 = this.f6116b;
                z8.getClass();
                if (!s7.f6100d) {
                    String str = (String) s7.f6098b;
                    JsPromptResult jsPromptResult = (JsPromptResult) this.f6117c;
                    if (str == null) {
                        jsPromptResult.cancel();
                        break;
                    } else {
                        jsPromptResult.confirm(str);
                        break;
                    }
                } else {
                    I4.j jVar3 = z8.f6122b.f6213a;
                    Throwable th3 = s7.f6099c;
                    Objects.requireNonNull(th3);
                    jVar3.getClass();
                    I4.j.i(th3);
                    break;
                }
        }
        return null;
    }
}
