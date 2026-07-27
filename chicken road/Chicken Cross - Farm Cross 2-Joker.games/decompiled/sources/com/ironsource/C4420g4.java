package com.ironsource;

import android.util.Log;
import com.ironsource.InterfaceC4384e4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4420g4 implements InterfaceC4602q7 {

    /* renamed from: a, reason: collision with root package name */
    private final C4366d4 f8202a;
    private final Function1<C4710w8, Object> b;
    private final InterfaceC4691v7 c;
    private final InterfaceC4527m4 d;
    private final String e;
    private C4710w8 f;
    private long g;
    private final C4339bd h;
    private String i;

    /* renamed from: com.ironsource.g4$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Result<? extends C4710w8>, Unit> {
        a(Object obj) {
            super(1, obj, C4420g4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C4420g4) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends C4710w8> result) {
            a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ironsource.g4$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Result<? extends JSONObject>, Unit> {
        b(Object obj) {
            super(1, obj, C4420g4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C4420g4) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends JSONObject> result) {
            a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4420g4(C4366d4 config, Function1<? super C4710w8, ? extends Object> onFinish, InterfaceC4691v7 downloadManager, InterfaceC4527m4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f8202a = config;
        this.b = onFinish;
        this.c = downloadManager;
        this.d = currentTimeProvider;
        this.e = "g4";
        this.f = new C4710w8(config.d(), "mobileController_0.html");
        this.g = currentTimeProvider.a();
        this.h = new C4339bd(config.a());
        this.i = "";
    }

    @Override // com.ironsource.InterfaceC4602q7
    public C4710w8 c() {
        return this.f;
    }

    public final Function1<C4710w8, Object> d() {
        return this.b;
    }

    public final InterfaceC4527m4 a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4602q7
    public void b() {
        this.g = this.d.a();
        new C4343c(new C4361d(this.h), this.f8202a.d() + "/temp", this.c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC4602q7
    public boolean a(C4710w8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) {
        if (Result.m8085isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.i = string;
            C4402f4 a2 = a(string);
            if (a2.j()) {
                C4710w8 k = a2.k();
                this.f = k;
                this.b.invoke(k);
                return;
            }
            a2.m();
            return;
        }
        a("0").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        if (Result.m8086isSuccessimpl(obj)) {
            C4710w8 c4710w8 = (C4710w8) (Result.m8085isFailureimpl(obj) ? null : obj);
            if (!Intrinsics.areEqual(c4710w8 != null ? c4710w8.getAbsolutePath() : null, this.f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f);
                    Intrinsics.checkNotNull(c4710w8);
                    FilesKt.copyTo$default(c4710w8, this.f, true, 0, 4, null);
                } catch (Exception e) {
                    C4491k4.d().a(e);
                    Log.e(this.e, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                Intrinsics.checkNotNull(c4710w8);
                this.f = c4710w8;
            }
            new InterfaceC4384e4.b(this.f8202a.b(), this.g, this.d).a();
        } else {
            new InterfaceC4384e4.a(this.f8202a.b()).a();
        }
        Function1<C4710w8, Object> function1 = this.b;
        if (Result.m8085isFailureimpl(obj)) {
            obj = null;
        }
        function1.invoke(obj);
    }

    private final C4402f4 a(String str) {
        return new C4402f4(new C4772zg(this.h, str), this.f8202a.d() + "/mobileController_" + str + ".html", this.c, new a(this));
    }
}
