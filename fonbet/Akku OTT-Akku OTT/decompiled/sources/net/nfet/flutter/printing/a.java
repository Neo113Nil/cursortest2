package net.nfet.flutter.printing;

import android.print.PrintDocumentInfo;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes5.dex */
public final class a implements MethodChannel.Result {
    public final /* synthetic */ h a;

    public a(h hVar) {
        this.a = hVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(@NonNull String str, String str2, Object obj) {
        this.a.a(str2);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.a.a("notImplemented");
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        boolean z = obj instanceof byte[];
        h hVar = this.a;
        if (!z) {
            hVar.a("Unknown data received");
            return;
        }
        hVar.d = (byte[]) obj;
        hVar.f.onLayoutFinished(new PrintDocumentInfo.Builder(hVar.e).setContentType(0).build(), true);
    }
}
