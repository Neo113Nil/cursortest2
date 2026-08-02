package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0468mf f7801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(InputConnection inputConnection, C0468mf c0468mf) {
        super(inputConnection, false);
        this.f7801a = c0468mf;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        nu1 nu1Var;
        Bundle bundle2;
        InterfaceC0438lm c0401km;
        if (inputContentInfo == null) {
            nu1Var = null;
        } else {
            nu1Var = new nu1(26, new b90(28, inputContentInfo));
        }
        C0051b6 c0051b6 = (C0051b6) this.f7801a.f5033k;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((b90) nu1Var.f5551k).f793k).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((b90) nu1Var.f5551k).f793k;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((b90) nu1Var.f5551k).f793k;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0401km = new C0401km(clipData, 2);
        } else {
            C0475mm c0475mm = new C0475mm();
            c0475mm.f5090b = clipData;
            c0475mm.f5091c = 2;
            c0401km = c0475mm;
        }
        c0401km.mo3052d(inputContentInfo3.getLinkUri());
        c0401km.setExtras(bundle2);
        if (ai1.m251d(c0051b6, c0401km.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
