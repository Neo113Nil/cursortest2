package Og;

import E0.C2942q;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import yg.j;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function0<yg.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f20368b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar) {
        super(0);
        this.f20368b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final yg.b invoke() {
        Context context;
        int i11;
        b bVar = this.f20368b;
        context = bVar.f20369a;
        i11 = bVar.f20370b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("com.vk.id.tracking.tracer", "libraryPackageName");
        String applicationId = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(applicationId, "context.packageName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter("com.vk.id.tracking.tracer", "libraryPackageName");
        Intrinsics.checkNotNullParameter("1.0.0-beta.1", "tracerSdkVersion");
        StringBuilder sb2 = new StringBuilder("TracerSDK/1.0.0-beta.1 Lib/com.vk.id.tracking.tracer App/");
        sb2.append(applicationId);
        sb2.append(" ");
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)";
        }
        return new j(context, i11, C2942q.c(sb2, property, "StringBuilder().apply(builderAction).toString()"));
    }
}
