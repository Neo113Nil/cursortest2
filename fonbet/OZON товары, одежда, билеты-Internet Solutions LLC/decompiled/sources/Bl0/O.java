package Bl0;

import java.net.URL;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class O extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ URL f3936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3937c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(URL url, int i11, String str, String str2) {
        super(0);
        this.f3936b = url;
        this.f3937c = i11;
        this.f3938d = str;
        this.f3939e = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return kotlin.text.h.E0("\n                    HTTP REQUEST\n                    URL: " + this.f3936b + "\n                    CODE: " + this.f3937c + "\n                    BODY: " + this.f3938d + "\n                    HEADER X-Metrics-Request-Time: " + this.f3939e + "\n                ");
    }
}
