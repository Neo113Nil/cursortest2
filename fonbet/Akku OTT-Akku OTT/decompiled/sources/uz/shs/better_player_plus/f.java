package uz.shs.better_player_plus;

import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements EventChannel.StreamHandler {
    public final /* synthetic */ c a;

    public f(c cVar) {
        this.a = cVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        n nVar = this.a.d;
        nVar.a = null;
        nVar.a();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        n nVar = this.a.d;
        nVar.a = sink;
        nVar.a();
    }
}
