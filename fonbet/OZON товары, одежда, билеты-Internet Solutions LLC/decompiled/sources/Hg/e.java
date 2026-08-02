package Hg;

import Cg.C2777a;
import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function0<Qg.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f10959b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c cVar) {
        super(0);
        this.f10959b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Qg.b invoke() {
        c cVar = this.f10959b;
        try {
            cVar.getClass();
            return C2777a.a("com.vk.id.tracking.tracer");
        } catch (Exception unused) {
            cVar.getClass();
            Log.e("Tracer", "Could not find manifest for library com.vk.id.tracking.tracer");
            return null;
        }
    }
}
