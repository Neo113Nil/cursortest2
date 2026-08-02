package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbflight.background_downloader.C;
import com.bbflight.background_downloader.D;
import com.bbflight.background_downloader.E;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CreationExtras.Empty empty;
        switch (this.a) {
            case 0:
                empty = CreationExtras.Empty.INSTANCE;
                return empty;
            default:
                return new E("BaseDirectory", new C(), new D(0));
        }
    }
}
