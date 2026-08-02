package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ResourcesCompat.FontCallback) this.b).lambda$callbackSuccessAsync$0((Typeface) this.c);
                break;
            default:
                dev.fluttercommunity.plus.connectivity.b bVar = (dev.fluttercommunity.plus.connectivity.b) this.b;
                bVar.b.success((ArrayList) this.c);
                break;
        }
    }
}
