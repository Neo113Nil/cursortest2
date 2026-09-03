package defpackage;

import android.window.OnBackInvokedCallback;
import androidx.navigationevent.OnBackInvokedInput;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class ainHcH9lkbxnI implements OnBackInvokedCallback {
    public final /* synthetic */ Object hRNgd2zGCE5kj;
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ ainHcH9lkbxnI(int i, Object obj) {
        this.yzPsTade5rL7D3 = i;
        this.hRNgd2zGCE5kj = obj;
    }

    public final void onBackInvoked() {
        int i = this.yzPsTade5rL7D3;
        Object obj = this.hRNgd2zGCE5kj;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.hRNgd2zGCE5kj();
                    break;
                }
                break;
            case 1:
                ((Function0) obj).hRNgd2zGCE5kj();
                break;
            default:
                ((OnBackInvokedInput) obj).yzPsTade5rL7D3();
                break;
        }
    }
}
